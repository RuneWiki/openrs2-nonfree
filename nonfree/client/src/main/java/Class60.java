import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class60 implements Interface3 {

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	public final int anInt1640;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class60(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1640 = arg1;
	}

	@OriginalMember(owner = "client!eg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
