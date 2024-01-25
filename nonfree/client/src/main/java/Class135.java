import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class135 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public final int anInt4267;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I)V")
	public Class135(@OriginalArg(0) int arg0) {
		this.anInt4267 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
