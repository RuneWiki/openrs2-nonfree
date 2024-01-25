import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "[I")
	public static int[] anIntArray187 = new int[2];

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
	public static int anInt3213 = 0;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_15 = new Class326(20);

	@OriginalMember(owner = "client!gv", name = "l", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_88 = new Class81(113, 2);

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
	public static int anInt3214 = 0;

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "[I")
	public static final int[] anIntArray188 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!gv", name = "o", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_89 = new Class81(116, 6);

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!tc;IIII)V")
	public static void method2714(@OriginalArg(0) Class306 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) Class1_Sub30 local8 = (Class1_Sub30) Static201.aClass361_70.method7854(); local8 != null; local8 = (Class1_Sub30) Static201.aClass361_70.method7853()) {
			if (local8.anInt5880 == arg2 && local8.anInt5891 == arg3 << 9 && arg1 << 9 == local8.anInt5885 && arg0.anInt8416 == local8.aClass306_1.anInt8416) {
				if (local8.aClass1_Sub8_Sub1_4 != null) {
					Static298.aClass1_Sub8_Sub4_2.method6033(local8.aClass1_Sub8_Sub1_4);
					local8.aClass1_Sub8_Sub1_4 = null;
				}
				if (local8.aClass1_Sub8_Sub1_3 != null) {
					Static298.aClass1_Sub8_Sub4_2.method6033(local8.aClass1_Sub8_Sub1_3);
					local8.aClass1_Sub8_Sub1_3 = null;
				}
				local8.method7878();
				return;
			}
		}
	}
}
