import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class170 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "Lclient!bja;")
	private final Class36 aClass36_11;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	private final int anInt4516;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
	public final int anInt4517;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
	public final int anInt4519;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IILclient!bja;)V")
	public Class170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class36 arg2) {
		this.aClass36_11 = arg2;
		this.anInt4516 = arg1;
		this.anInt4517 = arg0;
		this.anInt4519 = this.aClass36_11.anInt1130 * this.anInt4516;
		if (this.anInt4517 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
