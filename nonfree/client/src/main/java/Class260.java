import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class260 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "I")
	public final int anInt7205;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V")
	public Class260(@OriginalArg(0) int arg0) {
		this.anInt7205 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
