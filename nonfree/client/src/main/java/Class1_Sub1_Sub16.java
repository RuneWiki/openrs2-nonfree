import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
	private int anInt1948 = 1;

	@OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
	private int anInt1949 = 1;

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
	private int anInt1947 = 204;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1948 = arg0.method3010();
		} else if (arg1 == 1) {
			this.anInt1949 = arg0.method3010();
		} else if (arg1 == 2) {
			this.anInt1947 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			for (@Pc(22) int local22 = 0; local22 < Static107.anInt2321; local22++) {
				@Pc(28) int local28 = Static193.anIntArray277[arg0];
				@Pc(32) int local32 = Static204.anIntArray179[local22];
				@Pc(42) int local42 = local32 % (4096 / this.anInt1948) * this.anInt1948;
				@Pc(49) int local49 = this.anInt1948 * local32 >> 12;
				@Pc(59) int local59 = this.anInt1949 * (local28 % (4096 / this.anInt1949));
				@Pc(66) int local66 = local28 * this.anInt1949 >> 12;
				if (this.anInt1947 > local59) {
					for (local49 -= local66; local49 < 0; local49 += 4) {
					}
					while (local49 > 3) {
						local49 -= 4;
					}
					if (local49 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local42 < this.anInt1947) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt1947 > local42) {
					for (local49 -= local66; local49 < 0; local49 += 4) {
					}
					while (local49 > 3) {
						local49 -= 4;
					}
					if (local49 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}
}
