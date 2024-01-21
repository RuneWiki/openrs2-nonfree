import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_15;

	@OriginalMember(owner = "client!bd", name = "R", descriptor = "Lclient!hj;")
	public static Class1_Sub11 aClass1_Sub11_1;

	@OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
	public static int anInt446;

	@OriginalMember(owner = "client!bd", name = "lb", descriptor = "Lclient!wd;")
	public static Class97 aClass97_2;

	@OriginalMember(owner = "client!bd", name = "mb", descriptor = "Lclient!sd;")
	public static Class60 aClass60_2;

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "Lclient!jd;")
	public static Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!bd", name = "O", descriptor = "Z")
	public static boolean aBoolean20 = true;

	@OriginalMember(owner = "client!bd", name = "Q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_319 = Static118.method2249("<img=1>");

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_320 = Static118.method2249("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!bd", name = "Y", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_321 = Static118.method2249(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!bd", name = "eb", descriptor = "[I")
	public static final int[] anIntArray44 = new int[1000];

	@OriginalMember(owner = "client!bd", name = "nb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_323 = Static118.method2249("<col=ffb000>");

	@OriginalMember(owner = "client!bd", name = "ob", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array8 = new Class65[100];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!sd;)V")
	public static void method297(@OriginalArg(1) Class60 arg0) {
		Static23.aClass60_4 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method298() {
		if (Static118.aClass4_2 != null) {
			Static118.aClass4_2.method2767();
		}
		if (Static58.aClass4_1 != null) {
			Static58.aClass4_1.method2767();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!oc;ILclient!wa;)I")
	public static int method299(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		@Pc(6) int local6 = arg1.anInt2306;
		arg1.method1702(arg0.anInt3190);
		arg1.anInt2306 += Static67.aClass70_1.method2617(arg0.anInt3190, arg0.aByteArray37, arg1.aByteArray29, arg1.anInt2306, 0);
		return arg1.anInt2306 - local6;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!wd;)Z")
	public static boolean method300(@OriginalArg(1) Class97 arg0) {
		if (Static8.aBoolean9) {
			if (Static153.method2677(arg0) != 0) {
				return false;
			}
			if (arg0.anInt4329 == 0) {
				return false;
			}
		}
		return arg0.aBoolean180;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!w;)V")
	public static void method302(@OriginalArg(1) Class6_Sub4 arg0) {
		arg0.anInt3955 = 0;
		@Pc(12) int local12 = arg0.anInt3963 - Static174.anInt3887;
		@Pc(23) int local23 = arg0.anInt3947 * 128 + arg0.anInt3959 * 64;
		if (arg0.anInt3949 == 0) {
			arg0.anInt3965 = 1024;
		}
		if (arg0.anInt3949 == 1) {
			arg0.anInt3965 = 1536;
		}
		if (arg0.anInt3949 == 2) {
			arg0.anInt3965 = 0;
		}
		@Pc(60) int local60 = arg0.anInt3959 * 64 + arg0.anInt3958 * 128;
		arg0.anInt3976 += (local23 - arg0.anInt3976) / local12;
		if (arg0.anInt3949 == 3) {
			arg0.anInt3965 = 512;
		}
		arg0.anInt3934 += (local60 - arg0.anInt3934) / local12;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBLclient!sd;I)[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] method303(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) int arg2) {
		return Static178.method3023(arg0, arg1, arg2) ? Static172.method2922() : null;
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V")
	public static void method304() {
		if (Static114.anInt2802 > 0) {
			Static137.method2586();
		} else {
			Static118.method2247(40);
			Static41.aClass23_1 = Static123.aClass23_4;
			Static123.aClass23_4 = null;
		}
	}
}
