import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class274 {

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
	private final int anInt7958;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public final int anInt7957;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
	public Class274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7958 = arg0;
		this.anInt7957 = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
	public int method6661() {
		return this.anInt7958;
	}
}
