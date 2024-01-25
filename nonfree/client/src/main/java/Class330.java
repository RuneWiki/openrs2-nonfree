import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class330 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	public final int anInt8941;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I)V")
	public Class330(@OriginalArg(0) int arg0) {
		this.anInt8941 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
