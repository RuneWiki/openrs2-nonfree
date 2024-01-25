import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!vg;")
	public static final Class204 aClass204_1 = new Class204();

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "[I")
	public static final int[] anIntArray326 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!kh;B)Lclient!ul;")
	public static Class27_Sub4 method3691(@OriginalArg(0) Class11_Sub25 arg0) {
		return new Class27_Sub4(arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5220(), arg0.method5221(), arg0.method5221(), arg0.method5185());
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)Lclient!mh;")
	public static Class131 method3694(@OriginalArg(1) int arg0) {
		@Pc(10) Class131 local10 = (Class131) Static114.aClass26_19.method332((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static309.aClass144_99.method3896(arg0, 33);
		local10 = new Class131();
		if (local20 != null) {
			local10.method3519(arg0, new Class11_Sub25(local20));
		}
		Static114.aClass26_19.method330((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IZ)Z")
	public static boolean method3695(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static107.aClass129_4.method5020();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static107.aClass129_4.method4968();
		} else if (!Static107.aClass129_4.method4954()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static193.aBoolean250 = arg0;
			Static38.method553(Static77.aClass118_7);
			return true;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!ms;I)I")
	public static int method3696(@OriginalArg(0) int arg0, @OriginalArg(1) Class137 arg1) {
		if (!Static42.method634(arg1).method4733(arg0) && arg1.anObjectArray16 == null) {
			return -1;
		} else if (arg1.anIntArray312 == null || arg0 >= arg1.anIntArray312.length) {
			return -1;
		} else {
			return arg1.anIntArray312[arg0];
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ms;III)V")
	public static void method3697(@OriginalArg(0) Class137 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class66 local8 = arg0.method3609(Static107.aClass129_4);
		if (local8 == null) {
			return;
		}
		Static107.aClass129_4.method4952(arg2, arg1, arg0.anInt4060 + arg2, arg0.anInt4110 + arg1);
		if (Static9.anInt153 >= 3) {
			Static107.aClass129_4.method4970(local8, arg2, arg1);
		} else {
			Static269.aClass97_18.method5554((float) arg2 + (float) arg0.anInt4060 / 2.0F, (float) arg0.anInt4110 / 2.0F + (float) arg1, ((int) -Static246.aFloat51 & 0x3FFF) << 2, local8, arg2, arg1);
		}
	}
}
