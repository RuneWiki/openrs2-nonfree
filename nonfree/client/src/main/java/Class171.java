import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class171 {

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public final int anInt4462;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(I)V")
	public Class171(@OriginalArg(0) int arg0) {
		this.anInt4462 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
