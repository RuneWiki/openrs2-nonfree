import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class41_Sub10 extends Class41 {

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	public final int anInt10203;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(I)V")
	public Class41_Sub10(@OriginalArg(0) int arg0) {
		this.anInt10203 = arg0;
	}
}
