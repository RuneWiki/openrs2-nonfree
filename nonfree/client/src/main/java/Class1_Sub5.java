import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	public int anInt409;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V")
	public Class1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt409 = arg0;
	}
}
