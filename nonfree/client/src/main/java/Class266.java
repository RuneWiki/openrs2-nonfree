import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class266 implements Interface11 {

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
	public final int anInt7492;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class266(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7492 = arg1;
	}

	@OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
