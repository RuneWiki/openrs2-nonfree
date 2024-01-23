import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class31 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
	public int anInt921;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
	public int anInt923;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	public int anInt924;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
	public int anInt925;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	public int anInt928;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Z")
	public boolean aBoolean64;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
	public int anInt919 = 16777215;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
	public int anInt926 = 8;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!im;)V")
	public void method728(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2655();
			if (local5 == 0) {
				return;
			}
			this.method733(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!im;I)V")
	private void method733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub16 arg2) {
		if (arg0 == 1) {
			this.anInt926 = arg2.method2652();
		} else if (arg0 == 2) {
			this.aBoolean64 = true;
		} else if (arg0 == 3) {
			this.anInt924 = arg2.method2645();
			this.anInt921 = arg2.method2645();
			this.anInt923 = arg2.method2645();
		} else if (arg0 == 4) {
			this.anInt928 = arg2.method2655();
		} else if (arg0 == 5) {
			this.anInt925 = arg2.method2652();
		} else if (arg0 == 6) {
			this.anInt919 = arg2.method2634();
		}
	}
}
