import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class254 {

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
	public final int anInt7322;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V")
	public Class254(@OriginalArg(0) int arg0) {
		this.anInt7322 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
