import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class207 {

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	public int anInt5256;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	public int anInt5257;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
	public int anInt5258;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
	public int anInt5262;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	private int anInt5249 = 0;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
	public int anInt5252 = -1;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	public int anInt5250 = 128;

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "Z")
	public boolean aBoolean375 = true;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
	private void method4279(@OriginalArg(0) int arg0) {
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
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		this.anInt5262 = (int) (local62 * 256.0D);
		this.anInt5258 = (int) (local68 * (double) 256);
		if (this.anInt5258 < 0) {
			this.anInt5258 = 0;
		} else if (this.anInt5258 > 255) {
			this.anInt5258 = 255;
		}
		if (this.anInt5262 < 0) {
			this.anInt5262 = 0;
		} else if (this.anInt5262 > 255) {
			this.anInt5262 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt5257 = (int) (local62 * 512.0D * (1.0D - local68));
		} else {
			this.anInt5257 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt5257 < 1) {
			this.anInt5257 = 1;
		}
		this.anInt5256 = (int) (local60 * (double) this.anInt5257);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!fh;)V")
	public void method4282(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5007();
			if (local5 == 0) {
				return;
			}
			this.method4284(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!fh;I)V")
	private void method4284(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5249 = arg0.method5008();
			this.method4279(this.anInt5249);
		} else if (arg1 == 2) {
			this.anInt5252 = arg0.method5028();
			if (this.anInt5252 == 65535) {
				this.anInt5252 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt5250 = arg0.method5028() << 0;
		} else if (arg1 == 4) {
			this.aBoolean375 = false;
		}
	}
}
