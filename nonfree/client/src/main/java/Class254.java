import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class254 {

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	public final int anInt7557;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
	private final int anInt7558;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(II)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7557 = arg1;
		this.anInt7558 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)I")
	public int method6299() {
		return this.anInt7558;
	}
}
