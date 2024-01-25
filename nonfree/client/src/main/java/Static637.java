import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!vja", name = "jb", descriptor = "Lclient!rd;")
	public static Class301 aClass301_1;

	@OriginalMember(owner = "client!vja", name = "hb", descriptor = "Lclient!hia;")
	public static Class5_Sub20 aClass5_Sub20_31;

	@OriginalMember(owner = "client!vja", name = "mb", descriptor = "Lclient!el;")
	public static final Class109 aClass109_220 = new Class109(130, 12);

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(ILjava/awt/Canvas;IILclient!d;Lclient!la;)Lclient!ha;")
	public static Class57 method8915(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface1 arg3, @OriginalArg(5) Class208 arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg1 != null) {
			@Pc(19) Dimension local19 = arg1.getSize();
			local7 = local19.height;
			local5 = local19.width;
		}
		return Static208.method7677(arg3, arg2, local5, local7, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!tw;)V")
	public static void method8916(@OriginalArg(0) Class339 arg0) {
		Static51.aClass339_1 = arg0;
	}

	@OriginalMember(owner = "client!vja", name = "c", descriptor = "(I)V")
	public static void method8917() {
		Static14.method252();
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIB)Z")
	public static boolean method8918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static233.method3389(arg1, arg0) || Static395.method5775(arg0, arg1);
	}
}
