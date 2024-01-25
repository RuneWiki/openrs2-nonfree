import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!am;")
	public static Class11 aClass11_143;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_100 = new Class154(64);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "([Ljava/lang/String;[SB)V")
	public static void method5311(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static318.method5280(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class4_Sub26 local7 = null;
		for (@Pc(12) Class4_Sub26 local12 = (Class4_Sub26) Static332.aClass130_149.method3499(); local12 != null; local12 = (Class4_Sub26) Static332.aClass130_149.method3512()) {
			if (arg4 == local12.anInt3639 && local12.anInt3634 == arg5 && local12.anInt3641 == arg8 && local12.anInt3626 == arg6) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub26();
			local7.anInt3626 = arg6;
			local7.anInt3641 = arg8;
			local7.anInt3639 = arg4;
			local7.anInt3634 = arg5;
			Static27.method480(local7);
			Static332.aClass130_149.method3510(local7);
		}
		local7.anInt3631 = arg2;
		local7.anInt3636 = arg0;
		local7.anInt3628 = arg3;
		local7.anInt3643 = arg1;
		local7.anInt3642 = arg7;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Lclient!qs;")
	public static Class174 method5313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class174 local7 = new Class174();
		local7.anInt5481 = -1;
		local7.anInt5464 = arg0 + 5 + 1;
		local7.anInt5483 = arg1 + 5 + 1;
		local7.anInt5486 = -1;
		local7.anIntArrayArray53 = new int[local7.anInt5483][local7.anInt5464];
		local7.method4654();
		return local7;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)V")
	public static void method5314(@OriginalArg(1) int arg0) {
		if (!Static266.method4641(arg0)) {
			return;
		}
		@Pc(18) Class72[] local18 = Static158.aClass72ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class72 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt1821 = 1;
				local26.anInt1832 = 0;
				local26.anInt1808 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method5318(@OriginalArg(1) Class72 arg0) {
		@Pc(6) int local6 = arg0.anInt1804;
		if (local6 == 324) {
			if (Static133.anInt3054 == -1) {
				Static133.anInt3054 = arg0.anInt1882;
				Static3.anInt36 = arg0.anInt1810;
			}
			if (Static113.aClass148_9.aBoolean404) {
				arg0.anInt1882 = Static133.anInt3054;
			} else {
				arg0.anInt1882 = Static3.anInt36;
			}
		} else if (local6 == 325) {
			if (Static133.anInt3054 == -1) {
				Static3.anInt36 = arg0.anInt1810;
				Static133.anInt3054 = arg0.anInt1882;
			}
			if (Static113.aClass148_9.aBoolean404) {
				arg0.anInt1882 = Static3.anInt36;
			} else {
				arg0.anInt1882 = Static133.anInt3054;
			}
		} else if (local6 == 327) {
			arg0.anInt1817 = 150;
			arg0.anInt1867 = (int) (Math.sin((double) Static342.anInt6706 / 40.0D) * 256.0D) & 0x3FFF;
			arg0.anInt1879 = -1;
			arg0.anInt1794 = 5;
		} else if (local6 == 328) {
			if (Static110.aClass2_Sub2_Sub1_Sub1_1.aString22 == null) {
				arg0.anInt1879 = 0;
				arg0.anInt1822 = 0;
			} else {
				arg0.anInt1817 = 150;
				arg0.anInt1867 = (int) (Math.sin((double) Static342.anInt6706 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt1879 = 2047;
				arg0.anInt1794 = 5;
				arg0.anInt1822 = Static171.method3209(Static110.aClass2_Sub2_Sub1_Sub1_1.aString22);
				arg0.anInt1808 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6485;
				arg0.anInt1836 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6540;
				arg0.anInt1821 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6518;
				arg0.anInt1832 = 0;
			}
		}
	}
}
