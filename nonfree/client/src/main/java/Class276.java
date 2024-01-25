import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class276 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public final int anInt7331;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V")
	public Class276(@OriginalArg(0) int arg0) {
		this.anInt7331 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
