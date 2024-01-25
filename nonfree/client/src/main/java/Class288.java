import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class288 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	public final int anInt7466;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	private final int anInt7469;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(II)V")
	public Class288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7466 = arg1;
		this.anInt7469 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
	public int method6317() {
		return this.anInt7469;
	}
}
