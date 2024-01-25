import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public abstract class Class92 {

	@OriginalMember(owner = "client!io", name = "e", descriptor = "[I")
	public static final int[] anIntArray263;

	static {
		new Class159("From", "Von:", "De", "De");
		anIntArray263 = new int[4096];
		for (@Pc(12) int local12 = 0; local12 < 4096; local12++) {
			anIntArray263[local12] = Static229.method4082(local12);
		}
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	protected Class92() {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public abstract void method2615();

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	public abstract void method2618();

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)Lclient!pk;")
	public abstract Class157 method2619();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Z")
	public abstract boolean method2620(@OriginalArg(1) int arg0);
}
