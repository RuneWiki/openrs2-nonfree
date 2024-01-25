import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class306 {

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public final int anInt8954;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
	public Class306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8954 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
