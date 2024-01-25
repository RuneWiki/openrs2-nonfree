import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class3_Sub8_Sub34 extends Class3_Sub8 {

	@OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
	private int anInt10110 = 0;

	@OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
	private int anInt10112 = 4096;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(29) int[] local29 = this.method8776(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static91.anInt1849; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt10110 <= local37 && this.anInt10112 >= local37 ? 4096 : 0;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt10110 = arg1.method7951();
		} else if (arg0 == 1) {
			this.anInt10112 = arg1.method7951();
		}
	}
}
