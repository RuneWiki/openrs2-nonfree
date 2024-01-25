import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class1_Sub2_Sub27 extends Class1_Sub2 {

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(23) int[] local23 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			Static367.method5379(local23, 0, Static251.anInt6509, Static66.anIntArray158[arg0]);
		}
		return local23;
	}
}
