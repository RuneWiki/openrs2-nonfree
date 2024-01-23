import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class1_Sub3_Sub28 extends Class1_Sub3 {

	@OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
	private int anInt4344 = 1;

	@OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
	private int anInt4349 = 1;

	@OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
	private int anInt4346 = 204;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4344 = arg0.method2690();
		} else if (arg1 == 1) {
			this.anInt4349 = arg0.method2690();
		} else if (arg1 == 2) {
			this.anInt4346 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			for (@Pc(17) int local17 = 0; local17 < Static227.anInt4511; local17++) {
				@Pc(28) int local28 = Static132.anIntArray265[arg0];
				@Pc(32) int local32 = Static209.anIntArray377[local17];
				@Pc(39) int local39 = local28 * this.anInt4349 >> 12;
				@Pc(49) int local49 = this.anInt4344 * (local32 % (4096 / this.anInt4344));
				@Pc(56) int local56 = this.anInt4344 * local32 >> 12;
				@Pc(66) int local66 = this.anInt4349 * (local28 % (4096 / this.anInt4349));
				if (local66 < this.anInt4346) {
					for (local56 -= local39; local56 < 0; local56 += 4) {
					}
					while (local56 > 3) {
						local56 -= 4;
					}
					if (local56 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local49 < this.anInt4346) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local49 < this.anInt4346) {
					for (local56 -= local39; local56 < 0; local56 += 4) {
					}
					while (local56 > 3) {
						local56 -= 4;
					}
					if (local56 > 0) {
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
