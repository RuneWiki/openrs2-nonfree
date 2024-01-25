import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class2_Sub10_Sub27 extends Class2_Sub10 {

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			Static649.method4858(local9, 0, Static93.anInt1862, Static353.anIntArray424[arg0]);
		}
		return local9;
	}
}
