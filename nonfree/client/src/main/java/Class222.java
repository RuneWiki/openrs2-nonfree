import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class222 implements Interface6 {

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
	public final int anInt5459;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class222(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5459 = arg1;
	}

	@OriginalMember(owner = "client!mea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
