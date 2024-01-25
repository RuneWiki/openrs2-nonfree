import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public final class Class314 {

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
	public final int anInt8032;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V")
	public Class314(@OriginalArg(0) int arg0) {
		this.anInt8032 = arg0;
	}

	@OriginalMember(owner = "client!sq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
