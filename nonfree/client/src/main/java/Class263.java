import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class263 {

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
	public final int anInt7741;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
	private final int anInt7737;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(II)V")
	public Class263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7741 = arg1;
		this.anInt7737 = arg0;
	}

	@OriginalMember(owner = "client!vv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)I")
	public int method5904() {
		return this.anInt7737;
	}
}
