import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class87 {

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	public int anInt3218;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	public int anInt3221;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	public int anInt3223;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "I")
	public int anInt3224;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public int anInt3215 = 512;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public int anInt3216 = -1;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	private int anInt3220 = 0;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "Z")
	public boolean aBoolean250 = true;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "Z")
	public boolean aBoolean251 = true;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ji;ZI)V")
	private void method2696(@OriginalArg(0) Class6_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3220 = arg0.method8203();
			this.method2698(this.anInt3220);
		} else if (arg1 == 2) {
			this.anInt3216 = arg0.method8220();
			if (this.anInt3216 == 65535) {
				this.anInt3216 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt3215 = arg0.method8220() << 2;
		} else if (arg1 == 4) {
			this.aBoolean251 = false;
		} else if (arg1 == 5) {
			this.aBoolean250 = false;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method2697(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8246();
			if (local5 == 0) {
				return;
			}
			this.method2696(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
	private void method2698(@OriginalArg(1) int arg0) {
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
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		this.anInt3224 = (int) (local68 * 256.0D);
		this.anInt3223 = (int) (local62 * 256.0D);
		if (this.anInt3224 < 0) {
			this.anInt3224 = 0;
		} else if (this.anInt3224 > 255) {
			this.anInt3224 = 255;
		}
		if (this.anInt3223 < 0) {
			this.anInt3223 = 0;
		} else if (this.anInt3223 > 255) {
			this.anInt3223 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt3221 = (int) (local62 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt3221 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt3221 < 1) {
			this.anInt3221 = 1;
		}
		this.anInt3218 = (int) (local60 * (double) this.anInt3221);
	}
}
