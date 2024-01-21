import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
	public final int anInt1754;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
	public Class1_Sub11(@OriginalArg(0) int arg0) {
		this.anInt1754 = arg0;
	}
}
