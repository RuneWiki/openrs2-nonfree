import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_254 = new Class186(46, 5);

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_255 = new Class186(9, -2);

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
	public static int anInt7151 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
	public static void method5516() {
		Static372.method5824();
		Static363.method5030(Static126.aClass67_Sub1_1.aBoolean391);
		Static411.aClass75_2 = Static2.method5388(Static248.aCanvas5, Static89.aClass114_3, 22050, 0);
		Static411.aClass75_2.method5360(Static49.aClass4_Sub18_Sub4_1);
		Static91.aClass75_1 = Static2.method5388(Static248.aCanvas5, Static89.aClass114_3, 2048, 1);
		Static91.aClass75_1.method5360(Static393.aClass4_Sub18_Sub1_1);
	}

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)I")
	public static int method5517() {
		return 16;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIB)V")
	public static void method5518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(40) String local40 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local40);
		Static304.method4192(local40, true);
	}
}
