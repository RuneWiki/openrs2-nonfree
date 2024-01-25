import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class1_Sub3_Sub39 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
	private int anInt9378 = 204;

	@OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
	private int anInt9381 = 1;

	@OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
	private int anInt9382 = 1;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			for (@Pc(19) int local19 = 0; local19 < Static236.anInt4609; local19++) {
				@Pc(25) int local25 = Static201.anIntArray324[local19];
				@Pc(29) int local29 = Static305.anIntArray416[arg0];
				@Pc(36) int local36 = this.anInt9382 * local25 >> 12;
				@Pc(43) int local43 = this.anInt9381 * local29 >> 12;
				@Pc(53) int local53 = local25 % (4096 / this.anInt9382) * this.anInt9382;
				@Pc(63) int local63 = this.anInt9381 * (local29 % (4096 / this.anInt9381));
				if (this.anInt9378 > local63) {
					for (local36 -= local43; local36 < 0; local36 += 4) {
					}
					while (local36 > 3) {
						local36 -= 4;
					}
					if (local36 != 1) {
						local13[local19] = 0;
						continue;
					}
					if (local53 < this.anInt9378) {
						local13[local19] = 0;
						continue;
					}
				}
				if (this.anInt9378 > local53) {
					for (local36 -= local43; local36 < 0; local36 += 4) {
					}
					while (local36 > 3) {
						local36 -= 4;
					}
					if (local36 > 0) {
						local13[local19] = 0;
						continue;
					}
				}
				local13[local19] = 4096;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9382 = arg0.method3043();
		} else if (arg1 == 1) {
			this.anInt9381 = arg0.method3043();
		} else if (arg1 == 2) {
			this.anInt9378 = arg0.method3056();
		}
	}
}
