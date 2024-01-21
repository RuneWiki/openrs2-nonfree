import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static184 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public static int anInt4115;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public static int anInt4117;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 aClass1_Sub2_Sub2_Sub3_11;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public static int anInt4119;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	public static int anInt4114 = 0;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public static int anInt4116 = 0;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt4118 = -2;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
	public static int[] anIntArray433 = new int[4000];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
	public static boolean method3131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!vb;IIIZI)V")
	public static void method3132(@OriginalArg(1) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		anInt4115 = 0;
		Static100.anInt2177 = 2;
		Static98.anInt2160 = arg2;
		Static153.anInt3499 = arg1;
		Static131.aBoolean115 = false;
		Static89.anInt4032 = 1;
		Static108.aClass82_40 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method3133() {
		aClass1_Sub2_Sub2_Sub3_11 = null;
		anIntArray433 = null;
	}
}
