import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class1_Sub3_Sub28 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pr", name = "L", descriptor = "I")
	private int anInt6765 = 0;

	@OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
	private int anInt6768 = 1365;

	@OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
	private int anInt6767 = 0;

	@OriginalMember(owner = "client!pr", name = "T", descriptor = "I")
	private int anInt6771 = 20;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			for (@Pc(27) int local27 = 0; local27 < Static254.anInt4973; local27++) {
				@Pc(41) int local41 = (Static457.anIntArray732[local27] << 12) / this.anInt6768 + this.anInt6765;
				@Pc(53) int local53 = this.anInt6767 + (Static392.anIntArray673[arg0] << 12) / this.anInt6768;
				@Pc(59) int local59 = local41;
				@Pc(61) int local61 = local53;
				@Pc(67) int local67 = local41 * local41 >> 12;
				@Pc(73) int local73 = local53 * local53 >> 12;
				@Pc(75) int local75 = 0;
				while (local73 + local67 < 16384 && this.anInt6771 > local75) {
					local61 = (local61 * local59 >> 12) * 2 + local53;
					local59 = local67 + local41 - local73;
					local73 = local61 * local61 >> 12;
					local75++;
					local67 = local59 * local59 >> 12;
				}
				local21[local27] = local75 >= this.anInt6771 - 1 ? 0 : (local75 << 12) / this.anInt6771;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt6768 = arg1.method4494();
		} else if (arg0 == 1) {
			this.anInt6771 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt6765 = arg1.method4494();
		} else if (arg0 == 3) {
			this.anInt6767 = arg1.method4494();
		}
	}
}
