import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class3_Sub2_Sub4 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
	private int anInt1722 = 4096;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(33) int[] local33 = this.method8716(0, arg0 - 1 & Static622.anInt9680);
			@Pc(41) int[] local41 = this.method8716(0, arg0);
			@Pc(51) int[] local51 = this.method8716(0, Static622.anInt9680 & arg0 + 1);
			for (@Pc(53) int local53 = 0; local53 < Static30.anInt908; local53++) {
				@Pc(67) int local67 = (local51[local53] - local33[local53]) * this.anInt1722;
				@Pc(87) int local87 = this.anInt1722 * (local41[local53 + 1 & Static241.anInt4556] - local41[Static241.anInt4556 & local53 - 1]);
				@Pc(91) int local91 = local87 >> 12;
				@Pc(95) int local95 = local67 >> 12;
				@Pc(101) int local101 = local91 * local91 >> 12;
				@Pc(107) int local107 = local95 * local95 >> 12;
				@Pc(121) int local121 = (int) (Math.sqrt((double) ((float) (local107 + local101 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(132) int local132 = local121 == 0 ? 0 : 16777216 / local121;
				local19[local53] = 4096 - local132;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1722 = arg0.method4858();
		}
	}
}
