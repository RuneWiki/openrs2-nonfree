import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!pja", name = "r", descriptor = "Lclient!ef;")
	public static Class97 aClass97_5;

	@OriginalMember(owner = "client!pja", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!pja", name = "t", descriptor = "Lclient!tn;")
	public static Class342 aClass342_3;

	@OriginalMember(owner = "client!pja", name = "v", descriptor = "I")
	public static int anInt7408;

	@OriginalMember(owner = "client!pja", name = "q", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_120 = new Class171(91, -1);

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IB)V")
	public static void method6210(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg0, 9);
		local9.method8834();
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!d;IB)Lclient!ha;")
	public static Class95 method6211(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) int arg3) {
		return new oa(arg0, arg2, arg3, arg1);
	}
}
