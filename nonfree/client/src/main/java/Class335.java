import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class335 {

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "I")
	public final int anInt8864;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(I)V")
	public Class335(@OriginalArg(0) int arg0) {
		this.anInt8864 = arg0;
	}

	@OriginalMember(owner = "client!sca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
