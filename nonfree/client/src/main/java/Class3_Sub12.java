import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
	public final int anInt1963;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub12(@OriginalArg(0) int arg0) {
		this.anInt1963 = arg0;
	}
}
