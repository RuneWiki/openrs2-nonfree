import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	public static int anInt3972;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_16;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 aClass1_Sub1_Sub12_Sub1_6;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "J")
	public static long aLong125;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Lclient!ff;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_3 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
	public static int anInt3980 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
	public static boolean method2798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class1_Sub1_Sub3 local11 = Static84.method3155(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local11.method380(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public static void method2799() {
		aClass30_Sub1_16 = null;
		aClass1_Sub8_Sub1_3 = null;
		aClass1_Sub1_Sub12_Sub1_6 = null;
	}
}
