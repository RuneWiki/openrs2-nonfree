import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class12 {

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "[I")
	private static final int[] anIntArray25 = new int[32768];

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
	private static final int[] anIntArray20;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Lclient!nha;")
	private Class239 aClass239_1;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "Lclient!nha;")
	private Class239 aClass239_2;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "Lclient!nha;")
	private Class239 aClass239_3;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Lclient!nha;")
	private Class239 aClass239_4;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "Lclient!nha;")
	private Class239 aClass239_5;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!nha;")
	private Class239 aClass239_6;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!nha;")
	private Class239 aClass239_7;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!vw;")
	private Class372 aClass372_1;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!nha;")
	private Class239 aClass239_8;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Lclient!nha;")
	private Class239 aClass239_9;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
	private int anInt194 = 100;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
	private final int[] anIntArray23 = new int[5];

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
	private int anInt196 = 0;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
	private final int[] anIntArray21 = new int[5];

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "[I")
	private final int[] anIntArray24 = new int[5];

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	public int anInt195 = 0;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
	public int anInt197 = 500;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray25[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray20 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray20[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
	public int[] method159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static650.method2269(Static13.anIntArray22, 0, arg0);
		if (arg1 < 10) {
			return Static13.anIntArray22;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass239_5.method5683();
		this.aClass239_8.method5683();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass239_9 != null) {
			this.aClass239_9.method5683();
			this.aClass239_4.method5683();
			local24 = (int) ((double) (this.aClass239_9.anInt6629 - this.aClass239_9.anInt6630) * 32.768D / local16);
			local26 = (int) ((double) this.aClass239_9.anInt6630 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass239_7 != null) {
			this.aClass239_7.method5683();
			this.aClass239_1.method5683();
			local63 = (int) ((double) (this.aClass239_7.anInt6629 - this.aClass239_7.anInt6630) * 32.768D / local16);
			local65 = (int) ((double) this.aClass239_7.anInt6630 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray21[local102] != 0) {
				Static13.anIntArray30[local102] = 0;
				Static13.anIntArray29[local102] = (int) ((double) this.anIntArray24[local102] * local16);
				Static13.anIntArray28[local102] = (this.anIntArray21[local102] << 14) / 100;
				Static13.anIntArray26[local102] = (int) ((double) (this.aClass239_5.anInt6629 - this.aClass239_5.anInt6630) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray23[local102]) / local16);
				Static13.anIntArray27[local102] = (int) ((double) this.aClass239_5.anInt6630 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass239_5.method5681(arg0);
			local187 = this.aClass239_8.method5681(arg0);
			if (this.aClass239_9 != null) {
				local195 = this.aClass239_9.method5681(arg0);
				local200 = this.aClass239_4.method5681(arg0);
				local182 += this.method160(local28, local200, this.aClass239_9.anInt6632) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass239_7 != null) {
				local195 = this.aClass239_7.method5681(arg0);
				local200 = this.aClass239_1.method5681(arg0);
				local187 = local187 * ((this.method160(local67, local200, this.aClass239_7.anInt6632) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray21[local195] != 0) {
					local200 = local176 + Static13.anIntArray29[local195];
					if (local200 < arg0) {
						Static13.anIntArray22[local200] += this.method160(Static13.anIntArray30[local195], local187 * Static13.anIntArray28[local195] >> 15, this.aClass239_5.anInt6632);
						Static13.anIntArray30[local195] += (local182 * Static13.anIntArray26[local195] >> 16) + Static13.anIntArray27[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass239_6 != null) {
			this.aClass239_6.method5683();
			this.aClass239_3.method5683();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass239_6.method5681(arg0);
				local352 = this.aClass239_3.method5681(arg0);
				if (local339) {
					local187 = this.aClass239_6.anInt6630 + ((this.aClass239_6.anInt6629 - this.aClass239_6.anInt6630) * local347 >> 8);
				} else {
					local187 = this.aClass239_6.anInt6630 + ((this.aClass239_6.anInt6629 - this.aClass239_6.anInt6630) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static13.anIntArray22[local200] = 0;
				}
			}
		}
		if (this.anInt196 > 0 && this.anInt194 > 0) {
			local182 = (int) ((double) this.anInt196 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static13.anIntArray22[local187] += Static13.anIntArray22[local187 - local182] * this.anInt194 / 100;
			}
		}
		if (this.aClass372_1.anIntArray718[0] > 0 || this.aClass372_1.anIntArray718[1] > 0) {
			this.aClass239_2.method5683();
			local182 = this.aClass239_2.method5681(arg0 + 1);
			local187 = this.aClass372_1.method8661(0, (float) local182 / 65536.0F);
			local195 = this.aClass372_1.method8661(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static13.anIntArray22[local200 + local187] * (long) Static624.anInt10173 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static13.anIntArray22[local200 + local187 - local519 - 1] * (long) Static624.anIntArrayArray111[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static13.anIntArray22[local200 - local549 - 1] * (long) Static624.anIntArrayArray111[1][local549] >> 16);
					}
					Static13.anIntArray22[local200] = local352;
					local182 = this.aClass239_2.method5681(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static13.anIntArray22[local200 + local187] * (long) Static624.anInt10173 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static13.anIntArray22[local200 + local187 - local519 - 1] * (long) Static624.anIntArrayArray111[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static13.anIntArray22[local200 - local549 - 1] * (long) Static624.anIntArrayArray111[1][local549] >> 16);
						}
						Static13.anIntArray22[local200] = local352;
						local182 = this.aClass239_2.method5681(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static13.anIntArray22[local200 + local187 - local519 - 1] * (long) Static624.anIntArrayArray111[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static13.anIntArray22[local200 - local549 - 1] * (long) Static624.anIntArrayArray111[1][local549] >> 16);
							}
							Static13.anIntArray22[local200] = local352;
							this.aClass239_2.method5681(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass372_1.method8661(0, (float) local182 / 65536.0F);
					local195 = this.aClass372_1.method8661(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static13.anIntArray22[local182] < -32768) {
				Static13.anIntArray22[local182] = -32768;
			}
			if (Static13.anIntArray22[local182] > 32767) {
				Static13.anIntArray22[local182] = 32767;
			}
		}
		return Static13.anIntArray22;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)I")
	private int method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray20[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray25[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!sl;)V")
	public void method162(@OriginalArg(0) Class2_Sub17 arg0) {
		this.aClass239_5 = new Class239();
		this.aClass239_5.method5682(arg0);
		this.aClass239_8 = new Class239();
		this.aClass239_8.method5682(arg0);
		@Pc(21) int local21 = arg0.method2859();
		if (local21 != 0) {
			arg0.anInt3378--;
			this.aClass239_9 = new Class239();
			this.aClass239_9.method5682(arg0);
			this.aClass239_4 = new Class239();
			this.aClass239_4.method5682(arg0);
		}
		local21 = arg0.method2859();
		if (local21 != 0) {
			arg0.anInt3378--;
			this.aClass239_7 = new Class239();
			this.aClass239_7.method5682(arg0);
			this.aClass239_1 = new Class239();
			this.aClass239_1.method5682(arg0);
		}
		local21 = arg0.method2859();
		if (local21 != 0) {
			arg0.anInt3378--;
			this.aClass239_6 = new Class239();
			this.aClass239_6.method5682(arg0);
			this.aClass239_3 = new Class239();
			this.aClass239_3.method5682(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method2853();
			if (local114 == 0) {
				break;
			}
			this.anIntArray21[local109] = local114;
			this.anIntArray23[local109] = arg0.method2823();
			this.anIntArray24[local109] = arg0.method2853();
		}
		this.anInt196 = arg0.method2853();
		this.anInt194 = arg0.method2853();
		this.anInt197 = arg0.method2825();
		this.anInt195 = arg0.method2825();
		this.aClass372_1 = new Class372();
		this.aClass239_2 = new Class239();
		this.aClass372_1.method8659(arg0, this.aClass239_2);
	}
}
