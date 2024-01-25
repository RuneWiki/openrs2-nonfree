import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class174 {

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
	public final int anInt5166;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V")
	public Class174(@OriginalArg(0) int arg0) {
		this.anInt5166 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
