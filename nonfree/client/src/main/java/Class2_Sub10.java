import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
	public boolean aBoolean136 = false;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	public final int anInt1919;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Z")
	public final boolean aBoolean137;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "[I")
	private final int[] anIntArray251;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[I")
	private final int[] anIntArray250;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	public final int anInt1918;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
	private final int anInt1920;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "[I")
	public int[] anIntArray254;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!wb;)V")
	public Class2_Sub10(@OriginalArg(0) Class2_Sub17 arg0) {
		this.anInt1919 = arg0.method1783();
		this.aBoolean137 = arg0.method1780() == 1;
		@Pc(23) int local23 = arg0.method1780();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray251 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray251[local39] = arg0.method1783();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray252 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray252[local62] = arg0.method1780();
			}
		}
		if (local23 > 1) {
			this.anIntArray255 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray255[local62] = arg0.method1780();
			}
		}
		this.anIntArray250 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray250[local62] = arg0.method1747();
		}
		this.anInt1918 = arg0.method1780();
		this.anInt1920 = arg0.method1780();
		this.anIntArray254 = null;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method1155(@OriginalArg(0) int arg0) {
		if (this.anIntArray254 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1918 == 1 || this.anInt1918 == 3) {
			if (Static72.anIntArray253 == null || Static72.anIntArray253.length < this.anIntArray254.length) {
				Static72.anIntArray253 = new int[this.anIntArray254.length];
			}
			if (this.anIntArray254.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray254.length / 4;
			local47 = local31 * arg0 * this.anInt1920;
			local51 = local40 - 1;
			if (this.anInt1918 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static72.anIntArray253[local60] = this.anIntArray254[local67];
				Static72.anIntArray253[local60 + local40] = this.anIntArray254[local67 + local40];
				Static72.anIntArray253[local60 + local40 + local40] = this.anIntArray254[local67 + local40 + local40];
				Static72.anIntArray253[local60 + local40 + local40 + local40] = this.anIntArray254[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray254;
			this.anIntArray254 = Static72.anIntArray253;
			Static72.anIntArray253 = local126;
		}
		if (this.anInt1918 != 2 && this.anInt1918 != 4) {
			return;
		}
		if (Static72.anIntArray253 == null || Static72.anIntArray253.length < this.anIntArray254.length) {
			Static72.anIntArray253 = new int[this.anIntArray254.length];
		}
		if (this.anIntArray254.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray254.length / 4;
		local47 = arg0 * this.anInt1920;
		local51 = local31 - 1;
		if (this.anInt1918 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static72.anIntArray253[local194] = this.anIntArray254[local202];
				Static72.anIntArray253[local194 + local40] = this.anIntArray254[local202 + local40];
				Static72.anIntArray253[local194 + local40 + local40] = this.anIntArray254[local202 + local40 + local40];
				Static72.anIntArray253[local194 + local40 + local40 + local40] = this.anIntArray254[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray254;
		this.anIntArray254 = Static72.anIntArray253;
		Static72.anIntArray253 = local126;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(DILclient!ff;)Z")
	public boolean method1156(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray251.length; local1++) {
			if (arg2.method377(this.anIntArray251[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray254 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray251.length; local30++) {
			@Pc(39) Class2_Sub1_Sub9_Sub3 local39 = Static123.method1970(this.anIntArray251[local30], arg2);
			local39.method1495();
			@Pc(44) byte[] local44 = local39.aByteArray34;
			@Pc(47) int[] local47 = local39.anIntArray322;
			@Pc(52) int local52 = this.anIntArray250[local30];
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
				local47[local61] = Static52.method928(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray252[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2487 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray254[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2487 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray254[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2487 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray254[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray254[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray254[local259];
			this.anIntArray254[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray254[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray254[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
	public void method1157() {
		this.anIntArray254 = null;
	}
}
