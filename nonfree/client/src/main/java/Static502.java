import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString99;

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "[I")
	public static int[] anIntArray485 = new int[2];

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!ht;I)I")
	public static int method7531(@OriginalArg(0) Class151 arg0) {
		if (Static481.aClass151_8 == arg0) {
			return 7681;
		} else if (arg0 == Static524.aClass151_11) {
			return 8448;
		} else if (Static132.aClass151_7 == arg0) {
			return 34165;
		} else if (arg0 == Static81.aClass151_2) {
			return 260;
		} else if (Static1.aClass151_10 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!ha;IIIIIIII)V")
	public static void method7532(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(15) Interface22 local15 = (Interface22) Static71.method1202(arg7, arg6, arg2);
		@Pc(24) Class181 local24;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(43) int local43;
		if (local15 != null) {
			local24 = Static61.aClass246_7.method5497(local15.method8490());
			local32 = local15.method8488() & 0x3;
			local36 = local15.method8493();
			if (local24.anInt4789 == -1) {
				local43 = arg4;
				if (local24.anInt4779 > 0) {
					local43 = arg5;
				}
				if (local36 == 0 || local36 == 2) {
					if (local32 == 0) {
						arg0.method7320(arg3, arg1, local43, 4);
					} else if (local32 == 1) {
						arg0.method7287(4, local43, arg3, arg1);
					} else if (local32 == 2) {
						arg0.method7320(arg3, arg1 + 3, local43, 4);
					} else if (local32 == 3) {
						arg0.method7287(4, local43, arg3 + 3, arg1);
					}
				}
				if (local36 == 3) {
					if (local32 == 0) {
						arg0.method7251(1, 1, local43, arg3, arg1);
					} else if (local32 == 1) {
						arg0.method7251(1, 1, local43, arg3, arg1 + 3);
					} else if (local32 == 2) {
						arg0.method7251(1, 1, local43, arg3 + 3, arg1 - -3);
					} else if (local32 == 3) {
						arg0.method7251(1, 1, local43, arg3 + 3, arg1);
					}
				}
				if (local36 == 2) {
					if (local32 == 0) {
						arg0.method7287(4, local43, arg3, arg1);
					} else if (local32 == 1) {
						arg0.method7320(arg3, arg1 + 3, local43, 4);
					} else if (local32 == 2) {
						arg0.method7287(4, local43, arg3 + 3, arg1);
					} else if (local32 == 3) {
						arg0.method7320(arg3, arg1, local43, 4);
					}
				}
			} else {
				Static412.method6338(local32, arg0, arg3, arg1, local24);
			}
		}
		local15 = (Interface22) Static217.method3700(arg7, arg6, arg2, tw.class);
		if (local15 != null) {
			local24 = Static61.aClass246_7.method5497(local15.method8490());
			local32 = local15.method8488() & 0x3;
			local36 = local15.method8493();
			if (local24.anInt4789 != -1) {
				Static412.method6338(local32, arg0, arg3, arg1, local24);
			} else if (local36 == 9) {
				local43 = -1118482;
				if (local24.anInt4779 > 0) {
					local43 = -1179648;
				}
				if (local32 == 0 || local32 == 2) {
					arg0.method7285(arg3 + 3, arg1 + 3, arg1, local43, arg3);
				} else {
					arg0.method7285(arg3, arg1 + 3, arg1, local43, arg3 + 3);
				}
			}
		}
		local15 = (Interface22) Static614.method8756(arg7, arg6, arg2);
		if (local15 == null) {
			return;
		}
		local24 = Static61.aClass246_7.method5497(local15.method8490());
		local32 = local15.method8488() & 0x3;
		if (local24.anInt4789 != -1) {
			Static412.method6338(local32, arg0, arg3, arg1, local24);
			return;
		}
	}
}
