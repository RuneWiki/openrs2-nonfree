import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class6_Sub2_Sub37 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
	private int anInt6664 = 0;

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
	private int anInt6658 = 4096;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6664 = arg0.method3108();
		} else if (arg1 == 1) {
			this.anInt6658 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			@Pc(26) int[] local26 = this.method5858(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static185.anInt4925; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = local34 >= this.anInt6664 && local34 <= this.anInt6658 ? 4096 : 0;
			}
		}
		return local16;
	}
}
