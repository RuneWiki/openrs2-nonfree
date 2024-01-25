import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class240 {

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	public int anInt6492;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "Lclient!lp;")
	public Class231 aClass231_21;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
	public int anInt6495 = 64;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public int anInt6498 = 512;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public int anInt6494 = -1;

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	public int anInt6499 = 8;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public int anInt6496 = -1;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
	public boolean aBoolean550 = true;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public int anInt6501 = 127;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	public int anInt6504 = 1190717;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
	public boolean aBoolean552 = false;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
	public boolean aBoolean551 = true;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public int anInt6500 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method5838() {
		this.anInt6499 = this.anInt6492 | this.anInt6499 << 8;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!et;B)V")
	public void method5841(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(19) int local19 = arg0.method8581(-17416);
			if (local19 == 0) {
				return;
			}
			this.method5842(local19, arg0);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!et;)V")
	private void method5842(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt6500 = Static701.method7635(arg1.method8583());
		} else if (arg0 == 2) {
			this.anInt6496 = arg1.method8581(-17416);
		} else if (arg0 == 3) {
			this.anInt6496 = arg1.method8575();
			if (this.anInt6496 == 65535) {
				this.anInt6496 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean550 = false;
		} else if (arg0 == 7) {
			this.anInt6494 = Static701.method7635(arg1.method8583());
		} else if (arg0 == 8) {
			this.aClass231_21.anInt5963 = this.anInt6492;
		} else if (arg0 == 9) {
			this.anInt6498 = arg1.method8575() << 2;
		} else if (arg0 == 10) {
			this.aBoolean551 = false;
		} else if (arg0 == 11) {
			this.anInt6499 = arg1.method8581(-17416);
		} else if (arg0 == 12) {
			this.aBoolean552 = true;
		} else if (arg0 == 13) {
			this.anInt6504 = arg1.method8583();
		} else if (arg0 == 14) {
			this.anInt6495 = arg1.method8581(-17416) << 2;
		} else if (arg0 == 16) {
			this.anInt6501 = arg1.method8581(-17416);
		}
	}
}
