import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class252 {

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public final int anInt6726;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(II)V")
	public Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6726 = arg1;
	}

	@OriginalMember(owner = "client!oh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
