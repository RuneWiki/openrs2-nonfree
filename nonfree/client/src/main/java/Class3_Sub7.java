import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
	public final int anInt845;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7(@OriginalArg(0) int arg0) {
		this.anInt845 = arg0;
	}
}
