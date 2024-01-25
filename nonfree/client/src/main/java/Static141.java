import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static141 {

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_97 = new Class142("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
	public static int anInt6095 = -1;

	@OriginalMember(owner = "client!gq", name = "u", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_51 = new Class77(20);

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
	public static int anInt6097 = 0;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "Z")
	public static boolean aBoolean538 = true;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ[IBILclient!ih;)Lclient!wh;")
	public static Class23_Sub3_Sub1 method4891(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class117_Sub1 arg3) {
		if (arg3.aBoolean312 || Static375.method4864(arg2) && Static375.method4864(arg0)) {
			return new Class23_Sub3_Sub1(arg3, 3553, arg2, arg0, false, arg1);
		} else if (arg3.aBoolean309) {
			return new Class23_Sub3_Sub1(arg3, 34037, arg2, arg0, false, arg1);
		} else {
			return new Class23_Sub3_Sub1(arg3, arg2, arg0, Static191.method2764(arg2), Static191.method2764(arg0), arg1);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
	public static boolean method4892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static278.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)V")
	public static void method4893() {
		Static76.anInt1078 = 0;
		Static57.aClass14_3.method204();
		Static170.aBoolean282 = false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIILclient!ih;I)Lclient!wh;")
	public static Class23_Sub3_Sub1 method4894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class117_Sub1 arg3, @OriginalArg(5) int arg4) {
		if (arg3.aBoolean312 || Static375.method4864(arg1) && Static375.method4864(arg4)) {
			return new Class23_Sub3_Sub1(arg3, 3553, arg0, arg2, arg1, arg4, true);
		} else if (arg3.aBoolean309) {
			return new Class23_Sub3_Sub1(arg3, 34037, arg0, arg2, arg1, arg4, true);
		} else {
			return new Class23_Sub3_Sub1(arg3, arg0, arg2, arg1, arg4, Static191.method2764(arg1), Static191.method2764(arg4), true);
		}
	}
}
