import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class117 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public final int anInt3345;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(II)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3345 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
