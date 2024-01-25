import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class28 {

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "Lclient!ju;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
	private int anInt703 = 1;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!gj;")
	private final Class115 aClass115_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class28(@OriginalArg(0) Class115 arg0) {
		this.aClass115_1 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lclient!ju;")
	public Interface13 method598() {
		return this.anInterface13_1;
	}

	@OriginalMember(owner = "client!bb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)I")
	public int method599() {
		return this.anInt703;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
	public void method600(@OriginalArg(1) int arg0) {
		this.anInt703 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!ju;)V")
	public void method601(@OriginalArg(1) Interface13 arg0) {
		if (arg0.method8509() != this.aClass115_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface13_1 = arg0;
	}
}
