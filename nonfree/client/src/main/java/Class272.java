import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public final class Class272 {

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
	private final int anInt7128;

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
	public final int anInt7130;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(II)V")
	public Class272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7128 = arg0;
		this.anInt7130 = arg1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)I")
	public int method6072() {
		return this.anInt7128;
	}

	@OriginalMember(owner = "client!qfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
