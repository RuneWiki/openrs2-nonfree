import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	private Class3_Sub2() {
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString1 = arg0;
	}
}
