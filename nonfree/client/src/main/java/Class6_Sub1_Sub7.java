import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class6_Sub1_Sub7 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
	private int anInt2644 = 4096;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
	private int anInt2647 = 4096;

	@OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
	private int anInt2646 = 4096;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt2647 = arg1.method4999();
		} else if (arg0 == 1) {
			this.anInt2644 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt2646 = arg1.method4999();
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(27) int[][] local27 = this.method8162(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static289.anInt5549; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local63 == local59 && local67 == local63) {
					local43[local53] = this.anInt2647 * local59 >> 12;
					local47[local53] = this.anInt2644 * local63 >> 12;
					local51[local53] = this.anInt2646 * local67 >> 12;
				} else {
					local43[local53] = this.anInt2647;
					local47[local53] = this.anInt2644;
					local51[local53] = this.anInt2646;
				}
			}
		}
		return local17;
	}
}
