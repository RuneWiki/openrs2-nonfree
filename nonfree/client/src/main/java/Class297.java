import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class297 {

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	public int anInt8067;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public int anInt8070;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
	public int anInt8074;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public int anInt8075;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
	public boolean aBoolean584 = true;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	private int anInt8065 = 0;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public int anInt8066 = 512;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	public int anInt8069 = -1;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
	public boolean aBoolean585 = true;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
	private void method7018(@OriginalArg(1) int arg0) {
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
		if (local23 > local14) {
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
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		this.anInt8070 = (int) (local62 * 256.0D);
		this.anInt8067 = (int) (local68 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt8074 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt8074 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt8067 < 0) {
			this.anInt8067 = 0;
		} else if (this.anInt8067 > 255) {
			this.anInt8067 = 255;
		}
		if (this.anInt8070 < 0) {
			this.anInt8070 = 0;
		} else if (this.anInt8070 > 255) {
			this.anInt8070 = 255;
		}
		if (this.anInt8074 < 1) {
			this.anInt8074 = 1;
		}
		this.anInt8075 = (int) (local60 * (double) this.anInt8074);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!ofa;)V")
	public void method7019(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5966();
			if (local16 == 0) {
				return;
			}
			this.method7021(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ofa;II)V")
	private void method7021(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8065 = arg0.method5931();
			this.method7018(this.anInt8065);
		} else if (arg1 == 2) {
			this.anInt8069 = arg0.method5968();
			if (this.anInt8069 == 65535) {
				this.anInt8069 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt8066 = arg0.method5968() << 2;
		} else if (arg1 == 4) {
			this.aBoolean584 = false;
		} else if (arg1 == 5) {
			this.aBoolean585 = false;
		}
	}
}
