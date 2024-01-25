import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class4 {

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "Lclient!ad;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "I")
	private int anInt88 = 1;

	@OriginalMember(owner = "client!aca", name = "k", descriptor = "Lclient!bl;")
	private final Class36 aClass36_1;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class4(@OriginalArg(0) Class36 arg0) {
		this.aClass36_1 = arg0;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)I")
	public int method77() {
		return this.anInt88;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IB)V")
	public void method78(@OriginalArg(0) int arg0) {
		this.anInt88 = arg0;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!ad;Z)V")
	public void method79(@OriginalArg(0) Interface2 arg0) {
		if (arg0.method6248() != this.aClass36_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface2_1 = arg0;
	}

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)Lclient!ad;")
	public Interface2 method83() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!aca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
