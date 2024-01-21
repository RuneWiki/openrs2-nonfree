import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!me", name = "r", descriptor = "I")
	public final int anInt2187;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
	public Class2_Sub21(@OriginalArg(0) int arg0) {
		this.anInt2187 = arg0;
	}
}
