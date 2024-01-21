import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!d", name = "x", descriptor = "I")
	public final int anInt859;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7(@OriginalArg(0) int arg0) {
		this.anInt859 = arg0;
	}
}
