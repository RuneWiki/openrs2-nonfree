import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class21 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
	public final int anInt686;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class21(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt686 = arg1;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
	public int method558() {
		return this.anInt686;
	}

	@OriginalMember(owner = "client!ap", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
