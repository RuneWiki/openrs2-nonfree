import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
	public final int anInt995;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Z")
	public final boolean aBoolean70;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "[I")
	private final int[] anIntArray189;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "[I")
	private final int[] anIntArray187;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	public final int anInt994;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
	private final int anInt996;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 4)
	public void method739(@OriginalArg(0) int arg0) {
		if (this.anIntArray185 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt994 == 1 || this.anInt994 == 3) {
			if (Static37.anIntArray186 == null || Static37.anIntArray186.length < this.anIntArray185.length) {
				Static37.anIntArray186 = new int[this.anIntArray185.length];
			}
			if (this.anIntArray185.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray185.length / 4;
			local47 = local31 * arg0 * this.anInt996;
			local51 = local40 - 1;
			if (this.anInt994 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static37.anIntArray186[local60] = this.anIntArray185[local67];
				Static37.anIntArray186[local60 + local40] = this.anIntArray185[local67 + local40];
				Static37.anIntArray186[local60 + local40 + local40] = this.anIntArray185[local67 + local40 + local40];
				Static37.anIntArray186[local60 + local40 + local40 + local40] = this.anIntArray185[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray185;
			this.anIntArray185 = Static37.anIntArray186;
			Static37.anIntArray186 = local126;
		}
		if (this.anInt994 != 2 && this.anInt994 != 4) {
			return;
		}
		if (Static37.anIntArray186 == null || Static37.anIntArray186.length < this.anIntArray185.length) {
			Static37.anIntArray186 = new int[this.anIntArray185.length];
		}
		if (this.anIntArray185.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray185.length / 4;
		local47 = arg0 * this.anInt996;
		local51 = local31 - 1;
		if (this.anInt994 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static37.anIntArray186[local194] = this.anIntArray185[local202];
				Static37.anIntArray186[local194 + local40] = this.anIntArray185[local202 + local40];
				Static37.anIntArray186[local194 + local40 + local40] = this.anIntArray185[local202 + local40 + local40];
				Static37.anIntArray186[local194 + local40 + local40 + local40] = this.anIntArray185[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray185;
		this.anIntArray185 = Static37.anIntArray186;
		Static37.anIntArray186 = local126;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()V", line = 118)
	public void method741() {
		this.anIntArray185 = null;
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!eb;)V", line = 121)
	public Class2_Sub8(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt995 = arg0.method1704();
		this.aBoolean70 = arg0.method1708() == 1;
		@Pc(23) int local23 = arg0.method1708();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray189 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray189[local39] = arg0.method1704();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray190 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray190[local62] = arg0.method1708();
			}
		}
		if (local23 > 1) {
			this.anIntArray188 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray188[local62] = arg0.method1708();
			}
		}
		this.anIntArray187 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray187[local62] = arg0.method1728();
		}
		this.anInt994 = arg0.method1708();
		this.anInt996 = arg0.method1708();
		this.anIntArray185 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(DILclient!ud;)Z", line = 180)
	public boolean method742(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray189.length; local1++) {
			if (arg2.method61(this.anIntArray189[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray185 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray189.length; local30++) {
			@Pc(39) Class2_Sub2_Sub2_Sub3 local39 = Static3.method28(this.anIntArray189[local30], arg2);
			local39.method1324();
			@Pc(44) byte[] local44 = local39.aByteArray16;
			@Pc(47) int[] local47 = local39.anIntArray427;
			@Pc(52) int local52 = this.anIntArray187[local30];
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
				local47[local61] = Static6.method171(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray190[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt1905 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray185[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt1905 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray185[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt1905 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray185[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray185[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray185[local259];
			this.anIntArray185[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray185[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray185[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}
}
