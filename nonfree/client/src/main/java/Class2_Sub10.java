import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	public final int anInt9434;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(I)V")
	public Class2_Sub10(@OriginalArg(0) int arg0) {
		this.anInt9434 = arg0;
	}
}
