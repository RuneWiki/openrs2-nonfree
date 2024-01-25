import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class107 {

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "Lclient!sn;")
	private Interface23 anInterface23_1;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
	private int anInt2828 = 1;

	@OriginalMember(owner = "client!fba", name = "g", descriptor = "Lclient!tj;")
	private final Class320 aClass320_1;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!tj;)V")
	public Class107(@OriginalArg(0) Class320 arg0) {
		this.aClass320_1 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Lclient!sn;")
	public Interface23 method2299() {
		return this.anInterface23_1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)I")
	public int method2300() {
		return this.anInt2828;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!sn;B)V")
	public void method2302(@OriginalArg(0) Interface23 arg0) {
		if (arg0.method6598() != this.aClass320_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface23_1 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)V")
	public void method2303(@OriginalArg(0) int arg0) {
		this.anInt2828 = arg0;
	}

	@OriginalMember(owner = "client!fba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
