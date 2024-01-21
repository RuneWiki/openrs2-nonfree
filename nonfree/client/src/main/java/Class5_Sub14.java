import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class5_Sub14 extends Class5 {

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
	public final int anInt2387;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
	public Class5_Sub14(@OriginalArg(0) int arg0) {
		this.anInt2387 = arg0;
	}
}
