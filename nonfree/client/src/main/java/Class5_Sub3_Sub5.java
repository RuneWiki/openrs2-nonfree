import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class5_Sub3_Sub5 extends Class5_Sub3 {

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			Static368.method5428(local14, 0, Static7.anInt129, Static345.anIntArray627[arg0]);
		}
		return local14;
	}
}
