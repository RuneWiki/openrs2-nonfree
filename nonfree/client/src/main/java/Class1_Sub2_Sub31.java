import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class1_Sub2_Sub31 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			Static459.method1547(local9, 0, Static410.anInt7198, Static285.anIntArray17[arg0]);
		}
		return local9;
	}
}
