import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class236 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
	public int anInt6874;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public int anInt6875;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public int anInt6876;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class236() {
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class236(@OriginalArg(0) Class236 arg0) {
		this.anInt6875 = arg0.anInt6875;
		this.anInt6876 = arg0.anInt6876;
		this.anInt6874 = arg0.anInt6874;
	}
}
