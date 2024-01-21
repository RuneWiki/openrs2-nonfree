import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString5;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_17;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
	public static int anInt2361;

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1056 = Static187.method3089("mapscene");

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	public static int anInt2357 = 0;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1057 = Static187.method3089("(U1");

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "[Lclient!vd;")
	public static final Class92[] aClass92Array16 = new Class92[200];

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[S")
	public static final short[] aShortArray19 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
	public static int anInt2362 = 0;

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	public static void method1643() {
		Static65.aBoolean45 = false;
		Static111.aBoolean141 = false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!vd;BLclient!ab;Lclient!vd;)[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] method1644(@OriginalArg(0) Class92 arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(10) int local10 = arg1.method3246(arg0);
		@Pc(25) int local25 = arg1.method3262(arg2, local10);
		return Static183.method2955(arg1, local25, local10);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1645(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static156.aClass9_1);
		arg0.addMouseMotionListener(Static156.aClass9_1);
		arg0.addFocusListener(Static156.aClass9_1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!re;IIZII)V")
	public static void method1646(@OriginalArg(0) Class1_Sub3_Sub20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static45.anInt1163 >= 50 || (arg0.anIntArray299 == null || arg0.anIntArray299.length <= arg1)) {
			return;
		}
		@Pc(23) int local23 = arg0.anIntArray299[arg1];
		if (local23 == 0) {
			return;
		}
		@Pc(33) int local33 = local23 >> 8;
		@Pc(37) int local37 = local23 & 0xF;
		@Pc(43) int local43 = local23 >> 4 & 0x7;
		if (local37 == 0) {
			if (arg2) {
				Static173.method2740(0, local43, local33);
			}
		} else if (Static185.anInt3997 != 0) {
			Static110.anIntArray177[Static45.anInt1163] = local33;
			Static105.anIntArray172[Static45.anInt1163] = local43;
			Static87.anIntArray158[Static45.anInt1163] = 0;
			Static82.aClass4Array1[Static45.anInt1163] = null;
			@Pc(81) int local81 = (arg3 - 64) / 128;
			@Pc(92) int local92 = (arg4 - 64) / 128;
			Static63.anIntArray307[Static45.anInt1163] = local37 + (local81 << 16) + (local92 << 8);
			Static45.anInt1163++;
		}
	}
}
