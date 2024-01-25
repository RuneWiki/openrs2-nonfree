import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class286 {

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	private final int anInt8457;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	public final int anInt8455;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(II)V")
	public Class286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8457 = arg0;
		this.anInt8455 = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I")
	public int method7095() {
		return this.anInt8457;
	}

	@OriginalMember(owner = "client!pi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
