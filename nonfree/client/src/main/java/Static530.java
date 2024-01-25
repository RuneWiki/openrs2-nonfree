import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
	public static int anInt9071;

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_119 = new Class130(17, 7);

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "[I")
	public static final int[] anIntArray575 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILclient!ha;Lclient!mr;Z)V")
	public static void method7796(@OriginalArg(2) Class5 arg0, @OriginalArg(3) Class223 arg1) {
		Static566.aClass223_60.method5862();
		if (Static195.aBoolean252) {
			return;
		}
		for (@Pc(21) Class3_Sub49 local21 = (Class3_Sub49) arg1.method5874(); local21 != null; local21 = (Class3_Sub49) arg1.method5870()) {
			@Pc(29) Class36 local29 = Static110.aClass335_4.method8125(local21.anInt9434);
			if (Static115.method2359(local29)) {
				@Pc(41) boolean local41 = Static167.method2925(local29, local21, arg0);
				if (local41) {
					Static365.method5966(local21, arg0, local29);
				}
			}
		}
	}
}
