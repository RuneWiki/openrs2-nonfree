import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "[I")
	public static int[] anIntArray470;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIII)V")
	public static void method8089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class15_Sub3_Sub1 local13 = local7.aClass15_Sub3_Sub1_1;
		@Pc(16) Class15_Sub3_Sub1 local16 = local7.aClass15_Sub3_Sub1_2;
		if (local13 != null) {
			local13.aShort103 = (short) (local13.aShort103 * arg3 / (0x10 << Static170.anInt3602 - 7));
			local13.aShort104 = (short) (local13.aShort104 * arg3 / (0x10 << Static170.anInt3602 - 7));
		}
		if (local16 != null) {
			local16.aShort103 = (short) (local16.aShort103 * arg3 / (0x10 << Static170.anInt3602 - 7));
			local16.aShort104 = (short) (local16.aShort104 * arg3 / (0x10 << Static170.anInt3602 - 7));
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)Z")
	public static boolean method8120() {
		try {
			if (Static311.anInt5615 == 2) {
				if (Static88.aClass2_Sub39_1 == null) {
					Static88.aClass2_Sub39_1 = Static681.method5345(Static337.aClass124_71, Static264.anInt5034, Static632.anInt10931);
					if (Static88.aClass2_Sub39_1 == null) {
						return false;
					}
				}
				if (Static451.aClass316_1 == null) {
					Static451.aClass316_1 = new Class316(Static526.aClass124_112, Static90.aClass124_23);
				}
				@Pc(29) Class2_Sub26_Sub3 local29 = Static300.aClass2_Sub26_Sub3_8;
				if (Static151.aClass2_Sub26_Sub3_5 != null) {
					local29 = Static151.aClass2_Sub26_Sub3_5;
				}
				if (local29.method6996(Static451.aClass316_1, Static88.aClass2_Sub39_1, Static280.aClass124_60)) {
					Static300.aClass2_Sub26_Sub3_8 = local29;
					Static300.aClass2_Sub26_Sub3_8.method6973();
					@Pc(65) int local65;
					if (Static670.anInt7888 > 0) {
						Static311.anInt5615 = 3;
						Static300.aClass2_Sub26_Sub3_8.method6979(Static131.anInt2515 < Static670.anInt7888 ? Static131.anInt2515 : Static670.anInt7888);
						for (local65 = 0; local65 < anIntArray470.length; local65++) {
							Static300.aClass2_Sub26_Sub3_8.method6983(anIntArray470[local65], local65);
							anIntArray470[local65] = 255;
						}
					} else {
						Static311.anInt5615 = 0;
						Static300.aClass2_Sub26_Sub3_8.method6979(Static131.anInt2515);
						for (local65 = 0; local65 < anIntArray470.length; local65++) {
							Static300.aClass2_Sub26_Sub3_8.method6983(anIntArray470[local65], local65);
							anIntArray470[local65] = 255;
						}
					}
					if (Static151.aClass2_Sub26_Sub3_5 == null) {
						if (Static209.aLong112 <= 0L) {
							Static300.aClass2_Sub26_Sub3_8.method6985(Static88.aClass2_Sub39_1, Static138.aBoolean196);
						} else {
							Static300.aClass2_Sub26_Sub3_8.method6993(Static209.aLong112, Static88.aClass2_Sub39_1, Static138.aBoolean196);
						}
					}
					if (Static554.aClass34_3 != null) {
						Static554.aClass34_3.method6325(Static300.aClass2_Sub26_Sub3_8);
					}
					Static451.aClass316_1 = null;
					Static88.aClass2_Sub39_1 = null;
					Static151.aClass2_Sub26_Sub3_5 = null;
					Static337.aClass124_71 = null;
					Static209.aLong112 = 0L;
					return true;
				}
			}
		} catch (@Pc(154) Exception local154) {
			local154.printStackTrace();
			Static300.aClass2_Sub26_Sub3_8.method7010();
			Static151.aClass2_Sub26_Sub3_5 = null;
			Static337.aClass124_71 = null;
			Static88.aClass2_Sub39_1 = null;
			Static451.aClass316_1 = null;
			Static311.anInt5615 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBILjava/awt/Canvas;Lclient!d;Lclient!gga;I)Lclient!ha;")
	public static synchronized Class101 method8139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) Class124 arg5, @OriginalArg(7) int arg6) {
		if (arg0 == 0) {
			return Static381.method6462(arg3, arg4, arg6, arg1);
		} else if (arg0 == 2) {
			return Static541.method8306(arg3, arg1, arg6, arg4);
		} else if (arg0 == 1) {
			return Static583.method8817(arg4, arg3, arg2);
		} else if (arg0 == 5) {
			return Static394.method7228(arg2, arg3, arg5, arg4);
		} else if (arg0 == 3) {
			return Static682.method6337(arg4, arg3, arg2, arg5);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
