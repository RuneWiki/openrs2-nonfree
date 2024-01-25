import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "I")
	private int anInt7911;

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
	private int anInt7914;

	@OriginalMember(owner = "client!qq", name = "X", descriptor = "Lclient!km;")
	private Interface15 anInterface15_8;

	@OriginalMember(owner = "client!qq", name = "Z", descriptor = "I")
	private int anInt7920;

	@OriginalMember(owner = "client!qq", name = "ab", descriptor = "[Lclient!bha;")
	private Class3_Sub7[] aClass3_Sub7Array1;

	@OriginalMember(owner = "client!qq", name = "db", descriptor = "I")
	private int anInt7921;

	@OriginalMember(owner = "client!qq", name = "fb", descriptor = "Lclient!km;")
	private Interface15 anInterface15_9;

	@OriginalMember(owner = "client!qq", name = "gb", descriptor = "Lclient!eda;")
	public Class94 aClass94_8;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "F")
	private float aFloat154 = -3.4028235E38F;

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "F")
	private float aFloat156 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "Lclient!qw;")
	private final Class302 aClass302_52 = new Class302();

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "I")
	private final int anInt7906 = this.anInt9154 - 2;

	@OriginalMember(owner = "client!qq", name = "M", descriptor = "Lclient!ee;")
	public final Class95_Sub1 aClass95_Sub1_19;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!qq", name = "S", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!qq", name = "bb", descriptor = "[[B")
	private byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
	private final int anInt7916;

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "[[B")
	private final byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!qq", name = "W", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!qq", name = "Y", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!qq", name = "T", descriptor = "[[S")
	public final short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
	public final int anInt7918;

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "[[[I")
	public int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!qq", name = "V", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "[[[Lclient!bha;")
	private Class3_Sub7[][][] aClass3_Sub7ArrayArrayArray1;

	@OriginalMember(owner = "client!qq", name = "cb", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!qq", name = "eb", descriptor = "Lclient!tca;")
	private Class333 aClass333_32;

	@OriginalMember(owner = "client!qq", name = "I", descriptor = "Lclient!jaa;")
	private Class170 aClass170_2;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!ee;IIII[[I[[II)V")
	public Class35_Sub3(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass95_Sub1_19 = arg0;
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anIntArrayArrayArray15 = new int[arg3][arg4][];
		this.aByteArrayArray23 = new byte[arg3 + 1][arg4 + 1];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anInt7916 = 0x1 << this.anInt7906;
		this.aByteArrayArray22 = new byte[arg3][arg4];
		this.aFloatArrayArray6 = new float[super.anInt9149 + 1][super.anInt9148 + 1];
		this.aFloatArrayArray7 = new float[super.anInt9149 + 1][super.anInt9148 + 1];
		this.aShortArrayArray10 = new short[arg4 * arg3][];
		this.anInt7918 = arg2;
		this.anIntArrayArrayArray13 = new int[arg3][arg4][];
		this.anIntArrayArrayArray16 = new int[arg3][arg4][];
		this.aClass3_Sub7ArrayArrayArray1 = new Class3_Sub7[arg3][arg4][];
		this.aFloatArrayArray8 = new float[super.anInt9149 + 1][super.anInt9148 + 1];
		for (@Pc(121) int local121 = 0; super.anInt9148 >= local121; local121++) {
			for (@Pc(125) int local125 = 0; local125 <= super.anInt9149; local125++) {
				@Pc(134) int local134 = super.anIntArrayArray54[local125][local121];
				if (this.aFloat156 > (float) local134) {
					this.aFloat156 = (float) local134;
				}
				if (this.aFloat154 < (float) local134) {
					this.aFloat154 = (float) local134;
				}
				if (local125 > 0 && local121 > 0 && local125 < super.anInt9149 && local121 < super.anInt9148) {
					@Pc(197) int local197 = arg6[local125 + 1][local121] - arg6[local125 - 1][local121];
					@Pc(214) int local214 = arg6[local125][local121 + 1] - arg6[local125][local121 - 1];
					@Pc(233) float local233 = (float) (1.0D / Math.sqrt((double) (local214 * local214 + local197 * local197 + arg7 * 4 * arg7)));
					this.aFloatArrayArray6[local125][local121] = (float) local197 * local233;
					this.aFloatArrayArray8[local125][local121] = local233 * (float) (-arg7 * 2);
					this.aFloatArrayArray7[local125][local121] = (float) local214 * local233;
				}
			}
		}
		this.aFloat154++;
		this.aFloat156--;
		this.aClass333_32 = new Class333(128);
		if ((this.anInt7918 & 0x10) != 0) {
			this.aClass170_2 = new Class170(this.aClass95_Sub1_19, this);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!ri;II)V")
	private void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub5_Sub11_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int[] local12 = this.anIntArrayArrayArray13[arg2][arg0];
		@Pc(19) int[] local19 = this.anIntArrayArrayArray15[arg2][arg0];
		@Pc(22) int local22 = local12.length;
		if (Static505.anIntArray429.length < local22) {
			Static505.anIntArray429 = new int[local22];
			Static258.anIntArray266 = new int[local22];
		}
		for (@Pc(38) int local38 = 0; local38 < local22; local38++) {
			Static505.anIntArray429[local38] = local12[local38] >> this.aClass95_Sub1_19.anInt10055;
			Static258.anIntArray266[local38] = local19[local38] >> this.aClass95_Sub1_19.anInt10055;
		}
		@Pc(79) int local79 = 0;
		while (local22 > local79) {
			@Pc(85) int local85 = Static505.anIntArray429[local79];
			@Pc(90) int local90 = Static258.anIntArray266[local79++];
			@Pc(94) int local94 = Static505.anIntArray429[local79];
			@Pc(99) int local99 = Static258.anIntArray266[local79++];
			@Pc(103) int local103 = Static505.anIntArray429[local79];
			@Pc(108) int local108 = Static258.anIntArray266[local79++];
			if (-((local103 - local94) * (local99 + -local90)) + (local85 - local94) * (local99 - local108) > 0) {
				arg1.method6798(local108, local103, local85, local94, local99, local90);
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method7456(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		if (this.anInt7921 <= 0) {
			return;
		}
		@Pc(16) Interface22 local16 = this.aClass95_Sub1_19.method8161(this.anInt7911);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 32767;
		@Pc(22) int local22 = -32768;
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			local18 = 0;
			@Pc(33) Buffer local33 = local16.method7405();
			if (local33 != null) {
				@Pc(41) Stream local41 = this.aClass95_Sub1_19.method8157(local33);
				@Pc(45) int local45;
				@Pc(54) int local54;
				@Pc(56) int local56;
				@Pc(75) short[] local75;
				@Pc(79) int local79;
				@Pc(87) int local87;
				if (Stream.b()) {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + super.anInt9149 * local45;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray10[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local18++;
										if (local20 > local87) {
											local20 = local87;
										}
										if (local22 < local87) {
											local22 = local87;
										}
										local41.a(local87);
									}
								}
							}
							local54++;
						}
					}
				} else {
					for (local45 = arg1; local45 < arg3; local45++) {
						local54 = arg0 + local45 * super.anInt9149;
						for (local56 = arg0; local56 < arg2; local56++) {
							if (arg4[local56 - arg0][local45 - arg1]) {
								local75 = this.aShortArrayArray10[local54];
								if (local75 != null) {
									for (local79 = 0; local79 < local75.length; local79++) {
										local87 = local75[local79] & 0xFFFF;
										local18++;
										if (local87 < local20) {
											local20 = local87;
										}
										if (local87 > local22) {
											local22 = local87;
										}
										local41.e(local87);
									}
								}
							}
							local54++;
						}
					}
				}
				local41.a();
				if (local16.method7407()) {
					break;
				}
			}
		}
		if (local18 <= 0) {
			return;
		}
		this.aClass95_Sub1_19.method8116();
		this.aClass95_Sub1_19.method8099(false);
		this.aClass95_Sub1_19.method8163(false);
		this.aClass95_Sub1_19.method8154(false);
		this.aClass95_Sub1_19.method8095(false);
		this.aClass95_Sub1_19.method8162(0);
		this.aClass95_Sub1_19.method8118(false, -2, false);
		this.aClass95_Sub1_19.method8147((Interface1) null);
		@Pc(271) Class17_Sub2 local271 = this.aClass95_Sub1_19.method8119();
		@Pc(276) float[] local276 = this.aClass95_Sub1_19.method8190();
		local276[1] = 0.0F;
		local276[6] = 0.0F;
		local276[8] = 0.0F;
		local276[14] = -this.aFloat156 / (this.aFloat154 - this.aFloat156);
		local276[4] = 0.0F;
		local276[2] = 0.0F;
		local276[7] = 0.0F;
		local276[15] = 1.0F;
		local276[13] = 1.0F - ((float) 0 + (float) (arg3 * 1024) / 128.0F) / (float) this.aClass95_Sub1_19.anInt9970;
		local276[11] = 0.0F;
		local276[3] = 0.0F;
		local276[9] = 0.0F;
		local276[5] = (float) 1024 / ((float) super.anInt9152 * 128.0F * (float) this.aClass95_Sub1_19.anInt9970);
		local276[12] = -1.0F - ((float) 0 + (float) (arg0 * 1024) / 128.0F) / (float) this.aClass95_Sub1_19.anInt9996;
		local276[0] = (float) 1024 / ((float) this.aClass95_Sub1_19.anInt9996 * 128.0F * (float) super.anInt9152);
		local276[10] = 1.0F / (this.aFloat154 - this.aFloat156);
		local271.method5853(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F);
		this.aClass95_Sub1_19.method8076();
		this.aClass95_Sub1_19.method8098();
		if ((this.anInt7918 & 0x7) == 0) {
			this.aClass95_Sub1_19.method8163(false);
		} else {
			this.aClass95_Sub1_19.method8163(true);
			this.aClass95_Sub1_19.method8159();
		}
		this.aClass95_Sub1_19.method8169(false);
		this.aClass95_Sub1_19.method8133(this.anInterface15_8, 0);
		this.aClass95_Sub1_19.method8133(this.anInterface15_9, 1);
		this.aClass95_Sub1_19.method8166(this.aClass94_8);
		this.aClass95_Sub1_19.method8109(local18 / 3, 0, local22 + 1 - local20, Static649.aClass115_6, local20, local16);
		this.aClass95_Sub1_19.method8169(true);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
	@Override
	public void method7454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method6565(arg4, arg3, arg1, arg5, arg2, arg0, -1);
	}

	@OriginalMember(owner = "client!qq", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void CA(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass170_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass95_Sub1_19.anInt10059 >> 8) >> this.aClass95_Sub1_19.anInt10055;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass95_Sub1_19.anInt10061 >> 8) >> this.aClass95_Sub1_19.anInt10055;
			this.aClass170_2.method3989(arg0, local24, local39);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[[ZZII)V")
	@Override
	public void method7451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method6565(arg4, arg3, arg1, arg6, arg2, arg0, arg5);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z[[ZIIIIII)V")
	private void method6565(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (this.aClass3_Sub7Array1 == null) {
			return;
		}
		@Pc(15) int local15 = arg4 + arg4 + 1;
		@Pc(19) int local19 = local15 * local15;
		if (Static253.anIntArray264.length < local19) {
			Static253.anIntArray264 = new int[local19];
		}
		@Pc(35) int local35 = arg5 - arg4;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(49) int local49 = arg2 - arg4;
		@Pc(51) int local51 = local49;
		if (local49 < 0) {
			local49 = 0;
		}
		@Pc(59) int local59 = arg4 + arg5;
		if (local59 > super.anInt9149 - 1) {
			local59 = super.anInt9149 - 1;
		}
		@Pc(78) int local78 = arg4 + arg2;
		if (super.anInt9148 - 1 < local78) {
			local78 = super.anInt9148 - 1;
		}
		Static677.anInt10940 = 0;
		for (@Pc(97) int local97 = local35; local97 <= local59; local97++) {
			@Pc(105) boolean[] local105 = arg1[local97 - local37];
			for (@Pc(107) int local107 = local49; local107 <= local78; local107++) {
				if (local105[local107 - local51]) {
					Static253.anIntArray264[Static677.anInt10940++] = super.anInt9149 * local107 + local97;
				}
			}
		}
		if (arg6 == -1) {
			this.aClass95_Sub1_19.method8086();
		} else {
			this.aClass95_Sub1_19.method8083((float) arg6);
			this.aClass95_Sub1_19.method8181();
		}
		this.aClass95_Sub1_19.method8144();
		this.aClass95_Sub1_19.method8163((this.anInt7918 & 0x7) != 0);
		this.aClass95_Sub1_19.method8118(false, -1, false);
		this.aClass95_Sub1_19.method8133(this.anInterface15_8, 0);
		for (@Pc(196) int local196 = 0; local196 < this.aClass3_Sub7Array1.length; local196++) {
			this.aClass3_Sub7Array1[local196].method809(Static677.anInt10940, Static253.anIntArray264);
		}
		@Pc(221) Class17_Sub2 local221 = this.aClass95_Sub1_19.method8119();
		local221.method6231(0, -1, 0);
		this.aClass95_Sub1_19.method8098();
		if (!this.aClass302_52.method6612()) {
			@Pc(239) int local239 = this.aClass95_Sub1_19.anInt10029;
			@Pc(243) int local243 = this.aClass95_Sub1_19.anInt10049;
			this.aClass95_Sub1_19.L(0, local243, this.aClass95_Sub1_19.anInt10041);
			this.aClass95_Sub1_19.method8163(false);
			this.aClass95_Sub1_19.method8095(false);
			this.aClass95_Sub1_19.method8162(128);
			this.aClass95_Sub1_19.method8118(false, -2, false);
			this.aClass95_Sub1_19.method8147(this.aClass95_Sub1_19.anInterface1_3);
			this.aClass95_Sub1_19.method8195(Static134.aClass112_9, Static617.aClass112_28);
			this.aClass95_Sub1_19.method8108(0, Static576.aClass235_3);
			this.aClass95_Sub1_19.method8122(Static189.aClass235_1, 0);
			for (@Pc(303) Class3 local303 = this.aClass302_52.method6603(); local303 != null; local303 = this.aClass302_52.method6605()) {
				@Pc(308) Class3_Sub49 local308 = (Class3_Sub49) local303;
				local308.method7721(arg2, arg4, arg5, arg1);
			}
			this.aClass95_Sub1_19.method8108(0, Static665.aClass235_4);
			this.aClass95_Sub1_19.method8122(Static665.aClass235_4, 0);
			this.aClass95_Sub1_19.method8147((Interface1) null);
			this.aClass95_Sub1_19.L(local239, local243, this.aClass95_Sub1_19.anInt10041);
		}
		if (this.aClass170_2 != null) {
			this.aClass95_Sub1_19.method8133(this.anInterface15_8, 0);
			this.aClass95_Sub1_19.method8133(this.anInterface15_9, 1);
			this.aClass95_Sub1_19.method8166(this.aClass94_8);
			this.aClass170_2.method3992(arg1, arg0, arg4, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!qq", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	@Override
	public Class3_Sub5_Sub11 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub5_Sub11 arg2) {
		if ((this.aByteArrayArray22[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(24) int local24 = super.anInt9152 >> this.aClass95_Sub1_19.anInt10055;
		@Pc(27) Class3_Sub5_Sub11_Sub2 local27 = (Class3_Sub5_Sub11_Sub2) arg2;
		@Pc(37) Class3_Sub5_Sub11_Sub2 local37;
		if (local27 != null && local27.method6796(local24, local24)) {
			local37 = local27;
			local27.method6800();
		} else {
			local37 = new Class3_Sub5_Sub11_Sub2(this.aClass95_Sub1_19, local24, local24);
		}
		local37.method6803(0, local24, 0, local24);
		this.method6562(arg1, local37, arg0);
		return local37;
	}

	@OriginalMember(owner = "client!qq", name = "YA", descriptor = "()V")
	@Override
	public void YA() {
		if (this.anInt7921 > 0) {
			@Pc(18) byte[][] local18 = new byte[super.anInt9149 + 1][super.anInt9148 + 1];
			for (@Pc(20) int local20 = 1; super.anInt9149 > local20; local20++) {
				for (@Pc(24) int local24 = 1; super.anInt9148 > local24; local24++) {
					local18[local20][local24] = (byte) ((this.aByteArrayArray23[local20][local24] >> 1) + (this.aByteArrayArray23[local20][local24 - 1] >> 2) + (this.aByteArrayArray23[local20 - -1][local24] >> 3) + (this.aByteArrayArray23[local20 + -1][local24] >> 2) + (this.aByteArrayArray23[local20][local24 + 1] >> 3));
				}
			}
			@Pc(104) Class3_Sub7[] local104 = new Class3_Sub7[this.aClass333_32.method7486()];
			this.aClass333_32.method7483(local104);
			for (@Pc(112) int local112 = 0; local112 < local104.length; local112++) {
				local104[local112].method815(this.anInt7921);
			}
			@Pc(128) int local128 = 20;
			if (this.anIntArrayArrayArray14 != null) {
				local128 += 4;
			}
			if ((this.anInt7918 & 0x7) != 0) {
				local128 += 12;
			}
			@Pc(148) NativeHeapBuffer local148 = this.aClass95_Sub1_19.aNativeHeap4.a(this.anInt7921 * 4, false);
			@Pc(158) NativeHeapBuffer local158 = this.aClass95_Sub1_19.aNativeHeap4.a(local128 * this.anInt7921, false);
			@Pc(163) Stream local163 = new Stream(local158);
			@Pc(168) Stream local168 = new Stream(local148);
			@Pc(172) Class3_Sub7[] local172 = new Class3_Sub7[this.anInt7921];
			@Pc(179) int local179 = Static324.method4617(this.anInt7921 / 4);
			if (local179 < 1) {
				local179 = 1;
			}
			@Pc(189) Class333 local189 = new Class333(local179);
			@Pc(193) Class3_Sub7[] local193 = new Class3_Sub7[this.anInt7920];
			@Pc(199) int local199;
			for (@Pc(195) int local195 = 0; super.anInt9149 > local195; local195++) {
				for (local199 = 0; local199 < super.anInt9148; local199++) {
					if (this.anIntArrayArrayArray11[local195][local199] != null) {
						@Pc(215) Class3_Sub7[] local215 = this.aClass3_Sub7ArrayArrayArray1[local195][local199];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray13[local195][local199];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray15[local195][local199];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray12[local195][local199];
						@Pc(243) int[] local243 = this.anIntArrayArrayArray11[local195][local199];
						@Pc(255) int[] local255 = this.anIntArrayArrayArray16 == null ? null : this.anIntArrayArrayArray16[local195][local199];
						@Pc(267) int[] local267 = this.anIntArrayArrayArray14 == null ? null : this.anIntArrayArrayArray14[local195][local199];
						if (local236 == null) {
							local236 = local243;
						}
						@Pc(278) float local278 = this.aFloatArrayArray6[local195][local199];
						@Pc(285) float local285 = this.aFloatArrayArray8[local195][local199];
						@Pc(292) float local292 = this.aFloatArrayArray7[local195][local199];
						@Pc(301) float local301 = this.aFloatArrayArray6[local195][local199 + 1];
						@Pc(310) float local310 = this.aFloatArrayArray8[local195][local199 + 1];
						@Pc(319) float local319 = this.aFloatArrayArray7[local195][local199 + 1];
						@Pc(330) float local330 = this.aFloatArrayArray6[local195 + 1][local199 + 1];
						@Pc(341) float local341 = this.aFloatArrayArray8[local195 + 1][local199 + 1];
						@Pc(352) float local352 = this.aFloatArrayArray7[local195 + 1][local199 + 1];
						@Pc(361) float local361 = this.aFloatArrayArray6[local195 + 1][local199];
						@Pc(370) float local370 = this.aFloatArrayArray8[local195 + 1][local199];
						@Pc(379) float local379 = this.aFloatArrayArray7[local195 + 1][local199];
						@Pc(387) int local387 = local18[local195][local199] & 0xFF;
						@Pc(397) int local397 = local18[local195][local199 + 1] & 0xFF;
						@Pc(409) int local409 = local18[local195 + 1][local199 + 1] & 0xFF;
						@Pc(419) int local419 = local18[local195 + 1][local199] & 0xFF;
						@Pc(421) int local421 = 0;
						@Pc(431) int local431;
						label355: for (@Pc(423) int local423 = 0; local423 < local243.length; local423++) {
							@Pc(429) Class3_Sub7 local429 = local215[local423];
							for (local431 = 0; local431 < local421; local431++) {
								if (local193[local431] == local429) {
									continue label355;
								}
							}
							local193[local421++] = local429;
						}
						@Pc(472) short[] local472 = this.aShortArrayArray10[local195 + local199 * super.anInt9149] = new short[local243.length];
						for (local431 = 0; local431 < local243.length; local431++) {
							@Pc(485) int local485 = (local195 << super.anInt9154) + local222[local431];
							@Pc(495) int local495 = (local199 << super.anInt9154) + local229[local431];
							@Pc(500) int local500 = local485 >> this.anInt7906;
							@Pc(505) int local505 = local495 >> this.anInt7906;
							@Pc(509) int local509 = local243[local431];
							@Pc(513) int local513 = local236[local431];
							@Pc(521) int local521 = local255 == null ? 0 : local255[local431];
							@Pc(539) long local539 = (long) local509 << 32 | (long) local513 << 48 | (long) (local500 << 16) | (long) local505;
							@Pc(543) int local543 = local222[local431];
							@Pc(547) int local547 = local229[local431];
							@Pc(549) byte local549 = 74;
							@Pc(551) int local551 = 0;
							@Pc(578) float local578;
							@Pc(584) float local584;
							@Pc(586) float local586;
							@Pc(628) float local628;
							@Pc(582) int local582;
							if (local543 == 0 && local547 == 0) {
								local578 = local278;
								local582 = local549 - local387;
								local586 = local292;
								local584 = local285;
							} else if (local543 == 0 && local547 == super.anInt9152) {
								local584 = local310;
								local578 = local301;
								local582 = local549 - local397;
								local586 = local319;
							} else if (super.anInt9152 == local543 && super.anInt9152 == local547) {
								local578 = local330;
								local582 = local549 - local409;
								local584 = local341;
								local586 = local352;
							} else if (super.anInt9152 == local543 && local547 == 0) {
								local584 = local370;
								local582 = local549 - local419;
								local586 = local379;
								local578 = local361;
							} else {
								@Pc(605) float local605 = (float) local543 / (float) super.anInt9152;
								@Pc(612) float local612 = (float) local547 / (float) super.anInt9152;
								@Pc(620) float local620 = (local361 - local278) * local605 + local278;
								local628 = local285 + local605 * (local370 - local285);
								@Pc(636) float local636 = (local379 - local292) * local605 + local292;
								@Pc(645) float local645 = (local330 - local301) * local605 + local301;
								@Pc(654) float local654 = local310 + local605 * (local341 - local310);
								@Pc(662) float local662 = local319 + local605 * (local352 - local319);
								local584 = local628 + local612 * (local654 - local628);
								local578 = (local645 - local620) * local612 + local620;
								local586 = local612 * (local662 - local636) + local636;
								@Pc(700) int local700 = ((local419 - local387) * local543 >> super.anInt9154) + local387;
								@Pc(713) int local713 = local397 + (local543 * (local409 - local397) >> super.anInt9154);
								local582 = local549 - (local547 * (local713 - local700) >> super.anInt9154) - local700;
							}
							@Pc(765) float local765 = 1.0F;
							if (local509 != -1) {
								@Pc(776) int local776 = local582 * (local509 & 0x7F) >> 7;
								if (local776 < 2) {
									local776 = 2;
								} else if (local776 > 126) {
									local776 = 126;
								}
								local551 = Static537.anIntArray457[local509 & 0xFF80 | local776];
								if ((this.anInt7918 & 0x7) == 0) {
									local765 = this.aClass95_Sub1_19.aFloatArray64[2] * local586 + local578 * this.aClass95_Sub1_19.aFloatArray64[0] + this.aClass95_Sub1_19.aFloatArray64[1] * local584;
									local765 = this.aClass95_Sub1_19.aFloat199 + (local765 > 0.0F ? this.aClass95_Sub1_19.aFloat203 : this.aClass95_Sub1_19.aFloat191) * local765;
								}
							}
							@Pc(845) Class3 local845 = null;
							if ((this.anInt7916 - 1 & local485) == 0 && (local495 & this.anInt7916 - 1) == 0) {
								local845 = local189.method7489(local539);
							}
							@Pc(878) int local878;
							@Pc(908) int local908;
							if (local845 == null) {
								if (local509 == local513) {
									local908 = local551;
								} else {
									@Pc(918) int local918 = local582 * (local513 & 0x7F) >> 7;
									if (local918 < 2) {
										local918 = 2;
									} else if (local918 > 126) {
										local918 = 126;
									}
									local908 = Static537.anIntArray457[local918 | local513 & 0xFF80];
									if ((this.anInt7918 & 0x7) == 0) {
										@Pc(970) float local970 = local584 * this.aClass95_Sub1_19.aFloatArray64[1] + local578 * this.aClass95_Sub1_19.aFloatArray64[0] + this.aClass95_Sub1_19.aFloatArray64[2] * local586;
										local628 = (local765 > 0.0F ? this.aClass95_Sub1_19.aFloat203 : this.aClass95_Sub1_19.aFloat191) * local765 + this.aClass95_Sub1_19.aFloat199;
										@Pc(995) int local995 = local908 >> 16 & 0xFF;
										@Pc(1001) int local1001 = local908 >> 8 & 0xFF;
										@Pc(1005) int local1005 = local908 & 0xFF;
										local995 = (int) ((float) local995 * local628);
										if (local995 < 0) {
											local995 = 0;
										} else if (local995 > 255) {
											local995 = 255;
										}
										local1001 = (int) ((float) local1001 * local628);
										if (local1001 < 0) {
											local1001 = 0;
										} else if (local1001 > 255) {
											local1001 = 255;
										}
										local1005 = (int) ((float) local1005 * local628);
										if (local1005 < 0) {
											local1005 = 0;
										} else if (local1005 > 255) {
											local1005 = 255;
										}
										local908 = local1005 | local995 << 16 | local1001 << 8;
									}
								}
								if (Stream.b()) {
									local163.a((float) local485);
									local163.a((float) (local521 + this.method7452(local485, local495)));
									local163.a((float) local495);
									local163.a((float) local485);
									local163.a((float) local495);
									if (this.anIntArrayArrayArray14 != null) {
										local163.a((float) (local267 == null ? 0 : local267[local431] - 1));
									}
									if ((this.anInt7918 & 0x7) != 0) {
										local163.a(local578);
										local163.a(local584);
										local163.a(local586);
									}
								} else {
									local163.b((float) local485);
									local163.b((float) (local521 + this.method7452(local485, local495)));
									local163.b((float) local495);
									local163.b((float) local485);
									local163.b((float) local495);
									if (this.anIntArrayArrayArray14 != null) {
										local163.b((float) (local267 == null ? 0 : local267[local431] - 1));
									}
									if ((this.anInt7918 & 0x7) != 0) {
										local163.b(local578);
										local163.b(local584);
										local163.b(local586);
									}
								}
								if (this.aClass95_Sub1_19.anInt10057 == 0) {
									local168.f(local908 | 0xFF000000);
								} else {
									local168.b(local908 | 0xFF000000);
								}
								local878 = this.anInt7914++;
								local472[local431] = (short) local878;
								if (local509 != -1) {
									local172[local878] = local215[local431];
								}
								local189.method7488(local539, new Class3_Sub29(local472[local431]));
							} else {
								local472[local431] = ((Class3_Sub29) local845).aShort48;
								local878 = local472[local431] & 0xFFFF;
								if (local509 != -1 && local215[local431].aLong313 < local172[local878].aLong313) {
									local172[local878] = local215[local431];
								}
							}
							for (local908 = 0; local908 < local421; local908++) {
								local193[local908].method808(local551, local582, local765, local878);
							}
							this.anInt7911++;
						}
					}
				}
			}
			for (local199 = 0; local199 < this.anInt7914; local199++) {
				@Pc(1302) Class3_Sub7 local1302 = local172[local199];
				if (local1302 != null) {
					local1302.method814(local199);
				}
			}
			@Pc(1319) int local1319;
			@Pc(1337) int local1337;
			for (@Pc(1315) int local1315 = 0; super.anInt9149 > local1315; local1315++) {
				for (local1319 = 0; super.anInt9148 > local1319; local1319++) {
					@Pc(1331) short[] local1331 = this.aShortArrayArray10[local1315 + super.anInt9149 * local1319];
					if (local1331 != null) {
						@Pc(1335) int local1335 = 0;
						local1337 = 0;
						while (local1331.length > local1337) {
							@Pc(1346) int local1346 = local1331[local1337++] & 0xFFFF;
							@Pc(1353) int local1353 = local1331[local1337++] & 0xFFFF;
							@Pc(1360) int local1360 = local1331[local1337++] & 0xFFFF;
							@Pc(1364) Class3_Sub7 local1364 = local172[local1346];
							@Pc(1368) Class3_Sub7 local1368 = local172[local1353];
							@Pc(1372) Class3_Sub7 local1372 = local172[local1360];
							@Pc(1374) Class3_Sub7 local1374 = null;
							if (local1364 != null) {
								local1364.method812(local1335, local1319, local1315);
								local1374 = local1364;
							}
							if (local1368 != null) {
								local1368.method812(local1335, local1319, local1315);
								if (local1374 == null || local1374.aLong313 > local1368.aLong313) {
									local1374 = local1368;
								}
							}
							if (local1372 != null) {
								local1372.method812(local1335, local1319, local1315);
								if (local1374 == null || local1372.aLong313 < local1374.aLong313) {
									local1374 = local1372;
								}
							}
							if (local1374 != null) {
								if (local1364 != null) {
									local1374.method814(local1346);
								}
								if (local1368 != null) {
									local1374.method814(local1353);
								}
								if (local1372 != null) {
									local1374.method814(local1360);
								}
								local1374.method812(local1335, local1319, local1315);
							}
							local1335++;
						}
					}
				}
			}
			local163.a();
			local168.a();
			this.anInterface15_9 = this.aClass95_Sub1_19.method8090(false);
			this.anInterface15_9.method5527(4, local148, this.anInt7914 * 4);
			this.anInterface15_8 = this.aClass95_Sub1_19.method8090(false);
			this.anInterface15_8.method5527(local128, local158, this.anInt7914 * local128);
			if ((this.anInt7918 & 0x7) == 0) {
				if (this.anIntArrayArrayArray14 == null) {
					this.aClass94_8 = this.aClass95_Sub1_19.method8185(new Class306[] { new Class306(new Class356[] { Static610.aClass356_1, Static610.aClass356_5 }), new Class306(Static610.aClass356_3) });
				} else {
					this.aClass94_8 = this.aClass95_Sub1_19.method8185(new Class306[] { new Class306(new Class356[] { Static610.aClass356_1, Static610.aClass356_5, Static610.aClass356_4 }), new Class306(Static610.aClass356_3) });
				}
			} else if (this.anIntArrayArrayArray14 == null) {
				this.aClass94_8 = this.aClass95_Sub1_19.method8185(new Class306[] { new Class306(new Class356[] { Static610.aClass356_1, Static610.aClass356_5, Static610.aClass356_2 }), new Class306(Static610.aClass356_3) });
			} else {
				this.aClass94_8 = this.aClass95_Sub1_19.method8185(new Class306[] { new Class306(new Class356[] { Static610.aClass356_1, Static610.aClass356_5, Static610.aClass356_4, Static610.aClass356_2 }), new Class306(Static610.aClass356_3) });
			}
			local1319 = 0;
			for (@Pc(1670) int local1670 = 0; local1670 < local104.length; local1670++) {
				if (local104[local1670].anInt914 > 0) {
					local104[local1319++] = local104[local1670];
				}
			}
			this.aClass3_Sub7Array1 = new Class3_Sub7[local1319];
			@Pc(1699) long[] local1699 = new long[local1319];
			for (local1337 = 0; local1337 < local1319; local1337++) {
				@Pc(1707) Class3_Sub7 local1707 = local104[local1337];
				local1699[local1337] = local1707.aLong313;
				this.aClass3_Sub7Array1[local1337] = local1707;
				local1707.method813(this.anInt7914);
			}
			Static439.method5992(this.aClass3_Sub7Array1, local1699);
			if (this.aClass170_2 != null) {
				this.aClass170_2.method3986();
			}
		} else {
			this.aClass170_2 = null;
		}
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray14 = null;
		this.aClass3_Sub7ArrayArrayArray1 = null;
		this.aClass333_32 = null;
		this.anIntArrayArrayArray13 = this.anIntArrayArrayArray15 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
		this.aByteArrayArray23 = null;
		this.anIntArrayArrayArray16 = null;
		this.anIntArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!qq", name = "ka", descriptor = "(III)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > (this.aByteArrayArray23[arg0][arg1] & 0xFF)) {
			this.aByteArrayArray23[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	@Override
	public boolean method7460(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass170_2 == null || arg0 == null) {
			return false;
		} else {
			@Pc(24) int local24 = arg1 - (arg2 * this.aClass95_Sub1_19.anInt10059 >> 8) >> this.aClass95_Sub1_19.anInt10055;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass95_Sub1_19.anInt10061 >> 8) >> this.aClass95_Sub1_19.anInt10055;
			return this.aClass170_2.method3993(arg0, local39, local24);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method7455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
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
			local28[local58] = arg10 == null ? arg9[local60] : arg10[local60];
			if (arg3 != null) {
				local47[local58] = arg3[local74];
			}
			if (arg5 != null) {
				local56[local58] = arg5[local74];
			}
			local58++;
		}
		this.U(arg0, arg1, local13, local47, local18, local56, local23, local28, local33, local38, arg13, arg14, arg15, false);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!uaa;[I)V")
	@Override
	public void method7457(@OriginalArg(0) Class3_Sub13 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass302_52.method6613(new Class3_Sub49(this.aClass95_Sub1_19, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!qq", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (arg5 != null && this.anIntArrayArrayArray14 == null) {
			this.anIntArrayArrayArray14 = new int[super.anInt9149][super.anInt9148][];
		}
		if (arg3 != null && this.anIntArrayArrayArray16 == null) {
			this.anIntArrayArrayArray16 = new int[super.anInt9149][super.anInt9148][];
		}
		@Pc(33) Interface2 local33 = this.aClass95_Sub1_19.anInterface2_12;
		this.anIntArrayArrayArray13[arg0][arg1] = arg2;
		this.anIntArrayArrayArray15[arg0][arg1] = arg4;
		this.anIntArrayArrayArray11[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray14 != null) {
			this.anIntArrayArrayArray14[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray16 != null) {
			this.anIntArrayArrayArray16[arg0][arg1] = arg3;
		}
		@Pc(92) Class3_Sub7[] local92 = this.aClass3_Sub7ArrayArrayArray1[arg0][arg1] = new Class3_Sub7[arg6.length];
		for (@Pc(94) int local94 = 0; local94 < arg6.length; local94++) {
			@Pc(100) int local100 = arg8[local94];
			@Pc(104) int local104 = arg9[local94];
			if ((this.anInt7918 & 0x20) != 0 && local100 != -1 && local33.method8330(local100).aBoolean466) {
				local100 = -1;
				local104 = 128;
			}
			@Pc(145) long local145 = (long) (local104 << 14) | (long) arg11 << 42 | (long) arg12 << 48 | (long) arg10 << 28 | (long) local100;
			@Pc(151) Class3 local151;
			for (local151 = this.aClass333_32.method7489(local145); local151 != null; local151 = this.aClass333_32.method7484()) {
				@Pc(156) Class3_Sub7 local156 = (Class3_Sub7) local151;
				if (local100 == local156.anInt913 && (float) local104 == local156.aFloat8 && arg10 == local156.anInt912 && local156.anInt903 == arg11 && arg12 == local156.anInt910) {
					break;
				}
			}
			if (local151 == null) {
				local92[local94] = new Class3_Sub7(this, local100, local104, arg10, arg11, arg12);
				this.aClass333_32.method7488(local145, local92[local94]);
			} else {
				local92[local94] = (Class3_Sub7) local151;
			}
		}
		if (arg13) {
			this.aByteArrayArray22[arg0][arg1] = (byte) (this.aByteArrayArray22[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt7920) {
			this.anInt7920 = arg6.length;
		}
		this.anInt7921 += arg6.length;
	}

	@OriginalMember(owner = "client!qq", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	@Override
	public void wa(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass170_2 != null && arg0 != null) {
			@Pc(24) int local24 = arg1 - (this.aClass95_Sub1_19.anInt10059 * arg2 >> 8) >> this.aClass95_Sub1_19.anInt10055;
			@Pc(39) int local39 = arg3 - (arg2 * this.aClass95_Sub1_19.anInt10061 >> 8) >> this.aClass95_Sub1_19.anInt10055;
			this.aClass170_2.method3990(local24, arg0, local39);
		}
	}
}
