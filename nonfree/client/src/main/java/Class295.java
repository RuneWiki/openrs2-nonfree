import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class295 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
	public final int anInt8311;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class295(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8311 = arg1;
	}

	@OriginalMember(owner = "client!qn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
	public int method7032() {
		return this.anInt8311;
	}
}
