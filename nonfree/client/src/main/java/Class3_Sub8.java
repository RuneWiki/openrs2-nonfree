import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!n", name = "I", descriptor = "Z")
	public boolean aBoolean86 = false;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "I")
	public final int anInt1854;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "Z")
	public final boolean aBoolean85;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "[I")
	private final int[] anIntArray209;

	@OriginalMember(owner = "client!n", name = "J", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "[I")
	private final int[] anIntArray208;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "I")
	public final int anInt1853;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	private final int anInt1852;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "[I")
	public int[] anIntArray211;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!m;)V")
	public Class3_Sub8(@OriginalArg(0) Class3_Sub6 arg0) {
		this.anInt1854 = arg0.method1603();
		this.aBoolean85 = arg0.method1587() == 1;
		@Pc(23) int local23 = arg0.method1587();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray209 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray209[local39] = arg0.method1603();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray213 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray213[local62] = arg0.method1587();
			}
		}
		if (local23 > 1) {
			this.anIntArray212 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray212[local62] = arg0.method1587();
			}
		}
		this.anIntArray208 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray208[local62] = arg0.method1614();
		}
		this.anInt1853 = arg0.method1587();
		this.anInt1852 = arg0.method1587();
		this.anIntArray211 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(DILclient!bf;)Z")
	public boolean method1206(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray209.length; local1++) {
			if (arg2.method1883(this.anIntArray209[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray211 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray209.length; local30++) {
			@Pc(39) Class3_Sub1_Sub2_Sub4 local39 = Static78.method1273(arg2, this.anIntArray209[local30]);
			local39.method1859();
			@Pc(44) byte[] local44 = local39.aByteArray24;
			@Pc(47) int[] local47 = local39.anIntArray364;
			@Pc(52) int local52 = this.anIntArray208[local30];
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
				local47[local61] = Static25.method513(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray213[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2809 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray211[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2809 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray211[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2809 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray211[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray211[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray211[local259];
			this.anIntArray211[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray211[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray211[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	public void method1207() {
		this.anIntArray211 = null;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	public void method1208(@OriginalArg(0) int arg0) {
		if (this.anIntArray211 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1853 == 1 || this.anInt1853 == 3) {
			if (Static71.anIntArray210 == null || Static71.anIntArray210.length < this.anIntArray211.length) {
				Static71.anIntArray210 = new int[this.anIntArray211.length];
			}
			if (this.anIntArray211.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray211.length / 4;
			local47 = local31 * arg0 * this.anInt1852;
			local51 = local40 - 1;
			if (this.anInt1853 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static71.anIntArray210[local60] = this.anIntArray211[local67];
				Static71.anIntArray210[local60 + local40] = this.anIntArray211[local67 + local40];
				Static71.anIntArray210[local60 + local40 + local40] = this.anIntArray211[local67 + local40 + local40];
				Static71.anIntArray210[local60 + local40 + local40 + local40] = this.anIntArray211[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray211;
			this.anIntArray211 = Static71.anIntArray210;
			Static71.anIntArray210 = local126;
		}
		if (this.anInt1853 != 2 && this.anInt1853 != 4) {
			return;
		}
		if (Static71.anIntArray210 == null || Static71.anIntArray210.length < this.anIntArray211.length) {
			Static71.anIntArray210 = new int[this.anIntArray211.length];
		}
		if (this.anIntArray211.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray211.length / 4;
		local47 = arg0 * this.anInt1852;
		local51 = local31 - 1;
		if (this.anInt1853 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static71.anIntArray210[local194] = this.anIntArray211[local202];
				Static71.anIntArray210[local194 + local40] = this.anIntArray211[local202 + local40];
				Static71.anIntArray210[local194 + local40 + local40] = this.anIntArray211[local202 + local40 + local40];
				Static71.anIntArray210[local194 + local40 + local40 + local40] = this.anIntArray211[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray211;
		this.anIntArray211 = Static71.anIntArray210;
		Static71.anIntArray210 = local126;
	}
}
