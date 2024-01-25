import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	public static int anInt4920;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public static int anInt4914 = 1;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
	public static int anInt4916 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!gda;III)V")
	public static void method4377(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class73 local12;
		if (arg2 < Static51.anInt1108) {
			local12 = Static267.aClass73ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass3_Sub1_Sub5_1 != null && local12.aClass3_Sub1_Sub5_1.method8505()) {
				arg0.method8491(local12.aClass3_Sub1_Sub5_1, Static246.aClass33_6, 0, 0, true, Static63.anInt1356);
			}
		}
		if (arg3 < Static51.anInt1108) {
			local12 = Static267.aClass73ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass3_Sub1_Sub5_1 != null && local12.aClass3_Sub1_Sub5_1.method8505()) {
				arg0.method8491(local12.aClass3_Sub1_Sub5_1, Static246.aClass33_6, Static63.anInt1356, 0, true, 0);
			}
		}
		if (arg2 < Static51.anInt1108 && arg3 < Static245.anInt7888) {
			local12 = Static267.aClass73ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass3_Sub1_Sub5_1 != null && local12.aClass3_Sub1_Sub5_1.method8505()) {
				arg0.method8491(local12.aClass3_Sub1_Sub5_1, Static246.aClass33_6, Static63.anInt1356, 0, true, Static63.anInt1356);
			}
		}
		if (arg2 < Static51.anInt1108 && arg3 > 0) {
			local12 = Static267.aClass73ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass3_Sub1_Sub5_1 != null && local12.aClass3_Sub1_Sub5_1.method8505()) {
				arg0.method8491(local12.aClass3_Sub1_Sub5_1, Static246.aClass33_6, -Static63.anInt1356, 0, true, Static63.anInt1356);
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method4379(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local16 < local19 && Static504.method6854(arg0.charAt(local16))) {
			local16++;
		}
		while (local19 > local16 && Static504.method6854(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(50) int local50 = local19 - local16;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(63) StringBuffer local63 = new StringBuffer(local50);
		for (@Pc(65) int local65 = local16; local65 < local19; local65++) {
			@Pc(71) char local71 = arg0.charAt(local65);
			if (Static250.method3665(local71)) {
				@Pc(79) char local79 = Static654.method8728(local71);
				if (local79 != '\u0000') {
					local63.append(local79);
				}
			}
		}
		if (local63.length() == 0) {
			return null;
		} else {
			return local63.toString();
		}
	}
}
