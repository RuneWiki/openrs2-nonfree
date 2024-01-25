import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class201 {

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	public final int anInt5077;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class201(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5077 = arg1;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)I")
	public int method4061() {
		return this.anInt5077;
	}

	@OriginalMember(owner = "client!pp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
