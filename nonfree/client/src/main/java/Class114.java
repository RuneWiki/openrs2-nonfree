import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class114 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "[Lclient!jc;")
	public static final Class145[] aClass145Array1 = new Class145[5];

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray14;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass145Array1.length; local4++) {
			aClass145Array1[local4] = new Class145();
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class114(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray14 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3330(@OriginalArg(1) int arg0) {
		return this.aStringArray14[arg0];
	}

	@OriginalMember(owner = "client!h", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
