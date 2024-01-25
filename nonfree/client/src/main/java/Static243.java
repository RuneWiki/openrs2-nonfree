import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!kaa", name = "z", descriptor = "I")
	public static int anInt4683;

	@OriginalMember(owner = "client!kaa", name = "v", descriptor = "I")
	public static int anInt4679 = -2;

	@OriginalMember(owner = "client!kaa", name = "C", descriptor = "S")
	public static short aShort76 = 256;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIB[B[BII)V")
	public static void method4101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg2++;
				arg4[local34] = (byte) (arg4[local34] - arg5[arg0++]);
				@Pc(47) int local47 = arg2++;
				arg4[local47] = (byte) (arg4[local47] - arg5[arg0++]);
				@Pc(60) int local60 = arg2++;
				arg4[local60] = (byte) (arg4[local60] - arg5[arg0++]);
				@Pc(73) int local73 = arg2++;
				arg4[local73] = (byte) (arg4[local73] - arg5[arg0++]);
			}
			for (@Pc(92) int local92 = local15; local92 < 0; local92++) {
				local34 = arg2++;
				arg4[local34] = (byte) (arg4[local34] - arg5[arg0++]);
			}
			arg0 += arg3;
			arg2 += arg1;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BZI)V")
	public static void method4102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static62.aClass1_Sub13_1 == null) {
			Static62.aClass1_Sub13_1 = new Class1_Sub13(20000);
		}
		Static62.aClass1_Sub13_1.method3041(arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static375.method5714(Static62.aClass1_Sub13_1.aByteArray45);
		Static538.aClass50_Sub1Array2 = new Class50_Sub1[Static265.anInt5151];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = Static503.anInt8544; local35 <= Static137.anInt3222; local35++) {
			@Pc(40) Class50_Sub1 local40 = Static467.method6823(local35);
			if (local40 != null) {
				Static538.aClass50_Sub1Array2[local33++] = local40;
			}
		}
		Static445.aBoolean497 = false;
		Static124.aLong132 = Static93.method2172();
		Static62.aClass1_Sub13_1 = null;
	}
}
