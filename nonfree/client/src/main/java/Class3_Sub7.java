import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "Z")
	public boolean aBoolean101 = false;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
	public final int anInt1422;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "Z")
	public final boolean aBoolean102;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "[I")
	private final int[] anIntArray190;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "[I")
	private final int[] anIntArray189;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
	public final int anInt1423;

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
	private final int anInt1424;

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "[I")
	public int[] anIntArray192;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!gb;)V")
	public Class3_Sub7(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt1422 = arg0.method459();
		this.aBoolean102 = arg0.method446() == 1;
		@Pc(23) int local23 = arg0.method446();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray190 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray190[local39] = arg0.method459();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray193 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray193[local62] = arg0.method446();
			}
		}
		if (local23 > 1) {
			this.anIntArray194 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray194[local62] = arg0.method446();
			}
		}
		this.anIntArray189 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray189[local62] = arg0.method438();
		}
		this.anInt1423 = arg0.method446();
		this.anInt1424 = arg0.method446();
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	public void method952(@OriginalArg(0) int arg0) {
		if (this.anIntArray192 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1423 == 1 || this.anInt1423 == 3) {
			if (Static57.anIntArray191 == null || Static57.anIntArray191.length < this.anIntArray192.length) {
				Static57.anIntArray191 = new int[this.anIntArray192.length];
			}
			if (this.anIntArray192.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray192.length / 4;
			local47 = local31 * arg0 * this.anInt1424;
			local51 = local40 - 1;
			if (this.anInt1423 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static57.anIntArray191[local60] = this.anIntArray192[local67];
				Static57.anIntArray191[local60 + local40] = this.anIntArray192[local67 + local40];
				Static57.anIntArray191[local60 + local40 + local40] = this.anIntArray192[local67 + local40 + local40];
				Static57.anIntArray191[local60 + local40 + local40 + local40] = this.anIntArray192[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray192;
			this.anIntArray192 = Static57.anIntArray191;
			Static57.anIntArray191 = local126;
		}
		if (this.anInt1423 != 2 && this.anInt1423 != 4) {
			return;
		}
		if (Static57.anIntArray191 == null || Static57.anIntArray191.length < this.anIntArray192.length) {
			Static57.anIntArray191 = new int[this.anIntArray192.length];
		}
		if (this.anIntArray192.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray192.length / 4;
		local47 = arg0 * this.anInt1424;
		local51 = local31 - 1;
		if (this.anInt1423 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static57.anIntArray191[local194] = this.anIntArray192[local202];
				Static57.anIntArray191[local194 + local40] = this.anIntArray192[local202 + local40];
				Static57.anIntArray191[local194 + local40 + local40] = this.anIntArray192[local202 + local40 + local40];
				Static57.anIntArray191[local194 + local40 + local40 + local40] = this.anIntArray192[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray192;
		this.anIntArray192 = Static57.anIntArray191;
		Static57.anIntArray191 = local126;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()V")
	public void method953() {
		this.anIntArray192 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(DILclient!rd;)Z")
	public boolean method954(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray190.length; local1++) {
			if (arg2.method1619(this.anIntArray190[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray192 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray190.length; local30++) {
			@Pc(39) Class3_Sub1_Sub4_Sub3 local39 = Static20.method294(this.anIntArray190[local30], arg2);
			local39.method1773();
			@Pc(44) byte[] local44 = local39.aByteArray22;
			@Pc(47) int[] local47 = local39.anIntArray327;
			@Pc(52) int local52 = this.anIntArray189[local30];
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
				local47[local61] = Static99.method1601(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray193[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2604 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray192[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2604 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray192[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2604 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray192[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray192[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray192[local259];
			this.anIntArray192[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray192[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray192[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}
}
