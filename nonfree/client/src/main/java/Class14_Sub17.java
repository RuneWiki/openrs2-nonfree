import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class14_Sub17 extends Class14 {

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	private Class14_Sub17() {
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class14_Sub17(@OriginalArg(0) String arg0) {
		this.aString26 = arg0;
	}
}
