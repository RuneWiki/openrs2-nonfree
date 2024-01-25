import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!na", name = "q", descriptor = "I")
	private int anInt6166;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!tw;")
	private final Class1_Sub24 aClass1_Sub24_2;

	@OriginalMember(owner = "client!na", name = "F", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_12;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "Lclient!ida;")
	private final Class129_Sub2 aClass129_Sub2_3;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "I")
	private final int anInt6173;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "I")
	private final int anInt6175;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "I")
	private final int anInt6167;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	private final int anInt6165;

	@OriginalMember(owner = "client!na", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!na", name = "x", descriptor = "I")
	private int anInt6169;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!jea;")
	private final Interface13 anInterface13_5;

	@OriginalMember(owner = "client!na", name = "w", descriptor = "Lclient!vc;")
	private final Interface23 anInterface23_10;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "Lclient!faa;")
	private Class91 aClass91_27;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!na", name = "y", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!nv;Lclient!ida;Lclient!tw;[I)V")
	public Class1_Sub35(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class129_Sub2 arg1, @OriginalArg(2) Class1_Sub24 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub24_2 = arg2;
		this.aClass78_Sub1_12 = arg0;
		this.aClass129_Sub2_3 = arg1;
		@Pc(22) int local22 = this.aClass1_Sub24_2.method7610() - (arg1.anInt8060 >> 1);
		this.anInt6173 = this.aClass1_Sub24_2.method7609() - local22 >> arg1.anInt8066;
		this.anInt6175 = local22 + this.aClass1_Sub24_2.method7609() >> arg1.anInt8066;
		this.anInt6167 = this.aClass1_Sub24_2.method7608() - local22 >> arg1.anInt8066;
		this.anInt6165 = local22 + this.aClass1_Sub24_2.method7608() >> arg1.anInt8066;
		@Pc(76) int local76 = this.anInt6175 + 1 - this.anInt6173;
		@Pc(85) int local85 = this.anInt6165 + 1 - this.anInt6167;
		this.aFloatArrayArray9 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray10 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray8 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(135) int local135;
		@Pc(142) int local142;
		@Pc(174) int local174;
		@Pc(191) int local191;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt6167 + local114;
			if (local121 > 0 && local121 < this.aClass129_Sub2_3.anInt8058 - 1) {
				for (local135 = 0; local135 <= local76; local135++) {
					local142 = this.anInt6173 + local135;
					if (local142 > 0 && local142 < this.aClass129_Sub2_3.anInt8065 - 1) {
						local174 = arg1.method6481(local121, local142 + 1) - arg1.method6481(local121, local142 - 1);
						local191 = arg1.method6481(local121 + 1, local142) - arg1.method6481(local121 - 1, local142);
						@Pc(206) float local206 = (float) (1.0D / Math.sqrt((double) (local174 * local174 + local191 * local191 + 65536)));
						this.aFloatArrayArray10[local135][local114] = local206 * (float) local174;
						this.aFloatArrayArray9[local135][local114] = local206 * -256.0F;
						this.aFloatArrayArray8[local135][local114] = (float) local191 * local206;
					}
				}
			}
		}
		local121 = 0;
		@Pc(312) int local312;
		for (local135 = this.anInt6167; local135 <= this.anInt6165; local135++) {
			if (local135 >= 0 && local135 < arg1.anInt8058) {
				for (local142 = this.anInt6173; local142 <= this.anInt6175; local142++) {
					if (local142 >= 0 && arg1.anInt8065 > local142) {
						local174 = arg3[local121];
						@Pc(303) int[] local303 = arg1.anIntArrayArrayArray12[local142][local135];
						if (local303 != null && local174 != 0) {
							if (local174 == 1) {
								local312 = 0;
								while (local303.length > local312) {
									if (local303[local312++] != -1 && local303[local312++] != -1 && local303[local312++] != -1) {
										this.anInt6169 += 3;
									}
								}
							} else {
								this.anInt6169 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt6175 - this.anInt6173;
			}
		}
		if (this.anInt6169 <= 0) {
			this.anInterface13_5 = null;
			this.anInterface23_10 = null;
		} else {
			this.aClass91_27 = new Class91(Static122.method2187(this.anInt6169));
			this.anInterface13_5 = this.aClass78_Sub1_12.method6980(false);
			this.anInterface13_5.method5600(this.anInt6169);
			@Pc(420) NativeHeapBuffer local420 = this.aClass78_Sub1_12.method6891(false, this.anInt6169 * 16);
			this.aStream6 = new Stream(local420);
			while (true) {
				@Pc(432) Buffer local432;
				do {
					local432 = this.anInterface13_5.method5603();
				} while (local432 == null);
				this.aStream5 = new Stream(local432);
				local121 = 0;
				local191 = 0;
				for (local312 = this.anInt6167; local312 <= this.anInt6165; local312++) {
					if (local312 >= 0 && arg1.anInt8058 > local312) {
						@Pc(460) int local460 = 0;
						for (@Pc(463) int local463 = this.anInt6173; local463 <= this.anInt6175; local463++) {
							if (local463 >= 0 && local463 < arg1.anInt8065) {
								@Pc(475) int local475 = arg3[local121];
								@Pc(482) int[] local482 = arg1.anIntArrayArrayArray12[local463][local312];
								if (local482 != null && local475 != 0) {
									if (local475 == 1) {
										@Pc(642) int[] local642 = arg1.anIntArrayArrayArray10[local463][local312];
										@Pc(649) int[] local649 = arg1.anIntArrayArrayArray7[local463][local312];
										@Pc(651) int local651 = 0;
										label118: while (true) {
											while (true) {
												if (local482.length <= local651) {
													break label118;
												}
												if (local482[local651] == -1 || local482[local651 + 1] == -1 || local482[local651 + 2] == -1) {
													local651 += 3;
												} else {
													this.method5014(local191, local649[local651], local642[local651], local312, local463, local460);
													local651++;
													this.method5014(local191, local649[local651], local642[local651], local312, local463, local460);
													local651++;
													this.method5014(local191, local649[local651], local642[local651], local312, local463, local460);
													local651++;
												}
											}
										}
									} else if (local475 == 3) {
										this.method5014(local191, 0, 0, local312, local463, local460);
										this.method5014(local191, 0, arg1.anInt8060, local312, local463, local460);
										this.method5014(local191, arg1.anInt8060, 0, local312, local463, local460);
									} else if (local475 == 2) {
										this.method5014(local191, 0, arg1.anInt8060, local312, local463, local460);
										this.method5014(local191, arg1.anInt8060, arg1.anInt8060, local312, local463, local460);
										this.method5014(local191, 0, 0, local312, local463, local460);
									} else if (local475 == 5) {
										this.method5014(local191, arg1.anInt8060, arg1.anInt8060, local312, local463, local460);
										this.method5014(local191, arg1.anInt8060, 0, local312, local463, local460);
										this.method5014(local191, 0, arg1.anInt8060, local312, local463, local460);
									} else if (local475 == 4) {
										this.method5014(local191, arg1.anInt8060, 0, local312, local463, local460);
										this.method5014(local191, 0, 0, local312, local463, local460);
										this.method5014(local191, arg1.anInt8060, arg1.anInt8060, local312, local463, local460);
									}
								}
							}
							local121++;
							local460++;
						}
					} else {
						local121 += this.anInt6175 - this.anInt6173;
					}
					local191++;
				}
				this.aStream5.a();
				if (this.anInterface13_5.method5602()) {
					this.aStream6.a();
					this.anInterface23_10 = this.aClass78_Sub1_12.method6927(false);
					this.anInterface23_10.method5571(local420, 16, this.anInt6166 * 16);
					break;
				}
				this.aStream6.d(0);
				this.aClass91_27.method2275();
			}
		}
		this.aStream6 = null;
		this.aClass91_27 = null;
		this.aStream5 = null;
		this.aFloatArrayArray10 = this.aFloatArrayArray9 = this.aFloatArrayArray8 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZI)V")
	public void method5010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface13_5 == null || (this.anInt6173 > arg0 + arg2 || (arg0 - arg2 > this.anInt6175 || (arg1 + arg2 < this.anInt6167 || this.anInt6165 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt6167; local55 <= this.anInt6165; local55++) {
			for (@Pc(62) int local62 = this.anInt6173; local62 <= this.anInt6175; local62++) {
				@Pc(69) int local69 = local62 - arg0;
				@Pc(74) int local74 = local55 - arg1;
				if (local69 > -arg2 && local69 < arg2 && local74 > -arg2 && arg2 > local74 && arg3[arg2 + local69][arg2 + local74]) {
					this.aClass78_Sub1_12.method6858((byte) (this.aClass1_Sub24_2.method7615() * 255.0F));
					this.aClass78_Sub1_12.method6965(this.anInterface23_10, 0);
					this.aClass78_Sub1_12.method6941(this.aClass78_Sub1_12.aClass185_15);
					this.aClass78_Sub1_12.method6947(Static302.aClass77_5, this.anInt6166, 0, this.anInt6169 / 3, 0, this.anInterface13_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(SI)V")
	private void method5012(@OriginalArg(0) short arg0) {
		if (Stream.b()) {
			this.aStream5.b(arg0);
		} else {
			this.aStream5.c(arg0);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
	private void method5014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(22) int local22 = arg2 + (arg4 << this.aClass129_Sub2_3.anInt8066);
		@Pc(30) int local30 = (arg3 << this.aClass129_Sub2_3.anInt8066) + arg1;
		@Pc(37) int local37 = this.aClass129_Sub2_3.method6480(local30, local22);
		if ((arg2 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local22 & 0xFFFFL | ((long) local30 & 0xFFFFL) << 16;
			@Pc(69) Class1 local69 = this.aClass91_27.method2271(local7);
			if (local69 != null) {
				this.method5012(((Class1_Sub47) local69).aShort114);
				return;
			}
		}
		@Pc(89) short local89 = (short) this.anInt6166++;
		if (local7 != -1L) {
			this.aClass91_27.method2269(local7, new Class1_Sub47(local89));
		}
		@Pc(137) float local137;
		@Pc(146) float local146;
		@Pc(128) float local128;
		@Pc(212) float local212;
		@Pc(220) float local220;
		@Pc(227) float local227;
		@Pc(234) float local234;
		@Pc(241) float local241;
		@Pc(250) float local250;
		@Pc(259) float local259;
		@Pc(284) float local284;
		if (arg2 == 0 && arg1 == 0) {
			local137 = this.aFloatArrayArray10[arg5][arg0];
			local128 = this.aFloatArrayArray8[arg5][arg0];
			local146 = this.aFloatArrayArray9[arg5][arg0];
		} else if (this.aClass129_Sub2_3.anInt8060 == arg2 && arg1 == 0) {
			local128 = this.aFloatArrayArray8[arg5 + 1][arg0];
			local137 = this.aFloatArrayArray10[arg5 + 1][arg0];
			local146 = this.aFloatArrayArray9[arg5 + 1][arg0];
		} else if (arg2 == this.aClass129_Sub2_3.anInt8060 && arg1 == this.aClass129_Sub2_3.anInt8060) {
			local146 = this.aFloatArrayArray9[arg5 + 1][arg0 + 1];
			local128 = this.aFloatArrayArray8[arg5 + 1][arg0 + 1];
			local137 = this.aFloatArrayArray10[arg5 + 1][arg0 + 1];
		} else if (arg2 == 0 && arg1 == this.aClass129_Sub2_3.anInt8060) {
			local146 = this.aFloatArrayArray9[arg5][arg0 + 1];
			local128 = this.aFloatArrayArray8[arg5][arg0 + 1];
			local137 = this.aFloatArrayArray10[arg5][arg0 + 1];
		} else {
			local212 = (float) arg2 / (float) this.aClass129_Sub2_3.anInt8060;
			local220 = (float) arg1 / (float) this.aClass129_Sub2_3.anInt8060;
			local227 = this.aFloatArrayArray10[arg5][arg0];
			local234 = this.aFloatArrayArray9[arg5][arg0];
			local241 = this.aFloatArrayArray8[arg5][arg0];
			local250 = this.aFloatArrayArray10[arg5 + 1][arg0];
			local259 = this.aFloatArrayArray9[arg5 + 1][arg0];
			@Pc(275) float local275 = local227 + (this.aFloatArrayArray10[arg5][arg0 + 1] - local227) * local212;
			local284 = this.aFloatArrayArray8[arg5 + 1][arg0];
			@Pc(301) float local301 = local259 + local212 * (this.aFloatArrayArray9[arg5 + 1][arg0 + 1] - local259);
			@Pc(316) float local316 = local241 + (this.aFloatArrayArray8[arg5][arg0 + 1] - local241) * local212;
			@Pc(333) float local333 = local250 + local212 * (this.aFloatArrayArray10[arg5 + 1][arg0 + 1] - local250);
			@Pc(349) float local349 = local234 + (this.aFloatArrayArray9[arg5][arg0 + 1] - local234) * local212;
			local137 = (local333 - local275) * local220 + local275;
			local146 = local220 * (local301 - local349) + local349;
			@Pc(384) float local384 = local284 + local212 * (this.aFloatArrayArray8[arg5 + 1][arg0 + 1] - local284);
			local128 = (local384 - local316) * local220 + local316;
		}
		local212 = this.aClass1_Sub24_2.method7609() - local22;
		local220 = this.aClass1_Sub24_2.method7612() - local37;
		local227 = this.aClass1_Sub24_2.method7608() - local30;
		local234 = (float) Math.sqrt((double) (local212 * local212 + local220 * local220 + local227 * local227));
		local241 = 1.0F / local234;
		local212 *= local241;
		local227 *= local241;
		local220 *= local241;
		local250 = local234 / (float) this.aClass1_Sub24_2.method7610();
		local259 = 1.0F - local250 * local250;
		if (local259 < 0.0F) {
			local259 = 0.0F;
		}
		local284 = local227 * local128 + local220 * local146 + local212 * local137;
		if (local284 < 0.0F) {
			local284 = 0.0F;
		}
		@Pc(549) float local549 = local259 * local284 * 2.0F;
		if (local549 > 1.0F) {
			local549 = 1.0F;
		}
		@Pc(560) int local560 = this.aClass1_Sub24_2.method7613();
		@Pc(570) int local570 = (int) ((float) (local560 >> 16 & 0xFF) * local549);
		if (local570 > 255) {
			local570 = 255;
		}
		@Pc(585) int local585 = (int) (local549 * (float) (local560 >> 8 & 0xFF));
		if (local585 > 255) {
			local585 = 255;
		}
		@Pc(598) int local598 = (int) (local549 * (float) (local560 & 0xFF));
		if (local598 > 255) {
			local598 = 255;
		}
		if (Stream.b()) {
			this.aStream6.b((float) local22);
			this.aStream6.b((float) local37);
			this.aStream6.b((float) local30);
		} else {
			this.aStream6.a((float) local22);
			this.aStream6.a((float) local37);
			this.aStream6.a((float) local30);
		}
		if (this.aClass78_Sub1_12.anInt8568 == 0) {
			this.aStream6.e(local598);
			this.aStream6.e(local585);
			this.aStream6.e(local570);
		} else {
			this.aStream6.e(local570);
			this.aStream6.e(local585);
			this.aStream6.e(local598);
		}
		this.aStream6.e(255);
		this.method5012(local89);
	}
}
