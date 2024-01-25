import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	private Class2_Sub7() {
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub7(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString4 = arg0;
	}
}
