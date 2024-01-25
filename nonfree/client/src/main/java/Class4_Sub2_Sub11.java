import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class4_Sub2_Sub11 extends Class4_Sub2 {

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			Static599.method3056(local11, 0, Static417.anInt5248, Static217.anIntArray501[arg0]);
		}
		return local11;
	}
}
