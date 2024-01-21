import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable1 = arg0;
		this.aString2 = arg1;
	}
}
