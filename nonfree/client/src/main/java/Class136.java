import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public final class Class136 {

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "I")
	public final int anInt3990;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class136(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3990 = arg1;
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)I")
	public int method3671() {
		return this.anInt3990;
	}

	@OriginalMember(owner = "client!gia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
