import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static106 {

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array6;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "Lclient!dd;")
	public static Class16 aClass16_14;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_34;

	@OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
	public static int anInt3132;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Lclient!ea;")
	public static Class18 aClass18_791 = Static8.method128("gr-Un:");

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "Lclient!rc;")
	public static Class66 aClass66_12 = new Class66(20);

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
	public static void method2186() {
		aClass18_791 = null;
		aClass66_12 = null;
		aClass16_Sub1_34 = null;
		aClass16_14 = null;
		aShortArrayArray6 = null;
		aClass1_Sub1_Sub8_Sub1Array6 = null;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIII)I")
	public static int method2187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static2.aByteArrayArrayArray1[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static2.aByteArrayArrayArray1[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
	public static void method2188() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}
}
