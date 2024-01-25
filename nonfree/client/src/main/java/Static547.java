import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "Lclient!vv;")
	public static final Class368 aClass368_3 = new Class368(16);

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_173 = new Class136(47, 1);

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)V")
	public static void method7741() {
		Static227.method3572();
		Static489.aClass91_4 = null;
		Static540.aClass126_21 = null;
		Static339.aClass91_2 = null;
		Static88.aClass91_1 = null;
		Static211.aClass248ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(III)V")
	public static void method7742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg0, 12);
		local8.method4140();
		local8.anInt4508 = arg1;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BI)V")
	public static void method7744(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg0, 16);
		local8.method4132();
	}
}
