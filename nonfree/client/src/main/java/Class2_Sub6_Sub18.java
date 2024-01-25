import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class2_Sub6_Sub18 extends Class2_Sub6 {

	@OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
	public int anInt8172 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!cea;B)V")
	private void method6974(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		if (arg0 == 2) {
			this.anInt8172 = arg1.method8326();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BLclient!cea;)V")
	public void method6975(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method8383();
			if (local7 == 0) {
				return;
			}
			this.method6974(local7, arg0);
		}
	}
}
