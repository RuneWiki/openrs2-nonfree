import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class269 {

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
	public final int anInt7852;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class269(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7852 = arg1;
	}

	@OriginalMember(owner = "client!wv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
