import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!d", name = "V", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
	public static int anInt743;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "I")
	public static int anInt745;

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "[S")
	public static short[] aShortArray1 = new short[500];

	@OriginalMember(owner = "client!d", name = "R", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!d", name = "X", descriptor = "Lclient!lf;")
	private static Class49 aClass49_378 = Static32.method683("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!d", name = "T", descriptor = "Lclient!lf;")
	public static Class49 aClass49_377 = aClass49_378;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!d", name = "W", descriptor = "I")
	public static int anInt742 = 0;

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "[I")
	public static int[] anIntArray61 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Lclient!lf;")
	private static Class49 aClass49_381 = Static32.method683("World");

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_379 = aClass49_381;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_380 = aClass49_381;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "[I")
	public static int[] anIntArray62 = new int[50];

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array4 = new Class49[100];

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
	public static int anInt748 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!uc;)V")
	public static void method573(@OriginalArg(1) Class2_Sub2_Sub3_Sub7 arg0) {
		arg0.aBoolean150 = false;
		@Pc(18) Class2_Sub2_Sub4 local18;
		if (arg0.anInt3554 != -1) {
			local18 = Static29.method543(arg0.anInt3554);
			if (local18 == null || local18.anIntArray35 == null) {
				arg0.anInt3554 = -1;
			} else {
				arg0.anInt3572++;
				if (arg0.anInt3550 < local18.anIntArray35.length && arg0.anInt3572 > local18.anIntArray36[arg0.anInt3550]) {
					arg0.anInt3550++;
					arg0.anInt3572 = 1;
					Static130.method2879(arg0.anInt3578, arg0 == Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1, arg0.anInt3529, arg0.anInt3550, local18);
				}
				if (local18.anIntArray35.length <= arg0.anInt3550) {
					arg0.anInt3572 = 0;
					arg0.anInt3550 = 0;
					Static130.method2879(arg0.anInt3578, arg0 == Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1, arg0.anInt3529, arg0.anInt3550, local18);
				}
			}
		}
		if (arg0.anInt3557 != -1 && Static127.anInt2757 >= arg0.anInt3584) {
			if (arg0.anInt3569 < 0) {
				arg0.anInt3569 = 0;
			}
			@Pc(131) int local131 = Static170.method2831(arg0.anInt3557).anInt2089;
			if (local131 == -1) {
				arg0.anInt3557 = -1;
			} else {
				@Pc(139) Class2_Sub2_Sub4 local139 = Static29.method543(local131);
				if (local139 == null || local139.anIntArray35 == null) {
					arg0.anInt3557 = -1;
				} else {
					arg0.anInt3534++;
					if (arg0.anInt3569 < local139.anIntArray35.length && arg0.anInt3534 > local139.anIntArray36[arg0.anInt3569]) {
						arg0.anInt3534 = 1;
						arg0.anInt3569++;
						Static130.method2879(arg0.anInt3578, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1 == arg0, arg0.anInt3529, arg0.anInt3569, local139);
					}
					if (local139.anIntArray35.length <= arg0.anInt3569) {
						arg0.anInt3557 = -1;
					}
				}
			}
		}
		if (arg0.anInt3568 != -1 && arg0.anInt3548 <= 1) {
			local18 = Static29.method543(arg0.anInt3568);
			if (local18.anInt401 == 1 && arg0.anInt3540 > 0 && arg0.anInt3526 <= Static127.anInt2757 && Static127.anInt2757 > arg0.anInt3533) {
				arg0.anInt3548 = 1;
				return;
			}
		}
		if (arg0.anInt3568 != -1 && arg0.anInt3548 == 0) {
			local18 = Static29.method543(arg0.anInt3568);
			if (local18 == null || local18.anIntArray35 == null) {
				arg0.anInt3568 = -1;
			} else {
				arg0.anInt3566++;
				if (local18.anIntArray35.length > arg0.anInt3538 && local18.anIntArray36[arg0.anInt3538] < arg0.anInt3566) {
					arg0.anInt3566 = 1;
					arg0.anInt3538++;
					Static130.method2879(arg0.anInt3578, arg0 == Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1, arg0.anInt3529, arg0.anInt3538, local18);
				}
				if (local18.anIntArray35.length <= arg0.anInt3538) {
					arg0.anInt3538 -= local18.anInt407;
					arg0.anInt3565++;
					if (local18.anInt409 <= arg0.anInt3565) {
						arg0.anInt3568 = -1;
					} else if (arg0.anInt3538 >= 0 && arg0.anInt3538 < local18.anIntArray35.length) {
						Static130.method2879(arg0.anInt3578, arg0 == Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1, arg0.anInt3529, arg0.anInt3538, local18);
					} else {
						arg0.anInt3568 = -1;
					}
				}
				arg0.aBoolean150 = local18.aBoolean16;
			}
		}
		if (arg0.anInt3548 > 0) {
			arg0.anInt3548--;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(III)V")
	public static void method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass7_1 = null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method575(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static79.aClass67_41);
		arg0.addMouseMotionListener(Static79.aClass67_41);
		arg0.addFocusListener(Static79.aClass67_41);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Lclient!ng;")
	public static Class2_Sub2_Sub12 method576(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub12 local10 = (Class2_Sub2_Sub12) Static21.aClass74_19.method2345((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static62.aClass11_56.method2049(arg0, 1);
		local10 = new Class2_Sub2_Sub12();
		if (local20 != null) {
			local10.method1915(new Class2_Sub13(local20), arg0);
		}
		Static21.aClass74_19.method2341((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	public static void method577() {
		aClass49_378 = null;
		aShortArrayArray1 = null;
		aClass49_379 = null;
		aClass49_380 = null;
		anIntArray61 = null;
		anIntArray62 = null;
		aClass49_381 = null;
		aClass49_377 = null;
		aShortArray1 = null;
		aByteArrayArray4 = null;
		aClass49Array4 = null;
	}
}
