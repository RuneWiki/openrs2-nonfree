import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class194 {

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
	public final int anInt5980;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
	private final int anInt5978;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(II)V")
	public Class194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5980 = arg1;
		this.anInt5978 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)I")
	public int method5152() {
		return this.anInt5978;
	}
}
