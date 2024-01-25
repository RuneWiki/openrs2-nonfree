import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public final class Class91 {

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
	public final int anInt2699;

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "Lclient!qda;")
	private final Class273 aClass273_3;

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
	private final int anInt2698;

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
	public final int anInt2697;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(IILclient!qda;)V")
	public Class91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class273 arg2) {
		this.anInt2699 = arg0;
		this.aClass273_3 = arg2;
		this.anInt2698 = arg1;
		this.anInt2697 = this.aClass273_3.anInt8146 * this.anInt2698;
		if (this.anInt2699 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!efa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
