import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class6_Sub8_Sub37 extends Class6_Sub8 {

	@OriginalMember(owner = "client!un", name = "C", descriptor = "I")
	private int anInt9853 = 0;

	@OriginalMember(owner = "client!un", name = "E", descriptor = "I")
	private int anInt9856 = 4096;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(29) int[] local29 = this.method8930(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static83.anInt1268; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = this.anInt9853 <= local37 && this.anInt9856 >= local37 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9853 = arg1.method3018();
		} else if (arg0 == 1) {
			this.anInt9856 = arg1.method3018();
		}
	}
}
