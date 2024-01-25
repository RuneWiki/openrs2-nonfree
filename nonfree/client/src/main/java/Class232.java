import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class232 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
	public final int anInt6494;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(II)V")
	public Class232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6494 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
