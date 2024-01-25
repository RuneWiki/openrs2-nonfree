import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class178 {

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	public final int anInt5057;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class178(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5057 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)I")
	public int method4075() {
		return this.anInt5057;
	}
}
