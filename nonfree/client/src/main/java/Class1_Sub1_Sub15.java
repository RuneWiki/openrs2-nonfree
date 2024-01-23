import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!go", name = "O", descriptor = "I")
	private int anInt1970 = 20;

	@OriginalMember(owner = "client!go", name = "H", descriptor = "I")
	private int anInt1965 = 1365;

	@OriginalMember(owner = "client!go", name = "S", descriptor = "I")
	private int anInt1973 = 0;

	@OriginalMember(owner = "client!go", name = "T", descriptor = "I")
	private int anInt1974 = 0;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1965 = arg0.method1879();
		} else if (arg1 == 1) {
			this.anInt1970 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt1973 = arg0.method1879();
		} else if (arg1 == 3) {
			this.anInt1974 = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			for (@Pc(24) int local24 = 0; local24 < Static6.anInt4960; local24++) {
				@Pc(44) int local44 = (Static298.anIntArray589[local24] << 12) / this.anInt1965 + this.anInt1973;
				@Pc(48) int local48 = local44;
				@Pc(61) int local61 = (Static10.anIntArray604[arg0] << 12) / this.anInt1965 + this.anInt1974;
				@Pc(63) int local63 = local61;
				@Pc(69) int local69 = local61 * local61 >> 12;
				@Pc(77) int local77 = local44 * local44 >> 12;
				@Pc(79) int local79 = 0;
				while (local69 + local77 < 16384 && local79 < this.anInt1970) {
					local79++;
					local63 = (local48 * local63 >> 12) * 2 + local61;
					local48 = local77 + local44 - local69;
					local77 = local48 * local48 >> 12;
					local69 = local63 * local63 >> 12;
				}
				local17[local24] = this.anInt1970 - 1 > local79 ? (local79 << 12) / this.anInt1970 : 0;
			}
		}
		return local17;
	}
}
