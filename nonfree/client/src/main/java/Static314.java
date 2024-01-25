import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
	public static int anInt9407;

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "Lclient!bi;")
	public static Class31 aClass31_119;

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage16;

	@OriginalMember(owner = "client!lw", name = "n", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array26;

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "Z")
	public static final boolean aBoolean669 = false;

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
	public static final int anInt9414 = 1403;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "([BB)Z")
	public static boolean method7735(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class4_Sub9 local8 = new Class4_Sub9(arg0);
		@Pc(12) int local12 = local8.method6015();
		if (local12 != 2) {
			return false;
		}
		@Pc(31) boolean local31 = local8.method6015() == 1;
		if (local31) {
			Static155.method3095(local8);
		}
		Static383.method5684(local8);
		return true;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)Lclient!wm;")
	public static Class4_Sub7_Sub18 method7736(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub7_Sub18 local12 = (Class4_Sub7_Sub18) Static302.aClass122_2.method3206((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static328.aClass31_69.method667(arg0, 0);
		if (local22 == null || local22.length <= 1) {
			return null;
		} else {
			local12 = Static552.method7614(local22);
			Static302.aClass122_2.method3207(local12, (long) arg0);
			return local12;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!ag;Z)Z")
	public static boolean method7738(@OriginalArg(0) Class10_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static112.aClass16Array3 == Static109.aClass16Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7344();
		if (arg0.aShort116 < 0 || arg0.aShort117 < 0 || arg0.aShort118 >= Static173.anInt3719 || arg0.aShort115 >= Static357.anInt6212) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort116; local36 <= arg0.aShort118; local36++) {
			for (local40 = arg0.aShort117; local40 <= arg0.aShort115; local40++) {
				@Pc(47) Class100 local47 = Static279.method4433(arg0.aByte101, local36, local40);
				if (local47 != null) {
					@Pc(51) int local51 = 0;
					if (local36 > arg0.aShort116) {
						local51++;
					}
					if (local36 < arg0.aShort118) {
						local51 += 4;
					}
					if (local40 > arg0.aShort117) {
						local51 += 8;
					}
					if (local40 < arg0.aShort115) {
						local51 += 2;
					}
					@Pc(76) Class35 local76 = Static404.method5842(local51, arg0);
					@Pc(79) Class35 local79 = local47.aClass35_2;
					if (local79 == null) {
						local47.aClass35_2 = local76;
					} else {
						while (local79.aClass35_1 != null) {
							local79 = local79.aClass35_1;
						}
						local79.aClass35_1 = local76;
					}
					local47.aByte36 = (byte) (local47.aByte36 | local51);
					if (local6 && (Static577.anIntArrayArray78[local36][local40] & 0xFF000000) != 0) {
						local8 = Static577.anIntArrayArray78[local36][local40];
						local10 = Static310.aShortArrayArray23[local36][local40];
						local12 = Static68.aByteArrayArray6[local36][local40];
					}
					if (local47.aClass10_Sub5_1 != null && local47.aClass10_Sub5_1.aShort125 > local33) {
						local33 = local47.aClass10_Sub5_1.aShort125;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort116; local40 <= arg0.aShort118; local40++) {
				for (@Pc(164) int local164 = arg0.aShort117; local164 <= arg0.aShort115; local164++) {
					if ((Static577.anIntArrayArray78[local40][local164] & 0xFF000000) == 0) {
						Static577.anIntArrayArray78[local40][local164] = local8;
						Static310.aShortArrayArray23[local40][local164] = local10;
						Static68.aByteArrayArray6[local40][local164] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static463.aClass10_Sub1Array3[Static593.anInt9755++] = arg0;
		}
		if (arg1) {
			arg0.anInt8931 -= local33;
		}
		return true;
	}
}
