import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
	private int anInt4195 = 1;

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
	private int anInt4197 = 204;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
	private int anInt4198 = 1;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4198 = arg0.method8383();
		} else if (arg1 == 1) {
			this.anInt4195 = arg0.method8383();
		} else if (arg1 == 2) {
			this.anInt4197 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			for (@Pc(17) int local17 = 0; local17 < Static222.anInt4971; local17++) {
				@Pc(23) int local23 = Static464.anIntArray556[local17];
				@Pc(27) int local27 = Static547.anIntArray641[arg0];
				@Pc(34) int local34 = this.anInt4198 * local23 >> 12;
				@Pc(41) int local41 = this.anInt4195 * local27 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt4198) * this.anInt4198;
				@Pc(61) int local61 = local27 % (4096 / this.anInt4195) * this.anInt4195;
				if (this.anInt4197 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt4197 > local51) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt4197 > local51) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}
}
