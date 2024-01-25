import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!t", name = "O", descriptor = "Lclient!me;")
	public static Class126 aClass126_1;

	@OriginalMember(owner = "client!t", name = "P", descriptor = "Lclient!am;")
	public static Class11 aClass11_132;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "I")
	public static int anInt6031 = 0;

	@OriginalMember(owner = "client!t", name = "D", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray104 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
	public static void method5062(@OriginalArg(0) int arg0) {
		Static235.anInt6715 = arg0;
		Static77.aClass154_24.method4219();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method5063() {
		Static147.aClass154_51.method4212();
		Static35.aClass154_7.method4212();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = Static325.aShort81 + (Static71.aShort35 - Static325.aShort81) * local7 / 100;
		@Pc(36) int local36 = arg1 * local30 >> 8;
		@Pc(43) int local43 = 16384 - arg0 & 0x3FFF;
		@Pc(49) int local49 = 16384 - arg2 & 0x3FFF;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = local36;
		if (local43 != 0) {
			local53 = -local36 * Class4_Sub4_Sub25.anIntArray384[local43] >> 15;
			local55 = Class4_Sub4_Sub25.anIntArray383[local43] * local36 >> 15;
		}
		if (local49 != 0) {
			local51 = local55 * Class4_Sub4_Sub25.anIntArray384[local49] >> 15;
			local55 = local55 * Class4_Sub4_Sub25.anIntArray383[local49] >> 15;
		}
		Static230.anInt4796 = arg6 - local51;
		Static105.anInt6098 = arg4 - local53;
		Static332.anInt6592 = arg2;
		Static133.anInt3056 = arg3 - local55;
		Static288.anInt5845 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!or;IIIII)V")
	public static void method5066(@OriginalArg(0) Class151 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6714 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static148.anIntArrayArrayArray13[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class4_Sub12_Sub1 local33 = Static126.aClass4_Sub12_Sub1Array1[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt6714; local35++) {
							if (arg0.aClass4_Sub12_Sub1Array3[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass4_Sub12_Sub1Array3[arg0.anInt6714++] = local33;
						if (arg0.anInt6714 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt6714; local7 < 4; local7++) {
			arg0.aClass4_Sub12_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!am;IIZI)V")
	public static void method5067(@OriginalArg(1) Class11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static297.anInt6002 = 0;
		Static74.aClass11_38 = arg0;
		Static59.anInt1267 = arg2;
		Static138.anInt3121 = arg1;
		Static252.aBoolean443 = false;
		Static160.anInt3616 = 10000;
		Static177.anInt5898 = 1;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)Z")
	public static boolean method5068() {
		return Static177.anInt5898 == 0 ? Static129.aClass4_Sub13_Sub3_1.method4903() : true;
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	public static void method5069() {
		if (Static106.aBoolean205 && Static77.aBooleanArray13[81] && Static282.anInt5713 > 2) {
			Static245.method4233((Class4_Sub18) Static248.aClass130_112.aClass4_144.aClass4_248.aClass4_248);
		} else {
			Static245.method4233((Class4_Sub18) Static248.aClass130_112.aClass4_144.aClass4_248);
		}
	}
}
