import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		return Static105.anIntArray261;
	}
}
