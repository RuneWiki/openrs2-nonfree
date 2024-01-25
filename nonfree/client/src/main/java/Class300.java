import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class300 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public int anInt8315;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public int anInt8316;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public int anInt8321;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!ib;)V")
	public void method7161(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8529();
			if (local5 == 0) {
				return;
			}
			this.method7164(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ib;BI)V")
	private void method7164(@OriginalArg(0) Class5_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8316 = arg0.method8519();
			this.anInt8315 = arg0.method8529();
			this.anInt8321 = arg0.method8529();
		}
	}
}
