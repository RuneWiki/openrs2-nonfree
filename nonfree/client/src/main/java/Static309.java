import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!km", name = "z", descriptor = "I")
	public static int anInt1943;

	@OriginalMember(owner = "client!km", name = "E", descriptor = "I")
	public static int anInt1948 = 0;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
	public static void method1666() {
		@Pc(13) Class14_Sub9 local13;
		for (local13 = (Class14_Sub9) Static605.aClass262_69.method6318(); local13 != null; local13 = (Class14_Sub9) Static605.aClass262_69.method6311()) {
			if (local13.aBoolean122) {
				local13.method9315();
			} else {
				local13.aBoolean123 = true;
				if (local13.anInt1584 >= 0 && local13.anInt1586 >= 0 && local13.anInt1584 < Static26.anInt462 && Static445.anInt6140 > local13.anInt1586) {
					Static199.method3037(local13);
				}
			}
		}
		for (local13 = (Class14_Sub9) Static659.aClass262_74.method6318(); local13 != null; local13 = (Class14_Sub9) Static659.aClass262_74.method6311()) {
			if (local13.aBoolean122) {
				local13.method9315();
			} else {
				local13.aBoolean123 = true;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)V")
	public static void method1672(@OriginalArg(0) int arg0) {
		Static494.anInt8821 = 2;
		Static652.anInt10896 = arg0;
		@Pc(17) String local17 = null;
		if (Static436.aByteArray90 != null) {
			@Pc(24) Class14_Sub29 local24 = new Class14_Sub29(Static436.aByteArray90);
			local17 = Static627.method8803(local24.method5907());
			Static133.aLong67 = local24.method5907();
		}
		if (local17 == null) {
			Static5.method6556(35);
		} else {
			Static2.method22(false, true, "", local17);
		}
	}
}
