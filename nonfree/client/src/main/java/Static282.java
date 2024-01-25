import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
	public static int anInt5380;

	@OriginalMember(owner = "client!ls", name = "H", descriptor = "I")
	public static int anInt5383;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "J")
	public static long aLong137 = 0L;

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_21 = new Class295();

	@OriginalMember(owner = "client!ls", name = "E", descriptor = "Lclient!wca;")
	public static final Class314 aClass314_1 = new Class314();

	@OriginalMember(owner = "client!ls", name = "F", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_266 = new Class305(31, -2);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLclient!dn;)I")
	public static int method4957(@OriginalArg(1) Class69 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1896(Static167.anInt3396)) {
			local5++;
		}
		if (arg0.method1896(Static160.anInt8955)) {
			local5++;
		}
		if (arg0.method1896(Static258.anInt5018)) {
			local5++;
		}
		if (arg0.method1896(Static75.anInt1800)) {
			local5++;
		}
		if (arg0.method1896(Static330.anInt6193)) {
			local5++;
		}
		if (arg0.method1896(Static72.anInt1757)) {
			local5++;
		}
		if (arg0.method1896(Static327.anInt6160)) {
			local5++;
		}
		if (arg0.method1896(Static331.anInt6196)) {
			local5++;
		}
		if (arg0.method1896(Static467.anInt8075)) {
			local5++;
		}
		if (arg0.method1896(Static465.anInt8015)) {
			local5++;
		}
		if (arg0.method1896(Static221.anInt4327)) {
			local5++;
		}
		if (arg0.method1896(Static233.anInt4513)) {
			local5++;
		}
		if (arg0.method1896(Static519.anInt2067)) {
			local5++;
		}
		if (arg0.method1896(Static325.anInt6146)) {
			local5++;
		}
		if (arg0.method1896(Static183.anInt3825)) {
			local5++;
		}
		if (arg0.method1896(Static451.anInt7892)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZZ)V")
	public static void method4959(@OriginalArg(1) boolean arg0) {
		for (@Pc(6) Class1_Sub37 local6 = (Class1_Sub37) Static307.aClass295_34.method7543(); local6 != null; local6 = (Class1_Sub37) Static307.aClass295_34.method7540()) {
			if (local6.aClass1_Sub4_Sub1_3 != null) {
				Static475.aClass1_Sub4_Sub2_2.method3184(local6.aClass1_Sub4_Sub1_3);
				local6.aClass1_Sub4_Sub1_3 = null;
			}
			if (local6.aClass1_Sub4_Sub1_2 != null) {
				Static475.aClass1_Sub4_Sub2_2.method3184(local6.aClass1_Sub4_Sub1_2);
				local6.aClass1_Sub4_Sub1_2 = null;
			}
			local6.method8239();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(49) Class1_Sub37 local49 = (Class1_Sub37) Static406.aClass295_44.method7543(); local49 != null; local49 = (Class1_Sub37) Static406.aClass295_44.method7540()) {
			if (local49.aClass1_Sub4_Sub1_3 != null) {
				Static475.aClass1_Sub4_Sub2_2.method3184(local49.aClass1_Sub4_Sub1_3);
				local49.aClass1_Sub4_Sub1_3 = null;
			}
			local49.method8239();
		}
		for (@Pc(80) Class1_Sub37 local80 = (Class1_Sub37) Static61.aClass230_11.method6137(); local80 != null; local80 = (Class1_Sub37) Static61.aClass230_11.method6140()) {
			if (local80.aClass1_Sub4_Sub1_3 != null) {
				Static475.aClass1_Sub4_Sub2_2.method3184(local80.aClass1_Sub4_Sub1_3);
				local80.aClass1_Sub4_Sub1_3 = null;
			}
			local80.method8239();
		}
	}
}
