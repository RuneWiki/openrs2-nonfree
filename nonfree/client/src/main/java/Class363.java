import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class363 {

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "I")
	public final int anInt10558;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(I)V")
	public Class363(@OriginalArg(0) int arg0) {
		this.anInt10558 = arg0;
	}

	@OriginalMember(owner = "client!vea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
