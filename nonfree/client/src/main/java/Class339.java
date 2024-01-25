import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class339 {

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[Lclient!fw;")
	public static final Class120[] aClass120Array1 = new Class120[5];

	static {
		for (@Pc(23) int local23 = 0; local23 < aClass120Array1.length; local23++) {
			aClass120Array1[local23] = new Class120();
		}
	}

	@OriginalMember(owner = "client!ui", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
