import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class311 implements Interface16 {

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	public final int anInt8989;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class311(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8989 = arg1;
	}

	@OriginalMember(owner = "client!sm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
