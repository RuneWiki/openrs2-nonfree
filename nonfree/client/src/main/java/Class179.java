import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class179 {

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	public final int anInt4730;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(II)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4730 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
