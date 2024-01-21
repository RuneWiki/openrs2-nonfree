import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!q", name = "M", descriptor = "Z")
	public boolean aBoolean112 = false;

	@OriginalMember(owner = "client!q", name = "O", descriptor = "I")
	public final int anInt2388;

	@OriginalMember(owner = "client!q", name = "J", descriptor = "Z")
	public final boolean aBoolean111;

	@OriginalMember(owner = "client!q", name = "G", descriptor = "[I")
	private final int[] anIntArray208;

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!q", name = "K", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!q", name = "I", descriptor = "[I")
	private final int[] anIntArray210;

	@OriginalMember(owner = "client!q", name = "N", descriptor = "I")
	public final int anInt2387;

	@OriginalMember(owner = "client!q", name = "L", descriptor = "I")
	private final int anInt2386;

	@OriginalMember(owner = "client!q", name = "P", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!b;)V")
	public Class3_Sub14(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt2388 = arg0.method276();
		this.aBoolean111 = arg0.method270() == 1;
		@Pc(23) int local23 = arg0.method270();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray208 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray208[local39] = arg0.method276();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray213 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray213[local62] = arg0.method270();
			}
		}
		if (local23 > 1) {
			this.anIntArray211 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray211[local62] = arg0.method270();
			}
		}
		this.anIntArray210 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray210[local62] = arg0.method278();
		}
		this.anInt2387 = arg0.method270();
		this.anInt2386 = arg0.method270();
		this.anIntArray212 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(DILclient!tb;)Z")
	public boolean method1621(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray208.length; local1++) {
			if (arg2.method1152(this.anIntArray208[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray212 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray208.length; local30++) {
			@Pc(39) Class3_Sub1_Sub1_Sub4 local39 = Static92.method1645(arg2, this.anIntArray208[local30]);
			local39.method1503();
			@Pc(44) byte[] local44 = local39.aByteArray30;
			@Pc(47) int[] local47 = local39.anIntArray190;
			@Pc(52) int local52 = this.anIntArray210[local30];
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
				local47[local61] = Static55.method1057(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray213[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2250 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray212[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2250 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray212[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2250 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray212[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray212[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray212[local259];
			this.anIntArray212[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray212[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray212[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	public void method1622() {
		this.anIntArray212 = null;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public void method1623(@OriginalArg(0) int arg0) {
		if (this.anIntArray212 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt2387 == 1 || this.anInt2387 == 3) {
			if (Static90.anIntArray209 == null || Static90.anIntArray209.length < this.anIntArray212.length) {
				Static90.anIntArray209 = new int[this.anIntArray212.length];
			}
			if (this.anIntArray212.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray212.length / 4;
			local47 = local31 * arg0 * this.anInt2386;
			local51 = local40 - 1;
			if (this.anInt2387 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static90.anIntArray209[local60] = this.anIntArray212[local67];
				Static90.anIntArray209[local60 + local40] = this.anIntArray212[local67 + local40];
				Static90.anIntArray209[local60 + local40 + local40] = this.anIntArray212[local67 + local40 + local40];
				Static90.anIntArray209[local60 + local40 + local40 + local40] = this.anIntArray212[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray212;
			this.anIntArray212 = Static90.anIntArray209;
			Static90.anIntArray209 = local126;
		}
		if (this.anInt2387 != 2 && this.anInt2387 != 4) {
			return;
		}
		if (Static90.anIntArray209 == null || Static90.anIntArray209.length < this.anIntArray212.length) {
			Static90.anIntArray209 = new int[this.anIntArray212.length];
		}
		if (this.anIntArray212.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray212.length / 4;
		local47 = arg0 * this.anInt2386;
		local51 = local31 - 1;
		if (this.anInt2387 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static90.anIntArray209[local194] = this.anIntArray212[local202];
				Static90.anIntArray209[local194 + local40] = this.anIntArray212[local202 + local40];
				Static90.anIntArray209[local194 + local40 + local40] = this.anIntArray212[local202 + local40 + local40];
				Static90.anIntArray209[local194 + local40 + local40 + local40] = this.anIntArray212[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray212;
		this.anIntArray212 = Static90.anIntArray209;
		Static90.anIntArray209 = local126;
	}
}
