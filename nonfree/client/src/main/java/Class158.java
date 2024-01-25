import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class158 {

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Lclient!kw;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	private int anInt4426 = 1;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!iaa;")
	private final Class153 aClass153_5;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!iaa;)V")
	public Class158(@OriginalArg(0) Class153 arg0) {
		this.aClass153_5 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!kw;)V")
	public void method3735(@OriginalArg(1) Interface13 arg0) {
		if (arg0.method5812() != this.aClass153_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface13_1 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	public int method3736() {
		return this.anInt4426;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Lclient!kw;")
	public Interface13 method3737() {
		return this.anInterface13_1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
	public void method3738(@OriginalArg(1) int arg0) {
		this.anInt4426 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
