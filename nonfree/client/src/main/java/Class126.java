import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public final class Class126 {

	@OriginalMember(owner = "client!fja", name = "d", descriptor = "I")
	private final int anInt3049;

	@OriginalMember(owner = "client!fja", name = "f", descriptor = "I")
	public final int anInt3051;

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(II)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3049 = arg0;
		this.anInt3051 = arg1;
	}

	@OriginalMember(owner = "client!fja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)I")
	public int method2788() {
		return this.anInt3049;
	}
}
