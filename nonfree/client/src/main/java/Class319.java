import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class319 {

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
	public final int anInt8573;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
	private final int anInt8567;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(II)V")
	public Class319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8573 = arg1;
		this.anInt8567 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)I")
	public int method7096() {
		return this.anInt8567;
	}
}
