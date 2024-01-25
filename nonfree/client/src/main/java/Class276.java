import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class276 {

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	private final int anInt8406;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	public final int anInt8403;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(II)V")
	public Class276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8406 = arg0;
		this.anInt8403 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
	public int method6903() {
		return this.anInt8406;
	}

	@OriginalMember(owner = "client!ra", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
