import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class277 {

	@OriginalMember(owner = "client!os", name = "y", descriptor = "[I")
	private static final int[] anIntArray448 = new int[32768];

	@OriginalMember(owner = "client!os", name = "i", descriptor = "[I")
	private static final int[] anIntArray445;

	@OriginalMember(owner = "client!os", name = "p", descriptor = "Lclient!ua;")
	private Class361 aClass361_1;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "Lclient!sca;")
	private Class332 aClass332_1;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "Lclient!ua;")
	private Class361 aClass361_2;

	@OriginalMember(owner = "client!os", name = "e", descriptor = "Lclient!ua;")
	private Class361 aClass361_3;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "Lclient!ua;")
	private Class361 aClass361_4;

	@OriginalMember(owner = "client!os", name = "u", descriptor = "Lclient!ua;")
	private Class361 aClass361_5;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "Lclient!ua;")
	private Class361 aClass361_6;

	@OriginalMember(owner = "client!os", name = "r", descriptor = "Lclient!ua;")
	private Class361 aClass361_7;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "Lclient!ua;")
	private Class361 aClass361_8;

	@OriginalMember(owner = "client!os", name = "q", descriptor = "Lclient!ua;")
	private Class361 aClass361_9;

	@OriginalMember(owner = "client!os", name = "x", descriptor = "[I")
	private final int[] anIntArray446 = new int[5];

	@OriginalMember(owner = "client!os", name = "h", descriptor = "I")
	private int anInt8235 = 0;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "[I")
	private final int[] anIntArray447 = new int[5];

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	public int anInt8237 = 500;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "[I")
	private final int[] anIntArray452 = new int[5];

	@OriginalMember(owner = "client!os", name = "b", descriptor = "I")
	public int anInt8236 = 0;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "I")
	private int anInt8238 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray448[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray445 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray445[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)I")
	private int method6929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray445[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray448[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!rba;)V")
	public void method6930(@OriginalArg(0) Class3_Sub28 arg0) {
		this.aClass361_5 = new Class361();
		this.aClass361_5.method8569(arg0);
		this.aClass361_2 = new Class361();
		this.aClass361_2.method8569(arg0);
		@Pc(21) int local21 = arg0.method5322(-73);
		if (local21 != 0) {
			arg0.anInt6241--;
			this.aClass361_9 = new Class361();
			this.aClass361_9.method8569(arg0);
			this.aClass361_4 = new Class361();
			this.aClass361_4.method8569(arg0);
		}
		local21 = arg0.method5322(-93);
		if (local21 != 0) {
			arg0.anInt6241--;
			this.aClass361_7 = new Class361();
			this.aClass361_7.method8569(arg0);
			this.aClass361_3 = new Class361();
			this.aClass361_3.method8569(arg0);
		}
		local21 = arg0.method5322(-21);
		if (local21 != 0) {
			arg0.anInt6241--;
			this.aClass361_1 = new Class361();
			this.aClass361_1.method8569(arg0);
			this.aClass361_6 = new Class361();
			this.aClass361_6.method8569(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method5331();
			if (local114 == 0) {
				break;
			}
			this.anIntArray452[local109] = local114;
			this.anIntArray446[local109] = arg0.method5285();
			this.anIntArray447[local109] = arg0.method5331();
		}
		this.anInt8235 = arg0.method5331();
		this.anInt8238 = arg0.method5331();
		this.anInt8237 = arg0.method5272();
		this.anInt8236 = arg0.method5272();
		this.aClass332_1 = new Class332();
		this.aClass361_8 = new Class361();
		this.aClass332_1.method7950(arg0, this.aClass361_8);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)[I")
	public int[] method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static735.method9188(Static468.anIntArray444, 0, arg0);
		if (arg1 < 10) {
			return Static468.anIntArray444;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass361_5.method8568();
		this.aClass361_2.method8568();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass361_9 != null) {
			this.aClass361_9.method8568();
			this.aClass361_4.method8568();
			local24 = (int) ((double) (this.aClass361_9.anInt10230 - this.aClass361_9.anInt10229) * 32.768D / local16);
			local26 = (int) ((double) this.aClass361_9.anInt10229 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass361_7 != null) {
			this.aClass361_7.method8568();
			this.aClass361_3.method8568();
			local63 = (int) ((double) (this.aClass361_7.anInt10230 - this.aClass361_7.anInt10229) * 32.768D / local16);
			local65 = (int) ((double) this.aClass361_7.anInt10229 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray452[local102] != 0) {
				Static468.anIntArray451[local102] = 0;
				Static468.anIntArray449[local102] = (int) ((double) this.anIntArray447[local102] * local16);
				Static468.anIntArray453[local102] = (this.anIntArray452[local102] << 14) / 100;
				Static468.anIntArray454[local102] = (int) ((double) (this.aClass361_5.anInt10230 - this.aClass361_5.anInt10229) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray446[local102]) / local16);
				Static468.anIntArray450[local102] = (int) ((double) this.aClass361_5.anInt10229 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass361_5.method8570(arg0);
			local187 = this.aClass361_2.method8570(arg0);
			if (this.aClass361_9 != null) {
				local195 = this.aClass361_9.method8570(arg0);
				local200 = this.aClass361_4.method8570(arg0);
				local182 += this.method6929(local28, local200, this.aClass361_9.anInt10228) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass361_7 != null) {
				local195 = this.aClass361_7.method8570(arg0);
				local200 = this.aClass361_3.method8570(arg0);
				local187 = local187 * ((this.method6929(local67, local200, this.aClass361_7.anInt10228) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray452[local195] != 0) {
					local200 = local176 + Static468.anIntArray449[local195];
					if (local200 < arg0) {
						Static468.anIntArray444[local200] += this.method6929(Static468.anIntArray451[local195], local187 * Static468.anIntArray453[local195] >> 15, this.aClass361_5.anInt10228);
						Static468.anIntArray451[local195] += (local182 * Static468.anIntArray454[local195] >> 16) + Static468.anIntArray450[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass361_1 != null) {
			this.aClass361_1.method8568();
			this.aClass361_6.method8568();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass361_1.method8570(arg0);
				local352 = this.aClass361_6.method8570(arg0);
				if (local339) {
					local187 = this.aClass361_1.anInt10229 + ((this.aClass361_1.anInt10230 - this.aClass361_1.anInt10229) * local347 >> 8);
				} else {
					local187 = this.aClass361_1.anInt10229 + ((this.aClass361_1.anInt10230 - this.aClass361_1.anInt10229) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static468.anIntArray444[local200] = 0;
				}
			}
		}
		if (this.anInt8235 > 0 && this.anInt8238 > 0) {
			local182 = (int) ((double) this.anInt8235 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static468.anIntArray444[local187] += Static468.anIntArray444[local187 - local182] * this.anInt8238 / 100;
			}
		}
		if (this.aClass332_1.anIntArray525[0] > 0 || this.aClass332_1.anIntArray525[1] > 0) {
			this.aClass361_8.method8568();
			local182 = this.aClass361_8.method8570(arg0 + 1);
			local187 = this.aClass332_1.method7948(0, (float) local182 / 65536.0F);
			local195 = this.aClass332_1.method7948(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static468.anIntArray444[local200 + local187] * (long) Static574.anInt9434 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static468.anIntArray444[local200 + local187 - local519 - 1] * (long) Static574.anIntArrayArray52[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static468.anIntArray444[local200 - local549 - 1] * (long) Static574.anIntArrayArray52[1][local549] >> 16);
					}
					Static468.anIntArray444[local200] = local352;
					local182 = this.aClass361_8.method8570(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static468.anIntArray444[local200 + local187] * (long) Static574.anInt9434 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static468.anIntArray444[local200 + local187 - local519 - 1] * (long) Static574.anIntArrayArray52[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static468.anIntArray444[local200 - local549 - 1] * (long) Static574.anIntArrayArray52[1][local549] >> 16);
						}
						Static468.anIntArray444[local200] = local352;
						local182 = this.aClass361_8.method8570(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static468.anIntArray444[local200 + local187 - local519 - 1] * (long) Static574.anIntArrayArray52[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static468.anIntArray444[local200 - local549 - 1] * (long) Static574.anIntArrayArray52[1][local549] >> 16);
							}
							Static468.anIntArray444[local200] = local352;
							this.aClass361_8.method8570(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass332_1.method7948(0, (float) local182 / 65536.0F);
					local195 = this.aClass332_1.method7948(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static468.anIntArray444[local182] < -32768) {
				Static468.anIntArray444[local182] = -32768;
			}
			if (Static468.anIntArray444[local182] > 32767) {
				Static468.anIntArray444[local182] = 32767;
			}
		}
		return Static468.anIntArray444;
	}
}
