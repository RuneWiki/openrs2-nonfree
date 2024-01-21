import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
	public int anInt1140 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!wb;B)V")
	public void method605(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1780();
			if (local17 == 0) {
				return;
			}
			this.method607(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!wb;I)V")
	private void method607(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt1140 = arg0.method1783();
		}
	}
}
