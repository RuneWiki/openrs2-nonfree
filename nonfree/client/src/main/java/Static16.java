import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!of;")
	public static Class1_Sub1_Sub16 aClass1_Sub1_Sub16_1;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public static int anInt247;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	public static int anInt245 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public static void method214(@OriginalArg(0) int arg0) {
		if (Static78.anInt1449 == 0) {
			Static183.aClass1_Sub4_Sub3_3.method1499(arg0);
		} else {
			Static59.anInt1191 = arg0;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BB)C")
	public static char method215(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(44) char local44 = Static302.aCharArray10[local7 - 128];
			if (local44 == '\u0000') {
				local44 = '?';
			}
			local7 = local44;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method216() {
		for (@Pc(16) Class1_Sub19 local16 = (Class1_Sub19) Static114.aClass24_16.method460(); local16 != null; local16 = (Class1_Sub19) Static114.aClass24_16.method464()) {
			if (local16.anInt3726 > 0) {
				local16.anInt3726--;
			}
			if (local16.anInt3726 != 0) {
				if (local16.anInt3715 > 0) {
					local16.anInt3715--;
				}
				if (local16.anInt3715 == 0 && local16.anInt3719 >= 1 && local16.anInt3725 >= 1 && local16.anInt3719 <= 102 && local16.anInt3725 <= 102 && (local16.anInt3723 < 0 || Static157.method2678(local16.anInt3723, local16.anInt3716))) {
					Static104.method1645(local16.anInt3719, local16.anInt3722, local16.anInt3725, local16.anInt3716, local16.anInt3717, local16.anInt3728, local16.anInt3723);
					local16.anInt3715 = -1;
					if (local16.anInt3723 == local16.anInt3721 && local16.anInt3721 == -1) {
						local16.method4616();
					} else if (local16.anInt3723 == local16.anInt3721 && local16.anInt3724 == local16.anInt3728 && local16.anInt3718 == local16.anInt3716) {
						local16.method4616();
					}
				}
			} else if (local16.anInt3721 < 0 || Static157.method2678(local16.anInt3721, local16.anInt3718)) {
				Static104.method1645(local16.anInt3719, local16.anInt3722, local16.anInt3725, local16.anInt3718, local16.anInt3717, local16.anInt3724, local16.anInt3721);
				local16.method4616();
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qf;II)Ljava/lang/String;")
	public static String method217(@OriginalArg(0) Class146 arg0, @OriginalArg(2) int arg1) {
		if (!Static36.method643(arg0).method3243(arg1) && arg0.anObjectArray29 == null) {
			return null;
		} else if (arg0.aStringArray36 == null || arg1 >= arg0.aStringArray36.length || arg0.aStringArray36[arg1] == null || arg0.aStringArray36[arg1].trim().length() == 0) {
			return Static250.aBoolean231 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray36[arg1];
		}
	}
}
