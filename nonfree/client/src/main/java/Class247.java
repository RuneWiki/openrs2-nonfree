import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class247 {

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
	public int anInt6884;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
	public int anInt6885;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
	public int anInt6887;

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
	public int anInt6890;

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "Z")
	public boolean aBoolean514 = true;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
	public int anInt6888 = 512;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
	public int anInt6883 = -1;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
	private int anInt6881 = 0;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "Z")
	public boolean aBoolean515 = true;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IB)V")
	private void method5764(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local75 < 0.5D) {
				local69 = (local46 - local32) / (local32 + local46);
			}
			if (local75 >= 0.5D) {
				local69 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		this.anInt6890 = (int) (local69 * 256.0D);
		this.anInt6887 = (int) (local75 * 256.0D);
		if (this.anInt6890 < 0) {
			this.anInt6890 = 0;
		} else if (this.anInt6890 > 255) {
			this.anInt6890 = 255;
		}
		if (this.anInt6887 < 0) {
			this.anInt6887 = 0;
		} else if (this.anInt6887 > 255) {
			this.anInt6887 = 255;
		}
		if (local75 > 0.5D) {
			this.anInt6884 = (int) ((1.0D - local75) * local69 * 512.0D);
		} else {
			this.anInt6884 = (int) (local69 * local75 * 512.0D);
		}
		if (this.anInt6884 < 1) {
			this.anInt6884 = 1;
		}
		this.anInt6885 = (int) ((double) this.anInt6884 * local60);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!np;I)V")
	private void method5765(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt6881 = arg1.method5230();
			this.method5764(this.anInt6881);
		} else if (arg0 == 2) {
			this.anInt6883 = arg1.method5198();
			if (this.anInt6883 == 65535) {
				this.anInt6883 = -1;
				return;
			}
		} else {
			if (arg0 == 3) {
				this.anInt6888 = arg1.method5198() << 2;
			} else if (arg0 == 4) {
				this.aBoolean514 = false;
				return;
			} else if (arg0 == 5) {
				this.aBoolean515 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!np;I)V")
	public void method5766(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5175();
			if (local9 == 0) {
				return;
			}
			this.method5765(local9, arg0);
		}
	}
}
