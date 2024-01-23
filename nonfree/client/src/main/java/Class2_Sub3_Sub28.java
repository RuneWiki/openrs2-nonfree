import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub3_Sub28 extends Class2_Sub3 {

	@OriginalMember(owner = "client!v", name = "I", descriptor = "I")
	public int anInt4635;

	@OriginalMember(owner = "client!v", name = "L", descriptor = "I")
	public int anInt4637;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
	public int anInt4641;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!nh;B)V")
	public void method3683(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method2122();
			if (local8 == 0) {
				return;
			}
			this.method3685(local8, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZLclient!nh;)V")
	private void method3685(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt4641 = arg1.method2095();
			this.anInt4635 = arg1.method2122();
			this.anInt4637 = arg1.method2122();
		}
	}
}
