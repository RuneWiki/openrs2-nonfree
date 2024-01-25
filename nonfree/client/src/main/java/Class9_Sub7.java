import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class9_Sub7 extends Class9 {

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public final int anInt6175;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
	public Class9_Sub7(@OriginalArg(0) int arg0) {
		this.anInt6175 = arg0;
	}
}
