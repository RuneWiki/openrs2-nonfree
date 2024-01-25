import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class310 {

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
	public final int anInt9213;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(II)V")
	public Class310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9213 = arg1;
	}

	@OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
