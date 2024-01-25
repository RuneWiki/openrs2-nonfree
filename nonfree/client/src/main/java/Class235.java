import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class235 {

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	public final int anInt6819;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I)V")
	public Class235(@OriginalArg(0) int arg0) {
		this.anInt6819 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
