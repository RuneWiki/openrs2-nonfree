import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class188 implements Interface18 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public final int anInt5469;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class188(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5469 = arg1;
	}

	@OriginalMember(owner = "client!kg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
