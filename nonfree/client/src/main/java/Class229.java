import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class229 implements Interface2 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public final int anInt5883;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class229(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5883 = arg1;
	}

	@OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
