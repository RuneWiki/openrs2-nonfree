import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class1_Sub3_Sub26 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(10) int[] local10 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			Static274.method2689(local10, 0, Static110.anInt2934, Static94.anIntArray321[arg0]);
		}
		return local10;
	}
}
