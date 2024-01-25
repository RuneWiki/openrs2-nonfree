import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!wia;")
	public static Class386 aClass386_115;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!ad;")
	public static final Class7 aClass7_7 = new Class7();

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_161 = new Class44(61, 3);

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_115 = new Class100(75, 4);

	@OriginalMember(owner = "client!se", name = "g", descriptor = "[I")
	public static final int[] anIntArray675 = new int[3];

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt9243 = 0;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "[I")
	public static final int[] anIntArray676 = new int[4096];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)Lclient!eo;")
	public static Class14_Sub19 method7642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class14_Sub19 local13 = null;
		if (arg1 == 0) {
			local13 = Static286.method4081(Static205.aClass394_1, Static548.aClass100_117);
		}
		if (arg1 == 1) {
			local13 = Static286.method4081(Static205.aClass394_1, Static62.aClass100_111);
		}
		local13.aClass14_Sub29_Sub1_1.method5894(arg0 + Static329.anInt6225);
		local13.aClass14_Sub29_Sub1_1.method5871(Static202.anInt3755 + arg2);
		local13.aClass14_Sub29_Sub1_1.method5854(Static68.aClass65_1.method1565(82) ? 1 : 0);
		Static378.aBoolean496 = false;
		Static659.anInt10975 = arg0;
		Static35.anInt964 = arg2;
		Static592.method1599();
		return local13;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7643(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
