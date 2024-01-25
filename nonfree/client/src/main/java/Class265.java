import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class265 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
	public int[] anIntArray398;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!gga;)V")
	public Class265(@OriginalArg(0) Class124 arg0) {
		@Pc(6) byte[] local6 = arg0.method3610(6);
		this.method7085(new Class2_Sub8(local6));
		if (this.anIntArray398 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	private Class265() {
		this.anIntArray398 = new int[0];
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ol;B)V")
	private void method7085(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5203();
			if (local13 == 0) {
				return;
			}
			if (local13 == 1) {
				@Pc(26) int local26 = arg0.method5203();
				this.anIntArray398 = new int[local26];
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray398.length; local32++) {
					this.anIntArray398[local32] = arg0.method5203();
				}
			}
		}
	}
}
