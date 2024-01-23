import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!nf;")
	public static Class1_Sub5_Sub14 aClass1_Sub5_Sub14_1;

	@OriginalMember(owner = "client!nm", name = "V", descriptor = "[Lclient!lj;")
	public static Class1_Sub5_Sub6[] aClass1_Sub5_Sub6Array11;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
	public static int anInt3635 = 0;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString126 = " has logged in.";

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
	public static int anInt3640 = 0;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "S")
	public static short aShort41 = 256;

	@OriginalMember(owner = "client!nm", name = "P", descriptor = "S")
	public static short aShort42 = 205;

	@OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
	public static int anInt3669 = 0;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!nm;Lclient!nm;I)V")
	public static void method3221(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1) {
		Static264.aClass119_82 = arg1;
		Static22.aClass119_7 = arg0;
		Static68.anInt1458 = Static22.aClass119_7.method3217(3);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	public static void method3225() {
		Static201.aClass175_32.method4287();
		Static281.aClass175_2.method4287();
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(II)I")
	public static int method3249(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
