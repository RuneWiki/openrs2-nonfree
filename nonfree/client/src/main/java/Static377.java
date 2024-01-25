import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!sv", name = "U", descriptor = "I")
	public static int anInt6467;

	@OriginalMember(owner = "client!sv", name = "P", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_165 = new Class131(33, 2);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIB)V")
	public static void method5162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static268.aClass211ArrayArrayArray4 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		@Pc(25) Class1_Sub20 local25 = (Class1_Sub20) Static184.aClass27_23.method553(local19);
		if (local25 == null) {
			Static112.method1699(arg0, arg1, arg2);
			return;
		}
		@Pc(39) Class1_Sub18 local39 = (Class1_Sub18) local25.aClass266_29.method6000();
		if (local39 == null) {
			Static112.method1699(arg0, arg1, arg2);
			return;
		}
		@Pc(61) Class26_Sub5_Sub1 local61 = (Class26_Sub5_Sub1) Static112.method1699(arg0, arg1, arg2);
		if (local61 == null) {
			local61 = new Class26_Sub5_Sub1();
		} else {
			local61.anInt2714 = local61.anInt2708 = -1;
		}
		local61.anInt2710 = local39.anInt3167;
		local61.anInt2707 = local39.anInt3163;
		label44: while (true) {
			@Pc(89) Class1_Sub18 local89 = (Class1_Sub18) local25.aClass266_29.method5994();
			if (local89 == null) {
				break;
			}
			if (local89.anInt3167 != local61.anInt2710) {
				local61.anInt2714 = local89.anInt3167;
				local61.anInt2705 = local89.anInt3163;
				while (true) {
					@Pc(110) Class1_Sub18 local110 = (Class1_Sub18) local25.aClass266_29.method5994();
					if (local110 == null) {
						break label44;
					}
					if (local110.anInt3167 != local61.anInt2710 && local61.anInt2714 != local110.anInt3167) {
						local61.anInt2709 = local110.anInt3163;
						local61.anInt2708 = local110.anInt3167;
					}
				}
			}
		}
		@Pc(154) int local154 = Static289.method4078((arg1 << 7) + 64, (arg2 << 7) - -64, arg0);
		Static116.method1715(arg0, arg1, arg2, local154, local61);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(II)V")
	public static void method5163(@OriginalArg(1) int arg0) {
		Static301.anInt3999 = arg0;
		Static199.aClass83_32.method1669();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIII)V")
	public static void method5166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static262.anInt4661; local7++) {
			@Pc(13) Rectangle local13 = Class1_Sub45.aRectangleArray2[local7];
			if (arg3 < local13.width + local13.x && arg0 + arg3 > local13.x && arg1 < local13.height + local13.y && arg2 + arg1 > local13.y) {
				Static22.aBooleanArray12[local7] = true;
			}
		}
	}
}
