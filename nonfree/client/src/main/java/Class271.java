import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class271 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public final int anInt8162;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString92;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class271(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8162 = arg1;
		this.aString92 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
