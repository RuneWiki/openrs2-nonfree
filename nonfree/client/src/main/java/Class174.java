import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class174 {

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public final int anInt4603;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4603 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
