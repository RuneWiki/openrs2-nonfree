import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public static int anInt3872;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	public static int anInt3866 = 0;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public static int anInt3867 = 0;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1108 = Static81.method1507("rot:");

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1109 = Static81.method1507("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1110 = Static81.method1507("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1111 = Static81.method1507("; Expires=");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "[Lclient!lj;")
	public static final Class61[] aClass61Array6 = new Class61[500];

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1112 = Static81.method1507("<col=00ffff>");

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!rd;)V")
	public static void method2987(@OriginalArg(1) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub9_5 != null) {
			arg0.aClass1_Sub9_5.anInt4137 = 0;
		}
		arg0.aBoolean170 = false;
		for (@Pc(25) Class1_Sub3 local25 = arg0.method2854(); local25 != null; local25 = arg0.method2860()) {
			method2987(local25);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIB)V")
	public static void method2988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static2.anInt111 = Static146.anInt3124 * arg3 / arg0;
		Static3.anInt118 = arg1 * Static189.anInt4212 / arg2;
		Static49.anInt1247 = -1;
		Static70.anInt3208 = -1;
		Static137.method2410();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!vc;)Lclient!vc;")
	public static Class98 method2989(@OriginalArg(1) Class98 arg0) {
		@Pc(9) int local9 = Static93.method1678(Static105.method1831(arg0));
		if (local9 == 0) {
			return null;
		}
		for (@Pc(15) int local15 = 0; local15 < local9; local15++) {
			arg0 = Static188.method3229(arg0.anInt4424);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBJ[I)Lclient!dj;")
	public static Class24 method2990(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == 0) {
			@Pc(19) Class1_Sub2_Sub1 local19 = Static208.method3517(arg2[0]);
			return local19.method90((int) arg1);
		} else if (arg0 == 1) {
			@Pc(35) Class1_Sub2_Sub23 local35 = Static168.method2886((int) arg1);
			return local35.aClass24_1214;
		} else if (arg0 == 5) {
			return Static35.method3219(arg1).method761();
		} else if (arg0 == 6) {
			return Static208.method3517(arg2[0]).method90((int) arg1);
		} else {
			return Static158.method2688(arg1);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)I")
	public static int method2991(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!dj;")
	public static Class24 method2993(@OriginalArg(0) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class24 local18 = new Class24();
		local18.anInt1084 = 0;
		local18.aByteArray13 = local9;
		for (@Pc(26) int local26 = 0; local26 < local9.length; local26++) {
			if (local9[local26] != 0) {
				local9[local18.anInt1084++] = local9[local26];
			}
		}
		return local18;
	}
}
