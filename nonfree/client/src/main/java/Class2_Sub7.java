import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	public final int anInt1020;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Z")
	public final boolean aBoolean57;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "[I")
	private final int[] anIntArray112;

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[I")
	private final int[] anIntArray109;

	@OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
	public final int anInt1021;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
	private final int anInt1022;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "[I")
	public int[] anIntArray107;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!pd;)V")
	public Class2_Sub7(@OriginalArg(0) Class2_Sub6 arg0) {
		this.anInt1020 = arg0.method627();
		this.aBoolean57 = arg0.method665() == 1;
		@Pc(23) int local23 = arg0.method665();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray112 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray112[local39] = arg0.method627();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray110 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray110[local62] = arg0.method665();
			}
		}
		if (local23 > 1) {
			this.anIntArray108 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray108[local62] = arg0.method665();
			}
		}
		this.anIntArray109 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray109[local62] = arg0.method629();
		}
		this.anInt1021 = arg0.method665();
		this.anInt1022 = arg0.method665();
		this.anIntArray107 = null;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	public void method695(@OriginalArg(0) int arg0) {
		if (this.anIntArray107 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1021 == 1 || this.anInt1021 == 3) {
			if (Static22.anIntArray111 == null || Static22.anIntArray111.length < this.anIntArray107.length) {
				Static22.anIntArray111 = new int[this.anIntArray107.length];
			}
			if (this.anIntArray107.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray107.length / 4;
			local47 = local31 * arg0 * this.anInt1022;
			local51 = local40 - 1;
			if (this.anInt1021 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static22.anIntArray111[local60] = this.anIntArray107[local67];
				Static22.anIntArray111[local60 + local40] = this.anIntArray107[local67 + local40];
				Static22.anIntArray111[local60 + local40 + local40] = this.anIntArray107[local67 + local40 + local40];
				Static22.anIntArray111[local60 + local40 + local40 + local40] = this.anIntArray107[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray107;
			this.anIntArray107 = Static22.anIntArray111;
			Static22.anIntArray111 = local126;
		}
		if (this.anInt1021 != 2 && this.anInt1021 != 4) {
			return;
		}
		if (Static22.anIntArray111 == null || Static22.anIntArray111.length < this.anIntArray107.length) {
			Static22.anIntArray111 = new int[this.anIntArray107.length];
		}
		if (this.anIntArray107.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray107.length / 4;
		local47 = arg0 * this.anInt1022;
		local51 = local31 - 1;
		if (this.anInt1021 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static22.anIntArray111[local194] = this.anIntArray107[local202];
				Static22.anIntArray111[local194 + local40] = this.anIntArray107[local202 + local40];
				Static22.anIntArray111[local194 + local40 + local40] = this.anIntArray107[local202 + local40 + local40];
				Static22.anIntArray111[local194 + local40 + local40 + local40] = this.anIntArray107[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray107;
		this.anIntArray107 = Static22.anIntArray111;
		Static22.anIntArray111 = local126;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()V")
	public void method696() {
		this.anIntArray107 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(DILclient!kc;)Z")
	public boolean method698(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray112.length; local1++) {
			if (arg2.method332(this.anIntArray112[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray107 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray112.length; local30++) {
			@Pc(39) Class2_Sub1_Sub3_Sub1 local39 = Static15.method428(arg2, this.anIntArray112[local30]);
			local39.method290();
			@Pc(44) byte[] local44 = local39.aByteArray7;
			@Pc(47) int[] local47 = local39.anIntArray60;
			@Pc(52) int local52 = this.anIntArray109[local30];
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
				local47[local61] = Static97.method1657(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray110[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt432 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray107[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt432 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray107[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt432 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray107[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray107[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray107[local259];
			this.anIntArray107[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray107[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray107[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}
}
