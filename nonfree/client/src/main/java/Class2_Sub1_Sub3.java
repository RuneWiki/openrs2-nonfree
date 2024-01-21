import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
	public int anInt259;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!wb;IB)V")
	private void method151(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt257 = arg0.method1783();
			this.anInt259 = arg0.method1780();
			this.anInt256 = arg0.method1780();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!wb;)V")
	public void method153(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1780();
			if (local17 == 0) {
				return;
			}
			this.method151(arg0, local17);
		}
	}
}
