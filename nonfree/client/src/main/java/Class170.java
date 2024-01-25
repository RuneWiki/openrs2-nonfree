import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class170 {

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "Lclient!bga;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
	private int anInt4286 = 1;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "Lclient!vm;")
	private final Class365 aClass365_1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!vm;)V")
	public Class170(@OriginalArg(0) Class365 arg0) {
		this.aClass365_1 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
	public void method3736(@OriginalArg(1) int arg0) {
		this.anInt4286 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Lclient!bga;")
	public Interface2 method3738() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)I")
	public int method3739() {
		return this.anInt4286;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!bga;B)V")
	public void method3740(@OriginalArg(0) Interface2 arg0) {
		if (arg0.method7204() != this.aClass365_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface2_1 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
