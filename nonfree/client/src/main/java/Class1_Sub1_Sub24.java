import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pca", name = "B", descriptor = "I")
	private int anInt6841 = 204;

	@OriginalMember(owner = "client!pca", name = "F", descriptor = "I")
	private int anInt6845 = 1;

	@OriginalMember(owner = "client!pca", name = "D", descriptor = "I")
	private int anInt6843 = 1;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			for (@Pc(22) int local22 = 0; local22 < Static87.anInt1964; local22++) {
				@Pc(28) int local28 = Static436.anIntArray506[local22];
				@Pc(32) int local32 = Static337.anIntArray406[arg0];
				@Pc(39) int local39 = local28 * this.anInt6843 >> 12;
				@Pc(46) int local46 = this.anInt6845 * local32 >> 12;
				@Pc(56) int local56 = this.anInt6843 * (local28 % (4096 / this.anInt6843));
				@Pc(66) int local66 = this.anInt6845 * (local32 % (4096 / this.anInt6845));
				if (this.anInt6841 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local56 < this.anInt6841) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt6841 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6843 = arg1.method4393();
		} else if (arg0 == 1) {
			this.anInt6845 = arg1.method4393();
		} else if (arg0 == 2) {
			this.anInt6841 = arg1.method4426();
		}
	}
}
