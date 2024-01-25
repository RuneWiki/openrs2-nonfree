import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public final class Class181 {

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
	private final int anInt4535;

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
	public final int anInt4534;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(II)V")
	public Class181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4535 = arg0;
		this.anInt4534 = arg1;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
	public int method4154() {
		return this.anInt4535;
	}

	@OriginalMember(owner = "client!kaa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
