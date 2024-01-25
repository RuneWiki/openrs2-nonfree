import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class289 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	public final int anInt8268;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
	private final int anInt8270;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(II)V")
	public Class289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8268 = arg1;
		this.anInt8270 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)I")
	public int method7045() {
		return this.anInt8270;
	}

	@OriginalMember(owner = "client!qk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
