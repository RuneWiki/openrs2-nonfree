import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class217 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class217(@OriginalArg(0) Class143 arg0) {
		@Pc(6) byte[] local6 = arg0.method3135(6);
		this.method5051(new Class3_Sub17(local6));
		if (this.anIntArray386 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	private Class217() {
		this.anIntArray386 = new int[0];
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!fca;)V")
	private void method5051(@OriginalArg(1) Class3_Sub17 arg0) {
		label19: while (true) {
			@Pc(13) int local13 = arg0.method4888();
			if (local13 != 0) {
				if (local13 != 1) {
					continue;
				}
				@Pc(24) int local24 = arg0.method4888();
				this.anIntArray386 = new int[local24];
				@Pc(30) int local30 = 0;
				while (true) {
					if (this.anIntArray386.length <= local30) {
						continue label19;
					}
					this.anIntArray386[local30] = arg0.method4888();
					local30++;
				}
			}
			return;
		}
	}
}
