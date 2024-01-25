import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class359 {

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
	public final int anInt10092;

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
	private final int anInt10090;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(II)V")
	public Class359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10092 = arg1;
		this.anInt10090 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I")
	public int method8394() {
		return this.anInt10090;
	}

	@OriginalMember(owner = "client!uw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
