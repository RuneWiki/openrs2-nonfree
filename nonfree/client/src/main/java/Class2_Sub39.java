import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	private Class2_Sub39() {
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub39(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString69 = arg0;
	}
}
