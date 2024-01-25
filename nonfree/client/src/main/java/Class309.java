import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class309 {

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
	public final int anInt8217;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class309(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.aString103 = arg0;
		this.anInt8217 = arg2;
	}

	@OriginalMember(owner = "client!qh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
