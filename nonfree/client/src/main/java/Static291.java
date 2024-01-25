import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "Lclient!rk;")
	public static Class180 aClass180_82;

	@OriginalMember(owner = "client!sl", name = "R", descriptor = "Lclient!rk;")
	public static Class180 aClass180_83;

	@OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
	public static int anInt5670 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!cc;)V")
	public static void method4772(@OriginalArg(1) Class22_Sub2_Sub1_Sub1 arg0) {
		@Pc(19) Class7_Sub26 local19 = (Class7_Sub26) Static141.aClass10_24.method163((long) arg0.anInt5115);
		if (local19 == null) {
			return;
		}
		if (local19.aClass7_Sub8_Sub4_1 != null) {
			Static134.aClass7_Sub8_Sub3_2.method3898(local19.aClass7_Sub8_Sub4_1);
			local19.aClass7_Sub8_Sub4_1 = null;
		}
		local19.method5648();
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)V")
	public static void method4774(@OriginalArg(0) int arg0) {
		if (!Static35.aBoolean76) {
			arg0 = -1;
		}
		if (Static206.anInt4120 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(30) Class131 local30 = Static280.method4174(arg0);
			@Pc(34) Class56 local34 = local30.method3413();
			if (local34 == null) {
				arg0 = -1;
			} else {
				Static116.aClass21_4.method389(local34.method1311(), local34.method1316(), new Point(local30.anInt3779, local30.anInt3776), local34.method1306(), Static269.aCanvas4);
				Static206.anInt4120 = arg0;
			}
		}
		if (arg0 == -1 && Static206.anInt4120 != -1) {
			Static116.aClass21_4.method389(-1, -1, new Point(), null, Static269.aCanvas4);
			Static206.anInt4120 = -1;
		}
	}
}
