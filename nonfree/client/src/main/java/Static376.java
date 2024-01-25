import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!oea", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!oea", name = "B", descriptor = "Lclient!bi;")
	public static Class31 aClass31_82;

	@OriginalMember(owner = "client!oea", name = "D", descriptor = "I")
	public static int anInt6720;

	@OriginalMember(owner = "client!oea", name = "A", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public static void method5609(@OriginalArg(0) String arg0) {
		Static71.aString16 = arg0;
		if (Static55.anApplet1 == null) {
			return;
		}
		try {
			@Pc(20) String local20 = Static55.anApplet1.getParameter("cookieprefix");
			@Pc(24) String local24 = Static55.anApplet1.getParameter("cookiehost");
			@Pc(39) String local39 = local20 + "settings=" + arg0 + "; version=1; path=/; domain=" + local24;
			if (arg0.length() == 0) {
				local39 = local39 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local39 = local39 + "; Expires=" + Static591.method7952(Static184.method3422() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static611.method6760(Static55.anApplet1, "document.cookie=\"" + local39 + "\"");
		} catch (@Pc(90) Throwable local90) {
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method5610(@OriginalArg(0) Class26_Sub6 arg0) {
		arg0.aClass10_1 = null;
		@Pc(17) int local17 = arg0.aClass26_Sub5Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass26_Sub5Array1[local19].aBoolean508 = false;
		}
		@Pc(37) Class8[] local37 = Class4_Sub20.aClass8Array1;
		synchronized (Class4_Sub20.aClass8Array1) {
			if (Class4_Sub20.aClass8Array1.length > local17 && Static436.anIntArray613[local17] < 200) {
				Class4_Sub20.aClass8Array1[local17].method109(arg0);
				@Pc(58) int local58 = Static436.anIntArray613[local17]++;
			}
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!oa;IBZ)Lclient!wb;")
	public static Class352 method5611(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 == -1) {
			return null;
		}
		if (Static61.anIntArray145 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static61.anIntArray145.length; local14++) {
				if (Static61.anIntArray145[local14] == arg1) {
					return Static271.aClass352Array1[local14];
				}
			}
		}
		@Pc(45) Class352 local45 = (Class352) Static277.aClass223_40.method4943((long) arg1);
		if (local45 != null) {
			if (arg2 && local45.aClass196_13 == null) {
				@Pc(57) Class196 local57 = Static533.method7421(Static433.aClass31_96, arg1);
				if (local57 == null) {
					return null;
				}
				local45.aClass196_13 = local57;
			}
			return local45;
		}
		@Pc(70) Class268[] local70 = Static607.method5871(Static149.aClass31_32, arg1);
		if (local70 == null) {
			return null;
		}
		@Pc(85) Class196 local85 = Static533.method7421(Static433.aClass31_96, arg1);
		if (local85 == null) {
			return null;
		}
		if (arg2) {
			local45 = new Class352(arg0.method6829(local85, local70), local85);
		} else {
			local45 = new Class352(arg0.method6829(local85, local70));
		}
		Static277.aClass223_40.method4938((long) arg1, local45);
		return local45;
	}
}
