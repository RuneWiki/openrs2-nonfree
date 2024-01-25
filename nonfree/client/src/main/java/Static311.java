import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_91 = new Class274(117, 3);

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_57 = new Class269(73, -1);

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "F")
	public static float aFloat132 = 0.25F;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "[I")
	public static final int[] anIntArray387 = new int[5];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)[Lclient!iga;")
	public static Class159[] method4745() {
		return new Class159[] { Static39.aClass159_7, Static151.aClass159_3, Static538.aClass159_6 };
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ)V")
	public static void method4750(@OriginalArg(1) boolean arg0) {
		Static77.method1461();
		if (!Static86.method1553(Static538.anInt8985)) {
			return;
		}
		Static362.anInt6546++;
		if (Static362.anInt6546 < 50 && !arg0) {
			return;
		}
		Static362.anInt6546 = 0;
		if (!Static578.aBoolean692 && Static439.aClass210_1 != null) {
			@Pc(35) Class2_Sub50 local35 = Static595.method8194(Static610.aClass310_2, Static631.aClass269_96);
			method4754(local35);
			try {
				Static73.method1380();
			} catch (@Pc(42) IOException local42) {
				Static578.aBoolean692 = true;
			}
		}
		Static77.method1461();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!vr;I)V")
	public static void method4754(@OriginalArg(0) Class2_Sub50 arg0) {
		Static377.aClass238_40.method5837(arg0);
		arg0.anInt9982 = arg0.aClass2_Sub34_Sub2_2.anInt8188;
		arg0.aClass2_Sub34_Sub2_2.anInt8188 = 0;
		Static423.anInt10048 += arg0.anInt9982;
	}
}
