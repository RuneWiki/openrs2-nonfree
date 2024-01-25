import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class3_Sub3_Sub5 extends Class3_Sub3 {

	@OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
	public int anInt852 = 0;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method635(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method3118();
			if (local11 == 0) {
				return;
			}
			this.method637(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILclient!qh;I)V")
	private void method637(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 2) {
			this.anInt852 = arg1.method3109();
		}
	}
}
