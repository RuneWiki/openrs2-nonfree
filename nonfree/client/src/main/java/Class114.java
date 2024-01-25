import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class114 {

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
	public final int anInt2411;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(I)V")
	public Class114(@OriginalArg(0) int arg0) {
		this.anInt2411 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
