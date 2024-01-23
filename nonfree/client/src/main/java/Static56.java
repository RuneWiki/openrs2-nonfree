import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!gi;")
	public static Class61 aClass61_3;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!nf;")
	public static Class2_Sub3_Sub18 aClass2_Sub3_Sub18_1;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public static int anInt1271;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!ii;")
	public static Class79 aClass79_8 = new Class79(16);

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public static int anInt1266 = 0;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Z")
	public static boolean aBoolean96 = true;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5 = new String[200];

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public static int anInt1272 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!jd;I)[Lclient!rj;")
	public static Class2_Sub3_Sub1[] method1091(@OriginalArg(0) int arg0, @OriginalArg(2) Class84 arg1) {
		return Static288.method4789(0, arg0, arg1) ? Static192.method3215() : null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BII)I")
	public static int method1093(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static66.method1282(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!md;I)V")
	public static void method1094(@OriginalArg(0) Class2_Sub5 arg0) {
		if (arg0.aClass2_Sub9_5 != null) {
			arg0.aClass2_Sub9_5.anInt2253 = 0;
		}
		arg0.aBoolean357 = false;
		for (@Pc(19) Class2_Sub5 local19 = arg0.method3548(); local19 != null; local19 = arg0.method3551()) {
			method1094(local19);
		}
	}
}
