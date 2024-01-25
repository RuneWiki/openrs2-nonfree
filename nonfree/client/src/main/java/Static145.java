import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!wq;I)Lclient!gm;")
	public static Class132 method2733(@OriginalArg(0) Class5_Sub36 arg0) {
		@Pc(10) Class189 local10 = Static447.method6379()[arg0.method7291()];
		@Pc(17) Class346 local17 = Static378.method5602()[arg0.method7291()];
		@Pc(21) int local21 = arg0.method7303();
		@Pc(27) int local27 = arg0.method7303();
		@Pc(31) int local31 = arg0.method7333();
		@Pc(35) int local35 = arg0.method7333();
		@Pc(39) int local39 = arg0.method7303();
		@Pc(43) int local43 = arg0.method7268();
		@Pc(47) int local47 = arg0.method7268();
		return new Class132(local10, local17, local21, local27, local31, local35, local39, local43, local47);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!d;Ljava/awt/Canvas;I)Lclient!ha;")
	public static Class100 method2735(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) Canvas arg2) {
		return new Class100_Sub3(arg2, arg1, arg0);
	}
}
