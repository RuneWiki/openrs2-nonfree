import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!pd", name = "kb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_950 = Static81.method1507("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_954 = Static81.method1507("Loaded fonts");

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "Lclient!dj;")
	public static Class24 aClass24_951 = aClass24_954;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_952 = Static81.method1507("::errortest");

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "Lclient!dj;")
	public static Class24 aClass24_953 = aClass24_950;

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_955 = Static81.method1507("Okay");

	@OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
	public static int anInt3253 = 0;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V")
	public static void method2512() {
		Static107.aClass1_Sub3_Sub4_1.method2888();
		Static120.aClass69_29 = null;
		Static91.anInt2111 = 1;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
	public static void method2514(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static110.method1903(arg0)) {
			return;
		}
		@Pc(19) Class98[] local19 = Static4.aClass98ArrayArray3[arg0];
		for (@Pc(26) int local26 = 0; local26 < local19.length; local26++) {
			@Pc(32) Class98 local32 = local19[local26];
			if (local32.anObjectArray12 != null) {
				@Pc(39) Class1_Sub16 local39 = new Class1_Sub16();
				local39.anObjectArray1 = local32.anObjectArray12;
				local39.aClass98_13 = local32;
				Static5.method104(2000000, local39);
			}
		}
	}
}
