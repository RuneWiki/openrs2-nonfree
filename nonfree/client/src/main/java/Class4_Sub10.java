import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Z")
	public boolean aBoolean50 = false;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	public final int anInt1540;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Z")
	public final boolean aBoolean51;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[I")
	private final int[] anIntArray154;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!k", name = "x", descriptor = "[I")
	private final int[] anIntArray156;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	public final int anInt1542;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "I")
	private final int anInt1541;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "[I")
	public int[] anIntArray152;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!tf;)V")
	public Class4_Sub10(@OriginalArg(0) Class4_Sub9 arg0) {
		this.anInt1540 = arg0.method816();
		this.aBoolean51 = arg0.method773() == 1;
		@Pc(23) int local23 = arg0.method773();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray154 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray154[local39] = arg0.method816();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray151 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray151[local62] = arg0.method773();
			}
		}
		if (local23 > 1) {
			this.anIntArray155 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray155[local62] = arg0.method773();
			}
		}
		this.anIntArray156 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray156[local62] = arg0.method780();
		}
		this.anInt1542 = arg0.method773();
		this.anInt1541 = arg0.method773();
		this.anIntArray152 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "()V")
	public void method943() {
		this.anIntArray152 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(DILclient!c;)Z")
	public boolean method945(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray154.length; local1++) {
			if (arg2.method1776(this.anIntArray154[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray152 = new int[local22];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray154.length; local28++) {
			@Pc(37) Class4_Sub3_Sub6_Sub2 local37 = Static96.method1572(arg2, this.anIntArray154[local28]);
			local37.method1556();
			@Pc(42) byte[] local42 = local37.aByteArray35;
			@Pc(45) int[] local45 = local37.anIntArray285;
			@Pc(50) int local50 = this.anIntArray156[local28];
			@Pc(59) int local59;
			@Pc(65) int local65;
			@Pc(67) int local67;
			@Pc(72) int local72;
			if ((local50 & 0xFF000000) == 50331648) {
				local59 = local50 & 0xFF00FF;
				local65 = local50 >> 8 & 0xFF;
				for (local67 = 0; local67 < local45.length; local67++) {
					local72 = local45[local67];
					if ((local72 & 0xFFFF) == local72 >> 8) {
						local72 &= 0xFF;
						local45[local67] = local59 * local72 >> 8 & 0xFF00FF | local65 * local72 & 0xFF00;
					}
				}
			}
			for (local59 = 0; local59 < local45.length; local59++) {
				local45[local59] = Static100.method1666(local45[local59], arg0);
			}
			if (local28 == 0) {
				local65 = 0;
			} else {
				local65 = this.anIntArray151[local28 - 1];
			}
			if (local65 == 0) {
				if (local37.anInt2255 == arg1) {
					for (local67 = 0; local67 < local22; local67++) {
						this.anIntArray152[local67] = local45[local42[local67] & 0xFF];
					}
				} else {
					@Pc(171) int local171;
					if (local37.anInt2255 == 64 && arg1 == 128) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray152[local67++] = local45[local42[(local171 >> 1) + (local72 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local37.anInt2255 == 128 && arg1 == 64) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray152[local67++] = local45[local42[(local171 << 1) + (local72 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
	public void method946(@OriginalArg(0) int arg0) {
		if (this.anIntArray152 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(79) int[] local79;
		if (this.anInt1542 == 1 || this.anInt1542 == 3) {
			if (Static57.anIntArray153 == null || Static57.anIntArray153.length < this.anIntArray152.length) {
				Static57.anIntArray153 = new int[this.anIntArray152.length];
			}
			if (this.anIntArray152.length == 4096) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local38 = this.anIntArray152.length;
			local45 = local31 * arg0 * this.anInt1541;
			local49 = local38 - 1;
			if (this.anInt1542 == 1) {
				local45 = -local45;
			}
			for (local58 = 0; local58 < local38; local58++) {
				local65 = local58 + local45 & local49;
				Static57.anIntArray153[local58] = this.anIntArray152[local65];
			}
			local79 = this.anIntArray152;
			this.anIntArray152 = Static57.anIntArray153;
			Static57.anIntArray153 = local79;
		}
		if (this.anInt1542 != 2 && this.anInt1542 != 4) {
			return;
		}
		if (Static57.anIntArray153 == null || Static57.anIntArray153.length < this.anIntArray152.length) {
			Static57.anIntArray153 = new int[this.anIntArray152.length];
		}
		if (this.anIntArray152.length == 4096) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local38 = this.anIntArray152.length;
		local45 = arg0 * this.anInt1541;
		local49 = local31 - 1;
		if (this.anInt1542 == 2) {
			local45 = -local45;
		}
		for (local58 = 0; local58 < local38; local58 += local31) {
			for (local65 = 0; local65 < local31; local65++) {
				@Pc(145) int local145 = local58 + local65;
				@Pc(153) int local153 = local58 + (local65 + local45 & local49);
				Static57.anIntArray153[local145] = this.anIntArray152[local153];
			}
		}
		local79 = this.anIntArray152;
		this.anIntArray152 = Static57.anIntArray153;
		Static57.anIntArray153 = local79;
	}
}
