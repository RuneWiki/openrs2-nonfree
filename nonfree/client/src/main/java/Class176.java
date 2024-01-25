import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class176 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
	public final int anInt6139;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V")
	public Class176(@OriginalArg(0) int arg0) {
		this.anInt6139 = arg0;
	}

	@OriginalMember(owner = "client!kq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
