import java.awt.Component;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public static int anInt301 = 0;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!di;")
	public static final Class23 aClass23_1 = new Class23();

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_130 = Static193.method3027(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "[I")
	public static final int[] anIntArray24 = new int[25];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)Lclient!oc;")
	public static Class70 method251(@OriginalArg(1) String arg0) {
		@Pc(9) byte[] local9;
		try {
			local9 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(11) UnsupportedEncodingException local11) {
			local9 = arg0.getBytes();
		}
		@Pc(18) Class70 local18 = new Class70();
		local18.anInt2899 = 0;
		local18.aByteArray30 = local9;
		for (@Pc(31) int local31 = 0; local31 < local9.length; local31++) {
			if (local9[local31] != 0) {
				local9[local18.anInt2899++] = local9[local31];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)I")
	public static int method253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22 = 65536 - Class3_Sub3_Sub2_Sub5.anIntArray303[arg1 * 1024 / arg3] >> 1;
		return ((65536 - local22) * arg0 >> 16) + (arg2 * local22 >> 16);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lclient!nd;")
	public static Class3_Sub3_Sub17 method254(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3_Sub17 local10 = (Class3_Sub3_Sub17) Static114.aClass85_23.method2558((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static18.aClass52_6.method1581(Static133.method1865(arg0), Static122.method1752(arg0));
		local10 = new Class3_Sub3_Sub17();
		if (local24 != null) {
			local10.method1927(new Class3_Sub4(local24));
		}
		local10.method1925();
		Static114.aClass85_23.method2560(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public static void method255(@OriginalArg(1) int arg0) {
		Static90.anInt1789 = 50;
		Static98.anInt2025 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!df;")
	public static Class22 method256(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(12) Class local12 = Class.forName("Class22_Sub2");
			@Pc(16) Class22 local16 = (Class22) local12.getDeclaredConstructor().newInstance();
			local16.method2337(arg0, arg2, arg1);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class22_Sub1 local29 = new Class22_Sub1();
			local29.method2337(arg0, arg2, arg1);
			return local29;
		}
	}
}
