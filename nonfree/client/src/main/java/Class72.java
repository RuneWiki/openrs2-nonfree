import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class72 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public final int anInt2163;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(I)V")
	public Class72(@OriginalArg(0) int arg0) {
		this.anInt2163 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
