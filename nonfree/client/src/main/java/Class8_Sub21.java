import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class8_Sub21 extends Class8 {

	@OriginalMember(owner = "client!v", name = "v", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "I")
	public final int anInt2923;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "Z")
	public final boolean aBoolean107;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "[I")
	private final int[] anIntArray385;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "[I")
	private int[] anIntArray388;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "[I")
	private final int[] anIntArray387;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "I")
	public final int anInt2922;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "I")
	private final int anInt2924;

	@OriginalMember(owner = "client!v", name = "B", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class8_Sub21(@OriginalArg(0) Class8_Sub20 arg0) {
		this.anInt2923 = arg0.method1839();
		this.aBoolean107 = arg0.method1872() == 1;
		@Pc(23) int local23 = arg0.method1872();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray385 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray385[local39] = arg0.method1839();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray386 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray386[local62] = arg0.method1872();
			}
		}
		if (local23 > 1) {
			this.anIntArray388 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray388[local62] = arg0.method1872();
			}
		}
		this.anIntArray387 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray387[local62] = arg0.method1853();
		}
		this.anInt2922 = arg0.method1872();
		this.anInt2924 = arg0.method1872();
		this.anIntArray390 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public void method1936(@OriginalArg(0) int arg0) {
		if (this.anIntArray390 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(79) int[] local79;
		if (this.anInt2922 == 1 || this.anInt2922 == 3) {
			if (Static122.anIntArray389 == null || Static122.anIntArray389.length < this.anIntArray390.length) {
				Static122.anIntArray389 = new int[this.anIntArray390.length];
			}
			if (this.anIntArray390.length == 4096) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local38 = this.anIntArray390.length;
			local45 = local31 * arg0 * this.anInt2924;
			local49 = local38 - 1;
			if (this.anInt2922 == 1) {
				local45 = -local45;
			}
			for (local58 = 0; local58 < local38; local58++) {
				local65 = local58 + local45 & local49;
				Static122.anIntArray389[local58] = this.anIntArray390[local65];
			}
			local79 = this.anIntArray390;
			this.anIntArray390 = Static122.anIntArray389;
			Static122.anIntArray389 = local79;
		}
		if (this.anInt2922 != 2 && this.anInt2922 != 4) {
			return;
		}
		if (Static122.anIntArray389 == null || Static122.anIntArray389.length < this.anIntArray390.length) {
			Static122.anIntArray389 = new int[this.anIntArray390.length];
		}
		if (this.anIntArray390.length == 4096) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local38 = this.anIntArray390.length;
		local45 = arg0 * this.anInt2924;
		local49 = local31 - 1;
		if (this.anInt2922 == 2) {
			local45 = -local45;
		}
		for (local58 = 0; local58 < local38; local58 += local31) {
			for (local65 = 0; local65 < local31; local65++) {
				@Pc(145) int local145 = local58 + local65;
				@Pc(153) int local153 = local58 + (local65 + local45 & local49);
				Static122.anIntArray389[local145] = this.anIntArray390[local153];
			}
		}
		local79 = this.anIntArray390;
		this.anIntArray390 = Static122.anIntArray389;
		Static122.anIntArray389 = local79;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	public void method1937() {
		this.anIntArray390 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(DILclient!dd;)Z")
	public boolean method1938(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray385.length; local1++) {
			if (arg2.method1165(this.anIntArray385[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray390 = new int[local22];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray385.length; local28++) {
			@Pc(37) Class8_Sub1_Sub3_Sub2 local37 = Static134.method2016(this.anIntArray385[local28], arg2);
			local37.method303();
			@Pc(42) byte[] local42 = local37.aByteArray3;
			@Pc(45) int[] local45 = local37.anIntArray62;
			@Pc(50) int local50 = this.anIntArray387[local28];
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
				local45[local59] = Static11.method171(local45[local59], arg0);
			}
			if (local28 == 0) {
				local65 = 0;
			} else {
				local65 = this.anIntArray386[local28 - 1];
			}
			if (local65 == 0) {
				if (local37.anInt484 == arg1) {
					for (local67 = 0; local67 < local22; local67++) {
						this.anIntArray390[local67] = local45[local42[local67] & 0xFF];
					}
				} else {
					@Pc(171) int local171;
					if (local37.anInt484 == 64 && arg1 == 128) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray390[local67++] = local45[local42[(local171 >> 1) + (local72 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local37.anInt484 == 128 && arg1 == 64) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray390[local67++] = local45[local42[(local171 << 1) + (local72 << 1 << 7)] & 0xFF];
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
}
