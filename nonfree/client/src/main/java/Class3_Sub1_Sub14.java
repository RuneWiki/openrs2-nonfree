import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			Static400.method1875(local9, 0, Static238.anInt4221, Static351.anIntArray371[arg0]);
		}
		return local9;
	}
}
