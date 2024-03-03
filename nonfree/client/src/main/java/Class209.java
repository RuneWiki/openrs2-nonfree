import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class209 {

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_203 = new Class145(59, 18);

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "[Lclient!pr;")
	public static final Class185[] aClass185Array1 = new Class185[4];

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
	public final int anInt5791;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 68)
	public Class209(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5791 = arg1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I", line = 3)
	public int method5283() {
		return this.anInt5791;
	}

	@OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;", line = 78)
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
