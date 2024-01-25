import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rm", name = "K", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_127 = new Class200(110, -2);

	@OriginalMember(owner = "client!rm", name = "Z", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_114 = new Class130(9, -1);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!qk;BLclient!ha;)V")
	public static void method7385(@OriginalArg(0) Class279 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(35) boolean local35 = Static320.aClass53_2.method1772(arg0.anInt8169 | 0xFF000000, arg0.anInt8155, arg0.aBoolean567 ? Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aClass178_1 : null, arg0.anInt8196, arg0.anInt8156, arg1, arg0.anInt8217) == null;
		if (local35) {
			Static43.aClass223_6.method5868(new Class3_Sub50(arg0.anInt8217, arg0.anInt8155, arg0.anInt8156, arg0.anInt8169 | 0xFF000000, arg0.anInt8196, arg0.aBoolean567));
			Static482.method7193(arg0);
		}
	}
}
