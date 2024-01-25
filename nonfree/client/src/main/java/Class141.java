import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class141 {

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	public int anInt4229 = 2048;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public int anInt4228 = 2048;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public int anInt4238 = 0;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public int anInt4235 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLclient!ap;)V")
	public void method3769(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub3 arg1) {
		while (true) {
			@Pc(12) int local12 = arg1.method2772();
			if (local12 == 0) {
				return;
			}
			this.method3770(arg0, arg1, local12);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILclient!ap;I)V")
	private void method3770(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4235 = arg1.method2772();
		} else if (arg2 == 2) {
			this.anInt4228 = arg1.method2764();
		} else if (arg2 == 3) {
			this.anInt4229 = arg1.method2764();
		} else if (arg2 == 4) {
			this.anInt4238 = arg1.method2744();
		}
	}
}
