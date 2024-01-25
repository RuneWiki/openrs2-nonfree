import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
	public static int anInt5985;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V")
	public static void method5391(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg1.length() > 320 || !Static349.method5348()) {
			return;
		}
		Static406.method6232();
		Static366.aString75 = arg0;
		Static527.aString100 = arg1;
		Static423.anInt7240 = arg2;
		Static307.method4889(6);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZI)V")
	public static void method5392(@OriginalArg(1) int arg0) {
		Static305.aClass260_2 = Static525.aClass260_4;
		Static41.anInt544 = 2;
		Static423.anInt7240 = arg0;
		@Pc(11) String local11 = null;
		if (Static468.aByteArray78 != null) {
			@Pc(18) Class6_Sub15 local18 = new Class6_Sub15(Static468.aByteArray78);
			local11 = Static23.method263(local18.method3049());
			Static520.aLong275 = local18.method3049();
		}
		if (local11 == null) {
			Static378.method5857(35);
		} else {
			Static430.method3630(true, local11, "", false);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II[BZLclient!ml;III)Lclient!gda;")
	public static Class44_Sub1_Sub1 method5393(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) Class75_Sub3 arg2, @OriginalArg(5) int arg3) {
		if (arg2.aBoolean495 || Static232.method4114(arg3) && Static232.method4114(arg0)) {
			return new Class44_Sub1_Sub1(arg2, 3553, 6406, arg3, arg0, false, arg1, 6406);
		} else if (arg2.aBoolean492) {
			return new Class44_Sub1_Sub1(arg2, 34037, 6406, arg3, arg0, false, arg1, 6406);
		} else {
			return new Class44_Sub1_Sub1(arg2, 6406, arg3, arg0, Static314.method4970(arg3), Static314.method4970(arg0), arg1, 6406);
		}
	}
}
