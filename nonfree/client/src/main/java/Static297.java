import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!wl", name = "Z", descriptor = "[Lclient!af;")
	public static Class2_Sub3_Sub1_Sub1[] aClass2_Sub3_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!wl", name = "bb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!wl", name = "cb", descriptor = "I")
	public static int anInt6219;

	@OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
	public static volatile int anInt6210 = -1;

	@OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
	public static int anInt6213 = -1;

	@OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
	public static int anInt6214 = -1;

	@OriginalMember(owner = "client!wl", name = "X", descriptor = "I")
	public static int anInt6216 = 0;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)Z")
	public static boolean method4947(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method4948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class115 local8 = Static266.method4442(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray18 != null) {
			@Pc(19) Class2_Sub6 local19 = new Class2_Sub6();
			local19.aString33 = arg2;
			local19.anInt532 = arg3;
			local19.aClass115_4 = local8;
			local19.anObjectArray1 = local8.anObjectArray18;
			Static73.method1363(local19);
		}
		@Pc(37) boolean local37 = true;
		if (local8.anInt3544 > 0) {
			local37 = Static191.method629(local8);
		}
		if (!local37 || !Static35.method708(local8).method1315(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static95.aClass2_Sub26_Sub1_1.method4287(70);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
		if (arg3 == 2) {
			Static95.aClass2_Sub26_Sub1_1.method4287(209);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
		if (arg3 == 3) {
			Static95.aClass2_Sub26_Sub1_1.method4287(138);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
		if (arg3 == 4) {
			Static95.aClass2_Sub26_Sub1_1.method4287(119);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
		if (arg3 == 5) {
			Static95.aClass2_Sub26_Sub1_1.method4287(227);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
		if (arg3 == 6) {
			Static95.aClass2_Sub26_Sub1_1.method4287(116);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
		if (arg3 == 7) {
			Static95.aClass2_Sub26_Sub1_1.method4287(156);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
		if (arg3 == 8) {
			Static95.aClass2_Sub26_Sub1_1.method4287(32);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
		if (arg3 == 9) {
			Static95.aClass2_Sub26_Sub1_1.method4287(198);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
		if (arg3 == 10) {
			Static95.aClass2_Sub26_Sub1_1.method4287(35);
			Static95.aClass2_Sub26_Sub1_1.method4260(arg1);
			Static95.aClass2_Sub26_Sub1_1.method4231(arg0);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method4950(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}
}
