import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	private Class3_Sub19() {
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub19(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString23 = arg0;
	}
}
