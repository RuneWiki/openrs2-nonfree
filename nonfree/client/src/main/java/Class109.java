import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class109 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "I")
	public final int anInt3299;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class109(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3299 = arg1;
	}

	@OriginalMember(owner = "client!fs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
