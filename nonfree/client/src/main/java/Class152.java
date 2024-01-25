import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class152 {

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	public final int anInt4837;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(II)V")
	public Class152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4837 = arg1;
	}

	@OriginalMember(owner = "client!io", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
