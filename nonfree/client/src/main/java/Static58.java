import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "Lclient!ie;")
	public static Class35 aClass35_2;

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_767 = Static38.method736("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "Lclient!vc;")
	public static Class71 aClass71_768 = Static38.method736("null");

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	public static int anInt1515 = 0;

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
	public static int anInt1516 = 0;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "Lclient!vc;")
	public static Class71 aClass71_769 = Static38.method736("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "Lclient!vc;")
	public static Class71 aClass71_770 = Static38.method736("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
	public static void method1028(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) ((arg0 << 1770960752) + arg1);
		@Pc(17) Class5_Sub1_Sub6 local17 = (Class5_Sub1_Sub6) Static38.aClass57_4.method1575(local11);
		if (local17 != null) {
			Static26.aClass6_2.method158(local17);
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method1029() {
		aClass71_769 = null;
		aClass71_770 = null;
		aClass35_2 = null;
		aClass71_768 = null;
		aClass71_767 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIII)I")
	public static int method1030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 65536 - Class5_Sub1_Sub10_Sub2.anIntArray240[arg2 * 1024 / arg0] >> 1;
		return (local12 * arg3 >> 16) + ((65536 - local12) * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BIB)I")
	public static int method1031(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local12 = local12 >>> 8 ^ Class5_Sub1_Sub3.anIntArray16[(local12 ^ arg1[local14]) & 0xFF];
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIII)I")
	public static int method1032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(8) int local8 = arg2;
			arg2 = arg0;
			arg0 = local8;
		}
		@Pc(25) int local25 = arg4 & 0x3;
		if (local25 == 0) {
			return arg5;
		} else if (local25 == 1) {
			return arg1;
		} else if (local25 == 2) {
			return 7 + 1 - arg5 - arg2;
		} else {
			return 7 + 1 - arg1 - arg0;
		}
	}
}
