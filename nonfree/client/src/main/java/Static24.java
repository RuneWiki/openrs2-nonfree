import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!at", name = "ld", descriptor = "Lclient!qv;")
	public static final Class286 aClass286_1 = new Class286();

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IILclient!ha;IIII[[[BIIIII)V")
	public static void method610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg9 == 0 || arg4 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg9 = 1;
			arg5 = arg5 + 1 & 0x3;
		}
		if (arg9 == 10) {
			arg5 = arg5 + 3 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 11) {
			arg5 = arg5 + 3 & 0x3;
			arg9 = 8;
		}
		arg2.Q(arg8, arg11, arg7, arg10, arg1, arg0, arg6[arg9 - 1][arg5], arg4, arg3);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public static void method613() {
		Static517.aClass49_3.method1918();
		Static151.aClass275_3.method7101();
		Static541.aClass245_2.method6499();
		Static27.aClass342_3.method8535();
		Static462.aClass355_2.method8745();
		Static635.aClass336_2.method8422();
		Static195.aClass193_1.method5576();
		Static459.aClass62_2.method2249();
		Static517.aClass284_1.method7408();
		Static581.aClass305_1.method7739();
		Static415.aClass340_1.method8515();
		Static16.aClass237_3.method6467();
		Static361.aClass248_4.method6581();
		Static361.aClass278_1.method7125();
		Static229.aClass70_1.method2498();
		Static227.aClass190_1.method5485();
		Static371.aClass137_1.method4258();
		Static2.aClass277_4.method7113();
		Static527.aClass260_31.method6820();
		Static384.aClass173_1.method5111();
		Static298.aClass307_2.method7790();
		Static102.method2665();
		Static433.method6892();
		Static494.method7665();
		Static244.method4518();
		Static421.method6790();
		Static131.aClass169_22.method5006();
		Static217.aClass169_17.method5006();
		Static40.aClass169_7.method5006();
		Static232.aClass169_31.method5006();
		Static284.aClass169_33.method5006();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)V")
	public static void method626(@OriginalArg(0) int arg0) {
		Static472.anIntArray564 = new int[arg0];
		Static265.anIntArray323 = new int[arg0];
		Static408.anIntArray496 = new int[arg0];
		Static279.anIntArray498 = new int[arg0];
		Static93.anIntArray130 = new int[arg0];
	}
}
