import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class258 {

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
	public final int anInt7020;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class258(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7020 = arg1;
	}

	@OriginalMember(owner = "client!vr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
