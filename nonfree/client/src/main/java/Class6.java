import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class6 {

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
	public int anInt75;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!uia;")
	public Class350 aClass350_1;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	private int anInt80;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public int anInt82;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!ib;I)V")
	private void method90(@OriginalArg(1) Class5_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt80 = arg0.method8519();
		} else if (arg1 == 2) {
			this.anInt75 = arg0.method8529();
			this.anInt82 = arg0.method8529();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)Lclient!iga;")
	public synchronized Class173 method91() {
		@Pc(13) Class173 local13 = (Class173) this.aClass350_1.aClass391_62.method9275((long) this.anInt80);
		if (local13 != null) {
			return local13;
		}
		local13 = Static684.method3655(this.aClass350_1.aClass208_136, this.anInt80, 0);
		if (local13 != null) {
			this.aClass350_1.aClass391_62.method9273((long) this.anInt80, local13, 1);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!ib;)V")
	public void method92(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8529();
			if (local9 == 0) {
				return;
			}
			this.method90(arg0, local9);
		}
	}
}
