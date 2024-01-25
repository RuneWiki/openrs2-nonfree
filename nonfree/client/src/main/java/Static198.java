import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!qk;")
	public static Class288 aClass288_282;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
	public static int anInt8166;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	public static int anInt8168;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_107 = new Class179(14, 7);

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_283 = new Class288(72, 0);

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	public static int anInt8167 = -1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)[B")
	public static byte[] method6948(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub7 local12 = (Class2_Sub2_Sub7) Static390.aClass47_2.method912((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
				@Pc(45) int local45 = 255 - local38;
				@Pc(50) int local50 = Static239.method3351(local45, local23);
				@Pc(54) byte local54 = local17[local50];
				local17[local50] = local17[local45];
				local17[local45] = local17[511 - local38] = local54;
			}
			local12 = new Class2_Sub2_Sub7(local17);
			Static390.aClass47_2.method915((long) arg0, local12);
		}
		return local12.aByteArray30;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!d;IIILclient!wu;)Lclient!ha;")
	public static synchronized Class95 method6999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Interface6 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class380 arg6) {
		if (arg0 == 0) {
			return Static418.method5592(arg5, arg3, arg2, arg1);
		} else if (arg0 == 2) {
			return Static132.method1834(arg2, arg1, arg3, arg5);
		} else if (arg0 == 1) {
			return Static620.method8306(arg2, arg4, arg3);
		} else if (arg0 == 5) {
			return Static150.method2240(arg2, arg6, arg4, arg3);
		} else if (arg0 == 3) {
			return Static649.method2802(arg3, arg4, arg2, arg6);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
	public static int method7009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static106.method1602(arg0 - 1, arg1 + -1) + Static106.method1602(arg0 + 1, arg1 + -1) + Static106.method1602(arg0 + -1, arg1 + 1) + Static106.method1602(arg0 - -1, arg1 - -1);
		@Pc(78) int local78 = Static106.method1602(arg0 - 1, arg1) + Static106.method1602(arg0 + 1, arg1) + Static106.method1602(arg0, arg1 - 1) + Static106.method1602(arg0, arg1 - -1);
		@Pc(83) int local83 = Static106.method1602(arg0, arg1);
		return local78 / 8 + local48 / 16 + local83 / 4;
	}
}
