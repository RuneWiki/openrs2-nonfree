import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class188 {

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
	public int anInt4904;

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "Lclient!ufa;")
	public Class350 aClass350_3;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Z")
	public boolean aBoolean334 = true;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	public int anInt4902 = 1190717;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	public int anInt4900 = 127;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	public int anInt4903 = 512;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public int anInt4901 = 0;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
	public int anInt4906 = -1;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
	public int anInt4909 = -1;

	@OriginalMember(owner = "client!jp", name = "r", descriptor = "Z")
	public boolean aBoolean336 = true;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	public int anInt4908 = 64;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "Z")
	public boolean aBoolean335 = false;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
	public int anInt4912 = 8;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!so;II)V")
	private void method4090(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4901 = Static6.method38(arg0.method5862());
		} else if (arg1 == 2) {
			this.anInt4906 = arg0.method5866();
		} else if (arg1 == 3) {
			this.anInt4906 = arg0.method5900();
			if (this.anInt4906 == 65535) {
				this.anInt4906 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean334 = false;
		} else if (arg1 == 7) {
			this.anInt4909 = Static6.method38(arg0.method5862());
		} else if (arg1 == 8) {
			this.aClass350_3.anInt10170 = this.anInt4904;
		} else if (arg1 == 9) {
			this.anInt4903 = arg0.method5900() << 2;
		} else if (arg1 == 10) {
			this.aBoolean336 = false;
		} else if (arg1 == 11) {
			this.anInt4912 = arg0.method5866();
		} else if (arg1 == 12) {
			this.aBoolean335 = true;
		} else if (arg1 == 13) {
			this.anInt4902 = arg0.method5862();
		} else if (arg1 == 14) {
			this.anInt4908 = arg0.method5866() << 2;
		} else if (arg1 == 16) {
			this.anInt4900 = arg0.method5866();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!so;I)V")
	public void method4091(@OriginalArg(0) Class14_Sub29 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5866();
			if (local11 == 0) {
				return;
			}
			this.method4090(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public void method4092() {
		this.anInt4912 = this.anInt4904 | this.anInt4912 << 8;
	}
}
