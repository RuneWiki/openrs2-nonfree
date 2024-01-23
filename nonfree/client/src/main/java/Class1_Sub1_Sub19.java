import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			Static302.method1371(local9, 0, Static75.anInt1848, Static98.anIntArray221[arg0]);
		}
		return local9;
	}
}
