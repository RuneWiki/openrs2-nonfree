import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public static int anInt4703;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
	public static int anInt4704;

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "Lclient!dh;")
	public static Class1_Sub10 aClass1_Sub10_6;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray107 = new boolean[100];

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!dh;)I")
	public static int method3711(@OriginalArg(1) Class1_Sub10 arg0) {
		@Pc(19) String local19 = Static95.method5204(arg0);
		@Pc(21) int[] local21 = null;
		if (Static189.method2734(arg0.anInt1057)) {
			local21 = Static285.aClass226_2.method4788((int) arg0.aLong31).anIntArray274;
		} else if (arg0.anInt1050 != -1) {
			local21 = Static285.aClass226_2.method4788(arg0.anInt1050).anIntArray274;
		} else if (Static463.method5977(arg0.anInt1057)) {
			@Pc(98) Class1_Sub44 local98 = (Class1_Sub44) Static46.aClass208_33.method4405((long) arg0.aLong31);
			if (local98 != null) {
				@Pc(103) Class11_Sub1_Sub3_Sub1 local103 = local98.aClass11_Sub1_Sub3_Sub1_2;
				@Pc(106) Class272 local106 = local103.aClass272_1;
				if (local106.anIntArray543 != null) {
					local106 = local106.method5900(Static32.aClass4_1);
				}
				if (local106 != null) {
					local21 = local106.anIntArray542;
				}
			}
		} else if (Static319.method4209(arg0.anInt1057)) {
			@Pc(67) Class87 local67;
			if (arg0.anInt1057 == 1002) {
				local67 = Static86.aClass248_7.method5246((int) arg0.aLong31);
			} else {
				local67 = Static86.aClass248_7.method5246((int) (arg0.aLong31 >>> 32 & 0x7FFFFFFFL));
			}
			if (local67.anIntArray170 != null) {
				local67 = local67.method1571(Static32.aClass4_1);
			}
			if (local67 != null) {
				local21 = local67.anIntArray168;
			}
		}
		if (local21 != null) {
			local19 = local19 + Static237.method3379(local21);
		}
		@Pc(146) int local146 = Static15.aClass252_5.method5295(local19, Static91.aClass85Array5);
		if (arg0.aBoolean131) {
			local146 += Static51.aClass85_6.YA() + 4;
		}
		return local146;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method3716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static145.method1820(arg2, arg5, arg4, arg3, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!cv;I)V")
	public static void method3719(@OriginalArg(0) Class1_Sub9 arg0) {
		if (arg0.aClass1_Sub8_5 != null) {
			arg0.aClass1_Sub8_5.anInt752 = 0;
		}
		arg0.aBoolean550 = false;
		for (@Pc(26) Class1_Sub9 local26 = arg0.method5013(); local26 != null; local26 = arg0.method5014()) {
			method3719(local26);
		}
	}
}
