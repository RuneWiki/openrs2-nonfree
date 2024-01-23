import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public static int anInt543;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	public static int anInt544;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_204 = Static186.method3527("Fps:");

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!hh;")
	private static Class50 aClass50_205 = Static186.method3527("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
	public static int[] anIntArray56 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!hh;")
	public static Class50 aClass50_206 = aClass50_205;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	public static int anInt546 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method395(@OriginalArg(0) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static138.anInt2810 > 0) {
			local24 = Static229.aByteArrayArray13[--Static138.anInt2810];
			Static229.aByteArrayArray13[Static138.anInt2810] = null;
			return local24;
		} else if (arg0 == 5000 && Static64.anInt1283 > 0) {
			local24 = Static131.aByteArrayArray8[--Static64.anInt1283];
			Static131.aByteArrayArray8[Static64.anInt1283] = null;
			return local24;
		} else if (arg0 == 30000 && Static129.anInt2544 > 0) {
			local24 = Static219.aByteArrayArray9[--Static129.anInt2544];
			Static219.aByteArrayArray9[Static129.anInt2544] = null;
			return local24;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Lclient!k;")
	public static Class61 method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass61_1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZII)I")
	public static int method397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class1_Sub14 local17 = (Class1_Sub14) Static57.aClass90_8.method2819((long) arg0);
		if (local17 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local17.anIntArray140.length) {
			return local17.anIntArray140[arg1];
		} else {
			return 0;
		}
	}
}
