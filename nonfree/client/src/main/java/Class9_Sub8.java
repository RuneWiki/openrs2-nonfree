import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qka")
public final class Class9_Sub8 extends Class9 {

	@OriginalMember(owner = "client!qka", name = "o", descriptor = "I")
	public final int anInt8282;

	@OriginalMember(owner = "client!qka", name = "<init>", descriptor = "(I)V")
	public Class9_Sub8(@OriginalArg(0) int arg0) {
		this.anInt8282 = arg0;
	}
}
