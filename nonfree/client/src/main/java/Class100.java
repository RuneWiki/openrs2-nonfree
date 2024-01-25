import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class100 {

	@OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
	private final int anInt3013;

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
	public final int anInt3009;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(II)V")
	public Class100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3013 = arg0;
		this.anInt3009 = arg1;
	}

	@OriginalMember(owner = "client!fba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)I")
	public int method2449() {
		return this.anInt3013;
	}
}
