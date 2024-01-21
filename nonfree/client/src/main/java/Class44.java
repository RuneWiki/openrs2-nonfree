import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class44 {

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "[I")
	private static final int[] anIntArray144 = new int[32768];

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "[I")
	private static final int[] anIntArray143;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "Lclient!ic;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!vf;")
	private Class93 aClass93_1;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!ic;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!ic;")
	private Class45 aClass45_3;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!ic;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "Lclient!ic;")
	private Class45 aClass45_5;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!ic;")
	private Class45 aClass45_6;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "Lclient!ic;")
	private Class45 aClass45_7;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!ic;")
	private Class45 aClass45_8;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "Lclient!ic;")
	private Class45 aClass45_9;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	private int anInt1796 = 100;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
	private final int[] anIntArray141 = new int[5];

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public int anInt1797 = 500;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "[I")
	private final int[] anIntArray142 = new int[5];

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
	private int anInt1795 = 0;

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
	public int anInt1798 = 0;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "[I")
	private final int[] anIntArray145 = new int[5];

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray144[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray143 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray143[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ka;)V")
	public void method1243(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aClass45_4 = new Class45();
		this.aClass45_4.method1246(arg0);
		this.aClass45_5 = new Class45();
		this.aClass45_5.method1246(arg0);
		@Pc(21) int local21 = arg0.method3010();
		if (local21 != 0) {
			arg0.anInt4061--;
			this.aClass45_1 = new Class45();
			this.aClass45_1.method1246(arg0);
			this.aClass45_6 = new Class45();
			this.aClass45_6.method1246(arg0);
		}
		local21 = arg0.method3010();
		if (local21 != 0) {
			arg0.anInt4061--;
			this.aClass45_3 = new Class45();
			this.aClass45_3.method1246(arg0);
			this.aClass45_7 = new Class45();
			this.aClass45_7.method1246(arg0);
		}
		local21 = arg0.method3010();
		if (local21 != 0) {
			arg0.anInt4061--;
			this.aClass45_8 = new Class45();
			this.aClass45_8.method1246(arg0);
			this.aClass45_2 = new Class45();
			this.aClass45_2.method1246(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method3047();
			if (local114 == 0) {
				break;
			}
			this.anIntArray141[local109] = local114;
			this.anIntArray142[local109] = arg0.method3045();
			this.anIntArray145[local109] = arg0.method3047();
		}
		this.anInt1795 = arg0.method3047();
		this.anInt1796 = arg0.method3047();
		this.anInt1797 = arg0.method3023();
		this.anInt1798 = arg0.method3023();
		this.aClass93_1 = new Class93();
		this.aClass45_9 = new Class45();
		this.aClass93_1.method3288(arg0, this.aClass45_9);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
	private int method1244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray143[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray144[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
	public int[] method1245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static216.method2199(Static81.anIntArray146, 0, arg0);
		if (arg1 < 10) {
			return Static81.anIntArray146;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass45_4.method1248();
		this.aClass45_5.method1248();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass45_1 != null) {
			this.aClass45_1.method1248();
			this.aClass45_6.method1248();
			local24 = (int) ((double) (this.aClass45_1.anInt1801 - this.aClass45_1.anInt1799) * 32.768D / local16);
			local26 = (int) ((double) this.aClass45_1.anInt1799 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass45_3 != null) {
			this.aClass45_3.method1248();
			this.aClass45_7.method1248();
			local63 = (int) ((double) (this.aClass45_3.anInt1801 - this.aClass45_3.anInt1799) * 32.768D / local16);
			local65 = (int) ((double) this.aClass45_3.anInt1799 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray141[local102] != 0) {
				Static81.anIntArray149[local102] = 0;
				Static81.anIntArray151[local102] = (int) ((double) this.anIntArray145[local102] * local16);
				Static81.anIntArray150[local102] = (this.anIntArray141[local102] << 14) / 100;
				Static81.anIntArray148[local102] = (int) ((double) (this.aClass45_4.anInt1801 - this.aClass45_4.anInt1799) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray142[local102]) / local16);
				Static81.anIntArray147[local102] = (int) ((double) this.aClass45_4.anInt1799 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass45_4.method1249(arg0);
			local187 = this.aClass45_5.method1249(arg0);
			if (this.aClass45_1 != null) {
				local195 = this.aClass45_1.method1249(arg0);
				local200 = this.aClass45_6.method1249(arg0);
				local182 += this.method1244(local28, local200, this.aClass45_1.anInt1800) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass45_3 != null) {
				local195 = this.aClass45_3.method1249(arg0);
				local200 = this.aClass45_7.method1249(arg0);
				local187 = local187 * ((this.method1244(local67, local200, this.aClass45_3.anInt1800) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray141[local195] != 0) {
					local200 = local176 + Static81.anIntArray151[local195];
					if (local200 < arg0) {
						Static81.anIntArray146[local200] += this.method1244(Static81.anIntArray149[local195], local187 * Static81.anIntArray150[local195] >> 15, this.aClass45_4.anInt1800);
						Static81.anIntArray149[local195] += (local182 * Static81.anIntArray148[local195] >> 16) + Static81.anIntArray147[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass45_8 != null) {
			this.aClass45_8.method1248();
			this.aClass45_2.method1248();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass45_8.method1249(arg0);
				local352 = this.aClass45_2.method1249(arg0);
				if (local339) {
					local187 = this.aClass45_8.anInt1799 + ((this.aClass45_8.anInt1801 - this.aClass45_8.anInt1799) * local347 >> 8);
				} else {
					local187 = this.aClass45_8.anInt1799 + ((this.aClass45_8.anInt1801 - this.aClass45_8.anInt1799) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static81.anIntArray146[local200] = 0;
				}
			}
		}
		if (this.anInt1795 > 0 && this.anInt1796 > 0) {
			local182 = (int) ((double) this.anInt1795 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static81.anIntArray146[local187] += Static81.anIntArray146[local187 - local182] * this.anInt1796 / 100;
			}
		}
		if (this.aClass93_1.anIntArray351[0] > 0 || this.aClass93_1.anIntArray351[1] > 0) {
			this.aClass45_9.method1248();
			local182 = this.aClass45_9.method1249(arg0 + 1);
			local187 = this.aClass93_1.method3290(0, (float) local182 / 65536.0F);
			local195 = this.aClass93_1.method3290(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static81.anIntArray146[local200 + local187] * (long) Static198.anInt4339 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static81.anIntArray146[local200 + local187 - local519 - 1] * (long) Static198.anIntArrayArray31[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static81.anIntArray146[local200 - local549 - 1] * (long) Static198.anIntArrayArray31[1][local549] >> 16);
					}
					Static81.anIntArray146[local200] = local352;
					local182 = this.aClass45_9.method1249(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static81.anIntArray146[local200 + local187] * (long) Static198.anInt4339 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static81.anIntArray146[local200 + local187 - local519 - 1] * (long) Static198.anIntArrayArray31[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static81.anIntArray146[local200 - local549 - 1] * (long) Static198.anIntArrayArray31[1][local549] >> 16);
						}
						Static81.anIntArray146[local200] = local352;
						local182 = this.aClass45_9.method1249(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static81.anIntArray146[local200 + local187 - local519 - 1] * (long) Static198.anIntArrayArray31[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static81.anIntArray146[local200 - local549 - 1] * (long) Static198.anIntArrayArray31[1][local549] >> 16);
							}
							Static81.anIntArray146[local200] = local352;
							this.aClass45_9.method1249(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass93_1.method3290(0, (float) local182 / 65536.0F);
					local195 = this.aClass93_1.method3290(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static81.anIntArray146[local182] < -32768) {
				Static81.anIntArray146[local182] = -32768;
			}
			if (Static81.anIntArray146[local182] > 32767) {
				Static81.anIntArray146[local182] = 32767;
			}
		}
		return Static81.anIntArray146;
	}
}
