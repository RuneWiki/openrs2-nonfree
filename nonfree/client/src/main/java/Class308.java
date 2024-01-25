import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class308 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	public final int anInt8097;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class308(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8097 = arg1;
	}

	@OriginalMember(owner = "client!sn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
