import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "Z")
	public boolean aBoolean54 = false;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
	public final int anInt1387;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "Z")
	public final boolean aBoolean53;

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "[I")
	private final int[] anIntArray165;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "[I")
	private final int[] anIntArray166;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
	public final int anInt1389;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "I")
	private final int anInt1388;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class2_Sub13(@OriginalArg(0) Class2_Sub10 arg0) {
		this.anInt1387 = arg0.method1517();
		this.aBoolean53 = arg0.method1514() == 1;
		@Pc(23) int local23 = arg0.method1514();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray165 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray165[local39] = arg0.method1517();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray163 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray163[local62] = arg0.method1514();
			}
		}
		if (local23 > 1) {
			this.anIntArray161 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray161[local62] = arg0.method1514();
			}
		}
		this.anIntArray166 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray166[local62] = arg0.method1532();
		}
		this.anInt1389 = arg0.method1514();
		this.anInt1388 = arg0.method1514();
		this.anIntArray164 = null;
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	public void method963(@OriginalArg(0) int arg0) {
		if (this.anIntArray164 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1389 == 1 || this.anInt1389 == 3) {
			if (Static59.anIntArray162 == null || Static59.anIntArray162.length < this.anIntArray164.length) {
				Static59.anIntArray162 = new int[this.anIntArray164.length];
			}
			if (this.anIntArray164.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray164.length / 4;
			local47 = local31 * arg0 * this.anInt1388;
			local51 = local40 - 1;
			if (this.anInt1389 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static59.anIntArray162[local60] = this.anIntArray164[local67];
				Static59.anIntArray162[local60 + local40] = this.anIntArray164[local67 + local40];
				Static59.anIntArray162[local60 + local40 + local40] = this.anIntArray164[local67 + local40 + local40];
				Static59.anIntArray162[local60 + local40 + local40 + local40] = this.anIntArray164[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray164;
			this.anIntArray164 = Static59.anIntArray162;
			Static59.anIntArray162 = local126;
		}
		if (this.anInt1389 != 2 && this.anInt1389 != 4) {
			return;
		}
		if (Static59.anIntArray162 == null || Static59.anIntArray162.length < this.anIntArray164.length) {
			Static59.anIntArray162 = new int[this.anIntArray164.length];
		}
		if (this.anIntArray164.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray164.length / 4;
		local47 = arg0 * this.anInt1388;
		local51 = local31 - 1;
		if (this.anInt1389 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static59.anIntArray162[local194] = this.anIntArray164[local202];
				Static59.anIntArray162[local194 + local40] = this.anIntArray164[local202 + local40];
				Static59.anIntArray162[local194 + local40 + local40] = this.anIntArray164[local202 + local40 + local40];
				Static59.anIntArray162[local194 + local40 + local40 + local40] = this.anIntArray164[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray164;
		this.anIntArray164 = Static59.anIntArray162;
		Static59.anIntArray162 = local126;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(DILclient!g;)Z")
	public boolean method964(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray165.length; local1++) {
			if (arg2.method1356(this.anIntArray165[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray164 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray165.length; local30++) {
			@Pc(39) Class2_Sub2_Sub1_Sub1 local39 = Static95.method1444(arg2, this.anIntArray165[local30]);
			local39.method94();
			@Pc(44) byte[] local44 = local39.aByteArray1;
			@Pc(47) int[] local47 = local39.anIntArray17;
			@Pc(52) int local52 = this.anIntArray166[local30];
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
				local47[local61] = Static44.method715(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray163[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt116 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray164[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt116 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray164[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt116 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray164[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray164[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray164[local259];
			this.anIntArray164[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray164[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray164[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	public void method965() {
		this.anIntArray164 = null;
	}
}
