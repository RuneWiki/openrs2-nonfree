import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class73 {

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
	public final int anInt2322;

	static {
		new Class21(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class73(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2322 = arg1;
	}

	@OriginalMember(owner = "client!fh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	public int method2123() {
		return this.anInt2322;
	}
}
