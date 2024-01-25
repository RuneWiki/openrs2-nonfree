import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class394 implements Interface8 {

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
	public final int anInt10866;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class394(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt10866 = arg1;
	}

	@OriginalMember(owner = "client!wu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
