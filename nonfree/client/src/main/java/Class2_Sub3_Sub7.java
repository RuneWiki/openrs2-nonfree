import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			Static184.method1643(local13, 0, Static54.anInt1423, Static21.anIntArray50[arg0]);
		}
		return local13;
	}
}
