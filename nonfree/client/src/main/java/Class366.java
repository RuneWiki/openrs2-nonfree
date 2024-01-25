import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class366 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public final int anInt10394;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class366(@OriginalArg(0) int arg0) {
		this.anInt10394 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
