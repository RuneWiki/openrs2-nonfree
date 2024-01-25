import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class18 {

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Lclient!jca;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!saa;")
	private final Class309 aClass309_1;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!saa;)V")
	public Class18(@OriginalArg(0) Class309 arg0) {
		this.aClass309_1 = arg0;
		this.anInt437 = 1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public void method455(@OriginalArg(1) int arg0) {
		this.anInt437 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!jca;)V")
	public void method456(@OriginalArg(1) Interface14 arg0) {
		if (arg0.method3687() != this.aClass309_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface14_1 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I")
	public int method460() {
		return this.anInt437;
	}

	@OriginalMember(owner = "client!al", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Lclient!jca;")
	public Interface14 method463() {
		return this.anInterface14_1;
	}
}
