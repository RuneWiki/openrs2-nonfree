import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public final class Class214 {

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
	public final int anInt6029;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
	private final int anInt6026;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(II)V")
	public Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6029 = arg1;
		this.anInt6026 = arg0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)I")
	public int method4988() {
		return this.anInt6026;
	}

	@OriginalMember(owner = "client!qv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
