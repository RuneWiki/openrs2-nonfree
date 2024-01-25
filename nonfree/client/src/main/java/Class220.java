import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public final class Class220 {

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
	public final int anInt6506;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public Class220(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		this.anInt6506 = arg3;
	}

	@OriginalMember(owner = "client!mga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
