import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class174 {

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	public final int anInt5111;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class174(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5111 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
	public int method4738() {
		return this.anInt5111;
	}
}
