import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
	public static int anInt7239;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "Lclient!fc;")
	public static Class93 aClass93_6;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	public static int anInt7235 = 0;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public static final int anInt7237 = Static77.method7407(1600);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)I")
	public static int method5818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg4;
			arg4 = local10;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return 7 + 1 - arg1 - arg5;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg3;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
	public static void method5819() {
		@Pc(10) int local10 = Static86.aClass1_Sub30_Sub1_1.method5033(Static286.anInt5239);
		if (local10 == 0) {
			Static368.aByteArrayArrayArray12 = null;
			Static326.method3972(0);
		} else if (local10 == 1) {
			Static559.method7554((byte) 0);
			Static326.method3972(512);
			if (Static85.aByteArrayArrayArray1 != null) {
				Static246.method3619();
			}
		} else {
			Static559.method7554((byte) (Static450.anInt7909 - 4 & 0xFF));
			Static326.method3972(2);
		}
		Static443.anInt7825 = Static240.anInt4414;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
	public static void method5820() {
		for (@Pc(1) int local1 = 0; local1 < Static435.anInt7764; local1++) {
			@Pc(6) Class11_Sub1_Sub1 local6 = Static299.aClass11_Sub1_Sub1Array1[local1];
			Static60.method1000(local6, true);
			Static299.aClass11_Sub1_Sub1Array1[local1] = null;
		}
		Static435.anInt7764 = 0;
	}
}
