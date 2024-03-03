import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class170 {

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!un;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_166 = new Class145(42, -1);

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
	public final int anInt4681;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(I)V", line = 207)
	public Class170(@OriginalArg(0) int arg0) {
		this.anInt4681 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "toString", descriptor = "()Ljava/lang/String;", line = 182)
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
