import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "Z")
	public boolean aBoolean69 = false;

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
	public final int anInt1418;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "Z")
	public final boolean aBoolean68;

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "[I")
	private final int[] anIntArray160;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "[I")
	private final int[] anIntArray162;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
	public final int anInt1419;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
	private final int anInt1417;

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class6_Sub8(@OriginalArg(0) Class6_Sub4 arg0) {
		this.anInt1418 = arg0.method1306();
		this.aBoolean68 = arg0.method1321() == 1;
		@Pc(23) int local23 = arg0.method1321();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray160 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray160[local39] = arg0.method1306();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray158 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray158[local62] = arg0.method1321();
			}
		}
		if (local23 > 1) {
			this.anIntArray161 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray161[local62] = arg0.method1321();
			}
		}
		this.anIntArray162 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray162[local62] = arg0.method1289();
		}
		this.anInt1419 = arg0.method1321();
		this.anInt1417 = arg0.method1321();
		this.anIntArray163 = null;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
	public void method981(@OriginalArg(0) int arg0) {
		if (this.anIntArray163 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1419 == 1 || this.anInt1419 == 3) {
			if (Static45.anIntArray159 == null || Static45.anIntArray159.length < this.anIntArray163.length) {
				Static45.anIntArray159 = new int[this.anIntArray163.length];
			}
			if (this.anIntArray163.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray163.length / 4;
			local47 = local31 * arg0 * this.anInt1417;
			local51 = local40 - 1;
			if (this.anInt1419 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static45.anIntArray159[local60] = this.anIntArray163[local67];
				Static45.anIntArray159[local60 + local40] = this.anIntArray163[local67 + local40];
				Static45.anIntArray159[local60 + local40 + local40] = this.anIntArray163[local67 + local40 + local40];
				Static45.anIntArray159[local60 + local40 + local40 + local40] = this.anIntArray163[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray163;
			this.anIntArray163 = Static45.anIntArray159;
			Static45.anIntArray159 = local126;
		}
		if (this.anInt1419 != 2 && this.anInt1419 != 4) {
			return;
		}
		if (Static45.anIntArray159 == null || Static45.anIntArray159.length < this.anIntArray163.length) {
			Static45.anIntArray159 = new int[this.anIntArray163.length];
		}
		if (this.anIntArray163.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray163.length / 4;
		local47 = arg0 * this.anInt1417;
		local51 = local31 - 1;
		if (this.anInt1419 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static45.anIntArray159[local194] = this.anIntArray163[local202];
				Static45.anIntArray159[local194 + local40] = this.anIntArray163[local202 + local40];
				Static45.anIntArray159[local194 + local40 + local40] = this.anIntArray163[local202 + local40 + local40];
				Static45.anIntArray159[local194 + local40 + local40 + local40] = this.anIntArray163[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray163;
		this.anIntArray163 = Static45.anIntArray159;
		Static45.anIntArray159 = local126;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(DILclient!ge;)Z")
	public boolean method982(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray160.length; local1++) {
			if (arg2.method111(this.anIntArray160[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray163 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray160.length; local30++) {
			@Pc(39) Class6_Sub3_Sub3_Sub3 local39 = Static109.method2031(this.anIntArray160[local30], arg2);
			local39.method1763();
			@Pc(44) byte[] local44 = local39.aByteArray31;
			@Pc(47) int[] local47 = local39.anIntArray290;
			@Pc(52) int local52 = this.anIntArray162[local30];
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
				local47[local61] = Static107.method1995(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray158[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2689 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray163[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2689 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray163[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2689 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray163[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray163[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray163[local259];
			this.anIntArray163[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray163[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray163[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
	public void method984() {
		this.anIntArray163 = null;
	}
}
