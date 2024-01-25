import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public final class Class229 implements Interface14 {

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
	public final int anInt7099;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class229(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7099 = arg1;
	}

	@OriginalMember(owner = "client!nha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
