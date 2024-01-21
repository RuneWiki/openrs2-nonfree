import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString1 = arg1;
		this.aThrowable1 = arg0;
	}
}
