import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class40 {

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
	private static final int[] anIntArray159 = new int[32768];

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "[I")
	private static final int[] anIntArray161;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!dd;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!oa;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!dd;")
	private Class20 aClass20_2;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!dd;")
	private Class20 aClass20_3;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "Lclient!dd;")
	private Class20 aClass20_4;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!dd;")
	private Class20 aClass20_5;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!dd;")
	private Class20 aClass20_6;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Lclient!dd;")
	private Class20 aClass20_7;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "Lclient!dd;")
	private Class20 aClass20_8;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "Lclient!dd;")
	private Class20 aClass20_9;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
	private final int[] anIntArray158 = new int[5];

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	private int anInt1645 = 0;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	public int anInt1646 = 0;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	public int anInt1647 = 500;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
	private int anInt1648 = 100;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
	private final int[] anIntArray157 = new int[5];

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[I")
	private final int[] anIntArray160 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray159[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray161 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray161[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I")
	public int[] method1301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static222.method2222(Static70.anIntArray156, 0, arg0);
		if (arg1 < 10) {
			return Static70.anIntArray156;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass20_9.method693();
		this.aClass20_4.method693();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass20_2 != null) {
			this.aClass20_2.method693();
			this.aClass20_1.method693();
			local24 = (int) ((double) (this.aClass20_2.anInt873 - this.aClass20_2.anInt876) * 32.768D / local16);
			local26 = (int) ((double) this.aClass20_2.anInt876 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass20_8 != null) {
			this.aClass20_8.method693();
			this.aClass20_3.method693();
			local63 = (int) ((double) (this.aClass20_8.anInt873 - this.aClass20_8.anInt876) * 32.768D / local16);
			local65 = (int) ((double) this.aClass20_8.anInt876 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray157[local102] != 0) {
				Static70.anIntArray166[local102] = 0;
				Static70.anIntArray165[local102] = (int) ((double) this.anIntArray158[local102] * local16);
				Static70.anIntArray164[local102] = (this.anIntArray157[local102] << 14) / 100;
				Static70.anIntArray163[local102] = (int) ((double) (this.aClass20_9.anInt873 - this.aClass20_9.anInt876) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray160[local102]) / local16);
				Static70.anIntArray162[local102] = (int) ((double) this.aClass20_9.anInt876 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass20_9.method695(arg0);
			local187 = this.aClass20_4.method695(arg0);
			if (this.aClass20_2 != null) {
				local195 = this.aClass20_2.method695(arg0);
				local200 = this.aClass20_1.method695(arg0);
				local182 += this.method1303(local28, local200, this.aClass20_2.anInt874) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass20_8 != null) {
				local195 = this.aClass20_8.method695(arg0);
				local200 = this.aClass20_3.method695(arg0);
				local187 = local187 * ((this.method1303(local67, local200, this.aClass20_8.anInt874) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray157[local195] != 0) {
					local200 = local176 + Static70.anIntArray165[local195];
					if (local200 < arg0) {
						Static70.anIntArray156[local200] += this.method1303(Static70.anIntArray166[local195], local187 * Static70.anIntArray164[local195] >> 15, this.aClass20_9.anInt874);
						Static70.anIntArray166[local195] += (local182 * Static70.anIntArray163[local195] >> 16) + Static70.anIntArray162[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass20_6 != null) {
			this.aClass20_6.method693();
			this.aClass20_5.method693();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass20_6.method695(arg0);
				local352 = this.aClass20_5.method695(arg0);
				if (local339) {
					local187 = this.aClass20_6.anInt876 + ((this.aClass20_6.anInt873 - this.aClass20_6.anInt876) * local347 >> 8);
				} else {
					local187 = this.aClass20_6.anInt876 + ((this.aClass20_6.anInt873 - this.aClass20_6.anInt876) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static70.anIntArray156[local200] = 0;
				}
			}
		}
		if (this.anInt1645 > 0 && this.anInt1648 > 0) {
			local182 = (int) ((double) this.anInt1645 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static70.anIntArray156[local187] += Static70.anIntArray156[local187 - local182] * this.anInt1648 / 100;
			}
		}
		if (this.aClass68_1.anIntArray287[0] > 0 || this.aClass68_1.anIntArray287[1] > 0) {
			this.aClass20_7.method693();
			local182 = this.aClass20_7.method695(arg0 + 1);
			local187 = this.aClass68_1.method2217(0, (float) local182 / 65536.0F);
			local195 = this.aClass68_1.method2217(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static70.anIntArray156[local200 + local187] * (long) Static134.anInt2883 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static70.anIntArray156[local200 + local187 - local519 - 1] * (long) Static134.anIntArrayArray21[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static70.anIntArray156[local200 - local549 - 1] * (long) Static134.anIntArrayArray21[1][local549] >> 16);
					}
					Static70.anIntArray156[local200] = local352;
					local182 = this.aClass20_7.method695(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static70.anIntArray156[local200 + local187] * (long) Static134.anInt2883 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static70.anIntArray156[local200 + local187 - local519 - 1] * (long) Static134.anIntArrayArray21[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static70.anIntArray156[local200 - local549 - 1] * (long) Static134.anIntArrayArray21[1][local549] >> 16);
						}
						Static70.anIntArray156[local200] = local352;
						local182 = this.aClass20_7.method695(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static70.anIntArray156[local200 + local187 - local519 - 1] * (long) Static134.anIntArrayArray21[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static70.anIntArray156[local200 - local549 - 1] * (long) Static134.anIntArrayArray21[1][local549] >> 16);
							}
							Static70.anIntArray156[local200] = local352;
							this.aClass20_7.method695(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass68_1.method2217(0, (float) local182 / 65536.0F);
					local195 = this.aClass68_1.method2217(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static70.anIntArray156[local182] < -32768) {
				Static70.anIntArray156[local182] = -32768;
			}
			if (Static70.anIntArray156[local182] > 32767) {
				Static70.anIntArray156[local182] = 32767;
			}
		}
		return Static70.anIntArray156;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ra;)V")
	public void method1302(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass20_9 = new Class20();
		this.aClass20_9.method694(arg0);
		this.aClass20_4 = new Class20();
		this.aClass20_4.method694(arg0);
		@Pc(21) int local21 = arg0.method260();
		if (local21 != 0) {
			arg0.anInt340--;
			this.aClass20_2 = new Class20();
			this.aClass20_2.method694(arg0);
			this.aClass20_1 = new Class20();
			this.aClass20_1.method694(arg0);
		}
		local21 = arg0.method260();
		if (local21 != 0) {
			arg0.anInt340--;
			this.aClass20_8 = new Class20();
			this.aClass20_8.method694(arg0);
			this.aClass20_3 = new Class20();
			this.aClass20_3.method694(arg0);
		}
		local21 = arg0.method260();
		if (local21 != 0) {
			arg0.anInt340--;
			this.aClass20_6 = new Class20();
			this.aClass20_6.method694(arg0);
			this.aClass20_5 = new Class20();
			this.aClass20_5.method694(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method232();
			if (local114 == 0) {
				break;
			}
			this.anIntArray157[local109] = local114;
			this.anIntArray160[local109] = arg0.method241();
			this.anIntArray158[local109] = arg0.method232();
		}
		this.anInt1645 = arg0.method232();
		this.anInt1648 = arg0.method232();
		this.anInt1647 = arg0.method269();
		this.anInt1646 = arg0.method269();
		this.aClass68_1 = new Class68();
		this.aClass20_7 = new Class20();
		this.aClass68_1.method2219(arg0, this.aClass20_7);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)I")
	private int method1303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray161[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray159[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}
