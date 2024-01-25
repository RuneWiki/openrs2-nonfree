import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class161 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
	public final int anInt4850;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V")
	public Class161(@OriginalArg(0) int arg0) {
		this.anInt4850 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
