import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class189 {

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "[I")
	public int[] anIntArray575;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	public int anInt5894 = -1;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	public int anInt5898 = -1;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IILclient!oe;I)V")
	private void method4620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub16 arg2) {
		if (arg1 == 1) {
			this.anInt5894 = arg2.method2130();
		} else if (arg1 == 2) {
			this.anIntArray575 = new int[arg2.method2146()];
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray575.length; local27++) {
				this.anIntArray575[local27] = arg2.method2130();
			}
		} else if (arg1 == 3) {
			this.anInt5898 = arg2.method2146();
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!oe;I)V")
	public void method4622(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method2146();
			if (local17 == 0) {
				return;
			}
			this.method4620(arg1, local17, arg0);
		}
	}
}
