import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class211 {

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!ta;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	private int anInt6056 = 1;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!pw;")
	private final Class290 aClass290_1;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!pw;)V")
	public Class211(@OriginalArg(0) Class290 arg0) {
		this.aClass290_1 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Lclient!ta;")
	public Interface19 method5482() {
		return this.anInterface19_1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ta;I)V")
	public void method5484(@OriginalArg(0) Interface19 arg0) {
		if (arg0.method9335() != this.aClass290_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface19_1 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
	public void method5485(@OriginalArg(0) int arg0) {
		this.anInt6056 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)I")
	public int method5487() {
		return this.anInt6056;
	}
}
