import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
	public boolean aBoolean20 = false;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
	public final int anInt382;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Z")
	public final boolean aBoolean21;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "[I")
	private final int[] anIntArray42;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "[I")
	private int[] anIntArray41;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
	private final int[] anIntArray38;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public final int anInt381;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
	private final int anInt383;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "[I")
	public int[] anIntArray43;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ob;)V")
	public Class3_Sub4(@OriginalArg(0) Class3_Sub7 arg0) {
		this.anInt382 = arg0.method602();
		this.aBoolean21 = arg0.method647() == 1;
		@Pc(23) int local23 = arg0.method647();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray42 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray42[local39] = arg0.method602();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray41 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray41[local62] = arg0.method647();
			}
		}
		if (local23 > 1) {
			this.anIntArray39 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray39[local62] = arg0.method647();
			}
		}
		this.anIntArray38 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray38[local62] = arg0.method638();
		}
		this.anInt381 = arg0.method647();
		this.anInt383 = arg0.method647();
		this.anIntArray43 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(DILclient!we;)Z")
	public boolean method249(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray42.length; local1++) {
			if (arg2.method1510(this.anIntArray42[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray43 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray42.length; local30++) {
			@Pc(39) Class3_Sub1_Sub5_Sub3 local39 = Static42.method845(arg2, this.anIntArray42[local30]);
			local39.method814();
			@Pc(44) byte[] local44 = local39.aByteArray22;
			@Pc(47) int[] local47 = local39.anIntArray132;
			@Pc(52) int local52 = this.anIntArray38[local30];
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
				local47[local61] = Static24.method469(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray41[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt1168 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray43[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt1168 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray43[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt1168 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray43[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray43[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray43[local259];
			this.anIntArray43[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray43[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray43[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	public void method250(@OriginalArg(0) int arg0) {
		if (this.anIntArray43 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt381 == 1 || this.anInt381 == 3) {
			if (Static17.anIntArray40 == null || Static17.anIntArray40.length < this.anIntArray43.length) {
				Static17.anIntArray40 = new int[this.anIntArray43.length];
			}
			if (this.anIntArray43.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray43.length / 4;
			local47 = local31 * arg0 * this.anInt383;
			local51 = local40 - 1;
			if (this.anInt381 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static17.anIntArray40[local60] = this.anIntArray43[local67];
				Static17.anIntArray40[local60 + local40] = this.anIntArray43[local67 + local40];
				Static17.anIntArray40[local60 + local40 + local40] = this.anIntArray43[local67 + local40 + local40];
				Static17.anIntArray40[local60 + local40 + local40 + local40] = this.anIntArray43[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray43;
			this.anIntArray43 = Static17.anIntArray40;
			Static17.anIntArray40 = local126;
		}
		if (this.anInt381 != 2 && this.anInt381 != 4) {
			return;
		}
		if (Static17.anIntArray40 == null || Static17.anIntArray40.length < this.anIntArray43.length) {
			Static17.anIntArray40 = new int[this.anIntArray43.length];
		}
		if (this.anIntArray43.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray43.length / 4;
		local47 = arg0 * this.anInt383;
		local51 = local31 - 1;
		if (this.anInt381 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static17.anIntArray40[local194] = this.anIntArray43[local202];
				Static17.anIntArray40[local194 + local40] = this.anIntArray43[local202 + local40];
				Static17.anIntArray40[local194 + local40 + local40] = this.anIntArray43[local202 + local40 + local40];
				Static17.anIntArray40[local194 + local40 + local40 + local40] = this.anIntArray43[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray43;
		this.anIntArray43 = Static17.anIntArray40;
		Static17.anIntArray40 = local126;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "()V")
	public void method251() {
		this.anIntArray43 = null;
	}
}
