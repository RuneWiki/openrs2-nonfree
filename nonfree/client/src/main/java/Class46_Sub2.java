import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	private int anInt4689;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
	private int anInt4699;

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
	private int anInt4707;

	@OriginalMember(owner = "client!kb", name = "jb", descriptor = "Lclient!iq;")
	private Interface8 anInterface8_6;

	@OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!kb", name = "mb", descriptor = "Lclient!fl;")
	public Class107 aClass107_8;

	@OriginalMember(owner = "client!kb", name = "nb", descriptor = "Lclient!iq;")
	private Interface8 anInterface8_7;

	@OriginalMember(owner = "client!kb", name = "qb", descriptor = "[Lclient!cn;")
	private Class6_Sub10[] aClass6_Sub10Array1;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "F")
	private float aFloat122 = -3.4028235E38F;

	@OriginalMember(owner = "client!kb", name = "X", descriptor = "F")
	private float aFloat123 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lclient!su;")
	private final Class298 aClass298_99 = new Class298();

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "[[I")
	private final int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Lclient!gj;")
	public final Class90_Sub3 aClass90_Sub3_7;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private final int anInt4688;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "[[S")
	public final short[][] aShortArrayArray19;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private final int anInt4693;

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!kb", name = "ob", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!kb", name = "kb", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "[[[Lclient!cn;")
	private Class6_Sub10[][][] aClass6_Sub10ArrayArrayArray1;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[[B")
	private final byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	public final int anInt4686;

	@OriginalMember(owner = "client!kb", name = "pb", descriptor = "Lclient!oj;")
	private Class234 aClass234_30;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!qd;")
	private Class261 aClass261_1;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!gj;IIII[[I[[II)V")
	public Class46_Sub2(@OriginalArg(0) Class90_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.anIntArrayArray43 = arg5;
		this.aClass90_Sub3_7 = arg0;
		this.anInt4688 = super.anInt10000 - 2;
		this.aShortArrayArray19 = new short[arg4 * arg3][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray5 = new int[arg3][arg4][];
		this.anInt4693 = 0x1 << this.anInt4688;
		this.aFloatArrayArray2 = new float[super.anInt9997 + 1][super.anInt9995 + 1];
		this.aFloatArrayArray4 = new float[super.anInt9997 + 1][super.anInt9995 + 1];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aFloatArrayArray3 = new float[super.anInt9997 + 1][super.anInt9995 + 1];
		this.aClass6_Sub10ArrayArrayArray1 = new Class6_Sub10[arg3][arg4][];
		this.aByteArrayArray10 = new byte[arg3][arg4];
		this.aByteArrayArray11 = new byte[arg3 + 1][arg4 + 1];
		this.anInt4686 = arg2;
		for (@Pc(123) int local123 = 0; local123 <= super.anInt9995; local123++) {
			for (@Pc(127) int local127 = 0; local127 <= super.anInt9997; local127++) {
				@Pc(136) int local136 = this.anIntArrayArray43[local127][local123];
				if ((float) local136 < this.aFloat123) {
					this.aFloat123 = local136;
				}
				if ((float) local136 > this.aFloat122) {
					this.aFloat122 = local136;
				}
				if (local127 > 0 && local123 > 0 && super.anInt9997 > local127 && super.anInt9995 > local123) {
					@Pc(185) int local185 = arg6[local127 + 1][local123] - arg6[local127 - 1][local123];
					@Pc(202) int local202 = arg6[local127][local123 + 1] - arg6[local127][local123 - 1];
					@Pc(221) float local221 = (float) (1.0D / Math.sqrt((double) (local202 * local202 + arg7 * 4 * arg7 + local185 * local185)));
					this.aFloatArrayArray3[local127][local123] = (float) local185 * local221;
					this.aFloatArrayArray2[local127][local123] = local221 * (float) (-arg7 * 2);
					this.aFloatArrayArray4[local127][local123] = (float) local202 * local221;
				}
			}
		}
		this.aFloat123--;
		this.aFloat122++;
		this.aClass234_30 = new Class234(128);
		if ((this.anInt4686 & 0x10) != 0) {
			this.aClass261_1 = new Class261(this.aClass90_Sub3_7, this);
		}
	}

	@OriginalMember(owner = "client!kb", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void aa(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass261_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass90_Sub3_7.anInt9583 * arg2 >> 8) >> this.aClass90_Sub3_7.anInt9574;
			@Pc(38) int local38 = arg3 - (arg2 * this.aClass90_Sub3_7.anInt9578 >> 8) >> this.aClass90_Sub3_7.anInt9574;
			this.aClass261_1.method5939(arg0, local24, local38);
		}
	}

	@OriginalMember(owner = "client!kb", name = "EA", descriptor = "(III)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray11[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray11[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7964(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.lb <= 0) {
			return;
		}
		@Pc(16) Interface9 local16 = this.aClass90_Sub3_7.method7581(this.anInt4689);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method6462();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass90_Sub3_7.method7595(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(73) short[] local73;
				@Pc(77) int local77;
				@Pc(85) int local85;
				if (Stream.a()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9997 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local73 = this.aShortArrayArray19[local54];
								if (local73 != null) {
									for (local77 = 0; local77 < local73.length; local77++) {
										local85 = local73[local77] & 0xFFFF;
										local18++;
										local41.e(local85);
										if (local20 > local85) {
											local20 = local85;
										}
										if (local22 < local85) {
											local22 = local85;
										}
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9997 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local73 = this.aShortArrayArray19[local54];
								if (local73 != null) {
									for (local77 = 0; local77 < local73.length; local77++) {
										local85 = local73[local77] & 0xFFFF;
										if (local20 > local85) {
											local20 = local85;
										}
										local41.a(local85);
										local18++;
										if (local85 > local22) {
											local22 = local85;
										}
									}
								}
							}
							local54++;
						}
					}
				}
				local41.b();
				if (local16.method6460()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass90_Sub3_7.method7645();
		this.aClass90_Sub3_7.method7589(false);
		this.aClass90_Sub3_7.method7528(false);
		this.aClass90_Sub3_7.method7573(false);
		this.aClass90_Sub3_7.method7652(false);
		this.aClass90_Sub3_7.method7640(0);
		this.aClass90_Sub3_7.method7548(false, -2, false);
		this.aClass90_Sub3_7.method7624(null);
		@Pc(264) Class93_Sub3 local264 = this.aClass90_Sub3_7.method7602();
		@Pc(269) float[] local269 = this.aClass90_Sub3_7.method7546();
		local269[1] = 0.0F;
		local269[5] = (float) 1024 / ((float) super.anInt9998 * 128.0F * (float) this.aClass90_Sub3_7.anInt9469);
		local269[0] = (float) 1024 / ((float) super.anInt9998 * 128.0F * (float) this.aClass90_Sub3_7.anInt9524);
		local269[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass90_Sub3_7.anInt9469;
		local269[11] = 0.0F;
		local269[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass90_Sub3_7.anInt9524) - 1.0F;
		local269[4] = 0.0F;
		local269[7] = 0.0F;
		local269[10] = 1.0F / (this.aFloat122 - this.aFloat123);
		local269[8] = 0.0F;
		local269[3] = 0.0F;
		local269[6] = 0.0F;
		local269[15] = 1.0F;
		local269[14] = -this.aFloat123 / (this.aFloat122 - this.aFloat123);
		local269[9] = 0.0F;
		local269[2] = 0.0F;
		local264.method3757(0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
		this.aClass90_Sub3_7.method7550();
		this.aClass90_Sub3_7.method7619();
		if ((this.anInt4686 & 0x7) == 0) {
			this.aClass90_Sub3_7.method7528(false);
		} else {
			this.aClass90_Sub3_7.method7528(true);
			this.aClass90_Sub3_7.method7563();
		}
		this.aClass90_Sub3_7.method7599(false);
		this.aClass90_Sub3_7.method7658(this.anInterface8_6, 0);
		this.aClass90_Sub3_7.method7658(this.anInterface8_7, 1);
		this.aClass90_Sub3_7.method7553(this.aClass107_8);
		this.aClass90_Sub3_7.method7560(local22 + 1 - local20, local18 / 3, local20, local16, Static104.aClass321_1, 0);
		this.aClass90_Sub3_7.method7599(true);
	}

	@OriginalMember(owner = "client!kb", name = "ba", descriptor = "()V")
	@Override
	public void ba() {
		if (this.lb > 0) {
			@Pc(17) byte[][] local17 = new byte[super.anInt9997 + 1][super.anInt9995 + 1];
			for (@Pc(19) int local19 = 1; super.anInt9997 > local19; local19++) {
				for (@Pc(23) int local23 = 1; local23 < super.anInt9995; local23++) {
					local17[local19][local23] = (byte) ((this.aByteArrayArray11[local19][local23] >> 1) + (this.aByteArrayArray11[local19][local23 + 1] >> 3) + (this.aByteArrayArray11[local19 + 1][local23] >> 3) + (this.aByteArrayArray11[local19 + -1][local23] >> 2) + (this.aByteArrayArray11[local19][local23 + -1] >> 2));
				}
			}
			@Pc(103) Class6_Sub10[] local103 = new Class6_Sub10[this.aClass234_30.method5460()];
			this.aClass234_30.method5462(local103);
			for (@Pc(111) int local111 = 0; local111 < local103.length; local111++) {
				local103[local111].method1091(this.lb);
			}
			@Pc(127) int local127 = 20;
			if (this.anIntArrayArrayArray6 != null) {
				local127 += 4;
			}
			if ((this.anInt4686 & 0x7) != 0) {
				local127 += 12;
			}
			@Pc(150) NativeHeapBuffer local150 = this.aClass90_Sub3_7.aNativeHeap6.a(this.lb * 4, false);
			@Pc(160) NativeHeapBuffer local160 = this.aClass90_Sub3_7.aNativeHeap6.a(this.lb * local127, false);
			@Pc(165) Stream local165 = new Stream(local160);
			@Pc(170) Stream local170 = new Stream(local150);
			@Pc(174) Class6_Sub10[] local174 = new Class6_Sub10[this.lb];
			@Pc(181) int local181 = Static118.method7958(this.lb / 4);
			if (local181 < 1) {
				local181 = 1;
			}
			@Pc(191) Class234 local191 = new Class234(local181);
			@Pc(195) Class6_Sub10[] local195 = new Class6_Sub10[this.anInt4707];
			@Pc(201) int local201;
			for (@Pc(197) int local197 = 0; local197 < super.anInt9997; local197++) {
				for (local201 = 0; local201 < super.anInt9995; local201++) {
					if (this.anIntArrayArrayArray4[local197][local201] != null) {
						@Pc(217) Class6_Sub10[] local217 = this.aClass6_Sub10ArrayArrayArray1[local197][local201];
						@Pc(224) int[] local224 = this.anIntArrayArrayArray3[local197][local201];
						@Pc(231) int[] local231 = this.anIntArrayArrayArray2[local197][local201];
						@Pc(238) int[] local238 = this.anIntArrayArrayArray5[local197][local201];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray4[local197][local201];
						@Pc(257) int[] local257 = this.anIntArrayArrayArray7 == null ? null : this.anIntArrayArrayArray7[local197][local201];
						@Pc(269) int[] local269 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local197][local201];
						if (local238 == null) {
							local238 = local245;
						}
						@Pc(280) float local280 = this.aFloatArrayArray3[local197][local201];
						@Pc(287) float local287 = this.aFloatArrayArray2[local197][local201];
						@Pc(294) float local294 = this.aFloatArrayArray4[local197][local201];
						@Pc(303) float local303 = this.aFloatArrayArray3[local197][local201 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray2[local197][local201 + 1];
						@Pc(321) float local321 = this.aFloatArrayArray4[local197][local201 + 1];
						@Pc(332) float local332 = this.aFloatArrayArray3[local197 + 1][local201 + 1];
						@Pc(343) float local343 = this.aFloatArrayArray2[local197 + 1][local201 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray4[local197 + 1][local201 + 1];
						@Pc(363) float local363 = this.aFloatArrayArray3[local197 + 1][local201];
						@Pc(372) float local372 = this.aFloatArrayArray2[local197 + 1][local201];
						@Pc(381) float local381 = this.aFloatArrayArray4[local197 + 1][local201];
						@Pc(389) int local389 = local17[local197][local201] & 0xFF;
						@Pc(399) int local399 = local17[local197][local201 + 1] & 0xFF;
						@Pc(411) int local411 = local17[local197 + 1][local201 + 1] & 0xFF;
						@Pc(421) int local421 = local17[local197 + 1][local201] & 0xFF;
						@Pc(423) int local423 = 0;
						@Pc(433) int local433;
						label357: for (@Pc(425) int local425 = 0; local425 < local245.length; local425++) {
							@Pc(431) Class6_Sub10 local431 = local217[local425];
							for (local433 = 0; local433 < local423; local433++) {
								if (local431 == local195[local433]) {
									continue label357;
								}
							}
							local195[local423++] = local431;
						}
						@Pc(478) short[] local478 = this.aShortArrayArray19[local197 + local201 * super.anInt9997] = new short[local245.length];
						for (local433 = 0; local433 < local245.length; local433++) {
							@Pc(492) int local492 = (local197 << super.anInt10000) + local224[local433];
							@Pc(502) int local502 = (local201 << super.anInt10000) + local231[local433];
							@Pc(507) int local507 = local492 >> this.anInt4688;
							@Pc(512) int local512 = local502 >> this.anInt4688;
							@Pc(516) int local516 = local245[local433];
							@Pc(520) int local520 = local238[local433];
							@Pc(528) int local528 = local257 == null ? 0 : local257[local433];
							@Pc(546) long local546 = (long) local512 | (long) local520 << 48 | (long) local516 << 32 | (long) (local507 << 16);
							@Pc(550) int local550 = local224[local433];
							@Pc(554) int local554 = local231[local433];
							@Pc(556) byte local556 = 74;
							@Pc(558) int local558 = 0;
							@Pc(560) float local560 = 1.0F;
							@Pc(597) float local597;
							@Pc(599) float local599;
							@Pc(605) float local605;
							@Pc(639) float local639;
							@Pc(603) int local603;
							if (local550 == 0 && local554 == 0) {
								local605 = local294;
								local603 = local556 - local389;
								local597 = local280;
								local599 = local287;
							} else if (local550 == 0 && local554 == super.anInt9998) {
								local603 = local556 - local399;
								local599 = local312;
								local605 = local321;
								local597 = local303;
							} else if (local550 == super.anInt9998 && super.anInt9998 == local554) {
								local603 = local556 - local411;
								local597 = local332;
								local599 = local343;
								local605 = local354;
							} else if (local550 == super.anInt9998 && local554 == 0) {
								local597 = local363;
								local599 = local372;
								local603 = local556 - local421;
								local605 = local381;
							} else {
								@Pc(614) float local614 = (float) local550 / (float) super.anInt9998;
								@Pc(621) float local621 = (float) local554 / (float) super.anInt9998;
								@Pc(630) float local630 = local280 + (local363 - local280) * local614;
								local639 = (local372 - local287) * local614 + local287;
								@Pc(648) float local648 = local294 + local614 * (local381 - local294);
								@Pc(657) float local657 = local303 + (local332 - local303) * local614;
								@Pc(666) float local666 = local312 + (local343 - local312) * local614;
								@Pc(674) float local674 = (local354 - local321) * local614 + local321;
								local597 = local630 + local621 * (local657 - local630);
								local599 = local639 + (local666 - local639) * local621;
								local605 = local621 * (local674 - local648) + local648;
								@Pc(711) int local711 = ((local421 - local389) * local550 >> super.anInt10000) + local389;
								@Pc(723) int local723 = local399 + ((local411 - local399) * local550 >> super.anInt10000);
								local603 = local556 - (local554 * (local723 - local711) >> super.anInt10000) - local711;
							}
							if (local516 != -1) {
								@Pc(785) int local785 = (local516 & 0x7F) * local603 >> 7;
								if (local785 < 2) {
									local785 = 2;
								} else if (local785 > 126) {
									local785 = 126;
								}
								if ((this.anInt4686 & 0x7) == 0) {
									local560 = this.aClass90_Sub3_7.aFloatArray89[2] * local605 + this.aClass90_Sub3_7.aFloatArray89[1] * local599 + this.aClass90_Sub3_7.aFloatArray89[0] * local597;
									local560 = local560 * (local560 > 0.0F ? this.aClass90_Sub3_7.aFloat198 : this.aClass90_Sub3_7.aFloat202) + this.aClass90_Sub3_7.aFloat201;
								}
								local558 = Static36.anIntArray31[local785 | local516 & 0xFF80];
							}
							@Pc(854) Class6 local854 = null;
							if ((this.anInt4693 - 1 & local492) == 0 && (this.anInt4693 - 1 & local502) == 0) {
								local854 = local191.method5464(local546);
							}
							@Pc(1186) int local1186;
							@Pc(911) int local911;
							if (local854 == null) {
								if (local520 == local516) {
									local911 = local558;
								} else {
									@Pc(889) int local889 = (local520 & 0x7F) * local603 >> 7;
									if (local889 < 2) {
										local889 = 2;
									} else if (local889 > 126) {
										local889 = 126;
									}
									local911 = Static36.anIntArray31[local889 | local520 & 0xFF80];
									if ((this.anInt4686 & 0x7) == 0) {
										@Pc(939) float local939 = this.aClass90_Sub3_7.aFloatArray89[0] * local597 + local599 * this.aClass90_Sub3_7.aFloatArray89[1] + this.aClass90_Sub3_7.aFloatArray89[2] * local605;
										local639 = this.aClass90_Sub3_7.aFloat201 + local560 * (local560 > 0.0F ? this.aClass90_Sub3_7.aFloat198 : this.aClass90_Sub3_7.aFloat202);
										@Pc(964) int local964 = local911 >> 16 & 0xFF;
										@Pc(970) int local970 = local911 >> 8 & 0xFF;
										@Pc(974) int local974 = local911 & 0xFF;
										local964 = (int) ((float) local964 * local639);
										if (local964 < 0) {
											local964 = 0;
										} else if (local964 > 255) {
											local964 = 255;
										}
										local970 = (int) ((float) local970 * local639);
										if (local970 < 0) {
											local970 = 0;
										} else if (local970 > 255) {
											local970 = 255;
										}
										local974 = (int) ((float) local974 * local639);
										if (local974 < 0) {
											local974 = 0;
										} else if (local974 > 255) {
											local974 = 255;
										}
										local911 = local974 | local970 << 8 | local964 << 16;
									}
								}
								if (Stream.a()) {
									local165.a((float) local492);
									local165.a((float) (this.sa(local492, local502) + local528));
									local165.a((float) local502);
									local165.a((float) local492);
									local165.a((float) local502);
									if (this.anIntArrayArrayArray6 != null) {
										local165.a((float) (local269 == null ? 0 : local269[local433] - 1));
									}
									if ((this.anInt4686 & 0x7) != 0) {
										local165.a(local597);
										local165.a(local599);
										local165.a(local605);
									}
								} else {
									local165.b((float) local492);
									local165.b((float) (this.sa(local492, local502) + local528));
									local165.b((float) local502);
									local165.b((float) local492);
									local165.b((float) local502);
									if (this.anIntArrayArrayArray6 != null) {
										local165.b((float) (local269 == null ? 0 : local269[local433] - 1));
									}
									if ((this.anInt4686 & 0x7) != 0) {
										local165.b(local597);
										local165.b(local599);
										local165.b(local605);
									}
								}
								if (this.aClass90_Sub3_7.anInt9561 == 0) {
									local170.f(local911 | 0xFF000000);
								} else {
									local170.d(local911 | 0xFF000000);
								}
								local1186 = this.anInt4699++;
								local478[local433] = (short) local1186;
								if (local516 != -1) {
									local174[local1186] = local217[local433];
								}
								local191.method5466(local546, new Class6_Sub31(local478[local433]));
							} else {
								local478[local433] = ((Class6_Sub31) local854).aShort85;
								local1186 = local478[local433] & 0xFFFF;
								if (local516 != -1 && local217[local433].aLong245 < local174[local1186].aLong245) {
									local174[local1186] = local217[local433];
								}
							}
							for (local911 = 0; local911 < local423; local911++) {
								local195[local911].method1086(local560, local558, local603, local1186);
							}
							this.anInt4689++;
						}
					}
				}
			}
			for (local201 = 0; local201 < this.anInt4699; local201++) {
				@Pc(1298) Class6_Sub10 local1298 = local174[local201];
				if (local1298 != null) {
					local1298.method1081(local201);
				}
			}
			@Pc(1315) int local1315;
			@Pc(1334) int local1334;
			for (@Pc(1311) int local1311 = 0; local1311 < super.anInt9997; local1311++) {
				for (local1315 = 0; local1315 < super.anInt9995; local1315++) {
					@Pc(1328) short[] local1328 = this.aShortArrayArray19[super.anInt9997 * local1315 + local1311];
					if (local1328 != null) {
						@Pc(1332) int local1332 = 0;
						local1334 = 0;
						while (local1334 < local1328.length) {
							@Pc(1343) int local1343 = local1328[local1334++] & 0xFFFF;
							@Pc(1350) int local1350 = local1328[local1334++] & 0xFFFF;
							@Pc(1357) int local1357 = local1328[local1334++] & 0xFFFF;
							@Pc(1361) Class6_Sub10 local1361 = local174[local1343];
							@Pc(1365) Class6_Sub10 local1365 = local174[local1350];
							@Pc(1369) Class6_Sub10 local1369 = local174[local1357];
							@Pc(1371) Class6_Sub10 local1371 = null;
							if (local1361 != null) {
								local1361.method1090(local1311, local1332, local1315);
								local1371 = local1361;
							}
							if (local1365 != null) {
								local1365.method1090(local1311, local1332, local1315);
								if (local1371 == null || local1371.aLong245 > local1365.aLong245) {
									local1371 = local1365;
								}
							}
							if (local1369 != null) {
								local1369.method1090(local1311, local1332, local1315);
								if (local1371 == null || local1369.aLong245 < local1371.aLong245) {
									local1371 = local1369;
								}
							}
							if (local1371 != null) {
								if (local1361 != null) {
									local1371.method1081(local1343);
								}
								if (local1365 != null) {
									local1371.method1081(local1350);
								}
								if (local1369 != null) {
									local1371.method1081(local1357);
								}
								local1371.method1090(local1311, local1332, local1315);
							}
							local1332++;
						}
					}
				}
			}
			local165.b();
			local170.b();
			this.anInterface8_7 = this.aClass90_Sub3_7.method7562(false);
			this.anInterface8_7.method6459(this.anInt4699 * 4, 4, local150);
			this.anInterface8_6 = this.aClass90_Sub3_7.method7562(false);
			this.anInterface8_6.method6459(local127 * this.anInt4699, local127, local160);
			if ((this.anInt4686 & 0x7) == 0) {
				if (this.anIntArrayArrayArray6 == null) {
					this.aClass107_8 = this.aClass90_Sub3_7.method7605(new Class185[] { new Class185(new Class217[] { Static347.aClass217_1, Static347.aClass217_5 }), new Class185(Static347.aClass217_3) });
				} else {
					this.aClass107_8 = this.aClass90_Sub3_7.method7605(new Class185[] { new Class185(new Class217[] { Static347.aClass217_1, Static347.aClass217_5, Static347.aClass217_4 }), new Class185(Static347.aClass217_3) });
				}
			} else if (this.anIntArrayArrayArray6 == null) {
				this.aClass107_8 = this.aClass90_Sub3_7.method7605(new Class185[] { new Class185(new Class217[] { Static347.aClass217_1, Static347.aClass217_5, Static347.aClass217_2 }), new Class185(Static347.aClass217_3) });
			} else {
				this.aClass107_8 = this.aClass90_Sub3_7.method7605(new Class185[] { new Class185(new Class217[] { Static347.aClass217_1, Static347.aClass217_5, Static347.aClass217_4, Static347.aClass217_2 }), new Class185(Static347.aClass217_3) });
			}
			local1315 = 0;
			for (@Pc(1667) int local1667 = 0; local1667 < local103.length; local1667++) {
				if (local103[local1667].anInt1299 > 0) {
					local103[local1315++] = local103[local1667];
				}
			}
			this.aClass6_Sub10Array1 = new Class6_Sub10[local1315];
			@Pc(1697) long[] local1697 = new long[local1315];
			for (local1334 = 0; local1334 < local1315; local1334++) {
				@Pc(1705) Class6_Sub10 local1705 = local103[local1334];
				local1697[local1334] = local1705.aLong245;
				this.aClass6_Sub10Array1[local1334] = local1705;
				local1705.method1093(this.anInt4699);
			}
			Static141.method2335(this.aClass6_Sub10Array1, local1697);
			if (this.aClass261_1 != null) {
				this.aClass261_1.method5943();
			}
		} else {
			this.aClass261_1 = null;
		}
		this.aFloatArrayArray3 = this.aFloatArrayArray2 = this.aFloatArrayArray4 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray5 = null;
		this.aClass234_30 = null;
		this.aByteArrayArray11 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass6_Sub10ArrayArrayArray1 = null;
		this.anIntArrayArrayArray3 = this.anIntArrayArrayArray2 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!lb;I)V")
	private void method3986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub5_Sub10_Sub1 arg2) {
		@Pc(25) int[] local25 = this.anIntArrayArrayArray3[arg0][arg1];
		@Pc(32) int[] local32 = this.anIntArrayArrayArray2[arg0][arg1];
		@Pc(35) int local35 = local25.length;
		if (Static221.anIntArray346.length < local35) {
			Static221.anIntArray346 = new int[local35];
			Static61.anIntArray102 = new int[local35];
		}
		for (@Pc(51) int local51 = 0; local51 < local35; local51++) {
			Static221.anIntArray346[local51] = local25[local51] >> this.aClass90_Sub3_7.anInt9574;
			Static61.anIntArray102[local51] = local32[local51] >> this.aClass90_Sub3_7.anInt9574;
		}
		@Pc(79) int local79 = 0;
		while (local79 < local35) {
			@Pc(85) int local85 = Static221.anIntArray346[local79];
			@Pc(90) int local90 = Static61.anIntArray102[local79++];
			@Pc(94) int local94 = Static221.anIntArray346[local79];
			@Pc(99) int local99 = Static61.anIntArray102[local79++];
			@Pc(103) int local103 = Static221.anIntArray346[local79];
			@Pc(108) int local108 = Static61.anIntArray102[local79++];
			if ((local99 - local108) * (local85 - local94) - (local103 - local94) * (local99 - local90) > 0) {
				arg2.method4338(local90, local99, local85, local108, local94, local103);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ld;[I)V")
	@Override
	public void method7965(@OriginalArg(0) Class6_Sub25 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass298_99.method6812(new Class6_Sub29(this.aClass90_Sub3_7, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(47) int[] local47 = arg3 == null ? null : new int[local8 * 3];
		@Pc(56) int[] local56 = arg5 == null ? null : new int[local8 * 3];
		@Pc(58) int local58 = 0;
		for (@Pc(60) int local60 = 0; local60 < local8; local60++) {
			@Pc(66) int local66 = arg6[local60];
			@Pc(70) int local70 = arg7[local60];
			@Pc(74) int local74 = arg8[local60];
			local13[local58] = arg2[local66];
			local18[local58] = arg4[local66];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local66];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local66];
			}
			local58++;
			local13[local58] = arg2[local70];
			local18[local58] = arg4[local70];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local70];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local70];
			}
			local58++;
			local13[local58] = arg2[local74];
			local18[local58] = arg4[local74];
			local23[local58] = arg9[local60];
			local33[local58] = arg11[local60];
			local38[local58] = arg12[local60];
			if (arg10 != null) {
				local28[local58] = arg10[local60];
			}
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.BA(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!kb", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[super.anInt9997][super.anInt9995][];
		}
		if (arg3 != null && this.anIntArrayArrayArray7 == null) {
			this.anIntArrayArrayArray7 = new int[super.anInt9997][super.anInt9995][];
		}
		this.anIntArrayArrayArray3[arg0][arg1] = arg2;
		this.anIntArrayArrayArray2[arg0][arg1] = arg4;
		this.anIntArrayArrayArray4[arg0][arg1] = arg6;
		this.anIntArrayArrayArray5[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray7 != null) {
			this.anIntArrayArrayArray7[arg0][arg1] = arg3;
		}
		@Pc(88) Class6_Sub10[] local88 = this.aClass6_Sub10ArrayArrayArray1[arg0][arg1] = new Class6_Sub10[arg6.length];
		for (@Pc(90) int local90 = 0; local90 < arg6.length; local90++) {
			@Pc(119) long local119 = (long) (arg9[local90] << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) arg8[local90];
			@Pc(125) Class6 local125;
			for (local125 = this.aClass234_30.method5464(local119); local125 != null; local125 = this.aClass234_30.method5467()) {
				@Pc(130) Class6_Sub10 local130 = (Class6_Sub10) local125;
				if (arg8[local90] == local130.anInt1292 && local130.aFloat23 == (float) arg9[local90] && arg10 == local130.anInt1305 && local130.anInt1300 == arg11 && arg12 == local130.anInt1298) {
					break;
				}
			}
			if (local125 == null) {
				local88[local90] = new Class6_Sub10(this, arg8[local90], arg9[local90], arg10, arg11, arg12);
				this.aClass234_30.method5466(local119, local88[local90]);
			} else {
				local88[local90] = (Class6_Sub10) local125;
			}
		}
		if (arg13) {
			this.aByteArrayArray10[arg0][arg1] = (byte) (this.aByteArrayArray10[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt4707) {
			this.anInt4707 = arg6.length;
		}
		this.lb += arg6.length;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	@Override
	public Class6_Sub5_Sub10 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub5_Sub10 arg2) {
		if ((this.aByteArrayArray10[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9998 >> this.aClass90_Sub3_7.anInt9574;
		@Pc(27) Class6_Sub5_Sub10_Sub1 local27 = (Class6_Sub5_Sub10_Sub1) arg2;
		@Pc(37) Class6_Sub5_Sub10_Sub1 local37;
		if (local27 != null && local27.method4341(local24, local24)) {
			local37 = local27;
			local27.method4339();
		} else {
			local37 = new Class6_Sub5_Sub10_Sub1(this.aClass90_Sub3_7, local24, local24);
		}
		local37.method4340(0, local24, 0, local24);
		this.method3986(arg0, arg1, local37);
		return local37;
	}

	@OriginalMember(owner = "client!kb", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	@Override
	public void FA(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass261_1 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass90_Sub3_7.anInt9583 * arg2 >> 8) >> this.aClass90_Sub3_7.anInt9574;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass90_Sub3_7.anInt9578 >> 8) >> this.aClass90_Sub3_7.anInt9574;
			this.aClass261_1.method5942(local24, local39, arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	@Override
	public void method7970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	@Override
	public boolean method7968(@OriginalArg(0) Class6_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass261_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass90_Sub3_7.anInt9583 >> 8) >> this.aClass90_Sub3_7.anInt9574;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass90_Sub3_7.anInt9578 >> 8) >> this.aClass90_Sub3_7.anInt9574;
			return this.aClass261_1.method5944(local24, arg0, local39);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method7967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		this.method3989(arg3, arg1, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z[[ZIIZII)V")
	private void method3989(@OriginalArg(1) boolean[][] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.aClass6_Sub10Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg3 + arg3 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (Static564.anIntArray713.length < local18) {
			Static564.anIntArray713 = new int[local18];
		}
		@Pc(30) int local30 = arg4 - arg3;
		@Pc(32) int local32 = local30;
		if (local30 < 0) {
			local30 = 0;
		}
		@Pc(44) int local44 = arg1 - arg3;
		@Pc(46) int local46 = local44;
		if (local44 < 0) {
			local44 = 0;
		}
		@Pc(57) int local57 = arg3 + arg4;
		if (local57 > super.anInt9997 - 1) {
			local57 = super.anInt9997 - 1;
		}
		@Pc(76) int local76 = arg1 + arg3;
		Static368.anInt6720 = 0;
		if (super.anInt9995 - 1 < local76) {
			local76 = super.anInt9995 - 1;
		}
		for (@Pc(91) int local91 = local30; local91 <= local57; local91++) {
			@Pc(100) boolean[] local100 = arg0[local91 - local32];
			for (@Pc(102) int local102 = local44; local102 <= local76; local102++) {
				if (local100[local102 - local46]) {
					Static564.anIntArray713[Static368.anInt6720++] = local102 * super.anInt9997 + local91;
				}
			}
		}
		this.aClass90_Sub3_7.method7598();
		this.aClass90_Sub3_7.method7654();
		this.aClass90_Sub3_7.method7528((this.anInt4686 & 0x7) != 0);
		this.aClass90_Sub3_7.method7548(false, -1, false);
		this.aClass90_Sub3_7.method7658(this.anInterface8_6, 0);
		for (@Pc(195) int local195 = 0; local195 < this.aClass6_Sub10Array1.length; local195++) {
			this.aClass6_Sub10Array1[local195].method1085(Static368.anInt6720, Static564.anIntArray713);
		}
		@Pc(220) Class93_Sub3 local220 = this.aClass90_Sub3_7.method7602();
		local220.GA(0, -1, 0);
		this.aClass90_Sub3_7.method7619();
		if (!this.aClass298_99.method6813()) {
			@Pc(238) int local238 = this.aClass90_Sub3_7.anInt9562;
			@Pc(242) int local242 = this.aClass90_Sub3_7.anInt9564;
			this.aClass90_Sub3_7.X(0, local242, this.aClass90_Sub3_7.anInt9553);
			this.aClass90_Sub3_7.method7528(false);
			this.aClass90_Sub3_7.method7652(false);
			this.aClass90_Sub3_7.method7640(128);
			this.aClass90_Sub3_7.method7548(false, -2, false);
			this.aClass90_Sub3_7.method7624(this.aClass90_Sub3_7.anInterface3_3);
			this.aClass90_Sub3_7.method7570(Static547.aClass214_5, Static140.aClass214_2);
			this.aClass90_Sub3_7.method7540(0, Static20.aClass150_1);
			this.aClass90_Sub3_7.method7630(Static412.aClass150_8, 0);
			for (@Pc(306) Class6 local306 = this.aClass298_99.method6809(); local306 != null; local306 = this.aClass298_99.method6821()) {
				@Pc(311) Class6_Sub29 local311 = (Class6_Sub29) local306;
				local311.method5034(arg1, arg0, arg4, arg3);
			}
			this.aClass90_Sub3_7.method7540(0, Static393.aClass150_6);
			this.aClass90_Sub3_7.method7630(Static393.aClass150_6, 0);
			this.aClass90_Sub3_7.method7624(null);
			this.aClass90_Sub3_7.X(local238, local242, this.aClass90_Sub3_7.anInt9553);
		}
		if (this.aClass261_1 != null) {
			this.aClass90_Sub3_7.method7658(this.anInterface8_6, 0);
			this.aClass90_Sub3_7.method7658(this.anInterface8_7, 1);
			this.aClass90_Sub3_7.method7553(this.aClass107_8);
			this.aClass261_1.method5945(arg2, arg1, arg4, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!kb", name = "sa", descriptor = "(II)I")
	@Override
	public int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> super.anInt10000;
		@Pc(13) int local13 = arg1 >> super.anInt10000;
		if (local8 < 0 || local13 < 0 || local8 > super.anInt9997 - 1 || local13 > super.anInt9995 - 1) {
			return 0;
		}
		@Pc(48) int local48 = super.anInt9998 - 1 & arg0;
		@Pc(55) int local55 = super.anInt9998 - 1 & arg1;
		@Pc(81) int local81 = this.anIntArrayArray43[local8][local13] * (super.anInt9998 - local48) + this.anIntArrayArray43[local8 + 1][local13] * local48 >> super.anInt10000;
		@Pc(112) int local112 = local48 * this.anIntArrayArray43[local8 + 1][local13 + 1] + (super.anInt9998 - local48) * this.anIntArrayArray43[local8][local13 + 1] >> super.anInt10000;
		return local55 * local112 + (super.anInt9998 - local55) * local81 >> super.anInt10000;
	}

	@OriginalMember(owner = "client!kb", name = "JA", descriptor = "(II)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray43[arg0][arg1];
	}
}
