import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class4_Sub6_Sub10 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ds", name = "M", descriptor = "I")
	private int anInt1777 = 4096;

	@OriginalMember(owner = "client!ds", name = "P", descriptor = "I")
	private int anInt1779 = 0;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(26) int[] local26 = this.method5702(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static31.anInt797; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = this.anInt1779 <= local34 && local34 <= this.anInt1777 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1779 = arg1.method3401();
		} else if (arg0 == 1) {
			this.anInt1777 = arg1.method3401();
		}
	}
}
