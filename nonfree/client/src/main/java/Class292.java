import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public final class Class292 {

	@OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
	public final int anInt8024;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(I)V")
	public Class292(@OriginalArg(0) int arg0) {
		this.anInt8024 = arg0;
	}

	@OriginalMember(owner = "client!uda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
