import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public final class Class82 {

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "I")
	public final int anInt2007;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V")
	public Class82(@OriginalArg(0) int arg0) {
		this.anInt2007 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
