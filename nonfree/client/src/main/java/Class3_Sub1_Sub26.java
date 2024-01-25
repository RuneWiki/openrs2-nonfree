import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class3_Sub1_Sub26 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		return Static361.anIntArray460;
	}
}
