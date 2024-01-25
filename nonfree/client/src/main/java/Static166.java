import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "[I")
	public static int[] anIntArray217;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public static int anInt3311;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public static int anInt3314;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public static int anInt3310 = 0;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
	public static int anInt3315 = 100;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "[I")
	public static final int[] anIntArray218 = new int[1000];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V")
	public static void method2686(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static114.aByteArrayArray18;
		} else {
			local9 = Static311.aByteArrayArray6;
		}
		@Pc(20) int local20 = Static178.aByteArrayArray25.length;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = local9[local22];
			if (local28 != null) {
				@Pc(40) int local40 = (Static157.anIntArray201[local22] >> 8) * 64 - Static182.anInt3662;
				@Pc(51) int local51 = (Static157.anIntArray201[local22] & 0xFF) * 64 - Static169.anInt6312;
				Static168.method2723();
				Static325.method1027(arg0, local51, Static107.aClass129_4, Static211.aClass92Array1, local40, local28);
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!ko;)V")
	public static void method2687(@OriginalArg(1) Class118 arg0) {
		Static37.anInt693 = 3;
		Static195.method3970(true);
		Static347.aBoolean422 = true;
		Static210.aBoolean289 = true;
		Static52.aBoolean313 = true;
		Static82.anInt1504 = 0;
		Static117.aBoolean145 = true;
		Static147.aBoolean182 = true;
		Static17.anInt285 = 0;
		Static107.aBoolean127 = true;
		Static249.anInt4975 = 255;
		Static326.anInt5865 = 127;
		Static285.anInt5644 = 0;
		Static54.anInt1026 = 1;
		Static39.aBoolean43 = true;
		Static289.anInt5719 = 127;
		Static103.anInt1883 = 2;
		Static9.anInt151 = 0;
		Static190.aBoolean248 = true;
		Static36.aBoolean36 = true;
		Static280.aBoolean11 = true;
		if (Static355.anInt6753 < 96) {
			Static3.method14(0);
		} else {
			Static3.method14(2);
		}
		Static344.anInt6591 = 0;
		Static279.aBoolean362 = false;
		Static276.anInt5525 = 2;
		Static210.aBoolean290 = false;
		Static104.anInt1926 = 0;
		Static193.aBoolean250 = false;
		Static55.aBoolean65 = true;
		Static79.aBoolean341 = true;
		Static150.anInt2727 = Static340.anInt5690 == 1 ? 2 : 4;
		Static70.anInt1316 = 2;
		@Pc(86) Class113 local86 = null;
		try {
			@Pc(90) Class2 local90 = arg0.method2702();
			while (local90.anInt6 == 0) {
				Static244.method4311(1L);
			}
			if (local90.anInt6 == 1) {
				local86 = (Class113) local90.anObject1;
				@Pc(115) byte[] local115 = new byte[(int) local86.method2306()];
				@Pc(129) int local129;
				for (@Pc(117) int local117 = 0; local117 < local115.length; local117 += local129) {
					local129 = local86.method2305(local117, local115, local115.length - local117);
					if (local129 == -1) {
						throw new IOException("EOF");
					}
				}
				Static100.method1481(new Class11_Sub25(local115));
			}
		} catch (@Pc(154) Exception local154) {
		}
		try {
			if (local86 != null) {
				local86.method2307();
			}
		} catch (@Pc(161) Exception local161) {
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)Lclient!ms;")
	public static Class137 method2688(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static188.aClass137ArrayArray1[local12] == null || Static188.aClass137ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static257.method4460(local12);
			if (!local30) {
				return null;
			}
		}
		return Static188.aClass137ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method2689(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static16.method219(arg0, arg0.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method2690(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BZ)V")
	public static void method2691(@OriginalArg(0) byte arg0) {
		if (Static247.aByteArrayArrayArray9 == null) {
			Static247.aByteArrayArrayArray9 = new byte[4][Static24.anInt454][Static240.anInt4832];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static24.anInt454; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static240.anInt4832; local27++) {
					Static247.aByteArrayArrayArray9[local19][local23][local27] = arg0;
				}
			}
		}
	}
}
