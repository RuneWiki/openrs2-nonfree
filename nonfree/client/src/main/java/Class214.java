import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public final class Class214 {

	@OriginalMember(owner = "client!lia", name = "l", descriptor = "I")
	private final int anInt5277;

	@OriginalMember(owner = "client!lia", name = "k", descriptor = "I")
	public final int anInt5276;

	@OriginalMember(owner = "client!lia", name = "f", descriptor = "Lclient!dw;")
	private final Class79 aClass79_15;

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "I")
	public final int anInt5272;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(IILclient!dw;)V")
	public Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class79 arg2) {
		this.anInt5277 = arg1;
		this.anInt5276 = arg0;
		this.aClass79_15 = arg2;
		this.anInt5272 = this.aClass79_15.anInt2185 * this.anInt5277;
		if (this.anInt5276 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
