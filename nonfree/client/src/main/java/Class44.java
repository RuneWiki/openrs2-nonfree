import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class44 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!dl;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
	private int anInt1405 = 1;

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "Lclient!bq;")
	private final Class46 aClass46_1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!bq;)V")
	public Class44(@OriginalArg(0) Class46 arg0) {
		this.aClass46_1 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!dl;Z)V")
	public void method1311(@OriginalArg(0) Interface5 arg0) {
		if (arg0.method9563() != this.aClass46_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface5_1 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)Lclient!dl;")
	public Interface5 method1316() {
		return this.anInterface5_1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)I")
	public int method1318() {
		return this.anInt1405;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
	public void method1319(@OriginalArg(0) int arg0) {
		this.anInt1405 = arg0;
	}
}
