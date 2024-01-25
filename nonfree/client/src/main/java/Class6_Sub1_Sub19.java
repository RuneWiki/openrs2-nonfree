import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class6_Sub1_Sub19 extends Class6_Sub1 {

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		return Static205.anIntArray199;
	}
}
