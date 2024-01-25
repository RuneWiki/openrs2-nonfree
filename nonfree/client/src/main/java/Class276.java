import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class276 {

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
	public final int anInt7744;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class276(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7744 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)I")
	public int method6368() {
		return this.anInt7744;
	}

	@OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
