import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "[Lclient!haa;")
	public static Class4_Sub3[] aClass4_Sub3Array4;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "Z")
	public static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_198 = new Class251(8, 3);

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
	public static void method7253() {
		Static65.aClass263_1 = null;
		Static314.aClass263_6 = null;
		Static289.aClass263_5 = null;
		Static260.anInt4868 = -1;
		Static16.anInt226 = -1;
		Static456.anInterface22_1 = null;
		Static276.anInterface22Array1 = null;
		Static22.aClass144_1 = null;
		Static466.anIntArray414 = null;
		Static18.anInt243 = -1;
		Static530.anInt9101 = -1;
		Static89.aClass307_5.method7676();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(CI)C")
	public static char method7254(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Lclient!qw;")
	public static Class4_Sub7 method7255() {
		@Pc(14) Class4_Sub7 local14 = (Class4_Sub7) Static500.aClass283_11.method6798();
		if (local14 == null) {
			return new Class4_Sub7();
		} else {
			Static203.anInt3516--;
			return local14;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIILclient!ha;II)V")
	public static void method7256(@OriginalArg(2) int arg0, @OriginalArg(3) Class144 arg1, @OriginalArg(5) int arg2) {
		Static22.aClass144_1 = arg1;
		Static65.aClass263_1 = Static22.aClass144_1.method6914();
		Static289.aClass263_5 = Static22.aClass144_1.method6914();
		Static314.aClass263_6 = Static22.aClass144_1.method6914();
		Static296.anInt5320 = 100;
		Static18.anInt243 = 0;
		Static302.anInt5402 = 100;
		Static276.anInterface22Array1 = null;
		Static466.anIntArray414 = null;
		Static471.method7069(arg2, arg0);
		Static16.anInt226 = -1;
		Static530.anInt9101 = -1;
		Static260.anInt4868 = -1;
	}
}
