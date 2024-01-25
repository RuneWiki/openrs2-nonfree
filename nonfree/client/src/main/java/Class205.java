import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class205 {

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private final int anInt5016;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	public final int anInt5017;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II)V")
	public Class205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5016 = arg0;
		this.anInt5017 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)I")
	public int method4376() {
		return this.anInt5016;
	}

	@OriginalMember(owner = "client!rc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
