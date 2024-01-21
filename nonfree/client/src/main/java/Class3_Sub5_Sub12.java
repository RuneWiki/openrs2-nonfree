import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class3_Sub5_Sub12 extends Class3_Sub5 {

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
	private int anInt1576;

	@OriginalMember(owner = "client!hh", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
	private int anInt1583;

	@OriginalMember(owner = "client!hh", name = "eb", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
	private int anInt1588;

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
	private int anInt1581;

	@OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
	private int anInt1578;

	@OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
	private int anInt1584;

	@OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
	private int anInt1585;

	@OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!hh", name = "mb", descriptor = "I")
	private int anInt1592;

	@OriginalMember(owner = "client!hh", name = "fb", descriptor = "I")
	private int anInt1587;

	@OriginalMember(owner = "client!hh", name = "ob", descriptor = "I")
	private int anInt1593;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static94.anIntArray277[arg0] + this.anInt1592; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (this.anInt1585 > local25 && local32 >= this.anIntArray197[local25]) {
				local25++;
			}
			@Pc(66) float local66 = (float) this.anIntArray197[local25 - 1];
			@Pc(72) float local72 = (float) this.anIntArray197[local25];
			if ((float) local32 > local66 + (float) this.anInt1588 && local72 - (float) this.anInt1588 > (float) local32) {
				for (@Pc(99) int local99 = 0; local99 < Static104.anInt2195; local99++) {
					@Pc(115) int local115 = local25 % 2 == 0 ? this.anInt1581 : -this.anInt1581;
					@Pc(117) int local117 = 0;
					@Pc(128) int local128;
					for (local128 = Static124.anIntArray355[local99] + (local115 * this.anInt1583 >> 12); local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (this.anInt1587 > local117 && local128 >= this.anIntArrayArray15[local25 - 1][local117]) {
						local117++;
					}
					@Pc(171) float local171 = (float) this.anIntArrayArray15[local25 - 1][local117];
					@Pc(183) float local183 = (float) this.anIntArrayArray15[local25 - 1][local117 - 1];
					if ((float) local128 > (float) this.anInt1588 + local183 && (float) local128 < local171 - (float) this.anInt1588) {
						local19[local99] = this.anIntArrayArray14[local25 - 1][local117 - 1];
					} else {
						local19[local99] = 0;
					}
				}
			} else {
				Static200.method1180(local19, 0, Static104.anInt2195, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt1587 = arg1.method2107();
		} else if (arg0 == 1) {
			this.anInt1585 = arg1.method2107();
		} else if (arg0 == 2) {
			this.anInt1584 = arg1.method2111();
		} else if (arg0 == 3) {
			this.anInt1578 = arg1.method2111();
		} else if (arg0 == 4) {
			this.anInt1581 = arg1.method2111();
		} else if (arg0 == 5) {
			this.anInt1592 = arg1.method2111();
		} else if (arg0 == 6) {
			this.anInt1593 = arg1.method2111();
		} else if (arg0 == 7) {
			this.anInt1573 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
	private void method1061() {
		@Pc(12) Random local12 = new Random((long) this.anInt1585);
		this.anIntArray197 = new int[this.anInt1585 + 1];
		this.anIntArrayArray15 = new int[this.anInt1585][this.anInt1587 + 1];
		this.anIntArrayArray14 = new int[this.anInt1585][this.anInt1587];
		this.anIntArray197[0] = 0;
		this.anInt1576 = 4096 / this.anInt1585;
		this.anInt1588 = this.anInt1593 / 2;
		@Pc(57) int local57 = this.anInt1576 / 2;
		this.anInt1583 = 4096 / this.anInt1587;
		@Pc(68) int local68 = this.anInt1583 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt1585; local70++) {
			@Pc(82) int local82;
			@Pc(94) int local94;
			if (local70 > 0) {
				local82 = this.anInt1576;
				local94 = (Static141.method2188(4096, local12) - 2048) * this.anInt1578 >> 12;
				@Pc(102) int local102 = local82 + (local57 * local94 >> 12);
				this.anIntArray197[local70] = this.anIntArray197[local70 - 1] + local102;
			}
			this.anIntArrayArray15[local70][0] = 0;
			for (local82 = 0; local82 < this.anInt1587; local82++) {
				if (local82 > 0) {
					local94 = this.anInt1583;
					@Pc(143) int local143 = (Static141.method2188(4096, local12) - 2048) * this.anInt1584 >> 12;
					local94 += local143 * local68 >> 12;
					this.anIntArrayArray15[local70][local82] = this.anIntArrayArray15[local70][local82 - 1] + local94;
				}
				this.anIntArrayArray14[local70][local82] = this.anInt1573 <= 0 ? 4096 : 4096 - Static141.method2188(this.anInt1573, local12);
			}
			this.anIntArrayArray15[local70][this.anInt1587] = 4096;
		}
		this.anIntArray197[this.anInt1585] = 4096;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		this.method1061();
	}
}
