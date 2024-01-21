import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class2_Sub4_Sub24 extends Class2_Sub4 {

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			Static220.method1004(local11, 0, Static118.anInt2608, Static2.anIntArray5[arg0]);
		}
		return local11;
	}
}
