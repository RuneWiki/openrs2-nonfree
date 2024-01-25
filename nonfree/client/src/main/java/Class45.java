import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class45 {

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	public final int anInt829;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(II)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt829 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
