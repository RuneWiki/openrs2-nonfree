import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
	public final int anInt5896;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7(@OriginalArg(0) int arg0) {
		this.anInt5896 = arg0;
	}
}
