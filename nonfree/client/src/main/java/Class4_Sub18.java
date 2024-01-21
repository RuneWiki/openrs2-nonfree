import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "Z")
	public boolean aBoolean129 = false;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
	public final int anInt2107;

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "Z")
	public final boolean aBoolean130;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "[I")
	private final int[] anIntArray294;

	@OriginalMember(owner = "client!pb", name = "v", descriptor = "[I")
	private int[] anIntArray293;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "[I")
	private final int[] anIntArray296;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public final int anInt2106;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	private final int anInt2105;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "[I")
	public int[] anIntArray292;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!ne;)V")
	public Class4_Sub18(@OriginalArg(0) Class4_Sub10 arg0) {
		this.anInt2107 = arg0.method604();
		this.aBoolean130 = arg0.method599() == 1;
		@Pc(23) int local23 = arg0.method599();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray294 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray294[local39] = arg0.method604();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray293 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray293[local62] = arg0.method599();
			}
		}
		if (local23 > 1) {
			this.anIntArray295 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray295[local62] = arg0.method599();
			}
		}
		this.anIntArray296 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray296[local62] = arg0.method549();
		}
		this.anInt2106 = arg0.method599();
		this.anInt2105 = arg0.method599();
		this.anIntArray292 = null;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()V")
	public void method1476() {
		this.anIntArray292 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(DILclient!la;)Z")
	public boolean method1477(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray294.length; local1++) {
			if (arg2.method279(this.anIntArray294[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray292 = new int[local22];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray294.length; local28++) {
			@Pc(37) Class4_Sub4_Sub5_Sub4 local37 = Static104.method1603(arg2, this.anIntArray294[local28]);
			local37.method1834();
			@Pc(42) byte[] local42 = local37.aByteArray69;
			@Pc(45) int[] local45 = local37.anIntArray388;
			@Pc(50) int local50 = this.anIntArray296[local28];
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
				local45[local59] = Static37.method714(local45[local59], arg0);
			}
			if (local28 == 0) {
				local65 = 0;
			} else {
				local65 = this.anIntArray293[local28 - 1];
			}
			if (local65 == 0) {
				if (local37.anInt2607 == arg1) {
					for (local67 = 0; local67 < local22; local67++) {
						this.anIntArray292[local67] = local45[local42[local67] & 0xFF];
					}
				} else {
					@Pc(171) int local171;
					if (local37.anInt2607 == 64 && arg1 == 128) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray292[local67++] = local45[local42[(local171 >> 1) + (local72 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local37.anInt2607 == 128 && arg1 == 64) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray292[local67++] = local45[local42[(local171 << 1) + (local72 << 1 << 7)] & 0xFF];
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

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
	public void method1478(@OriginalArg(0) int arg0) {
		if (this.anIntArray292 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(79) int[] local79;
		if (this.anInt2106 == 1 || this.anInt2106 == 3) {
			if (Static89.anIntArray297 == null || Static89.anIntArray297.length < this.anIntArray292.length) {
				Static89.anIntArray297 = new int[this.anIntArray292.length];
			}
			if (this.anIntArray292.length == 4096) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local38 = this.anIntArray292.length;
			local45 = local31 * arg0 * this.anInt2105;
			local49 = local38 - 1;
			if (this.anInt2106 == 1) {
				local45 = -local45;
			}
			for (local58 = 0; local58 < local38; local58++) {
				local65 = local58 + local45 & local49;
				Static89.anIntArray297[local58] = this.anIntArray292[local65];
			}
			local79 = this.anIntArray292;
			this.anIntArray292 = Static89.anIntArray297;
			Static89.anIntArray297 = local79;
		}
		if (this.anInt2106 != 2 && this.anInt2106 != 4) {
			return;
		}
		if (Static89.anIntArray297 == null || Static89.anIntArray297.length < this.anIntArray292.length) {
			Static89.anIntArray297 = new int[this.anIntArray292.length];
		}
		if (this.anIntArray292.length == 4096) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local38 = this.anIntArray292.length;
		local45 = arg0 * this.anInt2105;
		local49 = local31 - 1;
		if (this.anInt2106 == 2) {
			local45 = -local45;
		}
		for (local58 = 0; local58 < local38; local58 += local31) {
			for (local65 = 0; local65 < local31; local65++) {
				@Pc(145) int local145 = local58 + local65;
				@Pc(153) int local153 = local58 + (local65 + local45 & local49);
				Static89.anIntArray297[local145] = this.anIntArray292[local153];
			}
		}
		local79 = this.anIntArray292;
		this.anIntArray292 = Static89.anIntArray297;
		Static89.anIntArray297 = local79;
	}
}
