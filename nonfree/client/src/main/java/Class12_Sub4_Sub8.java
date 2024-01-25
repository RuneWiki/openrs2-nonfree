import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class12_Sub4_Sub8 extends Class12_Sub4 {

	@OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
	public int anInt3221 = 0;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLclient!daa;)V")
	public void method2905(@OriginalArg(1) Class12_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5216();
			if (local13 == 0) {
				return;
			}
			this.method2906(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!daa;ZI)V")
	private void method2906(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt3221 = arg0.method5199();
		}
	}
}
