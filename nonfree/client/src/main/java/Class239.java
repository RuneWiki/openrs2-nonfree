import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class239 {

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public final int anInt6816;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class239(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6816 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
