import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class79 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	private final int anInt2602;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!ne;")
	private final Class239 aClass239_3;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public final int anInt2605;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	public final int anInt2606;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IILclient!ne;)V")
	public Class79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2) {
		this.anInt2602 = arg1;
		this.aClass239_3 = arg2;
		this.anInt2605 = arg0;
		this.anInt2606 = this.anInt2602 * this.aClass239_3.anInt6113;
		if (this.anInt2605 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
