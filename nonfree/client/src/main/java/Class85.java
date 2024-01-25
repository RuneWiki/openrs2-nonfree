import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public class Class85 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "[I")
	private final int[] anIntArray271 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "[I")
	private final int[] anIntArray270 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
	protected final int anInt2714;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "Z")
	public final boolean aBoolean202;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "Lclient!pp;")
	private final Class233 aClass233_5;

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "Lclient!dba;")
	private final Class58 aClass58_6;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
	protected final int anInt2712;

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
	public final int anInt2722;

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIZLclient!pp;Lclient!dba;)V")
	protected Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class233 arg4, @OriginalArg(5) Class58 arg5) {
		this.anInt2714 = arg2;
		this.aBoolean202 = arg3;
		this.aClass233_5 = arg4;
		this.aClass58_6 = arg5;
		this.anInt2712 = arg1;
		this.anInt2722 = arg0;
		this.aByteArrayArrayArray15 = new byte[this.anInt2722][this.anInt2712][this.anInt2714];
		this.aByteArrayArrayArray16 = new byte[this.anInt2722][this.anInt2712][this.anInt2714];
		this.aByteArrayArrayArray13 = new byte[this.anInt2722][this.anInt2712 + 1][this.anInt2714 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt2722][this.anInt2712][this.anInt2714];
		this.anIntArrayArrayArray6 = new int[this.anInt2722][this.anInt2712 + 1][this.anInt2714 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt2722][this.anInt2712][this.anInt2714];
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!d;I[[ILclient!oa;Lclient!d;Lclient!d;I)V")
	private void method2279(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) Class52 arg4, @OriginalArg(5) Class52 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray15[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray14[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray12[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray16[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2712; local27++) {
			@Pc(45) int local45 = this.anInt2712 - 1 <= local27 ? local27 : local27 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt2714; local47++) {
				@Pc(61) int local61 = local47 >= this.anInt2714 - 1 ? local47 : local47 + 1;
				if (Static132.anInt2742 == -1 || Static151.method2599(local27, local47, Static132.anInt2742, arg1)) {
					@Pc(75) boolean local75 = false;
					@Pc(77) boolean local77 = false;
					@Pc(80) boolean[] local80 = new boolean[4];
					@Pc(86) int local86 = local10[local27][local47];
					@Pc(92) int local92 = local15[local27][local47];
					@Pc(100) int local100 = local25[local27][local47] & 0xFF;
					@Pc(108) int local108 = local20[local27][local47] & 0xFF;
					@Pc(116) int local116 = local20[local27][local61] & 0xFF;
					@Pc(124) int local124 = local20[local45][local61] & 0xFF;
					@Pc(132) int local132 = local20[local45][local47] & 0xFF;
					if (local100 != 0 || local108 != 0) {
						@Pc(154) Class240 local154 = local100 == 0 ? null : this.aClass233_5.method5910(local100 - 1);
						@Pc(169) Class266 local169 = local108 == 0 ? null : this.aClass58_6.method1561(local108 - 1);
						if (local86 == 0 && local154 == null) {
							local86 = 12;
						}
						@Pc(177) Class240 local177 = local154;
						if (local154 != null) {
							if (local154.anInt7141 == -1 && local154.anInt7142 == -1) {
								local177 = local154;
								local154 = null;
							} else if (local169 != null && local86 != 0) {
								local77 = local154.aBoolean472;
							}
						}
						@Pc(258) int local258;
						@Pc(311) int local311;
						@Pc(383) int local383;
						@Pc(395) int local395;
						if ((local86 == 0 || local86 == 12) && local27 > 0 && local47 > 0 && this.anInt2712 > local27 && local47 < this.anInt2714) {
							local258 = local108 == local20[local27 - 1][local47 - 1] ? 1 : -1;
							@Pc(279) int local279 = local20[local45][local47 - 1] == local108 ? 1 : -1;
							@Pc(296) int local296 = local20[local45][local61] == local108 ? 1 : -1;
							local311 = local108 == local20[local27 - 1][local61] ? 1 : -1;
							if (local20[local27][local47 - 1] == local108) {
								local279++;
								local258++;
							} else {
								local279--;
								local258--;
							}
							if (local20[local45][local47] == local108) {
								local279++;
								local296++;
							} else {
								local296--;
								local279--;
							}
							if (local20[local27][local61] == local108) {
								local311++;
								local296++;
							} else {
								local311--;
								local296--;
							}
							if (local108 == local20[local27 - 1][local47]) {
								local311++;
								local258++;
							} else {
								local258--;
								local311--;
							}
							local383 = local258 - local296;
							if (local383 < 0) {
								local383 = -local383;
							}
							local395 = local279 - local311;
							if (local395 < 0) {
								local395 = -local395;
							}
							if (local383 == local395) {
								local383 = arg0.JA(local27, local47) - arg0.JA(local45, local61);
								local395 = arg0.JA(local45, local47) - arg0.JA(local27, local61);
								if (local383 < 0) {
									local383 = -local383;
								}
								if (local395 < 0) {
									local395 = -local395;
								}
							}
							local92 = local383 >= local395 ? 0 : 1;
						}
						for (local258 = 0; local258 < 13; local258++) {
							Static174.anIntArray382[local258] = -1;
							Static475.anIntArray735[local258] = 1;
						}
						@Pc(481) boolean[] local481 = local154 != null && local154.aBoolean472 ? Static490.aBooleanArrayArray7[local86] : Static371.aBooleanArrayArray6[local86];
						this.method2284(local47, this.anInt2714, local27, local86, local92, arg3, local10, local25, this.anInt2712, local154, local169, local15, local80);
						@Pc(514) boolean local514 = local154 != null && local154.anInt7141 != local154.anInt7142;
						if (!local514) {
							for (local311 = 0; local311 < 8; local311++) {
								if (Static174.anIntArray382[local311] >= 0 && Static358.anIntArray579[local311] != Static376.anIntArray752[local311]) {
									local514 = true;
									break;
								}
							}
						}
						if (!local481[local92 + 1 & 0x3]) {
							local80[1] = Static83.method1709(local80[1], (Static475.anIntArray735[2] & Static475.anIntArray735[4]) == 0);
						}
						if (!local481[local92 + 3 & 0x3]) {
							local80[3] = Static83.method1709(local80[3], (Static475.anIntArray735[6] & Static475.anIntArray735[0]) == 0);
						}
						if (!local481[local92 & 0x3]) {
							local80[0] = Static83.method1709(local80[0], (Static475.anIntArray735[2] & Static475.anIntArray735[0]) == 0);
						}
						if (!local481[local92 + 2 & 0x3]) {
							local80[2] = Static83.method1709(local80[2], (Static475.anIntArray735[4] & Static475.anIntArray735[6]) == 0);
						}
						if (!local77 && (local86 == 0 || local86 == 12)) {
							if (local80[0] && !local80[1] && !local80[2] && local80[3]) {
								local80[0] = local80[3] = false;
								local92 = 0;
								local86 = local86 == 0 ? 13 : 14;
							} else if (local80[0] && local80[1] && !local80[2] && !local80[3]) {
								local80[0] = local80[1] = false;
								local92 = 3;
								local86 = local86 == 0 ? 13 : 14;
							} else if (!local80[0] && local80[1] && local80[2] && !local80[3]) {
								local80[1] = local80[2] = false;
								local86 = local86 == 0 ? 13 : 14;
								local92 = 2;
							} else if (!local80[0] && !local80[1] && local80[2] && local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local80[2] = local80[3] = false;
								local92 = 1;
							}
						}
						@Pc(821) boolean local821 = !local77 && !local80[0] && !local80[2] && !local80[1] && !local80[3];
						@Pc(823) int[] local823 = null;
						@Pc(841) int[] local841;
						@Pc(845) int[] local845;
						@Pc(829) int[] local829;
						if (local821) {
							local829 = Static2.anIntArrayArray13[local86];
							local383 = local169 == null ? 0 : Static441.anIntArray680[local86];
							local841 = Static207.anIntArrayArray47[local86];
							local845 = Static436.anIntArrayArray76[local86];
							local395 = local154 == null ? 0 : Static124.anIntArray751[local86];
						} else if (local77) {
							local845 = Static520.anIntArrayArray86[local86];
							local829 = Static43.anIntArrayArray17[local86];
							local823 = Static132.anIntArrayArray30[local86];
							local395 = local154 == null ? 0 : Static22.anIntArray692[local86];
							local841 = Static285.anIntArrayArray52[local86];
							local383 = local169 == null ? 0 : Static494.anIntArray743[local86];
						} else {
							local841 = Static53.anIntArrayArray18[local86];
							local829 = Static216.anIntArrayArray28[local86];
							local845 = Static409.anIntArrayArray73[local86];
							local383 = local169 == null ? 0 : Static545.anIntArray779[local86];
							local395 = local154 == null ? 0 : Static160.anIntArray372[local86];
							local823 = Static215.anIntArrayArray48[local86];
						}
						@Pc(926) int local926 = local395 + local383;
						if (local926 <= 0) {
							Static343.method5436(arg1, local27, local47);
						} else {
							if (local80[0]) {
								local926++;
							}
							if (local80[2]) {
								local926++;
							}
							if (local80[1]) {
								local926++;
							}
							if (local80[3]) {
								local926++;
							}
							@Pc(956) int local956 = 0;
							@Pc(958) int local958 = 0;
							@Pc(962) int local962 = local926 * 3;
							@Pc(969) int[] local969 = local514 ? new int[local962] : null;
							@Pc(972) int[] local972 = new int[local962];
							@Pc(975) int[] local975 = new int[local962];
							@Pc(978) int[] local978 = new int[local962];
							@Pc(981) int[] local981 = new int[local962];
							@Pc(984) int[] local984 = new int[local962];
							@Pc(991) int[] local991 = arg4 == null ? null : new int[local962];
							@Pc(1000) int[] local1000 = arg4 == null && arg5 == null ? null : new int[local962];
							@Pc(1002) int local1002 = -1;
							@Pc(1004) int local1004 = -1;
							@Pc(1006) int local1006 = 256;
							@Pc(1084) byte local1084;
							@Pc(1028) int local1028;
							@Pc(1030) int local1030;
							@Pc(1265) int local1265;
							@Pc(1271) int local1271;
							@Pc(1279) int local1279;
							@Pc(1284) int local1284;
							@Pc(1296) int local1296;
							@Pc(1289) int local1289;
							@Pc(1301) int local1301;
							@Pc(1361) int local1361;
							@Pc(1367) int local1367;
							if (local154 != null) {
								local1002 = local154.anInt7141;
								local1004 = arg3.method7462() ? local154.anInt7137 : local154.anInt7136;
								local1006 = local154.anInt7145;
								local1028 = Static34.method836(arg3, local154);
								for (local1030 = 0; local1030 < local395; local1030++) {
									if (local80[-local92 & 0x3] && local823[0] == local956) {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = 1;
										Static534.anIntArray770[2] = local829[local956];
										Static534.anIntArray770[3] = 1;
										Static534.anIntArray770[4] = local845[local956];
										Static534.anIntArray770[5] = local829[local956];
										local1084 = 6;
									} else if (local80[2 - local92 & 0x3] && local823[2] == local956) {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = 5;
										Static534.anIntArray770[2] = local829[local956];
										Static534.anIntArray770[3] = 5;
										Static534.anIntArray770[4] = local845[local956];
										local1084 = 6;
										Static534.anIntArray770[5] = local829[local956];
									} else if (local80[1 - local92 & 0x3] && local823[1] == local956) {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = 3;
										Static534.anIntArray770[2] = local829[local956];
										Static534.anIntArray770[3] = 3;
										Static534.anIntArray770[4] = local845[local956];
										Static534.anIntArray770[5] = local829[local956];
										local1084 = 6;
									} else if (local80[3 - local92 & 0x3] && local823[3] == local956) {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = 7;
										Static534.anIntArray770[2] = local829[local956];
										Static534.anIntArray770[3] = 7;
										Static534.anIntArray770[4] = local845[local956];
										Static534.anIntArray770[5] = local829[local956];
										local1084 = 6;
									} else {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = local845[local956];
										Static534.anIntArray770[2] = local829[local956];
										local1084 = 3;
									}
									for (local1265 = 0; local1265 < local1084; local1265++) {
										local1271 = Static534.anIntArray770[local1265];
										local1279 = local1271 - local92 * 2 & 0x7;
										local1284 = this.anIntArray270[local1271];
										local1289 = this.anIntArray271[local1271];
										if (local92 == 1) {
											local1296 = local1289;
											local1301 = 512 - local1284;
										} else if (local92 == 2) {
											local1296 = 512 - local1284;
											local1301 = 512 - local1289;
										} else if (local92 == 3) {
											local1301 = local1284;
											local1296 = 512 - local1289;
										} else {
											local1296 = local1284;
											local1301 = local1289;
										}
										local972[local958] = local1296;
										local975[local958] = local1301;
										if (local991 != null && Static329.aBooleanArrayArray5[local86][local1271]) {
											local1361 = (local27 << 9) + local1296;
											local1367 = local1301 + (local47 << 9);
											local991[local958] = arg4.sa(local1361, local1367) - arg0.sa(local1361, local1367);
										}
										if (local1000 != null) {
											if (arg4 != null && !Static329.aBooleanArrayArray5[local86][local1271]) {
												local1361 = local1296 + (local27 << 9);
												local1367 = local1301 + (local47 << 9);
												local1000[local958] = arg0.sa(local1361, local1367) - arg4.sa(local1361, local1367);
											} else if (arg5 != null && !Static542.aBooleanArrayArray8[local86][local1271]) {
												local1361 = (local27 << 9) + local1296;
												local1367 = (local47 << 9) + local1301;
												local1000[local958] = arg5.sa(local1361, local1367) - arg0.sa(local1361, local1367);
											}
										}
										if (local1271 < 8 && local154.anInt7138 < Static174.anIntArray382[local1279]) {
											if (local969 != null) {
												local969[local958] = Static376.anIntArray752[local1279];
											}
											local984[local958] = Static102.anIntArray529[local1279];
											local981[local958] = Static425.anIntArray669[local1279];
											local978[local958] = Static358.anIntArray579[local1279];
										} else {
											if (local969 != null) {
												local969[local958] = local1028;
											}
											local981[local958] = arg3.method7462() ? local154.anInt7137 : local154.anInt7136;
											local984[local958] = local154.anInt7145;
											local978[local958] = local1002;
										}
										local958++;
									}
									local956++;
								}
								if (!this.aBoolean202 && arg1 == 0) {
									Static476.method6337(local27, local47, local154.anInt7131, local154.anInt7134 * 8, local154.anInt7135);
								}
								if (local86 != 12 && local154.anInt7141 != -1 && local154.aBoolean474) {
									local75 = true;
								}
							} else if (local821) {
								local956 = Static124.anIntArray751[local86];
							} else if (local77) {
								local956 = Static22.anIntArray692[local86];
							} else {
								local956 = Static160.anIntArray372[local86];
							}
							if (local169 != null) {
								if (local132 == 0) {
									local132 = local108;
								}
								if (local116 == 0) {
									local116 = local108;
								}
								if (local124 == 0) {
									local124 = local108;
								}
								@Pc(1613) Class266 local1613 = this.aClass58_6.method1561(local108 - 1);
								@Pc(1623) Class266 local1623 = this.aClass58_6.method1561(local116 - 1);
								@Pc(1631) Class266 local1631 = this.aClass58_6.method1561(local124 - 1);
								@Pc(1639) Class266 local1639 = this.aClass58_6.method1561(local132 - 1);
								for (local1279 = 0; local1279 < local383; local1279++) {
									if (local80[-local92 & 0x3] && local823[0] == local956) {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = 1;
										Static534.anIntArray770[2] = local829[local956];
										Static534.anIntArray770[3] = 1;
										Static534.anIntArray770[4] = local845[local956];
										local1084 = 6;
										Static534.anIntArray770[5] = local829[local956];
									} else if (local80[2 - local92 & 0x3] && local956 == local823[2]) {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = 5;
										Static534.anIntArray770[2] = local829[local956];
										Static534.anIntArray770[3] = 5;
										Static534.anIntArray770[4] = local845[local956];
										local1084 = 6;
										Static534.anIntArray770[5] = local829[local956];
									} else if (local80[1 - local92 & 0x3] && local823[1] == local956) {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = 3;
										Static534.anIntArray770[2] = local829[local956];
										Static534.anIntArray770[3] = 3;
										Static534.anIntArray770[4] = local845[local956];
										Static534.anIntArray770[5] = local829[local956];
										local1084 = 6;
									} else if (local80[3 - local92 & 0x3] && local823[3] == local956) {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = 7;
										Static534.anIntArray770[2] = local829[local956];
										Static534.anIntArray770[3] = 7;
										Static534.anIntArray770[4] = local845[local956];
										Static534.anIntArray770[5] = local829[local956];
										local1084 = 6;
									} else {
										Static534.anIntArray770[0] = local841[local956];
										Static534.anIntArray770[1] = local845[local956];
										Static534.anIntArray770[2] = local829[local956];
										local1084 = 3;
									}
									for (local1284 = 0; local1284 < local1084; local1284++) {
										local1296 = Static534.anIntArray770[local1284];
										local1289 = local1296 - local92 * 2 & 0x7;
										local1301 = this.anIntArray270[local1296];
										local1367 = this.anIntArray271[local1296];
										@Pc(1907) int local1907;
										if (local92 == 1) {
											local1361 = local1367;
											local1907 = 512 - local1301;
										} else if (local92 == 2) {
											local1361 = 512 - local1301;
											local1907 = 512 - local1367;
										} else if (local92 == 3) {
											local1907 = local1301;
											local1361 = 512 - local1367;
										} else {
											local1907 = local1367;
											local1361 = local1301;
										}
										local972[local958] = local1361;
										local975[local958] = local1907;
										@Pc(1963) int local1963;
										@Pc(1969) int local1969;
										if (local991 != null && Static329.aBooleanArrayArray5[local86][local1296]) {
											local1963 = (local27 << 9) + local1361;
											local1969 = (local47 << 9) + local1907;
											local991[local958] = arg4.sa(local1963, local1969) - arg0.sa(local1963, local1969);
										}
										if (local1000 != null) {
											if (arg4 != null && !Static329.aBooleanArrayArray5[local86][local1296]) {
												local1963 = (local27 << 9) + local1361;
												local1969 = (local47 << 9) + local1907;
												local1000[local958] = arg0.sa(local1963, local1969) - arg4.sa(local1963, local1969);
											} else if (arg5 != null && !Static542.aBooleanArrayArray8[local86][local1296]) {
												local1963 = local1361 + (local27 << 9);
												local1969 = local1907 + (local47 << 9);
												local1000[local958] = arg5.sa(local1963, local1969) - arg0.sa(local1963, local1969);
											}
										}
										if (local1296 < 8 && Static174.anIntArray382[local1289] >= 0) {
											if (local969 != null) {
												local969[local958] = Static376.anIntArray752[local1289];
											}
											local984[local958] = Static102.anIntArray529[local1289];
											local981[local958] = Static425.anIntArray669[local1289];
											local978[local958] = Static358.anIntArray579[local1289];
										} else {
											if (local77 && Static329.aBooleanArrayArray5[local86][local1296]) {
												local981[local958] = local1004;
												local984[local958] = local1006;
												local978[local958] = local1002;
											} else if (local1361 == 0 && local1907 == 0) {
												local978[local958] = arg2[local27][local47];
												local981[local958] = local1613.anInt8019;
												local984[local958] = local1613.anInt8021;
											} else if (local1361 == 0 && local1907 == 512) {
												local978[local958] = arg2[local27][local61];
												local981[local958] = local1623.anInt8019;
												local984[local958] = local1623.anInt8021;
											} else if (local1361 == 512 && local1907 == 512) {
												local978[local958] = arg2[local45][local61];
												local981[local958] = local1631.anInt8019;
												local984[local958] = local1631.anInt8021;
											} else if (local1361 == 512 && local1907 == 0) {
												local978[local958] = arg2[local45][local47];
												local981[local958] = local1639.anInt8019;
												local984[local958] = local1639.anInt8021;
											} else {
												if (local1361 >= 256) {
													if (local1907 >= 256) {
														local981[local958] = local1631.anInt8019;
														local984[local958] = local1631.anInt8021;
													} else {
														local981[local958] = local1639.anInt8019;
														local984[local958] = local1639.anInt8021;
													}
												} else if (local1907 < 256) {
													local981[local958] = local1613.anInt8019;
													local984[local958] = local1613.anInt8021;
												} else {
													local981[local958] = local1623.anInt8019;
													local984[local958] = local1623.anInt8021;
												}
												local1963 = Static156.method3090(arg2[local27][local47], local1361 << 7 >> 9, arg2[local45][local47]);
												local1969 = Static156.method3090(arg2[local27][local61], local1361 << 7 >> 9, arg2[local45][local61]);
												local978[local958] = Static156.method3090(local1963, local1907 << 7 >> 9, local1969);
											}
											if (local969 != null) {
												local969[local958] = local978[local958];
											}
										}
										local958++;
									}
									local956++;
								}
								if (local86 != 0 && local169.aBoolean572) {
									local75 = true;
								}
							}
							local1028 = arg0.JA(local27, local47);
							local1030 = arg0.JA(local45, local47);
							local1265 = arg0.JA(local45, local61);
							local1271 = arg0.JA(local27, local61);
							if (arg1 > 0) {
								@Pc(2389) boolean local2389 = true;
								if (local108 == 0 && local86 != 0) {
									local2389 = false;
								}
								if (local100 > 0 && local177 != null && !local177.aBoolean473) {
									local2389 = false;
								}
								if (local2389 && local1028 == local1030 && local1028 == local1265 && local1271 == local1028) {
									this.aByteArrayArrayArray13[arg1][local27][local47] = (byte) (this.aByteArrayArrayArray13[arg1][local27][local47] | 0x4);
								}
							}
							local1279 = 0;
							local1284 = 0;
							local1296 = 0;
							if (this.aBoolean202) {
								local1279 = Static103.method2046(local27, local47);
								local1284 = Static154.method2643(local27, local47);
								local1296 = Static507.method7641(local27, local47);
							}
							arg0.BA(local27, local47, local972, local991, local975, local1000, local978, local969, local981, local984, local1279, local1284, local1296, local75);
							Static343.method5436(arg1, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!oa;Lclient!d;ZLclient!d;)V")
	public final void method2280(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(3) Class52 arg2) {
		if (Static370.anIntArray620 == null || this.anInt2714 != Static370.anIntArray620.length) {
			Static370.anIntArray620 = new int[this.anInt2714];
			Static10.anIntArray109 = new int[this.anInt2714];
			Static371.anIntArray621 = new int[this.anInt2714];
			Static504.anIntArray776 = new int[this.anInt2714];
			Static465.anIntArray713 = new int[this.anInt2714];
		}
		@Pc(42) int[][] local42 = new int[this.anInt2712][this.anInt2714];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt2722; local44++) {
			for (local48 = 0; local48 < this.anInt2714; local48++) {
				Static370.anIntArray620[local48] = 0;
				Static465.anIntArray713[local48] = 0;
				Static504.anIntArray776[local48] = 0;
				Static371.anIntArray621[local48] = 0;
				Static10.anIntArray109[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt2712; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(176) int local176;
				for (@Pc(85) int local85 = 0; local85 < this.anInt2714; local85++) {
					local91 = local81 + 5;
					@Pc(156) int local156;
					if (this.anInt2712 > local91) {
						local110 = this.aByteArrayArrayArray12[local44][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(120) Class266 local120 = this.aClass58_6.method1561(local110 - 1);
							Static370.anIntArray620[local85] += local120.anInt8024;
							Static465.anIntArray713[local85] += local120.anInt8018;
							Static504.anIntArray776[local85] += local120.anInt8023;
							Static371.anIntArray621[local85] += local120.anInt8027;
							local156 = Static10.anIntArray109[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local176 = this.aByteArrayArrayArray12[local44][local110][local85] & 0xFF;
						if (local176 > 0) {
							@Pc(189) Class266 local189 = this.aClass58_6.method1561(local176 - 1);
							Static370.anIntArray620[local85] -= local189.anInt8024;
							Static465.anIntArray713[local85] -= local189.anInt8018;
							Static504.anIntArray776[local85] -= local189.anInt8023;
							Static371.anIntArray621[local85] -= local189.anInt8027;
							local156 = Static10.anIntArray109[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local176 = 0;
					@Pc(243) int local243 = 0;
					@Pc(245) int local245 = 0;
					for (@Pc(247) int local247 = -5; local247 < this.anInt2714; local247++) {
						@Pc(253) int local253 = local247 + 5;
						if (local253 < this.anInt2714) {
							local110 += Static465.anIntArray713[local253];
							local176 += Static504.anIntArray776[local253];
							local243 += Static371.anIntArray621[local253];
							local245 += Static10.anIntArray109[local253];
							local91 += Static370.anIntArray620[local253];
						}
						@Pc(295) int local295 = local247 - 5;
						if (local295 >= 0) {
							local176 -= Static504.anIntArray776[local295];
							local91 -= Static370.anIntArray620[local295];
							local245 -= Static10.anIntArray109[local295];
							local110 -= Static465.anIntArray713[local295];
							local243 -= Static371.anIntArray621[local295];
						}
						if (local247 >= 0 && local243 > 0 && local245 > 0) {
							local42[local81][local247] = Static63.method1281(local91 * 256 / local243, local110 / local245, local176 / local245);
						}
					}
				}
			}
			if (Static371.aBoolean443) {
				this.method2279(Static511.aClass52Array3[local44], local44, local42, arg0, local44 == 0 ? arg1 : null, local44 == 0 ? arg2 : null);
			} else {
				this.method2282(local44 == 0 ? arg2 : null, arg0, local44, Static511.aClass52Array3[local44], local44 == 0 ? arg1 : null, local42);
			}
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray16[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
		}
		if (!this.aBoolean202) {
			if (Static272.anInt5626 != 0) {
				Static402.method7157();
			}
			if (Static18.aBoolean61) {
				Static229.method4102();
			}
		}
		for (local48 = 0; local48 < this.anInt2722; local48++) {
			Static511.aClass52Array3[local48].ba();
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z[[II)V")
	public final void method2281(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray6[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt2712 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2714 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!d;Lclient!oa;ILclient!d;Lclient!d;[[IZ)V")
	private void method2282(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class52 arg3, @OriginalArg(4) Class52 arg4, @OriginalArg(5) int[][] arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2712; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt2714; local11++) {
				if (Static132.anInt2742 == -1 || Static151.method2599(local7, local11, Static132.anInt2742, arg2)) {
					@Pc(34) byte local34 = this.aByteArrayArrayArray15[arg2][local7][local11];
					@Pc(43) byte local43 = this.aByteArrayArrayArray14[arg2][local7][local11];
					@Pc(54) int local54 = this.aByteArrayArrayArray16[arg2][local7][local11] & 0xFF;
					@Pc(65) int local65 = this.aByteArrayArrayArray12[arg2][local7][local11] & 0xFF;
					@Pc(77) Class240 local77 = local54 == 0 ? null : this.aClass233_5.method5910(local54 - 1);
					@Pc(89) Class266 local89 = local65 == 0 ? null : this.aClass58_6.method1561(local65 - 1);
					@Pc(91) int local91 = 0;
					@Pc(93) int local93 = 0;
					if (local34 != 0) {
						local93 = local77 == null ? 0 : Static124.anIntArray751[local34];
						local91 = local89 == null ? 0 : Static441.anIntArray680[local34];
					} else if (local77 != null) {
						local93 = Static124.anIntArray751[local34];
					} else if (local89 != null) {
						local91 = Static124.anIntArray751[local34];
					}
					@Pc(132) int local132 = local93 + local91;
					@Pc(134) int local134 = 0;
					if (local132 != 0) {
						@Pc(139) int[] local139 = new int[local132];
						@Pc(142) int[] local142 = new int[local132];
						@Pc(145) int[] local145 = new int[local132];
						@Pc(148) int[] local148 = new int[local132];
						@Pc(150) boolean local150 = false;
						@Pc(167) int local167;
						@Pc(199) int local199;
						if (local77 == null || local77.anInt7141 == -1 && local77.anInt7142 == -1 && local77.anInt7137 == -1) {
							for (local167 = 0; local167 < local93; local167++) {
								local139[local134] = -1;
								local134++;
							}
						} else {
							local167 = arg1.method7462() ? local77.anInt7137 : local77.anInt7136;
							if (Static44.aBoolean80) {
								local167 = -1;
							}
							for (local199 = 0; local199 < local93; local199++) {
								local145[local134] = local167;
								local148[local134] = local77.anInt7145;
								if (local77.anInt7141 == -1) {
									local139[local134] = -1;
								} else {
									local139[local134] = local77.anInt7141;
								}
								if (local77.anInt7142 == -1) {
									local142[local134] = -1;
								} else {
									local150 = true;
									local142[local134] = local77.anInt7142;
								}
								local134++;
							}
							if (!this.aBoolean202 && arg2 == 0) {
								Static476.method6337(local7, local11, local77.anInt7131, local77.anInt7134 * 8, local77.anInt7135);
							}
						}
						if (!local150) {
							local142 = null;
						}
						if (local89 == null) {
							for (local167 = 0; local167 < local91; local167++) {
								local139[local134] = -1;
								local134++;
							}
						} else {
							local167 = local89.anInt8019;
							if (Static44.aBoolean80) {
								local167 = -1;
							}
							for (local199 = 0; local199 < local91; local199++) {
								local145[local134] = local167;
								local148[local134] = local89.anInt8021;
								local139[local134] = arg5[local7][local11];
								if (local142 != null) {
									local142[local134] = -1;
								}
								local134++;
							}
						}
						local167 = this.anIntArray270.length;
						@Pc(332) int[] local332 = new int[local167];
						@Pc(335) int[] local335 = new int[local167];
						@Pc(342) int[] local342 = arg4 == null ? null : new int[local167];
						@Pc(351) int[] local351 = arg4 == null && arg0 == null ? null : new int[local167];
						@Pc(360) int local360;
						@Pc(365) int local365;
						@Pc(446) int local446;
						@Pc(453) int local453;
						for (@Pc(353) int local353 = 0; local353 < local167; local353++) {
							local360 = this.anIntArray270[local353];
							local365 = this.anIntArray271[local353];
							if (local43 == 0) {
								local332[local353] = local360;
								local335[local353] = local365;
							} else if (local43 == 1) {
								local332[local353] = local365;
								local335[local353] = 512 - local360;
							} else if (local43 == 2) {
								local332[local353] = 512 - local360;
								local335[local353] = 512 - local365;
							} else if (local43 == 3) {
								local332[local353] = 512 - local365;
								local335[local353] = local360;
							}
							if (local342 != null && Static329.aBooleanArrayArray5[local34][local353]) {
								local446 = local360 + (local7 << 9);
								local453 = (local11 << 9) + local360;
								local342[local353] = arg4.sa(local446, local453) - arg3.sa(local446, local453);
							}
							if (local351 != null) {
								if (arg4 != null && !Static329.aBooleanArrayArray5[local34][local353]) {
									local446 = (local7 << 9) + local360;
									local453 = (local11 << 9) + local360;
									local351[local353] = arg3.sa(local446, local453) - arg4.sa(local446, local453);
								} else if (arg0 != null && !Static542.aBooleanArrayArray8[local34][local353]) {
									local446 = (local7 << 9) + local360;
									local453 = local360 + (local11 << 9);
									local351[local353] = arg0.sa(local446, local453) - arg3.sa(local446, local453);
								}
							}
						}
						local360 = arg3.JA(local7, local11);
						local365 = arg3.JA(local7 + 1, local11);
						local446 = arg3.JA(local7 + 1, local11 - -1);
						local453 = arg3.JA(local7, local11 + 1);
						if (arg2 > 0) {
							@Pc(575) boolean local575 = true;
							if (local65 == 0 && local34 != 0) {
								local575 = false;
							}
							if (local54 > 0 && local77 != null && !local77.aBoolean473) {
								local575 = false;
							}
							if (local575 && local365 == local360 && local446 == local360 && local360 == local453) {
								this.aByteArrayArrayArray13[arg2][local7][local11] = (byte) (this.aByteArrayArrayArray13[arg2][local7][local11] | 0x4);
							}
						}
						@Pc(635) int local635 = 0;
						@Pc(637) int local637 = 0;
						@Pc(639) int local639 = 0;
						if (this.aBoolean202) {
							local635 = Static103.method2046(local7, local11);
							local637 = Static154.method2643(local7, local11);
							local639 = Static507.method7641(local7, local11);
						}
						arg3.method7833(local7, local11, local332, local342, local335, local351, Static207.anIntArrayArray47[local34], Static436.anIntArrayArray76[local34], Static2.anIntArrayArray13[local34], local139, local142, local145, local148, local635, local637, local639);
						Static343.method5436(arg2, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[Lclient!vi;IILclient!rt;II)V")
	public final void method2283(@OriginalArg(0) int arg0, @OriginalArg(1) Class306[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub27 arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean202) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class306 local16 = arg1[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg5;
						@Pc(32) int local32 = arg2 + local22;
						if (local28 >= 0 && local28 < this.anInt2712 && local32 >= 0 && this.anInt2714 > local32) {
							local16.method7363(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg3 + arg5;
		@Pc(80) int local80 = arg0 + arg2;
		for (local18 = 0; local18 < this.anInt2722; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method2289(0, arg4, false, local18, 0, arg5 + local22, local80 - -local28, 0, local22 + local10, arg2 + local28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIILclient!oa;[[B[[BILclient!qba;Lclient!sca;I[[B[Z)V")
	private void method2284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class240 arg9, @OriginalArg(10) Class266 arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) boolean[] arg12) {
		@Pc(18) boolean[] local18 = arg9 != null && arg9.aBoolean472 ? Static490.aBooleanArrayArray7[arg3] : Static371.aBooleanArrayArray6[arg3];
		@Pc(37) int local37;
		@Pc(50) Class240 local50;
		@Pc(68) byte local68;
		@Pc(84) int local84;
		@Pc(89) int local89;
		if (arg0 > 0) {
			if (arg2 > 0) {
				local37 = arg7[arg2 - 1][arg0 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass233_5.method5910(local37 - 1);
					if (local50.anInt7141 != -1 && local50.aBoolean472) {
						local68 = arg6[arg2 - 1][arg0 - 1];
						local84 = arg11[arg2 - 1][arg0 - 1] * 2 + 4 & 0x7;
						local89 = Static34.method836(arg5, local50);
						if (Static329.aBooleanArrayArray5[local68][local84]) {
							Static358.anIntArray579[0] = local50.anInt7141;
							Static376.anIntArray752[0] = local89;
							Static425.anIntArray669[0] = arg5.method7462() ? local50.anInt7137 : local50.anInt7136;
							Static102.anIntArray529[0] = local50.anInt7145;
							Static174.anIntArray382[0] = local50.anInt7138;
							Static475.anIntArray735[0] = 256;
						}
					}
				}
			}
			if (arg2 < arg8 - 1) {
				local37 = arg7[arg2 + 1][arg0 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass233_5.method5910(local37 - 1);
					if (local50.anInt7141 != -1 && local50.aBoolean472) {
						local68 = arg6[arg2 + 1][arg0 - 1];
						local84 = arg11[arg2 + 1][arg0 - 1] * 2 + 6 & 0x7;
						local89 = Static34.method836(arg5, local50);
						if (Static329.aBooleanArrayArray5[local68][local84]) {
							Static358.anIntArray579[2] = local50.anInt7141;
							Static376.anIntArray752[2] = local89;
							Static425.anIntArray669[2] = arg5.method7462() ? local50.anInt7137 : local50.anInt7136;
							Static102.anIntArray529[2] = local50.anInt7145;
							Static174.anIntArray382[2] = local50.anInt7138;
							Static475.anIntArray735[2] = 512;
						}
					}
				}
			}
		}
		if (arg1 - 1 > arg0) {
			if (arg2 > 0) {
				local37 = arg7[arg2 - 1][arg0 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass233_5.method5910(local37 - 1);
					if (local50.anInt7141 != -1 && local50.aBoolean472) {
						local68 = arg6[arg2 - 1][arg0 + 1];
						local84 = arg11[arg2 - 1][arg0 + 1] * 2 + 2 & 0x7;
						local89 = Static34.method836(arg5, local50);
						if (Static329.aBooleanArrayArray5[local68][local84]) {
							Static358.anIntArray579[6] = local50.anInt7141;
							Static376.anIntArray752[6] = local89;
							Static425.anIntArray669[6] = arg5.method7462() ? local50.anInt7137 : local50.anInt7136;
							Static102.anIntArray529[6] = local50.anInt7145;
							Static174.anIntArray382[6] = local50.anInt7138;
							Static475.anIntArray735[6] = 64;
						}
					}
				}
			}
			if (arg8 - 1 > arg2) {
				local37 = arg7[arg2 + 1][arg0 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass233_5.method5910(local37 - 1);
					if (local50.anInt7141 != -1 && local50.aBoolean472) {
						local68 = arg6[arg2 + 1][arg0 + 1];
						local84 = --(arg11[arg2 + 1][arg0 + 1] * 2) & 0x7;
						local89 = Static34.method836(arg5, local50);
						if (Static329.aBooleanArrayArray5[local68][local84]) {
							Static358.anIntArray579[4] = local50.anInt7141;
							Static376.anIntArray752[4] = local89;
							Static425.anIntArray669[4] = arg5.method7462() ? local50.anInt7137 : local50.anInt7136;
							Static102.anIntArray529[4] = local50.anInt7145;
							Static174.anIntArray382[4] = local50.anInt7138;
							Static475.anIntArray735[4] = 128;
						}
					}
				}
			}
		}
		@Pc(520) int local520;
		@Pc(525) int local525;
		@Pc(527) int local527;
		@Pc(508) byte local508;
		if (arg0 > 0) {
			local37 = arg7[arg2][arg0 - 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass233_5.method5910(local37 - 1);
				if (local50.anInt7141 != -1) {
					local68 = arg6[arg2][arg0 - 1];
					local508 = arg11[arg2][arg0 - 1];
					if (local50.aBoolean472) {
						local89 = 2;
						local520 = local508 * 2 + 4;
						local525 = Static34.method836(arg5, local50);
						for (local527 = 0; local527 < 3; local527++) {
							local89 &= 0x7;
							local520 &= 0x7;
							if (Static329.aBooleanArrayArray5[local68][local520] && Static174.anIntArray382[local89] <= local50.anInt7138) {
								Static358.anIntArray579[local89] = local50.anInt7141;
								Static376.anIntArray752[local89] = local525;
								Static425.anIntArray669[local89] = arg5.method7462() ? local50.anInt7137 : local50.anInt7136;
								Static102.anIntArray529[local89] = local50.anInt7145;
								if (local50.anInt7138 == Static174.anIntArray382[local89]) {
									Static475.anIntArray735[local89] |= 0x20;
								} else {
									Static475.anIntArray735[local89] = 32;
								}
								Static174.anIntArray382[local89] = local50.anInt7138;
							}
							local520++;
							local89--;
						}
						if (!local18[arg4 & 0x3]) {
							arg12[0] = Static490.aBooleanArrayArray7[local68][local508 + 2 & 0x3];
						}
					} else if (!local18[--arg4 & 0x3]) {
						arg12[0] = Static371.aBooleanArrayArray6[local68][local508 + 2 & 0x3];
					}
				}
			}
		}
		if (arg0 < arg1 - 1) {
			local37 = arg7[arg2][arg0 + 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass233_5.method5910(local37 - 1);
				if (local50.anInt7141 != -1) {
					local68 = arg6[arg2][arg0 + 1];
					local508 = arg11[arg2][arg0 + 1];
					if (local50.aBoolean472) {
						local89 = 4;
						local520 = local508 * 2 + 2;
						local525 = Static34.method836(arg5, local50);
						for (local527 = 0; local527 < 3; local527++) {
							local520 &= 0x7;
							local89 &= 0x7;
							if (Static329.aBooleanArrayArray5[local68][local520] && local50.anInt7138 >= Static174.anIntArray382[local89]) {
								Static358.anIntArray579[local89] = local50.anInt7141;
								Static376.anIntArray752[local89] = local525;
								Static425.anIntArray669[local89] = arg5.method7462() ? local50.anInt7137 : local50.anInt7136;
								Static102.anIntArray529[local89] = local50.anInt7145;
								if (Static174.anIntArray382[local89] == local50.anInt7138) {
									Static475.anIntArray735[local89] |= 0x10;
								} else {
									Static475.anIntArray735[local89] = 16;
								}
								Static174.anIntArray382[local89] = local50.anInt7138;
							}
							local520--;
							local89++;
						}
						if (!local18[arg4 + 2 & 0x3]) {
							arg12[2] = Static490.aBooleanArrayArray7[local68][local508 & 0x3];
						}
					} else if (!local18[arg4 + 2 & 0x3]) {
						arg12[2] = Static371.aBooleanArrayArray6[local68][local508 & 0x3];
					}
				}
			}
		}
		if (arg2 > 0) {
			local37 = arg7[arg2 - 1][arg0] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass233_5.method5910(local37 - 1);
				if (local50.anInt7141 != -1) {
					local68 = arg6[arg2 - 1][arg0];
					local508 = arg11[arg2 - 1][arg0];
					if (local50.aBoolean472) {
						local89 = 6;
						local520 = local508 * 2 + 4;
						local525 = Static34.method836(arg5, local50);
						for (local527 = 0; local527 < 3; local527++) {
							local89 &= 0x7;
							local520 &= 0x7;
							if (Static329.aBooleanArrayArray5[local68][local520] && local50.anInt7138 >= Static174.anIntArray382[local89]) {
								Static358.anIntArray579[local89] = local50.anInt7141;
								Static376.anIntArray752[local89] = local525;
								Static425.anIntArray669[local89] = arg5.method7462() ? local50.anInt7137 : local50.anInt7136;
								Static102.anIntArray529[local89] = local50.anInt7145;
								if (Static174.anIntArray382[local89] == local50.anInt7138) {
									Static475.anIntArray735[local89] |= 0x8;
								} else {
									Static475.anIntArray735[local89] = 8;
								}
								Static174.anIntArray382[local89] = local50.anInt7138;
							}
							local520--;
							local89++;
						}
						if (!local18[arg4 + 3 & 0x3]) {
							arg12[3] = Static490.aBooleanArrayArray7[local68][local508 + 1 & 0x3];
						}
					} else if (!local18[arg4 + 3 & 0x3]) {
						arg12[3] = Static371.aBooleanArrayArray6[local68][local508 + 1 & 0x3];
					}
				}
			}
		}
		if (arg2 < arg8 - 1) {
			local37 = arg7[arg2 + 1][arg0] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass233_5.method5910(local37 - 1);
				if (local50.anInt7141 != -1) {
					local68 = arg6[arg2 + 1][arg0];
					local508 = arg11[arg2 + 1][arg0];
					if (local50.aBoolean472) {
						local89 = 4;
						local520 = local508 * 2 + 6;
						local525 = Static34.method836(arg5, local50);
						for (local527 = 0; local527 < 3; local527++) {
							local89 &= 0x7;
							local520 &= 0x7;
							if (Static329.aBooleanArrayArray5[local68][local520] && Static174.anIntArray382[local89] <= local50.anInt7138) {
								Static358.anIntArray579[local89] = local50.anInt7141;
								Static376.anIntArray752[local89] = local525;
								Static425.anIntArray669[local89] = arg5.method7462() ? local50.anInt7137 : local50.anInt7136;
								Static102.anIntArray529[local89] = local50.anInt7145;
								if (local50.anInt7138 == Static174.anIntArray382[local89]) {
									Static475.anIntArray735[local89] |= 0x4;
								} else {
									Static475.anIntArray735[local89] = 4;
								}
								Static174.anIntArray382[local89] = local50.anInt7138;
							}
							local520++;
							local89--;
						}
						if (!local18[arg4 + 1 & 0x3]) {
							arg12[1] = Static490.aBooleanArrayArray7[local68][local508 + 3 & 0x3];
						}
					} else if (!local18[arg4 + 1 & 0x3]) {
						arg12[1] = Static371.aBooleanArrayArray6[local68][local508 + 3 & 0x3];
					}
				}
			}
		}
		if (arg9 == null) {
			return;
		}
		local37 = Static34.method836(arg5, arg9);
		if (!arg9.aBoolean472) {
			return;
		}
		for (@Pc(1238) int local1238 = 0; local1238 < 8; local1238++) {
			@Pc(1249) int local1249 = local1238 - arg4 * 2 & 0x7;
			if (Static329.aBooleanArrayArray5[arg3][local1238] && Static174.anIntArray382[local1249] <= arg9.anInt7138) {
				Static358.anIntArray579[local1249] = arg9.anInt7141;
				Static376.anIntArray752[local1249] = local37;
				Static425.anIntArray669[local1249] = arg5.method7462() ? arg9.anInt7137 : arg9.anInt7136;
				Static102.anIntArray529[local1249] = arg9.anInt7145;
				if (arg9.anInt7138 == Static174.anIntArray382[local1249]) {
					Static475.anIntArray735[local1249] |= 0x2;
				} else {
					Static475.anIntArray735[local1249] = 2;
				}
				Static174.anIntArray382[local1249] = arg9.anInt7138;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!oa;B[Lclient!vi;[[[I)V")
	public final void method2285(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class306[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(35) int local35;
		if (!this.aBoolean202) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt2712; local14++) {
					for (local18 = 0; local18 < this.anInt2714; local18++) {
						if ((Static232.aByteArrayArrayArray18[local10][local14][local18] & 0x1) != 0) {
							local35 = local10;
							if ((Static232.aByteArrayArrayArray18[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg1[local35].method7354(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local14 = 0; local14 < this.anInt2722; local14++) {
			local18 = 0;
			local35 = 0;
			if (!this.aBoolean202) {
				if (Static18.aBoolean61) {
					local18 = 2;
				}
				if (Static545.aBoolean688) {
					local35 = 8;
				}
				if (Static272.anInt5626 != 0) {
					local18 |= 0x1;
					if (Static313.aBoolean391 | local14 == 0) {
						local35 |= 0x10;
					}
				}
			}
			if (Static18.aBoolean61) {
				local35 |= 0x7;
			}
			if (!Static397.aBoolean512) {
				local35 |= 0x20;
			}
			@Pc(154) int[][] local154 = arg2 == null || local14 >= arg2.length ? this.anIntArrayArrayArray6[local14] : arg2[local14];
			Static185.method3506(local14, arg0.method7432(this.anInt2712, this.anInt2714, this.anIntArrayArrayArray6[local14], local154, local18, local35));
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIB)V")
	public final void method2286(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2722; local11++) {
			this.method2288(arg1, local11, arg0);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BIILclient!rt;III[Lclient!vi;II)V")
	public final void method2287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub27 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class306[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(59) int local59;
		if (!this.aBoolean202) {
			@Pc(24) Class306 local24 = arg6[arg0];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static356.method5588(local26 & 0x7, local30 & 0x7, arg4) + arg8;
					local59 = arg3 + Static239.method4179(arg4, local26 & 0x7, local30 & 0x7);
					if (local44 > 0 && local44 < this.anInt2712 - 1 && local59 > 0 && this.anInt2714 - 1 > local59) {
						local24.method7363(local44, local59);
					}
				}
			}
		}
		@Pc(103) int local103 = (arg1 & 0xFFFFFFF8) << 3;
		local26 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(121) byte local121 = 0;
		@Pc(123) byte local123 = 0;
		if (arg4 == 1) {
			local123 = 1;
		} else if (arg4 == 2) {
			local123 = 1;
			local121 = 1;
		} else if (arg4 == 3) {
			local121 = 1;
		}
		for (local59 = 0; local59 < this.anInt2722; local59++) {
			for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
				for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
					if (local59 == arg5 && local154 >= local11 && local11 + 8 >= local154 && local17 <= local158 && local158 <= local17 + 8) {
						@Pc(225) int local225;
						@Pc(240) int local240;
						if (local11 + 8 == local154 || local158 == local17 + 8) {
							if (arg4 == 0) {
								local240 = arg3 + local158 - local17;
								local225 = local154 + arg8 - local11;
							} else if (arg4 == 1) {
								local240 = local11 + arg3 + 8 - local154;
								local225 = local158 + arg8 - local17;
							} else if (arg4 == 2) {
								local240 = local17 + arg3 + 8 - local158;
								local225 = arg8 + local11 + 8 - local154;
							} else {
								local240 = local154 + arg3 - local11;
								local225 = arg8 + local17 + 8 - local158;
							}
							this.method2289(0, arg2, true, arg0, 0, local225, local158 + local26, 0, local154 + local103, local240);
						} else {
							local225 = arg8 + Static356.method5588(local154 & 0x7, local158 & 0x7, arg4);
							local240 = arg3 + Static239.method4179(arg4, local154 & 0x7, local158 & 0x7);
							this.method2289(arg4, arg2, false, arg0, local121, local225, local158 + local26, local123, local154 + local103, local240);
						}
						if (local154 == 63 || local158 == 63) {
							@Pc(371) byte local371 = 1;
							if (local154 == 63 && local158 == 63) {
								local371 = 3;
							}
							for (@Pc(383) int local383 = 0; local383 < local371; local383++) {
								@Pc(387) int local387 = local154;
								@Pc(389) int local389 = local158;
								if (local383 == 0) {
									local387 = local154 == 63 ? 64 : local154;
									local389 = local158 == 63 ? 64 : local158;
								} else if (local383 == 1) {
									local387 = 64;
								} else if (local383 == 2) {
									local389 = 64;
								}
								@Pc(444) int local444;
								@Pc(438) int local438;
								if (arg4 == 0) {
									local444 = local387 + arg8 - local11;
									local438 = arg3 + local389 - local17;
								} else if (arg4 == 1) {
									local438 = local11 + arg3 + 8 - local387;
									local444 = local389 + arg8 - local17;
								} else if (arg4 == 2) {
									local444 = arg8 + local11 + 8 - local387;
									local438 = arg3 + local17 + 8 - local389;
								} else {
									local444 = arg8 + local17 + 8 - local389;
									local438 = local387 + arg3 - local11;
								}
								if (local444 >= 0 && local444 < this.anInt2712 && local438 >= 0 && local438 < this.anInt2714) {
									this.anIntArrayArrayArray6[arg0][local444][local438] = this.anIntArrayArrayArray6[arg0][local121 + local225][local123 + local240];
								}
							}
						}
					} else {
						this.method2289(0, arg2, false, 0, 0, -1, 0, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIII)V")
	private void method2288(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + 64; local7++) {
			for (local11 = arg2; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt2712 && local7 >= 0 && this.anInt2714 > local7) {
					this.anIntArrayArrayArray6[arg1][local11][local7] = arg1 <= 0 ? 0 : this.anIntArrayArrayArray6[arg1 - 1][local11][local7] - 960;
				}
			}
		}
		if (arg2 > 0 && this.anInt2712 > arg2) {
			for (local11 = arg0 + 1; local11 < arg0 + 64; local11++) {
				if (local11 >= 0 && this.anInt2714 > local11) {
					this.anIntArrayArrayArray6[arg1][arg2][local11] = this.anIntArrayArrayArray6[arg1][arg2 - 1][local11];
				}
			}
		}
		if (arg0 > 0 && this.anInt2714 > arg0) {
			for (local11 = arg2 + 1; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && this.anInt2712 > local11) {
					this.anIntArrayArrayArray6[arg1][local11][arg0] = this.anIntArrayArrayArray6[arg1][local11][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || arg2 >= this.anInt2712 || arg0 >= this.anInt2714) {
			return;
		}
		if (arg1 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0] != 0) {
				this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0];
			} else if (arg0 > 0 && this.anIntArrayArrayArray6[arg1][arg2][arg0 - 1] != 0) {
				this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2][arg0 - 1];
			} else if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1];
			}
		} else if (arg2 > 0 && this.anIntArrayArrayArray6[arg1 - 1][arg2 - 1][arg0] != this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0]) {
			this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && this.anIntArrayArrayArray6[arg1 - 1][arg2][arg0 - 1] != this.anIntArrayArrayArray6[arg1][arg2][arg0 - 1]) {
			this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1] != this.anIntArrayArrayArray6[arg1 - 1][arg2 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray6[arg1][arg2][arg0] = this.anIntArrayArrayArray6[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!rt;ZIIIIIIII)V")
	private void method2289(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg0 == 1) {
			arg7 = 1;
		} else if (arg0 == 2) {
			arg4 = 1;
			arg7 = 1;
		} else if (arg0 == 3) {
			arg4 = 1;
		}
		@Pc(76) int local76;
		if (arg5 < 0 || arg5 >= this.anInt2712 || arg9 < 0 || arg9 >= this.anInt2714) {
			while (true) {
				local76 = arg1.method7548();
				if (local76 == 0) {
					return;
				}
				if (local76 == 1) {
					arg1.method7548();
					return;
				}
				if (local76 <= 49) {
					arg1.method7548();
				}
			}
			return;
		}
		if (!this.aBoolean202 && !arg2) {
			Static232.aByteArrayArrayArray18[arg3][arg5][arg9] = 0;
		}
		while (true) {
			local76 = arg1.method7548();
			if (local76 == 0) {
				if (this.aBoolean202) {
					this.anIntArrayArrayArray6[0][arg4 + arg5][arg9 + arg7] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray6[0][arg4 + arg5][arg7 + arg9] = -Static245.method4228(arg6 + 556238, arg8 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray6[arg3][arg4 + arg5][arg7 + arg9] = this.anIntArrayArrayArray6[arg3 - 1][arg5 + arg4][arg7 + arg9] - 960;
					return;
				}
			}
			if (local76 == 1) {
				@Pc(164) int local164 = arg1.method7548();
				if (!this.aBoolean202) {
					if (local164 == 1) {
						local164 = 0;
					}
					if (arg3 == 0) {
						this.anIntArrayArrayArray6[0][arg5 + arg4][arg9 + arg7] = -local164 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray6[arg3][arg4 + arg5][arg9 + arg7] = this.anIntArrayArrayArray6[arg3 - 1][arg4 + arg5][arg7 + arg9] - (local164 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray6[0][arg5 + arg4][arg7 + arg9] = local164 * 8 << 2;
				return;
			}
			if (local76 <= 49) {
				if (arg2) {
					arg1.method7548();
				} else {
					this.aByteArrayArrayArray16[arg3][arg5][arg9] = arg1.method7584();
					this.aByteArrayArrayArray15[arg3][arg5][arg9] = (byte) ((local76 - 2) / 4);
					this.aByteArrayArrayArray14[arg3][arg5][arg9] = (byte) (local76 + arg0 - 2 & 0x3);
				}
			} else if (local76 <= 81) {
				if (!this.aBoolean202 && !arg2) {
					Static232.aByteArrayArrayArray18[arg3][arg5][arg9] = (byte) (local76 - 49);
				}
			} else if (!arg2) {
				this.aByteArrayArrayArray12[arg3][arg5][arg9] = (byte) (local76 - 81);
			}
		}
	}
}
