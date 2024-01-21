import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array1;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static int anInt615;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
	public static int[] anIntArray44;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!s;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
	public static int anInt614 = 0;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Z")
	public static boolean aBoolean20 = true;

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!ea;")
	public static Class18 aClass18_192 = Static8.method128("p12_full");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)I")
	public static int method378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(22) int local22 = arg1 / arg2;
		@Pc(28) int local28 = arg2 - 1 & arg1;
		@Pc(33) int local33 = Static12.method3140(local22, local3);
		@Pc(40) int local40 = Static12.method3140(local22, local3 + 1);
		@Pc(47) int local47 = Static12.method3140(local22 + 1, local3);
		@Pc(56) int local56 = Static12.method3140(local22 + 1, local3 + 1);
		@Pc(63) int local63 = Static172.method3133(local40, arg2, local13, local33);
		@Pc(70) int local70 = Static172.method3133(local56, arg2, local13, local47);
		return Static172.method3133(local70, arg2, local28, local63);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method379() {
		aByteArrayArray4 = null;
		aClass1_Sub1_Sub8_Sub1Array1 = null;
		aClass18_192 = null;
		aClass69_1 = null;
		anIntArray44 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)I")
	public static int method380(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}
}
