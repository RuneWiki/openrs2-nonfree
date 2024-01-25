import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class303 {

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "Lclient!iea;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!qs", name = "m", descriptor = "Lclient!kh;")
	private final Class202 aClass202_5;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
	private int anInt8835;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!kh;)V")
	public Class303(@OriginalArg(0) Class202 arg0) {
		this.aClass202_5 = arg0;
		this.anInt8835 = 1;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)Lclient!iea;")
	public Interface10 method7614() {
		return this.anInterface10_1;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!iea;)V")
	public void method7615(@OriginalArg(1) Interface10 arg0) {
		if (arg0.method6098() != this.aClass202_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface10_1 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)V")
	public void method7616(@OriginalArg(0) int arg0) {
		this.anInt8835 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)I")
	public int method7619() {
		return this.anInt8835;
	}
}
