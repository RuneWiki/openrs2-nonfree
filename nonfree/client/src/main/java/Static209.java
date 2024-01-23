import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public static int anInt4459;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	public static int anInt4460;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	public static int anInt4462;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Z")
	public static boolean aBoolean396 = false;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1182 = Static231.method3737("www)2wtrc");

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1183 = Static231.method3737(")3)3)3");

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Z")
	public static boolean aBoolean397 = false;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	public static int anInt4461 = 5063219;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1184 = Static231.method3737("3D)2Softwarebibliothek gestartet)3");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!jb;Lclient!jb;)V")
	public static void method3308(@OriginalArg(1) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		Static13.aClass28_4 = arg1;
		Static72.aClass28_30 = arg0;
		Static224.anInt4886 = Static72.aClass28_30.method832(3);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)J")
	public static synchronized long method3309() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static98.aLong80 > local5) {
			Static71.aLong55 += Static98.aLong80 - local5;
		}
		Static98.aLong80 = local5;
		return Static71.aLong55 + local5;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!eg;I)V")
	public static void method3310(@OriginalArg(0) Class5_Sub5 arg0) {
		if (arg0.anInt3004 == 0) {
			return;
		}
		@Pc(37) int local37;
		@Pc(43) int local43;
		if (arg0.anInt3025 != -1 && arg0.anInt3025 < 32768) {
			@Pc(28) Class5_Sub5_Sub2 local28 = Static33.aClass5_Sub5_Sub2Array1[arg0.anInt3025];
			if (local28 != null) {
				local37 = arg0.anInt3021 - local28.anInt3021;
				local43 = arg0.anInt3044 - local28.anInt3044;
				if (local37 != 0 || local43 != 0) {
					arg0.anInt2994 = (int) (Math.atan2((double) local37, (double) local43) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(76) int local76;
		if (arg0.anInt3025 >= 32768) {
			local76 = arg0.anInt3025 - 32768;
			if (Static137.anInt2980 == local76) {
				local76 = 2047;
			}
			@Pc(85) Class5_Sub5_Sub1 local85 = Static198.aClass5_Sub5_Sub1Array1[local76];
			if (local85 != null) {
				@Pc(94) int local94 = arg0.anInt3044 - local85.anInt3044;
				local43 = arg0.anInt3021 - local85.anInt3021;
				if (local43 != 0 || local94 != 0) {
					arg0.anInt2994 = (int) (Math.atan2((double) local43, (double) local94) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3011 != 0 || arg0.anInt3026 != 0) && (arg0.anInt3006 == 0 || arg0.anInt3019 > 0)) {
			local76 = arg0.anInt3021 + arg0.anInt2997 * 64 - (arg0.anInt3011 - Static36.anInt764 - Static36.anInt764) * 64 - 64;
			local37 = arg0.anInt2997 * 64 + arg0.anInt3044 - (arg0.anInt3026 - Static152.anInt3377 - Static152.anInt3377) * 64 - 64;
			if (local76 != 0 || local37 != 0) {
				arg0.anInt2994 = (int) (Math.atan2((double) local76, (double) local37) * 325.949D) & 0x7FF;
			}
			arg0.anInt3026 = 0;
			arg0.anInt3011 = 0;
		}
		local76 = arg0.anInt2994 - arg0.anInt3040 & 0x7FF;
		if (local76 == 0) {
			arg0.anInt2993 = 0;
			return;
		}
		arg0.anInt2993++;
		@Pc(253) boolean local253;
		if (local76 <= 1024) {
			arg0.anInt3040 += arg0.anInt3004;
			local253 = true;
			if (arg0.anInt3004 > local76 || 2048 - arg0.anInt3004 < local76) {
				local253 = false;
				arg0.anInt3040 = arg0.anInt2994;
			}
			if (arg0.anInt3022 == arg0.anInt3005 && (arg0.anInt2993 > 25 || local253)) {
				if (arg0.anInt3007 == -1) {
					arg0.anInt3005 = arg0.anInt3037;
				} else {
					arg0.anInt3005 = arg0.anInt3007;
				}
			}
		} else {
			arg0.anInt3040 -= arg0.anInt3004;
			local253 = true;
			if (arg0.anInt3004 > local76 || local76 > 2048 - arg0.anInt3004) {
				local253 = false;
				arg0.anInt3040 = arg0.anInt2994;
			}
			if (arg0.anInt3005 == arg0.anInt3022 && (arg0.anInt2993 > 25 || local253)) {
				if (arg0.anInt3030 == -1) {
					arg0.anInt3005 = arg0.anInt3037;
				} else {
					arg0.anInt3005 = arg0.anInt3030;
				}
			}
		}
		arg0.anInt3040 &= 0x7FF;
	}
}
