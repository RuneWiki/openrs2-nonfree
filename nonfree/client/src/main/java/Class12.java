import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class12 {

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	public final int anInt299;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	private final int anInt298;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(II)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt299 = arg1;
		this.anInt298 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)I")
	public int method231() {
		return this.anInt298;
	}

	@OriginalMember(owner = "client!ao", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
