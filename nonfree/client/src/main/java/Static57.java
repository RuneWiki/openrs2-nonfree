import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "[Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array2;

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "Lclient!b;")
	public static Class6 aClass6_34;

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "I")
	public static int anInt1238;

	@OriginalMember(owner = "client!ff", name = "vb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_578 = Static193.method3027("Location");

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "Lclient!oc;")
	public static Class70 aClass70_577 = aClass70_578;

	@OriginalMember(owner = "client!ff", name = "Ob", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_580 = Static193.method3027("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ff", name = "Qb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_581 = Static193.method3027("scrollbar");

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method902() {
		for (@Pc(14) Class3_Sub3_Sub8 local14 = (Class3_Sub3_Sub8) Static153.aClass10_85.method267(); local14 != null; local14 = (Class3_Sub3_Sub8) Static153.aClass10_85.method268()) {
			@Pc(19) Class26_Sub4 local19 = local14.aClass26_Sub4_1;
			if (Static137.anInt2795 != local19.anInt2420 || local19.aBoolean122) {
				local14.method3320();
			} else if (Static184.anInt3760 >= local19.anInt2416) {
				local19.method1722(Static211.anInt4246);
				if (local19.aBoolean122) {
					local14.method3320();
				} else {
					Static200.method3182(local19.anInt2420, local19.anInt2426, local19.anInt2414, local19.anInt2417, 60, local19, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method903() {
		Static153.aByteArrayArrayArray14 = null;
		Static103.aByteArrayArrayArray9 = null;
		Static35.aByteArrayArrayArray3 = null;
		Static138.anIntArray202 = null;
		Static184.anIntArray322 = null;
		Static9.anIntArray17 = null;
		Static60.aByteArrayArrayArray15 = null;
		Static207.anIntArray374 = null;
		Static183.anIntArray206 = null;
		Static41.anIntArrayArrayArray5 = null;
		Static119.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
	public static void method906() {
		Static9.aClass1_1.method1313();
		for (@Pc(18) int local18 = 0; local18 < 32; local18++) {
			Static185.aLongArray8[local18] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static211.aLongArray10[local30] = 0L;
		}
		Static98.anInt2021 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIZ)Lclient!oc;")
	public static Class70 method913(@OriginalArg(1) int arg0) {
		return Static144.method2089(true, arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
	public static void method915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 < arg3) {
			Static16.method302(arg2, arg0, arg3, Static157.anIntArrayArray24[arg1]);
		} else {
			Static16.method302(arg2, arg3, arg0, Static157.anIntArrayArray24[arg1]);
		}
	}
}
