import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class139 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
	public final int anInt3798;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class139(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3798 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)I")
	public int method3087() {
		return this.anInt3798;
	}

	@OriginalMember(owner = "client!hm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
