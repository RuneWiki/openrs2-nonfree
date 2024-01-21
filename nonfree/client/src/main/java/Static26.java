import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!dd;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!ie;")
	public static Class35 aClass35_7;

	@OriginalMember(owner = "client!df", name = "D", descriptor = "Lclient!id;")
	private static Class34 aClass34_419 = Static9.method266(" seconds)3");

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!id;")
	public static Class34 aClass34_416 = aClass34_419;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public static int anInt834 = -1;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!id;")
	public static Class34 aClass34_417 = Static9.method266("scape main");

	@OriginalMember(owner = "client!df", name = "v", descriptor = "I")
	public static int anInt842 = 0;

	@OriginalMember(owner = "client!df", name = "C", descriptor = "Lclient!id;")
	private static Class34 aClass34_418 = Static9.method266("Walk here");

	@OriginalMember(owner = "client!df", name = "G", descriptor = "Lclient!id;")
	public static Class34 aClass34_420 = aClass34_418;

	@OriginalMember(owner = "client!df", name = "I", descriptor = "I")
	public static int anInt848 = 0;

	@OriginalMember(owner = "client!df", name = "J", descriptor = "I")
	public static int anInt849 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
	public static boolean method496(@OriginalArg(0) int arg0) {
		if (Static113.aBooleanArray18[arg0]) {
			return true;
		} else if (Static37.aClass35_10.method1575(arg0)) {
			@Pc(23) int local23 = Static37.aClass35_10.method1579(arg0);
			if (local23 == 0) {
				Static113.aBooleanArray18[arg0] = true;
				return true;
			}
			if (Static41.aClass1_Sub9ArrayArray1[arg0] == null) {
				Static41.aClass1_Sub9ArrayArray1[arg0] = new Class1_Sub9[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static41.aClass1_Sub9ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static37.aClass35_10.method1573(arg0, local45);
					if (local59 != null) {
						Static41.aClass1_Sub9ArrayArray1[arg0][local45] = new Class1_Sub9();
						Static41.aClass1_Sub9ArrayArray1[arg0][local45].anInt1050 = (arg0 << 16) + local45;
						if (local59[0] == -1) {
							Static41.aClass1_Sub9ArrayArray1[arg0][local45].method652(new Class1_Sub19(local59));
						} else {
							Static41.aClass1_Sub9ArrayArray1[arg0][local45].method646(new Class1_Sub19(local59));
						}
					}
				}
			}
			Static113.aBooleanArray18[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!ie;Lclient!ie;)V")
	public static void method497(@OriginalArg(1) Class35 arg0, @OriginalArg(2) Class35 arg1) {
		Static78.aClass35_21 = arg0;
		Static61.aClass35_13 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method498() {
		aClass34_419 = null;
		aClass35_7 = null;
		aClass34_420 = null;
		aClass15_1 = null;
		aClass34_418 = null;
		aClass34_416 = null;
		aClass34_417 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZI)Lclient!id;")
	public static Class34 method500(@OriginalArg(2) int arg0) {
		return Static28.method2007(true, arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)V")
	public static void method503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		local4[0] = arg0;
		@Pc(15) int[] local15 = new int[4];
		@Pc(17) int local17 = 1;
		local15[0] = arg1;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (Static24.anIntArray82[local23] != arg0) {
				local4[local17] = Static24.anIntArray82[local23];
				local15[local17] = Static92.anIntArray306[local23];
				local17++;
			}
		}
		Static92.anIntArray306 = local15;
		Static24.anIntArray82 = local4;
		Static39.method684(Static92.anIntArray306, Static71.aClass18Array1.length - 1, Static24.anIntArray82, 0, Static71.aClass18Array1);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BIILclient!ie;)Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1 method505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class35 arg2) {
		return Static69.method1193(arg0, arg1, arg2) ? Static77.method1360() : null;
	}
}
