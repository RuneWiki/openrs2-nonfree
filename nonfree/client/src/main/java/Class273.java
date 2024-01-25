import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class273 {

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
	public final int anInt8146;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(I)V")
	public Class273(@OriginalArg(0) int arg0) {
		this.anInt8146 = arg0;
	}

	@OriginalMember(owner = "client!qda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
