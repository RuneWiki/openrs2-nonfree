import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			Static319.method1417(local14, 0, Static62.anInt1350, Static256.anIntArray474[arg0]);
		}
		return local14;
	}
}
