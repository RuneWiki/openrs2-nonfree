import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)[Lclient!bf;")
	public static Class34[] method4907() {
		return new Class34[] { Static150.aClass34_1, Static150.aClass34_2, Static150.aClass34_3, Static150.aClass34_4, Static150.aClass34_5, Static150.aClass34_6, Static150.aClass34_7, Static150.aClass34_8, Static150.aClass34_9, Static150.aClass34_10, Static150.aClass34_11, Static150.aClass34_12 };
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!vea;I)V")
	public static void method4910(@OriginalArg(0) Class2_Sub7_Sub21 arg0) {
		if (Static113.aBoolean192) {
			return;
		}
		arg0.method8920();
		Static633.anInt10265--;
		if (!arg0.aBoolean721) {
			@Pc(25) long local25 = arg0.aLong261;
			@Pc(31) Class2_Sub7_Sub20 local31;
			for (local31 = (Class2_Sub7_Sub20) Static5.aClass323_2.method7484(local25); local31 != null && !local31.aString106.equals(arg0.aString107); local31 = (Class2_Sub7_Sub20) Static5.aClass323_2.method7486()) {
			}
			if (local31 != null && local31.method8484(arg0)) {
				Static176.method3033(local31);
				return;
			}
			return;
		}
		for (@Pc(61) Class2_Sub7_Sub20 local61 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6680(); local61 != null; local61 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6673()) {
			if (local61.aString106.equals(arg0.aString107)) {
				@Pc(70) boolean local70 = false;
				for (@Pc(76) Class2_Sub7_Sub21 local76 = (Class2_Sub7_Sub21) local61.aClass290_13.method6680(); local76 != null; local76 = (Class2_Sub7_Sub21) local61.aClass290_13.method6673()) {
					if (arg0 == local76) {
						local70 = true;
						if (local61.method8484(arg0)) {
							Static176.method3033(local61);
						}
						break;
					}
				}
				if (local70) {
					return;
				}
			}
		}
	}
}
