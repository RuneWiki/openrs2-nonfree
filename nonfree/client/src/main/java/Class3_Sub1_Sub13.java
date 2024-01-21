import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qe", name = "kb", descriptor = "[I")
	public static int[] anIntArray263 = new int[32];

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
	public int anInt2019;

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
	public int anInt2020;

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
	public int anInt2022;

	@OriginalMember(owner = "client!qe", name = "pb", descriptor = "I")
	public int anInt2030;

	@OriginalMember(owner = "client!qe", name = "sb", descriptor = "I")
	public int anInt2033;

	@OriginalMember(owner = "client!qe", name = "Eb", descriptor = "I")
	public int anInt2037;

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
	public int anInt2026 = -1;

	@OriginalMember(owner = "client!qe", name = "nb", descriptor = "I")
	public int anInt2028 = 0;

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
	public int anInt2023 = -1;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray263[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
	public void method1388() {
		if (this.anInt2023 != -1) {
			this.method1392(this.anInt2023);
			this.anInt2019 = this.anInt2020;
			this.anInt2037 = this.anInt2022;
			this.anInt2030 = this.anInt2033;
		}
		this.method1392(this.anInt2028);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(IB)V")
	private void method1392(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		if (local10 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(50) double local50 = local10;
		@Pc(52) double local52 = 0.0D;
		if (local23 > local10) {
			local50 = local23;
		}
		if (local50 < local30) {
			local50 = local30;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local50 + local32) / 2.0D;
		if (local32 != local50) {
			if (local72 < 0.5D) {
				local66 = (local50 - local32) / (local50 + local32);
			}
			if (local10 == local50) {
				local52 = (local23 - local30) / (local50 - local32);
			} else if (local23 == local50) {
				local52 = (local30 - local10) / (local50 - local32) + 2.0D;
			} else if (local30 == local50) {
				local52 = (local10 - local23) / (-local32 + local50) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local66 = (local50 - local32) / (2.0D - local50 - local32);
			}
		}
		this.anInt2022 = (int) (local72 * 256.0D);
		this.anInt2020 = (int) (local66 * 256.0D);
		local52 /= 6.0D;
		if (this.anInt2022 < 0) {
			this.anInt2022 = 0;
		} else if (this.anInt2022 > 255) {
			this.anInt2022 = 255;
		}
		this.anInt2033 = (int) (local52 * 256.0D);
		if (this.anInt2020 < 0) {
			this.anInt2020 = 0;
		} else if (this.anInt2020 > 255) {
			this.anInt2020 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!gb;III)V")
	private void method1393(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2028 = arg0.method458();
		} else if (arg2 == 2) {
			this.anInt2026 = arg0.method446();
		} else if (arg2 == 5) {
			this.aBoolean157 = false;
		} else if (arg2 == 7) {
			this.anInt2023 = arg0.method458();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!gb;I)V")
	public void method1395(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method446();
			if (local9 == 0) {
				return;
			}
			this.method1393(arg1, arg0, local9);
		}
	}
}
