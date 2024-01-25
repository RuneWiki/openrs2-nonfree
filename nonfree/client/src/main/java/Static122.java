import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "I")
	public static int anInt2785;

	@OriginalMember(owner = "client!ev", name = "w", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!ev", name = "y", descriptor = "[Lclient!xa;")
	public static Class119[] aClass119Array8;

	@OriginalMember(owner = "client!ev", name = "t", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_56 = new Class133(40, 4);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!qb;I)I")
	public static int method2337(@OriginalArg(0) Class6_Sub1_Sub2 arg0) {
		if (arg0.anInt8594 == 0) {
			return 0;
		}
		@Pc(63) int local63;
		@Pc(57) int local57;
		if (arg0.anInt8563 != -1) {
			@Pc(18) Class6_Sub1_Sub2 local18 = null;
			if (arg0.anInt8563 < 32768) {
				@Pc(44) Class3_Sub3 local44 = (Class3_Sub3) Static240.aClass267_20.method6644((long) arg0.anInt8563);
				if (local44 != null) {
					local18 = local44.aClass6_Sub1_Sub2_Sub2_1;
				}
			} else if (arg0.anInt8563 >= 32768) {
				local18 = Static498.aClass6_Sub1_Sub2_Sub1Array1[arg0.anInt8563 - 32768];
			}
			if (local18 != null) {
				local57 = arg0.anInt8811 - local18.anInt8811;
				local63 = arg0.anInt8813 - local18.anInt8813;
				if (local57 != 0 || local63 != 0) {
					arg0.method7085((int) (Math.atan2((double) local57, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class6_Sub1_Sub2_Sub1) {
			@Pc(155) Class6_Sub1_Sub2_Sub1 local155 = (Class6_Sub1_Sub2_Sub1) arg0;
			if (local155.anInt2290 != -1 && (local155.anInt8599 == 0 || local155.anInt8598 > 0)) {
				local155.method7085(local155.anInt2290);
				local155.anInt2290 = -1;
			}
		} else if (arg0 instanceof Class6_Sub1_Sub2_Sub2) {
			@Pc(89) Class6_Sub1_Sub2_Sub2 local89 = (Class6_Sub1_Sub2_Sub2) arg0;
			if (local89.anInt8604 != -1 && (local89.anInt8599 == 0 || local89.anInt8598 > 0)) {
				local57 = local89.anInt8811 - (local89.anInt8604 - Static223.anInt4827 - Static223.anInt4827) * 256;
				local63 = local89.anInt8813 - (local89.anInt8602 - Static150.anInt3027 - Static150.anInt3027) * 256;
				if (local57 != 0 || local63 != 0) {
					local89.method7085((int) (Math.atan2((double) local57, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
				local89.anInt8604 = -1;
			}
		}
		return arg0.method7084();
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIB)V")
	public static void method2338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub10_Sub16 local13 = Static362.method5701(arg0, 1);
		local13.method6211();
		local13.anInt7557 = arg1;
	}
}
