import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!oh", name = "rb", descriptor = "[S")
	public static short[] aShortArray53;

	@OriginalMember(owner = "client!oh", name = "xb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1686 = Static120.method1824("Location");

	@OriginalMember(owner = "client!oh", name = "Db", descriptor = "[B")
	public static final byte[] aByteArray49 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!oh", name = "Jb", descriptor = "[S")
	public static final short[] aShortArray54 = new short[] { 25, 57, 50, 26, 8, 34, 45, 4 };

	@OriginalMember(owner = "client!oh", name = "Rb", descriptor = "I")
	public static int anInt4308 = 0;

	@OriginalMember(owner = "client!oh", name = "oc", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!oh", name = "rc", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1688 = aClass80_1686;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)Lclient!ki;")
	public static Class3_Sub1_Sub10 method3059(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub10 local10 = (Class3_Sub1_Sub10) Static25.aClass5_7.method139((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static98.aClass1_14.method60(Static15.method246(arg0), Static72.method2955(arg0));
		local10 = new Class3_Sub1_Sub10();
		if (local24 != null) {
			local10.method1464(new Class3_Sub17(local24));
		}
		Static25.aClass5_7.method145(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILclient!ve;)V")
	public static void method3062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub5_Sub4_Sub2 arg2) {
		if (arg2.anInt4323 == arg1 && arg1 != -1) {
			@Pc(85) Class3_Sub1_Sub15 local85 = Static148.method2368(arg1);
			@Pc(88) int local88 = local85.anInt3554;
			if (local88 == 1) {
				arg2.anInt4275 = 0;
				arg2.anInt4299 = 0;
				arg2.anInt4286 = arg0;
				arg2.anInt4305 = 0;
				Static75.method1113(arg2.anInt4329, arg2 == Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1, arg2.anInt4275, local85, arg2.anInt4315);
			}
			if (local88 == 2) {
				arg2.anInt4299 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt4323 == -1 || Static148.method2368(arg1).anInt3562 >= Static148.method2368(arg2.anInt4323).anInt3562) {
			arg2.anInt4299 = 0;
			arg2.anInt4323 = arg1;
			arg2.anInt4275 = 0;
			arg2.anInt4291 = arg2.anInt4297;
			arg2.anInt4286 = arg0;
			arg2.anInt4305 = 0;
			if (arg2.anInt4323 == -1) {
				return;
			}
			Static75.method1113(arg2.anInt4329, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1 == arg2, arg2.anInt4275, Static148.method2368(arg2.anInt4323), arg2.anInt4315);
		}
	}
}
