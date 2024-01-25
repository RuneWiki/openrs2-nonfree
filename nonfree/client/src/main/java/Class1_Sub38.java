import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	private Class1_Sub38() {
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub38(@OriginalArg(0) String arg0) {
		this.aString56 = arg0;
	}
}
