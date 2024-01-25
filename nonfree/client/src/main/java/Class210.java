import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class210 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public final int anInt5872;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class210(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5872 = arg1;
	}

	@OriginalMember(owner = "client!nd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
	public int method5036() {
		return this.anInt5872;
	}
}
