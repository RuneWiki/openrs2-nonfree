import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class3_Sub16 extends Class3 {

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
	public final int anInt2100;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	public Class3_Sub16(@OriginalArg(0) int arg0) {
		this.anInt2100 = arg0;
	}
}
