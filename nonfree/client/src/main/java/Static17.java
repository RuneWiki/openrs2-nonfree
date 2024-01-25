import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "Lclient!xa;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!ao", name = "X", descriptor = "Lclient!eh;")
	public static Class4_Sub9 aClass4_Sub9_1;

	@OriginalMember(owner = "client!ao", name = "T", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZIIII)V")
	public static void method364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static189.aClass4_Sub2_Sub1_1.anInt9298 != 0 && arg1 != 0 && Static406.anInt7043 < 50 && arg0 != -1) {
			Static479.aClass22Array1[Static406.anInt7043++] = new Class22((byte) 2, arg0, arg1, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZZ)Lclient!fs;")
	public static Class4_Sub20 method367(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) long local17 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class4_Sub20) Static578.aClass183_42.method4289(local17);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZIIIIII)V")
	public static void method368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg6;
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg5 - arg2;
		@Pc(25) int local25 = arg6 - arg2;
		@Pc(29) int local29 = arg5 * arg5;
		@Pc(33) int local33 = arg6 * arg6;
		@Pc(37) int local37 = local20 * local20;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg6 << 1;
		@Pc(65) int local65 = local25 << 1;
		@Pc(74) int local74 = local45 + local29 * (1 - local61);
		@Pc(83) int local83 = local33 - local49 * (local61 - 1);
		@Pc(92) int local92 = local53 + (1 - local65) * local37;
		@Pc(100) int local100 = local41 - (local65 - 1) * local57;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 * 3;
		@Pc(126) int local126 = (local61 - 3) * local49;
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = local57 * (local65 - 3);
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = local104 * (arg6 - 1);
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = local112 * (local25 - 1);
		@Pc(156) int[] local156 = Static383.anIntArrayArray62[arg1];
		Static336.method5023(arg4, arg3 - local20, local156, arg3 - arg5);
		Static336.method5023(arg0, arg3 + local20, local156, arg3 - local20);
		Static336.method5023(arg4, arg5 + arg3, local156, arg3 + local20);
		while (local13 > 0) {
			@Pc(199) boolean local199 = local13 <= local25;
			if (local199) {
				if (local92 < 0) {
					while (local92 < 0) {
						local92 += local130;
						local100 += local146;
						local146 += local116;
						local130 += local116;
						local15++;
					}
				}
				if (local100 < 0) {
					local92 += local130;
					local100 += local146;
					local130 += local116;
					local15++;
					local146 += local116;
				}
				local100 += -local136;
				local92 += -local152;
				local152 -= local112;
				local136 -= local112;
			}
			if (local74 < 0) {
				while (local74 < 0) {
					local83 += local138;
					local74 += local120;
					local120 += local108;
					local138 += local108;
					local7++;
				}
			}
			if (local83 < 0) {
				local74 += local120;
				local83 += local138;
				local120 += local108;
				local7++;
				local138 += local108;
			}
			local74 += -local144;
			local83 += -local126;
			local144 -= local104;
			local126 -= local104;
			local13--;
			@Pc(339) int local339 = arg1 - local13;
			@Pc(343) int local343 = local13 + arg1;
			@Pc(348) int local348 = arg3 + local7;
			@Pc(352) int local352 = arg3 - local7;
			if (local199) {
				@Pc(377) int local377 = arg3 + local15;
				@Pc(382) int local382 = arg3 - local15;
				Static336.method5023(arg4, local382, Static383.anIntArrayArray62[local339], local352);
				Static336.method5023(arg0, local377, Static383.anIntArrayArray62[local339], local382);
				Static336.method5023(arg4, local348, Static383.anIntArrayArray62[local339], local377);
				Static336.method5023(arg4, local382, Static383.anIntArrayArray62[local343], local352);
				Static336.method5023(arg0, local377, Static383.anIntArrayArray62[local343], local382);
				Static336.method5023(arg4, local348, Static383.anIntArrayArray62[local343], local377);
			} else {
				Static336.method5023(arg4, local348, Static383.anIntArrayArray62[local339], local352);
				Static336.method5023(arg4, local348, Static383.anIntArrayArray62[local343], local352);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	public static void method369() {
		Static277.aClass223_40.method4941();
	}
}
