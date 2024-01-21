import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class3_Sub2_Sub28 extends Class3_Sub2 {

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
	private int anInt2922;

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
	private int anInt2925;

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
	private int anInt2926;

	@OriginalMember(owner = "client!pd", name = "jb", descriptor = "[I")
	private int[] anIntArray311;

	@OriginalMember(owner = "client!pd", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
	private int anInt2920;

	@OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
	private int anInt2927;

	@OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
	private int anInt2930;

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
	private int anInt2919;

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
	private int anInt2917;

	@OriginalMember(owner = "client!pd", name = "pb", descriptor = "I")
	private int anInt2932;

	@OriginalMember(owner = "client!pd", name = "xb", descriptor = "I")
	private int anInt2938;

	@OriginalMember(owner = "client!pd", name = "rb", descriptor = "I")
	private int anInt2934;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		this.method2141();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
	private void method2141() {
		@Pc(8) Random local8 = new Random((long) this.anInt2927);
		this.anInt2925 = 4096 / this.anInt2917;
		@Pc(19) int local19 = this.anInt2925 / 2;
		this.anInt2926 = 4096 / this.anInt2927;
		this.anIntArrayArray33 = new int[this.anInt2927][this.anInt2917];
		@Pc(41) int local41 = this.anInt2926 / 2;
		this.anInt2922 = this.anInt2932 / 2;
		this.anIntArray311 = new int[this.anInt2927 + 1];
		this.anIntArray311[0] = 0;
		this.anIntArrayArray32 = new int[this.anInt2927][this.anInt2917 + 1];
		for (@Pc(78) int local78 = 0; local78 < this.anInt2927; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt2926;
				local97 = (Static12.method194(local8, 4096) - 2048) * this.anInt2934 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local41 >> 12);
				this.anIntArray311[local78] = this.anIntArray311[local78 - 1] + local105;
			}
			this.anIntArrayArray32[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt2917; local85++) {
				if (local85 > 0) {
					local97 = this.anInt2925;
					@Pc(145) int local145 = (Static12.method194(local8, 4096) - 2048) * this.anInt2920 >> 12;
					local97 += local145 * local19 >> 12;
					this.anIntArrayArray32[local78][local85] = local97 + this.anIntArrayArray32[local78][local85 - 1];
				}
				this.anIntArrayArray33[local78][local85] = this.anInt2919 > 0 ? 4096 - Static12.method194(local8, this.anInt2919) : 4096;
			}
			this.anIntArrayArray32[local78][this.anInt2917] = 4096;
		}
		this.anIntArray311[this.anInt2927] = 4096;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(18) int local18 = 0;
			@Pc(25) int local25;
			for (local25 = Static123.anIntArray308[arg0] + this.anInt2930; local25 < 0; local25 += 4096) {
			}
			while (local25 > 4096) {
				local25 -= 4096;
			}
			while (local18 < this.anInt2927 && local25 >= this.anIntArray311[local18]) {
				local18++;
			}
			@Pc(63) float local63 = (float) this.anIntArray311[local18];
			@Pc(71) float local71 = (float) this.anIntArray311[local18 - 1];
			if (local71 + (float) this.anInt2922 < (float) local25 && (float) -this.anInt2922 + local63 > (float) local25) {
				for (@Pc(99) int local99 = 0; local99 < Static86.anInt1942; local99++) {
					@Pc(103) int local103 = 0;
					@Pc(114) int local114 = local18 % 2 == 0 ? this.anInt2938 : -this.anInt2938;
					@Pc(125) int local125;
					for (local125 = (this.anInt2925 * local114 >> 12) + Static165.anIntArray17[local99]; local125 < 0; local125 += 4096) {
					}
					while (local125 > 4096) {
						local125 -= 4096;
					}
					while (this.anInt2917 > local103 && local125 >= this.anIntArrayArray32[local18 - 1][local103]) {
						local103++;
					}
					@Pc(167) float local167 = (float) this.anIntArrayArray32[local18 - 1][local103];
					@Pc(179) float local179 = (float) this.anIntArrayArray32[local18 - 1][local103 - 1];
					if ((float) local125 > (float) this.anInt2922 + local179 && (float) local125 < (float) -this.anInt2922 + local167) {
						local12[local99] = this.anIntArrayArray33[local18 - 1][local103 - 1];
					} else {
						local12[local99] = 0;
					}
				}
			} else {
				Static184.method1122(local12, 0, Static86.anInt1942, 0);
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2917 = arg0.method1354();
		} else if (arg1 == 1) {
			this.anInt2927 = arg0.method1354();
		} else if (arg1 == 2) {
			this.anInt2920 = arg0.method1359();
		} else if (arg1 == 3) {
			this.anInt2934 = arg0.method1359();
		} else if (arg1 == 4) {
			this.anInt2938 = arg0.method1359();
		} else if (arg1 == 5) {
			this.anInt2930 = arg0.method1359();
		} else if (arg1 == 6) {
			this.anInt2932 = arg0.method1359();
		} else if (arg1 == 7) {
			this.anInt2919 = arg0.method1359();
		}
	}
}
