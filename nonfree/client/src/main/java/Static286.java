import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "[Lclient!ae;")
	public static Class7_Sub1[] aClass7_Sub1Array5;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_116 = new Class61(32, -1);

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!db;")
	public static final Class64 aClass64_431 = new Class64(54, 3);

	@OriginalMember(owner = "client!l", name = "r", descriptor = "Lclient!db;")
	public static final Class64 aClass64_432 = new Class64(7, 5);

	@OriginalMember(owner = "client!l", name = "s", descriptor = "I")
	public static int anInt8741 = 0;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(B)V")
	public static void method7185() {
		for (@Pc(10) Class4_Sub37 local10 = (Class4_Sub37) Static263.aClass124_53.method3267(); local10 != null; local10 = (Class4_Sub37) Static263.aClass124_53.method3273()) {
			if (local10.anInt7093 > 0) {
				local10.anInt7093--;
			}
			if (local10.anInt7093 != 0) {
				if (local10.anInt7090 > 0) {
					local10.anInt7090--;
				}
				if (local10.anInt7090 == 0 && local10.anInt7084 >= 1 && local10.anInt7086 >= 1 && local10.anInt7084 <= Static38.anInt740 - 2 && local10.anInt7086 <= Static38.anInt741 - 2 && (local10.anInt7096 < 0 || Static151.method3061(local10.anInt7096, local10.anInt7094))) {
					Static387.method7905(local10.anInt7089, -1, local10.anInt7094, local10.anInt7086, local10.anInt7083, local10.anInt7097, local10.anInt7096, local10.anInt7084);
					local10.anInt7090 = -1;
					if (local10.anInt7091 == local10.anInt7096 && local10.anInt7091 == -1) {
						local10.method8013();
					} else if (local10.anInt7096 == local10.anInt7091 && local10.anInt7097 == local10.anInt7095 && local10.anInt7094 == local10.anInt7092) {
						local10.method8013();
					}
				}
			} else if (local10.anInt7091 < 0 || Static151.method3061(local10.anInt7091, local10.anInt7092)) {
				Static387.method7905(local10.anInt7089, -1, local10.anInt7092, local10.anInt7086, local10.anInt7083, local10.anInt7095, local10.anInt7091, local10.anInt7084);
				local10.method8013();
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Z")
	public static boolean method7186() {
		@Pc(7) boolean local7 = true;
		if (Static136.aClass268_1 == null) {
			if (Static360.aClass31_78.method679(Static351.anInt6125)) {
				Static136.aClass268_1 = Static607.method5882(Static360.aClass31_78, Static351.anInt6125);
			} else {
				local7 = false;
			}
		}
		if (Static237.aClass268_3 == null) {
			if (Static360.aClass31_78.method679(Static267.anInt5145)) {
				Static237.aClass268_3 = Static607.method5882(Static360.aClass31_78, Static267.anInt5145);
			} else {
				local7 = false;
			}
		}
		if (Static578.aClass268_4 == null) {
			if (Static360.aClass31_78.method679(Static260.anInt5067)) {
				Static578.aClass268_4 = Static607.method5882(Static360.aClass31_78, Static260.anInt5067);
			} else {
				local7 = false;
			}
		}
		if (Static204.aClass196_6 == null) {
			if (Static520.aClass31_110.method679(Static414.anInt7163)) {
				Static204.aClass196_6 = Static533.method7421(Static520.aClass31_110, Static414.anInt7163);
			} else {
				local7 = false;
			}
		}
		if (Static406.aClass268Array1 == null) {
			if (Static360.aClass31_78.method679(Static414.anInt7163)) {
				Static406.aClass268Array1 = Static607.method5871(Static360.aClass31_78, Static414.anInt7163);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[FB)[F")
	public static float[] method7189(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static602.method1587(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
