import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "[Lclient!kf;")
	public static final Class55[] aClass55Array1 = new Class55[50];

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
	public static final int anInt3967 = 0;

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "Lclient!qb;")
	public static final Class84 aClass84_21 = new Class84(5);

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "I")
	public static int anInt3970 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBII)I")
	public static int method3005(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
	public static void method3006() {
		for (@Pc(1) int local1 = 0; local1 < Static21.anInt4192; local1++) {
			@Pc(6) Class43 local6 = Static215.aClass43Array3[local1];
			Static191.method2851(local6);
			Static215.aClass43Array3[local1] = null;
		}
		Static21.anInt4192 = 0;
	}

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
	public static void method3007() {
		if (!Static28.aBoolean32) {
			return;
		}
		@Pc(15) Class69 local15 = Static201.method1363(Static14.anInt301, Static133.anInt2781);
		if (local15 != null && local15.anObjectArray7 != null) {
			@Pc(24) Class5_Sub10 local24 = new Class5_Sub10();
			local24.anObjectArray3 = local15.anObjectArray7;
			local24.aClass69_3 = local15;
			Static184.method2781(local24);
		}
		Static28.aBoolean32 = false;
		Static184.method2779(local15);
	}
}
