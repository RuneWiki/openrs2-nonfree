import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public final class Class235 {

	@OriginalMember(owner = "client!nea", name = "c", descriptor = "I")
	public final int anInt5788;

	@OriginalMember(owner = "client!nea", name = "d", descriptor = "I")
	private final int anInt5789;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(II)V")
	public Class235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5788 = arg1;
		this.anInt5789 = arg0;
	}

	@OriginalMember(owner = "client!nea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)I")
	public int method4740() {
		return this.anInt5789;
	}
}
