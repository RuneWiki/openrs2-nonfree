import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class309 {

	@OriginalMember(owner = "client!so", name = "b", descriptor = "I")
	public int anInt8215 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	public int anInt8214 = 2048;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	public int anInt8216 = 2048;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "I")
	public int anInt8220 = 0;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!ji;)V")
	public void method6670(@OriginalArg(1) Class6_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6069();
			if (local5 == 0) {
				return;
			}
			this.method6672(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method6672(@OriginalArg(1) Class6_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8220 = arg0.method6069();
		} else if (arg1 == 2) {
			this.anInt8216 = arg0.method6003();
		} else if (arg1 == 3) {
			this.anInt8214 = arg0.method6003();
		} else if (arg1 == 4) {
			this.anInt8215 = arg0.method6058();
		}
	}
}
