import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	private Class3_Sub17() {
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub17(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString41 = arg0;
	}
}
