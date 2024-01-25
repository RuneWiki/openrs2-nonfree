import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class2_Sub15_Sub31 extends Class2_Sub15 {

	@OriginalMember(owner = "client!tea", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!tea", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!tea", name = "L", descriptor = "I")
	private int anInt9967;

	@OriginalMember(owner = "client!tea", name = "O", descriptor = "I")
	private int anInt9969;

	@OriginalMember(owner = "client!tea", name = "Y", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!tea", name = "ab", descriptor = "I")
	private int anInt9979;

	@OriginalMember(owner = "client!tea", name = "K", descriptor = "I")
	private int anInt9966 = 1024;

	@OriginalMember(owner = "client!tea", name = "G", descriptor = "I")
	private int anInt9964 = 1024;

	@OriginalMember(owner = "client!tea", name = "H", descriptor = "I")
	private int anInt9965 = 0;

	@OriginalMember(owner = "client!tea", name = "Q", descriptor = "I")
	private int anInt9971 = 204;

	@OriginalMember(owner = "client!tea", name = "V", descriptor = "I")
	private int anInt9975 = 409;

	@OriginalMember(owner = "client!tea", name = "E", descriptor = "I")
	private int anInt9963 = 4;

	@OriginalMember(owner = "client!tea", name = "bb", descriptor = "I")
	private int anInt9980 = 81;

	@OriginalMember(owner = "client!tea", name = "W", descriptor = "I")
	private int anInt9976 = 8;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt9963 = arg1.method5203();
		} else if (arg0 == 1) {
			this.anInt9976 = arg1.method5203();
		} else if (arg0 == 2) {
			this.anInt9975 = arg1.method5211();
		} else if (arg0 == 3) {
			this.anInt9971 = arg1.method5211();
		} else if (arg0 == 4) {
			this.anInt9964 = arg1.method5211();
		} else if (arg0 == 5) {
			this.anInt9965 = arg1.method5211();
		} else if (arg0 == 6) {
			this.anInt9980 = arg1.method5211();
		} else if (arg0 == 7) {
			this.anInt9966 = arg1.method5211();
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt9965 + Static401.anIntArray357[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (this.anInt9976 > local23 && local30 >= this.anIntArray503[local23]) {
				local23++;
			}
			@Pc(63) int local63 = local23 - 1;
			@Pc(74) boolean local74 = (local23 & 0x1) == 0;
			@Pc(79) int local79 = this.anIntArray503[local23];
			@Pc(86) int local86 = this.anIntArray503[local23 - 1];
			if (local86 + this.anInt9969 < local30 && local79 - this.anInt9969 > local30) {
				for (@Pc(109) int local109 = 0; local109 < Static329.anInt6017; local109++) {
					@Pc(120) int local120 = local74 ? this.anInt9964 : -this.anInt9964;
					@Pc(122) int local122 = 0;
					@Pc(134) int local134;
					for (local134 = Static537.anIntArray480[local109] + (local120 * this.anInt9967 >> 12); local134 < 0; local134 += 4096) {
					}
					while (local134 > 4096) {
						local134 -= 4096;
					}
					while (this.anInt9963 > local122 && this.anIntArrayArray55[local63][local122] <= local134) {
						local122++;
					}
					@Pc(173) int local173 = local122 - 1;
					@Pc(180) int local180 = this.anIntArrayArray55[local63][local122];
					@Pc(187) int local187 = this.anIntArrayArray55[local63][local173];
					if (local134 > this.anInt9969 + local187 && local180 - this.anInt9969 > local134) {
						local17[local109] = this.anIntArrayArray56[local63][local173];
					} else {
						local17[local109] = 0;
					}
				}
			} else {
				Static679.method4130(local17, 0, Static329.anInt6017, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "(B)V")
	private void method8687() {
		@Pc(12) Random local12 = new Random((long) this.anInt9976);
		this.anInt9979 = 4096 / this.anInt9976;
		this.anInt9967 = 4096 / this.anInt9963;
		this.anInt9969 = this.anInt9980 / 2;
		@Pc(43) int local43 = this.anInt9967 / 2;
		this.anIntArrayArray56 = new int[this.anInt9976][this.anInt9963];
		this.anIntArray503 = new int[this.anInt9976 + 1];
		this.anIntArrayArray55 = new int[this.anInt9976][this.anInt9963 + 1];
		@Pc(71) int local71 = this.anInt9979 / 2;
		this.anIntArray503[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt9976; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt9979;
				local97 = (Static17.method7641(4096, local12) - 2048) * this.anInt9971 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local71 >> 12);
				this.anIntArray503[local78] = this.anIntArray503[local78 - 1] + local105;
			}
			this.anIntArrayArray55[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt9963; local85++) {
				if (local85 > 0) {
					local97 = this.anInt9967;
					@Pc(145) int local145 = (Static17.method7641(4096, local12) - 2048) * this.anInt9975 >> 12;
					local97 += local145 * local43 >> 12;
					this.anIntArrayArray55[local78][local85] = this.anIntArrayArray55[local78][local85 - 1] + local97;
				}
				this.anIntArrayArray56[local78][local85] = this.anInt9966 <= 0 ? 4096 : 4096 - Static17.method7641(this.anInt9966, local12);
			}
			this.anIntArrayArray55[local78][this.anInt9963] = 4096;
		}
		this.anIntArray503[this.anInt9976] = 4096;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		this.method8687();
	}
}
