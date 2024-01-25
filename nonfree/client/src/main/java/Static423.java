import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
	public static int[] anIntArray442;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!mba;")
	public static final Class216 aClass216_53 = new Class216();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!sba;I)V")
	public static void method6480(@OriginalArg(0) Class3_Sub7_Sub19 arg0) {
		if (Static253.aBoolean362) {
			return;
		}
		arg0.method8682();
		Static285.anInt7798--;
		if (!arg0.aBoolean624) {
			@Pc(29) long local29 = arg0.aLong228;
			@Pc(35) Class3_Sub7_Sub13 local35;
			for (local35 = (Class3_Sub7_Sub13) Static166.aClass25_17.method426(local29); local35 != null && !local35.aString35.equals(arg0.aString83); local35 = (Class3_Sub7_Sub13) Static166.aClass25_17.method429()) {
			}
			if (local35 != null && local35.method3993(arg0)) {
				Static130.method2309(local35);
				return;
			}
			return;
		}
		for (@Pc(66) Class3_Sub7_Sub13 local66 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8414(); local66 != null; local66 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8415()) {
			if (local66.aString35.equals(arg0.aString83)) {
				@Pc(76) boolean local76 = false;
				for (@Pc(82) Class3_Sub7_Sub19 local82 = (Class3_Sub7_Sub19) local66.aClass363_21.method8414(); local82 != null; local82 = (Class3_Sub7_Sub19) local66.aClass363_21.method8415()) {
					if (local82 == arg0) {
						local76 = true;
						if (local66.method3993(arg0)) {
							Static130.method2309(local66);
						}
						break;
					}
				}
				if (local76) {
					return;
				}
			}
		}
	}
}
