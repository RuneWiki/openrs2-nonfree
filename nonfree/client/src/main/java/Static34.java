import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
	public static int anInt651;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!nm;")
	public static Class119 aClass119_13;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!qh;")
	public static Class1_Sub5_Sub18 aClass1_Sub5_Sub18_2;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "S")
	public static short aShort14 = 320;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!ui;")
	public static Class175 aClass175_7 = new Class175(64);

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	public static int anInt655 = 0;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString26 = "Examine";

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	public static int anInt656 = 5063219;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)I")
	public static int method604(@OriginalArg(1) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 >= 0) {
			return 0;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method605(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static85.anInt1869 > 0) {
			local16 = Static229.aByteArrayArray20[--Static85.anInt1869];
			Static229.aByteArrayArray20[Static85.anInt1869] = null;
			return local16;
		} else if (arg0 == 5000 && Static234.anInt4385 > 0) {
			local16 = Static230.aByteArrayArray18[--Static234.anInt4385];
			Static230.aByteArrayArray18[Static234.anInt4385] = null;
			return local16;
		} else if (arg0 == 30000 && Static187.anInt3580 > 0) {
			local16 = Static51.aByteArrayArray3[--Static187.anInt3580];
			Static51.aByteArrayArray3[Static187.anInt3580] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method606() {
		Static165.method4612(0, 0);
	}
}
