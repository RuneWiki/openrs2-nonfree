import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class5_Sub6_Sub29 extends Class5_Sub6 {

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			Static685.method8333(local14, 0, Static421.anInt7443, Static508.anIntArray471[arg0]);
		}
		return local14;
	}
}
