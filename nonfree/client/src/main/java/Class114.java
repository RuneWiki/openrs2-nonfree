import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class114 {

	@OriginalMember(owner = "client!io", name = "b", descriptor = "I")
	public int anInt2780;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	public int anInt2781;

	@OriginalMember(owner = "client!io", name = "d", descriptor = "Z")
	public boolean aBoolean212;

	@OriginalMember(owner = "client!io", name = "e", descriptor = "I")
	public int anInt2782;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "I")
	public int anInt2783;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "I")
	public int anInt2786;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "I")
	public int anInt2779 = 16777215;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "I")
	public int anInt2784 = 8;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!rp;ZI)V")
	private void method2392(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2784 = arg0.method2767();
		} else if (arg1 == 2) {
			this.aBoolean212 = true;
		} else if (arg1 == 3) {
			this.anInt2781 = arg0.method2740();
			this.anInt2782 = arg0.method2740();
			this.anInt2780 = arg0.method2740();
		} else if (arg1 == 4) {
			this.anInt2783 = arg0.method2739();
		} else if (arg1 == 5) {
			this.anInt2786 = arg0.method2767();
		} else if (arg1 == 6) {
			this.anInt2779 = arg0.method2786();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!rp;Z)V")
	public void method2394(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2739();
			if (local15 == 0) {
				return;
			}
			this.method2392(arg0, local15);
		}
	}
}
