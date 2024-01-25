import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array27;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_59 = new Class98(113, -2);

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Lclient!of;")
	public static final Class230 aClass230_27 = new Class230(1, 2);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
	public static void method3592(@OriginalArg(0) int arg0) {
		Static297.anInt5458 = arg0;
		Static407.aClass330_49.method7688();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)Z")
	public static boolean method3593() {
		try {
			return Static206.method3380();
		} catch (@Pc(14) IOException local14) {
			Static164.method2621();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static144.aClass98_147 == null ? -1 : Static144.aClass98_147.method2336()) + "," + (Static111.aClass98_28 == null ? -1 : Static111.aClass98_28.method2336()) + "," + (Static446.aClass98_124 == null ? -1 : Static446.aClass98_124.method2336()) + " - " + Static207.anInt3929 + "," + (Static150.anInt2792 + Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray638[0]) + "," + (Static154.anInt2878 + Static461.aClass15_Sub2_Sub4_Sub2_2.anIntArray637[0]) + " - ";
			for (@Pc(79) int local79 = 0; Static207.anInt3929 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static429.aClass6_Sub12_Sub2_2.aByteArray97[local79] + ",";
			}
			Static214.method5693(local77, local19);
			Static342.method5247(false);
			return true;
		}
	}
}
