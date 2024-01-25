import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "Lclient!gb;")
	public static Class88 aClass88_3;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Lclient!fo;")
	public static Class82 aClass82_41;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	public static int anInt2589;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "J")
	public static long aLong92 = -1L;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_82 = new Class12(109, -1);

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Lclient!hn;")
	public static final Class102 aClass102_20 = new Class102(4);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIB)V")
	public static void method2245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 11);
		local8.method2661();
		local8.anInt3213 = arg2;
		local8.anInt3212 = arg1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZ)V")
	public static void method2246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static52.method867(Static164.aClass103_120);
		Static18.aClass1_Sub28_Sub1_1.method5388(arg0);
		Static18.aClass1_Sub28_Sub1_1.method5395(arg1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
	public static boolean method2248() {
		return Static413.aBoolean744;
	}
}
