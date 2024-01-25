import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public final class Class16 {

	@OriginalMember(owner = "client!aka", name = "g", descriptor = "I")
	public final int anInt484;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class16(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt484 = arg1;
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)I")
	public int method477() {
		return this.anInt484;
	}

	@OriginalMember(owner = "client!aka", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
