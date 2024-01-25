import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class299 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public final int anInt8686;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class299(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8686 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
	public int method7080() {
		return this.anInt8686;
	}

	@OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
