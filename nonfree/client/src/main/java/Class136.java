import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class136 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public final int anInt3797;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "I")
	private final int anInt3802;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3797 = arg1;
		this.anInt3802 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)I")
	public int method3269() {
		return this.anInt3802;
	}
}
