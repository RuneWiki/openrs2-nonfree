import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class6_Sub1_Sub7 extends Class6_Sub1 {

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			Static358.method955(local14, 0, Static299.anInt5659, Static273.anIntArray703[arg0]);
		}
		return local14;
	}
}
