import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
	public static int anInt6730;

	@OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
	public static int anInt6732;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "[I")
	public static final int[] anIntArray657 = new int[5];

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	public static int anInt6720 = 0;

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
	public static int anInt6726 = -1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI[B)V")
	public static void method5272(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static266.aClass10_Sub8_10 == null) {
			Static266.aClass10_Sub8_10 = new Class10_Sub8(20000);
		}
		Static266.aClass10_Sub8_10.method2457(arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static65.method1084(Static266.aClass10_Sub8_10.aByteArray44);
		Static264.aClass56_Sub1Array1 = new Class56_Sub1[Static70.anInt1480];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = Static42.anInt723; local35 <= Static266.anInt4717; local35++) {
			@Pc(41) Class56_Sub1 local41 = Static29.method430(local35);
			if (local41 != null) {
				Static264.aClass56_Sub1Array1[local33++] = local41;
			}
		}
		Static361.aBoolean397 = false;
		Static57.aLong39 = Static220.method3314();
		Static266.aClass10_Sub8_10 = null;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V")
	public static void method5273(@OriginalArg(0) int arg0) {
		if (Static267.anIntArray463 == null || arg0 > Static267.anIntArray463.length) {
			Static267.anIntArray463 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(III)Lclient!gh;")
	public static Class89 method5275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class89 local7 = Static40.method557(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass89Array1 == null || local7.aClass89Array1.length <= arg0) {
			return null;
		} else {
			return local7.aClass89Array1[arg0];
		}
	}
}
