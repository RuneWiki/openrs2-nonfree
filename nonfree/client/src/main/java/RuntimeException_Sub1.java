import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Ljava/lang/String;")
	public String aString134;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Ljava/lang/Throwable;")
	public Throwable aThrowable1;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString134 = arg1;
		this.aThrowable1 = arg0;
	}
}
