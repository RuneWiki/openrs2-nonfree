import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public class Class26 {

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "[I")
	private final int[] anIntArray169 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "[I")
	private final int[] anIntArray170 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "Z")
	public final boolean aBoolean148;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
	protected final int anInt2144;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Lclient!fe;")
	private final Class79 aClass79_2;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "Lclient!am;")
	private final Class12 aClass12_3;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
	public final int anInt2142;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	protected final int anInt2140;

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIZLclient!fe;Lclient!am;)V")
	protected Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class79 arg4, @OriginalArg(5) Class12 arg5) {
		this.aBoolean148 = arg3;
		this.anInt2144 = arg1;
		this.aClass79_2 = arg4;
		this.aClass12_3 = arg5;
		this.anInt2142 = arg0;
		this.anInt2140 = arg2;
		this.aByteArrayArrayArray12 = new byte[this.anInt2142][this.anInt2144][this.anInt2140];
		this.aByteArrayArrayArray11 = new byte[this.anInt2142][this.anInt2144][this.anInt2140];
		this.aByteArrayArrayArray9 = new byte[this.anInt2142][this.anInt2144 + 1][this.anInt2140 + 1];
		this.anIntArrayArrayArray2 = new int[this.anInt2142][this.anInt2144 + 1][this.anInt2140 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt2142][this.anInt2144][this.anInt2140];
		this.aByteArrayArrayArray8 = new byte[this.anInt2142][this.anInt2144][this.anInt2140];
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLclient!ya;ILclient!ta;Lclient!ta;Lclient!ta;[[I)V")
	private void method1701(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41 arg2, @OriginalArg(4) Class41 arg3, @OriginalArg(5) Class41 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray11[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray13[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray8[arg1];
		for (@Pc(31) int local31 = 0; local31 < this.anInt2144; local31++) {
			@Pc(45) int local45 = this.anInt2144 - 1 > local31 ? local31 + 1 : local31;
			for (@Pc(47) int local47 = 0; local47 < this.anInt2140; local47++) {
				@Pc(61) int local61 = local47 >= this.anInt2140 - 1 ? local47 : local47 + 1;
				if (Static169.anInt3059 == -1 || Static376.method4953(arg1, local31, Static169.anInt3059, local47)) {
					@Pc(75) boolean local75 = false;
					@Pc(77) boolean local77 = false;
					@Pc(80) boolean[] local80 = new boolean[4];
					@Pc(86) int local86 = local10[local31][local47];
					@Pc(92) int local92 = local15[local31][local47];
					@Pc(100) int local100 = local25[local31][local47] & 0xFF;
					@Pc(108) int local108 = local20[local31][local47] & 0xFF;
					@Pc(116) int local116 = local20[local31][local61] & 0xFF;
					@Pc(124) int local124 = local20[local45][local61] & 0xFF;
					@Pc(132) int local132 = local20[local45][local47] & 0xFF;
					if (local100 != 0 || local108 != 0) {
						@Pc(154) Class261 local154 = local100 == 0 ? null : this.aClass79_2.method1582(local100 - 1);
						@Pc(166) Class207 local166 = local108 == 0 ? null : this.aClass12_3.method164(local108 - 1);
						if (local86 == 0 && local154 == null) {
							local86 = 12;
						}
						@Pc(177) Class261 local177 = local154;
						if (local154 != null) {
							if (local154.anInt7253 == -1 && local154.anInt7245 == -1) {
								local177 = local154;
								local154 = null;
							} else if (local166 != null && local86 != 0) {
								local77 = local154.aBoolean511;
							}
						}
						@Pc(268) int local268;
						@Pc(323) int local323;
						@Pc(377) int local377;
						@Pc(387) int local387;
						if ((local86 == 0 || local86 == 12) && local31 > 0 && local47 > 0 && local31 < this.anInt2144 && local47 < this.anInt2140) {
							@Pc(251) int local251 = local108 == local20[local45][local61] ? 1 : -1;
							local268 = local20[local31 - 1][local47 - 1] == local108 ? 1 : -1;
							@Pc(289) int local289 = local108 == local20[local45][local47 - 1] ? 1 : -1;
							if (local20[local31][local47 - 1] == local108) {
								local289++;
								local268++;
							} else {
								local268--;
								local289--;
							}
							local323 = local108 == local20[local31 - 1][local61] ? 1 : -1;
							if (local108 == local20[local45][local47]) {
								local251++;
								local289++;
							} else {
								local251--;
								local289--;
							}
							if (local20[local31][local61] == local108) {
								local251++;
								local323++;
							} else {
								local251--;
								local323--;
							}
							if (local108 == local20[local31 - 1][local47]) {
								local323++;
								local268++;
							} else {
								local323--;
								local268--;
							}
							local377 = local268 - local251;
							if (local377 < 0) {
								local377 = -local377;
							}
							local387 = local289 - local323;
							if (local387 < 0) {
								local387 = -local387;
							}
							if (local387 == local377) {
								local377 = arg4.l(local31, local47) - arg4.l(local45, local61);
								local387 = arg4.l(local45, local47) - arg4.l(local31, local61);
								if (local377 < 0) {
									local377 = -local377;
								}
								if (local387 < 0) {
									local387 = -local387;
								}
							}
							local92 = local377 >= local387 ? 0 : 1;
						}
						for (local268 = 0; local268 < 13; local268++) {
							Static437.anIntArray550[local268] = -1;
							Static90.anIntArray129[local268] = 1;
						}
						@Pc(469) boolean[] local469 = local154 != null && local154.aBoolean511 ? Static41.aBooleanArrayArray1[local86] : Static279.aBooleanArrayArray5[local86];
						this.method1710(local31, local92, local10, local47, local86, local80, local25, this.anInt2140, this.anInt2144, local15, local166, local154, arg0);
						@Pc(502) boolean local502 = local154 != null && local154.anInt7253 != local154.anInt7245;
						if (!local502) {
							for (local323 = 0; local323 < 8; local323++) {
								if (Static437.anIntArray550[local323] >= 0 && Static158.anIntArray180[local323] != Static104.anIntArray148[local323]) {
									local502 = true;
									break;
								}
							}
						}
						if (!local469[local92 + 1 & 0x3]) {
							local80[1] = Static224.method3034(local80[1], (Static90.anIntArray129[4] & Static90.anIntArray129[2]) == 0);
						}
						if (!local469[local92 + 3 & 0x3]) {
							local80[3] = Static224.method3034(local80[3], (Static90.anIntArray129[0] & Static90.anIntArray129[6]) == 0);
						}
						if (!local469[local92 & 0x3]) {
							local80[0] = Static224.method3034(local80[0], (Static90.anIntArray129[0] & Static90.anIntArray129[2]) == 0);
						}
						if (!local469[local92 + 2 & 0x3]) {
							local80[2] = Static224.method3034(local80[2], (Static90.anIntArray129[4] & Static90.anIntArray129[6]) == 0);
						}
						if (!local77 && (local86 == 0 || local86 == 12)) {
							if (local80[0] && !local80[1] && !local80[2] && local80[3]) {
								local92 = 0;
								local86 = local86 == 0 ? 13 : 14;
								local80[0] = local80[3] = false;
							} else if (local80[0] && local80[1] && !local80[2] && !local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local92 = 3;
								local80[0] = local80[1] = false;
							} else if (!local80[0] && local80[1] && local80[2] && !local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local92 = 2;
								local80[1] = local80[2] = false;
							} else if (!local80[0] && !local80[1] && local80[2] && local80[3]) {
								local80[2] = local80[3] = false;
								local92 = 1;
								local86 = local86 == 0 ? 13 : 14;
							}
						}
						@Pc(806) boolean local806 = !local77 && !local80[0] && !local80[2] && !local80[1] && !local80[3];
						@Pc(808) int[] local808 = null;
						@Pc(826) int[] local826;
						@Pc(830) int[] local830;
						@Pc(814) int[] local814;
						if (local806) {
							local814 = Static193.anIntArrayArray16[local86];
							local387 = local154 == null ? 0 : Static7.anIntArray2[local86];
							local826 = Static336.anIntArrayArray55[local86];
							local830 = Static450.anIntArrayArray64[local86];
							local377 = local166 == null ? 0 : Static259.anIntArray358[local86];
						} else if (local77) {
							local826 = Static113.anIntArrayArray28[local86];
							local387 = local154 == null ? 0 : Static92.anIntArray132[local86];
							local808 = Static282.anIntArrayArray51[local86];
							local814 = Static451.anIntArrayArray65[local86];
							local377 = local166 == null ? 0 : Static263.anIntArray361[local86];
							local830 = Static302.anIntArrayArray52[local86];
						} else {
							local830 = Static86.anIntArrayArray20[local86];
							local387 = local154 == null ? 0 : Static21.anIntArray20[local86];
							local377 = local166 == null ? 0 : Static429.anIntArray529[local86];
							local814 = Static77.anIntArrayArray17[local86];
							local826 = Static198.anIntArrayArray53[local86];
							local808 = Static84.anIntArrayArray54[local86];
						}
						@Pc(911) int local911 = local377 + local387;
						if (local911 <= 0) {
							Static188.method2765(arg1, local31, local47);
						} else {
							if (local80[0]) {
								local911++;
							}
							if (local80[2]) {
								local911++;
							}
							if (local80[1]) {
								local911++;
							}
							if (local80[3]) {
								local911++;
							}
							@Pc(941) int local941 = 0;
							@Pc(943) int local943 = 0;
							@Pc(947) int local947 = local911 * 3;
							@Pc(954) int[] local954 = local502 ? new int[local947] : null;
							@Pc(957) int[] local957 = new int[local947];
							@Pc(960) int[] local960 = new int[local947];
							@Pc(963) int[] local963 = new int[local947];
							@Pc(966) int[] local966 = new int[local947];
							@Pc(969) int[] local969 = new int[local947];
							@Pc(976) int[] local976 = arg3 == null ? null : new int[local947];
							@Pc(985) int[] local985 = arg3 == null && arg2 == null ? null : new int[local947];
							@Pc(987) int local987 = -1;
							@Pc(989) int local989 = -1;
							@Pc(991) int local991 = 256;
							@Pc(1136) byte local1136;
							@Pc(1041) int local1041;
							@Pc(1043) int local1043;
							@Pc(1275) int local1275;
							@Pc(1281) int local1281;
							@Pc(1290) int local1290;
							@Pc(1295) int local1295;
							@Pc(1307) int local1307;
							@Pc(1300) int local1300;
							@Pc(1312) int local1312;
							@Pc(1367) int local1367;
							@Pc(1373) int local1373;
							if (local154 != null) {
								local987 = local154.anInt7253;
								local989 = arg0.method5367() ? local154.anInt7247 : local154.anInt7239;
								local991 = local154.anInt7238;
								local1041 = Static272.method3611(local154, arg0);
								for (local1043 = 0; local1043 < local387; local1043++) {
									if (local80[-local92 & 0x3] && local808[0] == local941) {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = 1;
										Static111.anIntArray157[2] = local814[local941];
										Static111.anIntArray157[3] = 1;
										Static111.anIntArray157[4] = local830[local941];
										local1136 = 6;
										Static111.anIntArray157[5] = local814[local941];
									} else if (local80[2 - local92 & 0x3] && local808[2] == local941) {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = 5;
										Static111.anIntArray157[2] = local814[local941];
										Static111.anIntArray157[3] = 5;
										Static111.anIntArray157[4] = local830[local941];
										Static111.anIntArray157[5] = local814[local941];
										local1136 = 6;
									} else if (local80[1 - local92 & 0x3] && local941 == local808[1]) {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = 3;
										Static111.anIntArray157[2] = local814[local941];
										Static111.anIntArray157[3] = 3;
										Static111.anIntArray157[4] = local830[local941];
										Static111.anIntArray157[5] = local814[local941];
										local1136 = 6;
									} else if (local80[3 - local92 & 0x3] && local808[3] == local941) {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = 7;
										Static111.anIntArray157[2] = local814[local941];
										Static111.anIntArray157[3] = 7;
										Static111.anIntArray157[4] = local830[local941];
										local1136 = 6;
										Static111.anIntArray157[5] = local814[local941];
									} else {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = local830[local941];
										local1136 = 3;
										Static111.anIntArray157[2] = local814[local941];
									}
									local941++;
									for (local1275 = 0; local1275 < local1136; local1275++) {
										local1281 = Static111.anIntArray157[local1275];
										local1290 = local1281 - local92 * 2 & 0x7;
										local1295 = this.anIntArray169[local1281];
										local1300 = this.anIntArray170[local1281];
										if (local92 == 1) {
											local1307 = local1300;
											local1312 = 128 - local1295;
										} else if (local92 == 2) {
											local1307 = 128 - local1295;
											local1312 = 128 - local1300;
										} else if (local92 == 3) {
											local1312 = local1295;
											local1307 = 128 - local1300;
										} else {
											local1307 = local1295;
											local1312 = local1300;
										}
										local957[local943] = local1307;
										local960[local943] = local1312;
										if (local976 != null && Static437.aBooleanArrayArray9[local86][local1281]) {
											local1367 = (local31 << 7) + local1307;
											local1373 = local1312 + (local47 << 7);
											local976[local943] = arg3.a(local1367, local1373) - arg4.a(local1367, local1373);
										}
										if (local985 != null) {
											if (arg3 != null && !Static437.aBooleanArrayArray9[local86][local1281]) {
												local1367 = (local31 << 7) + local1307;
												local1373 = (local47 << 7) + local1312;
												local985[local943] = arg4.a(local1367, local1373) - arg3.a(local1367, local1373);
											} else if (arg2 != null && !Static212.aBooleanArrayArray4[local86][local1281]) {
												local1367 = (local31 << 7) + local1307;
												local1373 = (local47 << 7) + local1312;
												local985[local943] = arg2.a(local1367, local1373) - arg4.a(local1367, local1373);
											}
										}
										if (local1281 < 8 && local154.anInt7244 < Static437.anIntArray550[local1290]) {
											if (local954 != null) {
												local954[local943] = Static158.anIntArray180[local1290];
											}
											local969[local943] = Static285.anIntArray379[local1290];
											local966[local943] = Static401.anIntArray513[local1290];
											local963[local943] = Static104.anIntArray148[local1290];
										} else {
											if (local954 != null) {
												local954[local943] = local1041;
											}
											local966[local943] = arg0.method5367() ? local154.anInt7247 : local154.anInt7239;
											local969[local943] = local154.anInt7238;
											local963[local943] = local987;
										}
										local943++;
									}
								}
								if (!this.aBoolean148 && arg1 == 0) {
									Static39.method543(local31, local47, local154.anInt7246, local154.anInt7242 * 8, local154.anInt7240);
								}
								if (local86 != 12 && local154.anInt7253 != -1 && local154.aBoolean513) {
									local75 = true;
								}
							} else if (local806) {
								local941 = Static7.anIntArray2[local86];
							} else if (local77) {
								local941 = Static92.anIntArray132[local86];
							} else {
								local941 = Static21.anIntArray20[local86];
							}
							if (local166 != null) {
								if (local116 == 0) {
									local116 = local108;
								}
								if (local132 == 0) {
									local132 = local108;
								}
								if (local124 == 0) {
									local124 = local108;
								}
								@Pc(1596) Class207 local1596 = this.aClass12_3.method164(local108 - 1);
								@Pc(1604) Class207 local1604 = this.aClass12_3.method164(local116 - 1);
								@Pc(1612) Class207 local1612 = this.aClass12_3.method164(local124 - 1);
								@Pc(1620) Class207 local1620 = this.aClass12_3.method164(local132 - 1);
								for (local1290 = 0; local1290 < local377; local1290++) {
									if (local80[-local92 & 0x3] && local808[0] == local941) {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = 1;
										Static111.anIntArray157[2] = local814[local941];
										Static111.anIntArray157[3] = 1;
										Static111.anIntArray157[4] = local830[local941];
										Static111.anIntArray157[5] = local814[local941];
										local1136 = 6;
									} else if (local80[2 - local92 & 0x3] && local808[2] == local941) {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = 5;
										Static111.anIntArray157[2] = local814[local941];
										Static111.anIntArray157[3] = 5;
										Static111.anIntArray157[4] = local830[local941];
										local1136 = 6;
										Static111.anIntArray157[5] = local814[local941];
									} else if (local80[1 - local92 & 0x3] && local808[1] == local941) {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = 3;
										Static111.anIntArray157[2] = local814[local941];
										Static111.anIntArray157[3] = 3;
										Static111.anIntArray157[4] = local830[local941];
										Static111.anIntArray157[5] = local814[local941];
										local1136 = 6;
									} else if (local80[3 - local92 & 0x3] && local941 == local808[3]) {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = 7;
										Static111.anIntArray157[2] = local814[local941];
										Static111.anIntArray157[3] = 7;
										Static111.anIntArray157[4] = local830[local941];
										Static111.anIntArray157[5] = local814[local941];
										local1136 = 6;
									} else {
										Static111.anIntArray157[0] = local826[local941];
										Static111.anIntArray157[1] = local830[local941];
										Static111.anIntArray157[2] = local814[local941];
										local1136 = 3;
									}
									for (local1295 = 0; local1295 < local1136; local1295++) {
										local1307 = Static111.anIntArray157[local1295];
										local1300 = local1307 - local92 * 2 & 0x7;
										local1312 = this.anIntArray169[local1307];
										local1373 = this.anIntArray170[local1307];
										@Pc(1899) int local1899;
										if (local92 == 1) {
											local1899 = 128 - local1312;
											local1367 = local1373;
										} else if (local92 == 2) {
											local1899 = 128 - local1373;
											local1367 = 128 - local1312;
										} else if (local92 == 3) {
											local1899 = local1312;
											local1367 = 128 - local1373;
										} else {
											local1367 = local1312;
											local1899 = local1373;
										}
										local957[local943] = local1367;
										local960[local943] = local1899;
										@Pc(1955) int local1955;
										@Pc(1961) int local1961;
										if (local976 != null && Static437.aBooleanArrayArray9[local86][local1307]) {
											local1955 = local1367 + (local31 << 7);
											local1961 = local1899 + (local47 << 7);
											local976[local943] = arg3.a(local1955, local1961) - arg4.a(local1955, local1961);
										}
										if (local985 != null) {
											if (arg3 != null && !Static437.aBooleanArrayArray9[local86][local1307]) {
												local1955 = (local31 << 7) + local1367;
												local1961 = (local47 << 7) + local1899;
												local985[local943] = arg4.a(local1955, local1961) - arg3.a(local1955, local1961);
											} else if (arg2 != null && !Static212.aBooleanArrayArray4[local86][local1307]) {
												local1955 = local1367 + (local31 << 7);
												local1961 = (local47 << 7) + local1899;
												local985[local943] = arg2.a(local1955, local1961) - arg4.a(local1955, local1961);
											}
										}
										if (local1307 < 8 && Static437.anIntArray550[local1300] >= 0) {
											if (local954 != null) {
												local954[local943] = Static158.anIntArray180[local1300];
											}
											local969[local943] = Static285.anIntArray379[local1300];
											local966[local943] = Static401.anIntArray513[local1300];
											local963[local943] = Static104.anIntArray148[local1300];
										} else {
											if (local77 && Static437.aBooleanArrayArray9[local86][local1307]) {
												local966[local943] = local989;
												local969[local943] = local991;
												local963[local943] = local987;
											} else if (local1367 == 0 && local1899 == 0) {
												local963[local943] = arg5[local31][local47];
												local966[local943] = local1596.anInt5252;
												local969[local943] = local1596.anInt5250;
											} else if (local1367 == 0 && local1899 == 128) {
												local963[local943] = arg5[local31][local61];
												local966[local943] = local1604.anInt5252;
												local969[local943] = local1604.anInt5250;
											} else if (local1367 == 128 && local1899 == 128) {
												local963[local943] = arg5[local45][local61];
												local966[local943] = local1612.anInt5252;
												local969[local943] = local1612.anInt5250;
											} else if (local1367 == 128 && local1899 == 0) {
												local963[local943] = arg5[local45][local47];
												local966[local943] = local1620.anInt5252;
												local969[local943] = local1620.anInt5250;
											} else {
												if (local1367 >= 64) {
													if (local1899 < 64) {
														local966[local943] = local1620.anInt5252;
														local969[local943] = local1620.anInt5250;
													} else {
														local966[local943] = local1612.anInt5252;
														local969[local943] = local1612.anInt5250;
													}
												} else if (local1899 >= 64) {
													local966[local943] = local1604.anInt5252;
													local969[local943] = local1604.anInt5250;
												} else {
													local966[local943] = local1596.anInt5252;
													local969[local943] = local1596.anInt5250;
												}
												local1955 = Static339.method4487(local1367 << 7 >> 7, arg5[local45][local47], arg5[local31][local47]);
												local1961 = Static339.method4487(local1367 << 7 >> 7, arg5[local45][local61], arg5[local31][local61]);
												local963[local943] = Static339.method4487(local1899 << 7 >> 7, local1961, local1955);
											}
											if (local954 != null) {
												local954[local943] = local963[local943];
											}
										}
										local943++;
									}
									local941++;
								}
								if (local86 != 0 && local166.aBoolean375) {
									local75 = true;
								}
							}
							local1041 = arg4.l(local31, local47);
							local1043 = arg4.l(local45, local47);
							local1275 = arg4.l(local45, local61);
							local1281 = arg4.l(local31, local61);
							if (arg1 > 0) {
								@Pc(2387) boolean local2387 = true;
								if (local108 == 0 && local86 != 0) {
									local2387 = false;
								}
								if (local100 > 0 && local177 != null && !local177.aBoolean512) {
									local2387 = false;
								}
								if (local2387 && local1041 == local1043 && local1041 == local1275 && local1281 == local1041) {
									this.aByteArrayArrayArray9[arg1][local31][local47] = (byte) (this.aByteArrayArrayArray9[arg1][local31][local47] | 0x4);
								}
							}
							local1290 = 0;
							local1295 = 0;
							local1307 = 0;
							if (this.aBoolean148) {
								local1290 = Static224.method3039(local31, local47);
								local1295 = Static161.method2285(local31, local47);
								local1307 = Static70.method1168(local31, local47);
							}
							arg4.B(local31, local47, local957, local976, local960, local985, local963, local954, local966, local969, local1290, local1295, local1307, local75);
							Static188.method2765(arg1, local31, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!ta;Lclient!ta;ILclient!ta;Lclient!ya;[[IB)V")
	private void method1703(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class41 arg3, @OriginalArg(4) Class135 arg4, @OriginalArg(5) int[][] arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2144; local7++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt2140; local20++) {
				if (Static169.anInt3059 == -1 || Static376.method4953(arg2, local7, Static169.anInt3059, local20)) {
					@Pc(43) byte local43 = this.aByteArrayArrayArray12[arg2][local7][local20];
					@Pc(52) byte local52 = this.aByteArrayArrayArray11[arg2][local7][local20];
					@Pc(63) int local63 = this.aByteArrayArrayArray8[arg2][local7][local20] & 0xFF;
					@Pc(74) int local74 = this.aByteArrayArrayArray13[arg2][local7][local20] & 0xFF;
					@Pc(89) Class261 local89 = local63 == 0 ? null : this.aClass79_2.method1582(local63 - 1);
					@Pc(104) Class207 local104 = local74 == 0 ? null : this.aClass12_3.method164(local74 - 1);
					@Pc(106) int local106 = 0;
					@Pc(108) int local108 = 0;
					if (local43 != 0) {
						local106 = local104 == null ? 0 : Static259.anIntArray358[local43];
						local108 = local89 == null ? 0 : Static7.anIntArray2[local43];
					} else if (local89 != null) {
						local108 = Static7.anIntArray2[local43];
					} else if (local104 != null) {
						local106 = Static7.anIntArray2[local43];
					}
					@Pc(146) int local146 = local106 + local108;
					@Pc(148) int local148 = 0;
					if (local146 != 0) {
						@Pc(156) int[] local156 = new int[local146];
						@Pc(159) int[] local159 = new int[local146];
						@Pc(162) int[] local162 = new int[local146];
						@Pc(165) int[] local165 = new int[local146];
						@Pc(167) boolean local167 = false;
						@Pc(184) int local184;
						@Pc(212) int local212;
						if (local89 == null || local89.anInt7253 == -1 && local89.anInt7245 == -1 && local89.anInt7247 == -1) {
							for (local184 = 0; local184 < local108; local184++) {
								local156[local148] = -1;
								local148++;
							}
						} else {
							local184 = arg4.method5367() ? local89.anInt7247 : local89.anInt7239;
							if (Static225.aBoolean286) {
								local184 = -1;
							}
							for (local212 = 0; local212 < local108; local212++) {
								local162[local148] = local184;
								local165[local148] = local89.anInt7238;
								if (local89.anInt7253 == -1) {
									local156[local148] = -1;
								} else {
									local156[local148] = local89.anInt7253;
								}
								if (local89.anInt7245 == -1) {
									local159[local148] = -1;
								} else {
									local159[local148] = local89.anInt7245;
									local167 = true;
								}
								local148++;
							}
							if (!this.aBoolean148 && arg2 == 0) {
								Static39.method543(local7, local20, local89.anInt7246, local89.anInt7242 * 8, local89.anInt7240);
							}
						}
						if (!local167) {
							local159 = null;
						}
						if (local104 == null) {
							for (local184 = 0; local184 < local106; local184++) {
								local156[local148] = -1;
								local148++;
							}
						} else {
							local184 = local104.anInt5252;
							if (Static225.aBoolean286) {
								local184 = -1;
							}
							for (local212 = 0; local212 < local106; local212++) {
								local162[local148] = local184;
								local165[local148] = local104.anInt5250;
								local156[local148] = arg5[local7][local20];
								if (local159 != null) {
									local159[local148] = -1;
								}
								local148++;
							}
						}
						local184 = this.anIntArray169.length;
						@Pc(349) int[] local349 = new int[local184];
						@Pc(352) int[] local352 = new int[local184];
						@Pc(359) int[] local359 = arg3 == null ? null : new int[local184];
						@Pc(368) int[] local368 = arg3 == null && arg0 == null ? null : new int[local184];
						@Pc(377) int local377;
						@Pc(382) int local382;
						@Pc(468) int local468;
						@Pc(475) int local475;
						for (@Pc(370) int local370 = 0; local370 < local184; local370++) {
							local377 = this.anIntArray169[local370];
							local382 = this.anIntArray170[local370];
							if (local52 == 0) {
								local349[local370] = local377;
								local352[local370] = local382;
							} else if (local52 == 1) {
								local349[local370] = local382;
								local352[local370] = 128 - local377;
							} else if (local52 == 2) {
								local349[local370] = 128 - local377;
								local352[local370] = 128 - local382;
							} else if (local52 == 3) {
								local349[local370] = 128 - local382;
								local352[local370] = local377;
							}
							if (local359 != null && Static437.aBooleanArrayArray9[local43][local370]) {
								local468 = local377 + (local7 << 7);
								local475 = (local20 << 7) + local377;
								local359[local370] = arg3.a(local468, local475) - arg1.a(local468, local475);
							}
							if (local368 != null) {
								if (arg3 != null && !Static437.aBooleanArrayArray9[local43][local370]) {
									local468 = local377 + (local7 << 7);
									local475 = (local20 << 7) + local377;
									local368[local370] = arg1.a(local468, local475) - arg3.a(local468, local475);
								} else if (arg0 != null && !Static212.aBooleanArrayArray4[local43][local370]) {
									local468 = (local7 << 7) + local377;
									local475 = (local20 << 7) + local377;
									local368[local370] = arg0.a(local468, local475) - arg1.a(local468, local475);
								}
							}
						}
						local377 = arg1.l(local7, local20);
						local382 = arg1.l(local7 + 1, local20);
						local468 = arg1.l(local7 + 1, local20 + 1);
						local475 = arg1.l(local7, local20 + 1);
						if (arg2 > 0) {
							@Pc(596) boolean local596 = true;
							if (local74 == 0 && local43 != 0) {
								local596 = false;
							}
							if (local63 > 0 && local89 != null && !local89.aBoolean512) {
								local596 = false;
							}
							if (local596 && local382 == local377 && local468 == local377 && local377 == local475) {
								this.aByteArrayArrayArray9[arg2][local7][local20] = (byte) (this.aByteArrayArrayArray9[arg2][local7][local20] | 0x4);
							}
						}
						@Pc(646) int local646 = 0;
						@Pc(648) int local648 = 0;
						@Pc(650) int local650 = 0;
						if (this.aBoolean148) {
							local646 = Static224.method3039(local7, local20);
							local648 = Static161.method2285(local7, local20);
							local650 = Static70.method1168(local7, local20);
						}
						arg1.method5564(local7, local20, local349, local359, local352, local368, Static336.anIntArrayArray55[local43], Static450.anIntArrayArray64[local43], Static193.anIntArrayArray16[local43], local156, local159, local162, local165, local646, local648, local650);
						Static188.method2765(arg2, local7, local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[Lclient!is;[[[ILclient!ya;)V")
	public final void method1704(@OriginalArg(1) Class128[] arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) Class135 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean148) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt2144; local10++) {
					for (local14 = 0; local14 < this.anInt2140; local14++) {
						if ((Static4.aByteArrayArrayArray1[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static4.aByteArrayArrayArray1[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg0[local31].method2460(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt2142; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean148) {
				if (Static389.aBoolean440) {
					local10 = 2;
				}
				if (Static342.aBoolean400) {
					local14 = 8;
				}
				if (Static262.anInt4697 != 0) {
					if (local6 == 0 | Static416.aBoolean497) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static389.aBoolean440) {
				local14 |= 0x7;
			}
			if (!Static53.aBoolean50) {
				local14 |= 0x20;
			}
			@Pc(143) int[][] local143 = arg1 == null || local6 >= arg1.length ? this.anIntArrayArrayArray2[local6] : arg1[local6];
			Static397.method5247(local6, arg2.method5378(this.anInt2144, this.anInt2140, this.anIntArrayArrayArray2[local6], local143, local10, local14));
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIII)V")
	public final void method1705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(20) int local20;
		for (@Pc(16) int local16 = arg1; local16 < arg3 + arg1; local16++) {
			for (local20 = arg0; local20 < arg2 + arg0; local20++) {
				if (local20 >= 0 && local20 < this.anInt2144 && local16 >= 0 && this.anInt2140 > local16) {
					this.anIntArrayArrayArray2[arg4][local20][local16] = arg4 <= 0 ? 0 : this.anIntArrayArrayArray2[arg4 - 1][local20][local16] - 240;
				}
			}
		}
		if (arg0 > 0 && this.anInt2144 > arg0) {
			for (local20 = arg1 + 1; local20 < arg1 + arg3; local20++) {
				if (local20 >= 0 && this.anInt2140 > local20) {
					this.anIntArrayArrayArray2[arg4][arg0][local20] = this.anIntArrayArrayArray2[arg4][arg0 - 1][local20];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt2140) {
			for (local20 = arg0 + 1; local20 < arg0 + arg2; local20++) {
				if (local20 >= 0 && local20 < this.anInt2144) {
					this.anIntArrayArrayArray2[arg4][local20][arg1] = this.anIntArrayArrayArray2[arg4][local20][arg1 - 1];
				}
			}
		}
		if (arg0 < 0 || arg1 < 0 || arg0 >= this.anInt2144 || this.anInt2140 <= arg1) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray2[arg4][arg0 - 1][arg1] != 0) {
				this.anIntArrayArrayArray2[arg4][arg0][arg1] = this.anIntArrayArrayArray2[arg4][arg0 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray2[arg4][arg0][arg1 - 1] != 0) {
				this.anIntArrayArrayArray2[arg4][arg0][arg1] = this.anIntArrayArrayArray2[arg4][arg0][arg1 - 1];
				return;
			}
			if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray2[arg4][arg0 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray2[arg4][arg0][arg1] = this.anIntArrayArrayArray2[arg4][arg0 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray2[arg4][arg0 - 1][arg1] != this.anIntArrayArrayArray2[arg4 - 1][arg0 - 1][arg1]) {
			this.anIntArrayArrayArray2[arg4][arg0][arg1] = this.anIntArrayArrayArray2[arg4][arg0 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray2[arg4 - 1][arg0][arg1 - 1] != this.anIntArrayArrayArray2[arg4][arg0][arg1 - 1]) {
			this.anIntArrayArrayArray2[arg4][arg0][arg1] = this.anIntArrayArrayArray2[arg4][arg0][arg1 - 1];
			return;
		}
		if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray2[arg4][arg0 - 1][arg1 - 1] != this.anIntArrayArrayArray2[arg4 - 1][arg0 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray2[arg4][arg0][arg1] = this.anIntArrayArrayArray2[arg4][arg0 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILclient!fh;IIIIBI[Lclient!is;)V")
	public final void method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class128[] arg8) {
		@Pc(11) int local11 = (arg5 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean148) {
			@Pc(24) Class128 local24 = arg8[arg1];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = arg0 + Static81.method1307(local26 & 0x7, arg7, local30 & 0x7);
					local56 = Static289.method3775(local26 & 0x7, local30 & 0x7, arg7) + arg4;
					if (local44 > 0 && this.anInt2144 - 1 > local44 && local56 > 0 && local56 < this.anInt2140 - 1) {
						local24.method2451(local44, local56);
					}
				}
			}
		}
		@Pc(91) int local91 = (arg5 & 0xFFFFFFF8) << 3;
		local26 = (arg3 & 0x1FFFFFF8) << 3;
		@Pc(99) byte local99 = 0;
		@Pc(101) byte local101 = 0;
		if (arg7 == 1) {
			local101 = 1;
		} else if (arg7 == 2) {
			local99 = 1;
			local101 = 1;
		} else if (arg7 == 3) {
			local99 = 1;
		}
		for (local56 = 0; local56 < this.anInt2142; local56++) {
			for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
				for (@Pc(136) int local136 = 0; local136 < 64; local136++) {
					if (arg6 == local56 && local11 <= local132 && local11 + 8 >= local132 && local17 <= local136 && local17 + 8 >= local136) {
						@Pc(192) int local192;
						@Pc(204) int local204;
						if (local11 + 8 == local132 || local17 + 8 == local136) {
							if (arg7 == 0) {
								local204 = local136 + arg4 - local17;
								local192 = arg0 + local132 - local11;
							} else if (arg7 == 1) {
								local204 = arg4 + local11 + 8 - local132;
								local192 = arg0 + local136 - local17;
							} else if (arg7 == 2) {
								local204 = arg4 + local17 + 8 - local136;
								local192 = local11 + arg0 + 8 - local132;
							} else {
								local204 = local132 + arg4 - local11;
								local192 = arg0 + local17 + 8 - local136;
							}
							this.method1707(0, arg1, local192, local136 + local26, 0, 0, true, local132 + local91, arg2, local204);
						} else {
							local192 = arg0 + Static81.method1307(local132 & 0x7, arg7, local136 & 0x7);
							local204 = Static289.method3775(local132 & 0x7, local136 & 0x7, arg7) + arg4;
							this.method1707(local99, arg1, local192, local136 + local26, local101, arg7, false, local132 + local91, arg2, local204);
							if (local132 == 63 || local136 == 63) {
								@Pc(238) int local238 = local132 == 63 ? 64 : local132;
								@Pc(247) int local247 = local136 == 63 ? 64 : local136;
								@Pc(258) int local258;
								@Pc(266) int local266;
								if (arg7 == 0) {
									local258 = arg0 + local238 - local11;
									local266 = local247 + arg4 - local17;
								} else if (arg7 == 1) {
									local266 = arg4 + local11 + 8 - local238;
									local258 = local247 + arg0 - local17;
								} else if (arg7 == 2) {
									local258 = arg0 + local11 + 8 - local238;
									local266 = arg4 + local17 + 8 - local247;
								} else {
									local266 = local238 + arg4 - local11;
									local258 = local17 + arg0 + 8 - local247;
								}
								if (local258 >= 0 && local258 < this.anInt2144 && local266 >= 0 && local266 < this.anInt2140) {
									this.anIntArrayArrayArray2[arg1][local258][local266] = this.anIntArrayArrayArray2[arg1][local99 + local192][local204 + local101];
								}
							}
						}
					} else {
						this.method1707(0, 0, -1, 0, 0, 0, false, 0, arg2, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIZILclient!fh;IZ)V")
	private void method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub9 arg8, @OriginalArg(9) int arg9) {
		if (arg5 == 1) {
			arg4 = 1;
		} else if (arg5 == 2) {
			arg4 = 1;
			arg0 = 1;
		} else if (arg5 == 3) {
			arg0 = 1;
		}
		@Pc(65) int local65;
		if (arg2 < 0 || this.anInt2144 <= arg2 || arg9 < 0 || this.anInt2140 <= arg9) {
			while (true) {
				local65 = arg8.method5007();
				if (local65 == 0) {
					return;
				}
				if (local65 == 1) {
					arg8.method5007();
					return;
				}
				if (local65 <= 49) {
					arg8.method5007();
				}
			}
			return;
		}
		if (!this.aBoolean148 && !arg6) {
			Static4.aByteArrayArrayArray1[arg1][arg2][arg9] = 0;
		}
		while (true) {
			local65 = arg8.method5007();
			if (local65 == 0) {
				if (this.aBoolean148) {
					this.anIntArrayArrayArray2[0][arg2 + arg0][arg4 + arg9] = 0;
					return;
				} else if (arg1 == 0) {
					this.anIntArrayArrayArray2[0][arg0 + arg2][arg9 + arg4] = -Static170.method5838(arg3 + 556238, arg7 + 932731) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray2[arg1][arg0 + arg2][arg4 + arg9] = this.anIntArrayArrayArray2[arg1 - 1][arg0 + arg2][arg9 + arg4] - 240;
					return;
				}
			}
			if (local65 == 1) {
				@Pc(153) int local153 = arg8.method5007();
				if (this.aBoolean148) {
					this.anIntArrayArrayArray2[0][arg2 + arg0][arg4 + arg9] = local153 * 8 << 0;
					return;
				}
				if (local153 == 1) {
					local153 = 0;
				}
				if (arg1 == 0) {
					this.anIntArrayArrayArray2[0][arg0 + arg2][arg9 + arg4] = -local153 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray2[arg1][arg2 + arg0][arg9 + arg4] = this.anIntArrayArrayArray2[arg1 - 1][arg0 + arg2][arg9 + arg4] - (local153 * 8 << 0);
				return;
			}
			if (local65 <= 49) {
				if (arg6) {
					arg8.method5007();
				} else {
					this.aByteArrayArrayArray8[arg1][arg2][arg9] = arg8.method5063();
					this.aByteArrayArrayArray12[arg1][arg2][arg9] = (byte) ((local65 - 2) / 4);
					this.aByteArrayArrayArray11[arg1][arg2][arg9] = (byte) (local65 + arg5 - 2 & 0x3);
				}
			} else if (local65 <= 81) {
				if (!this.aBoolean148 && !arg6) {
					Static4.aByteArrayArrayArray1[arg1][arg2][arg9] = (byte) (local65 - 49);
				}
			} else if (!arg6) {
				this.aByteArrayArrayArray13[arg1][arg2][arg9] = (byte) (local65 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[[I)V")
	public final void method1708(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray2[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2144 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2140 + 1; local22++) {
				local10[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II[[BIII[Z[[BII[[BLclient!qg;Lclient!w;Lclient!ya;)V")
	private void method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) Class207 arg10, @OriginalArg(12) Class261 arg11, @OriginalArg(13) Class135 arg12) {
		@Pc(18) boolean[] local18 = arg11 != null && arg11.aBoolean511 ? Static41.aBooleanArrayArray1[arg4] : Static279.aBooleanArrayArray5[arg4];
		@Pc(34) int local34;
		@Pc(47) Class261 local47;
		@Pc(64) byte local64;
		@Pc(81) int local81;
		@Pc(86) int local86;
		if (arg3 > 0) {
			if (arg0 > 0) {
				local34 = arg6[arg0 - 1][arg3 - 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass79_2.method1582(local34 - 1);
					if (local47.anInt7253 != -1 && local47.aBoolean511) {
						local64 = arg2[arg0 - 1][arg3 - 1];
						local81 = arg9[arg0 - 1][arg3 - 1] * 2 + 4 & 0x7;
						local86 = Static272.method3611(local47, arg12);
						if (Static437.aBooleanArrayArray9[local64][local81]) {
							Static104.anIntArray148[0] = local47.anInt7253;
							Static158.anIntArray180[0] = local86;
							Static401.anIntArray513[0] = arg12.method5367() ? local47.anInt7247 : local47.anInt7239;
							Static285.anIntArray379[0] = local47.anInt7238;
							Static437.anIntArray550[0] = local47.anInt7244;
							Static90.anIntArray129[0] = 256;
						}
					}
				}
			}
			if (arg8 - 1 > arg0) {
				local34 = arg6[arg0 + 1][arg3 - 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass79_2.method1582(local34 - 1);
					if (local47.anInt7253 != -1 && local47.aBoolean511) {
						local64 = arg2[arg0 + 1][arg3 - 1];
						local81 = arg9[arg0 + 1][arg3 - 1] * 2 + 6 & 0x7;
						local86 = Static272.method3611(local47, arg12);
						if (Static437.aBooleanArrayArray9[local64][local81]) {
							Static104.anIntArray148[2] = local47.anInt7253;
							Static158.anIntArray180[2] = local86;
							Static401.anIntArray513[2] = arg12.method5367() ? local47.anInt7247 : local47.anInt7239;
							Static285.anIntArray379[2] = local47.anInt7238;
							Static437.anIntArray550[2] = local47.anInt7244;
							Static90.anIntArray129[2] = 512;
						}
					}
				}
			}
		}
		if (arg7 - 1 > arg3) {
			if (arg0 > 0) {
				local34 = arg6[arg0 - 1][arg3 + 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass79_2.method1582(local34 - 1);
					if (local47.anInt7253 != -1 && local47.aBoolean511) {
						local64 = arg2[arg0 - 1][arg3 + 1];
						local81 = arg9[arg0 - 1][arg3 + 1] * 2 + 2 & 0x7;
						local86 = Static272.method3611(local47, arg12);
						if (Static437.aBooleanArrayArray9[local64][local81]) {
							Static104.anIntArray148[6] = local47.anInt7253;
							Static158.anIntArray180[6] = local86;
							Static401.anIntArray513[6] = arg12.method5367() ? local47.anInt7247 : local47.anInt7239;
							Static285.anIntArray379[6] = local47.anInt7238;
							Static437.anIntArray550[6] = local47.anInt7244;
							Static90.anIntArray129[6] = 64;
						}
					}
				}
			}
			if (arg8 - 1 > arg0) {
				local34 = arg6[arg0 + 1][arg3 + 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass79_2.method1582(local34 - 1);
					if (local47.anInt7253 != -1 && local47.aBoolean511) {
						local64 = arg2[arg0 + 1][arg3 + 1];
						local81 = arg9[arg0 + 1][arg3 + 1] * 2 & 0x7;
						local86 = Static272.method3611(local47, arg12);
						if (Static437.aBooleanArrayArray9[local64][local81]) {
							Static104.anIntArray148[4] = local47.anInt7253;
							Static158.anIntArray180[4] = local86;
							Static401.anIntArray513[4] = arg12.method5367() ? local47.anInt7247 : local47.anInt7239;
							Static285.anIntArray379[4] = local47.anInt7238;
							Static437.anIntArray550[4] = local47.anInt7244;
							Static90.anIntArray129[4] = 128;
						}
					}
				}
			}
		}
		@Pc(511) int local511;
		@Pc(516) int local516;
		@Pc(518) int local518;
		@Pc(500) byte local500;
		if (arg3 > 0) {
			local34 = arg6[arg0][arg3 - 1] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass79_2.method1582(local34 - 1);
				if (local47.anInt7253 != -1) {
					local64 = arg2[arg0][arg3 - 1];
					local500 = arg9[arg0][arg3 - 1];
					if (local47.aBoolean511) {
						local86 = 2;
						local511 = local500 * 2 + 4;
						local516 = Static272.method3611(local47, arg12);
						for (local518 = 0; local518 < 3; local518++) {
							local511 &= 0x7;
							local86 &= 0x7;
							if (Static437.aBooleanArrayArray9[local64][local511] && local47.anInt7244 >= Static437.anIntArray550[local86]) {
								Static104.anIntArray148[local86] = local47.anInt7253;
								Static158.anIntArray180[local86] = local516;
								Static401.anIntArray513[local86] = arg12.method5367() ? local47.anInt7247 : local47.anInt7239;
								Static285.anIntArray379[local86] = local47.anInt7238;
								if (local47.anInt7244 == Static437.anIntArray550[local86]) {
									Static90.anIntArray129[local86] |= 0x20;
								} else {
									Static90.anIntArray129[local86] = 32;
								}
								Static437.anIntArray550[local86] = local47.anInt7244;
							}
							local511++;
							local86--;
						}
						if (!local18[arg1 & 0x3]) {
							arg5[0] = Static41.aBooleanArrayArray1[local64][local500 + 2 & 0x3];
						}
					} else if (!local18[arg1 & 0x3]) {
						arg5[0] = Static279.aBooleanArrayArray5[local64][local500 + 2 & 0x3];
					}
				}
			}
		}
		if (arg3 < arg7 - 1) {
			local34 = arg6[arg0][arg3 + 1] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass79_2.method1582(local34 - 1);
				if (local47.anInt7253 != -1) {
					local64 = arg2[arg0][arg3 + 1];
					local500 = arg9[arg0][arg3 + 1];
					if (local47.aBoolean511) {
						local86 = 4;
						local511 = local500 * 2 + 2;
						local516 = Static272.method3611(local47, arg12);
						for (local518 = 0; local518 < 3; local518++) {
							local86 &= 0x7;
							local511 &= 0x7;
							if (Static437.aBooleanArrayArray9[local64][local511] && local47.anInt7244 >= Static437.anIntArray550[local86]) {
								Static104.anIntArray148[local86] = local47.anInt7253;
								Static158.anIntArray180[local86] = local516;
								Static401.anIntArray513[local86] = arg12.method5367() ? local47.anInt7247 : local47.anInt7239;
								Static285.anIntArray379[local86] = local47.anInt7238;
								if (local47.anInt7244 == Static437.anIntArray550[local86]) {
									Static90.anIntArray129[local86] |= 0x10;
								} else {
									Static90.anIntArray129[local86] = 16;
								}
								Static437.anIntArray550[local86] = local47.anInt7244;
							}
							local511--;
							local86++;
						}
						if (!local18[arg1 + 2 & 0x3]) {
							arg5[2] = Static41.aBooleanArrayArray1[local64][--local500 & 0x3];
						}
					} else if (!local18[arg1 + 2 & 0x3]) {
						arg5[2] = Static279.aBooleanArrayArray5[local64][--local500 & 0x3];
					}
				}
			}
		}
		if (arg0 > 0) {
			local34 = arg6[arg0 - 1][arg3] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass79_2.method1582(local34 - 1);
				if (local47.anInt7253 != -1) {
					local64 = arg2[arg0 - 1][arg3];
					local500 = arg9[arg0 - 1][arg3];
					if (local47.aBoolean511) {
						local86 = 6;
						local511 = local500 * 2 + 4;
						local516 = Static272.method3611(local47, arg12);
						for (local518 = 0; local518 < 3; local518++) {
							local511 &= 0x7;
							local86 &= 0x7;
							if (Static437.aBooleanArrayArray9[local64][local511] && local47.anInt7244 >= Static437.anIntArray550[local86]) {
								Static104.anIntArray148[local86] = local47.anInt7253;
								Static158.anIntArray180[local86] = local516;
								Static401.anIntArray513[local86] = arg12.method5367() ? local47.anInt7247 : local47.anInt7239;
								Static285.anIntArray379[local86] = local47.anInt7238;
								if (local47.anInt7244 == Static437.anIntArray550[local86]) {
									Static90.anIntArray129[local86] |= 0x8;
								} else {
									Static90.anIntArray129[local86] = 8;
								}
								Static437.anIntArray550[local86] = local47.anInt7244;
							}
							local86++;
							local511--;
						}
						if (!local18[arg1 + 3 & 0x3]) {
							arg5[3] = Static41.aBooleanArrayArray1[local64][local500 + 1 & 0x3];
						}
					} else if (!local18[arg1 + 3 & 0x3]) {
						arg5[3] = Static279.aBooleanArrayArray5[local64][local500 + 1 & 0x3];
					}
				}
			}
		}
		if (arg8 - 1 > arg0) {
			local34 = arg6[arg0 + 1][arg3] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass79_2.method1582(local34 - 1);
				if (local47.anInt7253 != -1) {
					local64 = arg2[arg0 + 1][arg3];
					local500 = arg9[arg0 + 1][arg3];
					if (local47.aBoolean511) {
						local86 = 4;
						local511 = local500 * 2 + 6;
						local516 = Static272.method3611(local47, arg12);
						for (local518 = 0; local518 < 3; local518++) {
							local86 &= 0x7;
							local511 &= 0x7;
							if (Static437.aBooleanArrayArray9[local64][local511] && local47.anInt7244 >= Static437.anIntArray550[local86]) {
								Static104.anIntArray148[local86] = local47.anInt7253;
								Static158.anIntArray180[local86] = local516;
								Static401.anIntArray513[local86] = arg12.method5367() ? local47.anInt7247 : local47.anInt7239;
								Static285.anIntArray379[local86] = local47.anInt7238;
								if (Static437.anIntArray550[local86] == local47.anInt7244) {
									Static90.anIntArray129[local86] |= 0x4;
								} else {
									Static90.anIntArray129[local86] = 4;
								}
								Static437.anIntArray550[local86] = local47.anInt7244;
							}
							local511++;
							local86--;
						}
						if (!local18[arg1 + 1 & 0x3]) {
							arg5[1] = Static41.aBooleanArrayArray1[local64][local500 + 3 & 0x3];
						}
					} else if (!local18[arg1 + 1 & 0x3]) {
						arg5[1] = Static279.aBooleanArrayArray5[local64][local500 + 3 & 0x3];
					}
				}
			}
		}
		if (arg11 == null) {
			return;
		}
		local34 = Static272.method3611(arg11, arg12);
		if (!arg11.aBoolean511) {
			return;
		}
		for (@Pc(1230) int local1230 = 0; local1230 < 8; local1230++) {
			@Pc(1240) int local1240 = local1230 - arg1 * 2 & 0x7;
			if (Static437.aBooleanArrayArray9[arg4][local1230] && arg11.anInt7244 >= Static437.anIntArray550[local1240]) {
				Static104.anIntArray148[local1240] = arg11.anInt7253;
				Static158.anIntArray180[local1240] = local34;
				Static401.anIntArray513[local1240] = arg12.method5367() ? arg11.anInt7247 : arg11.anInt7239;
				Static285.anIntArray379[local1240] = arg11.anInt7238;
				if (arg11.anInt7244 == Static437.anIntArray550[local1240]) {
					Static90.anIntArray129[local1240] |= 0x2;
				} else {
					Static90.anIntArray129[local1240] = 2;
				}
				Static437.anIntArray550[local1240] = arg11.anInt7244;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!ya;ILclient!ta;Lclient!ta;)V")
	public final void method1711(@OriginalArg(0) Class135 arg0, @OriginalArg(2) Class41 arg1, @OriginalArg(3) Class41 arg2) {
		if (Static427.anIntArray230 == null || this.anInt2140 != Static427.anIntArray230.length) {
			Static54.anIntArray92 = new int[this.anInt2140];
			Static445.anIntArray561 = new int[this.anInt2140];
			Static329.anIntArray430 = new int[this.anInt2140];
			Static428.anIntArray541 = new int[this.anInt2140];
			Static427.anIntArray230 = new int[this.anInt2140];
		}
		@Pc(42) int[][] local42 = new int[this.anInt2144][this.anInt2140];
		@Pc(54) int local54;
		for (@Pc(44) int local44 = 0; local44 < this.anInt2142; local44++) {
			for (local54 = 0; local54 < this.anInt2140; local54++) {
				Static427.anIntArray230[local54] = 0;
				Static329.anIntArray430[local54] = 0;
				Static54.anIntArray92[local54] = 0;
				Static445.anIntArray561[local54] = 0;
				Static428.anIntArray541[local54] = 0;
			}
			for (@Pc(87) int local87 = -5; local87 < this.anInt2144; local87++) {
				@Pc(97) int local97;
				@Pc(116) int local116;
				@Pc(185) int local185;
				for (@Pc(91) int local91 = 0; local91 < this.anInt2140; local91++) {
					local97 = local87 + 5;
					@Pc(162) int local162;
					if (this.anInt2144 > local97) {
						local116 = this.aByteArrayArrayArray13[local44][local97][local91] & 0xFF;
						if (local116 > 0) {
							@Pc(126) Class207 local126 = this.aClass12_3.method164(local116 - 1);
							Static427.anIntArray230[local91] += local126.anInt5256;
							Static329.anIntArray430[local91] += local126.anInt5262;
							Static54.anIntArray92[local91] += local126.anInt5258;
							Static445.anIntArray561[local91] += local126.anInt5257;
							local162 = Static428.anIntArray541[local91]++;
						}
					}
					local116 = local87 - 5;
					if (local116 >= 0) {
						local185 = this.aByteArrayArrayArray13[local44][local116][local91] & 0xFF;
						if (local185 > 0) {
							@Pc(197) Class207 local197 = this.aClass12_3.method164(local185 - 1);
							Static427.anIntArray230[local91] -= local197.anInt5256;
							Static329.anIntArray430[local91] -= local197.anInt5262;
							Static54.anIntArray92[local91] -= local197.anInt5258;
							Static445.anIntArray561[local91] -= local197.anInt5257;
							local162 = Static428.anIntArray541[local91]--;
						}
					}
				}
				if (local87 >= 0) {
					local97 = 0;
					local116 = 0;
					local185 = 0;
					@Pc(254) int local254 = 0;
					@Pc(256) int local256 = 0;
					for (@Pc(258) int local258 = -5; local258 < this.anInt2140; local258++) {
						@Pc(264) int local264 = local258 + 5;
						if (this.anInt2140 > local264) {
							local256 += Static428.anIntArray541[local264];
							local254 += Static445.anIntArray561[local264];
							local116 += Static329.anIntArray430[local264];
							local185 += Static54.anIntArray92[local264];
							local97 += Static427.anIntArray230[local264];
						}
						@Pc(302) int local302 = local258 - 5;
						if (local302 >= 0) {
							local116 -= Static329.anIntArray430[local302];
							local256 -= Static428.anIntArray541[local302];
							local185 -= Static54.anIntArray92[local302];
							local97 -= Static427.anIntArray230[local302];
							local254 -= Static445.anIntArray561[local302];
						}
						if (local258 >= 0 && local254 > 0 && local256 > 0) {
							local42[local87][local258] = Static257.method3396(local116 / local256, local97 * 256 / local254, local185 / local256);
						}
					}
				}
			}
			if (Static276.aBoolean343) {
				this.method1701(arg0, local44, local44 == 0 ? arg2 : null, local44 == 0 ? arg1 : null, Static278.aClass41Array3[local44], local42);
			} else {
				this.method1703(local44 == 0 ? arg2 : null, Static278.aClass41Array3[local44], local44, local44 == 0 ? arg1 : null, arg0, local42);
			}
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray8[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
		}
		if (!this.aBoolean148) {
			if (Static262.anInt4697 != 0) {
				Static250.method3302();
			}
			if (Static389.aBoolean440) {
				Static366.method4857();
			}
		}
		for (local54 = 0; local54 < this.anInt2142; local54++) {
			Static278.aClass41Array3[local54].ca();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
	public final void method1712(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2142; local3++) {
			this.method1705(arg1, arg0, 64, 64, local3);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[Lclient!is;IIIILclient!fh;)V")
	public final void method1713(@OriginalArg(1) Class128[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub9 arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean148) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class128 local12 = arg0[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg3;
						@Pc(28) int local28 = arg1 + local18;
						if (local24 >= 0 && this.anInt2144 > local24 && local28 >= 0 && this.anInt2140 > local28) {
							local12.method2451(local24, local28);
						}
					}
				}
			}
		}
		local6 = arg4 + arg3;
		@Pc(89) int local89 = arg1 + arg2;
		for (local14 = 0; local14 < this.anInt2142; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method1707(0, local14, local18 + arg3, local24 + local89, 0, 0, false, local6 + local18, arg5, local24 + arg1);
				}
			}
		}
	}
}
