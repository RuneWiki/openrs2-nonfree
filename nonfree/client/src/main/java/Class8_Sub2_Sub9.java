import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class8_Sub2_Sub9 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
	private int anInt3047 = 4096;

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
	private int anInt3048 = 0;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub9() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3048 = arg1.method8578();
		} else if (arg0 == 1) {
			this.anInt3047 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(29) int[] local29 = this.method8505(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static538.anInt9297; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = this.anInt3048 <= local37 && local37 <= this.anInt3047 ? 4096 : 0;
			}
		}
		return local11;
	}
}
