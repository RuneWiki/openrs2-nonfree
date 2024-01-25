import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!qs;")
	public static Class211 aClass211_31;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!pu;")
	public static final Class203 aClass203_13 = new Class203();

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "[B")
	public static final byte[] aByteArray35 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BILclient!p;II)V")
	public static void method1801(@OriginalArg(1) int arg0, @OriginalArg(2) Class192 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(13) Class1_Sub22 local13 = (Class1_Sub22) Static30.aClass203_4.method4548(); local13 != null; local13 = (Class1_Sub22) Static30.aClass203_4.method4545()) {
			if (local13.anInt3796 == arg2 && local13.anInt3790 == arg0 << 7 && arg3 << 7 == local13.anInt3803 && local13.aClass192_1.anInt5642 == arg1.anInt5642) {
				if (local13.aClass1_Sub19_Sub4_3 != null) {
					Static12.aClass1_Sub19_Sub2_1.method3181(local13.aClass1_Sub19_Sub4_3);
					local13.aClass1_Sub19_Sub4_3 = null;
				}
				if (local13.aClass1_Sub19_Sub4_4 != null) {
					Static12.aClass1_Sub19_Sub2_1.method3181(local13.aClass1_Sub19_Sub4_4);
					local13.aClass1_Sub19_Sub4_4 = null;
				}
				local13.method6178();
				return;
			}
		}
	}
}
