import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class236 {

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!wm;)V")
	public Class236(@OriginalArg(0) Class390 arg0) {
		@Pc(6) byte[] local6 = arg0.method8923(6);
		this.method5647(new Class5_Sub41(local6));
		if (this.anIntArray382 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	private Class236() {
		this.anIntArray382 = new int[0];
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!mc;)V")
	private void method5647(@OriginalArg(1) Class5_Sub41 arg0) {
		label19: while (true) {
			@Pc(5) int local5 = arg0.method7816();
			if (local5 != 0) {
				if (local5 != 1) {
					continue;
				}
				@Pc(17) int local17 = arg0.method7816();
				this.anIntArray382 = new int[local17];
				@Pc(23) int local23 = 0;
				while (true) {
					if (this.anIntArray382.length <= local23) {
						continue label19;
					}
					this.anIntArray382[local23] = arg0.method7816();
					local23++;
				}
			}
			return;
		}
	}
}
