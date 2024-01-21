import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class2_Sub3_Sub21 extends Class2_Sub3 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			Static191.method1825(local15, 0, Static53.anInt1184, Static50.anIntArray106[arg0]);
		}
		return local15;
	}
}
