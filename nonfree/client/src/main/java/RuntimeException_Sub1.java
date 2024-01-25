import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	static {
		new Class119(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString49 = arg1;
		this.aThrowable1 = arg0;
	}
}
