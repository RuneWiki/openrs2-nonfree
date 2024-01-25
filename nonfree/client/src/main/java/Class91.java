import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class91 {

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
	public final int anInt3293;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V")
	public Class91(@OriginalArg(0) int arg0) {
		this.anInt3293 = arg0;
	}

	@OriginalMember(owner = "client!fp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
