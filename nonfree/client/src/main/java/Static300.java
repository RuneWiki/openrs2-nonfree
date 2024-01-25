import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt5394 = 0;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!oq;")
	public static final Class183 aClass183_5 = new Class183("runescape", 0);

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "[S")
	public static final short[] aShortArray96 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "F")
	public static float aFloat57 = 0.0F;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([[BLclient!hu;I)V")
	public static void method4229(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class105_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt3293; local18++) {
			Static170.method2751();
			for (@Pc(26) int local26 = 0; local26 < Static40.anInt1089 >> 3; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static44.anInt7276 >> 3; local30++) {
					@Pc(34) boolean local34 = false;
					@Pc(42) int local42 = Static201.anIntArrayArrayArray6[local18][local26][local30];
					if (local42 != -1) {
						@Pc(52) int local52 = local42 >> 24 & 0x3;
						if (!arg1.aBoolean286 || local52 == 0) {
							@Pc(63) int local63 = local42 >> 1 & 0x3;
							@Pc(69) int local69 = local42 >> 14 & 0x3FF;
							@Pc(75) int local75 = local42 >> 3 & 0x7FF;
							@Pc(85) int local85 = local75 / 8 + (local69 / 8 << 8);
							for (@Pc(87) int local87 = 0; local87 < Static81.anIntArray204.length; local87++) {
								if (local85 == Static81.anIntArray204[local87] && arg0[local87] != null) {
									@Pc(109) Class3_Sub7 local109 = new Class3_Sub7(arg0[local87]);
									arg1.method2662(local75, local109, local30 * 8, local69, local18, local52, Static382.aClass29Array3, local26 * 8, local63);
									local34 = true;
									arg1.method2681(local75, local109, local69, local16[0] == -1 ? local16 : null, Static121.aClass172_3, local30 * 8, local18, local52, local26 * 8, local63);
									break;
								}
							}
						}
					}
					if (!local34) {
						arg1.method2675(local30 * 8, 8, local26 * 8, local18, 8);
					}
				}
			}
		}
		if (local16[0] != -1) {
			Static81.aClass108_4 = Static212.aClass184_1.method4142(local16[3], local16[0], local16[1], local16[2], Static353.aClass212_1);
			Static350.anInt3659 = local16[4];
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "([BIZ)[B")
	public static byte[] method4230(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static462.method4611(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIILclient!jg;)V")
	public static void method4231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub22 arg3) {
		@Pc(14) long local14 = (long) (arg1 << 28 | arg0 << 14 | arg2);
		@Pc(20) Class3_Sub39 local20 = (Class3_Sub39) Static441.aClass11_43.method324(local14);
		if (local20 == null) {
			local20 = new Class3_Sub39();
			Static441.aClass11_43.method319(local20, local14);
			local20.aClass243_40.method5198(arg3);
			return;
		}
		@Pc(43) Class81 local43 = Static314.aClass12_2.method327(arg3.anInt3744);
		@Pc(46) int local46 = local43.anInt2524;
		if (local43.anInt2535 == 1) {
			local46 *= arg3.anInt3745 + 1;
		}
		for (@Pc(63) Class3_Sub22 local63 = (Class3_Sub22) local20.aClass243_40.method5208(); local63 != null; local63 = (Class3_Sub22) local20.aClass243_40.method5203()) {
			local43 = Static314.aClass12_2.method327(local63.anInt3744);
			@Pc(81) int local81 = local43.anInt2524;
			if (local43.anInt2535 == 1) {
				local81 *= local63.anInt3745 + 1;
			}
			if (local46 > local81) {
				Static101.method5329(local63, arg3);
				return;
			}
		}
		local20.aClass243_40.method5198(arg3);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public static void method4232() {
		if (anIntArray364 != null) {
			return;
		}
		anIntArray364 = new int[65536];
		@Pc(22) double local22 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < 512; local26++) {
			@Pc(38) float local38 = ((float) (local26 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(47) float local47 = (float) (local26 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(49) int local49 = 0; local49 < 128; local49++) {
				@Pc(55) float local55 = (float) local49 / 128.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(59) float local59 = 0.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(65) float local65 = local38 / 60.0F;
				@Pc(68) int local68 = (int) local65;
				@Pc(72) int local72 = local68 % 6;
				@Pc(78) float local78 = (float) -local68 + local65;
				@Pc(84) float local84 = (1.0F - local47) * local55;
				@Pc(93) float local93 = local55 * (1.0F - local47 * local78);
				@Pc(104) float local104 = local55 * (1.0F - local47 * (1.0F - local78));
				if (local72 == 0) {
					local61 = local84;
					local59 = local104;
					local57 = local55;
				} else if (local72 == 1) {
					local61 = local84;
					local59 = local55;
					local57 = local93;
				} else if (local72 == 2) {
					local59 = local55;
					local61 = local104;
					local57 = local84;
				} else if (local72 == 3) {
					local59 = local93;
					local61 = local55;
					local57 = local84;
				} else if (local72 == 4) {
					local57 = local104;
					local59 = local84;
					local61 = local55;
				} else if (local72 == 5) {
					local57 = local55;
					local59 = local84;
					local61 = local93;
				}
				local57 = (float) Math.pow((double) local57, local22);
				local59 = (float) Math.pow((double) local59, local22);
				local61 = (float) Math.pow((double) local61, local22);
				@Pc(194) int local194 = (int) (local57 * 256.0F);
				@Pc(199) int local199 = (int) (local59 * 256.0F);
				@Pc(204) int local204 = (int) (local61 * 256.0F);
				@Pc(217) int local217 = (local194 << 16) + (local199 << 8) + local204 - 16777216;
				anIntArray364[local24++] = local217;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/lang/String;C)I")
	public static int method4233(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(5) int local5 = 0;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (arg0.charAt(local10) == arg1) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(CB)Z")
	public static boolean method4235(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(26) char[] local26 = Static455.aCharArray9;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (local34 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
