import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class103 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
	public final int anInt2290;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class103(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2290 = arg1;
	}

	@OriginalMember(owner = "client!ep", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)I")
	public int method2065() {
		return this.anInt2290;
	}
}
