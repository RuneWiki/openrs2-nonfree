import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class192 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public final int anInt5553;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class192(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5553 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
	public int method4776() {
		return this.anInt5553;
	}

	@OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
