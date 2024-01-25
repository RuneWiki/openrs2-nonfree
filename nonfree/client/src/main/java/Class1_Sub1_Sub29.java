import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
	private int anInt7061 = 4096;

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
	private int anInt7066 = 0;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(29) int[] local29 = this.method7709(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static279.anInt4906; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = this.anInt7066 <= local37 && local37 <= this.anInt7061 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7066 = arg0.method5771();
		} else if (arg1 == 1) {
			this.anInt7061 = arg0.method5771();
		}
	}
}
