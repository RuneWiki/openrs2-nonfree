import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class4_Sub2_Sub6 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
	private int anInt1440 = 4096;

	@OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
	private int anInt1438 = 0;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1438 = arg1.method8859();
		} else if (arg0 == 1) {
			this.anInt1440 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(26) int[] local26 = this.method8768(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static269.anInt4330; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = local34 >= this.anInt1438 && this.anInt1440 >= local34 ? 4096 : 0;
			}
		}
		return local16;
	}
}
