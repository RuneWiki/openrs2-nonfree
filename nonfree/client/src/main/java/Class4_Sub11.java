import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!id", name = "w", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "I")
	public final int anInt1312;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Z")
	public final boolean aBoolean45;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "[I")
	private final int[] anIntArray124;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "[I")
	private int[] anIntArray129;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
	private final int[] anIntArray128;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public final int anInt1311;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "I")
	private final int anInt1310;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "[I")
	public int[] anIntArray125;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class4_Sub11(@OriginalArg(0) Class4_Sub13 arg0) {
		this.anInt1312 = arg0.method1244();
		this.aBoolean45 = arg0.method1223() == 1;
		@Pc(23) int local23 = arg0.method1223();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray124 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray124[local39] = arg0.method1244();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray126 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray126[local62] = arg0.method1223();
			}
		}
		if (local23 > 1) {
			this.anIntArray129 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray129[local62] = arg0.method1223();
			}
		}
		this.anIntArray128 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray128[local62] = arg0.method1215();
		}
		this.anInt1311 = arg0.method1223();
		this.anInt1310 = arg0.method1223();
		this.anIntArray125 = null;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public void method949(@OriginalArg(0) int arg0) {
		if (this.anIntArray125 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1311 == 1 || this.anInt1311 == 3) {
			if (Static49.anIntArray127 == null || Static49.anIntArray127.length < this.anIntArray125.length) {
				Static49.anIntArray127 = new int[this.anIntArray125.length];
			}
			if (this.anIntArray125.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray125.length / 4;
			local47 = local31 * arg0 * this.anInt1310;
			local51 = local40 - 1;
			if (this.anInt1311 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static49.anIntArray127[local60] = this.anIntArray125[local67];
				Static49.anIntArray127[local60 + local40] = this.anIntArray125[local67 + local40];
				Static49.anIntArray127[local60 + local40 + local40] = this.anIntArray125[local67 + local40 + local40];
				Static49.anIntArray127[local60 + local40 + local40 + local40] = this.anIntArray125[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray125;
			this.anIntArray125 = Static49.anIntArray127;
			Static49.anIntArray127 = local126;
		}
		if (this.anInt1311 != 2 && this.anInt1311 != 4) {
			return;
		}
		if (Static49.anIntArray127 == null || Static49.anIntArray127.length < this.anIntArray125.length) {
			Static49.anIntArray127 = new int[this.anIntArray125.length];
		}
		if (this.anIntArray125.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray125.length / 4;
		local47 = arg0 * this.anInt1310;
		local51 = local31 - 1;
		if (this.anInt1311 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static49.anIntArray127[local194] = this.anIntArray125[local202];
				Static49.anIntArray127[local194 + local40] = this.anIntArray125[local202 + local40];
				Static49.anIntArray127[local194 + local40 + local40] = this.anIntArray125[local202 + local40 + local40];
				Static49.anIntArray127[local194 + local40 + local40 + local40] = this.anIntArray125[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray125;
		this.anIntArray125 = Static49.anIntArray127;
		Static49.anIntArray127 = local126;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
	public void method950() {
		this.anIntArray125 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(DILclient!lc;)Z")
	public boolean method952(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray124.length; local1++) {
			if (arg2.method1116(this.anIntArray124[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray125 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray124.length; local30++) {
			@Pc(39) Class4_Sub4_Sub3_Sub1 local39 = Static106.method1828(this.anIntArray124[local30], arg2);
			local39.method433();
			@Pc(44) byte[] local44 = local39.aByteArray24;
			@Pc(47) int[] local47 = local39.anIntArray35;
			@Pc(52) int local52 = this.anIntArray128[local30];
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
				local47[local61] = Static91.method1602(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray126[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt635 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray125[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt635 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray125[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt635 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray125[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray125[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray125[local259];
			this.anIntArray125[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray125[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray125[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}
}
