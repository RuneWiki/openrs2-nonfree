import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "[Lclient!kf;")
	public static final Class178[] aClass178Array1 = new Class178[5];

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "Ljava/lang/String;")
	public String aString46;

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	static {
		for (@Pc(10) int local10 = 0; local10 < aClass178Array1.length; local10++) {
			aClass178Array1[local10] = new Class178();
		}
	}

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString46 = arg1;
		this.aThrowable1 = arg0;
	}
}
