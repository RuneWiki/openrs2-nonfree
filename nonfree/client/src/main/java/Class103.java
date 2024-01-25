import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class103 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	public final int anInt2257;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V")
	public Class103(@OriginalArg(0) int arg0) {
		this.anInt2257 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
