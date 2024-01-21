import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
	public final int anInt1537;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11(@OriginalArg(0) int arg0) {
		this.anInt1537 = arg0;
	}
}
