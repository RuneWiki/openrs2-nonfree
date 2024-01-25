import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "Lclient!qk;")
	public static Class279 aClass279_6 = null;

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "Lclient!kca;")
	public static final Class182 aClass182_7 = new Class182(1);

	@OriginalMember(owner = "client!hn", name = "M", descriptor = "[Lclient!maa;")
	public static final Class212[] aClass212Array1 = new Class212[6];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(DB)V")
	public static void method3684(@OriginalArg(0) double arg0) {
		Static46.aClass39_2.method7236(Static72.aClass39_3);
		Static46.aClass39_2.method7244(0, 0, (int) arg0);
		Static398.aClass5_13.method7504(Static46.aClass39_2);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)Lclient!o;")
	public static Class4_Sub6 method3689() {
		@Pc(13) Class4_Sub6 local13 = (Class4_Sub6) Static232.aClass120_3.method2957();
		if (local13 == null) {
			return new Class4_Sub6();
		} else {
			Static166.anInt3238--;
			return local13;
		}
	}
}
