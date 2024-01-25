import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class158 {

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public int anInt4746;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public int anInt4749;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
	public int anInt4752;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
	public int anInt4756;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	private int anInt4744 = 0;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "Z")
	public boolean aBoolean325 = true;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	public int anInt4750 = -1;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	public int anInt4751 = 512;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBLclient!ji;)V")
	private void method4076(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt4744 = arg1.method6031();
			this.method4078(this.anInt4744);
		} else if (arg0 == 2) {
			this.anInt4750 = arg1.method6003();
			if (this.anInt4750 == 65535) {
				this.anInt4750 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4751 = arg1.method6003() << 2;
		} else if (arg0 == 4) {
			this.aBoolean325 = false;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V")
	private void method4078(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(39) double local39 = local14;
		if (local23 < local14) {
			local39 = local23;
		}
		if (local39 > local30) {
			local39 = local30;
		}
		@Pc(53) double local53 = local14;
		if (local14 < local23) {
			local53 = local23;
		}
		if (local30 > local53) {
			local53 = local30;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local53 + local39) / 2.0D;
		if (local39 != local53) {
			if (local75 < 0.5D) {
				local69 = (local53 - local39) / (local39 + local53);
			}
			if (local75 >= 0.5D) {
				local69 = (local53 - local39) / (2.0D - local53 - local39);
			}
			if (local14 == local53) {
				local67 = (local23 - local30) / (local53 - local39);
			} else if (local23 == local53) {
				local67 = (local30 - local14) / (local53 - local39) + 2.0D;
			} else if (local53 == local30) {
				local67 = (local14 - local23) / (-local39 + local53) + 4.0D;
			}
		}
		this.anInt4749 = (int) (local69 * 256.0D);
		this.anInt4746 = (int) (local75 * 256.0D);
		local67 /= 6.0D;
		if (this.anInt4746 < 0) {
			this.anInt4746 = 0;
		} else if (this.anInt4746 > 255) {
			this.anInt4746 = 255;
		}
		if (local75 > 0.5D) {
			this.anInt4756 = (int) ((1.0D - local75) * local69 * 512.0D);
		} else {
			this.anInt4756 = (int) (local69 * local75 * 512.0D);
		}
		if (this.anInt4749 < 0) {
			this.anInt4749 = 0;
		} else if (this.anInt4749 > 255) {
			this.anInt4749 = 255;
		}
		if (this.anInt4756 < 1) {
			this.anInt4756 = 1;
		}
		this.anInt4752 = (int) ((double) this.anInt4756 * local67);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method4081(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6069();
			if (local9 == 0) {
				return;
			}
			this.method4076(local9, arg0);
		}
	}
}
