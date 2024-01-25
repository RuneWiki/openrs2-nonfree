import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Lclient!eda;")
	public static final Class83 aClass83_12 = new Class83();

	@OriginalMember(owner = "client!su", name = "f", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_120 = new Class130(58, 2);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIZIBI)V")
	public static void method7799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 ? Static262.aClass3_Sub27_12.aClass21_Sub14_1.method5405() : Static262.aClass3_Sub27_12.aClass21_Sub14_4.method5405()) != 0 && arg0 != 0 && Static393.anInt7276 < 50 && arg1 != -1) {
			Static508.aClass371Array1[Static393.anInt7276++] = new Class371((byte) (arg3 ? 3 : 2), arg1, arg0, arg2, arg5, 0, arg4, null);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V")
	public static void method7801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = Static201.anInt3960;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static391.anInt7250 = arg0;
			Static543.anInt9220 = arg3;
			Static168.anInt3983 = arg1;
			Static201.anInt3960 = 2;
			Static474.anInt8295 = arg2;
		} else if (local5 == 2) {
			if (Static391.anInt7250 < arg0) {
				Static391.anInt7250 = arg0;
			}
			if (arg2 < Static474.anInt8295) {
				Static474.anInt8295 = arg2;
			}
			if (arg1 > Static168.anInt3983) {
				Static168.anInt3983 = arg1;
			}
			if (Static543.anInt9220 > arg3) {
				Static543.anInt9220 = arg3;
			}
		}
	}
}
