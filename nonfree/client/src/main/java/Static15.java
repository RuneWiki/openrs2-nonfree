import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!em;")
	public static Class64 aClass64_6;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
	public static final int[] anIntArray418 = new int[25];

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_94 = new Class117("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
	public static final int[] anIntArray419 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLclient!uo;IIIIII)V")
	public static void method4637(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(24) Interface7 local24 = (Interface7) Static3.method15(arg4, arg0, arg7);
		@Pc(32) Class84 local32;
		@Pc(38) int local38;
		@Pc(44) int local44;
		@Pc(50) int local50;
		if (local24 != null) {
			local32 = Static108.method1650(local24.method5410());
			local38 = local24.method5413() & 0x3;
			local44 = local24.method5414();
			if (local32.anInt1987 == -1) {
				local50 = arg6;
				if (local32.anInt2016 > 0) {
					local50 = arg3;
				}
				if (local44 == 0 || local44 == 2) {
					if (local38 == 0) {
						arg1.method4940(4, local50, arg5, arg2);
					} else if (local38 == 1) {
						arg1.method4998(4, arg5, local50, arg2);
					} else if (local38 == 2) {
						arg1.method4940(4, local50, arg5, arg2 + 3);
					} else if (local38 == 3) {
						arg1.method4998(4, arg5 + 3, local50, arg2);
					}
				}
				if (local44 == 3) {
					if (local38 == 0) {
						arg1.method4941(arg2, arg5, 1, local50, 1);
					} else if (local38 == 1) {
						arg1.method4941(arg2 + 3, arg5, 1, local50, 1);
					} else if (local38 == 2) {
						arg1.method4941(arg2 + 3, arg5 - -3, 1, local50, 1);
					} else if (local38 == 3) {
						arg1.method4941(arg2, arg5 + 3, 1, local50, 1);
					}
				}
				if (local44 == 2) {
					if (local38 == 0) {
						arg1.method4998(4, arg5, local50, arg2);
					} else if (local38 == 1) {
						arg1.method4940(4, local50, arg5, arg2 + 3);
					} else if (local38 == 2) {
						arg1.method4998(4, arg5 + 3, local50, arg2);
					} else if (local38 == 3) {
						arg1.method4940(4, local50, arg5, arg2);
					}
				}
			} else {
				Static259.method4518(local38, arg2, arg5, arg1, local32);
			}
		}
		local24 = (Interface7) Static284.method4725(arg4, arg0, arg7, sc.class);
		if (local24 != null) {
			local32 = Static108.method1650(local24.method5410());
			local38 = local24.method5413() & 0x3;
			local44 = local24.method5414();
			if (local32.anInt1987 != -1) {
				Static259.method4518(local38, arg2, arg5, arg1, local32);
			} else if (local44 == 9) {
				local50 = -1118482;
				if (local32.anInt2016 > 0) {
					local50 = -1179648;
				}
				if (local38 == 0 || local38 == 2) {
					arg1.method4991(arg5 + 3, arg5, arg2 + 3, arg2, local50);
				} else {
					arg1.method4991(arg5, arg5 + 3, arg2 + 3, arg2, local50);
				}
			}
		}
		local24 = (Interface7) Static136.method5506(arg4, arg0, arg7);
		if (local24 == null) {
			return;
		}
		local32 = Static108.method1650(local24.method5410());
		local38 = local24.method5413() & 0x3;
		if (local32.anInt1987 != -1) {
			Static259.method4518(local38, arg2, arg5, arg1, local32);
			return;
		}
	}
}
