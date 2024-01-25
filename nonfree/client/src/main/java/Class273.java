import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class273 {

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "Lclient!js;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "Lclient!gb;")
	private final Class139 aClass139_5;

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "I")
	private int anInt7699;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!gb;)V")
	public Class273(@OriginalArg(0) Class139 arg0) {
		this.aClass139_5 = arg0;
		this.anInt7699 = 1;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZI)V")
	public void method6449(@OriginalArg(1) int arg0) {
		this.anInt7699 = arg0;
	}

	@OriginalMember(owner = "client!paa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)Lclient!js;")
	public Interface14 method6452() {
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I")
	public int method6454() {
		return this.anInt7699;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!js;)V")
	public void method6457(@OriginalArg(1) Interface14 arg0) {
		if (arg0.method7866() != this.aClass139_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface14_1 = arg0;
	}
}
