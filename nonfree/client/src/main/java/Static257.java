import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_84 = new Class319(33, 8);

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "Lclient!sk;")
	public static final Class297 aClass297_6 = new Class297(1);

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "F")
	public static float aFloat111 = 0.0F;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!io;)Lclient!caa;")
	public static Class40 method4051(@OriginalArg(1) Class1_Sub20 arg0) {
		@Pc(12) Class40 local12 = new Class40();
		local12.anInt1400 = arg0.method4426();
		local12.aClass1_Sub3_Sub3_1 = Static296.aClass362_2.method7873(local12.anInt1400);
		return local12;
	}
}
