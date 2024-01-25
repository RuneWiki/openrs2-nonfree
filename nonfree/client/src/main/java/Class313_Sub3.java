import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class313_Sub3 extends Class313 {

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
	private int anInt10878;

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!vr", name = "Z", descriptor = "I")
	private int anInt10895;

	@OriginalMember(owner = "client!vr", name = "ib", descriptor = "I")
	private int anInt10898;

	@OriginalMember(owner = "client!vr", name = "G", descriptor = "Lclient!li;")
	public Class229 aClass229_13;

	@OriginalMember(owner = "client!vr", name = "gb", descriptor = "Lclient!li;")
	public Class229 aClass229_14;

	@OriginalMember(owner = "client!vr", name = "O", descriptor = "Lclient!rt;")
	private Interface24 anInterface24_7;

	@OriginalMember(owner = "client!vr", name = "eb", descriptor = "Lclient!li;")
	public Class229 aClass229_15;

	@OriginalMember(owner = "client!vr", name = "L", descriptor = "Lclient!li;")
	private Class229 aClass229_16;

	@OriginalMember(owner = "client!vr", name = "V", descriptor = "I")
	private int anInt10900;

	@OriginalMember(owner = "client!vr", name = "A", descriptor = "[Lclient!ij;")
	private Class3_Sub27[] aClass3_Sub27Array1;

	@OriginalMember(owner = "client!vr", name = "bb", descriptor = "Lclient!tj;")
	private final Class357 aClass357_65 = new Class357();

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "Lclient!gia;")
	public final Class67_Sub2 aClass67_Sub2_42;

	@OriginalMember(owner = "client!vr", name = "w", descriptor = "I")
	private final int anInt10885;

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray19;

	@OriginalMember(owner = "client!vr", name = "K", descriptor = "[[F")
	private float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "[[[Lclient!ij;")
	private Class3_Sub27[][][] aClass3_Sub27ArrayArrayArray1;

	@OriginalMember(owner = "client!vr", name = "N", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
	public final int anInt10888;

	@OriginalMember(owner = "client!vr", name = "cb", descriptor = "[[S")
	public final short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!vr", name = "H", descriptor = "[[B")
	private byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!vr", name = "W", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!vr", name = "X", descriptor = "I")
	private final int anInt10879;

	@OriginalMember(owner = "client!vr", name = "R", descriptor = "[[F")
	private float[][] aFloatArrayArray20;

	@OriginalMember(owner = "client!vr", name = "F", descriptor = "[[B")
	private final byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!vr", name = "C", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!vr", name = "U", descriptor = "Lclient!gn;")
	private Class136 aClass136_49;

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "Lclient!mq;")
	private Class244 aClass244_2;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!gia;IIII[[I[[II)V")
	public Class313_Sub3(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass67_Sub2_42 = arg0;
		this.anInt10885 = super.anInt10873 - 2;
		this.aFloatArrayArray19 = new float[super.anInt10875 + 1][super.anInt10872 + 1];
		this.aFloatArrayArray18 = new float[super.anInt10875 + 1][super.anInt10872 + 1];
		this.aClass3_Sub27ArrayArrayArray1 = new Class3_Sub27[arg3][arg4][];
		this.anIntArrayArrayArray18 = new int[arg3][arg4][];
		this.anInt10888 = arg2;
		this.aShortArrayArray6 = new short[arg4 * arg3][];
		this.aByteArrayArray26 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray20 = new int[arg3][arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.anInt10879 = 0x1 << this.anInt10885;
		this.aFloatArrayArray20 = new float[super.anInt10875 + 1][super.anInt10872 + 1];
		this.aByteArrayArray25 = new byte[arg3][arg4];
		this.anIntArrayArrayArray17 = new int[arg3][arg4][];
		this.anIntArrayArrayArray19 = new int[arg3][arg4][];
		for (@Pc(115) int local115 = 1; local115 < super.anInt10872; local115++) {
			for (@Pc(121) int local121 = 1; local121 < super.anInt10875; local121++) {
				@Pc(139) int local139 = arg6[local121 + 1][local115] - arg6[local121 - 1][local115];
				@Pc(156) int local156 = arg6[local121][local115 + 1] - arg6[local121][local115 - 1];
				@Pc(176) float local176 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local139 * local139 + arg7 * 4 * arg7)));
				this.aFloatArrayArray18[local121][local115] = (float) local139 * local176;
				this.aFloatArrayArray20[local121][local115] = local176 * (float) (-arg7 * 2);
				this.aFloatArrayArray19[local121][local115] = (float) local156 * local176;
			}
		}
		this.aClass136_49 = new Class136(128);
		if ((this.anInt10888 & 0x10) != 0) {
			this.aClass244_2 = new Class244(this.aClass67_Sub2_42, this);
		}
	}

	@OriginalMember(owner = "client!vr", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray26[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray26[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method9094(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass244_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (this.aClass67_Sub2_42.anInt3901 * arg2 >> 8) >> this.aClass67_Sub2_42.anInt3875;
			@Pc(42) int local42 = arg3 - (this.aClass67_Sub2_42.anInt3894 * arg2 >> 8) >> this.aClass67_Sub2_42.anInt3875;
			return this.aClass244_2.method6014(local28, arg0, local42);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method9089(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt10898 <= 0) {
			return;
		}
		this.aClass67_Sub2_42.method3240();
		this.aClass67_Sub2_42.method3243(false);
		this.aClass67_Sub2_42.method3299(false);
		this.aClass67_Sub2_42.method3270(false);
		this.aClass67_Sub2_42.method3227(false);
		this.aClass67_Sub2_42.method3257(0);
		this.aClass67_Sub2_42.method3245(-2);
		this.aClass67_Sub2_42.method3234((Class245) null);
		Static619.aFloatArray108[3] = 0.0F;
		Static619.aFloatArray108[8] = 0.0F;
		Static619.aFloatArray108[2] = 0.0F;
		Static619.aFloatArray108[5] = (float) 1024 / ((float) this.aClass67_Sub2_42.anInt3828 * 128.0F * (float) super.anInt10871);
		Static619.aFloatArray108[4] = 0.0F;
		Static619.aFloatArray108[14] = 0.0F;
		Static619.aFloatArray108[6] = 0.0F;
		Static619.aFloatArray108[12] = -(((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass67_Sub2_42.anInt3783) - 1.0F;
		Static619.aFloatArray108[7] = 0.0F;
		Static619.aFloatArray108[1] = 0.0F;
		Static619.aFloatArray108[10] = 0.0F;
		Static619.aFloatArray108[0] = (float) 1024 / ((float) super.anInt10871 * 128.0F * (float) this.aClass67_Sub2_42.anInt3783);
		Static619.aFloatArray108[15] = 1.0F;
		Static619.aFloatArray108[13] = 1.0F - ((float) (arg3 * 1024) / 128.0F + (float) 0) / (float) this.aClass67_Sub2_42.anInt3828;
		Static619.aFloatArray108[9] = 0.0F;
		Static619.aFloatArray108[11] = 0.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(Static619.aFloatArray108, 0);
		Static619.aFloatArray108[5] = 0.0F;
		Static619.aFloatArray108[6] = 1.0F;
		Static619.aFloatArray108[7] = 0.0F;
		Static619.aFloatArray108[4] = 0.0F;
		Static619.aFloatArray108[1] = 0.0F;
		Static619.aFloatArray108[11] = 0.0F;
		Static619.aFloatArray108[15] = 1.0F;
		Static619.aFloatArray108[10] = 0.0F;
		Static619.aFloatArray108[8] = 0.0F;
		Static619.aFloatArray108[2] = 0.0F;
		Static619.aFloatArray108[14] = 0.0F;
		Static619.aFloatArray108[0] = 1.0F;
		Static619.aFloatArray108[13] = 0.0F;
		Static619.aFloatArray108[9] = 1.0F;
		Static619.aFloatArray108[3] = 0.0F;
		Static619.aFloatArray108[12] = 0.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(Static619.aFloatArray108, 0);
		if ((this.anInt10888 & 0x7) == 0) {
			this.aClass67_Sub2_42.method3299(false);
		} else {
			this.aClass67_Sub2_42.method3299(true);
			this.aClass67_Sub2_42.method3241();
		}
		this.aClass67_Sub2_42.method3283(this.aClass229_15, this.aClass229_16, this.aClass229_14, this.aClass229_13);
		if (this.aClass67_Sub2_42.aClass3_Sub28_Sub1_3.aByteArray50.length >= this.anInt10895 * 2) {
			this.aClass67_Sub2_42.aClass3_Sub28_Sub1_3.anInt6241 = 0;
		} else {
			this.aClass67_Sub2_42.aClass3_Sub28_Sub1_3 = new Class3_Sub28_Sub1(this.anInt10895 * 2);
		}
		@Pc(318) int local318 = 0;
		@Pc(322) Class3_Sub28_Sub1 local322 = this.aClass67_Sub2_42.aClass3_Sub28_Sub1_3;
		@Pc(328) int local328;
		@Pc(337) int local337;
		@Pc(339) int local339;
		@Pc(359) short[] local359;
		@Pc(363) int local363;
		if (this.aClass67_Sub2_42.aBoolean322) {
			for (local328 = arg1; local328 < arg3; local328++) {
				local337 = arg0 + local328 * super.anInt10875;
				for (local339 = arg0; local339 < arg2; local339++) {
					if (arg4[local339 - arg0][local328 - arg1]) {
						local359 = this.aShortArrayArray6[local337];
						if (local359 != null) {
							for (local363 = 0; local363 < local359.length; local363++) {
								local322.method5282(local359[local363] & 0xFFFF);
								local318++;
							}
						}
					}
					local337++;
				}
			}
		} else {
			for (local328 = arg1; local328 < arg3; local328++) {
				local337 = local328 * super.anInt10875 + arg0;
				for (local339 = arg0; local339 < arg2; local339++) {
					if (arg4[local339 - arg0][local328 - arg1]) {
						local359 = this.aShortArrayArray6[local337];
						if (local359 != null) {
							for (local363 = 0; local363 < local359.length; local363++) {
								local318++;
								local322.method5280(local359[local363] & 0xFFFF);
							}
						}
					}
					local337++;
				}
			}
		}
		if (local318 > 0) {
			@Pc(498) Class49_Sub1 local498 = new Class49_Sub1(this.aClass67_Sub2_42, 5123, local322.aByteArray50, local322.anInt6241);
			this.aClass67_Sub2_42.method3232(local498, 0, local318);
		}
	}

	@OriginalMember(owner = "client!vr", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt10898 > 0) {
			@Pc(21) byte[][] local21 = new byte[super.anInt10875 + 1][super.anInt10872 + 1];
			@Pc(27) int local27;
			for (@Pc(23) int local23 = 1; super.anInt10875 > local23; local23++) {
				for (local27 = 1; super.anInt10872 > local27; local27++) {
					local21[local23][local27] = (byte) ((this.aByteArrayArray26[local23][local27] >> 1) + (this.aByteArrayArray26[local23][local27 + 1] >> 3) + (this.aByteArrayArray26[local23 - 1][local27] >> 2) + (this.aByteArrayArray26[local23 + 1][local27] >> 3) + (this.aByteArrayArray26[local23][local27 + -1] >> 2));
				}
			}
			this.aClass3_Sub27Array1 = new Class3_Sub27[this.aClass136_49.method3504()];
			this.aClass136_49.method3502(this.aClass3_Sub27Array1);
			for (local27 = 0; local27 < this.aClass3_Sub27Array1.length; local27++) {
				this.aClass3_Sub27Array1[local27].method4201(this.anInt10898);
			}
			@Pc(153) int local153 = 24;
			if (this.anIntArrayArrayArray15 != null) {
				local153 += 4;
			}
			if ((this.anInt10888 & 0x7) != 0) {
				local153 += 12;
			}
			@Pc(182) NativeHeapBuffer local182 = this.aClass67_Sub2_42.aNativeHeap4.a(local153 * this.anInt10898, false);
			@Pc(187) Stream local187 = new Stream(local182);
			@Pc(191) Class3_Sub27[] local191 = new Class3_Sub27[this.anInt10898];
			@Pc(198) int local198 = Static487.method7093(this.anInt10898 / 4);
			if (local198 < 1) {
				local198 = 1;
			}
			@Pc(210) Class136 local210 = new Class136(local198);
			@Pc(214) Class3_Sub27[] local214 = new Class3_Sub27[this.anInt10900];
			@Pc(220) int local220;
			for (@Pc(216) int local216 = 0; local216 < super.anInt10875; local216++) {
				for (local220 = 0; super.anInt10872 > local220; local220++) {
					if (this.anIntArrayArrayArray17[local216][local220] != null) {
						@Pc(238) Class3_Sub27[] local238 = this.aClass3_Sub27ArrayArrayArray1[local216][local220];
						@Pc(245) int[] local245 = this.anIntArrayArrayArray16[local216][local220];
						@Pc(252) int[] local252 = this.anIntArrayArrayArray18[local216][local220];
						@Pc(259) int[] local259 = this.anIntArrayArrayArray20[local216][local220];
						@Pc(266) int[] local266 = this.anIntArrayArrayArray17[local216][local220];
						@Pc(279) int[] local279 = this.anIntArrayArrayArray19 == null ? null : this.anIntArrayArrayArray19[local216][local220];
						if (local259 == null) {
							local259 = local266;
						}
						@Pc(296) int[] local296 = this.anIntArrayArrayArray15 == null ? null : this.anIntArrayArrayArray15[local216][local220];
						@Pc(303) float local303 = this.aFloatArrayArray18[local216][local220];
						@Pc(310) float local310 = this.aFloatArrayArray20[local216][local220];
						@Pc(317) float local317 = this.aFloatArrayArray19[local216][local220];
						@Pc(326) float local326 = this.aFloatArrayArray18[local216][local220 + 1];
						@Pc(335) float local335 = this.aFloatArrayArray20[local216][local220 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray19[local216][local220 + 1];
						@Pc(355) float local355 = this.aFloatArrayArray18[local216 + 1][local220 + 1];
						@Pc(366) float local366 = this.aFloatArrayArray20[local216 + 1][local220 + 1];
						@Pc(377) float local377 = this.aFloatArrayArray19[local216 + 1][local220 + 1];
						@Pc(386) float local386 = this.aFloatArrayArray18[local216 + 1][local220];
						@Pc(395) float local395 = this.aFloatArrayArray20[local216 + 1][local220];
						@Pc(404) float local404 = this.aFloatArrayArray19[local216 + 1][local220];
						@Pc(412) int local412 = local21[local216][local220] & 0xFF;
						@Pc(422) int local422 = local21[local216][local220 + 1] & 0xFF;
						@Pc(434) int local434 = local21[local216 + 1][local220 + 1] & 0xFF;
						@Pc(444) int local444 = local21[local216 + 1][local220] & 0xFF;
						@Pc(446) int local446 = 0;
						@Pc(458) int local458;
						label337: for (@Pc(448) int local448 = 0; local448 < local266.length; local448++) {
							@Pc(456) Class3_Sub27 local456 = local238[local448];
							for (local458 = 0; local458 < local446; local458++) {
								if (local456 == local214[local458]) {
									continue label337;
								}
							}
							local214[local446++] = local456;
						}
						@Pc(507) short[] local507 = this.aShortArrayArray6[super.anInt10875 * local220 + local216] = new short[local266.length];
						for (local458 = 0; local458 < local266.length; local458++) {
							@Pc(521) int local521 = (local216 << super.anInt10873) + local245[local458];
							@Pc(531) int local531 = (local220 << super.anInt10873) + local252[local458];
							@Pc(536) int local536 = local521 >> this.anInt10885;
							@Pc(541) int local541 = local531 >> this.anInt10885;
							@Pc(545) int local545 = local266[local458];
							@Pc(549) int local549 = local259[local458];
							@Pc(558) int local558 = local279 == null ? 0 : local279[local458];
							@Pc(576) long local576 = (long) local541 | (long) local549 << 48 | (long) local545 << 32 | (long) (local536 << 16);
							@Pc(580) int local580 = local245[local458];
							@Pc(584) int local584 = local252[local458];
							@Pc(586) byte local586 = 74;
							@Pc(588) int local588 = 0;
							@Pc(618) float local618;
							@Pc(620) float local620;
							@Pc(616) float local616;
							@Pc(711) float local711;
							@Pc(624) int local624;
							if (local580 == 0 && local584 == 0) {
								local618 = local303;
								local620 = local310;
								local616 = local317;
								local624 = local586 - local412;
							} else if (local580 == 0 && local584 == super.anInt10871) {
								local616 = local344;
								local618 = local326;
								local620 = local335;
								local624 = local586 - local422;
							} else if (local580 == super.anInt10871 && local584 == super.anInt10871) {
								local624 = local586 - local434;
								local620 = local366;
								local618 = local355;
								local616 = local377;
							} else if (local580 == super.anInt10871 && local584 == 0) {
								local624 = local586 - local444;
								local620 = local395;
								local618 = local386;
								local616 = local404;
							} else {
								@Pc(686) float local686 = (float) local580 / (float) super.anInt10871;
								@Pc(693) float local693 = (float) local584 / (float) super.anInt10871;
								@Pc(702) float local702 = (local386 - local303) * local686 + local303;
								local711 = local310 + (local395 - local310) * local686;
								@Pc(719) float local719 = local317 + local686 * (local404 - local317);
								@Pc(728) float local728 = local686 * (local355 - local326) + local326;
								@Pc(736) float local736 = local686 * (local366 - local335) + local335;
								local618 = local702 + local693 * (local728 - local702);
								local620 = local711 + (local736 - local711) * local693;
								@Pc(762) float local762 = local686 * (local377 - local344) + local344;
								local616 = local719 + (local762 - local719) * local693;
								@Pc(782) int local782 = ((local444 - local412) * local580 >> super.anInt10873) + local412;
								@Pc(794) int local794 = (local580 * (local434 - local422) >> super.anInt10873) + local422;
								local624 = local586 - local782 - ((local794 - local782) * local584 >> super.anInt10873);
							}
							@Pc(821) float local821 = 1.0F;
							if (local545 != -1) {
								@Pc(832) int local832 = (local545 & 0x7F) * local624 >> 7;
								if (local832 < 2) {
									local832 = 2;
								} else if (local832 > 126) {
									local832 = 126;
								}
								if ((this.anInt10888 & 0x7) == 0) {
									local821 = local618 * this.aClass67_Sub2_42.aFloatArray38[0] + local620 * this.aClass67_Sub2_42.aFloatArray38[1] + local616 * this.aClass67_Sub2_42.aFloatArray38[2];
									local821 = local821 * (local821 > 0.0F ? this.aClass67_Sub2_42.aFloat66 : this.aClass67_Sub2_42.aFloat81) + this.aClass67_Sub2_42.aFloat70;
								}
								local588 = Static305.anIntArray309[local545 & 0xFF80 | local832];
							}
							@Pc(904) Class3 local904 = null;
							if ((this.anInt10879 - 1 & local521) == 0 && (local531 & this.anInt10879 - 1) == 0) {
								local904 = local210.method3503(local576);
							}
							@Pc(942) int local942;
							@Pc(978) int local978;
							if (local904 == null) {
								if (local549 == local545) {
									local978 = local588;
								} else {
									@Pc(988) int local988 = (local549 & 0x7F) * local624 >> 7;
									if (local988 < 2) {
										local988 = 2;
									} else if (local988 > 126) {
										local988 = 126;
									}
									local978 = Static305.anIntArray309[local988 | local549 & 0xFF80];
									if ((this.anInt10888 & 0x7) == 0) {
										local711 = this.aClass67_Sub2_42.aFloatArray38[2] * local616 + this.aClass67_Sub2_42.aFloatArray38[1] * local620 + this.aClass67_Sub2_42.aFloatArray38[0] * local618;
										local711 = this.aClass67_Sub2_42.aFloat70 + local821 * (local821 > 0.0F ? this.aClass67_Sub2_42.aFloat66 : this.aClass67_Sub2_42.aFloat81);
										@Pc(1069) int local1069 = local978 >> 16 & 0xFF;
										@Pc(1075) int local1075 = local978 >> 8 & 0xFF;
										@Pc(1079) int local1079 = local978 & 0xFF;
										local1069 = (int) ((float) local1069 * local711);
										local1075 = (int) ((float) local1075 * local711);
										if (local1069 < 0) {
											local1069 = 0;
										} else if (local1069 > 255) {
											local1069 = 255;
										}
										if (local1075 < 0) {
											local1075 = 0;
										} else if (local1075 > 255) {
											local1075 = 255;
										}
										local1079 = (int) ((float) local1079 * local711);
										if (local1079 < 0) {
											local1079 = 0;
										} else if (local1079 > 255) {
											local1079 = 255;
										}
										local978 = local1079 | local1069 << 16 | local1075 << 8;
									}
								}
								if (this.aClass67_Sub2_42.aBoolean322) {
									local187.a((float) local521);
									local187.a((float) (local558 + this.method9096(local521, local531)));
									local187.a((float) local531);
									local187.f((byte) (local978 >> 16));
									local187.f((byte) (local978 >> 8));
									local187.f((byte) local978);
									local187.f(-1);
									local187.a((float) local521);
									local187.a((float) local531);
									if (this.anIntArrayArrayArray15 != null) {
										local187.a((float) (local296 == null ? 0 : local296[local458] - 1));
									}
									if ((this.anInt10888 & 0x7) != 0) {
										local187.a(local618);
										local187.a(local620);
										local187.a(local616);
									}
								} else {
									local187.b((float) local521);
									local187.b((float) (this.method9096(local521, local531) + local558));
									local187.b((float) local531);
									local187.f((byte) (local978 >> 16));
									local187.f((byte) (local978 >> 8));
									local187.f((byte) local978);
									local187.f(-1);
									local187.b((float) local521);
									local187.b((float) local531);
									if (this.anIntArrayArrayArray15 != null) {
										local187.b((float) (local296 == null ? 0 : local296[local458] - 1));
									}
									if ((this.anInt10888 & 0x7) != 0) {
										local187.b(local618);
										local187.b(local620);
										local187.b(local616);
									}
								}
								local942 = this.anInt10878++;
								local507[local458] = (short) local942;
								if (local545 != -1) {
									local191[local942] = local238[local458];
								}
								local210.method3508(local576, new Class3_Sub40(local507[local458]));
							} else {
								local507[local458] = ((Class3_Sub40) local904).aShort116;
								local942 = local507[local458] & 0xFFFF;
								if (local545 != -1 && local238[local458].aLong382 < local191[local942].aLong382) {
									local191[local942] = local238[local458];
								}
							}
							for (local978 = 0; local978 < local446; local978++) {
								local214[local978].method4200(local624, local588, local942, local821);
							}
							this.anInt10895++;
						}
					}
				}
			}
			for (local220 = 0; local220 < this.anInt10878; local220++) {
				@Pc(1425) Class3_Sub27 local1425 = local191[local220];
				if (local1425 != null) {
					local1425.method4206(local220);
				}
			}
			@Pc(1464) int local1464;
			for (@Pc(1444) int local1444 = 0; super.anInt10875 > local1444; local1444++) {
				for (@Pc(1448) int local1448 = 0; super.anInt10872 > local1448; local1448++) {
					@Pc(1460) short[] local1460 = this.aShortArrayArray6[local1444 + local1448 * super.anInt10875];
					if (local1460 != null) {
						local1464 = 0;
						@Pc(1466) int local1466 = 0;
						while (local1466 < local1460.length) {
							@Pc(1475) int local1475 = local1460[local1466++] & 0xFFFF;
							@Pc(1482) int local1482 = local1460[local1466++] & 0xFFFF;
							@Pc(1489) int local1489 = local1460[local1466++] & 0xFFFF;
							@Pc(1493) Class3_Sub27 local1493 = local191[local1475];
							@Pc(1497) Class3_Sub27 local1497 = local191[local1482];
							@Pc(1501) Class3_Sub27 local1501 = local191[local1489];
							@Pc(1503) Class3_Sub27 local1503 = null;
							if (local1493 != null) {
								local1503 = local1493;
								local1493.method4202(local1448, local1444, local1464);
							}
							if (local1497 != null) {
								local1497.method4202(local1448, local1444, local1464);
								if (local1503 == null || local1497.aLong382 < local1503.aLong382) {
									local1503 = local1497;
								}
							}
							if (local1501 != null) {
								local1501.method4202(local1448, local1444, local1464);
								if (local1503 == null || local1503.aLong382 > local1501.aLong382) {
									local1503 = local1501;
								}
							}
							if (local1503 != null) {
								if (local1493 != null) {
									local1503.method4206(local1475);
								}
								if (local1497 != null) {
									local1503.method4206(local1482);
								}
								if (local1501 != null) {
									local1503.method4206(local1489);
								}
								local1503.method4202(local1448, local1444, local1464);
							}
							local1464++;
						}
					}
				}
			}
			local187.a();
			this.anInterface24_7 = this.aClass67_Sub2_42.method3290(local187.c(), local153, local182);
			this.aClass229_14 = new Class229(this.anInterface24_7, 5126, 3, 0);
			this.aClass229_16 = new Class229(this.anInterface24_7, 5121, 4, 12);
			@Pc(1668) byte local1668;
			if (this.anIntArrayArrayArray15 == null) {
				this.aClass229_15 = new Class229(this.anInterface24_7, 5126, 2, 16);
				local1668 = 24;
			} else {
				this.aClass229_15 = new Class229(this.anInterface24_7, 5126, 3, 16);
				local1668 = 28;
			}
			if ((this.anInt10888 & 0x7) != 0) {
				this.aClass229_13 = new Class229(this.anInterface24_7, 5126, 3, local1668);
			}
			@Pc(1707) long[] local1707 = new long[this.aClass3_Sub27Array1.length];
			for (local1464 = 0; local1464 < this.aClass3_Sub27Array1.length; local1464++) {
				@Pc(1718) Class3_Sub27 local1718 = this.aClass3_Sub27Array1[local1464];
				local1707[local1464] = local1718.aLong382;
				local1718.method4204(this.anInt10878);
			}
			Static630.method4805(local1707, this.aClass3_Sub27Array1);
			if (this.aClass244_2 != null) {
				this.aClass244_2.method6020();
			}
		} else {
			this.aClass244_2 = null;
		}
		this.anIntArrayArrayArray15 = null;
		this.aByteArrayArray26 = null;
		this.anIntArrayArrayArray17 = null;
		this.aFloatArrayArray18 = this.aFloatArrayArray20 = this.aFloatArrayArray19 = null;
		this.anIntArrayArrayArray20 = null;
		this.aClass3_Sub27ArrayArrayArray1 = null;
		this.anIntArrayArrayArray16 = this.anIntArrayArrayArray18 = null;
		this.aClass136_49 = null;
		this.anIntArrayArrayArray19 = null;
	}

	@OriginalMember(owner = "client!vr", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub4_Sub13 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub13 arg2) {
		if ((this.aByteArrayArray25[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(22) int local22 = super.anInt10871 >> this.aClass67_Sub2_42.anInt3875;
		@Pc(25) Class3_Sub4_Sub13_Sub2 local25 = (Class3_Sub4_Sub13_Sub2) arg2;
		@Pc(37) Class3_Sub4_Sub13_Sub2 local37;
		if (local25 != null && local25.method6245(local22, local22)) {
			local37 = local25;
			local25.method6240();
		} else {
			local37 = new Class3_Sub4_Sub13_Sub2(this.aClass67_Sub2_42, local22, local22);
		}
		local37.method6242(0, local22, 0, local22);
		this.method9102(local37, arg1, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!vr", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass244_2 != null && arg0 != null) {
			@Pc(26) int local26 = arg1 - (this.aClass67_Sub2_42.anInt3901 * arg2 >> 8) >> this.aClass67_Sub2_42.anInt3875;
			@Pc(41) int local41 = arg3 - (this.aClass67_Sub2_42.anInt3894 * arg2 >> 8) >> this.aClass67_Sub2_42.anInt3875;
			this.aClass244_2.method6017(local26, local41, arg0);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method9088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		@Pc(8) int local8 = arg9.length;
		@Pc(13) int[] local13 = new int[local8 * 3];
		@Pc(18) int[] local18 = new int[local8 * 3];
		@Pc(23) int[] local23 = new int[local8 * 3];
		@Pc(28) int[] local28 = new int[local8 * 3];
		@Pc(33) int[] local33 = new int[local8 * 3];
		@Pc(38) int[] local38 = new int[local8 * 3];
		@Pc(48) int[] local48 = arg3 == null ? null : new int[local8 * 3];
		@Pc(58) int[] local58 = arg5 == null ? null : new int[local8 * 3];
		@Pc(60) int local60 = 0;
		for (@Pc(62) int local62 = 0; local62 < local8; local62++) {
			@Pc(68) int local68 = arg6[local62];
			@Pc(72) int local72 = arg7[local62];
			@Pc(76) int local76 = arg8[local62];
			local13[local60] = arg2[local68];
			local18[local60] = arg4[local68];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local68];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local68];
			}
			local60++;
			local13[local60] = arg2[local72];
			local18[local60] = arg4[local72];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local72];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local72];
			}
			local60++;
			local13[local60] = arg2[local76];
			local18[local60] = arg4[local76];
			local23[local60] = arg9[local62];
			local33[local60] = arg11[local62];
			local38[local60] = arg12[local62];
			local28[local60] = arg10 == null ? arg9[local62] : arg10[local62];
			if (arg3 != null) {
				local48[local60] = arg3[local76];
			}
			if (arg5 != null) {
				local58[local60] = arg5[local76];
			}
			local60++;
		}
		this.U(arg0, arg1, local13, local48, local18, local58, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
	@Override
	public void method9090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ[[ZIZIII)V")
	private void method9098(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub27Array1 == null) {
			return;
		}
		@Pc(14) int local14 = arg6 + arg6 + 1;
		@Pc(18) int local18 = local14 * local14;
		if (local18 > this.aClass67_Sub2_42.anIntArray195.length) {
			this.aClass67_Sub2_42.anIntArray195 = new int[local18];
		}
		if (this.aClass67_Sub2_42.aClass3_Sub28_Sub1_3.aByteArray50.length < this.anInt10895 * 2) {
			this.aClass67_Sub2_42.aClass3_Sub28_Sub1_3 = new Class3_Sub28_Sub1(this.anInt10895 * 2);
		}
		@Pc(61) int local61 = arg2 - arg6;
		@Pc(63) int local63 = local61;
		if (local61 < 0) {
			local61 = 0;
		}
		@Pc(72) int local72 = arg0 - arg6;
		@Pc(74) int local74 = local72;
		if (local72 < 0) {
			local72 = 0;
		}
		@Pc(85) int local85 = arg2 + arg6;
		if (local85 > super.anInt10875 - 1) {
			local85 = super.anInt10875 - 1;
		}
		@Pc(101) int local101 = arg0 + arg6;
		if (local101 > super.anInt10872 - 1) {
			local101 = super.anInt10872 - 1;
		}
		@Pc(114) int local114 = 0;
		@Pc(118) int[] local118 = this.aClass67_Sub2_42.anIntArray195;
		@Pc(131) int local131;
		for (@Pc(120) int local120 = local61; local120 <= local85; local120++) {
			@Pc(129) boolean[] local129 = arg1[local120 - local63];
			for (local131 = local72; local131 <= local101; local131++) {
				if (local129[local131 - local74]) {
					local118[local114++] = local120 + super.anInt10875 * local131;
				}
			}
		}
		if (arg5 == -1) {
			this.aClass67_Sub2_42.method3220();
		} else {
			this.aClass67_Sub2_42.method3254((float) arg5);
			this.aClass67_Sub2_42.method3263();
		}
		this.aClass67_Sub2_42.method3299((this.anInt10888 & 0x7) != 0);
		for (@Pc(213) int local213 = 0; local213 < this.aClass3_Sub27Array1.length; local213++) {
			this.aClass3_Sub27Array1[local213].method4199(local118, local114);
		}
		if (!this.aClass357_65.method8404()) {
			local131 = this.aClass67_Sub2_42.anInt3900;
			@Pc(252) int local252 = this.aClass67_Sub2_42.anInt3907;
			this.aClass67_Sub2_42.L(0, local252, this.aClass67_Sub2_42.anInt3906);
			this.aClass67_Sub2_42.method3299(false);
			this.aClass67_Sub2_42.method3227(false);
			this.aClass67_Sub2_42.method3257(128);
			this.aClass67_Sub2_42.method3245(-2);
			this.aClass67_Sub2_42.method3234(this.aClass67_Sub2_42.aClass245_Sub2_4);
			this.aClass67_Sub2_42.method3271(7681, 8448);
			this.aClass67_Sub2_42.method3279(34166, 770, 0);
			this.aClass67_Sub2_42.method3269(34167, 0);
			for (@Pc(312) Class3 local312 = this.aClass357_65.method8391(); local312 != null; local312 = this.aClass357_65.method8392()) {
				@Pc(317) Class3_Sub18 local317 = (Class3_Sub18) local312;
				local317.method2031(arg2, arg0, arg6, arg1);
			}
			this.aClass67_Sub2_42.method3279(5890, 768, 0);
			this.aClass67_Sub2_42.method3269(5890, 0);
			this.aClass67_Sub2_42.method3234((Class245) null);
			this.aClass67_Sub2_42.L(local131, local252, this.aClass67_Sub2_42.anInt3906);
		}
		if (this.aClass244_2 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass67_Sub2_42.method3283(this.aClass229_15, (Class229) null, this.aClass229_14, (Class229) null);
		this.aClass244_2.method6019(arg6, arg0, arg3, arg2, arg1);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!vr", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg3 != null && this.anIntArrayArrayArray19 == null) {
			this.anIntArrayArrayArray19 = new int[super.anInt10875][super.anInt10872][];
		}
		@Pc(25) Interface2 local25 = this.aClass67_Sub2_42.anInterface2_11;
		if (arg5 != null && this.anIntArrayArrayArray15 == null) {
			this.anIntArrayArrayArray15 = new int[super.anInt10875][super.anInt10872][];
		}
		this.anIntArrayArrayArray16[arg0][arg1] = arg2;
		this.anIntArrayArrayArray18[arg0][arg1] = arg4;
		this.anIntArrayArrayArray17[arg0][arg1] = arg6;
		this.anIntArrayArrayArray20[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray15 != null) {
			this.anIntArrayArrayArray15[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray19 != null) {
			this.anIntArrayArrayArray19[arg0][arg1] = arg3;
		}
		@Pc(104) Class3_Sub27[] local104 = this.aClass3_Sub27ArrayArrayArray1[arg0][arg1] = new Class3_Sub27[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt10888 & 0x20) != 0 && local114 != -1 && local25.method1027(local114).aBoolean67) {
				local114 = -1;
				local118 = 128;
			}
			@Pc(167) long local167 = (long) local114 | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (local118 << 14);
			@Pc(173) Class3 local173;
			for (local173 = this.aClass136_49.method3503(local167); local173 != null; local173 = this.aClass136_49.method3510()) {
				@Pc(180) Class3_Sub27 local180 = (Class3_Sub27) local173;
				if (local180.anInt5025 == local114 && local180.aFloat90 == (float) local118 && arg10 == local180.anInt5016 && arg11 == local180.anInt5024 && local180.anInt5020 == arg12) {
					break;
				}
			}
			if (local173 == null) {
				local104[local106] = new Class3_Sub27(this, local114, local118, arg10, arg11, arg12);
				this.aClass136_49.method3508(local167, local104[local106]);
			} else {
				local104[local106] = (Class3_Sub27) local173;
			}
		}
		if (arg13) {
			this.aByteArrayArray25[arg0][arg1] = (byte) (this.aByteArrayArray25[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt10900) {
			this.anInt10900 = arg6.length;
		}
		this.anInt10898 += arg6.length;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method9087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method9098(arg1, arg3, arg0, arg4, arg5, -1, arg2);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method9092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method9098(arg1, arg3, arg0, arg4, arg6, arg5, arg2);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!vj;[I)V")
	@Override
	public void method9097(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass357_65.method8401(new Class3_Sub18(this.aClass67_Sub2_42, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!vr", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass244_2 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (this.aClass67_Sub2_42.anInt3901 * arg2 >> 8) >> this.aClass67_Sub2_42.anInt3875;
			@Pc(42) int local42 = arg3 - (this.aClass67_Sub2_42.anInt3894 * arg2 >> 8) >> this.aClass67_Sub2_42.anInt3875;
			this.aClass244_2.method6016(arg0, local42, local27);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!nh;IZI)V")
	private void method9102(@OriginalArg(0) Class3_Sub4_Sub13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray16[arg2][arg1];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray18[arg2][arg1];
		@Pc(22) int local22 = local12.length;
		if (this.aClass67_Sub2_42.anIntArray197.length < local22) {
			this.aClass67_Sub2_42.anIntArray196 = new int[local22];
			this.aClass67_Sub2_42.anIntArray197 = new int[local22];
		}
		@Pc(44) int[] local44 = this.aClass67_Sub2_42.anIntArray197;
		@Pc(48) int[] local48 = this.aClass67_Sub2_42.anIntArray196;
		for (@Pc(50) int local50 = 0; local50 < local22; local50++) {
			local44[local50] = local12[local50] >> this.aClass67_Sub2_42.anInt3875;
			local48[local50] = local19[local50] >> this.aClass67_Sub2_42.anInt3875;
		}
		if (false) {
			return;
		}
		@Pc(93) int local93 = 0;
		while (local93 < local22) {
			@Pc(99) int local99 = local44[local93];
			@Pc(104) int local104 = local48[local93++];
			@Pc(108) int local108 = local44[local93];
			@Pc(113) int local113 = local48[local93++];
			@Pc(117) int local117 = local44[local93];
			@Pc(122) int local122 = local48[local93++];
			if ((local113 - local122) * (local99 - local108) - (local117 - local108) * (-local104 + local113) > 0) {
				arg0.method6239(local117, local122, local108, local104, local113, local99);
			}
		}
	}
}
