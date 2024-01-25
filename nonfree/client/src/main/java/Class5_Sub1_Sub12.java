import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class5_Sub1_Sub12 extends Class5_Sub1 {

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			Static682.method794(local9, 0, Static648.anInt9588, Static23.anIntArray27[arg0]);
		}
		return local9;
	}
}
