import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class340 {

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
	public final int anInt9068;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(I)V")
	public Class340(@OriginalArg(0) int arg0) {
		this.anInt9068 = arg0;
	}

	@OriginalMember(owner = "client!vea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
