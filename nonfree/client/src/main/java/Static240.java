import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method4287() {
		try {
			if (Static283.anInt5391 == 1) {
				@Pc(16) int local16 = Static518.aClass1_Sub4_Sub4_3.method7995();
				if (local16 > 0 && Static518.aClass1_Sub4_Sub4_3.method8011()) {
					local16 -= Static322.anInt6116;
					if (local16 < 0) {
						local16 = 0;
					}
					Static518.aClass1_Sub4_Sub4_3.method7993(local16);
				} else {
					Static518.aClass1_Sub4_Sub4_3.method8001();
					Static518.aClass1_Sub4_Sub4_3.method8005();
					Static92.aClass148_2 = null;
					if (Static471.aClass69_91 == null) {
						Static283.anInt5391 = 0;
					} else {
						Static283.anInt5391 = 2;
					}
					Static353.aClass1_Sub45_1 = null;
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static518.aClass1_Sub4_Sub4_3.method8001();
			Static353.aClass1_Sub45_1 = null;
			Static283.anInt5391 = 0;
			Static471.aClass69_91 = null;
			Static92.aClass148_2 = null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
	public static boolean method4288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) boolean local19 = (arg1 & 0x37) == 0 ? Static461.method7923(arg1, arg0) : Static157.method2875(arg1, arg0);
		return local19 | (arg0 & 0x10000) != 0 | Static346.method5755(arg0, arg1);
	}
}
