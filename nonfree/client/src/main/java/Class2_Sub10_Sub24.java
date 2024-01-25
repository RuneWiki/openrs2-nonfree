import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class2_Sub10_Sub24 extends Class2_Sub10 {

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		return Static561.anIntArray649;
	}
}
