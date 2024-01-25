import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class237 {

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	public int anInt6854;

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	public int anInt6856;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "I")
	public int anInt6858;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "I")
	public int anInt6861;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "Z")
	public boolean aBoolean470 = true;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public int anInt6862 = 512;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	public int anInt6859 = -1;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "I")
	private int anInt6865 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!jr;II)V")
	private void method5503(@OriginalArg(0) Class6_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6865 = arg0.method6037();
			this.method5509(this.anInt6865);
		} else if (arg1 == 2) {
			this.anInt6859 = arg0.method6044();
			if (this.anInt6859 == 65535) {
				this.anInt6859 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt6862 = arg0.method6044() << 2;
		} else if (arg1 == 4) {
			this.aBoolean470 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method5507(@OriginalArg(0) Class6_Sub12 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6019();
			if (local15 == 0) {
				return;
			}
			this.method5503(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)V")
	private void method5509(@OriginalArg(0) int arg0) {
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
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local76 < 0.5D) {
				local70 = (local46 - local32) / (local32 + local46);
			}
			if (local76 >= 0.5D) {
				local70 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		this.anInt6861 = (int) (local76 * 256.0D);
		this.anInt6858 = (int) (local70 * 256.0D);
		local60 /= 6.0D;
		if (local76 > 0.5D) {
			this.anInt6856 = (int) ((1.0D - local76) * local70 * 512.0D);
		} else {
			this.anInt6856 = (int) (local70 * 512.0D * local76);
		}
		if (this.anInt6858 < 0) {
			this.anInt6858 = 0;
		} else if (this.anInt6858 > 255) {
			this.anInt6858 = 255;
		}
		if (this.anInt6861 < 0) {
			this.anInt6861 = 0;
		} else if (this.anInt6861 > 255) {
			this.anInt6861 = 255;
		}
		if (this.anInt6856 < 1) {
			this.anInt6856 = 1;
		}
		this.anInt6854 = (int) (local60 * (double) this.anInt6856);
	}
}
