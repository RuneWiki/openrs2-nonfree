import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class2_Sub1_Sub17 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			Static222.method2223(local14, 0, Static135.anInt2897, Static81.anIntArray174[arg0]);
		}
		return local14;
	}
}
