import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class4_Sub6_Sub38 extends Class4_Sub6 {

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			Static359.method763(local9, 0, Static31.anInt797, Static128.anIntArray265[arg0]);
		}
		return local9;
	}
}
