import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "J")
	public static volatile long aLong245 = 0L;

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "Lclient!gg;")
	public static final Class112 aClass112_60 = new Class112(4);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V")
	public static void method7848(@OriginalArg(0) int arg0) {
		Static128.anInt3197 = arg0;
		Static479.anInt8544 = 100;
		Static473.anInt8493 = 3;
		Static134.anInt3480 = -1;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZZ)V")
	public static void method7852(@OriginalArg(0) boolean arg0) {
		Static282.method4635(Static114.anInt2970, Static256.anInt5669, arg0, Static530.anInt9144);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!ha;IZ)Lclient!in;")
	public static Class148 method7854(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			return null;
		}
		if (Static393.anIntArray156 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static393.anIntArray156.length; local14++) {
				if (Static393.anIntArray156[local14] == arg2) {
					return Static498.aClass148Array1[local14];
				}
			}
		}
		@Pc(45) Class148 local45 = (Class148) Static401.aClass112_45.method3640((long) arg2);
		if (local45 != null) {
			if (arg0 && local45.aClass315_12 == null) {
				@Pc(57) Class315 local57 = Static494.method7247(Static359.aClass181_114, arg2);
				if (local57 == null) {
					return null;
				}
				local45.aClass315_12 = local57;
			}
			return local45;
		}
		@Pc(70) Class28[] local70 = Static649.method617(Static452.aClass181_87, arg2);
		if (local70 == null) {
			return null;
		}
		@Pc(79) Class315 local79 = Static494.method7247(Static359.aClass181_114, arg2);
		if (local79 == null) {
			return null;
		}
		if (arg0) {
			local45 = new Class148(arg1.method6202(local79, local70), local79);
		} else {
			local45 = new Class148(arg1.method6202(local79, local70));
		}
		Static401.aClass112_45.method3636((long) arg2, local45);
		return local45;
	}
}
