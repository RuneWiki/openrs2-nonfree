import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
	private int anInt204 = 4096;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
	private int anInt203 = 0;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(26) int[] local26 = this.method5847(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static350.anInt6330; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = local34 >= this.anInt203 && this.anInt204 >= local34 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt203 = arg1.method4877();
		} else if (arg0 == 1) {
			this.anInt204 = arg1.method4877();
		}
	}
}
