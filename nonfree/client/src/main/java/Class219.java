import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public final class Class219 {

	@OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
	public final int anInt6222;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(II)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6222 = arg0;
	}

	@OriginalMember(owner = "client!naa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
