import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "Lclient!ib;")
	public static Class147 aClass147_5;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_45 = new Class218(47, 3);

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
	public static int anInt3393 = -1;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "Lclient!ml;")
	public static final Class223 aClass223_7 = new Class223("", 11);

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
	public static int anInt3394 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method3099(@OriginalArg(1) Class13 arg0) {
		for (@Pc(6) Class28_Sub7 local6 = (Class28_Sub7) Static544.aClass371_6.method8911(); local6 != null; local6 = (Class28_Sub7) Static544.aClass371_6.method8917()) {
			if (local6.aBoolean710) {
				local6.method7909(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)Lclient!kf;")
	public static Class3_Sub34 method3100() {
		@Pc(6) Class3_Sub34 local6 = Static54.method1205();
		local6.anInt5093 = 0;
		local6.aClass218_75 = null;
		local6.aClass3_Sub25_Sub1_2 = new Class3_Sub25_Sub1(5000);
		return local6;
	}
}
