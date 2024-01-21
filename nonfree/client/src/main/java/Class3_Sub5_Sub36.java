import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class3_Sub5_Sub36 extends Class3_Sub5 {

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
	private int anInt4211;

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
	private int anInt4215;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4211 = arg1.method2111();
		} else if (arg0 == 1) {
			this.anInt4215 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(29) int[] local29 = this.method3167(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static104.anInt2195; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt4211 <= local37 && local37 <= this.anInt4215 ? 4096 : 0;
			}
		}
		return local19;
	}
}
