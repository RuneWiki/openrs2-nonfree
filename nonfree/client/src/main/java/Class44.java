import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class44 {

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
	public final int anInt1386;

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
	private final int anInt1388;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1386 = arg1;
		this.anInt1388 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I")
	public int method1191() {
		return this.anInt1388;
	}

	@OriginalMember(owner = "client!bu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
