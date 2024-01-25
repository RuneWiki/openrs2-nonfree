import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class168 {

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	public final int anInt4802;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class168(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4802 = arg1;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I")
	public int method4189() {
		return this.anInt4802;
	}

	@OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
