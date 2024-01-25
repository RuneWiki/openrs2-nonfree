import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class288 {

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public final int anInt7444;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class288(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7444 = arg1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)I")
	public int method6479() {
		return this.anInt7444;
	}

	@OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
