import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array19 = new Class60[1000];

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "[I")
	public static int[] anIntArray358 = new int[2000];

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "Lclient!kh;")
	public static Class60 aClass60_951 = Static200.method3116("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!kh;")
	private static Class60 aClass60_953 = Static200.method3116("Select");

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_952 = aClass60_953;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_954 = Static200.method3116("Null");

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILclient!nc;)Lclient!kh;")
	public static Class60 method2126(@OriginalArg(2) Class1_Sub9 arg0) {
		try {
			@Pc(15) Class60 local15 = new Class60();
			local15.anInt2439 = arg0.method900();
			if (local15.anInt2439 > 32767) {
				local15.anInt2439 = 32767;
			}
			local15.aByteArray34 = new byte[local15.anInt2439];
			arg0.anInt1192 += Static10.aClass101_1.method3120(local15.aByteArray34, local15.anInt2439, arg0.anInt1192, arg0.aByteArray20, 0);
			return local15;
		} catch (@Pc(52) Exception local52) {
			return Static59.aClass60_457;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public static void method2128() {
		if (Static4.anInt99 > 0) {
			Static189.method2975();
		} else {
			Static85.method1486(40);
			Static97.aClass55_2 = Static184.aClass55_3;
			Static184.aClass55_3 = null;
		}
	}
}
