import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class260 {

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
	public final int anInt6879;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(II)V")
	public Class260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6879 = arg1;
	}

	@OriginalMember(owner = "client!ph", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
