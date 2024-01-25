import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class341 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
	public final int anInt9728;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
	private final int anInt9732;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(II)V")
	public Class341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9728 = arg1;
		this.anInt9732 = arg0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)I")
	public int method8531() {
		return this.anInt9732;
	}

	@OriginalMember(owner = "client!sv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
