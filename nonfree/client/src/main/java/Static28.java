import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!da", name = "Z", descriptor = "Lclient!dd;")
	private static Class13 aClass13_333 = Static161.method2971("Malformed login packet)3");

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Lclient!dd;")
	public static Class13 aClass13_330 = aClass13_333;

	@OriginalMember(owner = "client!da", name = "L", descriptor = "I")
	public static int anInt995 = 2;

	@OriginalMember(owner = "client!da", name = "M", descriptor = "Lclient!dd;")
	public static Class13 aClass13_331 = Static161.method2971("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!da", name = "W", descriptor = "Lclient!dd;")
	public static Class13 aClass13_332 = Static161.method2971("<img=0>");

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_334 = Static161.method2971("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!ag;I)Lclient!re;")
	public static Class1_Sub19 method836(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2245(arg1);
		return local13 == null ? null : new Class1_Sub19(local13);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dd;Lclient!ag;BLclient!dd;)[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] method837(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(13) int local13 = arg1.method2241(arg0);
		@Pc(19) int local19 = arg1.method2255(local13, arg2);
		return Static117.method2224(local13, arg1, local19);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Z")
	public static boolean method839(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method840(@OriginalArg(0) Class1_Sub7 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt717 == 0) {
			local5 = Static99.method1994(arg0.anInt729, arg0.anInt718, arg0.anInt727);
		}
		if (arg0.anInt717 == 1) {
			local5 = Static49.method1232(arg0.anInt729, arg0.anInt718, arg0.anInt727);
		}
		if (arg0.anInt717 == 2) {
			local5 = Static77.method1587(arg0.anInt729, arg0.anInt718, arg0.anInt727);
		}
		if (arg0.anInt717 == 3) {
			local5 = Static50.method1243(arg0.anInt729, arg0.anInt718, arg0.anInt727);
		}
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = -1;
		if (local5 != (long) 0) {
			local63 = (int) (local5 >>> 32) & Integer.MAX_VALUE;
			local61 = (int) local5 >> 20 & 0x3;
			local59 = (int) local5 >> 14 & 0x1F;
		}
		arg0.anInt714 = local61;
		arg0.anInt722 = local59;
		arg0.anInt720 = local63;
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
	public static void method844() {
		aClass13_330 = null;
		aBooleanArray19 = null;
		aClass13_333 = null;
		aClass13_334 = null;
		aClass13_331 = null;
		aClass13_332 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!ag;IILclient!ag;)Lclient!ae;")
	public static Class1_Sub2_Sub1_Sub1_Sub1 method845(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4 arg3) {
		return Static15.method624(arg1, arg0, arg2) ? Static180.method2978(arg3.method2243(arg2, arg1)) : null;
	}
}
