import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class4_Sub1_Sub26 extends Class4_Sub1 {

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			Static317.method3204(local9, 0, Static68.anInt1753, Static10.anIntArray7[arg0]);
		}
		return local9;
	}
}
