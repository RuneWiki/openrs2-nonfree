import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class4_Sub6_Sub34 extends Class4_Sub6 {

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			Static307.method3249(local15, 0, Static2.anInt19, Static273.anIntArray127[arg0]);
		}
		return local15;
	}
}
