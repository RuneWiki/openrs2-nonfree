import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class316 {

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString98;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	public final int anInt9447;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class316(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString98 = arg0;
		this.anInt9447 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
