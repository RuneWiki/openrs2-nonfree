import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class7_Sub4_Sub5 extends Class7_Sub4 {

	@OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
	private int anInt1896 = 4096;

	@OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
	private int anInt1899 = 0;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1899 = arg0.method2764();
		} else if (arg1 == 1) {
			this.anInt1896 = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(29) int[] local29 = this.method5634(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static201.anInt4174; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt1899 <= local37 && this.anInt1896 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}
}
