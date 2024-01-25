import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class381 {

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	private final int anInt10521;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
	public final int anInt10520;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(II)V")
	public Class381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10521 = arg0;
		this.anInt10520 = arg1;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)I")
	public int method8886() {
		return this.anInt10521;
	}

	@OriginalMember(owner = "client!vn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
