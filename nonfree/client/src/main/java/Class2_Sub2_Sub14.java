import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class2_Sub2_Sub14 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
	private int anInt1665;

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
	private int anInt1675;

	@OriginalMember(owner = "client!ib", name = "qb", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ib", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ib", name = "sb", descriptor = "I")
	private int anInt1681;

	@OriginalMember(owner = "client!ib", name = "xb", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
	private int anInt1664;

	@OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
	private int anInt1661;

	@OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
	private int anInt1672;

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
	private int anInt1674;

	@OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
	private int anInt1680;

	@OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
	private int anInt1679;

	@OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
	private int anInt1670;

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
	private int anInt1662;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
	private void method1185() {
		@Pc(12) Random local12 = new Random((long) this.anInt1662);
		this.anInt1681 = 4096 / this.anInt1662;
		this.anInt1675 = 4096 / this.anInt1674;
		this.anIntArray182 = new int[this.anInt1662 + 1];
		this.anInt1665 = this.anInt1679 / 2;
		this.anIntArrayArray23 = new int[this.anInt1662][this.anInt1674];
		@Pc(49) int local49 = this.anInt1675 / 2;
		this.anIntArray182[0] = 0;
		this.anIntArrayArray24 = new int[this.anInt1662][this.anInt1674 + 1];
		@Pc(68) int local68 = this.anInt1681 / 2;
		for (@Pc(78) int local78 = 0; local78 < this.anInt1662; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt1681;
				local97 = (Static137.method2174(local12, 4096) - 2048) * this.anInt1680 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local68 >> 12);
				this.anIntArray182[local78] = local105 + this.anIntArray182[local78 - 1];
			}
			this.anIntArrayArray24[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt1674; local85++) {
				if (local85 > 0) {
					local97 = this.anInt1675;
					@Pc(150) int local150 = (Static137.method2174(local12, 4096) - 2048) * this.anInt1661 >> 12;
					local97 += local150 * local49 >> 12;
					this.anIntArrayArray24[local78][local85] = this.anIntArrayArray24[local78][local85 - 1] + local97;
				}
				this.anIntArrayArray23[local78][local85] = 4096 - Static137.method2174(local12, this.anInt1670);
			}
			this.anIntArrayArray24[local78][this.anInt1674] = 4096;
		}
		this.anIntArray182[this.anInt1662] = 4096;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1674 = arg1.method1461();
		} else if (arg0 == 1) {
			this.anInt1662 = arg1.method1461();
		} else if (arg0 == 2) {
			this.anInt1661 = arg1.method1456();
		} else if (arg0 == 3) {
			this.anInt1680 = arg1.method1456();
		} else if (arg0 == 4) {
			this.anInt1672 = arg1.method1456();
		} else if (arg0 == 5) {
			this.anInt1664 = arg1.method1456();
		} else if (arg0 == 6) {
			this.anInt1679 = arg1.method1456();
		} else if (arg0 == 7) {
			this.anInt1670 = arg1.method1456();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(28) int local28;
			for (local28 = this.anInt1664 + Static86.anIntArray218[arg0]; local28 < 0; local28 += 4096) {
			}
			@Pc(35) int local35 = 0;
			while (local28 > 4096) {
				local28 -= 4096;
			}
			while (local35 < this.anInt1662 && this.anIntArray182[local35] <= local28) {
				local35++;
			}
			@Pc(62) float local62 = (float) this.anIntArray182[local35];
			@Pc(70) float local70 = (float) this.anIntArray182[local35 - 1];
			if ((float) local28 > (float) this.anInt1665 + local70 && (float) local28 < (float) -this.anInt1665 + local62) {
				for (@Pc(98) int local98 = 0; local98 < Static149.anInt3233; local98++) {
					@Pc(102) int local102 = 0;
					@Pc(113) int local113 = local35 % 2 == 0 ? this.anInt1672 : -this.anInt1672;
					@Pc(124) int local124;
					for (local124 = Static154.anIntArray354[local98] + (this.anInt1675 * local113 >> 12); local124 < 0; local124 += 4096) {
					}
					while (local124 > 4096) {
						local124 -= 4096;
					}
					while (this.anInt1674 > local102 && this.anIntArrayArray24[local35 - 1][local102] <= local124) {
						local102++;
					}
					@Pc(171) float local171 = (float) this.anIntArrayArray24[local35 - 1][local102];
					@Pc(183) float local183 = (float) this.anIntArrayArray24[local35 - 1][local102 - 1];
					if (local183 + (float) this.anInt1665 < (float) local124 && local171 - (float) this.anInt1665 > (float) local124) {
						local17[local98] = this.anIntArrayArray23[local35 - 1][local102 - 1];
					} else {
						local17[local98] = 0;
					}
				}
			} else {
				Static182.method1345(local17, 0, Static149.anInt3233, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		this.method1185();
	}
}
