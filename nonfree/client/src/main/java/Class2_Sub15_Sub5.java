import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eka")
public final class Class2_Sub15_Sub5 extends Class2_Sub15 {

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			Static679.method4130(local14, 0, Static329.anInt6017, Static401.anIntArray357[arg0]);
		}
		return local14;
	}
}
