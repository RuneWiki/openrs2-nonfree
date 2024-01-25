import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_46 = new Class26(16);

	@OriginalMember(owner = "client!qs", name = "pb", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_47 = new Class26(500);

	@OriginalMember(owner = "client!qs", name = "zb", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!qs", name = "Ab", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_89 = new Class117("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!qs", name = "Bb", descriptor = "Z")
	public static final boolean aBoolean350 = false;

	@OriginalMember(owner = "client!qs", name = "Cb", descriptor = "I")
	public static int anInt5349 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Lclient!b;")
	public static Class18 method4527() {
		try {
			return new Class18_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class18) Class.forName("Class18_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class18_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!uo;)V")
	public static void method4534(@OriginalArg(0) Class129 arg0) {
		for (@Pc(1) int local1 = Static104.anInt1933; local1 < Static279.anInt5583; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static232.anInt4703; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static300.anInt5931; local7++) {
					@Pc(16) Class106 local16 = Static212.aClass106ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class67_Sub2 local21 = local16.aClass67_Sub2_1;
						@Pc(24) Class67_Sub2 local24 = local16.aClass67_Sub2_2;
						if (local21 != null && local21.method5399()) {
							Static170.method2769(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5399()) {
								Static170.method2769(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5398(0, 0, 0, local21, arg0, false);
								local24.method5403();
							}
							local21.method5403();
						}
						for (@Pc(70) Class64 local70 = local16.aClass64_4; local70 != null; local70 = local70.aClass64_2) {
							@Pc(74) Class67_Sub3 local74 = local70.aClass67_Sub3_1;
							if (local74 != null && local74.method5399()) {
								Static170.method2769(arg0, local74, local1, local4, local7, local74.aShort93 + 1 - local74.aShort91, local74.aShort92 - local74.aShort90 + 1);
								local74.method5403();
							}
						}
						@Pc(111) Class67_Sub4 local111 = local16.aClass67_Sub4_1;
						if (local111 != null && local111.method5399()) {
							Static341.method5569(arg0, local111, local1, local4, local7);
							local111.method5403();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)Lclient!cq;")
	public static Class43 method4536(@OriginalArg(0) int arg0) {
		@Pc(10) Class43 local10 = (Class43) Static160.aClass26_54.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static219.aClass144_69.method3896(arg0, 1);
		local10 = new Class43();
		local10.anInt900 = arg0;
		if (local25 != null) {
			local10.method680(new Class11_Sub25(local25));
		}
		local10.method682();
		if (local10.anInt894 == 2 && Static270.aClass58_32.method1009((long) arg0) == null) {
			Static270.aClass58_32.method1006((long) arg0, new Class11_Sub33(Static344.anInt6587));
			Static191.aClass43Array3[Static344.anInt6587++] = local10;
		}
		Static160.aClass26_54.method330((long) arg0, local10);
		return local10;
	}
}
