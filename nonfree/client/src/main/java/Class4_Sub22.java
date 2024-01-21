import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Z")
	public boolean aBoolean267 = false;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
	public final int anInt2968;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Z")
	public final boolean aBoolean266;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "[I")
	private final int[] anIntArray324;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "[I")
	private final int[] anIntArray320;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	public final int anInt2967;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	private final int anInt2966;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "[I")
	public int[] anIntArray322;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!jd;)V")
	public Class4_Sub22(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt2968 = arg0.method718();
		this.aBoolean266 = arg0.method719() == 1;
		@Pc(23) int local23 = arg0.method719();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray324 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray324[local39] = arg0.method718();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray325 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray325[local62] = arg0.method719();
			}
		}
		if (local23 > 1) {
			this.anIntArray323 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray323[local62] = arg0.method719();
			}
		}
		this.anIntArray320 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray320[local62] = arg0.method725();
		}
		this.anInt2967 = arg0.method719();
		this.anInt2966 = arg0.method719();
		this.anIntArray322 = null;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
	public void method1897(@OriginalArg(0) int arg0) {
		if (this.anIntArray322 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(79) int[] local79;
		if (this.anInt2967 == 1 || this.anInt2967 == 3) {
			if (Static125.anIntArray321 == null || Static125.anIntArray321.length < this.anIntArray322.length) {
				Static125.anIntArray321 = new int[this.anIntArray322.length];
			}
			if (this.anIntArray322.length == 4096) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local38 = this.anIntArray322.length;
			local45 = local31 * arg0 * this.anInt2966;
			local49 = local38 - 1;
			if (this.anInt2967 == 1) {
				local45 = -local45;
			}
			for (local58 = 0; local58 < local38; local58++) {
				local65 = local58 + local45 & local49;
				Static125.anIntArray321[local58] = this.anIntArray322[local65];
			}
			local79 = this.anIntArray322;
			this.anIntArray322 = Static125.anIntArray321;
			Static125.anIntArray321 = local79;
		}
		if (this.anInt2967 != 2 && this.anInt2967 != 4) {
			return;
		}
		if (Static125.anIntArray321 == null || Static125.anIntArray321.length < this.anIntArray322.length) {
			Static125.anIntArray321 = new int[this.anIntArray322.length];
		}
		if (this.anIntArray322.length == 4096) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local38 = this.anIntArray322.length;
		local45 = arg0 * this.anInt2966;
		local49 = local31 - 1;
		if (this.anInt2967 == 2) {
			local45 = -local45;
		}
		for (local58 = 0; local58 < local38; local58 += local31) {
			for (local65 = 0; local65 < local31; local65++) {
				@Pc(145) int local145 = local58 + local65;
				@Pc(153) int local153 = local58 + (local65 + local45 & local49);
				Static125.anIntArray321[local145] = this.anIntArray322[local153];
			}
		}
		local79 = this.anIntArray322;
		this.anIntArray322 = Static125.anIntArray321;
		Static125.anIntArray321 = local79;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public void method1898() {
		this.anIntArray322 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(DILclient!ea;)Z")
	public boolean method1900(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray324.length; local1++) {
			if (arg2.method607(this.anIntArray324[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray322 = new int[local22];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray324.length; local28++) {
			@Pc(37) Class4_Sub1_Sub2_Sub3 local37 = Static44.method862(arg2, this.anIntArray324[local28]);
			local37.method852();
			@Pc(42) byte[] local42 = local37.aByteArray11;
			@Pc(45) int[] local45 = local37.anIntArray132;
			@Pc(50) int local50 = this.anIntArray320[local28];
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
				local45[local59] = Static6.method121(local45[local59], arg0);
			}
			if (local28 == 0) {
				local65 = 0;
			} else {
				local65 = this.anIntArray325[local28 - 1];
			}
			if (local65 == 0) {
				if (local37.anInt1206 == arg1) {
					for (local67 = 0; local67 < local22; local67++) {
						this.anIntArray322[local67] = local45[local42[local67] & 0xFF];
					}
				} else {
					@Pc(171) int local171;
					if (local37.anInt1206 == 64 && arg1 == 128) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray322[local67++] = local45[local42[(local171 >> 1) + (local72 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local37.anInt1206 == 128 && arg1 == 64) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray322[local67++] = local45[local42[(local171 << 1) + (local72 << 1 << 7)] & 0xFF];
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
