import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class3_Sub8_Sub29 extends Class3_Sub8 {

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		return Static13.anIntArray11;
	}
}
