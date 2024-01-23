import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "[[Lclient!mi;")
	public static Class3_Sub21[][] aClass3_Sub21ArrayArray1;

	@OriginalMember(owner = "client!cn", name = "v", descriptor = "Lclient!rn;")
	public static Class155 aClass155_22;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	public static int anInt828;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "Lclient!oj;")
	public static Class131 aClass131_1 = new Class131();

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString32 = "";

	@OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
	public static int anInt829 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I")
	public static int method662(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)V")
	public static void method666(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg0, 9);
		local8.method970();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V")
	public static void method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static5.aBoolean8 = true;
		Static203.anInt3976 = arg0;
		Static2.anInt34 = arg1;
		Static278.anInt5067 = arg2;
		Static115.anInt2150 = -1;
		Static76.anInt1448 = -1;
	}
}
