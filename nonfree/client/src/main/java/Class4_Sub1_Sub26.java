import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class4_Sub1_Sub26 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
	private int anInt4506 = 0;

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
	private int anInt4504 = 8192;

	@OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
	private int anInt4509 = 2048;

	@OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
	private int anInt4505 = 0;

	@OriginalMember(owner = "client!rg", name = "lb", descriptor = "I")
	private int anInt4516 = 2048;

	@OriginalMember(owner = "client!rg", name = "cb", descriptor = "I")
	private int anInt4508 = 12288;

	@OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
	private int anInt4518 = 4096;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)Z")
	private boolean method3724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = (arg1 - arg0) * this.anInt4508 >> 12;
		@Pc(24) int local24 = Static129.anIntArray222[local9 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local24 << 12) / this.anInt4508;
		@Pc(42) int local42 = (local35 << 12) / this.anInt4504;
		@Pc(49) int local49 = this.anInt4518 * local42 >> 12;
		return local49 > arg0 + arg1 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IIB)Z")
	private boolean method3727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 + arg1) * this.anInt4508 >> 12;
		@Pc(23) int local23 = Static129.anIntArray222[local13 * 255 >> 12 & 0xFF];
		@Pc(40) int local40 = (local23 << 12) / this.anInt4508;
		@Pc(47) int local47 = (local40 << 12) / this.anInt4504;
		@Pc(54) int local54 = local47 * this.anInt4518 >> 12;
		return local54 > arg0 - arg1 && arg0 - arg1 > -local54;
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V")
	@Override
	public void method4737() {
		Static303.method4682();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4509 = arg0.method4653();
		} else if (arg1 == 1) {
			this.anInt4506 = arg0.method4653();
		} else if (arg1 == 2) {
			this.anInt4505 = arg0.method4653();
		} else if (arg1 == 3) {
			this.anInt4516 = arg0.method4653();
		} else if (arg1 == 4) {
			this.anInt4508 = arg0.method4653();
		} else if (arg1 == 5) {
			this.anInt4518 = arg0.method4653();
		} else if (arg1 == 6) {
			this.anInt4504 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(22) int local22 = Static237.anIntArray478[arg0] - 2048;
			for (@Pc(24) int local24 = 0; local24 < Static73.anInt1626; local24++) {
				@Pc(33) int local33 = Static138.anIntArray231[local24] - 2048;
				@Pc(38) int local38 = local33 + this.anInt4509;
				@Pc(47) int local47 = local38 >= -2048 ? local38 : local38 + 4096;
				@Pc(53) int local53 = local22 + this.anInt4506;
				@Pc(64) int local64 = local47 <= 2048 ? local47 : local47 - 4096;
				@Pc(73) int local73 = local53 < -2048 ? local53 + 4096 : local53;
				@Pc(82) int local82 = local73 <= 2048 ? local73 : local73 - 4096;
				@Pc(87) int local87 = this.anInt4505 + local33;
				@Pc(92) int local92 = this.anInt4516 + local22;
				@Pc(101) int local101 = local87 >= -2048 ? local87 : local87 + 4096;
				@Pc(112) int local112 = local101 <= 2048 ? local101 : local101 - 4096;
				@Pc(121) int local121 = local92 < -2048 ? local92 + 4096 : local92;
				@Pc(132) int local132 = local121 <= 2048 ? local121 : local121 - 4096;
				local12[local24] = this.method3724(local64, local82) || this.method3727(local132, local112) ? 4096 : 0;
			}
		}
		return local12;
	}
}
