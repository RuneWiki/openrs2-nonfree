import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			Static600.method3767(local9, 0, Static87.anInt1964, Static337.anIntArray406[arg0]);
		}
		return local9;
	}
}
