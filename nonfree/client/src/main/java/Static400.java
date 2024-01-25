import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "[I")
	public static final int[] anIntArray694 = new int[32];

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6035(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(10) Class1_Sub1_Sub11 local10 = Static541.method7520(2, arg0);
		local10.method4946();
		local10.aString54 = arg1;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	public static void method6036() {
		@Pc(5) Class313 local5 = Static305.aClass313_35;
		synchronized (Static305.aClass313_35) {
			Static305.aClass313_35.method7400();
		}
		local5 = Static153.aClass313_21;
		synchronized (Static153.aClass313_21) {
			Static153.aClass313_21.method7400();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!dg;II)V")
	public static void method6040(@OriginalArg(1) Class49_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4297 == arg1 && arg1 != -1) {
			@Pc(15) Class199 local15 = Static182.aClass218_1.method5221(arg1);
			@Pc(18) int local18 = local15.anInt5744;
			if (local18 == 1) {
				arg0.anInt4316 = arg2;
				arg0.anInt4265 = 0;
				arg0.anInt4293 = 0;
				arg0.anInt4303 = 0;
				arg0.anInt4288 = 1;
				Static381.method5839(arg0.anInt7141, Static63.aClass49_Sub2_Sub2_Sub1_1 == arg0, local15, arg0.anInt4303, arg0.aByte98, arg0.anInt7137);
			}
			if (local18 == 2) {
				arg0.anInt4293 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt4297 == -1 || Static182.aClass218_1.method5221(arg1).anInt5750 >= Static182.aClass218_1.method5221(arg0.anInt4297).anInt5750) {
			arg0.anInt4303 = 0;
			arg0.anInt4316 = arg2;
			arg0.anInt4293 = 0;
			arg0.anInt4339 = arg0.anInt4338;
			arg0.anInt4288 = 1;
			arg0.anInt4265 = 0;
			arg0.anInt4297 = arg1;
			if (arg0.anInt4297 != -1) {
				Static381.method5839(arg0.anInt7141, Static63.aClass49_Sub2_Sub2_Sub1_1 == arg0, Static182.aClass218_1.method5221(arg0.anInt4297), arg0.anInt4303, arg0.aByte98, arg0.anInt7137);
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BIII)I")
	public static int method6041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < arg2) {
			return arg2;
		} else if (arg1 < arg0) {
			return arg1;
		} else {
			return arg0;
		}
	}
}
