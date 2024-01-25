import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class78 {

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public int anInt2317;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public int anInt2320;

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
	public int anInt2326;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
	public int anInt2327;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	public int anInt2328 = -1;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	private int anInt2313 = 0;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
	public int anInt2322 = 128;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILclient!ap;I)V")
	private void method1903(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2313 = arg1.method2791();
			this.method1906(this.anInt2313);
		} else if (arg2 == 2) {
			this.anInt2328 = arg1.method2764();
			if (this.anInt2328 == 65535) {
				this.anInt2328 = -1;
				return;
			}
		} else if (arg2 == 3) {
			this.anInt2322 = arg1.method2764();
			return;
		} else if (arg2 == 4) {
			this.aBoolean157 = false;
			return;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ap;BI)V")
	public void method1904(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method2772();
			if (local15 == 0) {
				return;
			}
			this.method1903(arg1, arg0, local15);
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
	private void method1906(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local12 < local21) {
			local44 = local21;
		}
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(72) double local72 = (local30 + local44) / 2.0D;
		if (local30 != local44) {
			if (local72 < 0.5D) {
				local60 = (local44 - local30) / (local30 + local44);
			}
			if (local72 >= 0.5D) {
				local60 = (local44 - local30) / ((2.0D - local44) - local30);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local21 == local44) {
				local58 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local28 == local44) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
		}
		local58 /= 6.0D;
		this.anInt2326 = (int) (local60 * 256.0D);
		this.anInt2317 = (int) (local72 * 256.0D);
		if (this.anInt2326 < 0) {
			this.anInt2326 = 0;
		} else if (this.anInt2326 > 255) {
			this.anInt2326 = 255;
		}
		if (this.anInt2317 < 0) {
			this.anInt2317 = 0;
		} else if (this.anInt2317 > 255) {
			this.anInt2317 = 255;
		}
		if (local72 > 0.5D) {
			this.anInt2327 = (int) (local60 * 512.0D * (1.0D - local72));
		} else {
			this.anInt2327 = (int) (local60 * 512.0D * local72);
		}
		if (this.anInt2327 < 1) {
			this.anInt2327 = 1;
		}
		this.anInt2320 = (int) ((double) this.anInt2327 * local58);
	}
}
