import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class80 {

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
	public final int anInt2104;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class80(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2104 = arg1;
	}

	@OriginalMember(owner = "client!eaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
