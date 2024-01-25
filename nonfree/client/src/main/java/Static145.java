import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!jd", name = "tb", descriptor = "Lclient!gl;")
	public static Class2 aClass2_21;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([Lclient!gl;I)V")
	public static void method5357(@OriginalArg(0) Class2[] arg0) {
		Static294.anInt5658 = arg0.length;
		Static235.aClass2Array14 = new Class2[Static294.anInt5658 + 10];
		Static58.anIntArray95 = new int[Static294.anInt5658 + 10];
		Static358.method767(arg0, 0, Static235.aClass2Array14, 0, Static294.anInt5658);
		for (@Pc(26) int local26 = 0; local26 < Static294.anInt5658; local26++) {
			Static58.anIntArray95[local26] = Static235.aClass2Array14[local26].method2627();
		}
		for (@Pc(51) int local51 = Static294.anInt5658; local51 < Static235.aClass2Array14.length; local51++) {
			Static58.anIntArray95[local51] = 12;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public static void method5367(@OriginalArg(0) int arg0) {
		if (Static154.anInt3268 == arg0) {
			return;
		}
		Static195.anInt3965 = Static298.anInt5716 = Static89.anIntArray194[arg0];
		Static218.aClass46_5.method5111(50, (int) ((double) Static195.anInt3965 * 34.46D));
		Static134.anIntArrayArray45 = new int[Static195.anInt3965][Static298.anInt5716];
		Static353.anIntArrayArray97 = new int[Static195.anInt3965][Static298.anInt5716];
		Static221.anIntArrayArrayArray11 = new int[4][Static195.anInt3965 >> 3][Static298.anInt5716 >> 3];
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			Static75.aClass65Array1[local47] = Static46.method1138(Static195.anInt3965, Static298.anInt5716);
		}
		Static124.aByteArrayArrayArray6 = new byte[4][Static195.anInt3965][Static298.anInt5716];
		Static324.method5570(Static298.anInt5716, Static195.anInt3965);
		Static258.method4432(Static218.aClass46_5, Static195.anInt3965 >> 3, Static298.anInt5716 >> 3);
		Static154.anInt3268 = arg0;
	}
}
