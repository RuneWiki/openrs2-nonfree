import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
	public final int anInt2625;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Z")
	public final boolean aBoolean149;

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "[I")
	private final int[] anIntArray320;

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "[I")
	private final int[] anIntArray318;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
	public final int anInt2627;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
	private final int anInt2626;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!m;)V")
	public Class3_Sub20(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt2625 = arg0.method974();
		this.aBoolean149 = arg0.method981() == 1;
		@Pc(23) int local23 = arg0.method981();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray320 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray320[local39] = arg0.method974();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray315 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray315[local62] = arg0.method981();
			}
		}
		if (local23 > 1) {
			this.anIntArray316 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray316[local62] = arg0.method981();
			}
		}
		this.anIntArray318 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray318[local62] = arg0.method984();
		}
		this.anInt2627 = arg0.method981();
		this.anInt2626 = arg0.method981();
		this.anIntArray317 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(DILclient!ef;)Z")
	public boolean method1794(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray320.length; local1++) {
			if (arg2.method569(this.anIntArray320[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray317 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray320.length; local30++) {
			@Pc(39) Class3_Sub1_Sub4_Sub1 local39 = Static78.method1362(arg2, this.anIntArray320[local30]);
			local39.method347();
			@Pc(44) byte[] local44 = local39.aByteArray2;
			@Pc(47) int[] local47 = local39.anIntArray60;
			@Pc(52) int local52 = this.anIntArray318[local30];
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
				local47[local61] = Static127.method2233(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray315[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt509 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray317[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt509 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray317[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt509 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray317[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray317[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray317[local259];
			this.anIntArray317[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray317[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray317[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public void method1795(@OriginalArg(0) int arg0) {
		if (this.anIntArray317 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt2627 == 1 || this.anInt2627 == 3) {
			if (Static97.anIntArray319 == null || Static97.anIntArray319.length < this.anIntArray317.length) {
				Static97.anIntArray319 = new int[this.anIntArray317.length];
			}
			if (this.anIntArray317.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray317.length / 4;
			local47 = local31 * arg0 * this.anInt2626;
			local51 = local40 - 1;
			if (this.anInt2627 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static97.anIntArray319[local60] = this.anIntArray317[local67];
				Static97.anIntArray319[local60 + local40] = this.anIntArray317[local67 + local40];
				Static97.anIntArray319[local60 + local40 + local40] = this.anIntArray317[local67 + local40 + local40];
				Static97.anIntArray319[local60 + local40 + local40 + local40] = this.anIntArray317[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray317;
			this.anIntArray317 = Static97.anIntArray319;
			Static97.anIntArray319 = local126;
		}
		if (this.anInt2627 != 2 && this.anInt2627 != 4) {
			return;
		}
		if (Static97.anIntArray319 == null || Static97.anIntArray319.length < this.anIntArray317.length) {
			Static97.anIntArray319 = new int[this.anIntArray317.length];
		}
		if (this.anIntArray317.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray317.length / 4;
		local47 = arg0 * this.anInt2626;
		local51 = local31 - 1;
		if (this.anInt2627 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static97.anIntArray319[local194] = this.anIntArray317[local202];
				Static97.anIntArray319[local194 + local40] = this.anIntArray317[local202 + local40];
				Static97.anIntArray319[local194 + local40 + local40] = this.anIntArray317[local202 + local40 + local40];
				Static97.anIntArray319[local194 + local40 + local40 + local40] = this.anIntArray317[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray317;
		this.anIntArray317 = Static97.anIntArray319;
		Static97.anIntArray319 = local126;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
	public void method1796() {
		this.anIntArray317 = null;
	}
}
