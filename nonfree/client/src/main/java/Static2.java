import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	public static int anInt53;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_1 = new Class119(55, 8);

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_2 = new Class119(80, 14);

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	public static int anInt51 = 0;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_2 = new Class189("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!kn;")
	public static Class133 aClass133_1 = new Class133(8);

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_3 = new Class119(27, 2);

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString1 = "";

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method9(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static415.anInt6805; local9++) {
			if (arg0.equalsIgnoreCase(Static67.aStringArray10[local9])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static44.aStringArray51[local9])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILclient!ob;IIIILclient!ob;I)V")
	public static void method10(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7_Sub2_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class7_Sub2_Sub3 arg6) {
		@Pc(7) int local7 = arg2.method3510();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class8 local20 = (Class8) Static381.aClass126_64.method3141((long) local7);
		if (local20 == null) {
			@Pc(27) Class264[] local27 = Static464.method5837(Static405.aClass32_82, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static121.aClass172_3.method5542(local27[0]);
			Static381.aClass126_64.method3132((long) local7, local20);
		}
		Static344.method4555(arg4 >> 1, arg6.aByte77, 0, arg6.anInt4321, arg5 >> 1, arg6.anInt4318, arg6.method3499() * 64);
		@Pc(73) int local73 = Static196.anIntArray248[0] + arg1 - 18;
		@Pc(81) int local81 = local73 + arg0 / 4 * 18;
		@Pc(91) int local91 = Static196.anIntArray248[1] + arg3 - 16 - 54;
		@Pc(99) int local99 = local91 + arg0 % 4 * 18;
		local20.method6001(local81, local99);
		if (arg2 == arg6) {
			Static121.aClass172_3.method5503(18, local81 - 1, 18, -256, local99 - 1);
		}
		@Pc(126) Class6_Sub6 local126 = Static168.method2735();
		local126.anInt4898 = local81;
		local126.anInt4896 = local99 + 16;
		local126.anInt4895 = local99;
		local126.aClass7_Sub2_Sub3_1 = arg2;
		local126.anInt4897 = local81 + 16;
		Static399.aClass138_6.method3307(local126);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BII)V")
	public static void method11(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub4_Sub12 local12 = Static393.method5080(0, 15);
		local12.method3248();
		local12.anInt4063 = arg0;
		local12.anInt4060 = arg1;
	}
}
