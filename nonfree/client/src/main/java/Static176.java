import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gj", name = "yd", descriptor = "Ljava/awt/Font;")
	public static Font aFont3;

	@OriginalMember(owner = "client!gj", name = "Sc", descriptor = "Lclient!of;")
	public static final Class230 aClass230_56 = new Class230(2, 14);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!bt;Z)Z")
	public static boolean method7614(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static205.aClass46Array1 == Static480.aClass46Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7122();
		if (arg0.aShort116 < 0 || arg0.aShort114 < 0 || arg0.aShort115 >= Static547.anInt9363 || arg0.aShort117 >= Static20.anInt358) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort116; local36 <= arg0.aShort115; local36++) {
			for (local40 = arg0.aShort114; local40 <= arg0.aShort117; local40++) {
				@Pc(47) Class133 local47 = Static90.method4174(arg0.aByte98, local36, local40);
				if (local47 != null) {
					@Pc(51) int local51 = 0;
					if (local36 > arg0.aShort116) {
						local51++;
					}
					if (local36 < arg0.aShort115) {
						local51 += 4;
					}
					if (local40 > arg0.aShort114) {
						local51 += 8;
					}
					if (local40 < arg0.aShort117) {
						local51 += 2;
					}
					@Pc(76) Class315 local76 = Static35.method581(local51, arg0);
					@Pc(79) Class315 local79 = local47.aClass315_1;
					if (local79 == null) {
						local47.aClass315_1 = local76;
					} else {
						while (local79.aClass315_3 != null) {
							local79 = local79.aClass315_3;
						}
						local79.aClass315_3 = local76;
					}
					local47.aByte46 = (byte) (local47.aByte46 | local51);
					if (local6 && (Static582.anIntArrayArray69[local36][local40] & 0xFF000000) != 0) {
						local8 = Static582.anIntArrayArray69[local36][local40];
						local10 = Static205.aShortArrayArray15[local36][local40];
						local12 = Static464.aByteArrayArray25[local36][local40];
					}
					if (local47.aClass15_Sub3_2 != null && local47.aClass15_Sub3_2.aShort99 > local33) {
						local33 = local47.aClass15_Sub3_2.aShort99;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort116; local40 <= arg0.aShort115; local40++) {
				for (@Pc(164) int local164 = arg0.aShort114; local164 <= arg0.aShort117; local164++) {
					if ((Static582.anIntArrayArray69[local40][local164] & 0xFF000000) == 0) {
						Static582.anIntArrayArray69[local40][local164] = local8;
						Static205.aShortArrayArray15[local40][local164] = local10;
						Static464.aByteArrayArray25[local40][local164] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static158.aClass15_Sub2Array1[Static398.anInt7207++] = arg0;
		}
		if (arg1) {
			arg0.anInt8915 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(BI)V")
	public static void method7615(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(8, arg0);
		local8.method3257();
	}
}
