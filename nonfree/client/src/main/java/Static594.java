import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	public static int anInt10048;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "Lclient!tw;")
	public static Class331 aClass331_3;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
	public static int anInt10050;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)I")
	public static int method8188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V")
	public static void method8190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg0, 9);
		local8.method5179();
		local8.anInt6198 = arg2;
		local8.anInt6195 = arg1;
	}
}
