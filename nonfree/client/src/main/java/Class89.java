import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class89 {

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	public final int anInt2860;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class89(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString66 = arg0;
		this.anInt2860 = arg1;
	}

	@OriginalMember(owner = "client!ei", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
