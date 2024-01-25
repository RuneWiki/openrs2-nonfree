import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class3_Sub3_Sub36 extends Class3_Sub3 {

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			Static367.method4031(local9, 0, Static131.anInt2755, Static269.anIntArray433[arg0]);
		}
		return local9;
	}
}
