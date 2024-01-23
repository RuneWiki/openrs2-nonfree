import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!sh", name = "ab", descriptor = "Lclient!bh;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!sh", name = "db", descriptor = "[I")
	public static int[] anIntArray523;

	@OriginalMember(owner = "client!sh", name = "eb", descriptor = "I")
	public static int anInt4839;

	@OriginalMember(owner = "client!sh", name = "T", descriptor = "Lclient!cc;")
	public static Class26 aClass26_51 = new Class26(64);

	@OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
	public static int anInt4836 = 0;

	@OriginalMember(owner = "client!sh", name = "cb", descriptor = "I")
	public static int anInt4838 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V")
	public static void method4018(@OriginalArg(1) int arg0) {
		if (Static281.anInt5331 == arg0) {
			@Pc(16) Interface2 local16 = Static254.anInterface2Array1[arg0];
			local16.method3523(Static11.anInt214);
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)Lclient!ik;")
	public static Class90 method4019(@OriginalArg(1) int arg0) {
		@Pc(6) Class90 local6 = (Class90) Static157.aClass26_29.method518((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static107.aClass58_100.method1372(0, arg0);
		local6 = new Class90();
		if (local21 != null) {
			local6.method1916(new Class4_Sub10(local21));
		}
		local6.method1920();
		Static157.aClass26_29.method510(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(II)Lclient!te;")
	public static Class4_Sub3_Sub19 method4021(@OriginalArg(0) int arg0) {
		@Pc(19) Class4_Sub3_Sub19 local19 = (Class4_Sub3_Sub19) Static294.aClass26_49.method518((long) arg0);
		if (local19 != null) {
			return local19;
		}
		local19 = Static309.method4793(arg0, Static58.aClass58_35, Static292.aClass58_101);
		if (local19 != null) {
			Static294.aClass26_49.method510(local19, (long) arg0);
		}
		return local19;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!wf;IB)I")
	public static int method4022(@OriginalArg(0) Class189 arg0, @OriginalArg(1) int arg1) {
		if (!Static41.method687(arg0).method3279(arg1) && arg0.anObjectArray18 == null) {
			return -1;
		} else if (arg0.anIntArray666 == null || arg0.anIntArray666.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray666[arg1];
		}
	}
}
