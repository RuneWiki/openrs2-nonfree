import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class79 {

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!s;")
	public static final Class210 aClass210_5 = new Class210(3, -1);

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_84 = new Class145(3, 7);

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray17;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 175)
	public Class79(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray17 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!gd", name = "toString", descriptor = "()Ljava/lang/String;", line = 136)
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 155)
	public String method2269(@OriginalArg(0) int arg0) {
		return this.aStringArray17[arg0];
	}
}
