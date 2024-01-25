import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class38 {

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
	public int anInt1248;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public int anInt1249;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public int anInt1250;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!io;I)V")
	public void method1138(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4393();
			if (local14 == 0) {
				return;
			}
			this.method1140(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILclient!io;)V")
	private void method1140(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt1250 = arg1.method4426();
			this.anInt1248 = arg1.method4393();
			this.anInt1249 = arg1.method4393();
		}
	}
}
