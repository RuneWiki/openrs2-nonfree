import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
	public static int anInt9323;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_176 = new Class136(0, 4);

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_34 = new Class148(10, 7);

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "Lclient!dia;")
	public static final Class74 aClass74_29 = new Class74("", 11);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIZI)V")
	public static void method7988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static188.anInt10386; local11++) {
			@Pc(17) Rectangle local17 = Class5_Sub5_Sub1.aRectangleArray1[local11];
			if (arg1 < local17.x + local17.width && local17.x < arg2 + arg1 && arg0 < local17.height + local17.y && local17.y < arg3 + arg0) {
				Static248.aBooleanArray27[local11] = true;
			}
		}
		Static354.method5603(arg1 + arg2, arg1, arg0 + arg3, arg0);
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)I")
	public static int method7989() {
		@Pc(7) Class126 local7 = Static485.aClass126_17;
		@Pc(9) boolean local9 = false;
		if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static64.method1078(0, 0, (Interface8) null, (Class384) null, local18);
			local9 = true;
		}
		@Pc(35) long local35 = Static205.method3179();
		for (@Pc(37) int local37 = 0; local37 < 10000; local37++) {
			local7.method7028();
		}
		@Pc(67) int local67 = (int) (Static205.method3179() - local35);
		local7.method7045(100, 100, 0, 0, -16777216);
		if (local9) {
			local7.method7044();
		}
		return local67;
	}
}
