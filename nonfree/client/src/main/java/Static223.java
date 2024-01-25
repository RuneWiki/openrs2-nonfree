import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!lt;")
	public static Class158 aClass158_51;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "Lclient!lt;")
	public static Class158 aClass158_52;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!fb;")
	public static final Class76 aClass76_1 = Static252.method3888();

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method3405(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		Static85.aClass158_22.anInt4036 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static354.aClass170_2.anInt4263; local18++) {
			@Pc(25) Class32 local25 = Static354.aClass170_2.method3865(local18);
			if ((!arg1 || local25.aBoolean71) && local25.anInt836 == -1 && local25.anInt830 == -1 && local25.anInt861 == 0 && local25.aString8.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static251.anInt4261 = -1;
					Static73.aShortArray27 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(75) short[] local75 = new short[local14.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local16; local77++) {
						local75[local77] = local14[local77];
					}
					local14 = local75;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static28.anInt442 = 0;
		Static251.anInt4261 = local16;
		Static73.aShortArray27 = local14;
		@Pc(119) String[] local119 = new String[Static251.anInt4261];
		for (@Pc(121) int local121 = 0; local121 < Static251.anInt4261; local121++) {
			local119[local121] = Static354.aClass170_2.method3865(local14[local121]).aString8;
		}
		Static152.method5504(Static73.aShortArray27, local119);
		Static85.aClass158_22.method3689();
		Static85.aClass158_22.anInt4036 = 2;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V")
	public static void method3406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) float local9 = (float) Static36.anInt2241 / (float) Static36.anInt2248;
		@Pc(11) int local11 = arg1;
		@Pc(18) int local18 = arg3;
		if (local9 < 1.0F) {
			local18 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(45) int local45 = arg0 - (arg1 - local11) / 2;
		@Pc(54) int local54 = arg2 - (arg3 - local18) / 2;
		Static70.anInt1464 = Static36.anInt2241 - Static36.anInt2241 * local54 / local18;
		Static212.anInt3671 = -1;
		Static340.anInt5720 = -1;
		Static187.anInt3261 = local45 * Static36.anInt2248 / local11;
		Static380.method5244();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!hf;Ljava/awt/Frame;Z)V")
	public static void method3407(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class249 local10 = arg0.method2357(arg1);
			while (local10.anInt6929 == 0) {
				Static170.method1617(10L);
			}
			if (local10.anInt6929 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static170.method1617(100L);
		}
	}
}
