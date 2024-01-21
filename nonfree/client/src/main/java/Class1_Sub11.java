import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
	public final int anInt1570;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V")
	public Class1_Sub11(@OriginalArg(0) int arg0) {
		this.anInt1570 = arg0;
	}
}
