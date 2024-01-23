import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		return Static234.anIntArray462;
	}
}
