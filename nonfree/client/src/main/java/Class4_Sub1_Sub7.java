import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class4_Sub1_Sub7 extends Class4_Sub1 {

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			Static316.method75(local15, 0, Static73.anInt1626, Static237.anIntArray478[arg0]);
		}
		return local15;
	}
}
