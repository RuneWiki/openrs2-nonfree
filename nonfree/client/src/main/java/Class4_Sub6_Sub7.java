import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class4_Sub6_Sub7 extends Class4_Sub6 {

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			Static459.method3327(local9, 0, Static80.anInt1616, Static165.anIntArray209[arg0]);
		}
		return local9;
	}
}
