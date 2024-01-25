import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIILclient!kka;IIIILclient!nv;I)V")
	public static void method1788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class205 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class258 arg9, @OriginalArg(11) int arg10) {
		Static529.anInt9098 = arg5;
		Static187.anInt3095 = arg10;
		Static631.aClass266_3 = null;
		Static148.anInt2313 = arg6;
		Static142.aClass266_1 = null;
		Static190.aClass266_2 = null;
		Static382.anInt6717 = arg1;
		Static630.anInt10333 = arg0;
		Static383.anInt6724 = arg2;
		Static443.aClass258_10 = arg9;
		Static149.anInt2321 = arg7;
		Static85.aClass205_2 = arg4;
		Static315.anInt5524 = arg8;
		Static615.anInt10126 = arg3;
		Static342.method5223();
		Static524.aBoolean668 = true;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)I")
	public static int method1790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static120.anInt1937 < 100) {
			return -2;
		}
		@Pc(13) int local13 = -2;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(20) int local20 = arg1 - Static224.anInt1291;
		@Pc(24) int local24 = arg0 - Static224.anInt1292;
		for (@Pc(29) Class14_Sub39 local29 = (Class14_Sub39) Static224.aClass32_4.method584(); local29 != null; local29 = (Class14_Sub39) Static224.aClass32_4.method577()) {
			if (arg2 == local29.anInt8785) {
				@Pc(37) int local37 = local29.anInt8788;
				@Pc(40) int local40 = local29.anInt8790;
				@Pc(50) int local50 = local37 + Static224.anInt1291 << 14 | local40 + Static224.anInt1292;
				@Pc(70) int local70 = (local24 - local40) * (-local40 + local24) + (local20 - local37) * (-local37 + local20);
				if (local13 < 0 || local15 > local70) {
					local13 = local50;
					local15 = local70;
				}
			}
		}
		return local13;
	}
}
