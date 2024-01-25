import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class38 {

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!wba;")
	private Interface26 anInterface26_1;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Lclient!vca;")
	private final Class353 aClass353_1;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	private int anInt1557;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!vca;)V")
	public Class38(@OriginalArg(0) Class353 arg0) {
		this.aClass353_1 = arg0;
		this.anInt1557 = 1;
	}

	@OriginalMember(owner = "client!bk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lclient!wba;")
	public Interface26 method1359() {
		return this.anInterface26_1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	public void method1360(@OriginalArg(0) int arg0) {
		this.anInt1557 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)I")
	public int method1362() {
		return this.anInt1557;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!wba;I)V")
	public void method1363(@OriginalArg(0) Interface26 arg0) {
		if (arg0.method8362() != this.aClass353_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface26_1 = arg0;
	}
}
