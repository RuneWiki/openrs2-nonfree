import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub2_Sub39 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
	private int anInt7632 = 4096;

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
	private int anInt7631 = 0;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7631 = arg0.method4498();
		} else if (arg1 == 1) {
			this.anInt7632 = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(26) int[] local26 = this.method5872(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static410.anInt7198; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = local34 >= this.anInt7631 && local34 <= this.anInt7632 ? 4096 : 0;
			}
		}
		return local11;
	}
}
