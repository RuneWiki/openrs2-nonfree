import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public final class Class269 {

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
	public final int anInt8075;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class269(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8075 = arg1;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)I")
	public int method6679() {
		return this.anInt8075;
	}

	@OriginalMember(owner = "client!rw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
