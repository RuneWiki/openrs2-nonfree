import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!uda", name = "E", descriptor = "Z")
	public static boolean aBoolean693 = false;

	@OriginalMember(owner = "client!uda", name = "G", descriptor = "I")
	public static int anInt9687 = 0;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!sha;I)V")
	public static void method8177(@OriginalArg(0) Class321 arg0) {
		if (Static8.anInt258 != arg0.anInt9098) {
			return;
		}
		if (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45 == null) {
			arg0.anInt9014 = 0;
			arg0.anInt9046 = 0;
			return;
		}
		arg0.anInt9053 = 150;
		arg0.anInt9042 = (int) (Math.sin((double) Static90.anInt1698 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9058 = 5;
		arg0.anInt9014 = Static659.anInt7559;
		arg0.anInt9046 = Static55.method3550(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45);
		arg0.anInt9099 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt5075;
		arg0.anInt9012 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt5067;
		arg0.anInt9010 = 0;
		arg0.anInt9018 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt5112;
		@Pc(80) Class119 local80 = arg0.anInt9018 == -1 ? null : Static334.aClass268_2.method6469(arg0.anInt9018);
		if (local80 != null) {
			Static245.method3612(arg0.anInt9012, local80);
		}
	}
}
