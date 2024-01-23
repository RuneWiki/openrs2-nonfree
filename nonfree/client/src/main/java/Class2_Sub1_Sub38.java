import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class2_Sub1_Sub38 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			Static301.method301(local11, 0, Static114.anInt1359, Static234.anIntArray435[arg0]);
		}
		return local11;
	}
}
