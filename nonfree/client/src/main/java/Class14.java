import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class14 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public int anInt204;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	public int anInt205;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	public int anInt195 = 512;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public int anInt202 = -1;

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
	private int anInt201 = 0;

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "Z")
	public boolean aBoolean18 = true;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "Z")
	public boolean aBoolean19 = true;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!es;I)V")
	private void method242(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt201 = arg0.method8827();
			this.method244(this.anInt201);
		} else if (arg1 == 2) {
			this.anInt202 = arg0.method8859();
			if (this.anInt202 == 65535) {
				this.anInt202 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt195 = arg0.method8859() << 2;
		} else if (arg1 == 4) {
			this.aBoolean19 = false;
			return;
		} else if (arg1 == 5) {
			this.aBoolean18 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLclient!es;)V")
	public void method243(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8865();
			if (local9 == 0) {
				return;
			}
			this.method242(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)V")
	private void method244(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt205 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		this.anInt196 = (int) (local68 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt204 = (int) (local62 * 512.0D * (1.0D - local68));
		} else {
			this.anInt204 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt196 < 0) {
			this.anInt196 = 0;
		} else if (this.anInt196 > 255) {
			this.anInt196 = 255;
		}
		if (this.anInt205 < 0) {
			this.anInt205 = 0;
		} else if (this.anInt205 > 255) {
			this.anInt205 = 255;
		}
		if (this.anInt204 < 1) {
			this.anInt204 = 1;
		}
		this.anInt197 = (int) ((double) this.anInt204 * local60);
	}
}
