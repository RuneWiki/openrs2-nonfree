import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			Static359.method685(local13, 0, Static339.anInt6735, Class208.lb[arg0]);
		}
		return local13;
	}
}
