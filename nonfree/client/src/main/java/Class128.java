import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class128 {

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "[I")
	public static int[] anIntArray325 = new int[32768];

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "[I")
	public static int[] anIntArray329;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Lclient!pj;")
	private Class133 aClass133_1;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!pj;")
	private Class133 aClass133_2;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!pj;")
	private Class133 aClass133_3;

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!pj;")
	private Class133 aClass133_4;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!fh;")
	private Class49 aClass49_1;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Lclient!pj;")
	private Class133 aClass133_5;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!pj;")
	private Class133 aClass133_6;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Lclient!pj;")
	private Class133 aClass133_7;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "Lclient!pj;")
	private Class133 aClass133_8;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Lclient!pj;")
	private Class133 aClass133_9;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	private int anInt3882 = 0;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
	private int[] anIntArray328 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
	public int anInt3883 = 500;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "[I")
	private int[] anIntArray326 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	public int anInt3884 = 0;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
	private int[] anIntArray330 = new int[] { 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
	private int anInt3885 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		@Pc(9) int local9;
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray325[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray329 = new int[32768];
		for (local9 = 0; local9 < 32768; local9++) {
			anIntArray329[local9] = (int) (Math.sin((double) local9 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I")
	private int method3086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray329[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray325[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[I")
	public int[] method3087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static307.method3246(Static199.anIntArray327, 0, arg0);
		if (arg1 < 10) {
			return Static199.anIntArray327;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass133_4.method3266();
		this.aClass133_8.method3266();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass133_1 != null) {
			this.aClass133_1.method3266();
			this.aClass133_2.method3266();
			local24 = (int) ((double) (this.aClass133_1.anInt4004 - this.aClass133_1.anInt4005) * 32.768D / local16);
			local26 = (int) ((double) this.aClass133_1.anInt4005 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass133_9 != null) {
			this.aClass133_9.method3266();
			this.aClass133_7.method3266();
			local63 = (int) ((double) (this.aClass133_9.anInt4004 - this.aClass133_9.anInt4005) * 32.768D / local16);
			local65 = (int) ((double) this.aClass133_9.anInt4005 * 32.768D / local16);
		}
		@Pc(102) int local102;
		for (local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray330[local102] != 0) {
				Static199.anIntArray332[local102] = 0;
				Static199.anIntArray335[local102] = (int) ((double) this.anIntArray328[local102] * local16);
				Static199.anIntArray331[local102] = (this.anIntArray330[local102] << 14) / 100;
				Static199.anIntArray333[local102] = (int) ((double) (this.aClass133_4.anInt4004 - this.aClass133_4.anInt4005) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray326[local102]) / local16);
				Static199.anIntArray334[local102] = (int) ((double) this.aClass133_4.anInt4005 * 32.768D / local16);
			}
		}
		@Pc(185) int local185;
		@Pc(190) int local190;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (local102 = 0; local102 < arg0; local102++) {
			local185 = this.aClass133_4.method3265(arg0);
			local190 = this.aClass133_8.method3265(arg0);
			if (this.aClass133_1 != null) {
				local198 = this.aClass133_1.method3265(arg0);
				local203 = this.aClass133_2.method3265(arg0);
				local185 += this.method3086(local28, local203, this.aClass133_1.anInt4006) >> 1;
				local28 += (local198 * local24 >> 16) + local26;
			}
			if (this.aClass133_9 != null) {
				local198 = this.aClass133_9.method3265(arg0);
				local203 = this.aClass133_7.method3265(arg0);
				local190 = local190 * ((this.method3086(local67, local203, this.aClass133_9.anInt4006) >> 1) + 32768) >> 15;
				local67 += (local198 * local63 >> 16) + local65;
			}
			for (local198 = 0; local198 < 5; local198++) {
				if (this.anIntArray330[local198] != 0) {
					local203 = local102 + Static199.anIntArray335[local198];
					if (local203 < arg0) {
						Static199.anIntArray327[local203] += this.method3086(Static199.anIntArray332[local198], local190 * Static199.anIntArray331[local198] >> 15, this.aClass133_4.anInt4006);
						Static199.anIntArray332[local198] += (local185 * Static199.anIntArray333[local198] >> 16) + Static199.anIntArray334[local198];
					}
				}
			}
		}
		@Pc(356) int local356;
		if (this.aClass133_5 != null) {
			this.aClass133_5.method3266();
			this.aClass133_3.method3266();
			local102 = 0;
			@Pc(341) boolean local341 = true;
			for (local198 = 0; local198 < arg0; local198++) {
				local203 = this.aClass133_5.method3265(arg0);
				local356 = this.aClass133_3.method3265(arg0);
				if (local341) {
					local185 = this.aClass133_5.anInt4005 + ((this.aClass133_5.anInt4004 - this.aClass133_5.anInt4005) * local203 >> 8);
				} else {
					local185 = this.aClass133_5.anInt4005 + ((this.aClass133_5.anInt4004 - this.aClass133_5.anInt4005) * local356 >> 8);
				}
				local102 += 256;
				if (local102 >= local185) {
					local102 = 0;
					local341 = !local341;
				}
				if (local341) {
					Static199.anIntArray327[local198] = 0;
				}
			}
		}
		if (this.anInt3882 > 0 && this.anInt3885 > 0) {
			local102 = (int) ((double) this.anInt3882 * local16);
			for (local185 = local102; local185 < arg0; local185++) {
				Static199.anIntArray327[local185] += Static199.anIntArray327[local185 - local102] * this.anInt3885 / 100;
			}
		}
		if (this.aClass49_1.anIntArray163[0] > 0 || this.aClass49_1.anIntArray163[1] > 0) {
			this.aClass133_6.method3266();
			local102 = this.aClass133_6.method3265(arg0 + 1);
			local185 = this.aClass49_1.method1212(0, (float) local102 / 65536.0F);
			local190 = this.aClass49_1.method1212(1, (float) local102 / 65536.0F);
			if (arg0 >= local185 + local190) {
				local198 = 0;
				local203 = local190;
				if (local190 > arg0 - local185) {
					local203 = arg0 - local185;
				}
				@Pc(523) int local523;
				while (local198 < local203) {
					local356 = (int) ((long) Static199.anIntArray327[local198 + local185] * (long) Static78.anInt1507 >> 16);
					for (local523 = 0; local523 < local185; local523++) {
						local356 += (int) ((long) Static199.anIntArray327[local198 + local185 - local523 - 1] * (long) Static78.anIntArrayArray17[0][local523] >> 16);
					}
					for (local523 = 0; local523 < local198; local523++) {
						local356 -= (int) ((long) Static199.anIntArray327[local198 - local523 - 1] * (long) Static78.anIntArrayArray17[1][local523] >> 16);
					}
					Static199.anIntArray327[local198] = local356;
					local102 = this.aClass133_6.method3265(arg0 + 1);
					local198++;
				}
				local203 = 128;
				while (true) {
					if (local203 > arg0 - local185) {
						local203 = arg0 - local185;
					}
					while (local198 < local203) {
						local356 = (int) ((long) Static199.anIntArray327[local198 + local185] * (long) Static78.anInt1507 >> 16);
						for (local523 = 0; local523 < local185; local523++) {
							local356 += (int) ((long) Static199.anIntArray327[local198 + local185 - local523 - 1] * (long) Static78.anIntArrayArray17[0][local523] >> 16);
						}
						for (local523 = 0; local523 < local190; local523++) {
							local356 -= (int) ((long) Static199.anIntArray327[local198 - local523 - 1] * (long) Static78.anIntArrayArray17[1][local523] >> 16);
						}
						Static199.anIntArray327[local198] = local356;
						local102 = this.aClass133_6.method3265(arg0 + 1);
						local198++;
					}
					if (local198 >= arg0 - local185) {
						while (local198 < arg0) {
							local356 = 0;
							for (local523 = local198 + local185 - arg0; local523 < local185; local523++) {
								local356 += (int) ((long) Static199.anIntArray327[local198 + local185 - local523 - 1] * (long) Static78.anIntArrayArray17[0][local523] >> 16);
							}
							for (local523 = 0; local523 < local190; local523++) {
								local356 -= (int) ((long) Static199.anIntArray327[local198 - local523 - 1] * (long) Static78.anIntArrayArray17[1][local523] >> 16);
							}
							Static199.anIntArray327[local198] = local356;
							this.aClass133_6.method3265(arg0 + 1);
							local198++;
						}
						break;
					}
					local185 = this.aClass49_1.method1212(0, (float) local102 / 65536.0F);
					local190 = this.aClass49_1.method1212(1, (float) local102 / 65536.0F);
					local203 += 128;
				}
			}
		}
		for (local102 = 0; local102 < arg0; local102++) {
			if (Static199.anIntArray327[local102] < -32768) {
				Static199.anIntArray327[local102] = -32768;
			}
			if (Static199.anIntArray327[local102] > 32767) {
				Static199.anIntArray327[local102] = 32767;
			}
		}
		return Static199.anIntArray327;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!p;)V")
	public void method3088(@OriginalArg(0) Class4_Sub17 arg0) {
		this.aClass133_4 = new Class133();
		this.aClass133_4.method3263(arg0);
		this.aClass133_8 = new Class133();
		this.aClass133_8.method3263(arg0);
		@Pc(21) int local21 = arg0.method1874();
		if (local21 != 0) {
			arg0.anInt2400--;
			this.aClass133_1 = new Class133();
			this.aClass133_1.method3263(arg0);
			this.aClass133_2 = new Class133();
			this.aClass133_2.method3263(arg0);
		}
		local21 = arg0.method1874();
		if (local21 != 0) {
			arg0.anInt2400--;
			this.aClass133_9 = new Class133();
			this.aClass133_9.method3263(arg0);
			this.aClass133_7 = new Class133();
			this.aClass133_7.method3263(arg0);
		}
		local21 = arg0.method1874();
		if (local21 != 0) {
			arg0.anInt2400--;
			this.aClass133_5 = new Class133();
			this.aClass133_5.method3263(arg0);
			this.aClass133_3 = new Class133();
			this.aClass133_3.method3263(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(116) int local116 = arg0.method1856();
			if (local116 == 0) {
				break;
			}
			this.anIntArray330[local109] = local116;
			this.anIntArray326[local109] = arg0.method1863();
			this.anIntArray328[local109] = arg0.method1856();
		}
		this.anInt3882 = arg0.method1856();
		this.anInt3885 = arg0.method1856();
		this.anInt3883 = arg0.method1837();
		this.anInt3884 = arg0.method1837();
		this.aClass49_1 = new Class49();
		this.aClass133_6 = new Class133();
		this.aClass49_1.method1211(arg0, this.aClass133_6);
	}
}
