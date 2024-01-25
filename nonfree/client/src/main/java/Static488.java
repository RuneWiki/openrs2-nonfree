import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!so", name = "T", descriptor = "[I")
	public static int[] anIntArray608;

	@OriginalMember(owner = "client!so", name = "Y", descriptor = "[Lclient!st;")
	public static Class313[] aClass313Array1;

	@OriginalMember(owner = "client!so", name = "Q", descriptor = "Lclient!rg;")
	public static final Class285 aClass285_7 = new Class285();

	@OriginalMember(owner = "client!so", name = "S", descriptor = "I")
	public static int anInt7869 = -1;

	@OriginalMember(owner = "client!so", name = "U", descriptor = "J")
	public static long aLong225 = -1L;

	@OriginalMember(owner = "client!so", name = "V", descriptor = "Lclient!te;")
	public static final Class318 aClass318_6 = new Class318("", 11);

	@OriginalMember(owner = "client!so", name = "W", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_16 = new Class158(7, 0, 1, 1);

	@OriginalMember(owner = "client!so", name = "X", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_239 = new Class272(86, 8);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
	public static void method6648() {
		Static270.aClass77_1.method7575();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static134.aLongArray9[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static115.aLongArray7[local24] = 0L;
		}
		Static164.anInt3287 = 0;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(II)Z")
	public static boolean method6649(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
