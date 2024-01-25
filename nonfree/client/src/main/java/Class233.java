import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class233 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	public final int anInt6408;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class233(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6408 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
	public int method5030() {
		return this.anInt6408;
	}

	@OriginalMember(owner = "client!td", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
