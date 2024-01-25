import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class341 {

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!dg;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	private int anInt9465 = 1;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!kt;")
	private final Class201 aClass201_5;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!kt;)V")
	public Class341(@OriginalArg(0) Class201 arg0) {
		this.aClass201_5 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lclient!dg;")
	public Interface3 method7724() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I")
	public int method7725() {
		return this.anInt9465;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLclient!dg;)V")
	public void method7726(@OriginalArg(1) Interface3 arg0) {
		if (arg0.method8318() != this.aClass201_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface3_1 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)V")
	public void method7727(@OriginalArg(0) int arg0) {
		this.anInt9465 = arg0;
	}
}
