import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!av", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!av", name = "W", descriptor = "Lclient!la;")
	public static Class46 aClass46_4;

	@OriginalMember(owner = "client!av", name = "D", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_13 = new Class83("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!av", name = "S", descriptor = "J")
	public static long aLong17 = 0L;

	@OriginalMember(owner = "client!av", name = "V", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "(B)V")
	public static void method293() {
		if (Static72.anIntArray115 != null) {
			return;
		}
		Static72.anIntArray115 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(29) int local29 = 0; local29 < 65536; local29++) {
			@Pc(42) double local42 = (double) (local29 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(53) double local53 = (double) (local29 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(60) double local60 = (double) (local29 & 0x7F) / 128.0D;
			@Pc(62) double local62 = local60;
			@Pc(64) double local64 = local60;
			@Pc(66) double local66 = local60;
			if (local53 != 0.0D) {
				@Pc(80) double local80;
				if (local60 < 0.5D) {
					local80 = local60 * (local53 + 1.0D);
				} else {
					local80 = local53 + local60 - local60 * local53;
				}
				@Pc(97) double local97 = local60 * 2.0D - local80;
				@Pc(101) double local101 = local42 + 0.3333333333333333D;
				if (local101 > 1.0D) {
					local101--;
				}
				@Pc(115) double local115 = local42 - 0.3333333333333333D;
				if (local115 < 0.0D) {
					local115++;
				}
				if (local42 * 6.0D < 1.0D) {
					local64 = local42 * 6.0D * (local80 - local97) + local97;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local80;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = local97 + (local80 - local97) * 6.0D * (0.6666666666666666D - local42);
				} else {
					local64 = local97;
				}
				if (local101 * 6.0D < 1.0D) {
					local62 = local97 + local101 * (local80 - local97) * 6.0D;
				} else if (local101 * 2.0D < 1.0D) {
					local62 = local80;
				} else if (local101 * 3.0D < 2.0D) {
					local62 = local97 + (local80 - local97) * (-local101 + 0.6666666666666666D) * 6.0D;
				} else {
					local62 = local97;
				}
				if (local115 * 6.0D < 1.0D) {
					local66 = (local80 - local97) * 6.0D * local115 + local97;
				} else if (local115 * 2.0D < 1.0D) {
					local66 = local80;
				} else if (local115 * 3.0D < 2.0D) {
					local66 = local97 + (0.6666666666666666D - local115) * 6.0D * (local80 - local97);
				} else {
					local66 = local97;
				}
			}
			local62 = Math.pow(local62, local19);
			local64 = Math.pow(local64, local19);
			local66 = Math.pow(local66, local19);
			@Pc(296) int local296 = (int) (local62 * 256.0D);
			@Pc(301) int local301 = (int) (local64 * 256.0D);
			@Pc(306) int local306 = (int) (local66 * 256.0D);
			@Pc(317) int local317 = local306 + (local296 << 16) + (local301 << 8);
			Static72.anIntArray115[local29] = local317;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IILclient!ya;ILclient!uu;ILclient!ma;II)V")
	public static void method294(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class247 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) Class157 local10 = Static348.aClass182_4.method4124(arg2);
		if (local10 == null || !local10.aBoolean450 || !local10.method3778(Static257.aClass114_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local10.anIntArray317 != null) {
			@Pc(32) int[] local32 = new int[local10.anIntArray317.length];
			@Pc(44) int local44;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static111.anInt2386 == 4) {
					local44 = (int) Static368.aFloat192 & 0x3FFF;
				} else {
					local44 = (int) Static368.aFloat192 + Static175.anInt3399 & 0x3FFF;
				}
				@Pc(58) int local58 = Class50_Sub1.anIntArray225[local44];
				@Pc(62) int local62 = Class50_Sub1.anIntArray224[local44];
				if (Static111.anInt2386 != 4) {
					local62 = local62 * 256 / (Static110.anInt2374 + 256);
					local58 = local58 * 256 / (Static110.anInt2374 + 256);
				}
				local32[local34 * 2] = arg3.anInt6833 / 2 + arg6 + ((arg0 + local10.anIntArray317[local34 * 2] * 4) * local62 + local58 * (local10.anIntArray317[local34 * 2 + 1] * 4 + arg4) >> 15);
				local32[local34 * 2 + 1] = arg7 + arg3.anInt6805 / 2 - ((arg4 + local10.anIntArray317[local34 * 2 + 1] * 4) * local62 - (arg0 + local10.anIntArray317[local34 * 2] * 4) * local58 >> 15);
			}
			Static144.method2440(arg1, local32, local10.anInt4927, arg3.anIntArray524, arg3.anIntArray519);
			for (local44 = 0; local44 < local32.length / 2 - 1; local44++) {
				arg1.method4287(local32[local44 * 2], local32[local44 * 2 + 1], local32[local44 * 2 + 2], local32[(local44 + 1) * 2 + 1], local10.anInt4908, arg5, arg6, arg7);
			}
			arg1.method4287(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local10.anInt4908, arg5, arg6, arg7);
		}
		@Pc(262) Class57 local262 = null;
		if (local10.anInt4930 != -1) {
			local262 = local10.method3785(arg1, false);
			if (local262 != null) {
				Static442.method5585(arg6, local262, arg3, arg5, arg4, arg0, arg7);
			}
		}
		if (local10.aString47 == null) {
			return;
		}
		local34 = 0;
		if (local262 != null) {
			local34 = local262.ma();
		}
		@Pc(296) Class46 local296 = Static43.aClass46_12;
		@Pc(298) Class89 local298 = Static387.aClass89_10;
		if (local10.anInt4904 == 1) {
			local296 = Static207.aClass46_9;
			local298 = Static34.aClass89_1;
		}
		if (local10.anInt4904 == 2) {
			local296 = Static331.aClass46_10;
			local298 = Static118.aClass89_5;
		}
		Static275.method3930(arg6, local10.aString47, arg0, local34, local296, arg7, arg3, arg4, local10.anInt4926, local298, arg5);
		return;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
	public static void method296(@OriginalArg(1) int arg0) {
		Static349.anInt5986 = arg0;
		Static172.aClass68_18.method1777();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method297(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(45) StringBuffer local45 = new StringBuffer(local10 + local8);
		for (@Pc(47) int local47 = 0; local47 < local8; local47++) {
			@Pc(53) char local53 = arg0.charAt(local47);
			if (local53 == '<') {
				local45.append("<lt>");
			} else if (local53 == '>') {
				local45.append("<gt>");
			} else {
				local45.append(local53);
			}
		}
		return local45.toString();
	}

	@OriginalMember(owner = "client!av", name = "h", descriptor = "(I)Ljava/lang/String;")
	public static String method298() {
		@Pc(12) String local12 = "www";
		if (Static53.aClass219_1 == Static104.aClass219_2) {
			local12 = "www-wtrc";
		} else if (Static217.aClass219_3 == Static104.aClass219_2) {
			local12 = "www-wtqa";
		} else if (Static104.aClass219_2 == Static420.aClass219_7) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static34.aString13 != null) {
			local33 = "/p=" + Static34.aString13;
		}
		return "http://" + local12 + "." + Static393.aClass121_3.aString36 + ".com/l=" + Static178.anInt3423 + "/a=" + Static168.anInt3259 + local33 + "/";
	}
}
