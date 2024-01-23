import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!th", name = "O", descriptor = "I")
	private int anInt4949 = 204;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "I")
	private int anInt4950 = 1;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "I")
	private int anInt4942 = 1;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4942 = arg0.method1853();
		} else if (arg1 == 1) {
			this.anInt4950 = arg0.method1853();
		} else if (arg1 == 2) {
			this.anInt4949 = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			for (@Pc(27) int local27 = 0; local27 < Static6.anInt4960; local27++) {
				@Pc(38) int local38 = Static10.anIntArray604[arg0];
				@Pc(42) int local42 = Static298.anIntArray589[local27];
				@Pc(49) int local49 = local42 * this.anInt4942 >> 12;
				@Pc(56) int local56 = local38 * this.anInt4950 >> 12;
				@Pc(66) int local66 = local38 % (4096 / this.anInt4950) * this.anInt4950;
				@Pc(76) int local76 = this.anInt4942 * (local42 % (4096 / this.anInt4942));
				if (local66 < this.anInt4949) {
					for (local49 -= local56; local49 < 0; local49 += 4) {
					}
					while (local49 > 3) {
						local49 -= 4;
					}
					if (local49 != 1) {
						local11[local27] = 0;
						continue;
					}
					if (local76 < this.anInt4949) {
						local11[local27] = 0;
						continue;
					}
				}
				if (local76 < this.anInt4949) {
					for (local49 -= local56; local49 < 0; local49 += 4) {
					}
					while (local49 > 3) {
						local49 -= 4;
					}
					if (local49 > 0) {
						local11[local27] = 0;
						continue;
					}
				}
				local11[local27] = 4096;
			}
		}
		return local11;
	}
}
