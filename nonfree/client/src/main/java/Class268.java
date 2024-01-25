import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class268 implements Interface25 {

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	public final int anInt6805;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class268(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6805 = arg1;
	}

	@OriginalMember(owner = "client!oh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
