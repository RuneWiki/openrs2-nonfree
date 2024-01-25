import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class153 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	public final int anInt4743;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class153(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4743 = arg1;
	}

	@OriginalMember(owner = "client!j", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)I")
	public int method3813() {
		return this.anInt4743;
	}
}
