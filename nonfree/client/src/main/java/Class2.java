import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
	private final int[] anIntArray5;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
	private final int[] anIntArray6;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!c;")
	private final Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!c;")
	private final Class5_Sub1 aClass5_Sub1_2;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "[Lclient!c;")
	private final Class5_Sub1[] aClass5_Sub1Array1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2() {
		this.anIntArray5 = new int[0];
		this.anIntArray6 = new int[0];
		this.aClass5_Sub1_1 = new Class5_Sub1_Sub20();
		this.aClass5_Sub1_1.anInt4201 = 1;
		this.aClass5_Sub1_2 = new Class5_Sub1_Sub20();
		this.aClass5_Sub1_2.anInt4201 = 1;
		this.aClass5_Sub1Array1 = new Class5_Sub1[] { this.aClass5_Sub1_1, this.aClass5_Sub1_2 };
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!ce;)V")
	public Class2(@OriginalArg(0) Class5_Sub6 arg0) {
		@Pc(7) int local7 = arg0.method3062();
		@Pc(9) int local9 = 0;
		this.aClass5_Sub1Array1 = new Class5_Sub1[local7];
		@Pc(15) int local15 = 0;
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class5_Sub1 local26 = Static185.method2809(arg0);
			if (local26.method3197() >= 0) {
				local9++;
			}
			if (local26.method3199() >= 0) {
				local15++;
			}
			@Pc(43) int local43 = local26.aClass5_Sub1Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method3062();
			}
			this.aClass5_Sub1Array1[local20] = local26;
		}
		this.anIntArray6 = new int[local9];
		local9 = 0;
		this.anIntArray5 = new int[local15];
		local15 = 0;
		for (@Pc(91) int local91 = 0; local91 < local7; local91++) {
			@Pc(98) Class5_Sub1 local98 = this.aClass5_Sub1Array1[local91];
			local50 = local98.aClass5_Sub1Array42.length;
			for (@Pc(104) int local104 = 0; local104 < local50; local104++) {
				local98.aClass5_Sub1Array42[local104] = this.aClass5_Sub1Array1[local18[local91][local104]];
			}
			@Pc(130) int local130 = local98.method3197();
			@Pc(134) int local134 = local98.method3199();
			if (local130 > 0) {
				this.anIntArray6[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray5[local15++] = local134;
			}
			local18[local91] = null;
		}
		this.aClass5_Sub1_1 = this.aClass5_Sub1Array1[arg0.method3062()];
		this.aClass5_Sub1_2 = this.aClass5_Sub1Array1[arg0.method3062()];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!cj;Lclient!wa;I)Z")
	public boolean method40(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Class23 arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anIntArray6.length; local7++) {
			if (!arg1.method743(this.anIntArray6[local7])) {
				return false;
			}
		}
		for (@Pc(27) int local27 = 0; local27 < this.anIntArray5.length; local27++) {
			if (!arg0.method2490(this.anIntArray5[local27])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZILclient!wa;IZLclient!cj;BD)[I")
	public int[] method41(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Interface1 arg5, @OriginalArg(7) double arg6) {
		@Pc(10) int[] local10 = new int[arg1 * arg3];
		Static121.method1916(arg6);
		Static104.aClass23_41 = arg2;
		Static77.anInterface1_12 = arg5;
		Static21.method3201(arg3, arg1);
		for (@Pc(23) int local23 = 0; local23 < this.aClass5_Sub1Array1.length; local23++) {
			this.aClass5_Sub1Array1[local23].method3188(arg1, arg3);
		}
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(47) byte local47;
		if (arg0) {
			local45 = arg3 - 1;
			local47 = -1;
			local49 = -1;
		} else {
			local47 = 1;
			local49 = arg3;
			local45 = 0;
		}
		@Pc(59) int local59 = 0;
		for (@Pc(61) int local61 = 0; local61 < arg1; local61++) {
			if (arg4) {
				local59 = local61;
			}
			@Pc(81) int[] local81;
			@Pc(89) int[] local89;
			@Pc(85) int[] local85;
			if (this.aClass5_Sub1_1.aBoolean189) {
				@Pc(97) int[] local97 = this.aClass5_Sub1_1.method3195(local61);
				local81 = local97;
				local89 = local97;
				local85 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass5_Sub1_1.method3193(local61);
				local81 = local77[0];
				local85 = local77[2];
				local89 = local77[1];
			}
			for (@Pc(105) int local105 = local45; local105 != local49; local105 += local47) {
				@Pc(113) int local113 = local81[local105] >> 4;
				if (local113 > 255) {
					local113 = 255;
				}
				if (local113 < 0) {
					local113 = 0;
				}
				@Pc(128) int local128 = local85[local105] >> 4;
				if (local128 > 255) {
					local128 = 255;
				}
				@Pc(139) int local139 = local89[local105] >> 4;
				if (local128 < 0) {
					local128 = 0;
				}
				local113 = Static171.anIntArray364[local113];
				local128 = Static171.anIntArray364[local128];
				if (local139 > 255) {
					local139 = 255;
				}
				if (local139 < 0) {
					local139 = 0;
				}
				local139 = Static171.anIntArray364[local139];
				local10[local59++] = (local139 << 8) + (local113 << 16) + local128;
				if (arg4) {
					local59 += arg3 - 1;
				}
			}
		}
		for (@Pc(208) int local208 = 0; local208 < this.aClass5_Sub1Array1.length; local208++) {
			this.aClass5_Sub1Array1[local208].method3189();
		}
		return local10;
	}
}
