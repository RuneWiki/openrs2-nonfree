import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class5_Sub1_Sub9 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			Static220.method48(local9, 0, Static174.anInt3489, Static147.anIntArray321[arg0]);
		}
		return local9;
	}
}
