import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Ljava/lang/Throwable;")
	public Throwable aThrowable1;
}
