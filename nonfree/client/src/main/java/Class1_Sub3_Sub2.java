import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!be", name = "P", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!be", name = "S", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!be", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!be", name = "fb", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!be", name = "W", descriptor = "I")
	private int anInt675 = 8;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "I")
	private int anInt674 = 1024;

	@OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
	private int anInt677 = 81;

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
	private int anInt670 = 1024;

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
	private int anInt687 = 4;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "I")
	private int anInt684 = 204;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
	private int anInt689 = 0;

	@OriginalMember(owner = "client!be", name = "ob", descriptor = "I")
	private int anInt690 = 409;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt687 = arg0.method1772();
		} else if (arg1 == 1) {
			this.anInt675 = arg0.method1772();
		} else if (arg1 == 2) {
			this.anInt690 = arg0.method1764();
		} else if (arg1 == 3) {
			this.anInt684 = arg0.method1764();
		} else if (arg1 == 4) {
			this.anInt670 = arg0.method1764();
		} else if (arg1 == 5) {
			this.anInt689 = arg0.method1764();
		} else if (arg1 == 6) {
			this.anInt677 = arg0.method1764();
		} else if (arg1 == 7) {
			this.anInt674 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(B)V")
	private void method361() {
		@Pc(12) Random local12 = new Random((long) this.anInt675);
		this.anIntArrayArray3 = new int[this.anInt675][this.anInt687 + 1];
		this.anInt669 = this.anInt677 / 2;
		this.anInt676 = 4096 / this.anInt687;
		@Pc(38) int local38 = this.anInt676 / 2;
		this.anIntArrayArray2 = new int[this.anInt675][this.anInt687];
		this.anIntArray52 = new int[this.anInt675 + 1];
		this.anInt683 = 4096 / this.anInt675;
		@Pc(63) int local63 = this.anInt683 / 2;
		this.anIntArray52[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt675; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt683;
				local100 = (Static205.method3438(4096, local12) - 2048) * this.anInt684 >> 12;
				@Pc(108) int local108 = local88 + (local100 * local63 >> 12);
				this.anIntArray52[local78] = local108 + this.anIntArray52[local78 - 1];
			}
			this.anIntArrayArray3[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt687; local88++) {
				if (local88 > 0) {
					local100 = this.anInt676;
					@Pc(151) int local151 = (Static205.method3438(4096, local12) - 2048) * this.anInt690 >> 12;
					local100 += local151 * local38 >> 12;
					this.anIntArrayArray3[local78][local88] = local100 + this.anIntArrayArray3[local78][local88 - 1];
				}
				this.anIntArrayArray2[local78][local88] = this.anInt674 > 0 ? 4096 - Static205.method3438(this.anInt674, local12) : 4096;
			}
			this.anIntArrayArray3[local78][this.anInt687] = 4096;
		}
		this.anIntArray52[this.anInt675] = 4096;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		this.method361();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt689 + Static94.anIntArray321[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt675 > local22 && local29 >= this.anIntArray52[local22]) {
				local22++;
			}
			@Pc(72) boolean local72 = (local22 & 0x1) == 0;
			@Pc(76) int local76 = local22 - 1;
			@Pc(81) int local81 = this.anIntArray52[local22];
			@Pc(88) int local88 = this.anIntArray52[local22 - 1];
			if (local29 > local88 + this.anInt669 && local29 < local81 - this.anInt669) {
				for (@Pc(108) int local108 = 0; local108 < Static110.anInt2934; local108++) {
					@Pc(119) int local119 = local72 ? this.anInt670 : -this.anInt670;
					@Pc(130) int local130;
					for (local130 = Static175.anIntArray302[local108] + (local119 * this.anInt676 >> 12); local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					@Pc(148) int local148;
					for (local148 = 0; local148 < this.anInt687 && local130 >= this.anIntArrayArray3[local76][local148]; local148++) {
					}
					@Pc(171) int local171 = local148 - 1;
					@Pc(178) int local178 = this.anIntArrayArray3[local76][local171];
					@Pc(185) int local185 = this.anIntArrayArray3[local76][local148];
					if (local130 > this.anInt669 + local178 && local185 - this.anInt669 > local130) {
						local16[local108] = this.anIntArrayArray2[local76][local171];
					} else {
						local16[local108] = 0;
					}
				}
			} else {
				Static274.method2689(local16, 0, Static110.anInt2934, 0);
			}
		}
		return local16;
	}
}
