import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class4_Sub3_Sub14 extends Class4_Sub3 {

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
	public int anInt2512;

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
	public int anInt2513;

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
	public int anInt2522;

	@OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
	public int anInt2523;

	@OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
	public int anInt2526;

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
	public int anInt2527;

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "Z")
	public boolean aBoolean106 = true;

	@OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
	public int anInt2519 = -1;

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
	public int anInt2514 = 0;

	@OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
	public int anInt2515 = -1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
	private void method1752(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(27) double local27 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(29) double local29 = local14;
		if (local14 > local27) {
			local29 = local27;
		}
		@Pc(42) double local42 = (double) (arg0 & 0xFF) / 256.0D;
		if (local42 < local29) {
			local29 = local42;
		}
		@Pc(50) double local50 = local14;
		@Pc(52) double local52 = 0.0D;
		if (local27 > local14) {
			local50 = local27;
		}
		if (local50 < local42) {
			local50 = local42;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local29 + local50) / 2.0D;
		this.anInt2522 = (int) (local72 * 256.0D);
		if (this.anInt2522 < 0) {
			this.anInt2522 = 0;
		} else if (this.anInt2522 > 255) {
			this.anInt2522 = 255;
		}
		if (local50 != local29) {
			if (local14 == local50) {
				local52 = (local27 - local42) / (local50 - local29);
			} else if (local27 == local50) {
				local52 = (local42 - local14) / (-local29 + local50) + 2.0D;
			} else if (local50 == local42) {
				local52 = (local14 - local27) / (local50 - local29) + 4.0D;
			}
			if (local72 < 0.5D) {
				local66 = (local50 - local29) / (local50 + local29);
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local29) / (2.0D - local50 - local29);
			}
		}
		local52 /= 6.0D;
		this.anInt2513 = (int) (local52 * 256.0D);
		this.anInt2512 = (int) (local66 * 256.0D);
		if (this.anInt2512 < 0) {
			this.anInt2512 = 0;
		} else if (this.anInt2512 > 255) {
			this.anInt2512 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!tf;I)V")
	private void method1754(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2514 = arg1.method806();
		} else if (arg0 == 2) {
			this.anInt2515 = arg1.method773();
		} else if (arg0 == 5) {
			this.aBoolean106 = false;
		} else if (arg0 == 7) {
			this.anInt2519 = arg1.method806();
			return;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public void method1756() {
		if (this.anInt2519 != -1) {
			this.method1752(this.anInt2519);
			this.anInt2526 = this.anInt2513;
			this.anInt2527 = this.anInt2522;
			this.anInt2523 = this.anInt2512;
		}
		this.method1752(this.anInt2514);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!tf;)V")
	public void method1759(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		while (true) {
			@Pc(18) int local18 = arg1.method773();
			if (local18 == 0) {
				return;
			}
			this.method1754(local18, arg1, arg0);
		}
	}
}
