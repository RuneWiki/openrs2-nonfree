import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "[I")
	public static final int[] anIntArray743 = new int[3];

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IJ)V")
	public static void method8626(@OriginalArg(1) long arg0) {
		Static280.aCalendar3.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)Lclient!pm;")
	public static Class3_Sub48 method8628() {
		if (Static327.aClass342_14 == null || Static226.aClass304_1 == null) {
			return null;
		}
		for (@Pc(27) Class3_Sub48 local27 = (Class3_Sub48) Static226.aClass304_1.method6984(); local27 != null; local27 = (Class3_Sub48) Static226.aClass304_1.method6984()) {
			@Pc(35) Class198 local35 = Static327.aClass111_2.method2739(local27.anInt8050);
			if (local35 != null && local35.aBoolean336 && local35.method4667(Static327.anInterface12_2)) {
				return local27;
			}
		}
		return null;
	}
}
