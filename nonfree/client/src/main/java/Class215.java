import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public final class Class215 {

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
	public final int anInt6727;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V")
	public Class215(@OriginalArg(0) int arg0) {
		this.anInt6727 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
