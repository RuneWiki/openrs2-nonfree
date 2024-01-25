import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!ga;")
	public static Class111 aClass111_109;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_188 = new Class81(44, 3);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method6631(@OriginalArg(0) Class12 arg0) {
		if (Static426.aClass361_77.method7851() == 0) {
			return;
		}
		@Pc(27) Class1_Sub21 local27;
		if (Static375.anInt6609 == 0) {
			for (local27 = (Class1_Sub21) Static426.aClass361_77.method7854(); local27 != null; local27 = (Class1_Sub21) Static426.aClass361_77.method7853()) {
				Static46.aClass234_1.method5397(local27.anInt4616, local27.anInt4614, local27.aBoolean360 ? Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1 : null, arg0, false, false, local27.anInt4619, local27.anInt4617, local27.anInt4618, arg0, Static443.aClass35_11);
				local27.method7878();
			}
			Static388.method5569();
			return;
		}
		if (Static438.aClass12_13 == null) {
			@Pc(74) Canvas local74 = new Canvas();
			local74.setSize(36, 32);
			Static438.aClass12_13 = Static447.method6466(0, local74, Static446.aClass111_105, 0, Static478.anInterface5_11);
			Static360.aClass35_10 = Static438.aClass12_13.method6457(Static584.method7820(Static428.anInt4964, Static530.aClass111_114), Static604.method7068(Static141.aClass111_32, Static428.anInt4964));
		}
		for (local27 = (Class1_Sub21) Static426.aClass361_77.method7854(); local27 != null; local27 = (Class1_Sub21) Static426.aClass361_77.method7853()) {
			Static46.aClass234_1.method5397(local27.anInt4616, local27.anInt4614, local27.aBoolean360 ? Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1 : null, arg0, false, false, local27.anInt4619, local27.anInt4617, local27.anInt4618, Static438.aClass12_13, Static360.aClass35_10);
			local27.method7878();
		}
	}
}
