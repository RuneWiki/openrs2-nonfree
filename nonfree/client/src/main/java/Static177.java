import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!it", name = "J", descriptor = "I")
	public static int anInt3316 = 1;

	@OriginalMember(owner = "client!it", name = "L", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_73 = new Class254(25, 3);

	@OriginalMember(owner = "client!it", name = "W", descriptor = "I")
	public static int anInt3327 = 0;

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
	public static void method2858() {
		for (@Pc(10) Class1_Sub3 local10 = (Class1_Sub3) Static251.aClass142_26.method3199(); local10 != null; local10 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
			if (Static196.method3041(local10.anInt227)) {
				Static424.method5716(local10);
			}
		}
		if (Static119.anInt2296 == 1) {
			Static378.aBoolean549 = false;
			Static176.method2836(Static423.anInt7379, Static256.anInt4398, Static102.anInt1978, Static369.anInt6690);
			return;
		}
		Static176.method2836(Static423.anInt7379, Static256.anInt4398, Static102.anInt1978, Static369.anInt6690);
		@Pc(50) int local50 = Static126.aClass62_6.method1157(Static357.aClass96_98.method1935(Static389.anInt7061));
		for (@Pc(55) Class1_Sub3 local55 = (Class1_Sub3) Static251.aClass142_26.method3199(); local55 != null; local55 = (Class1_Sub3) Static251.aClass142_26.method3198()) {
			@Pc(61) int local61 = Static19.method244(local55);
			if (local50 < local61) {
				local50 = local61;
			}
		}
		Static102.anInt1978 = local50 + 8;
		Static369.anInt6690 = Static119.anInt2296 * 16 + (Static264.aBoolean355 ? 26 : 22);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBZIIZI)V")
	public static void method2859(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg5 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg5 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) Class48_Sub1 local20 = Static4.aClass48_Sub1Array1[local14];
		Static4.aClass48_Sub1Array1[local14] = Static4.aClass48_Sub1Array1[arg5];
		Static4.aClass48_Sub1Array1[arg5] = local20;
		for (@Pc(32) int local32 = arg2; local32 < arg5; local32++) {
			if (Static361.method5153(arg1, arg4, Static4.aClass48_Sub1Array1[local32], arg0, local20, arg3) <= 0) {
				@Pc(49) Class48_Sub1 local49 = Static4.aClass48_Sub1Array1[local32];
				Static4.aClass48_Sub1Array1[local32] = Static4.aClass48_Sub1Array1[local16];
				Static4.aClass48_Sub1Array1[local16++] = local49;
			}
		}
		Static4.aClass48_Sub1Array1[arg5] = Static4.aClass48_Sub1Array1[local16];
		Static4.aClass48_Sub1Array1[local16] = local20;
		method2859(arg0, arg1, arg2, arg3, arg4, local16 - 1);
		method2859(arg0, arg1, local16 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "(I)Z")
	public static boolean method2860() {
		return Static404.aBoolean594;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(III)I")
	public static int method2861(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static82.anIntArray72[arg0 & 0x3] : Static341.anIntArray452[arg0 & 0x3];
	}
}
