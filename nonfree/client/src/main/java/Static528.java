import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray9;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "[I")
	public static int[] anIntArray643;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "[I")
	public static int[] anIntArray644;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public static final int anInt9121 = 1401;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_113 = new Class316(80, 7);

	@OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
	public static final int anInt9131 = 50;

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "[I")
	public static final int[] anIntArray645 = new int[anInt9131];

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_146 = new Class98(58, -1);

	@OriginalMember(owner = "client!ul", name = "E", descriptor = "[I")
	public static final int[] anIntArray646 = new int[anInt9131];

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "[I")
	public static final int[] anIntArray647 = new int[anInt9131];

	@OriginalMember(owner = "client!ul", name = "J", descriptor = "[I")
	public static final int[] anIntArray648 = new int[anInt9131];

	@OriginalMember(owner = "client!ul", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[anInt9131];

	@OriginalMember(owner = "client!ul", name = "M", descriptor = "[I")
	public static final int[] anIntArray649 = new int[anInt9131];

	@OriginalMember(owner = "client!ul", name = "P", descriptor = "[I")
	public static final int[] anIntArray650 = new int[anInt9131];

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIZII)V")
	public static void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static85.aFrame1 != null && (arg4 != 3 || arg0 != Static58.aClass6_Sub17_Sub1_1.anInt9290 || arg3 != Static58.aClass6_Sub17_Sub1_1.anInt9272)) {
			Static219.method3486(Static85.aFrame1, Static174.aClass313_24);
			Static85.aFrame1 = null;
		}
		if (arg4 == 3 && Static85.aFrame1 == null) {
			Static85.aFrame1 = Static158.method2469(Static174.aClass313_24, arg3, arg0, 0);
			if (Static85.aFrame1 != null) {
				Static58.aClass6_Sub17_Sub1_1.anInt9290 = arg0;
				Static58.aClass6_Sub17_Sub1_1.anInt9272 = arg3;
				Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
			}
		}
		if (arg4 == 3 && Static85.aFrame1 == null) {
			method7235(-1, arg1, true, -1, Static58.aClass6_Sub17_Sub1_1.anInt9294);
			return;
		}
		@Pc(107) Container local107;
		@Pc(82) Insets local82;
		if (Static85.aFrame1 != null) {
			Static460.anInt8100 = arg3;
			local107 = Static85.aFrame1;
			Static258.anInt4672 = arg0;
		} else if (Static435.aFrame2 == null) {
			if (Static198.anApplet1 == null) {
				local107 = Static576.anApplet_Sub1_1;
			} else {
				local107 = Static198.anApplet1;
			}
			Static258.anInt4672 = local107.getSize().width;
			Static460.anInt8100 = local107.getSize().height;
		} else {
			local82 = Static435.aFrame2.getInsets();
			@Pc(88) int local88 = -local82.right;
			Static258.anInt4672 = Static435.aFrame2.getSize().width + local88 - local82.left;
			Static460.anInt8100 = Static435.aFrame2.getSize().height - local82.top - local82.bottom;
			local107 = Static435.aFrame2;
		}
		if (arg4 == 1) {
			Static201.anInt3846 = (Static258.anInt4672 - Static168.anInt3084) / 2;
			Static367.anInt6719 = Static168.anInt3084;
			Static154.anInt2867 = Static112.anInt1892;
			Static223.anInt4111 = 0;
		} else {
			Static550.method7684();
		}
		if (Static338.aClass45_6 != Static101.aClass45_4) {
			@Pc(165) boolean local165;
			if (Static367.anInt6719 < 1024 && Static154.anInt2867 < 768) {
				local165 = true;
			} else {
				local165 = false;
			}
		}
		if (arg2) {
			Static86.method7966();
		} else {
			Static77.aCanvas1.setSize(Static367.anInt6719, Static154.anInt2867);
			Static554.aClass90_12.method7526(Static77.aCanvas1);
			if (local107 == Static435.aFrame2) {
				local82 = Static435.aFrame2.getInsets();
				Static77.aCanvas1.setLocation(local82.left + Static201.anInt3846, local82.top + Static223.anInt4111);
			} else {
				Static77.aCanvas1.setLocation(Static201.anInt3846, Static223.anInt4111);
			}
		}
		if (arg4 >= 2) {
			Static385.aBoolean487 = true;
		} else {
			Static385.aBoolean487 = false;
		}
		if (Static152.anInt1936 != -1) {
			Static20.method306(true);
		}
		if (Static354.aClass1_1 != null && Static151.method2389(Static375.anInt9162)) {
			Static2.method59();
		}
		for (@Pc(231) int local231 = 0; local231 < 100; local231++) {
			Static543.aBooleanArray30[local231] = true;
		}
		Static485.aBoolean558 = true;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Lclient!rq;")
	public static Class283 method7237(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static427.aClass283Array1[arg0] : null;
	}
}
