import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class4_Sub4_Sub15 extends Class4_Sub4 {

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			Static461.method1986(local16, 0, Static419.anInt6404, Static334.anIntArray437[arg0]);
		}
		return local16;
	}
}
