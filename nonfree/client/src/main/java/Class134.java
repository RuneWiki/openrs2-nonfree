import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class134 {

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
	public final int anInt4088;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class134(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4088 = arg1;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I")
	public int method3265() {
		return this.anInt4088;
	}

	@OriginalMember(owner = "client!ko", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
