import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class145 {

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!cb;)V")
	public Class145(@OriginalArg(0) Class50 arg0) {
		@Pc(6) byte[] local6 = arg0.method915(6);
		this.method2994(new Class5_Sub15(local6));
		if (this.anIntArray187 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	private Class145() {
		this.anIntArray187 = new int[0];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!rv;B)V")
	private void method2994(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3642();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				@Pc(16) int local16 = arg0.method3642();
				this.anIntArray187 = new int[local16];
				for (@Pc(22) int local22 = 0; local22 < this.anIntArray187.length; local22++) {
					this.anIntArray187[local22] = arg0.method3642();
				}
			}
		}
	}
}
