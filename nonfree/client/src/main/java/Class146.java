import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class146 {

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
	public final int anInt4343;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(II)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4343 = arg1;
	}

	@OriginalMember(owner = "client!hv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
