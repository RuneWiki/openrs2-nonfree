import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_43 = new Class198(64);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public static int anInt4645 = 0;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!rj;")
	public static final Class174 aClass174_3 = new Class174();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!tj;I)V")
	public static void method3961(@OriginalArg(0) Class122 arg0) {
		if (Static225.aClass127_29.method3398() == 0) {
			return;
		}
		@Pc(57) Class3_Sub18 local57;
		if (Static352.anInt6827 == 0 || Static352.anInt6827 == 2) {
			for (local57 = (Class3_Sub18) Static225.aClass127_29.method3402(); local57 != null; local57 = (Class3_Sub18) Static225.aClass127_29.method3400()) {
				Static152.method2445(local57.aBoolean85 ? Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1 : null, false, local57.anInt1804, arg0, local57.anInt1808, false, local57.anInt1807, Static232.aClass120_5, local57.anInt1805, arg0, local57.anInt1809);
				local57.method5717();
			}
			Static203.method3543();
			return;
		}
		if (Static192.aClass122_6 == null) {
			@Pc(27) Canvas local27 = new Canvas();
			local27.setSize(36, 32);
			Static192.aClass122_6 = Static102.method1725(0, Static353.aClass42_5, 0, local27, Static127.anInterface9_3);
			Static283.aClass120_4 = Static192.aClass122_6.method4727(Static76.method1152(Static205.anInt65, Static86.aClass100_86), Static366.method3882(Static317.aClass100_112, Static205.anInt65));
		}
		for (local57 = (Class3_Sub18) Static225.aClass127_29.method3402(); local57 != null; local57 = (Class3_Sub18) Static225.aClass127_29.method3400()) {
			Static152.method2445(local57.aBoolean85 ? Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1 : null, false, local57.anInt1804, arg0, local57.anInt1808, false, local57.anInt1807, Static283.aClass120_4, local57.anInt1805, Static192.aClass122_6, local57.anInt1809);
			local57.method5717();
		}
	}
}
