import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public final class Class180 {

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "I")
	private final int anInt4954;

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
	public final int anInt4953;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(II)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4954 = arg0;
		this.anInt4953 = arg1;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I")
	public int method4564() {
		return this.anInt4954;
	}

	@OriginalMember(owner = "client!jw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
