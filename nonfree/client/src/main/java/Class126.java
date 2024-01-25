import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class126 {

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
	public final int anInt3445;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(II)V")
	public Class126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3445 = arg0;
	}

	@OriginalMember(owner = "client!gga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
