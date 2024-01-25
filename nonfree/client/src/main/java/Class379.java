import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class Class379 implements Interface1 {

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
	public final int anInt10126;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class379(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt10126 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
