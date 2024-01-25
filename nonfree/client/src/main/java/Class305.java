import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class305 {

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
	private final int anInt8640;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public final int anInt8638;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(II)V")
	public Class305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8640 = arg0;
		this.anInt8638 = arg1;
	}

	@OriginalMember(owner = "client!rn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I")
	public int method7344() {
		return this.anInt8640;
	}
}
