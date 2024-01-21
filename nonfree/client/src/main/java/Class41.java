import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class41 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
	private final int[] anIntArray130;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "[I")
	private final int[] anIntArray131;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!tg;")
	private final Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Lclient!tg;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "[Lclient!tg;")
	private final Class1_Sub1[] aClass1_Sub1Array15;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class41() {
		this.anIntArray130 = new int[0];
		this.anIntArray131 = new int[0];
		this.aClass1_Sub1_2 = new Class1_Sub1_Sub33();
		this.aClass1_Sub1_2.anInt4474 = 1;
		this.aClass1_Sub1_1 = new Class1_Sub1_Sub33();
		this.aClass1_Sub1Array15 = new Class1_Sub1[] { this.aClass1_Sub1_2, this.aClass1_Sub1_1 };
		this.aClass1_Sub1_1.anInt4474 = 1;
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class41(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0.method3010();
		this.aClass1_Sub1Array15 = new Class1_Sub1[local11];
		@Pc(18) int[][] local18 = new int[local11][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			@Pc(26) Class1_Sub1 local26 = Static195.method3193(arg0);
			if (local26.method3395() >= 0) {
				local5++;
			}
			if (local26.method3396() >= 0) {
				local7++;
			}
			@Pc(43) int local43 = local26.aClass1_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method3010();
			}
			this.aClass1_Sub1Array15[local20] = local26;
		}
		this.anIntArray131 = new int[local5];
		this.anIntArray130 = new int[local7];
		local5 = 0;
		local7 = 0;
		for (@Pc(91) int local91 = 0; local91 < local11; local91++) {
			@Pc(98) Class1_Sub1 local98 = this.aClass1_Sub1Array15[local91];
			local50 = local98.aClass1_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass1_Sub1Array42[local104] = this.aClass1_Sub1Array15[local18[local91][local104]];
			}
			@Pc(130) int local130 = local98.method3395();
			@Pc(134) int local134 = local98.method3396();
			if (local130 > 0) {
				this.anIntArray131[local5++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray130[local7++] = local134;
			}
			local18[local91] = null;
		}
		this.aClass1_Sub1_2 = this.aClass1_Sub1Array15[arg0.method3010()];
		this.aClass1_Sub1_1 = this.aClass1_Sub1Array15[arg0.method3010()];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!sg;ILclient!ab;)Z")
	public boolean method1120(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray131.length; local7++) {
			if (!arg1.method3253(this.anIntArray131[local7])) {
				return false;
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.anIntArray130.length; local36++) {
			if (!arg0.method2594(this.anIntArray130[local36])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZIILclient!ab;BLclient!sg;D)[I")
	public int[] method1122(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3 arg4, @OriginalArg(6) Interface3 arg5, @OriginalArg(7) double arg6) {
		@Pc(6) int[] local6 = new int[arg3 * arg2];
		Static210.method3421(arg6);
		Static114.anInterface3_1 = arg5;
		Static127.aClass3_23 = arg4;
		Static89.method1320(arg3, arg2);
		for (@Pc(28) int local28 = 0; local28 < this.aClass1_Sub1Array15.length; local28++) {
			this.aClass1_Sub1Array15[local28].method3399(arg3, arg2);
		}
		@Pc(52) int local52;
		@Pc(48) int local48;
		@Pc(54) byte local54;
		if (arg1) {
			local48 = -1;
			local52 = arg3 - 1;
			local54 = -1;
		} else {
			local54 = 1;
			local48 = arg3;
			local52 = 0;
		}
		@Pc(64) int local64 = 0;
		for (@Pc(66) int local66 = 0; local66 < arg2; local66++) {
			if (arg0) {
				local64 = local66;
			}
			@Pc(88) int[] local88;
			@Pc(84) int[] local84;
			@Pc(86) int[] local86;
			if (this.aClass1_Sub1_2.aBoolean241) {
				@Pc(82) int[] local82 = this.aClass1_Sub1_2.method3394(local66);
				local84 = local82;
				local86 = local82;
				local88 = local82;
			} else {
				@Pc(96) int[][] local96 = this.aClass1_Sub1_2.method3398(local66);
				local84 = local96[1];
				local86 = local96[2];
				local88 = local96[0];
			}
			for (@Pc(110) int local110 = local52; local110 != local48; local110 += local54) {
				@Pc(118) int local118 = local88[local110] >> 4;
				@Pc(124) int local124 = local84[local110] >> 4;
				@Pc(130) int local130 = local86[local110] >> 4;
				if (local130 > 255) {
					local130 = 255;
				}
				if (local130 < 0) {
					local130 = 0;
				}
				if (local124 > 255) {
					local124 = 255;
				}
				local130 = Static42.anIntArray85[local130];
				if (local124 < 0) {
					local124 = 0;
				}
				if (local118 > 255) {
					local118 = 255;
				}
				local124 = Static42.anIntArray85[local124];
				if (local118 < 0) {
					local118 = 0;
				}
				local118 = Static42.anIntArray85[local118];
				local6[local64++] = (local124 << 8) + (local118 << 16) + local130;
				if (arg0) {
					local64 += arg3 - 1;
				}
			}
		}
		for (@Pc(218) int local218 = 0; local218 < this.aClass1_Sub1Array15.length; local218++) {
			this.aClass1_Sub1Array15[local218].method3391();
		}
		return local6;
	}
}
