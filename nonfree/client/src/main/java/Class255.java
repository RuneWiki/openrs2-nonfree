import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public final class Class255 {

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "Lclient!nv;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
	private int anInt7599 = 1;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "Lclient!wea;")
	private final Class370 aClass370_1;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!wea;)V")
	public Class255(@OriginalArg(0) Class370 arg0) {
		this.aClass370_1 = arg0;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I")
	public int method6585() {
		return this.anInt7599;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BI)V")
	public void method6586(@OriginalArg(1) int arg0) {
		this.anInt7599 = arg0;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!nv;I)V")
	public void method6589(@OriginalArg(0) Interface17 arg0) {
		if (arg0.method6809() != this.aClass370_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface17_1 = arg0;
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(Z)Lclient!nv;")
	public Interface17 method6590() {
		return this.anInterface17_1;
	}

	@OriginalMember(owner = "client!paa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
