import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public final class Class216 {

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public final int anInt5923;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(I)V")
	public Class216(@OriginalArg(0) int arg0) {
		this.anInt5923 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
