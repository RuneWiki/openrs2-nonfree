import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class184 {

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "Lclient!jea;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
	private int anInt5211 = 1;

	@OriginalMember(owner = "client!ku", name = "i", descriptor = "Lclient!dda;")
	private final Class64 aClass64_5;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!dda;)V")
	public Class184(@OriginalArg(0) Class64 arg0) {
		this.aClass64_5 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)I")
	public int method4493() {
		return this.anInt5211;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)V")
	public void method4494(@OriginalArg(1) int arg0) {
		this.anInt5211 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILclient!jea;)V")
	public void method4496(@OriginalArg(1) Interface15 arg0) {
		if (arg0.method6481() != this.aClass64_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface15_1 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Lclient!jea;")
	public Interface15 method4500() {
		return this.anInterface15_1;
	}
}
