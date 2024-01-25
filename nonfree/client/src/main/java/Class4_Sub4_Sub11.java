import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class4_Sub4_Sub11 extends Class4_Sub4 {

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			Static602.method1584(local14, 0, Static560.anInt9394, Static450.anIntArray619[arg0]);
		}
		return local14;
	}
}
