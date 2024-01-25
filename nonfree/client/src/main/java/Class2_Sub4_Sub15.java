import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class2_Sub4_Sub15 extends Class2_Sub4 {

	@OriginalMember(owner = "client!gha", name = "G", descriptor = "I")
	private int anInt3696 = 4096;

	@OriginalMember(owner = "client!gha", name = "I", descriptor = "I")
	private int anInt3698 = 0;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3698 = arg0.method2825();
		} else if (arg1 == 1) {
			this.anInt3696 = arg0.method2825();
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(29) int[] local29 = this.method8892(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static395.anInt6816; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = this.anInt3698 <= local37 && this.anInt3696 >= local37 ? 4096 : 0;
			}
		}
		return local11;
	}
}
