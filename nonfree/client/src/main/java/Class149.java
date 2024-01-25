import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class149 {

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
	public int anInt3886;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
	public int anInt3889;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	public int anInt3893;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
	public int anInt3897;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
	public int anInt3884 = -1;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	private int anInt3888 = 0;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
	public boolean aBoolean314 = true;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Z")
	public boolean aBoolean315 = true;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	public int anInt3895 = 512;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
	private void method3513(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		this.anInt3886 = (int) (local62 * 256.0D);
		this.anInt3897 = (int) (local68 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt3893 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt3893 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt3886 < 0) {
			this.anInt3886 = 0;
		} else if (this.anInt3886 > 255) {
			this.anInt3886 = 255;
		}
		if (this.anInt3897 < 0) {
			this.anInt3897 = 0;
		} else if (this.anInt3897 > 255) {
			this.anInt3897 = 255;
		}
		if (this.anInt3893 < 1) {
			this.anInt3893 = 1;
		}
		this.anInt3889 = (int) (local60 * (double) this.anInt3893);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ee;I)V")
	public void method3514(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8645();
			if (local13 == 0) {
				return;
			}
			this.method3520(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!ee;I)V")
	private void method3520(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt3888 = arg1.method8657();
			this.method3513(this.anInt3888);
		} else if (arg0 == 2) {
			this.anInt3884 = arg1.method8631();
			if (this.anInt3884 == 65535) {
				this.anInt3884 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt3895 = arg1.method8631() << 2;
		} else if (arg0 == 4) {
			this.aBoolean315 = false;
		} else if (arg0 == 5) {
			this.aBoolean314 = false;
			return;
		}
	}
}
