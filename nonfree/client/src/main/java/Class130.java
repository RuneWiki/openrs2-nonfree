import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class130 {

	@OriginalMember(owner = "client!p", name = "j", descriptor = "I")
	public int anInt3769;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public int anInt3772;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "I")
	public int anInt3774;

	@OriginalMember(owner = "client!p", name = "y", descriptor = "I")
	public int anInt3783;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Z")
	public boolean aBoolean292 = true;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	public int anInt3771 = 128;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "I")
	public int anInt3775 = -1;

	@OriginalMember(owner = "client!p", name = "z", descriptor = "I")
	private int anInt3784 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!jj;IB)V")
	public void method2967(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method3122();
			if (local9 == 0) {
				return;
			}
			this.method2972(arg1, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IILclient!jj;I)V")
	private void method2972(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub18 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt3784 = arg1.method3109();
			this.method2973(this.anInt3784);
		} else if (arg2 == 2) {
			this.anInt3775 = arg1.method3107();
			if (this.anInt3775 == 65535) {
				this.anInt3775 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt3771 = arg1.method3107();
		} else if (arg2 == 4) {
			this.aBoolean292 = false;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)V")
	private void method2973(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local14;
		@Pc(39) double local39 = local14;
		if (local14 > local23) {
			local37 = local23;
		}
		if (local23 > local14) {
			local39 = local23;
		}
		if (local30 < local37) {
			local37 = local30;
		}
		if (local30 > local39) {
			local39 = local30;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local39 + local37) / 2.0D;
		if (local37 != local39) {
			if (local14 == local39) {
				local67 = (local23 - local30) / (-local37 + local39);
			} else if (local39 == local23) {
				local67 = (local30 - local14) / (local39 - local37) + 2.0D;
			} else if (local39 == local30) {
				local67 = (local14 - local23) / (-local37 + local39) + 4.0D;
			}
			if (local75 < 0.5D) {
				local69 = (local39 - local37) / (local37 + local39);
			}
			if (local75 >= 0.5D) {
				local69 = (local39 - local37) / ((2.0D - local39) - local37);
			}
		}
		this.anInt3774 = (int) (local69 * 256.0D);
		if (this.anInt3774 < 0) {
			this.anInt3774 = 0;
		} else if (this.anInt3774 > 255) {
			this.anInt3774 = 255;
		}
		this.anInt3783 = (int) (local75 * 256.0D);
		if (local75 > 0.5D) {
			this.anInt3772 = (int) ((1.0D - local75) * 512.0D * local69);
		} else {
			this.anInt3772 = (int) (local75 * local69 * 512.0D);
		}
		if (this.anInt3783 < 0) {
			this.anInt3783 = 0;
		} else if (this.anInt3783 > 255) {
			this.anInt3783 = 255;
		}
		local67 /= 6.0D;
		if (this.anInt3772 < 1) {
			this.anInt3772 = 1;
		}
		this.anInt3769 = (int) ((double) this.anInt3772 * local67);
	}
}
