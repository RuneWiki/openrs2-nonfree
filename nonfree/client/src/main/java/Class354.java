import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class354 implements Interface4 {

	@OriginalMember(owner = "client!um", name = "g", descriptor = "I")
	public final int anInt10108;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class354(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt10108 = arg1;
	}

	@OriginalMember(owner = "client!um", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
