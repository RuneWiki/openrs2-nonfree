import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Ljava/lang/String;")
	public String aString57;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	private Class3_Sub37() {
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub37(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString57 = arg0;
	}
}
