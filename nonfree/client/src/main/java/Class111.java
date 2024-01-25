import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class111 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	public final int anInt3148;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(II)V")
	public Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3148 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
