import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array21;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "[Lclient!ln;")
	public static Class126[] aClass126Array1;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "J")
	public static long aLong218;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	public static int anInt7010 = 0;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_215 = new Class217(75, 8);

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
	public static int anInt7016 = 99;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString65 = null;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIILclient!jm;)Lclient!hg;")
	public static Class1_Sub4_Sub12 method6054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(10) int local10 = arg0 << 8 | arg2.anInt3173;
		@Pc(19) Class1_Sub4_Sub12 local19 = (Class1_Sub4_Sub12) Static219.aClass44_6.method1612((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static368.aClass30_112.method1179(Static368.aClass30_112.method1170(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 8 | arg2.anInt3173;
			local19 = (Class1_Sub4_Sub12) Static219.aClass44_6.method1612((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static368.aClass30_112.method1179(Static368.aClass30_112.method1170(local10));
			if (local31 == null) {
				local10 = arg2.anInt3173 | 0xFFFF00;
				local19 = (Class1_Sub4_Sub12) Static219.aClass44_6.method1612((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static368.aClass30_112.method1179(Static368.aClass30_112.method1170(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static136.method4752(local31);
					local19.aClass105_7 = arg2;
					Static219.aClass44_6.method1616((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static136.method4752(local31);
				local19.aClass105_7 = arg2;
				Static219.aClass44_6.method1616((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static136.method4752(local31);
			local19.aClass105_7 = arg2;
			Static219.aClass44_6.method1616((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(CIZ)C")
	public static char method6055(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}
}
