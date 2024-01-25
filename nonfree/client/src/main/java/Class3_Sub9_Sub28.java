import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class3_Sub9_Sub28 extends Class3_Sub9 {

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			Static684.method5330(local14, 0, Static62.anInt1251, Static147.anIntArray259[arg0]);
		}
		return local14;
	}
}
