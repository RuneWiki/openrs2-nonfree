import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public final class Class244 {

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
	public final int anInt6597;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(II)V")
	public Class244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6597 = arg0;
	}

	@OriginalMember(owner = "client!nha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
