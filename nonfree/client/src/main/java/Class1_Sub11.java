import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "Z")
	public boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
	public final int anInt1460;

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "Z")
	public final boolean aBoolean43;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "[I")
	private final int[] anIntArray236;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "[I")
	private final int[] anIntArray239;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
	public final int anInt1461;

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
	private final int anInt1462;

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class1_Sub11(@OriginalArg(0) Class1_Sub20 arg0) {
		this.anInt1460 = arg0.method2087();
		this.aBoolean43 = arg0.method2053() == 1;
		@Pc(23) int local23 = arg0.method2053();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray236 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray236[local39] = arg0.method2087();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray234 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray234[local62] = arg0.method2053();
			}
		}
		if (local23 > 1) {
			this.anIntArray235 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray235[local62] = arg0.method2053();
			}
		}
		this.anIntArray239 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray239[local62] = arg0.method2094();
		}
		this.anInt1461 = arg0.method2053();
		this.anInt1462 = arg0.method2053();
		this.anIntArray237 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public void method1099() {
		this.anIntArray237 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(DILclient!kb;)Z")
	public boolean method1100(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class41 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray236.length; local1++) {
			if (arg2.method1705(this.anIntArray236[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray237 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray236.length; local30++) {
			@Pc(39) Class1_Sub3_Sub1_Sub3 local39 = Static111.method1922(arg2, this.anIntArray236[local30]);
			local39.method1684();
			@Pc(44) byte[] local44 = local39.aByteArray33;
			@Pc(47) int[] local47 = local39.anIntArray374;
			@Pc(52) int local52 = this.anIntArray239[local30];
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
				local47[local61] = Static114.method1991(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray234[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2443 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray237[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2443 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray237[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2443 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray237[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray237[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray237[local259];
			this.anIntArray237[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray237[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray237[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public void method1101(@OriginalArg(0) int arg0) {
		if (this.anIntArray237 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1461 == 1 || this.anInt1461 == 3) {
			if (Static61.anIntArray238 == null || Static61.anIntArray238.length < this.anIntArray237.length) {
				Static61.anIntArray238 = new int[this.anIntArray237.length];
			}
			if (this.anIntArray237.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray237.length / 4;
			local47 = local31 * arg0 * this.anInt1462;
			local51 = local40 - 1;
			if (this.anInt1461 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static61.anIntArray238[local60] = this.anIntArray237[local67];
				Static61.anIntArray238[local60 + local40] = this.anIntArray237[local67 + local40];
				Static61.anIntArray238[local60 + local40 + local40] = this.anIntArray237[local67 + local40 + local40];
				Static61.anIntArray238[local60 + local40 + local40 + local40] = this.anIntArray237[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray237;
			this.anIntArray237 = Static61.anIntArray238;
			Static61.anIntArray238 = local126;
		}
		if (this.anInt1461 != 2 && this.anInt1461 != 4) {
			return;
		}
		if (Static61.anIntArray238 == null || Static61.anIntArray238.length < this.anIntArray237.length) {
			Static61.anIntArray238 = new int[this.anIntArray237.length];
		}
		if (this.anIntArray237.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray237.length / 4;
		local47 = arg0 * this.anInt1462;
		local51 = local31 - 1;
		if (this.anInt1461 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static61.anIntArray238[local194] = this.anIntArray237[local202];
				Static61.anIntArray238[local194 + local40] = this.anIntArray237[local202 + local40];
				Static61.anIntArray238[local194 + local40 + local40] = this.anIntArray237[local202 + local40 + local40];
				Static61.anIntArray238[local194 + local40 + local40 + local40] = this.anIntArray237[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray237;
		this.anIntArray237 = Static61.anIntArray238;
		Static61.anIntArray238 = local126;
	}
}
