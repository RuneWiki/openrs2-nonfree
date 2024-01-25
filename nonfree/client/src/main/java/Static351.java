import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "[I")
	public static int[] anIntArray458;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
	public static int anInt6324;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	public static void method4987(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static139.method2522(7, arg0);
		local13.method1563();
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)Lclient!il;")
	public static Class111 method4988() {
		try {
			return (Class111) Class.forName("Class111_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)Lclient!vg;")
	public static Class247 method4989(@OriginalArg(0) int arg0) {
		@Pc(16) Class247[] local16 = Static197.method3514();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class247 local24 = local16[local18];
			if (local24.anInt7282 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V")
	public static void method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(17) int local17 = -arg0;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static439.method5863(arg0 + arg1, Static450.anInt7594, Static142.anInt3212);
		@Pc(36) int local36 = Static439.method5863(arg1 - arg0, Static450.anInt7594, Static142.anInt3212);
		Static15.method463(arg3, Static376.anIntArrayArray64[arg2], local36, local27);
		while (local7 < local9) {
			local19 += 2;
			local17 += local19;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(85) int local85;
			@Pc(93) int local93;
			if (local17 > 0) {
				local9--;
				local17 -= local9 << 1;
				local67 = arg2 - local9;
				local71 = arg2 + local9;
				if (Static161.anInt3448 <= local71 && local67 <= Static163.anInt3488) {
					local85 = Static439.method5863(local7 + arg1, Static450.anInt7594, Static142.anInt3212);
					local93 = Static439.method5863(arg1 - local7, Static450.anInt7594, Static142.anInt3212);
					if (Static163.anInt3488 >= local71) {
						Static15.method463(arg3, Static376.anIntArrayArray64[local71], local93, local85);
					}
					if (local67 >= Static161.anInt3448) {
						Static15.method463(arg3, Static376.anIntArrayArray64[local67], local93, local85);
					}
				}
			}
			local7++;
			local67 = arg2 - local7;
			local71 = local7 + arg2;
			if (local71 >= Static161.anInt3448 && local67 <= Static163.anInt3488) {
				local85 = Static439.method5863(arg1 + local9, Static450.anInt7594, Static142.anInt3212);
				local93 = Static439.method5863(arg1 - local9, Static450.anInt7594, Static142.anInt3212);
				if (Static163.anInt3488 >= local71) {
					Static15.method463(arg3, Static376.anIntArrayArray64[local71], local93, local85);
				}
				if (Static161.anInt3448 <= local67) {
					Static15.method463(arg3, Static376.anIntArrayArray64[local67], local93, local85);
				}
			}
		}
	}
}
