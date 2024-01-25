import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class279 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "[I")
	public int[] anIntArray398;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class279(@OriginalArg(0) Class362 arg0) {
		@Pc(6) byte[] local6 = arg0.method8356(6);
		this.method6142(new Class3_Sub4(local6));
		if (this.anIntArray398 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	private Class279() {
		this.anIntArray398 = new int[0];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!dt;)V")
	private void method6142(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7954();
			if (local5 == 0) {
				return;
			}
			if (local5 == 1) {
				@Pc(16) int local16 = arg0.method7954();
				this.anIntArray398 = new int[local16];
				for (@Pc(22) int local22 = 0; local22 < this.anIntArray398.length; local22++) {
					this.anIntArray398[local22] = arg0.method7954();
				}
			}
		}
	}
}
