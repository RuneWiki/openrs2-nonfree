import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class293 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
	public int[] anIntArray583;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	public int anInt8019 = -1;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public int anInt8021 = -1;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
	public int anInt8023 = 0;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
	public int anInt8024 = -1;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ika;II)V")
	private void method6860(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8021 = arg0.method2028(-14795);
		} else if (arg1 == 2) {
			this.anIntArray583 = new int[arg0.method2048(255)];
			for (@Pc(70) int local70 = 0; local70 < this.anIntArray583.length; local70++) {
				this.anIntArray583[local70] = arg0.method2028(-14795);
			}
		} else if (arg1 == 3) {
			this.anInt8024 = arg0.method2048(255);
		} else if (arg1 == 4) {
			this.anInt8023 = arg0.method2048(255);
		} else if (arg1 == 5) {
			this.anInt8019 = arg0.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!ika;)V")
	public void method6864(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2048(255);
			if (local5 == 0) {
				return;
			}
			this.method6860(arg0, local5);
		}
	}
}
