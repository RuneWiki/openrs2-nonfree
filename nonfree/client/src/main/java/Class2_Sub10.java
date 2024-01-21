import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "I")
	public final int anInt1749;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "Z")
	public final boolean aBoolean66;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "[I")
	private final int[] anIntArray230;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!nf", name = "z", descriptor = "[I")
	private int[] anIntArray232;

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "[I")
	private final int[] anIntArray233;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	public final int anInt1747;

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
	private final int anInt1748;

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!be;)V")
	public Class2_Sub10(@OriginalArg(0) Class2_Sub4 arg0) {
		this.anInt1749 = arg0.method896();
		this.aBoolean66 = arg0.method933() == 1;
		@Pc(23) int local23 = arg0.method933();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray230 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray230[local39] = arg0.method896();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray229 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray229[local62] = arg0.method933();
			}
		}
		if (local23 > 1) {
			this.anIntArray232 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray232[local62] = arg0.method933();
			}
		}
		this.anIntArray233 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray233[local62] = arg0.method903();
		}
		this.anInt1747 = arg0.method933();
		this.anInt1748 = arg0.method933();
		this.anIntArray234 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()V")
	public void method1309() {
		this.anIntArray234 = null;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public void method1310(@OriginalArg(0) int arg0) {
		if (this.anIntArray234 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(79) int[] local79;
		if (this.anInt1747 == 1 || this.anInt1747 == 3) {
			if (Static80.anIntArray231 == null || Static80.anIntArray231.length < this.anIntArray234.length) {
				Static80.anIntArray231 = new int[this.anIntArray234.length];
			}
			if (this.anIntArray234.length == 4096) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local38 = this.anIntArray234.length;
			local45 = local31 * arg0 * this.anInt1748;
			local49 = local38 - 1;
			if (this.anInt1747 == 1) {
				local45 = -local45;
			}
			for (local58 = 0; local58 < local38; local58++) {
				local65 = local58 + local45 & local49;
				Static80.anIntArray231[local58] = this.anIntArray234[local65];
			}
			local79 = this.anIntArray234;
			this.anIntArray234 = Static80.anIntArray231;
			Static80.anIntArray231 = local79;
		}
		if (this.anInt1747 != 2 && this.anInt1747 != 4) {
			return;
		}
		if (Static80.anIntArray231 == null || Static80.anIntArray231.length < this.anIntArray234.length) {
			Static80.anIntArray231 = new int[this.anIntArray234.length];
		}
		if (this.anIntArray234.length == 4096) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local38 = this.anIntArray234.length;
		local45 = arg0 * this.anInt1748;
		local49 = local31 - 1;
		if (this.anInt1747 == 2) {
			local45 = -local45;
		}
		for (local58 = 0; local58 < local38; local58 += local31) {
			for (local65 = 0; local65 < local31; local65++) {
				@Pc(145) int local145 = local58 + local65;
				@Pc(153) int local153 = local58 + (local65 + local45 & local49);
				Static80.anIntArray231[local145] = this.anIntArray234[local153];
			}
		}
		local79 = this.anIntArray234;
		this.anIntArray234 = Static80.anIntArray231;
		Static80.anIntArray231 = local79;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(DILclient!na;)Z")
	public boolean method1311(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray230.length; local1++) {
			if (arg2.method1686(this.anIntArray230[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray234 = new int[local22];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray230.length; local28++) {
			@Pc(37) Class2_Sub1_Sub4_Sub2 local37 = Static33.method630(arg2, this.anIntArray230[local28]);
			local37.method997();
			@Pc(42) byte[] local42 = local37.aByteArray21;
			@Pc(45) int[] local45 = local37.anIntArray167;
			@Pc(50) int local50 = this.anIntArray233[local28];
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
				local45[local59] = Static87.method1424(local45[local59], arg0);
			}
			if (local28 == 0) {
				local65 = 0;
			} else {
				local65 = this.anIntArray229[local28 - 1];
			}
			if (local65 == 0) {
				if (local37.anInt1370 == arg1) {
					for (local67 = 0; local67 < local22; local67++) {
						this.anIntArray234[local67] = local45[local42[local67] & 0xFF];
					}
				} else {
					@Pc(171) int local171;
					if (local37.anInt1370 == 64 && arg1 == 128) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray234[local67++] = local45[local42[(local171 >> 1) + (local72 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local37.anInt1370 == 128 && arg1 == 64) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray234[local67++] = local45[local42[(local171 << 1) + (local72 << 1 << 7)] & 0xFF];
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
