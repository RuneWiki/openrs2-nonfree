import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class6 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!naa;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	private int anInt112 = 1;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!wa;")
	private final Class356 aClass356_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Class6(@OriginalArg(0) Class356 arg0) {
		this.aClass356_1 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	public void method112(@OriginalArg(0) int arg0) {
		this.anInt112 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
	public int method113() {
		return this.anInt112;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!naa;)V")
	public void method114(@OriginalArg(1) Interface15 arg0) {
		if (arg0.method4824() != this.aClass356_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface15_1 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Lclient!naa;")
	public Interface15 method117() {
		return this.anInterface15_1;
	}
}
