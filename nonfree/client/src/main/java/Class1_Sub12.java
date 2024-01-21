import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!j", name = "F", descriptor = "I")
	public final int anInt1615;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(I)V")
	public Class1_Sub12(@OriginalArg(0) int arg0) {
		this.anInt1615 = arg0;
	}
}
