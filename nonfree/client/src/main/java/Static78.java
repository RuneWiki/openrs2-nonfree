import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cia", name = "f", descriptor = "[I")
	public static final int[] anIntArray65 = new int[1];

	@OriginalMember(owner = "client!cia", name = "i", descriptor = "[Lclient!is;")
	public static final Class5_Sub3_Sub9[] aClass5_Sub3_Sub9Array2 = new Class5_Sub3_Sub9[14];

	@OriginalMember(owner = "client!cia", name = "l", descriptor = "I")
	public static int anInt1119 = 0;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method1012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!aa;Lclient!uaa;Lclient!pu;IBIII)V")
	public static void method1014(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static660.anInt10605 == 4) {
			local18 = (int) Static157.aFloat83 & 0x3FFF;
		} else {
			local18 = (int) Static157.aFloat83 + Static213.anInt9568 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg1.anInt9649 / 2, arg1.anInt9606 / 2) + 10;
		@Pc(45) int local45 = arg5 * arg5 + arg4 * arg4;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(55) int local55 = Class200.anIntArray337[local18];
		@Pc(59) int local59 = Class200.anIntArray338[local18];
		if (Static660.anInt10605 != 4) {
			local55 = local55 * 256 / (Static569.anInt9215 + 256);
			local59 = local59 * 256 / (Static569.anInt9215 + 256);
		}
		@Pc(90) int local90 = arg4 * local59 + arg5 * local55 >> 14;
		@Pc(101) int local101 = local59 * arg5 - local55 * arg4 >> 14;
		arg2.method5990(local90 + arg3 + arg1.anInt9649 / 2 - arg2.method6003() / 2, arg6 + arg1.anInt9606 / 2 + -local101 + -(arg2.method6010() / 2), arg0, arg3, arg6);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method1015(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(19) String local19 = arg0[arg1];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(31) int local31 = arg2 + arg1;
			@Pc(33) int local33 = 0;
			for (@Pc(40) int local40 = arg1; local40 < local31; local40++) {
				@Pc(45) String local45 = arg0[local40];
				if (local45 == null) {
					local33 += 4;
				} else {
					local33 += local45.length();
				}
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local33);
			for (@Pc(65) int local65 = arg1; local65 < local31; local65++) {
				@Pc(70) String local70 = arg0[local65];
				if (local70 == null) {
					local63.append("null");
				} else {
					local63.append(local70);
				}
			}
			return local63.toString();
		}
	}
}
