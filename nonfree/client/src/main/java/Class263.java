import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class263 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!ma;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Lclient!dea;")
	private final Class68 aClass68_5;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
	private int anInt7085;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!dea;)V")
	public Class263(@OriginalArg(0) Class68 arg0) {
		this.aClass68_5 = arg0;
		this.anInt7085 = 1;
	}

	@OriginalMember(owner = "client!pt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)Lclient!ma;")
	public Interface12 method5943() {
		return this.anInterface12_1;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZ)V")
	public void method5945(@OriginalArg(0) int arg0) {
		this.anInt7085 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)I")
	public int method5949() {
		return this.anInt7085;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!ma;B)V")
	public void method5951(@OriginalArg(0) Interface12 arg0) {
		if (arg0.method6882() != this.aClass68_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface12_1 = arg0;
	}
}
