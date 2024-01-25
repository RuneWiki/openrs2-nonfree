import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class6_Sub1_Sub21 extends Class6_Sub1 {

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			Static679.method1566(local9, 0, Static479.anInt8231, Static230.anIntArray222[arg0]);
		}
		return local9;
	}
}
