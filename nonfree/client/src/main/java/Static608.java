import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static608 {

	@OriginalMember(owner = "client!via", name = "f", descriptor = "Lclient!vd;")
	public static Class353 aClass353_131;

	@OriginalMember(owner = "client!via", name = "l", descriptor = "I")
	public static int anInt10072;

	@OriginalMember(owner = "client!via", name = "d", descriptor = "I")
	public static int anInt10066 = 0;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
	public static void method8495() {
		Static235.method4078();
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V")
	public static void method8497() {
		Static190.method3390(11);
		Static187.method3365();
		System.gc();
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!qj;IB)V")
	public static void method8500(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1) {
		if (Static488.aBoolean687) {
			arg1 = 0;
			Static488.aBoolean687 = false;
		}
		if (Static331.aClass274_1 != null && Static331.aClass274_1.method7074(arg0)) {
			return;
		}
		Static331.aClass274_1 = arg0;
		Static409.aLong187 = Static32.method595();
		Static643.anInt10677 = arg1;
		Static175.anInt3641 = arg1;
		if (Static175.anInt3641 == 0) {
			Static282.method4955();
			return;
		}
		Static582.aFloat193 = Static416.aFloat149;
		Static617.aClass57_3 = Static526.aClass57_2;
		Static541.aFloat169 = Static176.aFloat231;
		Static482.anInt8362 = Static152.anInt5124;
		Static409.aFloat147 = Static451.aFloat167;
		Static518.anInt9075 = Static589.anInt9866;
		Static529.aFloat187 = Static67.aFloat22;
		Static442.anInt7976 = Static597.anInt9945;
		Static524.aFloat186 = Static515.aFloat184;
		Static307.aFloat116 = Static44.aFloat14;
	}
}
