import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "Z")
	public boolean aBoolean48 = false;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
	public final int anInt1153;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "Z")
	public final boolean aBoolean47;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "[I")
	private final int[] anIntArray225;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "[I")
	private final int[] anIntArray223;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	public final int anInt1155;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
	private final int anInt1154;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!dc;)V")
	public Class1_Sub8(@OriginalArg(0) Class1_Sub5 arg0) {
		this.anInt1153 = arg0.method651();
		this.aBoolean47 = arg0.method672() == 1;
		@Pc(23) int local23 = arg0.method672();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray225 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray225[local39] = arg0.method651();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray221 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray221[local62] = arg0.method672();
			}
		}
		if (local23 > 1) {
			this.anIntArray224 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray224[local62] = arg0.method672();
			}
		}
		this.anIntArray223 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray223[local62] = arg0.method663();
		}
		this.anInt1155 = arg0.method672();
		this.anInt1154 = arg0.method672();
		this.anIntArray226 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "()V")
	public void method947() {
		this.anIntArray226 = null;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public void method949(@OriginalArg(0) int arg0) {
		if (this.anIntArray226 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1155 == 1 || this.anInt1155 == 3) {
			if (Static43.anIntArray222 == null || Static43.anIntArray222.length < this.anIntArray226.length) {
				Static43.anIntArray222 = new int[this.anIntArray226.length];
			}
			if (this.anIntArray226.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray226.length / 4;
			local47 = local31 * arg0 * this.anInt1154;
			local51 = local40 - 1;
			if (this.anInt1155 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static43.anIntArray222[local60] = this.anIntArray226[local67];
				Static43.anIntArray222[local60 + local40] = this.anIntArray226[local67 + local40];
				Static43.anIntArray222[local60 + local40 + local40] = this.anIntArray226[local67 + local40 + local40];
				Static43.anIntArray222[local60 + local40 + local40 + local40] = this.anIntArray226[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray226;
			this.anIntArray226 = Static43.anIntArray222;
			Static43.anIntArray222 = local126;
		}
		if (this.anInt1155 != 2 && this.anInt1155 != 4) {
			return;
		}
		if (Static43.anIntArray222 == null || Static43.anIntArray222.length < this.anIntArray226.length) {
			Static43.anIntArray222 = new int[this.anIntArray226.length];
		}
		if (this.anIntArray226.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray226.length / 4;
		local47 = arg0 * this.anInt1154;
		local51 = local31 - 1;
		if (this.anInt1155 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static43.anIntArray222[local194] = this.anIntArray226[local202];
				Static43.anIntArray222[local194 + local40] = this.anIntArray226[local202 + local40];
				Static43.anIntArray222[local194 + local40 + local40] = this.anIntArray226[local202 + local40 + local40];
				Static43.anIntArray222[local194 + local40 + local40 + local40] = this.anIntArray226[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray226;
		this.anIntArray226 = Static43.anIntArray222;
		Static43.anIntArray222 = local126;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(DILclient!oc;)Z")
	public boolean method950(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray225.length; local1++) {
			if (arg2.method1285(this.anIntArray225[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray226 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray225.length; local30++) {
			@Pc(39) Class1_Sub2_Sub2_Sub4 local39 = Static66.method1132(this.anIntArray225[local30], arg2);
			local39.method1951();
			@Pc(44) byte[] local44 = local39.aByteArray39;
			@Pc(47) int[] local47 = local39.anIntArray477;
			@Pc(52) int local52 = this.anIntArray223[local30];
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
				local47[local61] = Static36.method831(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray221[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2756 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray226[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2756 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray226[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2756 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray226[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray226[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray226[local259];
			this.anIntArray226[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray226[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray226[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}
}
