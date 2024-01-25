import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class217 {

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
	private final int anInt5978;

	static {
		new Class189(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(II)V")
	public Class217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5978 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I")
	public int method4668() {
		return this.anInt5978;
	}

	@OriginalMember(owner = "client!rn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
