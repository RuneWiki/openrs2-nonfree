import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ph", name = "I", descriptor = "Lclient!pa;")
	public static Class86 aClass86_62;

	@OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
	public static int anInt3404;

	@OriginalMember(owner = "client!ph", name = "N", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_32;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "Lclient!oj;")
	public static Class84 aClass84_29 = new Class84(64);

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
	public static int anInt3403 = 0;

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1110 = Static186.method3527("Location");

	@OriginalMember(owner = "client!ph", name = "M", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1111 = Static186.method3527("Untersuchen");

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1112 = aClass50_1110;

	@OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
	public static int anInt3405 = 0;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1 method2741() {
		@Pc(13) int local13 = Static8.anIntArray20[0] * Static101.anIntArray191[0];
		@Pc(25) byte[] local25 = Static191.aByteArrayArray11[0];
		@Pc(85) Class1_Sub1_Sub8_Sub1 local85;
		if (Static165.aBooleanArray12[0]) {
			@Pc(33) byte[] local33 = Static37.aByteArrayArray2[0];
			@Pc(36) int[] local36 = new int[local13];
			for (@Pc(38) int local38 = 0; local38 < local13; local38++) {
				local36[local38] = (local33[local38] & 0xFF) << 24 | Static78.anIntArray127[local25[local38] & 0xFF];
			}
			local85 = new Class1_Sub1_Sub8_Sub1_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[0], Static228.anIntArray507[0], Static8.anIntArray20[0], Static101.anIntArray191[0], local36);
		} else {
			@Pc(90) int[] local90 = new int[local13];
			for (@Pc(92) int local92 = 0; local92 < local13; local92++) {
				local90[local92] = Static78.anIntArray127[local25[local92] & 0xFF];
			}
			local85 = new Class1_Sub1_Sub8_Sub1(Static204.anInt4108, Static146.anInt3070, Static169.anIntArray370[0], Static228.anIntArray507[0], Static8.anIntArray20[0], Static101.anIntArray191[0], local90);
		}
		Static216.method3375();
		return local85;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)Z")
	public static boolean method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static42.method676(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static120.method1907(local10 + 1, Static119.anIntArrayArrayArray10[arg0][arg1][arg2] + arg3, local14 + 1) && Static120.method1907(local10 + 128 - 1, Static119.anIntArrayArrayArray10[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static120.method1907(local10 + 128 - 1, Static119.anIntArrayArrayArray10[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static120.method1907(local10 + 1, Static119.anIntArrayArrayArray10[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
