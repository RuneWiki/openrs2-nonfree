import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!kn;")
	public static Class144 aClass144_6;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!jk;")
	public static Class131 aClass131_5;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "[I")
	public static int[] anIntArray565;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public static int anInt6744;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
	public static int anInt6739 = 0;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "[Lclient!gi;")
	public static final Class94_Sub1[] aClass94_Sub1Array6 = new Class94_Sub1[30];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void method5330(@OriginalArg(0) int arg0) {
		Static377.anInt6398 = 100;
		Static170.anInt3362 = -1;
		Static441.anInt300 = arg0;
		Static338.anInt6358 = 3;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
	public static int method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method5335() {
		Static437.aBoolean476 = false;
		Static283.aClipboard2 = null;
		Static260.method3927();
	}
}
