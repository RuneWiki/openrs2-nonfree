import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class212 {

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
	public int[] anIntArray340;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class212(@OriginalArg(0) Class8 arg0) {
		@Pc(6) byte[] local6 = arg0.method267(6);
		this.method5052(new Class6_Sub23(local6));
		if (this.anIntArray340 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	private Class212() {
		this.anIntArray340 = new int[0];
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!gga;I)V")
	private void method5052(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8374();
			if (local9 == 0) {
				return;
			}
			if (local9 == 1) {
				@Pc(24) int local24 = arg0.method8374();
				this.anIntArray340 = new int[local24];
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray340.length; local30++) {
					this.anIntArray340[local30] = arg0.method8374();
				}
			}
		}
	}
}
