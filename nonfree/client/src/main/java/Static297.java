import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public static int anInt5466;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public static int anInt5467;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_58 = new Class243(27, 15);

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!jt;")
	public static final Class150 aClass150_11 = new Class150(3);

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!k;III[Z)V")
	public static void method4693(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static532.aClass75Array3 == Static427.aClass75Array2) {
			return;
		}
		@Pc(9) int local9 = Static164.aClass75Array1[arg1].aa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class75 local22 = Static164.aClass75Array1[local11];
				if (local22 != null) {
					local22.F(arg0, arg2, local9 - local22.aa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!n;ILjava/awt/Canvas;)Lclient!qa;")
	public static Class39 method4695(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) Canvas arg1) {
		return new a(arg1, arg0);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
	public static void method4696() {
		Static93.method1721(Static240.aClass243_51);
		Static381.aClass2_Sub29_Sub2_2.method5217(Static199.anInt3587);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(CB)Z")
	public static boolean method4697(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)I")
	public static int method4698() {
		if (Static72.aClass310_4 == null) {
			if (!Static452.aBoolean600 && Static323.anInt6016 > 0) {
				if (Static150.aBoolean224 && Static311.aClass189_1.method4710(81) && Static323.anInt6016 > 2) {
					return ((Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283.aClass2_283).anInt8464;
				}
				return ((Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283).anInt8464;
			}
			@Pc(42) int local42 = Static61.aClass214_1.method7241();
			@Pc(46) int local46 = Static61.aClass214_1.method7240();
			@Pc(48) int local48 = Static536.anInt9313;
			@Pc(50) int local50 = Static178.anInt3307;
			@Pc(52) int local52 = Static529.anInt9144;
			if (local42 > local48 && local42 < local48 + local52) {
				@Pc(67) int local67 = -1;
				@Pc(86) int local86;
				for (@Pc(69) int local69 = 0; local69 < Static323.anInt6016; local69++) {
					if (Static254.aBoolean340) {
						local86 = local50 + (Static323.anInt6016 - local69 - 1) * 16 + 33;
						if (local46 > local86 - 13 && local46 <= local86 + 3) {
							local67 = local69;
						}
					} else {
						local86 = local50 + (-local69 + -1 + Static323.anInt6016) * 16 + 31;
						if (local46 > local86 - 13 && local46 <= local86 + 3) {
							local67 = local69;
						}
					}
				}
				if (local67 != -1) {
					local86 = 0;
					@Pc(147) Class291 local147 = new Class291(Static448.aClass249_63);
					for (@Pc(152) Class2_Sub44 local152 = (Class2_Sub44) local147.method7336(); local152 != null; local152 = (Class2_Sub44) local147.method7338()) {
						if (local67 == local86++) {
							return local152.anInt8464;
						}
					}
				}
			}
		}
		return -1;
	}
}
