import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class6_Sub3_Sub14 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			Static585.method3075(local17, 0, Static447.anInt8568, Static564.anIntArray703[arg0]);
		}
		return local17;
	}
}
