import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_92 = new Class180(107, 4);

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_5 = new Class228(15, 0, 1, 0);

	@OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
	public static int anInt4294 = 0;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!or;II)V")
	public static void method3910(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray3 != null) {
			@Pc(13) Class3_Sub17 local13 = new Class3_Sub17();
			local13.aClass260_6 = arg1;
			local13.anObjectArray2 = arg1.anObjectArray3;
			Static565.method8015(local13);
		}
		Static287.anInt4913 = arg1.anInt6985;
		Static531.anInt8767 = arg1.anInt6930;
		Static173.anInt3449 = arg2;
		Static658.anInt10730 = arg1.anInt6964;
		Static311.anInt5146 = arg0;
		Static624.aBoolean698 = true;
		Static463.anInt7620 = arg1.anInt6978;
		Static21.anInt510 = arg1.anInt6981;
		Static456.method8151(arg1);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!bba;II)V")
	public static void method3913(@OriginalArg(0) Class28_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.lb == null) {
			return;
		}
		@Pc(9) int local9 = arg0.lb[arg1 + 1];
		if (local9 == arg0.anInt10773) {
			return;
		}
		arg0.anInt10773 = local9;
		arg0.anInt10814 = arg0.anInt10812;
		arg0.anInt10767 = 0;
		arg0.anInt10750 = 0;
		arg0.anInt10758 = 0;
		arg0.anInt10804 = 1;
		if (arg0.anInt10773 != -1) {
			Static548.method7844(arg0, Static243.aClass343_3.method8356(arg0.anInt10773), arg0.anInt10750);
		}
	}
}
