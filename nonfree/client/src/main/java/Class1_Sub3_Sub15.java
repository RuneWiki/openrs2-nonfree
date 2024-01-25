import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	static {
		new Class306(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			Static551.method3492(local11, 0, Static452.anInt7734, Static7.anIntArray20[arg0]);
		}
		return local11;
	}
}
