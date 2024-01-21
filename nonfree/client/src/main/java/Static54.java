import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "Lclient!kg;")
	public static Class24_Sub4_Sub1 aClass24_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	public static int anInt1360;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!ie;")
	public static final Class2_Sub2_Sub13 aClass2_Sub2_Sub13_1 = new Class2_Sub2_Sub13();

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_412 = Static181.method2795("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public static int anInt1359 = 0;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_413 = Static181.method2795("::clientdrop");

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!qe;I)Lclient!cc;")
	public static Class2_Sub7 method1042(@OriginalArg(0) Class83 arg0) {
		if (arg0.method2428() == 0) {
			return null;
		}
		for (@Pc(16) Class2_Sub7 local16 = (Class2_Sub7) Static118.aClass19_12.method691(); local16 != null; local16 = (Class2_Sub7) Static118.aClass19_12.method686()) {
			if (local16.aClass83_144.method2426(arg0)) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)I")
	public static int method1043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = arg4 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(28) int local28 = arg3;
			arg3 = arg1;
			arg1 = local28;
		}
		if (local19 == 0) {
			return arg0;
		} else if (local19 == 1) {
			return arg5;
		} else if (local19 == 2) {
			return 7 + 1 - arg0 - arg3;
		} else {
			return 7 + 1 - arg5 - arg1;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
	public static int method1044(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
