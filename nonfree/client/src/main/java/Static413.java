import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!or", name = "p", descriptor = "Lclient!oi;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_11 = new Class337(8, 5);

	@OriginalMember(owner = "client!or", name = "r", descriptor = "I")
	public static int anInt7536 = 0;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	public static void method6519() throws Exception_Sub1 {
		if (Static234.anInt4427 == 1) {
			Static398.aClass5_13.method7514(Static207.anInt4031, Static631.anInt10100);
		} else {
			Static398.aClass5_13.method7514(0, 0);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!ha;B)Lclient!td;")
	public static Class24 method6523(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(15) Class3_Sub25 local15 = (Class3_Sub25) Static597.aClass280_45.method7107((long) arg0);
		if (local15 != null) {
			@Pc(22) Class3_Sub6_Sub1 local22 = local15.aClass119_Sub1_1.method3532();
			local15.aBoolean230 = true;
			if (local22 != null) {
				return local22.method3262(arg1);
			}
		}
		return null;
	}
}
