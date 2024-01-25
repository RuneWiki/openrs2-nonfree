import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class155 implements Interface1 {

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
	public final int anInt4520;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4520 = arg1;
	}

	@OriginalMember(owner = "client!jr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
