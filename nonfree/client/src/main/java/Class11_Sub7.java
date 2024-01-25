import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class11_Sub7 extends Class11 {

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public final int anInt4785;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
	public Class11_Sub7(@OriginalArg(0) int arg0) {
		this.anInt4785 = arg0;
	}
}
