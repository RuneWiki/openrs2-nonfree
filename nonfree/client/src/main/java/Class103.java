import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public final class Class103 {

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
	public final int anInt3267;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(II)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3267 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
