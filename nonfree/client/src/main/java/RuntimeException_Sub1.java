import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString5 = arg1;
		this.aThrowable1 = arg0;
	}
}
