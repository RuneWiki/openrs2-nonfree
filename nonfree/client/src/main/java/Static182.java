import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
	public static int anInt3877;

	@OriginalMember(owner = "client!sh", name = "ab", descriptor = "Lclient!fi;")
	public static Class36 aClass36_8;

	@OriginalMember(owner = "client!sh", name = "U", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1313 = Static200.method3116("unzap");

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLclient!kh;)V")
	public static void method2890(@OriginalArg(1) Class60 arg0) {
		@Pc(7) Class1_Sub10 local7 = Static44.method761(arg0);
		if (local7 == null) {
			return;
		}
		Static32.anInt816 = local7.anInt1611 - Static73.anInt1791;
		Static188.anInt4036 = Static30.anInt724 + Static153.anInt3417 - local7.anInt1614;
		@Pc(34) int local34 = Static188.anInt4036 + (int) ((double) Static147.aClass6_13.anInt221 / Static82.aDouble2);
		@Pc(43) int local43 = Static188.anInt4036 - (int) ((double) Static147.aClass6_13.anInt221 / Static82.aDouble2);
		@Pc(59) int local59 = Static32.anInt816 - (int) ((double) Static147.aClass6_13.anInt251 / Static82.aDouble2);
		@Pc(69) int local69 = Static32.anInt816 + (int) ((double) Static147.aClass6_13.anInt251 / Static82.aDouble2);
		if (local59 < 0) {
			Static32.anInt816 = (int) ((double) Static147.aClass6_13.anInt251 / Static82.aDouble2);
		}
		if (local43 < 0) {
			Static188.anInt4036 = (int) ((double) Static147.aClass6_13.anInt221 / Static82.aDouble2);
		}
		if (local69 > Static211.anInt3462) {
			Static32.anInt816 = Static211.anInt3462 - (int) ((double) Static147.aClass6_13.anInt251 / Static82.aDouble2);
		}
		if (local34 > Static30.anInt724) {
			Static188.anInt4036 = Static30.anInt724 - (int) ((double) Static147.aClass6_13.anInt221 / Static82.aDouble2);
		}
	}
}
