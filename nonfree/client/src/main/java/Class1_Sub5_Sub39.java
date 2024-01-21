import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class1_Sub5_Sub39 extends Class1_Sub5 {

	@OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
	private int anInt4146;

	@OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
	private int anInt4145;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(23) int[] local23 = this.method3145(0, arg0);
			for (@Pc(25) int local25 = 0; local25 < Static177.anInt4018; local25++) {
				@Pc(31) int local31 = local23[local25];
				local11[local25] = this.anInt4145 <= local31 && this.anInt4146 >= local31 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4145 = arg0.method359();
		} else if (arg1 == 1) {
			this.anInt4146 = arg0.method359();
		}
	}
}
