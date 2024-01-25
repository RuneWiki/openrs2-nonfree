import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class234 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public int anInt6270;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	public int anInt6276;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
	public int anInt6280;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
	public int anInt6281;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	public int anInt6271 = -1;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	public int anInt6274 = 128;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	private int anInt6282 = 0;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Z")
	public boolean aBoolean416 = true;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBLclient!ha;)V")
	private void method5249(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt6282 = arg1.method3078();
			this.method5253(this.anInt6282);
		} else if (arg0 == 2) {
			this.anInt6271 = arg1.method3108();
			if (this.anInt6271 == 65535) {
				this.anInt6271 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt6274 = arg1.method3108() << 0;
		} else if (arg0 == 4) {
			this.aBoolean416 = false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	private void method5253(@OriginalArg(1) int arg0) {
		@Pc(24) double local24 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(33) double local33 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(40) double local40 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(42) double local42 = local24;
		if (local33 < local24) {
			local42 = local33;
		}
		if (local40 < local42) {
			local42 = local40;
		}
		@Pc(56) double local56 = local24;
		if (local24 < local33) {
			local56 = local33;
		}
		if (local56 < local40) {
			local56 = local40;
		}
		@Pc(70) double local70 = 0.0D;
		@Pc(72) double local72 = 0.0D;
		@Pc(78) double local78 = (local56 + local42) / 2.0D;
		if (local42 != local56) {
			if (local78 < 0.5D) {
				local72 = (local56 - local42) / (local56 + local42);
			}
			if (local56 == local24) {
				local70 = (local33 - local40) / (local56 - local42);
			} else if (local33 == local56) {
				local70 = (local40 - local24) / (local56 - local42) + 2.0D;
			} else if (local56 == local40) {
				local70 = (local24 - local33) / (local56 - local42) + 4.0D;
			}
			if (local78 >= 0.5D) {
				local72 = (local56 - local42) / (2.0D - local56 - local42);
			}
		}
		this.anInt6281 = (int) (local72 * 256.0D);
		local70 /= 6.0D;
		this.anInt6280 = (int) (local78 * 256.0D);
		if (this.anInt6281 < 0) {
			this.anInt6281 = 0;
		} else if (this.anInt6281 > 255) {
			this.anInt6281 = 255;
		}
		if (this.anInt6280 < 0) {
			this.anInt6280 = 0;
		} else if (this.anInt6280 > 255) {
			this.anInt6280 = 255;
		}
		if (local78 > 0.5D) {
			this.anInt6276 = (int) ((1.0D - local78) * 512.0D * local72);
		} else {
			this.anInt6276 = (int) (local78 * 512.0D * local72);
		}
		if (this.anInt6276 < 1) {
			this.anInt6276 = 1;
		}
		this.anInt6270 = (int) (local70 * (double) this.anInt6276);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!ha;)V")
	public void method5255(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3111();
			if (local9 == 0) {
				return;
			}
			this.method5249(local9, arg0);
		}
	}
}
