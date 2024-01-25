import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public final class Class137 {

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	private final int anInt3363;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(II)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3363 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
	public int method2806() {
		return this.anInt3363;
	}
}
