import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class137 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	public final int anInt4298;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(II)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4298 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
