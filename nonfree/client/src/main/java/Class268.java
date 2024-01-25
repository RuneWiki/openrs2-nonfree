import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class268 {

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
	private final int anInt8123;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public final int anInt8121;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
	public Class268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8123 = arg0;
		this.anInt8121 = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)I")
	public int method7011() {
		return this.anInt8123;
	}
}
