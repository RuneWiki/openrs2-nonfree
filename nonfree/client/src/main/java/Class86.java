import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class86 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
	public int anInt2808;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
	public int anInt2811;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
	public int anInt2816;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "Z")
	public boolean aBoolean240;

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
	public int anInt2818;

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
	public int anInt2810 = 8;

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
	public int anInt2815 = 16777215;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!qh;IB)V")
	private void method2551(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2810 = arg0.method3109();
		} else if (arg1 == 2) {
			this.aBoolean240 = true;
		} else if (arg1 == 3) {
			this.anInt2818 = arg0.method3107();
			this.anInt2808 = arg0.method3107();
			this.anInt2809 = arg0.method3107();
		} else if (arg1 == 4) {
			this.anInt2816 = arg0.method3118();
		} else if (arg1 == 5) {
			this.anInt2811 = arg0.method3109();
		} else if (arg1 == 6) {
			this.anInt2815 = arg0.method3126();
			return;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!qh;)V")
	public void method2552(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3118();
			if (local5 == 0) {
				return;
			}
			this.method2551(arg0, local5);
		}
	}
}
