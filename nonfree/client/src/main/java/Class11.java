import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class11 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
	public int anInt307;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	public int anInt310;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	public int anInt312;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	public int anInt316;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "Z")
	public boolean aBoolean27 = true;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	public int anInt317 = -1;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	private int anInt309 = 0;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
	public int anInt318 = 128;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	private void method287(@OriginalArg(1) int arg0) {
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
		@Pc(66) double local66 = (local30 + local44) / 2.0D;
		if (local30 != local44) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local30 + local44);
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / (2.0D - local44 - local30);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local21 == local44) {
				local58 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
		}
		this.anInt307 = (int) (local66 * 256.0D);
		local58 /= 6.0D;
		this.anInt316 = (int) (local60 * 256.0D);
		if (local66 > 0.5D) {
			this.anInt310 = (int) ((1.0D - local66) * local60 * 512.0D);
		} else {
			this.anInt310 = (int) (local66 * 512.0D * local60);
		}
		if (this.anInt316 < 0) {
			this.anInt316 = 0;
		} else if (this.anInt316 > 255) {
			this.anInt316 = 255;
		}
		if (this.anInt307 < 0) {
			this.anInt307 = 0;
		} else if (this.anInt307 > 255) {
			this.anInt307 = 255;
		}
		if (this.anInt310 < 1) {
			this.anInt310 = 1;
		}
		this.anInt312 = (int) (local58 * (double) this.anInt310);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILclient!rg;)V")
	public void method289(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		while (true) {
			@Pc(8) int local8 = arg1.method5115();
			if (local8 == 0) {
				return;
			}
			this.method290(arg0, arg1, local8);
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILclient!rg;II)V")
	private void method290(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub12 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt309 = arg1.method5072();
			this.method287(this.anInt309);
		} else if (arg2 == 2) {
			this.anInt317 = arg1.method5106();
			if (this.anInt317 == 65535) {
				this.anInt317 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt318 = arg1.method5106();
		} else if (arg2 == 4) {
			this.aBoolean27 = false;
		}
	}
}
