import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "[I")
	public static int[] anIntArray544 = new int[32];

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	static {
		@Pc(34) int local34 = 2;
		for (@Pc(36) int local36 = 0; local36 < 32; local36++) {
			anIntArray544[local36] = local34 - 1;
			local34 += local34;
		}
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString2 = arg1;
		this.aThrowable1 = arg0;
	}
}
