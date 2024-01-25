import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class186 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public final int anInt5431;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	private final int anInt5436;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
	public Class186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5431 = arg1;
		this.anInt5436 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
	public int method4177() {
		return this.anInt5436;
	}

	@OriginalMember(owner = "client!pg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
