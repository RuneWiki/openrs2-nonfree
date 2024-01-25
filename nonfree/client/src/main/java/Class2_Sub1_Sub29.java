import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class2_Sub1_Sub29 extends Class2_Sub1 {

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			Static394.method2439(local14, 0, Static391.anInt7118, Static229.anIntArray382[arg0]);
		}
		return local14;
	}
}
