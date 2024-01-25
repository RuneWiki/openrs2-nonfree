import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class215 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
	public final int anInt5636;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class215(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5636 = arg1;
	}

	@OriginalMember(owner = "client!lt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)I")
	public int method4790() {
		return this.anInt5636;
	}
}
