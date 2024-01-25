import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class25 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	public int anInt1028;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "I")
	public int anInt1032;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "I")
	public int anInt1034;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	public int anInt1037;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	public int anInt1030 = 512;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "I")
	public int anInt1036 = -1;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "I")
	private int anInt1035 = 0;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Z")
	public boolean aBoolean96 = true;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ek;Z)V")
	public void method905(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7004();
			if (local9 == 0) {
				return;
			}
			this.method908(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
	private void method906(@OriginalArg(1) int arg0) {
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
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		this.anInt1032 = (int) (local68 * 256.0D);
		this.anInt1034 = (int) (local62 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt1037 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt1037 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt1034 < 0) {
			this.anInt1034 = 0;
		} else if (this.anInt1034 > 255) {
			this.anInt1034 = 255;
		}
		if (this.anInt1032 < 0) {
			this.anInt1032 = 0;
		} else if (this.anInt1032 > 255) {
			this.anInt1032 = 255;
		}
		if (this.anInt1037 < 1) {
			this.anInt1037 = 1;
		}
		this.anInt1028 = (int) ((double) this.anInt1037 * local60);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ek;II)V")
	private void method908(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1035 = arg0.method7013();
			this.method906(this.anInt1035);
		} else if (arg1 == 2) {
			this.anInt1036 = arg0.method7054();
			if (this.anInt1036 == 65535) {
				this.anInt1036 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt1030 = arg0.method7054() << 2;
		} else if (arg1 == 4) {
			this.aBoolean96 = false;
		} else if (arg1 == 5) {
			this.aBoolean95 = false;
		}
	}
}
