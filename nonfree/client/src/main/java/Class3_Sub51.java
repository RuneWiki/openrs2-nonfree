import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class3_Sub51 extends Class3 {

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "Ljava/lang/String;")
	public String aString128;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	private Class3_Sub51() {
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub51(@OriginalArg(0) String arg0) {
		this.aString128 = arg0;
	}
}
