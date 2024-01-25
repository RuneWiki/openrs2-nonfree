import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class208 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!efa;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!qia;")
	private final Class288 aClass288_1;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	private int anInt5589;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!qia;)V")
	public Class208(@OriginalArg(0) Class288 arg0) {
		this.aClass288_1 = arg0;
		this.anInt5589 = 1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
	public int method4861() {
		return this.anInt5589;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)V")
	public void method4862(@OriginalArg(0) int arg0) {
		this.anInt5589 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lclient!efa;")
	public Interface4 method4863() {
		return this.anInterface4_1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!efa;I)V")
	public void method4867(@OriginalArg(0) Interface4 arg0) {
		if (arg0.method6365() != this.aClass288_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface4_1 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
