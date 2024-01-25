import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
	public static int anInt5282;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	public static int anInt5285;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
	public static int anInt5281 = 104;

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
	public static int anInt5289 = 0;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method4712(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			local5 *= 37L;
			@Pc(24) char local24 = arg0.charAt(local15);
			if (local24 >= 'A' && local24 <= 'Z') {
				local5 += local24 + 1 - 65;
			} else if (local24 >= 'a' && local24 <= 'z') {
				local5 += local24 + 1 - 97;
			} else if (local24 >= '0' && local24 <= '9') {
				local5 += local24 + 27 - 48;
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZII[Ljava/lang/String;)Ljava/lang/String;")
	public static String method4713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(14) String local14 = arg2[arg0];
			return local14 == null ? "null" : local14.toString();
		} else {
			@Pc(25) int local25 = arg0 + arg1;
			@Pc(27) int local27 = 0;
			for (@Pc(34) int local34 = arg0; local34 < local25; local34++) {
				@Pc(39) String local39 = arg2[local34];
				if (local39 == null) {
					local27 += 4;
				} else {
					local27 += local39.length();
				}
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local27);
			for (@Pc(59) int local59 = arg0; local59 < local25; local59++) {
				@Pc(64) String local64 = arg2[local59];
				if (local64 == null) {
					local57.append("null");
				} else {
					local57.append(local64);
				}
			}
			return local57.toString();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[II)[I")
	public static int[] method4714(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[1152];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 36; local16++) {
				@Pc(22) int local22 = arg0[local10];
				if (local22 == 0) {
					if (local16 > 0 && arg0[local10 - 1] != 0) {
						local22 = arg1;
					} else if (local12 > 0 && arg0[local10 - 36] != 0) {
						local22 = arg1;
					} else if (local16 < 35 && arg0[local10 + 1] != 0) {
						local22 = arg1;
					} else if (local12 < 31 && arg0[local10 + 36] != 0) {
						local22 = arg1;
					}
				}
				local8[local10++] = local22;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIB)V")
	public static void method4715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static125.aClass5_Sub12_Sub2_3.method5125(88);
		Static125.aClass5_Sub12_Sub2_3.method5084(arg1);
		Static125.aClass5_Sub12_Sub2_3.method5070(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	public static void method4716() {
		Static341.method5864();
	}
}
