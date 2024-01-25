import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class5_Sub16_Sub1 extends Class5_Sub16 {

	@OriginalMember(owner = "client!fl", name = "Lb", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!fl", name = "Mb", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!fl", name = "Nb", descriptor = "I")
	private int anInt1759;

	@OriginalMember(owner = "client!fl", name = "Ob", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!fl", name = "Pb", descriptor = "I")
	private int anInt1760;

	@OriginalMember(owner = "client!fl", name = "Qb", descriptor = "I")
	private int anInt1761;

	@OriginalMember(owner = "client!fl", name = "Rb", descriptor = "Z")
	private boolean aBoolean125;

	@OriginalMember(owner = "client!fl", name = "Sb", descriptor = "Lclient!bb;")
	private Class5_Sub6 aClass5_Sub6_1;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "[I")
	private final int[] anIntArray145 = new int[16];

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "[I")
	private final int[] anIntArray144 = new int[16];

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "[I")
	private final int[] anIntArray146 = new int[16];

	@OriginalMember(owner = "client!fl", name = "bb", descriptor = "[I")
	public final int[] anIntArray150 = new int[16];

	@OriginalMember(owner = "client!fl", name = "db", descriptor = "[I")
	private final int[] anIntArray151 = new int[16];

	@OriginalMember(owner = "client!fl", name = "eb", descriptor = "[I")
	private final int[] anIntArray152 = new int[16];

	@OriginalMember(owner = "client!fl", name = "X", descriptor = "[[Lclient!il;")
	private final Class5_Sub21[][] aClass5_Sub21ArrayArray2 = new Class5_Sub21[16][128];

	@OriginalMember(owner = "client!fl", name = "kb", descriptor = "[I")
	private final int[] anIntArray154 = new int[16];

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "[[Lclient!il;")
	private final Class5_Sub21[][] aClass5_Sub21ArrayArray1 = new Class5_Sub21[16][128];

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
	private final int anInt1724 = 1000000;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "[I")
	private final int[] anIntArray147 = new int[16];

	@OriginalMember(owner = "client!fl", name = "cb", descriptor = "I")
	private int anInt1736 = 256;

	@OriginalMember(owner = "client!fl", name = "Db", descriptor = "[I")
	public final int[] anIntArray158 = new int[16];

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "[I")
	private final int[] anIntArray143 = new int[16];

	@OriginalMember(owner = "client!fl", name = "pb", descriptor = "[I")
	private final int[] anIntArray155 = new int[16];

	@OriginalMember(owner = "client!fl", name = "vb", descriptor = "[I")
	private final int[] anIntArray156 = new int[16];

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "[I")
	private final int[] anIntArray148 = new int[16];

	@OriginalMember(owner = "client!fl", name = "gb", descriptor = "[I")
	private final int[] anIntArray153 = new int[16];

	@OriginalMember(owner = "client!fl", name = "zb", descriptor = "[I")
	private final int[] anIntArray157 = new int[16];

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "[I")
	public final int[] anIntArray149 = new int[16];

	@OriginalMember(owner = "client!fl", name = "ob", descriptor = "Lclient!rn;")
	private final Class180 aClass180_1 = new Class180();

	@OriginalMember(owner = "client!fl", name = "Kb", descriptor = "Lclient!hd;")
	private final Class5_Sub16_Sub2 aClass5_Sub16_Sub2_1 = new Class5_Sub16_Sub2(this);

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lclient!tn;")
	private final Class190 aClass190_8 = new Class190(128);

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class5_Sub16_Sub1() {
		this.method1667();
		this.method1689(true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!bb;ZZB)V")
	private synchronized void method1659(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method1692(arg1);
		this.aClass180_1.method4899(arg0.aByteArray3);
		this.aLong57 = 0L;
		this.aBoolean124 = arg2;
		@Pc(22) int local22 = this.aClass180_1.method4905();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			this.aClass180_1.method4907(local24);
			this.aClass180_1.method4909(local24);
			this.aClass180_1.method4908(local24);
		}
		this.anInt1759 = this.aClass180_1.method4910();
		this.anInt1760 = this.aClass180_1.anIntArray540[this.anInt1759];
		this.aLong58 = this.aClass180_1.method4911(this.anInt1760);
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	public synchronized void method1660() {
		this.method1692(true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!il;)I")
	private int method1661(@OriginalArg(1) Class5_Sub21 arg0) {
		if (this.anIntArray147[arg0.anInt2644] == 0) {
			return 0;
		}
		@Pc(17) Class61 local17 = arg0.aClass61_1;
		@Pc(41) int local41 = this.anIntArray156[arg0.anInt2644] * this.anIntArray151[arg0.anInt2644] + 4096 >> 13;
		@Pc(49) int local49 = local41 * local41 + 16384 >> 15;
		@Pc(58) int local58 = arg0.anInt2641 * local49 + 16384 >> 15;
		@Pc(67) int local67 = local58 * this.anInt1736 + 128 >> 8;
		local41 = this.anIntArray147[arg0.anInt2644] * local67 + 128 >> 8;
		if (local17.anInt1448 > 0) {
			local41 = (int) (Math.pow(0.5D, (double) local17.anInt1448 * 1.953125E-5D * (double) arg0.anInt2638) * (double) local41 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local17.aByteArray16 != null) {
			local106 = arg0.anInt2631;
			local114 = local17.aByteArray16[arg0.anInt2648 + 1];
			if (arg0.anInt2648 < local17.aByteArray16.length - 2) {
				local132 = (local17.aByteArray16[arg0.anInt2648] & 0xFF) << 8;
				local144 = (local17.aByteArray16[arg0.anInt2648 + 2] & 0xFF) << 8;
				local114 += (local106 - local132) * (local17.aByteArray16[arg0.anInt2648 + 3] - local114) / (local144 - local132);
			}
			local41 = local114 * local41 + 32 >> 6;
		}
		if (arg0.anInt2647 > 0 && local17.aByteArray15 != null) {
			local106 = arg0.anInt2647;
			local114 = local17.aByteArray15[arg0.anInt2634 + 1];
			if (arg0.anInt2634 < local17.aByteArray15.length - 2) {
				local132 = (local17.aByteArray15[arg0.anInt2634] & 0xFF) << 8;
				local144 = (local17.aByteArray15[arg0.anInt2634 + 2] & 0xFF) << 8;
				local114 += (local106 - local132) * (local17.aByteArray15[arg0.anInt2634 + 3] + -local114) / (local144 - local132);
			}
			local41 = local114 * local41 + 32 >> 6;
		}
		return local41;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(IB)V")
	private void method1662(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class5_Sub21 local6 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2756(); local6 != null; local6 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2748()) {
			if (arg0 < 0 || arg0 == local6.anInt2644) {
				if (local6.aClass5_Sub16_Sub3_3 != null) {
					local6.aClass5_Sub16_Sub3_3.method4586(Static226.anInt4449 / 100);
					if (local6.aClass5_Sub16_Sub3_3.method4587()) {
						this.aClass5_Sub16_Sub2_1.aClass5_Sub16_Sub4_2.method5797(local6.aClass5_Sub16_Sub3_3);
					}
					local6.method2435();
				}
				if (local6.anInt2647 < 0) {
					this.aClass5_Sub21ArrayArray2[local6.anInt2644][local6.anInt2650] = null;
				}
				local6.method6005();
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)V")
	public synchronized void method1663() {
		for (@Pc(7) Class5_Sub24 local7 = (Class5_Sub24) this.aClass190_8.method5471(); local7 != null; local7 = (Class5_Sub24) this.aClass190_8.method5465()) {
			local7.method3317();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!il;I)I")
	private int method1664(@OriginalArg(0) Class5_Sub21 arg0) {
		@Pc(14) int local14 = (arg0.anInt2645 * arg0.anInt2637 >> 12) + arg0.anInt2653;
		local14 += (this.anIntArray152[arg0.anInt2644] - 8192) * this.anIntArray143[arg0.anInt2644] >> 12;
		@Pc(43) Class61 local43 = arg0.aClass61_1;
		@Pc(60) int local60;
		if (local43.anInt1453 > 0 && (local43.anInt1442 > 0 || this.anIntArray144[arg0.anInt2644] > 0)) {
			local60 = local43.anInt1442 << 2;
			@Pc(65) int local65 = local43.anInt1446 << 1;
			if (arg0.anInt2643 < local65) {
				local60 = local60 * arg0.anInt2643 / local65;
			}
			local60 += this.anIntArray144[arg0.anInt2644] >> 7;
			@Pc(95) double local95 = Math.sin((double) (arg0.anInt2630 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local60 * local95);
		}
		local60 = (int) ((double) (arg0.aClass5_Sub10_Sub1_1.anInt1039 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static226.anInt4449 + 0.5D);
		return local60 < 1 ? 1 : local60;
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)I")
	public int method1665() {
		return this.anInt1736;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
	private synchronized void method1667() {
		for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
			this.anIntArray147[local18] = 256;
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
	private void method1668(@OriginalArg(0) int arg0) {
		if ((this.anIntArray158[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class5_Sub21 local18 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2756(); local18 != null; local18 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2748()) {
			if (local18.anInt2644 == arg0) {
				local18.anInt2652 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5793(@OriginalArg(0) int arg0) {
		if (this.aClass180_1.method4914()) {
			@Pc(16) int local16 = this.aClass180_1.anInt5551 * this.anInt1724 / Static226.anInt4449;
			do {
				@Pc(25) long local25 = (long) arg0 * (long) local16 + this.aLong57;
				if (this.aLong58 - local25 >= 0L) {
					this.aLong57 = local25;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local16 + this.aLong58 - this.aLong57 - 1L) / (long) local16);
				this.aLong57 += (long) local16 * (long) local52;
				this.aClass5_Sub16_Sub2_1.method5793(local52);
				arg0 -= local52;
				this.method1687();
			} while (this.aClass180_1.method4914());
		}
		this.aClass5_Sub16_Sub2_1.method5793(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V")
	public synchronized void method1670() {
		for (@Pc(7) Class5_Sub24 local7 = (Class5_Sub24) this.aClass190_8.method5471(); local7 != null; local7 = (Class5_Sub24) this.aClass190_8.method5465()) {
			local7.method6005();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5787(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass180_1.method4914()) {
			@Pc(18) int local18 = this.anInt1724 * this.aClass180_1.anInt5551 / Static226.anInt4449;
			do {
				@Pc(27) long local27 = this.aLong57 + (long) arg2 * (long) local18;
				if (this.aLong58 - local27 >= 0L) {
					this.aLong57 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong58 + (long) local18 - this.aLong57 - 1L) / (long) local18);
				this.aLong57 += (long) local18 * (long) local57;
				this.aClass5_Sub16_Sub2_1.method5787(arg0, arg1, local57);
				arg2 -= local57;
				arg1 += local57;
				this.method1687();
			} while (this.aClass180_1.method4914());
		}
		this.aClass5_Sub16_Sub2_1.method5787(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(Lclient!il;I)Z")
	public boolean method1671(@OriginalArg(0) Class5_Sub21 arg0) {
		if (arg0.aClass5_Sub16_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt2647 >= 0) {
			arg0.method6005();
			if (arg0.anInt2635 > 0 && arg0 == this.aClass5_Sub21ArrayArray1[arg0.anInt2644][arg0.anInt2635]) {
				this.aClass5_Sub21ArrayArray1[arg0.anInt2644][arg0.anInt2635] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIII)V")
	private void method1672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
	private void method1673() {
		this.anIntArray153[9] = 128;
		this.anIntArray155[9] = 128;
		this.method1686(9, 128);
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)V")
	public synchronized void method1674(@OriginalArg(1) int arg0) {
		this.anInt1736 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([IIILclient!il;B)Z")
	public boolean method1675(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub21 arg3) {
		arg3.anInt2649 = Static226.anInt4449 / 100;
		if (arg3.anInt2647 >= 0 && (arg3.aClass5_Sub16_Sub3_3 == null || arg3.aClass5_Sub16_Sub3_3.method4598())) {
			arg3.method2435();
			arg3.method6005();
			if (arg3.anInt2635 > 0 && this.aClass5_Sub21ArrayArray1[arg3.anInt2644][arg3.anInt2635] == arg3) {
				this.aClass5_Sub21ArrayArray1[arg3.anInt2644][arg3.anInt2635] = null;
			}
			return true;
		}
		@Pc(54) int local54 = arg3.anInt2645;
		if (local54 > 0) {
			local54 -= (int) (Math.pow(2.0D, (double) this.anIntArray157[arg3.anInt2644] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local54 < 0) {
				local54 = 0;
			}
			arg3.anInt2645 = local54;
		}
		arg3.aClass5_Sub16_Sub3_3.method4578(this.method1664(arg3));
		@Pc(97) Class61 local97 = arg3.aClass61_1;
		arg3.anInt2630 += local97.anInt1453;
		@Pc(106) boolean local106 = false;
		arg3.anInt2643++;
		@Pc(130) double local130 = (double) ((arg3.anInt2637 * arg3.anInt2645 >> 12) + (arg3.anInt2650 - 60 << 8)) * 5.086263020833333E-6D;
		if (local97.anInt1448 > 0) {
			if (local97.anInt1451 <= 0) {
				arg3.anInt2638 += 128;
			} else {
				arg3.anInt2638 += (int) (Math.pow(2.0D, (double) local97.anInt1451 * local130) * 128.0D + 0.5D);
			}
			if (arg3.anInt2638 * local97.anInt1448 >= 819200) {
				local106 = true;
			}
		}
		if (local97.aByteArray16 != null) {
			if (local97.anInt1443 > 0) {
				arg3.anInt2631 += (int) (Math.pow(2.0D, (double) local97.anInt1443 * local130) * 128.0D + 0.5D);
			} else {
				arg3.anInt2631 += 128;
			}
			while (local97.aByteArray16.length - 2 > arg3.anInt2648 && (local97.aByteArray16[arg3.anInt2648 + 2] & 0xFF) << 8 < arg3.anInt2631) {
				arg3.anInt2648 += 2;
			}
			if (arg3.anInt2648 == local97.aByteArray16.length - 2 && local97.aByteArray16[arg3.anInt2648 + 1] == 0) {
				local106 = true;
			}
		}
		if (arg3.anInt2647 >= 0 && local97.aByteArray15 != null && (this.anIntArray158[arg3.anInt2644] & 0x1) == 0 && (arg3.anInt2635 < 0 || arg3 != this.aClass5_Sub21ArrayArray1[arg3.anInt2644][arg3.anInt2635])) {
			if (local97.anInt1452 > 0) {
				arg3.anInt2647 += (int) (Math.pow(2.0D, (double) local97.anInt1452 * local130) * 128.0D + 0.5D);
			} else {
				arg3.anInt2647 += 128;
			}
			while (local97.aByteArray15.length - 2 > arg3.anInt2634 && (local97.aByteArray15[arg3.anInt2634 + 2] & 0xFF) << 8 < arg3.anInt2647) {
				arg3.anInt2634 += 2;
			}
			if (local97.aByteArray15.length - 2 == arg3.anInt2634) {
				local106 = true;
			}
		}
		if (!local106) {
			arg3.aClass5_Sub16_Sub3_3.method4588(arg3.anInt2649, this.method1661(arg3), this.method1684(arg3));
			return false;
		}
		arg3.aClass5_Sub16_Sub3_3.method4586(arg3.anInt2649);
		if (arg0 == null) {
			arg3.aClass5_Sub16_Sub3_3.method5793(arg2);
		} else {
			arg3.aClass5_Sub16_Sub3_3.method5787(arg0, arg1, arg2);
		}
		if (arg3.aClass5_Sub16_Sub3_3.method4587()) {
			this.aClass5_Sub16_Sub2_1.aClass5_Sub16_Sub4_2.method5797(arg3.aClass5_Sub16_Sub3_3);
		}
		arg3.method2435();
		if (arg3.anInt2647 >= 0) {
			arg3.method6005();
			if (arg3.anInt2635 > 0 && arg3 == this.aClass5_Sub21ArrayArray1[arg3.anInt2644][arg3.anInt2635]) {
				this.aClass5_Sub21ArrayArray1[arg3.anInt2644][arg3.anInt2635] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!bb;ZZ)V")
	public synchronized void method1677(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) boolean arg1) {
		this.method1659(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "()Lclient!rb;")
	@Override
	public synchronized Class5_Sub16 method5790() {
		return this.aClass5_Sub16_Sub2_1;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)V")
	public synchronized void method1679() {
		this.method1673();
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(IB)V")
	private void method1680(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class5_Sub21 local16 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2756(); local16 != null; local16 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2748()) {
			if ((arg0 < 0 || local16.anInt2644 == arg0) && local16.anInt2647 < 0) {
				this.aClass5_Sub21ArrayArray2[local16.anInt2644][local16.anInt2650] = null;
				local16.anInt2647 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIII)V")
	private void method1681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class5_Sub21 local10 = this.aClass5_Sub21ArrayArray2[arg1][arg0];
		if (local10 == null) {
			return;
		}
		this.aClass5_Sub21ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray158[arg1] & 0x2) == 0) {
			local10.anInt2647 = 0;
			return;
		}
		for (@Pc(44) Class5_Sub21 local44 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2756(); local44 != null; local44 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2748()) {
			if (local44.anInt2644 == local10.anInt2644 && local44.anInt2647 < 0 && local44 != local10) {
				local10.anInt2647 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!wo;Lclient!ij;ILclient!bb;I)Z")
	public synchronized boolean method1682(@OriginalArg(0) Class217 arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(3) Class5_Sub6 arg2) {
		arg2.method352();
		@Pc(14) boolean local14 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class5_Sub42 local34 = (Class5_Sub42) arg2.aClass190_1.method5471(); local34 != null; local34 = (Class5_Sub42) arg2.aClass190_1.method5465()) {
			@Pc(40) int local40 = (int) local34.aLong235;
			@Pc(48) Class5_Sub24 local48 = (Class5_Sub24) this.aClass190_8.method5466((long) local40);
			if (local48 == null) {
				local48 = Static317.method5543(local40, arg1);
				if (local48 == null) {
					local14 = false;
					continue;
				}
				this.aClass190_8.method5464(local48, (long) local40);
			}
			if (!local48.method3320(arg0, local34.aByteArray91, local28)) {
				local14 = false;
			}
		}
		if (local14) {
			arg2.method351();
		}
		return local14;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(BLclient!il;)I")
	private int method1684(@OriginalArg(1) Class5_Sub21 arg0) {
		@Pc(17) int local17 = this.anIntArray145[arg0.anInt2644];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt2646) * (-local17 + 16384) + 32 >> 6) : local17 * arg0.anInt2646 + 32 >> 6;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
	private void method1685(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method1685(local10);
			}
			return;
		}
		this.anIntArray156[arg0] = 12800;
		this.anIntArray145[arg0] = 8192;
		this.anIntArray151[arg0] = 16383;
		this.anIntArray152[arg0] = 8192;
		this.anIntArray144[arg0] = 0;
		this.anIntArray157[arg0] = 8192;
		this.method1690(arg0);
		this.method1668(arg0);
		this.anIntArray158[arg0] = 0;
		this.anIntArray154[arg0] = 32767;
		this.anIntArray143[arg0] = 256;
		this.anIntArray149[arg0] = 0;
		this.method1688(arg0, 8192);
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(BII)V")
	private void method1686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray146[arg0]) {
			this.anIntArray146[arg0] = arg1;
			for (@Pc(12) int local12 = 0; local12 < 128; local12++) {
				this.aClass5_Sub21ArrayArray1[arg0][local12] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V")
	private void method1687() {
		@Pc(6) int local6 = this.anInt1759;
		@Pc(13) int local13 = this.anInt1760;
		@Pc(16) long local16 = this.aLong58;
		if (this.aClass5_Sub6_1 != null && this.anInt1761 == local13) {
			this.method1659(this.aClass5_Sub6_1, this.aBoolean125, this.aBoolean124);
			this.method1687();
			return;
		}
		while (this.anInt1760 == local13) {
			while (local13 == this.aClass180_1.anIntArray540[local6]) {
				this.aClass180_1.method4907(local6);
				@Pc(49) int local49 = this.aClass180_1.method4903(local6);
				if (local49 == 1) {
					this.aClass180_1.method4900();
					this.aClass180_1.method4908(local6);
					if (this.aClass180_1.method4902()) {
						if (this.aClass5_Sub6_1 != null) {
							this.method1677(this.aClass5_Sub6_1, this.aBoolean124);
							this.method1687();
							return;
						}
						if (!this.aBoolean124 || local13 == 0) {
							this.method1689(true);
							this.aClass180_1.method4912();
							return;
						}
						this.aClass180_1.method4906(local16);
					}
					break;
				}
				if ((local49 & 0x80) != 0) {
					this.method1693(local49);
				}
				this.aClass180_1.method4909(local6);
				this.aClass180_1.method4908(local6);
			}
			local6 = this.aClass180_1.method4910();
			local13 = this.aClass180_1.anIntArray540[local6];
			local16 = this.aClass180_1.method4911(local13);
		}
		this.anInt1760 = local13;
		this.aLong58 = local16;
		this.anInt1759 = local6;
		if (this.aClass5_Sub6_1 != null && this.anInt1761 < local13) {
			this.anInt1759 = -1;
			this.anInt1760 = this.anInt1761;
			this.aLong58 = this.aClass180_1.method4911(this.anInt1760);
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(III)V")
	private void method1688(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray148[arg0] = arg1;
		this.anIntArray150[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "()I")
	@Override
	public synchronized int method5792() {
		return 0;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(ZB)V")
	private void method1689(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1662(-1);
		} else {
			this.method1680(-1);
		}
		this.method1685(-1);
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray146[local20] = this.anIntArray153[local20];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray155[local45] = this.anIntArray153[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(BI)V")
	private void method1690(@OriginalArg(1) int arg0) {
		if ((this.anIntArray158[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(28) Class5_Sub21 local28 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2756(); local28 != null; local28 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2748()) {
			if (arg0 == local28.anInt2644 && this.aClass5_Sub21ArrayArray2[arg0][local28.anInt2650] == null && local28.anInt2647 < 0) {
				local28.anInt2647 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(BIII)V")
	private void method1691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1681(arg2, arg1, 64);
		if ((this.anIntArray158[arg1] & 0x2) != 0) {
			for (@Pc(26) Class5_Sub21 local26 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2746(); local26 != null; local26 = (Class5_Sub21) this.aClass5_Sub16_Sub2_1.aClass103_59.method2754()) {
				if (local26.anInt2644 == arg1 && local26.anInt2647 < 0) {
					this.aClass5_Sub21ArrayArray2[arg1][local26.anInt2650] = null;
					this.aClass5_Sub21ArrayArray2[arg1][arg2] = local26;
					@Pc(64) int local64 = local26.anInt2653 + (local26.anInt2645 * local26.anInt2637 >> 12);
					local26.anInt2653 += arg2 - local26.anInt2650 << 8;
					local26.anInt2650 = arg2;
					local26.anInt2645 = 4096;
					local26.anInt2637 = local64 - local26.anInt2653;
					return;
				}
			}
		}
		@Pc(109) Class5_Sub24 local109 = (Class5_Sub24) this.aClass190_8.method5466((long) this.anIntArray146[arg1]);
		if (local109 == null) {
			return;
		}
		@Pc(117) Class5_Sub10_Sub1 local117 = local109.aClass5_Sub10_Sub1Array1[arg2];
		if (local117 == null) {
			return;
		}
		@Pc(130) Class5_Sub21 local130 = new Class5_Sub21();
		local130.anInt2644 = arg1;
		local130.aClass5_Sub10_Sub1_1 = local117;
		local130.aClass5_Sub24_1 = local109;
		local130.aClass61_1 = local109.aClass61Array1[arg2];
		local130.anInt2635 = local109.aByteArray50[arg2];
		local130.anInt2650 = arg2;
		local130.anInt2641 = local109.anInt3666 * arg0 * arg0 * local109.aByteArray52[arg2] + 1024 >> 11;
		local130.anInt2646 = local109.aByteArray51[arg2] & 0xFF;
		local130.anInt2653 = (arg2 << 8) - (local109.aShortArray53[arg2] & 0x7FFF);
		local130.anInt2647 = -1;
		local130.anInt2634 = 0;
		local130.anInt2648 = 0;
		local130.anInt2638 = 0;
		local130.anInt2631 = 0;
		if (this.anIntArray149[arg1] == 0) {
			local130.aClass5_Sub16_Sub3_3 = Static365.method4581(local117, this.method1664(local130), this.method1661(local130), this.method1684(local130));
		} else {
			local130.aClass5_Sub16_Sub3_3 = Static365.method4581(local117, this.method1664(local130), 0, this.method1684(local130));
			this.method1694(local109.aShortArray53[arg2] < 0, local130);
		}
		if (local109.aShortArray53[arg2] < 0) {
			local130.aClass5_Sub16_Sub3_3.method4592(-1);
		}
		if (local130.anInt2635 >= 0) {
			@Pc(280) Class5_Sub21 local280 = this.aClass5_Sub21ArrayArray1[arg1][local130.anInt2635];
			if (local280 != null && local280.anInt2647 < 0) {
				this.aClass5_Sub21ArrayArray2[arg1][local280.anInt2650] = null;
				local280.anInt2647 = 0;
			}
			this.aClass5_Sub21ArrayArray1[arg1][local130.anInt2635] = local130;
		}
		this.aClass5_Sub16_Sub2_1.aClass103_59.method2745(local130);
		this.aClass5_Sub21ArrayArray2[arg1][arg2] = local130;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(ZB)V")
	private synchronized void method1692(@OriginalArg(0) boolean arg0) {
		this.aClass180_1.method4912();
		this.aClass5_Sub6_1 = null;
		this.method1689(arg0);
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(II)V")
	private void method1693(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0xF0;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (local7 == 128) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			this.method1681(local31, local25, local37);
		} else if (local7 == 144) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			if (local37 <= 0) {
				this.method1681(local31, local25, 64);
			} else {
				this.method1691(local37, local25, local31);
			}
		} else if (local7 == 160) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			this.method1672(local37, local31, local25);
		} else if (local7 == 176) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			if (local31 == 0) {
				this.anIntArray155[local25] = (this.anIntArray155[local25] & 0xFFE03FFF) + (local37 << 14);
			}
			if (local31 == 32) {
				this.anIntArray155[local25] = (this.anIntArray155[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 1) {
				this.anIntArray144[local25] = (this.anIntArray144[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 33) {
				this.anIntArray144[local25] = (this.anIntArray144[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 5) {
				this.anIntArray157[local25] = (this.anIntArray157[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 37) {
				this.anIntArray157[local25] = local37 + (this.anIntArray157[local25] & 0xFFFFFF80);
			}
			if (local31 == 7) {
				this.anIntArray156[local25] = (local37 << 7) + (this.anIntArray156[local25] & 0xFFFFC07F);
			}
			if (local31 == 39) {
				this.anIntArray156[local25] = (this.anIntArray156[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 10) {
				this.anIntArray145[local25] = (local37 << 7) + (this.anIntArray145[local25] & 0xFFFFC07F);
			}
			if (local31 == 42) {
				this.anIntArray145[local25] = local37 + (this.anIntArray145[local25] & 0xFFFFFF80);
			}
			if (local31 == 11) {
				this.anIntArray151[local25] = (this.anIntArray151[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 43) {
				this.anIntArray151[local25] = local37 + (this.anIntArray151[local25] & 0xFFFFFF80);
			}
			if (local31 == 64) {
				if (local37 >= 64) {
					this.anIntArray158[local25] |= 0x1;
				} else {
					this.anIntArray158[local25] &= 0xFFFFFFFE;
				}
			}
			if (local31 == 65) {
				if (local37 < 64) {
					this.method1690(local25);
					this.anIntArray158[local25] &= 0xFFFFFFFD;
				} else {
					this.anIntArray158[local25] |= 0x2;
				}
			}
			if (local31 == 99) {
				this.anIntArray154[local25] = (local37 << 7) + (this.anIntArray154[local25] & 0x7F);
			}
			if (local31 == 98) {
				this.anIntArray154[local25] = (this.anIntArray154[local25] & 0x3F80) + local37;
			}
			if (local31 == 101) {
				this.anIntArray154[local25] = (local37 << 7) + (this.anIntArray154[local25] & 0x7F) + 16384;
			}
			if (local31 == 100) {
				this.anIntArray154[local25] = (this.anIntArray154[local25] & 0x3F80) + local37 + 16384;
			}
			if (local31 == 120) {
				this.method1662(local25);
			}
			if (local31 == 121) {
				this.method1685(local25);
			}
			if (local31 == 123) {
				this.method1680(local25);
			}
			@Pc(497) int local497;
			if (local31 == 6) {
				local497 = this.anIntArray154[local25];
				if (local497 == 16384) {
					this.anIntArray143[local25] = (this.anIntArray143[local25] & 0xFFFFC07F) + (local37 << 7);
				}
			}
			if (local31 == 38) {
				local497 = this.anIntArray154[local25];
				if (local497 == 16384) {
					this.anIntArray143[local25] = (this.anIntArray143[local25] & 0xFFFFFF80) + local37;
				}
			}
			if (local31 == 16) {
				this.anIntArray149[local25] = (local37 << 7) + (this.anIntArray149[local25] & 0xFFFFC07F);
			}
			if (local31 == 48) {
				this.anIntArray149[local25] = local37 + (this.anIntArray149[local25] & 0xFFFFFF80);
			}
			if (local31 == 81) {
				if (local37 >= 64) {
					this.anIntArray158[local25] |= 0x4;
				} else {
					this.method1668(local25);
					this.anIntArray158[local25] &= 0xFFFFFFFB;
				}
			}
			if (local31 == 17) {
				this.method1688(local25, (this.anIntArray148[local25] & 0xFFFFC07F) + (local37 << 7));
			}
			if (local31 == 49) {
				this.method1688(local25, (this.anIntArray148[local25] & 0xFFFFFF80) + local37);
			}
		} else if (local7 == 192) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			this.method1686(local25, local31 + this.anIntArray155[local25]);
		} else if (local7 == 208) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			this.method1698(local25, local31);
		} else if (local7 == 224) {
			local25 = arg0 & 0xF;
			local31 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F5F) >> 8);
			this.method1697(local25, local31);
		} else {
			local7 = arg0 & 0xFF;
			if (local7 == 255) {
				this.method1689(true);
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLclient!il;B)V")
	public void method1694(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub21 arg1) {
		@Pc(16) int local16 = arg1.aClass5_Sub10_Sub1_1.aByteArray9.length;
		@Pc(35) int local35;
		if (arg0 && arg1.aClass5_Sub10_Sub1_1.aBoolean77) {
			@Pc(45) int local45 = local16 + local16 - arg1.aClass5_Sub10_Sub1_1.anInt1040;
			local16 <<= 0x8;
			local35 = (int) ((long) local45 * (long) this.anIntArray149[arg1.anInt2644] >> 6);
			if (local35 >= local16) {
				local35 = local16 + local16 - local35 - 1;
				arg1.aClass5_Sub16_Sub3_3.method4575();
			}
		} else {
			local35 = (int) ((long) this.anIntArray149[arg1.anInt2644] * (long) local16 >> 6);
		}
		arg1.aClass5_Sub16_Sub3_3.method4576(local35);
	}

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "(I)Z")
	public synchronized boolean method1696() {
		return this.aClass180_1.method4914();
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(III)V")
	private void method1697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray152[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(III)V")
	private void method1698(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "()Lclient!rb;")
	@Override
	public synchronized Class5_Sub16 method5791() {
		return null;
	}
}
