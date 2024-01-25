import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class6_Sub8_Sub2 extends Class6_Sub8 {

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			Static695.method5644(local9, 0, Static83.anInt1268, Static424.anIntArray466[arg0]);
		}
		return local9;
	}
}
