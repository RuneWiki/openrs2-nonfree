import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class2_Sub6_Sub34 extends Class2_Sub6 {

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			Static406.method5655(local9, 0, Static151.anInt2711, Static138.anIntArray291[arg0]);
		}
		return local9;
	}
}
