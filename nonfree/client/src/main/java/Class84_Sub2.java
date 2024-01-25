import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class84_Sub2 extends Class84 {

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
	private int anInt5089;

	@OriginalMember(owner = "client!kb", name = "nb", descriptor = "I")
	private int anInt5092;

	@OriginalMember(owner = "client!kb", name = "jb", descriptor = "[Lclient!bs;")
	private Class5_Sub8[] aClass5_Sub8Array1;

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lclient!fk;")
	private Interface15 anInterface15_13;

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "Lclient!gaa;")
	public Class124 aClass124_16;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	private int anInt5098;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "Lclient!fk;")
	private Interface15 anInterface15_14;

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
	private int anInt5099;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "F")
	private float aFloat124 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "F")
	private float aFloat125 = -3.4028235E38F;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lclient!at;")
	private final Class20 aClass20_19 = new Class20();

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
	private final int anInt5076 = this.anInt8885 - 2;

	@OriginalMember(owner = "client!kb", name = "mb", descriptor = "Lclient!gca;")
	public final Class100_Sub1 aClass100_Sub1_12;

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!kb", name = "qb", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	private final int anInt5083;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[[[Lclient!bs;")
	private Class5_Sub8[][][] aClass5_Sub8ArrayArrayArray1;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "[[B")
	private final byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "[[S")
	public final short[][] aShortArrayArray16;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!kb", name = "lb", descriptor = "[[B")
	private byte[][] lb;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
	public final int anInt5080;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "Lclient!qr;")
	private Class306 aClass306_21;

	@OriginalMember(owner = "client!kb", name = "kb", descriptor = "Lclient!vo;")
	private Class382 aClass382_2;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!gca;IIII[[I[[II)V")
	public Class84_Sub2(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass100_Sub1_12 = arg0;
		this.anIntArrayArrayArray14 = new int[arg3][arg4][];
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aFloatArrayArray11 = new float[super.anInt8883 + 1][super.anInt8878 + 1];
		this.anInt5083 = 0x1 << this.anInt5076;
		this.aClass5_Sub8ArrayArrayArray1 = new Class5_Sub8[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.aByteArrayArray13 = new byte[arg3][arg4];
		this.aFloatArrayArray9 = new float[super.anInt8883 + 1][super.anInt8878 + 1];
		this.aShortArrayArray16 = new short[arg3 * arg4][];
		this.aFloatArrayArray10 = new float[super.anInt8883 + 1][super.anInt8878 + 1];
		this.lb = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anInt5080 = arg2;
		for (@Pc(121) int local121 = 0; local121 <= super.anInt8878; local121++) {
			for (@Pc(127) int local127 = 0; local127 <= super.anInt8883; local127++) {
				@Pc(136) int local136 = super.anIntArrayArray53[local127][local121];
				if ((float) local136 > this.aFloat125) {
					this.aFloat125 = (float) local136;
				}
				if (this.aFloat124 > (float) local136) {
					this.aFloat124 = (float) local136;
				}
				if (local127 > 0 && local121 > 0 && local127 < super.anInt8883 && super.anInt8878 > local121) {
					@Pc(198) int local198 = arg6[local127 + 1][local121] - arg6[local127 - 1][local121];
					@Pc(215) int local215 = arg6[local127][local121 + 1] - arg6[local127][local121 - 1];
					@Pc(235) float local235 = (float) (1.0D / Math.sqrt((double) (local198 * local198 + arg7 * 4 * arg7 + local215 * local215)));
					this.aFloatArrayArray10[local127][local121] = local235 * (float) local198;
					this.aFloatArrayArray11[local127][local121] = local235 * (float) (-arg7 * 2);
					this.aFloatArrayArray9[local127][local121] = local235 * (float) local215;
				}
			}
		}
		this.aFloat125++;
		this.aFloat124--;
		this.aClass306_21 = new Class306(128);
		if ((this.anInt5080 & 0x10) != 0) {
			this.aClass382_2 = new Class382(this.aClass100_Sub1_12, this);
		}
	}

	@OriginalMember(owner = "client!kb", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass382_2 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (this.aClass100_Sub1_12.anInt9254 * arg2 >> 8) >> this.aClass100_Sub1_12.anInt9257;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass100_Sub1_12.anInt9238 >> 8) >> this.aClass100_Sub1_12.anInt9257;
			this.aClass382_2.method8893(local27, arg0, local42);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4585(arg0, arg4, arg5, arg3, -1, arg2, arg1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	@Override
	public void method7621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kb", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class5_Sub1_Sub15 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub15 arg2) {
		if ((this.aByteArrayArray13[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(22) int local22 = super.anInt8881 >> this.aClass100_Sub1_12.anInt9257;
		@Pc(25) Class5_Sub1_Sub15_Sub2 local25 = (Class5_Sub1_Sub15_Sub2) arg2;
		@Pc(37) Class5_Sub1_Sub15_Sub2 local37;
		if (local25 != null && local25.method8296(local22, local22)) {
			local37 = local25;
			local25.method8297();
		} else {
			local37 = new Class5_Sub1_Sub15_Sub2(this.aClass100_Sub1_12, local22, local22);
		}
		local37.method8295(0, local22, 0, local22);
		this.method4581(local37, arg0, arg1);
		return local37;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7624(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt5098 <= 0) {
			return;
		}
		@Pc(20) Interface20 local20 = this.aClass100_Sub1_12.method7988(this.anInt5089);
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 32767;
		@Pc(26) int local26 = -32768;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			local22 = 0;
			@Pc(39) Buffer local39 = local20.method7347();
			if (local39 != null) {
				@Pc(47) Stream local47 = this.aClass100_Sub1_12.method7910(local39);
				@Pc(51) int local51;
				@Pc(61) int local61;
				@Pc(63) int local63;
				@Pc(84) short[] local84;
				@Pc(88) int local88;
				@Pc(96) int local96;
				if (Stream.c()) {
					for (local51 = arg1; local51 < arg3; local51++) {
						local61 = arg0 + super.anInt8883 * local51;
						for (local63 = arg0; local63 < arg2; local63++) {
							if (arg4[local63 - arg0][local51 - arg1]) {
								local84 = this.aShortArrayArray16[local61];
								if (local84 != null) {
									for (local88 = 0; local88 < local84.length; local88++) {
										local96 = local84[local88] & 0xFFFF;
										local22++;
										if (local96 < local24) {
											local24 = local96;
										}
										if (local96 > local26) {
											local26 = local96;
										}
										local47.c(local96);
									}
								}
							}
							local61++;
						}
					}
				} else {
					for (local51 = arg1; local51 < arg3; local51++) {
						local61 = super.anInt8883 * local51 + arg0;
						for (local63 = arg0; local63 < arg2; local63++) {
							if (arg4[local63 - arg0][local51 - arg1]) {
								local84 = this.aShortArrayArray16[local61];
								if (local84 != null) {
									for (local88 = 0; local88 < local84.length; local88++) {
										local96 = local84[local88] & 0xFFFF;
										if (local96 > local26) {
											local26 = local96;
										}
										if (local24 > local96) {
											local24 = local96;
										}
										local47.f(local96);
										local22++;
									}
								}
							}
							local61++;
						}
					}
				}
				local47.b();
				if (local20.method7349()) {
					break;
				}
			}
		}
		if (local22 <= 0) {
			return;
		}
		this.aClass100_Sub1_12.method7903();
		this.aClass100_Sub1_12.method7878(false);
		this.aClass100_Sub1_12.method7935(false);
		this.aClass100_Sub1_12.method7951(false);
		this.aClass100_Sub1_12.method7914(false);
		this.aClass100_Sub1_12.method7957(0);
		this.aClass100_Sub1_12.method7971(false, -2, false);
		this.aClass100_Sub1_12.method7923((Interface19) null);
		@Pc(317) Class10_Sub2 local317 = this.aClass100_Sub1_12.method7956();
		@Pc(322) float[] local322 = this.aClass100_Sub1_12.method7994();
		local322[15] = 1.0F;
		local322[2] = 0.0F;
		local322[9] = 0.0F;
		local322[10] = 1.0F / (this.aFloat125 - this.aFloat124);
		local322[11] = 0.0F;
		local322[3] = 0.0F;
		local322[1] = 0.0F;
		local322[5] = (float) 1024 / ((float) super.anInt8881 * 128.0F * (float) this.aClass100_Sub1_12.anInt9057);
		local322[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass100_Sub1_12.anInt9057;
		local322[12] = -(((float) (arg0 * 1024) / 128.0F - (float) 0) / (float) this.aClass100_Sub1_12.anInt9118) - 1.0F;
		local322[8] = 0.0F;
		local322[4] = 0.0F;
		local322[0] = (float) 1024 / ((float) super.anInt8881 * 128.0F * (float) this.aClass100_Sub1_12.anInt9118);
		local322[6] = 0.0F;
		local322[7] = 0.0F;
		local322[14] = -this.aFloat124 / (this.aFloat125 - this.aFloat124);
		local317.method1705(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.aClass100_Sub1_12.method7902();
		this.aClass100_Sub1_12.method7992();
		if ((this.anInt5080 & 0x7) == 0) {
			this.aClass100_Sub1_12.method7935(false);
		} else {
			this.aClass100_Sub1_12.method7935(true);
			this.aClass100_Sub1_12.method7896();
		}
		this.aClass100_Sub1_12.method7967(false);
		this.aClass100_Sub1_12.method7868(this.anInterface15_14, 0);
		this.aClass100_Sub1_12.method7868(this.anInterface15_13, 1);
		this.aClass100_Sub1_12.method7921(this.aClass124_16);
		this.aClass100_Sub1_12.method7948(local26 + 1 - local24, local24, 0, Static649.aClass187_6, local20, local22 / 3);
		this.aClass100_Sub1_12.method7967(true);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!uha;BII)V")
	private void method4581(@OriginalArg(0) Class5_Sub1_Sub15_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int[] local20 = this.anIntArrayArrayArray13[arg1][arg2];
		@Pc(27) int[] local27 = this.anIntArrayArrayArray10[arg1][arg2];
		@Pc(30) int local30 = local20.length;
		if (local30 > Static677.anIntArray485.length) {
			Static304.anIntArray313 = new int[local30];
			Static677.anIntArray485 = new int[local30];
		}
		for (@Pc(48) int local48 = 0; local48 < local30; local48++) {
			Static677.anIntArray485[local48] = local20[local48] >> this.aClass100_Sub1_12.anInt9257;
			Static304.anIntArray313[local48] = local27[local48] >> this.aClass100_Sub1_12.anInt9257;
		}
		@Pc(78) int local78 = 0;
		while (local30 > local78) {
			@Pc(86) int local86 = Static677.anIntArray485[local78];
			@Pc(91) int local91 = Static304.anIntArray313[local78++];
			@Pc(95) int local95 = Static677.anIntArray485[local78];
			@Pc(100) int local100 = Static304.anIntArray313[local78++];
			@Pc(104) int local104 = Static677.anIntArray485[local78];
			@Pc(109) int local109 = Static304.anIntArray313[local78++];
			if (-((local104 - local95) * (-local91 + local100)) + (local86 - local95) * (-local109 + local100) > 0) {
				arg0.method8298(local109, local95, local100, local91, local86, local104);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4585(arg0, arg4, arg6, arg3, arg5, arg2, arg1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7619(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass382_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(28) int local28 = arg1 - (arg2 * this.aClass100_Sub1_12.anInt9254 >> 8) >> this.aClass100_Sub1_12.anInt9257;
			@Pc(43) int local43 = arg3 - (arg2 * this.aClass100_Sub1_12.anInt9238 >> 8) >> this.aClass100_Sub1_12.anInt9257;
			return this.aClass382_2.method8889(local28, local43, arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt5098 <= 0) {
			this.aClass382_2 = null;
		} else {
			@Pc(21) byte[][] local21 = new byte[super.anInt8883 + 1][super.anInt8878 + 1];
			for (@Pc(23) int local23 = 1; local23 < super.anInt8883; local23++) {
				for (@Pc(29) int local29 = 1; super.anInt8878 > local29; local29++) {
					local21[local23][local29] = (byte) ((this.lb[local23][local29 - 1] >> 2) + (this.lb[local23 + 1][local29] >> 3) + (this.lb[local23 + -1][local29] >> 2) + (this.lb[local23][local29 + 1] >> 3) + (this.lb[local23][local29] >> 1));
				}
			}
			@Pc(119) Class5_Sub8[] local119 = new Class5_Sub8[this.aClass306_21.method6939()];
			this.aClass306_21.method6938(local119);
			for (@Pc(129) int local129 = 0; local129 < local119.length; local129++) {
				local119[local129].method896(this.anInt5098);
			}
			@Pc(147) int local147 = 20;
			if (this.anIntArrayArrayArray12 != null) {
				local147 += 4;
			}
			if ((this.anInt5080 & 0x7) != 0) {
				local147 += 12;
			}
			@Pc(176) NativeHeapBuffer local176 = this.aClass100_Sub1_12.aNativeHeap5.a(this.anInt5098 * 4, false);
			@Pc(186) NativeHeapBuffer local186 = this.aClass100_Sub1_12.aNativeHeap5.a(this.anInt5098 * local147, false);
			@Pc(191) Stream local191 = new Stream(local186);
			@Pc(196) Stream local196 = new Stream(local176);
			@Pc(200) Class5_Sub8[] local200 = new Class5_Sub8[this.anInt5098];
			@Pc(207) int local207 = Static186.method3180(this.anInt5098 / 4);
			if (local207 < 1) {
				local207 = 1;
			}
			@Pc(219) Class306 local219 = new Class306(local207);
			@Pc(223) Class5_Sub8[] local223 = new Class5_Sub8[this.anInt5099];
			@Pc(229) int local229;
			for (@Pc(225) int local225 = 0; local225 < super.anInt8883; local225++) {
				for (local229 = 0; super.anInt8878 > local229; local229++) {
					if (this.anIntArrayArrayArray15[local225][local229] != null) {
						@Pc(247) Class5_Sub8[] local247 = this.aClass5_Sub8ArrayArrayArray1[local225][local229];
						@Pc(254) int[] local254 = this.anIntArrayArrayArray13[local225][local229];
						@Pc(261) int[] local261 = this.anIntArrayArrayArray10[local225][local229];
						@Pc(268) int[] local268 = this.anIntArrayArrayArray11[local225][local229];
						@Pc(275) int[] local275 = this.anIntArrayArrayArray15[local225][local229];
						@Pc(288) int[] local288 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local225][local229];
						@Pc(301) int[] local301 = this.anIntArrayArrayArray12 == null ? null : this.anIntArrayArrayArray12[local225][local229];
						if (local268 == null) {
							local268 = local275;
						}
						@Pc(312) float local312 = this.aFloatArrayArray10[local225][local229];
						@Pc(319) float local319 = this.aFloatArrayArray11[local225][local229];
						@Pc(326) float local326 = this.aFloatArrayArray9[local225][local229];
						@Pc(335) float local335 = this.aFloatArrayArray10[local225][local229 + 1];
						@Pc(344) float local344 = this.aFloatArrayArray11[local225][local229 + 1];
						@Pc(353) float local353 = this.aFloatArrayArray9[local225][local229 + 1];
						@Pc(364) float local364 = this.aFloatArrayArray10[local225 + 1][local229 + 1];
						@Pc(375) float local375 = this.aFloatArrayArray11[local225 + 1][local229 + 1];
						@Pc(386) float local386 = this.aFloatArrayArray9[local225 + 1][local229 + 1];
						@Pc(395) float local395 = this.aFloatArrayArray10[local225 + 1][local229];
						@Pc(404) float local404 = this.aFloatArrayArray11[local225 + 1][local229];
						@Pc(413) float local413 = this.aFloatArrayArray9[local225 + 1][local229];
						@Pc(421) int local421 = local21[local225][local229] & 0xFF;
						@Pc(431) int local431 = local21[local225][local229 + 1] & 0xFF;
						@Pc(443) int local443 = local21[local225 + 1][local229 + 1] & 0xFF;
						@Pc(453) int local453 = local21[local225 + 1][local229] & 0xFF;
						@Pc(455) int local455 = 0;
						@Pc(467) int local467;
						label355: for (@Pc(457) int local457 = 0; local457 < local275.length; local457++) {
							@Pc(465) Class5_Sub8 local465 = local247[local457];
							for (local467 = 0; local467 < local455; local467++) {
								if (local465 == local223[local467]) {
									continue label355;
								}
							}
							local223[local455++] = local465;
						}
						@Pc(516) short[] local516 = this.aShortArrayArray16[local225 + super.anInt8883 * local229] = new short[local275.length];
						for (local467 = 0; local467 < local275.length; local467++) {
							@Pc(529) int local529 = (local225 << super.anInt8885) + local254[local467];
							@Pc(538) int local538 = (local229 << super.anInt8885) + local261[local467];
							@Pc(543) int local543 = local529 >> this.anInt5076;
							@Pc(548) int local548 = local538 >> this.anInt5076;
							@Pc(552) int local552 = local275[local467];
							@Pc(556) int local556 = local268[local467];
							@Pc(565) int local565 = local288 == null ? 0 : local288[local467];
							@Pc(583) long local583 = (long) local548 | (long) local552 << 32 | (long) local556 << 48 | (long) (local543 << 16);
							@Pc(587) int local587 = local254[local467];
							@Pc(591) int local591 = local261[local467];
							@Pc(593) byte local593 = 74;
							@Pc(595) int local595 = 0;
							@Pc(597) float local597 = 1.0F;
							@Pc(607) float local607;
							@Pc(609) float local609;
							@Pc(605) float local605;
							@Pc(686) float local686;
							@Pc(613) int local613;
							if (local587 == 0 && local591 == 0) {
								local605 = local326;
								local607 = local312;
								local609 = local319;
								local613 = local593 - local421;
							} else if (local587 == 0 && super.anInt8881 == local591) {
								local607 = local335;
								local613 = local593 - local431;
								local609 = local344;
								local605 = local353;
							} else if (super.anInt8881 == local587 && local591 == super.anInt8881) {
								local607 = local364;
								local613 = local593 - local443;
								local605 = local386;
								local609 = local375;
							} else if (super.anInt8881 == local587 && local591 == 0) {
								local605 = local413;
								local607 = local395;
								local613 = local593 - local453;
								local609 = local404;
							} else {
								@Pc(662) float local662 = (float) local587 / (float) super.anInt8881;
								@Pc(669) float local669 = (float) local591 / (float) super.anInt8881;
								@Pc(677) float local677 = local312 + local662 * (local395 - local312);
								local686 = local319 + (local404 - local319) * local662;
								@Pc(694) float local694 = local326 + (local413 - local326) * local662;
								@Pc(702) float local702 = local662 * (local364 - local335) + local335;
								@Pc(711) float local711 = local344 + (local375 - local344) * local662;
								local607 = local669 * (local702 - local677) + local677;
								@Pc(727) float local727 = local662 * (local386 - local353) + local353;
								local609 = local686 + (local711 - local686) * local669;
								local605 = (local727 - local694) * local669 + local694;
								@Pc(756) int local756 = local421 + (local587 * (local453 - local421) >> super.anInt8885);
								@Pc(768) int local768 = (local587 * (local443 - local431) >> super.anInt8885) + local431;
								local613 = local593 - local756 - (local591 * (local768 - local756) >> super.anInt8885);
							}
							if (local552 != -1) {
								@Pc(829) int local829 = (local552 & 0x7F) * local613 >> 7;
								if (local829 < 2) {
									local829 = 2;
								} else if (local829 > 126) {
									local829 = 126;
								}
								local595 = Static408.anIntArray407[local552 & 0xFF80 | local829];
								if ((this.anInt5080 & 0x7) == 0) {
									local597 = local605 * this.aClass100_Sub1_12.aFloatArray67[2] + this.aClass100_Sub1_12.aFloatArray67[0] * local607 + local609 * this.aClass100_Sub1_12.aFloatArray67[1];
									local597 = this.aClass100_Sub1_12.aFloat178 + local597 * (local597 > 0.0F ? this.aClass100_Sub1_12.aFloat168 : this.aClass100_Sub1_12.aFloat173);
								}
							}
							@Pc(906) Class5 local906 = null;
							if ((local529 & this.anInt5083 - 1) == 0 && (this.anInt5083 - 1 & local538) == 0) {
								local906 = local219.method6943(local583);
							}
							@Pc(1278) int local1278;
							@Pc(940) int local940;
							if (local906 == null) {
								if (local556 == local552) {
									local940 = local595;
								} else {
									@Pc(950) int local950 = (local556 & 0x7F) * local613 >> 7;
									if (local950 < 2) {
										local950 = 2;
									} else if (local950 > 126) {
										local950 = 126;
									}
									local940 = Static408.anIntArray407[local950 | local556 & 0xFF80];
									if ((this.anInt5080 & 0x7) == 0) {
										local686 = this.aClass100_Sub1_12.aFloatArray67[2] * local605 + local607 * this.aClass100_Sub1_12.aFloatArray67[0] + local609 * this.aClass100_Sub1_12.aFloatArray67[1];
										local686 = this.aClass100_Sub1_12.aFloat178 + local597 * (local597 > 0.0F ? this.aClass100_Sub1_12.aFloat168 : this.aClass100_Sub1_12.aFloat173);
										@Pc(1031) int local1031 = local940 >> 16 & 0xFF;
										@Pc(1037) int local1037 = local940 >> 8 & 0xFF;
										@Pc(1041) int local1041 = local940 & 0xFF;
										local1031 = (int) ((float) local1031 * local686);
										if (local1031 < 0) {
											local1031 = 0;
										} else if (local1031 > 255) {
											local1031 = 255;
										}
										local1037 = (int) ((float) local1037 * local686);
										local1041 = (int) ((float) local1041 * local686);
										if (local1037 < 0) {
											local1037 = 0;
										} else if (local1037 > 255) {
											local1037 = 255;
										}
										if (local1041 < 0) {
											local1041 = 0;
										} else if (local1041 > 255) {
											local1041 = 255;
										}
										local940 = local1041 | local1031 << 16 | local1037 << 8;
									}
								}
								if (Stream.c()) {
									local191.b((float) local529);
									local191.b((float) (local565 + this.method7625(local529, local538)));
									local191.b((float) local538);
									local191.b((float) local529);
									local191.b((float) local538);
									if (this.anIntArrayArrayArray12 != null) {
										local191.b((float) (local301 == null ? 0 : local301[local467] - 1));
									}
									if ((this.anInt5080 & 0x7) != 0) {
										local191.b(local607);
										local191.b(local609);
										local191.b(local605);
									}
								} else {
									local191.a((float) local529);
									local191.a((float) (local565 + this.method7625(local529, local538)));
									local191.a((float) local538);
									local191.a((float) local529);
									local191.a((float) local538);
									if (this.anIntArrayArrayArray12 != null) {
										local191.a((float) (local301 == null ? 0 : local301[local467] - 1));
									}
									if ((this.anInt5080 & 0x7) != 0) {
										local191.a(local607);
										local191.a(local609);
										local191.a(local605);
									}
								}
								if (this.aClass100_Sub1_12.anInt9227 == 0) {
									local196.b(local940 | 0xFF000000);
								} else {
									local196.a(local940 | 0xFF000000);
								}
								local1278 = this.anInt5092++;
								local516[local467] = (short) local1278;
								if (local552 != -1) {
									local200[local1278] = local247[local467];
								}
								local219.method6944(new Class5_Sub54(local516[local467]), local583, -12002);
							} else {
								local516[local467] = ((Class5_Sub54) local906).aShort127;
								local1278 = local516[local467] & 0xFFFF;
								if (local552 != -1 && local247[local467].aLong312 < local200[local1278].aLong312) {
									local200[local1278] = local247[local467];
								}
							}
							for (local940 = 0; local940 < local455; local940++) {
								local223[local940].method900(local595, local1278, local597, local613);
							}
							this.anInt5089++;
						}
					}
				}
			}
			for (local229 = 0; local229 < this.anInt5092; local229++) {
				@Pc(1413) Class5_Sub8 local1413 = local200[local229];
				if (local1413 != null) {
					local1413.method902(local229);
				}
			}
			@Pc(1438) int local1438;
			@Pc(1457) int local1457;
			for (@Pc(1432) int local1432 = 0; super.anInt8883 > local1432; local1432++) {
				for (local1438 = 0; super.anInt8878 > local1438; local1438++) {
					@Pc(1451) short[] local1451 = this.aShortArrayArray16[super.anInt8883 * local1438 + local1432];
					if (local1451 != null) {
						@Pc(1455) int local1455 = 0;
						local1457 = 0;
						while (local1457 < local1451.length) {
							@Pc(1466) int local1466 = local1451[local1457++] & 0xFFFF;
							@Pc(1473) int local1473 = local1451[local1457++] & 0xFFFF;
							@Pc(1480) int local1480 = local1451[local1457++] & 0xFFFF;
							@Pc(1484) Class5_Sub8 local1484 = local200[local1466];
							@Pc(1488) Class5_Sub8 local1488 = local200[local1473];
							@Pc(1492) Class5_Sub8 local1492 = local200[local1480];
							@Pc(1494) Class5_Sub8 local1494 = null;
							if (local1484 != null) {
								local1494 = local1484;
								local1484.method903(local1432, local1438, local1455);
							}
							if (local1488 != null) {
								local1488.method903(local1432, local1438, local1455);
								if (local1494 == null || local1488.aLong312 < local1494.aLong312) {
									local1494 = local1488;
								}
							}
							if (local1492 != null) {
								local1492.method903(local1432, local1438, local1455);
								if (local1494 == null || local1494.aLong312 > local1492.aLong312) {
									local1494 = local1492;
								}
							}
							if (local1494 != null) {
								if (local1484 != null) {
									local1494.method902(local1466);
								}
								if (local1488 != null) {
									local1494.method902(local1473);
								}
								if (local1492 != null) {
									local1494.method902(local1480);
								}
								local1494.method903(local1432, local1438, local1455);
							}
							local1455++;
						}
					}
				}
			}
			local191.b();
			local196.b();
			this.anInterface15_13 = this.aClass100_Sub1_12.method7920(false);
			this.anInterface15_13.method5732(4, this.anInt5092 * 4, local176);
			this.anInterface15_14 = this.aClass100_Sub1_12.method7920(false);
			this.anInterface15_14.method5732(local147, this.anInt5092 * local147, local186);
			if ((this.anInt5080 & 0x7) == 0) {
				if (this.anIntArrayArrayArray12 == null) {
					this.aClass124_16 = this.aClass100_Sub1_12.method7981(new Class139[] { new Class139(new Class21[] { Static24.aClass21_1, Static24.aClass21_5 }), new Class139(Static24.aClass21_3) });
				} else {
					this.aClass124_16 = this.aClass100_Sub1_12.method7981(new Class139[] { new Class139(new Class21[] { Static24.aClass21_1, Static24.aClass21_5, Static24.aClass21_4 }), new Class139(Static24.aClass21_3) });
				}
			} else if (this.anIntArrayArrayArray12 == null) {
				this.aClass124_16 = this.aClass100_Sub1_12.method7981(new Class139[] { new Class139(new Class21[] { Static24.aClass21_1, Static24.aClass21_5, Static24.aClass21_2 }), new Class139(Static24.aClass21_3) });
			} else {
				this.aClass124_16 = this.aClass100_Sub1_12.method7981(new Class139[] { new Class139(new Class21[] { Static24.aClass21_1, Static24.aClass21_5, Static24.aClass21_4, Static24.aClass21_2 }), new Class139(Static24.aClass21_3) });
			}
			local1438 = 0;
			for (@Pc(1826) int local1826 = 0; local1826 < local119.length; local1826++) {
				if (local119[local1826].anInt873 > 0) {
					local119[local1438++] = local119[local1826];
				}
			}
			this.aClass5_Sub8Array1 = new Class5_Sub8[local1438];
			@Pc(1859) long[] local1859 = new long[local1438];
			for (local1457 = 0; local1457 < local1438; local1457++) {
				@Pc(1869) Class5_Sub8 local1869 = local119[local1457];
				local1859[local1457] = local1869.aLong312;
				this.aClass5_Sub8Array1[local1457] = local1869;
				local1869.method898(this.anInt5092);
			}
			Static610.method8373(local1859, this.aClass5_Sub8Array1);
			if (this.aClass382_2 != null) {
				this.aClass382_2.method8887();
			}
		}
		this.aFloatArrayArray10 = this.aFloatArrayArray11 = this.aFloatArrayArray9 = null;
		this.anIntArrayArrayArray13 = this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass306_21 = null;
		this.lb = null;
		this.aClass5_Sub8ArrayArrayArray1 = null;
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZII[[ZIII)V")
	private void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass5_Sub8Array1 == null) {
			return;
		}
		@Pc(23) int local23 = arg5 + arg5 + 1;
		@Pc(27) int local27 = local23 * local23;
		if (Static101.anIntArray93.length < local27) {
			Static101.anIntArray93 = new int[local27];
		}
		@Pc(41) int local41 = arg0 - arg5;
		@Pc(43) int local43 = local41;
		if (local41 < 0) {
			local41 = 0;
		}
		@Pc(52) int local52 = arg6 - arg5;
		@Pc(54) int local54 = local52;
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(62) int local62 = arg5 + arg0;
		if (super.anInt8883 - 1 < local62) {
			local62 = super.anInt8883 - 1;
		}
		@Pc(78) int local78 = arg6 + arg5;
		Static320.anInt5472 = 0;
		if (super.anInt8878 - 1 < local78) {
			local78 = super.anInt8878 - 1;
		}
		for (@Pc(97) int local97 = local41; local97 <= local62; local97++) {
			@Pc(106) boolean[] local106 = arg3[local97 - local43];
			for (@Pc(108) int local108 = local52; local108 <= local78; local108++) {
				if (local106[local108 - local54]) {
					Static101.anIntArray93[Static320.anInt5472++] = local97 + local108 * super.anInt8883;
				}
			}
		}
		if (arg4 == -1) {
			this.aClass100_Sub1_12.method7901();
		} else {
			this.aClass100_Sub1_12.method7964((float) arg4);
			this.aClass100_Sub1_12.method7953();
		}
		this.aClass100_Sub1_12.method7933();
		this.aClass100_Sub1_12.method7935((this.anInt5080 & 0x7) != 0);
		this.aClass100_Sub1_12.method7971(false, -1, false);
		this.aClass100_Sub1_12.method7868(this.anInterface15_14, 0);
		for (@Pc(213) int local213 = 0; local213 < this.aClass5_Sub8Array1.length; local213++) {
			this.aClass5_Sub8Array1[local213].method895(Static101.anIntArray93, Static320.anInt5472);
		}
		@Pc(238) Class10_Sub2 local238 = this.aClass100_Sub1_12.method7956();
		local238.method4214(0, -1, 0);
		this.aClass100_Sub1_12.method7992();
		if (!this.aClass20_19.method367()) {
			@Pc(258) int local258 = this.aClass100_Sub1_12.anInt9236;
			@Pc(262) int local262 = this.aClass100_Sub1_12.anInt9255;
			this.aClass100_Sub1_12.L(0, local262, this.aClass100_Sub1_12.anInt9264);
			this.aClass100_Sub1_12.method7935(false);
			this.aClass100_Sub1_12.method7914(false);
			this.aClass100_Sub1_12.method7957(128);
			this.aClass100_Sub1_12.method7971(false, -2, false);
			this.aClass100_Sub1_12.method7923(this.aClass100_Sub1_12.anInterface19_3);
			this.aClass100_Sub1_12.method7904(Static164.aClass94_1, Static653.aClass94_5);
			this.aClass100_Sub1_12.method7970(Static520.aClass93_4, 0);
			this.aClass100_Sub1_12.method7947(Static89.aClass93_1, 0);
			for (@Pc(322) Class5 local322 = this.aClass20_19.method378(); local322 != null; local322 = this.aClass20_19.method366()) {
				@Pc(327) Class5_Sub5 local327 = (Class5_Sub5) local322;
				local327.method346(arg6, arg3, arg0, arg5);
			}
			this.aClass100_Sub1_12.method7970(Static94.aClass93_2, 0);
			this.aClass100_Sub1_12.method7947(Static94.aClass93_2, 0);
			this.aClass100_Sub1_12.method7923((Interface19) null);
			this.aClass100_Sub1_12.L(local258, local262, this.aClass100_Sub1_12.anInt9264);
		}
		if (this.aClass382_2 == null) {
			return;
		}
		this.aClass100_Sub1_12.method7868(this.anInterface15_14, 0);
		this.aClass100_Sub1_12.method7868(this.anInterface15_13, 1);
		this.aClass100_Sub1_12.method7921(this.aClass124_16);
		this.aClass382_2.method8894(arg1, arg0, arg5, arg6, arg3);
		return;
	}

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		@Pc(9) Interface7 local9 = this.aClass100_Sub1_12.anInterface7_12;
		if (arg3 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt8883][super.anInt8878][];
		}
		if (arg5 != null && this.anIntArrayArrayArray12 == null) {
			this.anIntArrayArrayArray12 = new int[super.anInt8883][super.anInt8878][];
		}
		this.anIntArrayArrayArray13[arg0][arg1] = arg2;
		this.anIntArrayArrayArray10[arg0][arg1] = arg4;
		this.anIntArrayArrayArray15[arg0][arg1] = arg6;
		this.anIntArrayArrayArray11[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray12 != null) {
			this.anIntArrayArrayArray12[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg3;
		}
		@Pc(104) Class5_Sub8[] local104 = this.aClass5_Sub8ArrayArrayArray1[arg0][arg1] = new Class5_Sub8[arg6.length];
		for (@Pc(106) int local106 = 0; local106 < arg6.length; local106++) {
			@Pc(114) int local114 = arg8[local106];
			@Pc(118) int local118 = arg9[local106];
			if ((this.anInt5080 & 0x20) != 0 && local114 != -1 && local9.method7423(local114).aBoolean56) {
				local118 = 128;
				local114 = -1;
			}
			@Pc(164) long local164 = (long) local114 | (long) (local118 << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
			@Pc(170) Class5 local170;
			for (local170 = this.aClass306_21.method6943(local164); local170 != null; local170 = this.aClass306_21.method6945()) {
				@Pc(177) Class5_Sub8 local177 = (Class5_Sub8) local170;
				if (local177.anInt869 == local114 && local177.aFloat30 == (float) local118 && local177.anInt875 == arg10 && local177.anInt876 == arg11 && local177.anInt877 == arg12) {
					break;
				}
			}
			if (local170 == null) {
				local104[local106] = new Class5_Sub8(this, local114, local118, arg10, arg11, arg12);
				this.aClass306_21.method6944(local104[local106], local164, -12002);
			} else {
				local104[local106] = (Class5_Sub8) local170;
			}
		}
		if (arg13) {
			this.aByteArrayArray13[arg0][arg1] = (byte) (this.aByteArrayArray13[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt5099) {
			this.anInt5099 = arg6.length;
		}
		this.anInt5098 += arg6.length;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ih;[I)V")
	@Override
	public void method7623(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass20_19.method370(new Class5_Sub5(this.aClass100_Sub1_12, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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

	@OriginalMember(owner = "client!kb", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass382_2 != null && arg0 != null) {
			@Pc(27) int local27 = arg1 - (arg2 * this.aClass100_Sub1_12.anInt9254 >> 8) >> this.aClass100_Sub1_12.anInt9257;
			@Pc(42) int local42 = arg3 - (arg2 * this.aClass100_Sub1_12.anInt9238 >> 8) >> this.aClass100_Sub1_12.anInt9257;
			this.aClass382_2.method8890(local42, arg0, local27);
		}
	}

	@OriginalMember(owner = "client!kb", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((this.lb[arg0][arg1] & 0xFF) < arg2) {
			this.lb[arg0][arg1] = (byte) arg2;
		}
	}
}
