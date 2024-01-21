import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
	private int anInt3564;

	@OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
	private int anInt3561;

	@OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
	private int anInt3567;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		Static68.method1457();
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3567 = arg1.method1607();
		} else if (arg0 == 1) {
			this.anInt3561 = arg1.method1607();
		} else if (arg0 == 3) {
			this.anInt3564 = arg1.method1607();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(24) int local24 = Static18.anIntArray101[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static65.anInt1933; local32++) {
				@Pc(38) int local38 = Static106.anIntArray284[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt3567 == 0) {
					local70 = (local38 - local24) * this.anInt3564;
				} else {
					@Pc(61) int local61 = local44 * local44 + local30 * local30 >> 12;
					local70 = (int) (Math.sqrt((double) (local61 / 4096)) * 4096.0D);
					local70 = (int) ((double) (local70 * this.anInt3564) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt3561 == 0) {
					local70 = Static45.anIntArray153[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3561 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local12[local32] = local70;
			}
		}
		return local12;
	}
}
