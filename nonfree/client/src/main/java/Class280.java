import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class280 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Lclient!or;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!dca;")
	private final Class77 aClass77_5;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	private int anInt7726;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!dca;)V")
	public Class280(@OriginalArg(0) Class77 arg0) {
		this.aClass77_5 = arg0;
		this.anInt7726 = 1;
	}

	@OriginalMember(owner = "client!pl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
	public int method6523() {
		return this.anInt7726;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!or;Z)V")
	public void method6526(@OriginalArg(0) Interface22 arg0) {
		if (arg0.method8098() != this.aClass77_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lclient!or;")
	public Interface22 method6527() {
		return this.anInterface22_1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)V")
	public void method6528(@OriginalArg(1) int arg0) {
		this.anInt7726 = arg0;
	}
}
