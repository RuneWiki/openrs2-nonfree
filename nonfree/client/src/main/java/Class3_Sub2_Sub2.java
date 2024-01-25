import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8594(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass40_41.method1572(arg0);
		if (super.aClass40_41.aBoolean97) {
			Static653.method6860(local9, 0, Static491.anInt8519, Static372.anIntArray207[arg0]);
		}
		return local9;
	}
}
