import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class7_Sub4_Sub23 extends Class7_Sub4 {

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			Static366.method4203(local17, 0, Static201.anInt4174, Static314.anIntArray756[arg0]);
		}
		return local17;
	}
}
