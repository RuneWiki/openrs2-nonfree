import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class303 {

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	private final int anInt7887;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public final int anInt7886;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(II)V")
	public Class303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7887 = arg0;
		this.anInt7886 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I")
	public int method6556() {
		return this.anInt7887;
	}
}
