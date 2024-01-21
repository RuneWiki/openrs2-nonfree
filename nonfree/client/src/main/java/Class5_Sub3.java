import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "Z")
	public boolean aBoolean19 = false;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
	public final int anInt507;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "Z")
	public final boolean aBoolean20;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "[I")
	private final int[] anIntArray66;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "[I")
	private final int[] anIntArray64;

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
	public final int anInt506;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
	private final int anInt508;

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class5_Sub3(@OriginalArg(0) Class5_Sub11 arg0) {
		this.anInt507 = arg0.method1543();
		this.aBoolean20 = arg0.method1546() == 1;
		@Pc(23) int local23 = arg0.method1546();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray66 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray66[local39] = arg0.method1543();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray63 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray63[local62] = arg0.method1546();
			}
		}
		if (local23 > 1) {
			this.anIntArray65 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray65[local62] = arg0.method1546();
			}
		}
		this.anIntArray64 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray64[local62] = arg0.method1540();
		}
		this.anInt506 = arg0.method1546();
		this.anInt508 = arg0.method1546();
		this.anIntArray68 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
	public void method419() {
		this.anIntArray68 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(DILclient!nb;)Z")
	public boolean method421(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray66.length; local1++) {
			if (arg2.method658(this.anIntArray66[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray68 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray66.length; local30++) {
			@Pc(39) Class5_Sub1_Sub10_Sub1 local39 = Static2.method1235(arg2, this.anIntArray66[local30]);
			local39.method917();
			@Pc(44) byte[] local44 = local39.aByteArray8;
			@Pc(47) int[] local47 = local39.anIntArray154;
			@Pc(52) int local52 = this.anIntArray64[local30];
			@Pc(61) int local61;
			@Pc(67) int local67;
			@Pc(69) int local69;
			@Pc(74) int local74;
			if ((local52 & 0xFF000000) == 50331648) {
				local61 = local52 & 0xFF00FF;
				local67 = local52 >> 8 & 0xFF;
				for (local69 = 0; local69 < local47.length; local69++) {
					local74 = local47[local69];
					if ((local74 & 0xFFFF) == local74 >> 8) {
						local74 &= 0xFF;
						local47[local69] = local61 * local74 >> 8 & 0xFF00FF | local67 * local74 & 0xFF00;
					}
				}
			}
			for (local61 = 0; local61 < local47.length; local61++) {
				local47[local61] = Static80.method1322(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray63[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt1350 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray68[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt1350 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray68[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt1350 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray68[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray68[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray68[local259];
			this.anIntArray68[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray68[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray68[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public void method422(@OriginalArg(0) int arg0) {
		if (this.anIntArray68 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt506 == 1 || this.anInt506 == 3) {
			if (Static15.anIntArray67 == null || Static15.anIntArray67.length < this.anIntArray68.length) {
				Static15.anIntArray67 = new int[this.anIntArray68.length];
			}
			if (this.anIntArray68.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray68.length / 4;
			local47 = local31 * arg0 * this.anInt508;
			local51 = local40 - 1;
			if (this.anInt506 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static15.anIntArray67[local60] = this.anIntArray68[local67];
				Static15.anIntArray67[local60 + local40] = this.anIntArray68[local67 + local40];
				Static15.anIntArray67[local60 + local40 + local40] = this.anIntArray68[local67 + local40 + local40];
				Static15.anIntArray67[local60 + local40 + local40 + local40] = this.anIntArray68[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray68;
			this.anIntArray68 = Static15.anIntArray67;
			Static15.anIntArray67 = local126;
		}
		if (this.anInt506 != 2 && this.anInt506 != 4) {
			return;
		}
		if (Static15.anIntArray67 == null || Static15.anIntArray67.length < this.anIntArray68.length) {
			Static15.anIntArray67 = new int[this.anIntArray68.length];
		}
		if (this.anIntArray68.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray68.length / 4;
		local47 = arg0 * this.anInt508;
		local51 = local31 - 1;
		if (this.anInt506 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static15.anIntArray67[local194] = this.anIntArray68[local202];
				Static15.anIntArray67[local194 + local40] = this.anIntArray68[local202 + local40];
				Static15.anIntArray67[local194 + local40 + local40] = this.anIntArray68[local202 + local40 + local40];
				Static15.anIntArray67[local194 + local40 + local40 + local40] = this.anIntArray68[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray68;
		this.anIntArray68 = Static15.anIntArray67;
		Static15.anIntArray67 = local126;
	}
}
