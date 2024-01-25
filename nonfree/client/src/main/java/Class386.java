import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public final class Class386 {

	@OriginalMember(owner = "client!via", name = "d", descriptor = "I")
	public final int anInt10494;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public Class386(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		this.anInt10494 = arg3;
	}

	@OriginalMember(owner = "client!via", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
