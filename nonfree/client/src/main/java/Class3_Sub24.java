import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!va", name = "y", descriptor = "I")
	public final int anInt3994;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
	public Class3_Sub24(@OriginalArg(0) int arg0) {
		this.anInt3994 = arg0;
	}
}
