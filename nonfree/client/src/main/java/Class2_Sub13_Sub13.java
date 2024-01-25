import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class2_Sub13_Sub13 extends Class2_Sub13 {

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "[I")
	private final int[] anIntArray572;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
	private final int[] anIntArray571;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Lclient!tk;")
	private final Class2_Sub7 aClass2_Sub7_3;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!tk;")
	private final Class2_Sub7 aClass2_Sub7_2;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "Lclient!tk;")
	private final Class2_Sub7 aClass2_Sub7_1;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "[Lclient!tk;")
	private final Class2_Sub7[] aClass2_Sub7Array32;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	private Class2_Sub13_Sub13() {
		this.anIntArray572 = new int[0];
		this.anIntArray571 = new int[0];
		this.aClass2_Sub7_3 = new Class2_Sub7_Sub33(0);
		this.aClass2_Sub7_3.anInt9073 = 1;
		this.aClass2_Sub7_2 = new Class2_Sub7_Sub33();
		this.aClass2_Sub7_2.anInt9073 = 1;
		this.aClass2_Sub7_1 = new Class2_Sub7_Sub33();
		this.aClass2_Sub7Array32 = new Class2_Sub7[] { this.aClass2_Sub7_2, this.aClass2_Sub7_1, this.aClass2_Sub7_3 };
		this.aClass2_Sub7_1.anInt9073 = 1;
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!ps;)V")
	public Class2_Sub13_Sub13(@OriginalArg(0) Class2_Sub29 arg0) {
		@Pc(7) int local7 = arg0.method5170();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(14) int[][] local14 = new int[local7][];
		this.aClass2_Sub7Array32 = new Class2_Sub7[local7];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub7 local26 = Static543.method7781(arg0);
			if (local26.method7593() >= 0) {
				local9++;
			}
			if (local26.method7579() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub7Array42.length;
			local14[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local14[local20][local50] = arg0.method5170();
			}
			this.aClass2_Sub7Array32[local20] = local26;
		}
		this.anIntArray571 = new int[local9];
		local9 = 0;
		this.anIntArray572 = new int[local11];
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class2_Sub7 local102 = this.aClass2_Sub7Array32[local95];
			local50 = local102.aClass2_Sub7Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass2_Sub7Array42[local108] = this.aClass2_Sub7Array32[local14[local95][local108]];
			}
			@Pc(130) int local130 = local102.method7593();
			@Pc(134) int local134 = local102.method7579();
			if (local130 > 0) {
				this.anIntArray571[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray572[local11++] = local134;
			}
			local14[local95] = null;
		}
		this.aClass2_Sub7_2 = this.aClass2_Sub7Array32[arg0.method5170()];
		this.aClass2_Sub7_1 = this.aClass2_Sub7Array32[arg0.method5170()];
		this.aClass2_Sub7_3 = this.aClass2_Sub7Array32[arg0.method5170()];
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!n;DIIIZLclient!dda;)[I")
	public int[] method6254(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) double arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class53 arg5) {
		Static355.anInterface12_14 = arg0;
		Static203.aClass53_67 = arg5;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub7Array32.length; local11++) {
			this.aClass2_Sub7Array32[local11].method7588(arg3, arg2);
		}
		Static319.method5092(arg1);
		Static433.method5293(arg2, arg3);
		@Pc(41) int[] local41 = new int[arg3 * arg2 * 4];
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < arg2; local45++) {
			@Pc(63) int[] local63;
			@Pc(61) int[] local61;
			@Pc(59) int[] local59;
			@Pc(57) int[] local57;
			if (this.aClass2_Sub7_2.aBoolean649) {
				local57 = this.aClass2_Sub7_2.method7587(local45);
				local59 = local57;
				local61 = local57;
				local63 = local57;
			} else {
				@Pc(71) int[][] local71 = this.aClass2_Sub7_2.method7585(local45);
				local63 = local71[0];
				local61 = local71[1];
				local59 = local71[2];
			}
			if (this.aClass2_Sub7_1.aBoolean649) {
				local57 = this.aClass2_Sub7_1.method7587(local45);
			} else {
				local57 = this.aClass2_Sub7_1.method7585(local45)[0];
			}
			if (arg4) {
				local43 = local45;
			}
			for (@Pc(111) int local111 = arg3 - 1; local111 >= 0; local111--) {
				@Pc(119) int local119 = local63[local111] >> 4;
				if (local119 > 255) {
					local119 = 255;
				}
				if (local119 < 0) {
					local119 = 0;
				}
				@Pc(134) int local134 = local61[local111] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(152) int local152 = local59[local111] >> 4;
				if (local152 > 255) {
					local152 = 255;
				}
				local134 = Static112.anIntArray234[local134];
				if (local152 < 0) {
					local152 = 0;
				}
				local119 = Static112.anIntArray234[local119];
				local152 = Static112.anIntArray234[local152];
				@Pc(199) int local199;
				if (local119 == 0 && local134 == 0 && local152 == 0) {
					local199 = 0;
				} else {
					local199 = local57[local111] >> 4;
					if (local199 > 255) {
						local199 = 255;
					}
					if (local199 < 0) {
						local199 = 0;
					}
				}
				local41[local43++] = (local199 << 24) - (-(local119 << 16) - (local134 << 8) - local152);
				if (arg4) {
					local43 += arg3 - 1;
				}
			}
		}
		for (@Pc(254) int local254 = 0; local254 < this.aClass2_Sub7Array32.length; local254++) {
			this.aClass2_Sub7Array32[local254].method7591();
		}
		return local41;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!n;Lclient!dda;)Z")
	public boolean method6257(@OriginalArg(1) Interface12 arg0, @OriginalArg(2) Class53 arg1) {
		@Pc(9) int local9;
		if (Static386.anInt7081 >= 0) {
			for (local9 = 0; local9 < this.anIntArray571.length; local9++) {
				if (!arg1.method1591(Static386.anInt7081, this.anIntArray571[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray571.length; local9++) {
				if (!arg1.method1621(this.anIntArray571[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray572.length; local9++) {
			if (!arg0.method2572(this.anIntArray572[local9])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!dda;IZLclient!n;IB)[F")
	public float[] method6258(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Interface12 arg3, @OriginalArg(4) int arg4) {
		Static355.anInterface12_14 = arg3;
		Static203.aClass53_67 = arg0;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub7Array32.length; local11++) {
			this.aClass2_Sub7Array32[local11].method7588(arg1, arg4);
		}
		Static433.method5293(arg4, arg1);
		@Pc(42) float[] local42 = new float[arg4 * arg1 * 4];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < arg4; local60++) {
			@Pc(80) int[] local80;
			@Pc(76) int[] local76;
			@Pc(84) int[] local84;
			if (this.aClass2_Sub7_2.aBoolean649) {
				@Pc(92) int[] local92 = this.aClass2_Sub7_2.method7587(local60);
				local80 = local92;
				local84 = local92;
				local76 = local92;
			} else {
				@Pc(72) int[][] local72 = this.aClass2_Sub7_2.method7585(local60);
				local76 = local72[1];
				local80 = local72[0];
				local84 = local72[2];
			}
			@Pc(110) int[] local110;
			if (this.aClass2_Sub7_1.aBoolean649) {
				local110 = this.aClass2_Sub7_1.method7587(local60);
			} else {
				local110 = this.aClass2_Sub7_1.method7585(local60)[0];
			}
			@Pc(128) int[] local128;
			if (this.aClass2_Sub7_3.aBoolean649) {
				local128 = this.aClass2_Sub7_3.method7587(local60);
			} else {
				local128 = this.aClass2_Sub7_3.method7585(local60)[0];
			}
			if (arg2) {
				local58 = local60 << 2;
			}
			for (@Pc(148) int local148 = arg1 - 1; local148 >= 0; local148--) {
				@Pc(157) float local157 = (float) local110[local148] / 4096.0F;
				@Pc(170) float local170 = ((float) local128[local148] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				if (local157 < 0.0F) {
					local157 = 0.0F;
				} else if (local157 > 1.0F) {
					local157 = 1.0F;
				}
				local42[local58++] = (float) local80[local148] * local170;
				local42[local58++] = local170 * (float) local76[local148];
				local42[local58++] = (float) local84[local148] * local170;
				local42[local58++] = local157;
				if (arg2) {
					local58 += (arg1 << 2) - 4;
				}
			}
		}
		for (@Pc(242) int local242 = 0; local242 < this.aClass2_Sub7Array32.length; local242++) {
			this.aClass2_Sub7Array32[local242].method7591();
		}
		return local42;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!n;Lclient!dda;DIBZZI)[I")
	public int[] method6259(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) double arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		Static203.aClass53_67 = arg1;
		Static355.anInterface12_14 = arg0;
		for (@Pc(16) int local16 = 0; local16 < this.aClass2_Sub7Array32.length; local16++) {
			this.aClass2_Sub7Array32[local16].method7588(arg6, arg3);
		}
		Static319.method5092(arg2);
		Static433.method5293(arg3, arg6);
		@Pc(48) int[] local48 = new int[arg6 * arg3];
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(56) byte local56;
		if (arg4) {
			local54 = arg6 - 1;
			local56 = -1;
			local58 = -1;
		} else {
			local58 = arg6;
			local54 = 0;
			local56 = 1;
		}
		@Pc(68) int local68 = 0;
		for (@Pc(70) int local70 = 0; local70 < arg3; local70++) {
			if (arg5) {
				local68 = local70;
			}
			@Pc(90) int[] local90;
			@Pc(98) int[] local98;
			@Pc(94) int[] local94;
			if (this.aClass2_Sub7_2.aBoolean649) {
				@Pc(106) int[] local106 = this.aClass2_Sub7_2.method7587(local70);
				local98 = local106;
				local90 = local106;
				local94 = local106;
			} else {
				@Pc(86) int[][] local86 = this.aClass2_Sub7_2.method7585(local70);
				local90 = local86[0];
				local94 = local86[2];
				local98 = local86[1];
			}
			for (@Pc(114) int local114 = local54; local114 != local58; local114 += local56) {
				@Pc(122) int local122 = local90[local114] >> 4;
				if (local122 > 255) {
					local122 = 255;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				@Pc(140) int local140 = local98[local114] >> 4;
				if (local140 > 255) {
					local140 = 255;
				}
				if (local140 < 0) {
					local140 = 0;
				}
				@Pc(157) int local157 = local94[local114] >> 4;
				if (local157 > 255) {
					local157 = 255;
				}
				local122 = Static112.anIntArray234[local122];
				if (local157 < 0) {
					local157 = 0;
				}
				local140 = Static112.anIntArray234[local140];
				local157 = Static112.anIntArray234[local157];
				@Pc(192) int local192 = (local140 << 8) + ((local122 << 16) + local157);
				if (local192 != 0) {
					local192 |= 0xFF000000;
				}
				local48[local68++] = local192;
				if (arg5) {
					local68 += arg6 - 1;
				}
			}
		}
		for (@Pc(224) int local224 = 0; local224 < this.aClass2_Sub7Array32.length; local224++) {
			this.aClass2_Sub7Array32[local224].method7591();
		}
		return local48;
	}
}
