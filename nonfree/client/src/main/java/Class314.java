import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class314 {

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
	public final int anInt8926;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(I)V")
	public Class314(@OriginalArg(0) int arg0) {
		this.anInt8926 = arg0;
	}

	@OriginalMember(owner = "client!sca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
