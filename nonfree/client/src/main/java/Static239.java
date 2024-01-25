import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	public static int anInt2816;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public static int anInt2817;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "S")
	public static short aShort58 = 1;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_46 = new Class37(50);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!va;II)Lclient!el;")
	public static Class59 method2413(@OriginalArg(0) Class10_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class59 local9;
		if (Static105.aClass59_3 == null) {
			local9 = new Class59();
		} else {
			local9 = Static105.aClass59_3;
			Static105.aClass59_3 = Static105.aClass59_3.aClass59_1;
			Static311.anInt6191--;
			local9.aClass59_1 = null;
		}
		local9.aClass10_Sub1_1 = arg0;
		local9.anInt1496 = arg1;
		return local9;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg5 < 0 || Static43.anInt1151 - 1 <= arg6 || Static260.anInt5348 - 1 <= arg5) {
			return;
		}
		if (Static347.aClass83ArrayArrayArray3 == null) {
			return;
		}
		@Pc(43) Interface4 local43;
		if (arg0 == 0) {
			local43 = (Interface4) Static107.method1713(arg1, arg6, arg5);
			@Pc(258) Interface4 local258 = (Interface4) Static293.method5136(arg1, arg6, arg5);
			if (local43 != null && arg3 != 2) {
				if (local43 instanceof Class10_Sub2_Sub2) {
					((Class10_Sub2_Sub2) local43).aClass77_2.method1471(arg2);
				} else {
					Static102.method1600(arg1, arg2, arg3, arg0, local43.method5445(), arg6, arg5, arg4);
				}
			}
			if (local258 != null) {
				if (local258 instanceof Class10_Sub2_Sub2) {
					((Class10_Sub2_Sub2) local258).aClass77_2.method1471(arg2);
				} else {
					Static102.method1600(arg1, arg2, arg3, arg0, local258.method5445(), arg6, arg5, arg4);
				}
			}
		} else if (arg0 == 1) {
			local43 = (Interface4) Static14.method198(arg1, arg6, arg5);
			if (local43 != null) {
				if (local43 instanceof Class10_Sub4_Sub2) {
					((Class10_Sub4_Sub2) local43).aClass77_4.method1471(arg2);
				} else {
					@Pc(60) int local60 = local43.method5445();
					if (arg3 == 4 || arg3 == 5) {
						Static102.method1600(arg1, arg2, 4, arg0, local60, arg6, arg5, arg4);
					} else if (arg3 == 6) {
						Static102.method1600(arg1, arg2, 4, arg0, local60, arg6, arg5, arg4 + 4);
					} else if (arg3 == 7) {
						Static102.method1600(arg1, arg2, 4, arg0, local60, arg6, arg5, (arg4 + 2 & 0x3) + 4);
					} else if (arg3 == 8) {
						Static102.method1600(arg1, arg2, 4, arg0, local60, arg6, arg5, arg4 + 4);
						Static102.method1600(arg1, arg2, 4, arg0, local60, arg6, arg5, (arg4 + 2 & 0x3) + 4);
					}
				}
			}
		} else if (arg0 == 2) {
			local43 = (Interface4) Static183.method3234(arg1, arg6, arg5, jb.class);
			if (local43 != null) {
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (local43 instanceof Class10_Sub1_Sub3) {
					((Class10_Sub1_Sub3) local43).aClass77_3.method1471(arg2);
				} else {
					Static102.method1600(arg1, arg2, arg3, arg0, local43.method5445(), arg6, arg5, arg4);
				}
			}
		} else if (arg0 == 3) {
			local43 = (Interface4) Static137.method4969(arg1, arg6, arg5);
			if (local43 != null) {
				if (local43 instanceof Class10_Sub3_Sub1) {
					((Class10_Sub3_Sub1) local43).aClass77_1.method1471(arg2);
				} else {
					Static102.method1600(arg1, arg2, arg3, arg0, local43.method5445(), arg6, arg5, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)I")
	public static int method2416(@OriginalArg(0) boolean arg0) {
		@Pc(14) long local14 = Static292.method5114();
		for (@Pc(26) Class1_Sub25 local26 = arg0 ? (Class1_Sub25) Static346.aClass207_36.method5560() : (Class1_Sub25) Static346.aClass207_36.method5559(); local26 != null; local26 = (Class1_Sub25) Static346.aClass207_36.method5559()) {
			if (local14 > (local26.aLong105 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local26.aLong105 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local26.aLong214;
					Static81.anIntArray119[local57] = Static326.anIntArray552[local57];
					local26.method5796();
					return local57;
				}
				local26.method5796();
			}
		}
		return -1;
	}
}
