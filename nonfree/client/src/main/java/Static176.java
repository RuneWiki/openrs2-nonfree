import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!ct;")
	public static Class30 aClass30_98;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_197 = new Class217(103, 3);

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_170 = new Class21(8);

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString59 = "";

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIII)V")
	public static void method5659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg1;
		@Pc(17) int local17 = -arg1;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static11.method912(arg0 + arg1, Static122.anInt1360, Static93.anInt5014);
		@Pc(36) int local36 = Static11.method912(arg0 - arg1, Static122.anInt1360, Static93.anInt5014);
		Static367.method6081(arg3, local36, Static43.anIntArrayArray57[arg2], local27);
		while (local14 > local12) {
			local19 += 2;
			local17 += local19;
			@Pc(68) int local68;
			@Pc(72) int local72;
			@Pc(90) int local90;
			@Pc(98) int local98;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local68 = arg2 - local14;
				local72 = local14 + arg2;
				if (local72 >= Static131.anInt2843 && local68 <= Static38.anInt945) {
					local90 = Static11.method912(arg0 + local12, Static122.anInt1360, Static93.anInt5014);
					local98 = Static11.method912(arg0 - local12, Static122.anInt1360, Static93.anInt5014);
					if (local72 <= Static38.anInt945) {
						Static367.method6081(arg3, local98, Static43.anIntArrayArray57[local72], local90);
					}
					if (local68 >= Static131.anInt2843) {
						Static367.method6081(arg3, local98, Static43.anIntArrayArray57[local68], local90);
					}
				}
			}
			local12++;
			local68 = arg2 - local12;
			local72 = arg2 + local12;
			if (local72 >= Static131.anInt2843 && local68 <= Static38.anInt945) {
				local90 = Static11.method912(local14 + arg0, Static122.anInt1360, Static93.anInt5014);
				local98 = Static11.method912(arg0 - local14, Static122.anInt1360, Static93.anInt5014);
				if (local72 <= Static38.anInt945) {
					Static367.method6081(arg3, local98, Static43.anIntArrayArray57[local72], local90);
				}
				if (local68 >= Static131.anInt2843) {
					Static367.method6081(arg3, local98, Static43.anIntArrayArray57[local68], local90);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!va;I)V")
	public static void method5663(@OriginalArg(0) Class11_Sub2_Sub6 arg0) {
		if (arg0 instanceof Class11_Sub2_Sub6_Sub2) {
			@Pc(13) Class11_Sub2_Sub6_Sub2 local13 = (Class11_Sub2_Sub6_Sub2) arg0;
			if (local13.aClass208_1 != null) {
				Static171.method3203(Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79 != local13.aByte79, local13);
			}
		} else if (arg0 instanceof Class11_Sub2_Sub6_Sub1) {
			@Pc(35) Class11_Sub2_Sub6_Sub1 local35 = (Class11_Sub2_Sub6_Sub1) arg0;
			Static243.method4538(local35.aByte79 != Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, local35);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method5670(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static225.method4177(arg1.length - 1, 0, arg1, arg0);
	}
}
