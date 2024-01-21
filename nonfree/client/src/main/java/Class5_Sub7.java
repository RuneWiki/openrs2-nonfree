import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
	public final int anInt546;

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "Z")
	public final boolean aBoolean16;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "[I")
	private final int[] anIntArray112;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "[I")
	private int[] anIntArray111;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!cf", name = "F", descriptor = "[I")
	private final int[] anIntArray114;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
	public final int anInt545;

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
	private final int anInt547;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!pa;)V")
	public Class5_Sub7(@OriginalArg(0) Class5_Sub14 arg0) {
		this.anInt546 = arg0.method1478();
		this.aBoolean16 = arg0.method1471() == 1;
		@Pc(23) int local23 = arg0.method1471();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray112 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray112[local39] = arg0.method1478();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray111 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray111[local62] = arg0.method1471();
			}
		}
		if (local23 > 1) {
			this.anIntArray110 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray110[local62] = arg0.method1471();
			}
		}
		this.anIntArray114 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray114[local62] = arg0.method1461();
		}
		this.anInt545 = arg0.method1471();
		this.anInt547 = arg0.method1471();
		this.anIntArray115 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
	public void method411() {
		this.anIntArray115 = null;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public void method413(@OriginalArg(0) int arg0) {
		if (this.anIntArray115 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(79) int[] local79;
		if (this.anInt545 == 1 || this.anInt545 == 3) {
			if (Static18.anIntArray113 == null || Static18.anIntArray113.length < this.anIntArray115.length) {
				Static18.anIntArray113 = new int[this.anIntArray115.length];
			}
			if (this.anIntArray115.length == 4096) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local38 = this.anIntArray115.length;
			local45 = local31 * arg0 * this.anInt547;
			local49 = local38 - 1;
			if (this.anInt545 == 1) {
				local45 = -local45;
			}
			for (local58 = 0; local58 < local38; local58++) {
				local65 = local58 + local45 & local49;
				Static18.anIntArray113[local58] = this.anIntArray115[local65];
			}
			local79 = this.anIntArray115;
			this.anIntArray115 = Static18.anIntArray113;
			Static18.anIntArray113 = local79;
		}
		if (this.anInt545 != 2 && this.anInt545 != 4) {
			return;
		}
		if (Static18.anIntArray113 == null || Static18.anIntArray113.length < this.anIntArray115.length) {
			Static18.anIntArray113 = new int[this.anIntArray115.length];
		}
		if (this.anIntArray115.length == 4096) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local38 = this.anIntArray115.length;
		local45 = arg0 * this.anInt547;
		local49 = local31 - 1;
		if (this.anInt545 == 2) {
			local45 = -local45;
		}
		for (local58 = 0; local58 < local38; local58 += local31) {
			for (local65 = 0; local65 < local31; local65++) {
				@Pc(145) int local145 = local58 + local65;
				@Pc(153) int local153 = local58 + (local65 + local45 & local49);
				Static18.anIntArray113[local145] = this.anIntArray115[local153];
			}
		}
		local79 = this.anIntArray115;
		this.anIntArray115 = Static18.anIntArray113;
		Static18.anIntArray113 = local79;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(DILclient!ff;)Z")
	public boolean method414(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray112.length; local1++) {
			if (arg2.method1025(this.anIntArray112[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray115 = new int[local22];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray112.length; local28++) {
			@Pc(37) Class5_Sub2_Sub1_Sub3 local37 = Static83.method1504(this.anIntArray112[local28], arg2);
			local37.method1355();
			@Pc(42) byte[] local42 = local37.aByteArray31;
			@Pc(45) int[] local45 = local37.anIntArray285;
			@Pc(50) int local50 = this.anIntArray114[local28];
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
				local45[local59] = Static51.method934(local45[local59], arg0);
			}
			if (local28 == 0) {
				local65 = 0;
			} else {
				local65 = this.anIntArray111[local28 - 1];
			}
			if (local65 == 0) {
				if (local37.anInt2091 == arg1) {
					for (local67 = 0; local67 < local22; local67++) {
						this.anIntArray115[local67] = local45[local42[local67] & 0xFF];
					}
				} else {
					@Pc(171) int local171;
					if (local37.anInt2091 == 64 && arg1 == 128) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray115[local67++] = local45[local42[(local171 >> 1) + (local72 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local37.anInt2091 == 128 && arg1 == 64) {
						local67 = 0;
						for (local72 = 0; local72 < arg1; local72++) {
							for (local171 = 0; local171 < arg1; local171++) {
								this.anIntArray115[local67++] = local45[local42[(local171 << 1) + (local72 << 1 << 7)] & 0xFF];
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
