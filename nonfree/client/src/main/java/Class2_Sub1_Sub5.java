import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			Static323.method3553(local14, 0, Static281.anInt5558, Static272.anIntArray521[arg0]);
		}
		return local14;
	}
}
