import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class6_Sub2_Sub26 extends Class6_Sub2 {

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			Static459.method5349(local9, 0, Static185.anInt4925, Static168.anIntArray278[arg0]);
		}
		return local9;
	}
}
