import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class133 {

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "[I")
	public int[] anIntArray161;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	public int anInt3467 = -1;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
	public int anInt3470 = -1;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!gda;)V")
	public Class133(@OriginalArg(0) Class126 arg0) {
		@Pc(12) byte[] local12 = arg0.method3069(6);
		this.method3181(new Class5_Sub36(local12));
		if (this.anIntArray159 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	private Class133() {
		this.anIntArray159 = new int[0];
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!wq;I)V")
	private void method3181(@OriginalArg(0) Class5_Sub36 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method7291();
			if (local10 == 0) {
				return;
			}
			@Pc(32) int local32;
			if (local10 == 1) {
				local32 = arg0.method7291();
				this.anIntArray159 = new int[local32];
				for (@Pc(38) int local38 = 0; local38 < this.anIntArray159.length; local38++) {
					this.anIntArray159[local38] = arg0.method7291();
				}
			} else if (local10 == 3) {
				this.anInt3470 = arg0.method7291();
			} else if (local10 == 4) {
				this.anInt3467 = arg0.method7291();
			} else if (local10 == 5) {
				this.anIntArray160 = new int[arg0.method7291()];
				for (local32 = 0; local32 < this.anIntArray160.length; local32++) {
					this.anIntArray160[local32] = arg0.method7291();
				}
			} else if (local10 == 6) {
				this.anIntArray161 = new int[arg0.method7291()];
				for (local32 = 0; local32 < this.anIntArray161.length; local32++) {
					this.anIntArray161[local32] = arg0.method7291();
				}
			}
		}
	}
}
