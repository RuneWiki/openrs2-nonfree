import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class136 {

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
	public int anInt3675 = 8;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
	public int anInt3674 = 128;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
	public int anInt3679 = 0;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "Z")
	public boolean aBoolean280 = true;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	public int anInt3671 = -1;

	@OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
	public int anInt3682 = 16;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
	public int anInt3677 = 1190717;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Z")
	public boolean aBoolean279 = true;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Z")
	public boolean aBoolean282 = false;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	public int anInt3673 = -1;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
	public int anInt3688 = -1;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ec;IB)V")
	public void method3616(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(10) int local10 = arg0.method3972();
			if (local10 == 0) {
				return;
			}
			this.method3619(arg0, local10, arg1);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)V")
	public void method3617(@OriginalArg(1) int arg0) {
		this.anInt3675 = this.anInt3675 << 8 | arg0;
		if (this.anInt3671 == -1) {
			this.anInt3671 = this.anInt3688;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!ec;II)V")
	private void method3619(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt3679 = Static141.method2665(arg0.method3996());
		} else if (arg1 == 2) {
			this.anInt3688 = arg0.method3972();
		} else if (arg1 == 3) {
			this.anInt3688 = arg0.method4021();
			if (this.anInt3688 == 65535) {
				this.anInt3688 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean280 = false;
		} else if (arg1 == 7) {
			this.anInt3673 = Static141.method2665(arg0.method3996());
		} else if (arg1 == 8) {
			Static309.anInt5825 = arg2;
		} else if (arg1 == 9) {
			this.anInt3674 = arg0.method4021();
		} else if (arg1 == 10) {
			this.aBoolean279 = false;
		} else if (arg1 == 11) {
			this.anInt3675 = arg0.method3972();
		} else if (arg1 == 12) {
			this.aBoolean282 = true;
		} else if (arg1 == 13) {
			this.anInt3677 = arg0.method3996();
		} else if (arg1 == 14) {
			this.anInt3682 = arg0.method3972();
		} else if (arg1 == 15) {
			this.anInt3671 = arg0.method4021();
			if (this.anInt3671 == 65535) {
				this.anInt3671 = -1;
			}
		}
	}
}
