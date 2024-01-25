import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class298 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public final int anInt7690;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	private final int anInt7689;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(II)V")
	public Class298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7690 = arg1;
		this.anInt7689 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)I")
	public int method6498() {
		return this.anInt7689;
	}
}
