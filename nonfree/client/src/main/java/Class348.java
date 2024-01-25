import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class348 {

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
	public final int anInt10037;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class348(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt10037 = arg1;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I")
	public int method8142() {
		return this.anInt10037;
	}

	@OriginalMember(owner = "client!uw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
