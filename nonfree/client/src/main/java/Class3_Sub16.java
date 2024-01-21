import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
	public final int anInt2511;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub16(@OriginalArg(0) int arg0) {
		this.anInt2511 = arg0;
	}
}
