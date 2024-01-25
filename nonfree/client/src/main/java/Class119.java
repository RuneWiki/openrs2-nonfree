import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fma")
public final class Class119 {

	@OriginalMember(owner = "client!fma", name = "a", descriptor = "I")
	public int anInt3278;

	@OriginalMember(owner = "client!fma", name = "d", descriptor = "I")
	public int anInt3280;

	@OriginalMember(owner = "client!fma", name = "c", descriptor = "I")
	public int anInt3281;

	@OriginalMember(owner = "client!fma", name = "p", descriptor = "I")
	public int anInt3283;

	@OriginalMember(owner = "client!fma", name = "k", descriptor = "I")
	public int anInt3285;

	@OriginalMember(owner = "client!fma", name = "h", descriptor = "I")
	public int anInt3286;

	@OriginalMember(owner = "client!fma", name = "j", descriptor = "I")
	public int anInt3289;

	@OriginalMember(owner = "client!fma", name = "m", descriptor = "I")
	public int anInt3290;

	@OriginalMember(owner = "client!fma", name = "b", descriptor = "Z")
	public boolean aBoolean269;

	@OriginalMember(owner = "client!fma", name = "i", descriptor = "I")
	public int anInt3282 = 16777215;

	@OriginalMember(owner = "client!fma", name = "n", descriptor = "I")
	public int anInt3288 = 8;

	@OriginalMember(owner = "client!fma", name = "a", descriptor = "(ILclient!rba;)V")
	public void method2830(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5322(-50);
			if (local5 == 0) {
				return;
			}
			this.method2832(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!fma", name = "a", descriptor = "(ZLclient!rba;I)V")
	private void method2832(@OriginalArg(1) Class3_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3288 = arg0.method5272();
		} else if (arg1 == 2) {
			this.aBoolean269 = true;
		} else if (arg1 == 3) {
			this.anInt3289 = arg0.method5281();
			this.anInt3278 = arg0.method5281();
			this.anInt3283 = arg0.method5281();
		} else if (arg1 == 4) {
			this.anInt3286 = arg0.method5322(-32);
		} else if (arg1 == 5) {
			this.anInt3281 = arg0.method5272();
		} else if (arg1 == 6) {
			this.anInt3282 = arg0.method5307();
		} else if (arg1 == 7) {
			this.anInt3285 = arg0.method5281();
			this.anInt3280 = arg0.method5281();
			this.anInt3290 = arg0.method5281();
		}
	}
}
