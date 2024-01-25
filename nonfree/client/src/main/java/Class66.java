import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class66 {

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "Lclient!rba;")
	private Interface24 anInterface24_1;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "Lclient!bja;")
	private final Class39 aClass39_5;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	private int anInt1435;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!bja;)V")
	public Class66(@OriginalArg(0) Class39 arg0) {
		this.aClass39_5 = arg0;
		this.anInt1435 = 1;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)I")
	public int method1304() {
		return this.anInt1435;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!rba;I)V")
	public void method1305(@OriginalArg(0) Interface24 arg0) {
		if (arg0.method7365() != this.aClass39_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface24_1 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V")
	public void method1310(@OriginalArg(0) int arg0) {
		this.anInt1435 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)Lclient!rba;")
	public Interface24 method1311() {
		return this.anInterface24_1;
	}
}
