import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class2_Sub10_Sub36 extends Class2_Sub10 {

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray91;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
	private int anInt9731;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	private int anInt9735;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray92;

	@OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
	private int anInt9740;

	@OriginalMember(owner = "client!vb", name = "U", descriptor = "[I")
	private int[] anIntArray677;

	@OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
	private int anInt9732 = 8;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
	private int anInt9738 = 409;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
	private int anInt9734 = 1024;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	private int anInt9729 = 4;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
	private int anInt9728 = 81;

	@OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
	private int anInt9733 = 204;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
	private int anInt9741 = 1024;

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt9736 = 0;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V")
	@Override
	public void method8407() {
		this.method8143();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9729 = arg0.method6904();
		} else if (arg1 == 1) {
			this.anInt9732 = arg0.method6904();
		} else if (arg1 == 2) {
			this.anInt9738 = arg0.method6884();
		} else if (arg1 == 3) {
			this.anInt9733 = arg0.method6884();
		} else if (arg1 == 4) {
			this.anInt9741 = arg0.method6884();
		} else if (arg1 == 5) {
			this.anInt9736 = arg0.method6884();
		} else if (arg1 == 6) {
			this.anInt9728 = arg0.method6884();
		} else if (arg1 == 7) {
			this.anInt9734 = arg0.method6884();
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
	private void method8143() {
		@Pc(12) Random local12 = new Random((long) this.anInt9732);
		this.anInt9740 = 4096 / this.anInt9729;
		this.anInt9731 = this.anInt9728 / 2;
		this.anInt9735 = 4096 / this.anInt9732;
		@Pc(35) int local35 = this.anInt9740 / 2;
		this.anIntArrayArray92 = new int[this.anInt9732][this.anInt9729];
		this.anIntArrayArray91 = new int[this.anInt9732][this.anInt9729 + 1];
		@Pc(64) int local64 = this.anInt9735 / 2;
		this.anIntArray677 = new int[this.anInt9732 + 1];
		this.anIntArray677[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt9732; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt9735;
				local97 = (Static610.method8343(local12, 4096) - 2048) * this.anInt9733 >> 12;
				@Pc(105) int local105 = local85 + (local64 * local97 >> 12);
				this.anIntArray677[local78] = this.anIntArray677[local78 - 1] + local105;
			}
			this.anIntArrayArray91[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt9729; local85++) {
				if (local85 > 0) {
					local97 = this.anInt9740;
					@Pc(145) int local145 = (Static610.method8343(local12, 4096) - 2048) * this.anInt9738 >> 12;
					local97 += local35 * local145 >> 12;
					this.anIntArrayArray91[local78][local85] = this.anIntArrayArray91[local78][local85 - 1] + local97;
				}
				this.anIntArrayArray92[local78][local85] = this.anInt9734 > 0 ? 4096 - Static610.method8343(local12, this.anInt9734) : 4096;
			}
			this.anIntArrayArray91[local78][this.anInt9729] = 4096;
		}
		this.anIntArray677[this.anInt9732] = 4096;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = Static353.anIntArray424[arg0] + this.anInt9736; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local23 < this.anInt9732 && this.anIntArray677[local23] <= local30) {
				local23++;
			}
			@Pc(61) int local61 = local23 - 1;
			@Pc(69) boolean local69 = (local23 & 0x1) == 0;
			@Pc(74) int local74 = this.anIntArray677[local23];
			@Pc(81) int local81 = this.anIntArray677[local23 - 1];
			if (this.anInt9731 + local81 < local30 && local30 < local74 - this.anInt9731) {
				for (@Pc(110) int local110 = 0; local110 < Static93.anInt1862; local110++) {
					@Pc(121) int local121 = local69 ? this.anInt9741 : -this.anInt9741;
					@Pc(123) int local123 = 0;
					@Pc(134) int local134;
					for (local134 = Static561.anIntArray649[local110] + (this.anInt9740 * local121 >> 12); local134 < 0; local134 += 4096) {
					}
					while (local134 > 4096) {
						local134 -= 4096;
					}
					while (this.anInt9729 > local123 && local134 >= this.anIntArrayArray91[local61][local123]) {
						local123++;
					}
					@Pc(174) int local174 = local123 - 1;
					@Pc(181) int local181 = this.anIntArrayArray91[local61][local123];
					@Pc(188) int local188 = this.anIntArrayArray91[local61][local174];
					if (this.anInt9731 + local188 < local134 && local134 < local181 - this.anInt9731) {
						local17[local110] = this.anIntArrayArray92[local61][local174];
					} else {
						local17[local110] = 0;
					}
				}
			} else {
				Static649.method4858(local17, 0, Static93.anInt1862, 0);
			}
		}
		return local17;
	}
}
