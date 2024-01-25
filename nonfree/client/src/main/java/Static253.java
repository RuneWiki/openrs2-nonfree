import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "Lclient!ij;")
	public static Class93 aClass93_96;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[100];

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!ea;IIIBIIII)V")
	public static void method4485(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface5 local11 = (Interface5) Static330.method5730(arg7, arg6, arg4);
		@Pc(19) Class156 local19;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local11 != null) {
			local19 = Static111.method1967(local11.method5910());
			local25 = local11.method5908() & 0x3;
			local29 = local11.method5913();
			if (local19.anInt4766 == -1) {
				local44 = arg5;
				if (local19.anInt4756 > 0) {
					local44 = arg2;
				}
				if (local29 == 0 || local29 == 2) {
					if (local25 == 0) {
						arg0.method5178(local44, arg3, 4, arg1);
					} else if (local25 == 1) {
						arg0.method5243(4, arg1, local44, arg3);
					} else if (local25 == 2) {
						arg0.method5178(local44, arg3 + 3, 4, arg1);
					} else if (local25 == 3) {
						arg0.method5243(4, arg1 + 3, local44, arg3);
					}
				}
				if (local29 == 3) {
					if (local25 == 0) {
						arg0.method5254(1, local44, 1, arg3, arg1);
					} else if (local25 == 1) {
						arg0.method5254(1, local44, 1, arg3 + 3, arg1);
					} else if (local25 == 2) {
						arg0.method5254(1, local44, 1, arg3 + 3, arg1 + 3);
					} else if (local25 == 3) {
						arg0.method5254(1, local44, 1, arg3, arg1 + 3);
					}
				}
				if (local29 == 2) {
					if (local25 == 0) {
						arg0.method5243(4, arg1, local44, arg3);
					} else if (local25 == 1) {
						arg0.method5178(local44, arg3 + 3, 4, arg1);
					} else if (local25 == 2) {
						arg0.method5243(4, arg1 + 3, local44, arg3);
					} else if (local25 == 3) {
						arg0.method5178(local44, arg3, 4, arg1);
					}
				}
			} else {
				Static137.method2436(arg1, arg3, local19, local25, arg0);
			}
		}
		local11 = (Interface5) Static259.method4533(arg7, arg6, arg4, iq.class);
		if (local11 != null) {
			local19 = Static111.method1967(local11.method5910());
			local25 = local11.method5908() & 0x3;
			local29 = local11.method5913();
			if (local19.anInt4766 != -1) {
				Static137.method2436(arg1, arg3, local19, local25, arg0);
			} else if (local29 == 9) {
				local44 = -1118482;
				if (local19.anInt4756 > 0) {
					local44 = -1179648;
				}
				if (local25 == 0 || local25 == 2) {
					arg0.method5208(local44, arg1 + 3, arg1, arg3, arg3 + 3);
				} else {
					arg0.method5208(local44, arg1, arg1 + 3, arg3, arg3 + 3);
				}
			}
		}
		local11 = (Interface5) Static101.method1810(arg7, arg6, arg4);
		if (local11 == null) {
			return;
		}
		local19 = Static111.method1967(local11.method5910());
		local25 = local11.method5908() & 0x3;
		if (local19.anInt4766 != -1) {
			Static137.method2436(arg1, arg3, local19, local25, arg0);
			return;
		}
	}
}
