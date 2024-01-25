import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class183 {

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
	private final int anInt5106;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(II)V")
	public Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5106 = arg0;
	}

	@OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I")
	public int method4573() {
		return this.anInt5106;
	}
}
