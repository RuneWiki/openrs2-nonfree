import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!iu;")
	public static Class123 aClass123_197;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Z")
	public static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public static int anInt3895 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZIIIILclient!he;)V")
	public static void method3214(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class100 arg2) {
		Static399.anInt7157 = arg1;
		Static336.anInt5845 = 10000;
		Static35.aClass100_7 = arg2;
		Static342.aBoolean369 = false;
		Static445.anInt7975 = 1;
		Static387.anInt6869 = arg0;
		Static386.anInt6865 = 0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!is;III)V")
	public static void method3215(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static441.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt7773 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass6_Sub11Array3[arg0.anInt7773++] = Static411.aClass76Array1[local21 - 1].aClass6_Sub11_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt7773; local21 < 4; local21++) {
			arg0.aClass6_Sub11Array3[local21] = null;
		}
	}
}
