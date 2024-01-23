import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Ljava/lang/Throwable;")
	public Throwable aThrowable1;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Ljava/lang/String;")
	public String aString145;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable1 = arg0;
		this.aString145 = arg1;
	}
}
