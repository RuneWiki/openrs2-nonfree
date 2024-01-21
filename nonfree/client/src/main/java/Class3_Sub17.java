import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
	public final int anInt2616;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "Z")
	public final boolean aBoolean92;

	@OriginalMember(owner = "client!pb", name = "K", descriptor = "[I")
	private final int[] anIntArray276;

	@OriginalMember(owner = "client!pb", name = "N", descriptor = "[I")
	private int[] anIntArray278;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "[I")
	private int[] anIntArray274;

	@OriginalMember(owner = "client!pb", name = "M", descriptor = "[I")
	private final int[] anIntArray277;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
	public final int anInt2617;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
	private final int anInt2618;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "[I")
	public int[] anIntArray273;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class3_Sub17(@OriginalArg(0) Class3_Sub12 arg0) {
		this.anInt2616 = arg0.method1963();
		this.aBoolean92 = arg0.method1936() == 1;
		@Pc(23) int local23 = arg0.method1936();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray276 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray276[local39] = arg0.method1963();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray278 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray278[local62] = arg0.method1936();
			}
		}
		if (local23 > 1) {
			this.anIntArray274 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray274[local62] = arg0.method1936();
			}
		}
		this.anIntArray277 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray277[local62] = arg0.method1920();
		}
		this.anInt2617 = arg0.method1936();
		this.anInt2618 = arg0.method1936();
		this.anIntArray273 = null;
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
	public void method1688(@OriginalArg(0) int arg0) {
		if (this.anIntArray273 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt2617 == 1 || this.anInt2617 == 3) {
			if (Static88.anIntArray275 == null || Static88.anIntArray275.length < this.anIntArray273.length) {
				Static88.anIntArray275 = new int[this.anIntArray273.length];
			}
			if (this.anIntArray273.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray273.length / 4;
			local47 = local31 * arg0 * this.anInt2618;
			local51 = local40 - 1;
			if (this.anInt2617 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static88.anIntArray275[local60] = this.anIntArray273[local67];
				Static88.anIntArray275[local60 + local40] = this.anIntArray273[local67 + local40];
				Static88.anIntArray275[local60 + local40 + local40] = this.anIntArray273[local67 + local40 + local40];
				Static88.anIntArray275[local60 + local40 + local40 + local40] = this.anIntArray273[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray273;
			this.anIntArray273 = Static88.anIntArray275;
			Static88.anIntArray275 = local126;
		}
		if (this.anInt2617 != 2 && this.anInt2617 != 4) {
			return;
		}
		if (Static88.anIntArray275 == null || Static88.anIntArray275.length < this.anIntArray273.length) {
			Static88.anIntArray275 = new int[this.anIntArray273.length];
		}
		if (this.anIntArray273.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray273.length / 4;
		local47 = arg0 * this.anInt2618;
		local51 = local31 - 1;
		if (this.anInt2617 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static88.anIntArray275[local194] = this.anIntArray273[local202];
				Static88.anIntArray275[local194 + local40] = this.anIntArray273[local202 + local40];
				Static88.anIntArray275[local194 + local40 + local40] = this.anIntArray273[local202 + local40 + local40];
				Static88.anIntArray275[local194 + local40 + local40 + local40] = this.anIntArray273[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray273;
		this.anIntArray273 = Static88.anIntArray275;
		Static88.anIntArray275 = local126;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(DILclient!jb;)Z")
	public boolean method1689(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray276.length; local1++) {
			if (arg2.method924(this.anIntArray276[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray273 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray276.length; local30++) {
			@Pc(39) Class3_Sub1_Sub2_Sub4 local39 = Static108.method2035(arg2, this.anIntArray276[local30]);
			local39.method1900();
			@Pc(44) byte[] local44 = local39.aByteArray75;
			@Pc(47) int[] local47 = local39.anIntArray305;
			@Pc(52) int local52 = this.anIntArray277[local30];
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
				local47[local61] = Static7.method287(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray278[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2860 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray273[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2860 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray273[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2860 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray273[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray273[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray273[local259];
			this.anIntArray273[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray273[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray273[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()V")
	public void method1691() {
		this.anIntArray273 = null;
	}
}
