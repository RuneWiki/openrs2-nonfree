import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Z")
	public boolean aBoolean78 = false;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
	public final int anInt1526;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Z")
	public final boolean aBoolean79;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "[I")
	private final int[] anIntArray259;

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "[I")
	private final int[] anIntArray262;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
	public final int anInt1524;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
	private final int anInt1525;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!wd;)V")
	public Class3_Sub10(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt1526 = arg0.method1451();
		this.aBoolean79 = arg0.method1421() == 1;
		@Pc(23) int local23 = arg0.method1421();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray259 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray259[local39] = arg0.method1451();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray263 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray263[local62] = arg0.method1421();
			}
		}
		if (local23 > 1) {
			this.anIntArray260 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray260[local62] = arg0.method1421();
			}
		}
		this.anIntArray262 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray262[local62] = arg0.method1444();
		}
		this.anInt1524 = arg0.method1421();
		this.anInt1525 = arg0.method1421();
		this.anIntArray258 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
	public void method1119() {
		this.anIntArray258 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(DILclient!td;)Z")
	public boolean method1121(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray259.length; local1++) {
			if (arg2.method1603(this.anIntArray259[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray258 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray259.length; local30++) {
			@Pc(39) Class3_Sub3_Sub2_Sub4 local39 = Static89.method1693(this.anIntArray259[local30], arg2);
			local39.method1333();
			@Pc(44) byte[] local44 = local39.aByteArray15;
			@Pc(47) int[] local47 = local39.anIntArray315;
			@Pc(52) int local52 = this.anIntArray262[local30];
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
				local47[local61] = Static51.method1021(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray263[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt1904 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray258[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt1904 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray258[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt1904 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray258[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray258[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray258[local259];
			this.anIntArray258[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray258[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray258[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V")
	public void method1122(@OriginalArg(0) int arg0) {
		if (this.anIntArray258 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1524 == 1 || this.anInt1524 == 3) {
			if (Static60.anIntArray261 == null || Static60.anIntArray261.length < this.anIntArray258.length) {
				Static60.anIntArray261 = new int[this.anIntArray258.length];
			}
			if (this.anIntArray258.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray258.length / 4;
			local47 = local31 * arg0 * this.anInt1525;
			local51 = local40 - 1;
			if (this.anInt1524 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static60.anIntArray261[local60] = this.anIntArray258[local67];
				Static60.anIntArray261[local60 + local40] = this.anIntArray258[local67 + local40];
				Static60.anIntArray261[local60 + local40 + local40] = this.anIntArray258[local67 + local40 + local40];
				Static60.anIntArray261[local60 + local40 + local40 + local40] = this.anIntArray258[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray258;
			this.anIntArray258 = Static60.anIntArray261;
			Static60.anIntArray261 = local126;
		}
		if (this.anInt1524 != 2 && this.anInt1524 != 4) {
			return;
		}
		if (Static60.anIntArray261 == null || Static60.anIntArray261.length < this.anIntArray258.length) {
			Static60.anIntArray261 = new int[this.anIntArray258.length];
		}
		if (this.anIntArray258.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray258.length / 4;
		local47 = arg0 * this.anInt1525;
		local51 = local31 - 1;
		if (this.anInt1524 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static60.anIntArray261[local194] = this.anIntArray258[local202];
				Static60.anIntArray261[local194 + local40] = this.anIntArray258[local202 + local40];
				Static60.anIntArray261[local194 + local40 + local40] = this.anIntArray258[local202 + local40 + local40];
				Static60.anIntArray261[local194 + local40 + local40 + local40] = this.anIntArray258[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray258;
		this.anIntArray258 = Static60.anIntArray261;
		Static60.anIntArray261 = local126;
	}
}
