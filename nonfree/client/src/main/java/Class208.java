import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public final class Class208 {

	@OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
	private final int anInt6545;

	@OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
	public final int anInt6548;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(II)V")
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6545 = arg0;
		this.anInt6548 = arg1;
	}

	@OriginalMember(owner = "client!mia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(B)I")
	public int method5624() {
		return this.anInt6545;
	}
}
