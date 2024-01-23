import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			Static236.method301(local13, 0, Static11.anInt294, Static187.anIntArray345[arg0]);
		}
		return local13;
	}
}
