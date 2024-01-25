import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!au", name = "n", descriptor = "I")
	public static int anInt331;

	@OriginalMember(owner = "client!au", name = "p", descriptor = "Lclient!au;")
	public static final Class21 aClass21_1 = new Class21(0, 3, Static104.aClass86_12);

	@OriginalMember(owner = "client!au", name = "h", descriptor = "Lclient!au;")
	public static final Class21 aClass21_2 = new Class21(1, 3, Static104.aClass86_12);

	@OriginalMember(owner = "client!au", name = "i", descriptor = "Lclient!au;")
	public static final Class21 aClass21_3 = new Class21(2, 4, Static104.aClass86_8);

	@OriginalMember(owner = "client!au", name = "l", descriptor = "Lclient!au;")
	public static final Class21 aClass21_4 = new Class21(3, 1, Static104.aClass86_12);

	@OriginalMember(owner = "client!au", name = "m", descriptor = "Lclient!au;")
	public static final Class21 aClass21_5 = new Class21(4, 2, Static104.aClass86_12);

	@OriginalMember(owner = "client!au", name = "b", descriptor = "Lclient!au;")
	public static final Class21 aClass21_6 = new Class21(5, 3, Static104.aClass86_12);

	@OriginalMember(owner = "client!au", name = "g", descriptor = "Lclient!au;")
	public static final Class21 aClass21_7 = new Class21(6, 4, Static104.aClass86_12);

	@OriginalMember(owner = "client!au", name = "r", descriptor = "I")
	public static final int anInt330 = Static281.method4513(16);

	@OriginalMember(owner = "client!au", name = "o", descriptor = "[Lclient!nea;")
	public static Class248[] aClass248Array1 = new Class248[50];

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I")
	public static int method380() {
		return Static560.anInt8810;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Lclient!au;")
	public static Class21 method382(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass21_1;
		} else if (arg0 == 1) {
			return aClass21_2;
		} else if (arg0 == 2) {
			return aClass21_3;
		} else if (arg0 == 3) {
			return aClass21_4;
		} else if (arg0 == 4) {
			return aClass21_5;
		} else if (arg0 == 5) {
			return aClass21_6;
		} else if (arg0 == 6) {
			return aClass21_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZILclient!dq;III)V")
	public static void method383(@OriginalArg(1) int arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1 || arg0 < 1 || arg4 > Static271.anInt4910 - 2 || arg0 > Static613.anInt9909 - 2) {
			return;
		}
		if (Static283.aClass128ArrayArrayArray1 == null) {
			return;
		}
		@Pc(43) Interface9 local43 = Static168.aClass137_Sub1_1.method6470(arg2, arg3, arg0, arg4);
		if (local43 == null) {
			return;
		}
		if (local43 instanceof Class4_Sub1_Sub1_Sub3) {
			((Class4_Sub1_Sub1_Sub3) local43).method5892(arg1);
		} else if (local43 instanceof Class4_Sub1_Sub3_Sub1) {
			((Class4_Sub1_Sub3_Sub1) local43).method2931(arg1);
		} else if (local43 instanceof Class4_Sub1_Sub2_Sub2) {
			((Class4_Sub1_Sub2_Sub2) local43).method5780(arg1);
		} else if (local43 instanceof Class4_Sub1_Sub5_Sub2) {
			((Class4_Sub1_Sub5_Sub2) local43).method8369(arg1);
		}
	}
}
