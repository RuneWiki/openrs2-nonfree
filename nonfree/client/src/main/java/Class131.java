import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class131 implements Interface7 {

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	public final int anInt4202;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class131(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4202 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
