import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class5_Sub2_Sub16 extends Class5_Sub2 {

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
	public int anInt3006;

	@OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
	public int anInt3009;

	@OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
	public int anInt3012;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!hb;BI)V")
	private void method2082(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3009 = arg0.method1418();
			this.anInt3012 = arg0.method1408();
			this.anInt3006 = arg0.method1408();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BLclient!hb;)V")
	public void method2084(@OriginalArg(1) Class5_Sub9 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1408();
			if (local3 == 0) {
				return;
			}
			this.method2082(arg0, local3);
		}
	}
}
