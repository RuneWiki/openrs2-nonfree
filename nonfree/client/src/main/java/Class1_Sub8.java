import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!df", name = "I", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!df", name = "D", descriptor = "I")
	public final int anInt628;

	@OriginalMember(owner = "client!df", name = "K", descriptor = "Z")
	public final boolean aBoolean30;

	@OriginalMember(owner = "client!df", name = "F", descriptor = "[I")
	private final int[] anIntArray91;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!df", name = "J", descriptor = "[I")
	private final int[] anIntArray93;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "I")
	public final int anInt630;

	@OriginalMember(owner = "client!df", name = "H", descriptor = "I")
	private final int anInt629;

	@OriginalMember(owner = "client!df", name = "G", descriptor = "[I")
	public int[] anIntArray92;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!mc;)V")
	public Class1_Sub8(@OriginalArg(0) Class1_Sub12 arg0) {
		this.anInt628 = arg0.method1176();
		this.aBoolean30 = arg0.method1190() == 1;
		@Pc(23) int local23 = arg0.method1190();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray91 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray91[local39] = arg0.method1176();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray90 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray90[local62] = arg0.method1190();
			}
		}
		if (local23 > 1) {
			this.anIntArray88 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray88[local62] = arg0.method1190();
			}
		}
		this.anIntArray93 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray93[local62] = arg0.method1210();
		}
		this.anInt630 = arg0.method1190();
		this.anInt629 = arg0.method1190();
		this.anIntArray92 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	public void method502() {
		this.anIntArray92 = null;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public void method503(@OriginalArg(0) int arg0) {
		if (this.anIntArray92 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(79) int[] local79;
		if (this.anInt630 == 1 || this.anInt630 == 3) {
			if (Static21.anIntArray89 == null || Static21.anIntArray89.length < this.anIntArray92.length) {
				Static21.anIntArray89 = new int[this.anIntArray92.length];
			}
			if (this.anIntArray92.length == 4096) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local38 = this.anIntArray92.length;
			local45 = local31 * arg0 * this.anInt629;
			local49 = local38 - 1;
			if (this.anInt630 == 1) {
				local45 = -local45;
			}
			for (local58 = 0; local58 < local38; local58++) {
				local65 = local58 + local45 & local49;
				Static21.anIntArray89[local58] = this.anIntArray92[local65];
			}
			local79 = this.anIntArray92;
			this.anIntArray92 = Static21.anIntArray89;
			Static21.anIntArray89 = local79;
		}
		if (this.anInt630 != 2 && this.anInt630 != 4) {
			return;
		}
		if (Static21.anIntArray89 == null || Static21.anIntArray89.length < this.anIntArray92.length) {
			Static21.anIntArray89 = new int[this.anIntArray92.length];
		}
		if (this.anIntArray92.length == 4096) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local38 = this.anIntArray92.length;
		local45 = arg0 * this.anInt629;
		local49 = local31 - 1;
		if (this.anInt630 == 2) {
			local45 = -local45;
		}
		for (local58 = 0; local58 < local38; local58 += local31) {
			for (local65 = 0; local65 < local31; local65++) {
				@Pc(145) int local145 = local58 + local65;
				@Pc(153) int local153 = local58 + (local65 + local45 & local49);
				Static21.anIntArray89[local145] = this.anIntArray92[local153];
			}
		}
		local79 = this.anIntArray92;
		this.anIntArray92 = Static21.anIntArray89;
		Static21.anIntArray89 = local79;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(DILclient!sf;)Z")
	public boolean method504(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray91.length; local1++) {
			if (arg2.method110(this.anIntArray91[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray92 = new int[local22];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray91.length; local28++) {
			@Pc(37) Class1_Sub1_Sub2_Sub3 local37 = Static97.method1742(arg2, this.anIntArray91[local28]);
			local37.method998();
			@Pc(42) byte[] local42 = local37.aByteArray9;
			@Pc(45) int[] local45 = local37.anIntArray213;
			@Pc(50) int local50 = this.anIntArray93[local28];
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
				local45[local59] = Static91.method1691(local45[local59], arg0);
			}
			if (local28 == 0) {
				local65 = 0;
			} else {
				local65 = this.anIntArray90[local28 - 1];
			}
			if (local65 == 0) {
				if (local37.anInt1432 == arg1) {
					for (local67 = 0; local67 < local22; local67++) {
						this.anIntArray92[local67] = local45[local42[local67] & 0xFF];
					}
				} else {
					@Pc(171) int local171;
					if (local37.anInt1432 == 64 && arg1 == 128) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray92[local67++] = local45[local42[(local171 >> 1) + (local72 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local37.anInt1432 == 128 && arg1 == 64) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray92[local67++] = local45[local42[(local171 << 1) + (local72 << 1 << 7)] & 0xFF];
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
