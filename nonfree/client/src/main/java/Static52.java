import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!f", name = "yb", descriptor = "[I")
	public static int[] anIntArray58;

	@OriginalMember(owner = "client!f", name = "Eb", descriptor = "Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_4;

	@OriginalMember(owner = "client!f", name = "wb", descriptor = "I")
	public static int anInt1117 = 100;

	@OriginalMember(owner = "client!f", name = "zb", descriptor = "Lclient!ic;")
	public static Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!f", name = "Ab", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_550 = Static193.method3027("huffman");

	@OriginalMember(owner = "client!f", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray59 = new int[32];

	@OriginalMember(owner = "client!f", name = "Cb", descriptor = "I")
	public static int anInt1119 = 0;

	@OriginalMember(owner = "client!f", name = "Db", descriptor = "[I")
	public static int[] anIntArray60 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!f", name = "Fb", descriptor = "I")
	public static volatile int anInt1120 = 0;

	@OriginalMember(owner = "client!f", name = "Gb", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array24 = new Class70[200];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(JB)V")
	public static void method832(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < Static13.anInt318; local15++) {
			if (Static70.aLongArray1[local15] == arg0) {
				Static13.anInt318--;
				for (@Pc(32) int local32 = local15; local32 < Static13.anInt318; local32++) {
					aClass70Array24[local32] = aClass70Array24[local32 + 1];
					Static179.anIntArray74[local32] = Static179.anIntArray74[local32 + 1];
					Static81.aClass70Array32[local32] = Static81.aClass70Array32[local32 + 1];
					Static70.aLongArray1[local32] = Static70.aLongArray1[local32 + 1];
					Static42.anIntArray46[local32] = Static42.anIntArray46[local32 + 1];
				}
				Static33.anInt719 = Static86.anInt1703;
				Static93.aClass3_Sub4_Sub1_18.method1298(164);
				Static93.aClass3_Sub4_Sub1_18.method1250(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!ce;II)Lclient!oc;")
	public static Class70 method834(@OriginalArg(0) Class3_Sub4 arg0) {
		try {
			@Pc(7) Class70 local7 = new Class70();
			local7.anInt2899 = arg0.method1266();
			if (local7.anInt2899 > 32767) {
				local7.anInt2899 = 32767;
			}
			local7.aByteArray30 = new byte[local7.anInt2899];
			arg0.anInt1758 += Static22.aClass25_1.method685(arg0.aByteArray12, local7.anInt2899, arg0.anInt1758, local7.aByteArray30, 0);
			return local7;
		} catch (@Pc(49) Exception local49) {
			return Static3.aClass70_16;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIBII)V")
	public static void method835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg3) {
			Static189.method2975(arg3, arg1, arg4, arg2);
		} else if (Static119.anInt2428 <= arg4 - arg3 && Static200.anInt4074 >= arg3 + arg4 && arg2 - arg0 >= Static26.anInt554 && arg0 + arg2 <= anInt1117) {
			Static63.method962(arg4, arg2, arg1, arg0, arg3);
		} else {
			Static59.method1600(arg0, arg3, arg2, arg1, arg4);
		}
	}
}
