import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static645 {

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_88 = new Class307(4);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_174 = new Class397(85, 4);

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_98 = new Class144(1, -1);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)Z")
	public static boolean method8477(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
	public static void method8478() {
		Static604.aClass307_85.method6998();
		Static435.aClass307_67.method6998();
		Static204.aClass307_43.method6998();
		Static67.aClass307_13.method6998();
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)Z")
	public static boolean method8479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static397.method5358(arg1, arg0) || Static571.method7409(arg0, arg1);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!d;ILclient!ik;BI)Lclient!ha;")
	public static Class22 method8480(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class182 arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		if (arg0 != null) {
			@Pc(19) Dimension local19 = arg0.getSize();
			local14 = local19.height;
			local12 = local19.width;
		}
		return Static228.method9348(arg0, arg2, local14, local12, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)V")
	public static void method8481() {
		if (Static351.aClass331_1 != null) {
			Static397.aClass325_1 = new Class325();
			Static397.aClass325_1.method7281(Static351.aClass331_1.anInt8680, Static535.aLong327, Static351.aClass331_1, Static351.aClass331_1.aClass257_63.method5699(Static456.anInt7118));
			Static503.aThread6 = new Thread(Static397.aClass325_1, "");
			Static503.aThread6.start();
		}
	}
}
