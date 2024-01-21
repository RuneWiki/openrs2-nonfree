import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub4_Sub16 extends Class2_Sub4 {

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
	public int anInt3348 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZLclient!ab;)V")
	private void method2321(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 2) {
			this.anInt3348 = arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ab;I)V")
	public void method2323(@OriginalArg(0) Class2_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1698();
			if (local5 == 0) {
				return;
			}
			this.method2321(local5, arg0);
		}
	}
}
