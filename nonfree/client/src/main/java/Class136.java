import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class136 {

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "[I")
	private static final int[] anIntArray327 = new int[32768];

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "[I")
	private static final int[] anIntArray329;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!aw;")
	private Class17 aClass17_1;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!aw;")
	private Class17 aClass17_2;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "Lclient!aw;")
	private Class17 aClass17_3;

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "Lclient!aw;")
	private Class17 aClass17_4;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "Lclient!aw;")
	private Class17 aClass17_5;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "Lclient!tj;")
	private Class242 aClass242_1;

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "Lclient!aw;")
	private Class17 aClass17_6;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "Lclient!aw;")
	private Class17 aClass17_7;

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Lclient!aw;")
	private Class17 aClass17_8;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "Lclient!aw;")
	private Class17 aClass17_9;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
	public int anInt4286 = 0;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
	private int anInt4289 = 0;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	public int anInt4288 = 500;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "[I")
	private final int[] anIntArray326 = new int[5];

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "[I")
	private final int[] anIntArray328 = new int[5];

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "[I")
	private final int[] anIntArray330 = new int[5];

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
	private int anInt4287 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray327[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray329 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray329[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)I")
	private int method3700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray329[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray327[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!wn;)V")
	public void method3701(@OriginalArg(0) Class4_Sub20 arg0) {
		this.aClass17_3 = new Class17();
		this.aClass17_3.method310(arg0);
		this.aClass17_9 = new Class17();
		this.aClass17_9.method310(arg0);
		@Pc(21) int local21 = arg0.method4614();
		if (local21 != 0) {
			arg0.anInt5526--;
			this.aClass17_5 = new Class17();
			this.aClass17_5.method310(arg0);
			this.aClass17_2 = new Class17();
			this.aClass17_2.method310(arg0);
		}
		local21 = arg0.method4614();
		if (local21 != 0) {
			arg0.anInt5526--;
			this.aClass17_4 = new Class17();
			this.aClass17_4.method310(arg0);
			this.aClass17_6 = new Class17();
			this.aClass17_6.method310(arg0);
		}
		local21 = arg0.method4614();
		if (local21 != 0) {
			arg0.anInt5526--;
			this.aClass17_7 = new Class17();
			this.aClass17_7.method310(arg0);
			this.aClass17_8 = new Class17();
			this.aClass17_8.method310(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method4575();
			if (local114 == 0) {
				break;
			}
			this.anIntArray326[local109] = local114;
			this.anIntArray330[local109] = arg0.method4619();
			this.anIntArray328[local109] = arg0.method4575();
		}
		this.anInt4289 = arg0.method4575();
		this.anInt4287 = arg0.method4575();
		this.anInt4288 = arg0.method4560();
		this.anInt4286 = arg0.method4560();
		this.aClass242_1 = new Class242();
		this.aClass17_1 = new Class17();
		this.aClass242_1.method5608(arg0, this.aClass17_1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[I")
	public int[] method3702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static474.method3332(Static211.anIntArray331, 0, arg0);
		if (arg1 < 10) {
			return Static211.anIntArray331;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass17_3.method308();
		this.aClass17_9.method308();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass17_5 != null) {
			this.aClass17_5.method308();
			this.aClass17_2.method308();
			local24 = (int) ((double) (this.aClass17_5.anInt373 - this.aClass17_5.anInt371) * 32.768D / local16);
			local26 = (int) ((double) this.aClass17_5.anInt371 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass17_4 != null) {
			this.aClass17_4.method308();
			this.aClass17_6.method308();
			local63 = (int) ((double) (this.aClass17_4.anInt373 - this.aClass17_4.anInt371) * 32.768D / local16);
			local65 = (int) ((double) this.aClass17_4.anInt371 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray326[local102] != 0) {
				Static211.anIntArray334[local102] = 0;
				Static211.anIntArray336[local102] = (int) ((double) this.anIntArray328[local102] * local16);
				Static211.anIntArray333[local102] = (this.anIntArray326[local102] << 14) / 100;
				Static211.anIntArray332[local102] = (int) ((double) (this.aClass17_3.anInt373 - this.aClass17_3.anInt371) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray330[local102]) / local16);
				Static211.anIntArray335[local102] = (int) ((double) this.aClass17_3.anInt371 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass17_3.method311(arg0);
			local187 = this.aClass17_9.method311(arg0);
			if (this.aClass17_5 != null) {
				local195 = this.aClass17_5.method311(arg0);
				local200 = this.aClass17_2.method311(arg0);
				local182 += this.method3700(local28, local200, this.aClass17_5.anInt372) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass17_4 != null) {
				local195 = this.aClass17_4.method311(arg0);
				local200 = this.aClass17_6.method311(arg0);
				local187 = local187 * ((this.method3700(local67, local200, this.aClass17_4.anInt372) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray326[local195] != 0) {
					local200 = local176 + Static211.anIntArray336[local195];
					if (local200 < arg0) {
						Static211.anIntArray331[local200] += this.method3700(Static211.anIntArray334[local195], local187 * Static211.anIntArray333[local195] >> 15, this.aClass17_3.anInt372);
						Static211.anIntArray334[local195] += (local182 * Static211.anIntArray332[local195] >> 16) + Static211.anIntArray335[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass17_7 != null) {
			this.aClass17_7.method308();
			this.aClass17_8.method308();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass17_7.method311(arg0);
				local352 = this.aClass17_8.method311(arg0);
				if (local339) {
					local187 = this.aClass17_7.anInt371 + ((this.aClass17_7.anInt373 - this.aClass17_7.anInt371) * local347 >> 8);
				} else {
					local187 = this.aClass17_7.anInt371 + ((this.aClass17_7.anInt373 - this.aClass17_7.anInt371) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static211.anIntArray331[local200] = 0;
				}
			}
		}
		if (this.anInt4289 > 0 && this.anInt4287 > 0) {
			local182 = (int) ((double) this.anInt4289 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static211.anIntArray331[local187] += Static211.anIntArray331[local187 - local182] * this.anInt4287 / 100;
			}
		}
		if (this.aClass242_1.anIntArray568[0] > 0 || this.aClass242_1.anIntArray568[1] > 0) {
			this.aClass17_1.method308();
			local182 = this.aClass17_1.method311(arg0 + 1);
			local187 = this.aClass242_1.method5606(0, (float) local182 / 65536.0F);
			local195 = this.aClass242_1.method5606(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static211.anIntArray331[local200 + local187] * (long) Static397.anInt7029 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static211.anIntArray331[local200 + local187 - local519 - 1] * (long) Static397.anIntArrayArray53[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static211.anIntArray331[local200 - local549 - 1] * (long) Static397.anIntArrayArray53[1][local549] >> 16);
					}
					Static211.anIntArray331[local200] = local352;
					local182 = this.aClass17_1.method311(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static211.anIntArray331[local200 + local187] * (long) Static397.anInt7029 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static211.anIntArray331[local200 + local187 - local519 - 1] * (long) Static397.anIntArrayArray53[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static211.anIntArray331[local200 - local549 - 1] * (long) Static397.anIntArrayArray53[1][local549] >> 16);
						}
						Static211.anIntArray331[local200] = local352;
						local182 = this.aClass17_1.method311(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static211.anIntArray331[local200 + local187 - local519 - 1] * (long) Static397.anIntArrayArray53[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static211.anIntArray331[local200 - local549 - 1] * (long) Static397.anIntArrayArray53[1][local549] >> 16);
							}
							Static211.anIntArray331[local200] = local352;
							this.aClass17_1.method311(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass242_1.method5606(0, (float) local182 / 65536.0F);
					local195 = this.aClass242_1.method5606(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static211.anIntArray331[local182] < -32768) {
				Static211.anIntArray331[local182] = -32768;
			}
			if (Static211.anIntArray331[local182] > 32767) {
				Static211.anIntArray331[local182] = 32767;
			}
		}
		return Static211.anIntArray331;
	}
}
