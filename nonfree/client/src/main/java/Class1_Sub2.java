import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "Z")
	public boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
	public final int anInt156;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "Z")
	public final boolean aBoolean3;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "[I")
	private final int[] anIntArray32;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "[I")
	private int[] anIntArray33;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "[I")
	private final int[] anIntArray28;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
	public final int anInt158;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	private final int anInt157;

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!rc;)V")
	public Class1_Sub2(@OriginalArg(0) Class1_Sub5 arg0) {
		this.anInt156 = arg0.method715();
		this.aBoolean3 = arg0.method716() == 1;
		@Pc(23) int local23 = arg0.method716();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray32 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray32[local39] = arg0.method715();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray31 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray31[local62] = arg0.method716();
			}
		}
		if (local23 > 1) {
			this.anIntArray33 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray33[local62] = arg0.method716();
			}
		}
		this.anIntArray28 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray28[local62] = arg0.method692();
		}
		this.anInt158 = arg0.method716();
		this.anInt157 = arg0.method716();
		this.anIntArray30 = null;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public void method78(@OriginalArg(0) int arg0) {
		if (this.anIntArray30 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt158 == 1 || this.anInt158 == 3) {
			if (Static6.anIntArray29 == null || Static6.anIntArray29.length < this.anIntArray30.length) {
				Static6.anIntArray29 = new int[this.anIntArray30.length];
			}
			if (this.anIntArray30.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray30.length / 4;
			local47 = local31 * arg0 * this.anInt157;
			local51 = local40 - 1;
			if (this.anInt158 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static6.anIntArray29[local60] = this.anIntArray30[local67];
				Static6.anIntArray29[local60 + local40] = this.anIntArray30[local67 + local40];
				Static6.anIntArray29[local60 + local40 + local40] = this.anIntArray30[local67 + local40 + local40];
				Static6.anIntArray29[local60 + local40 + local40 + local40] = this.anIntArray30[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray30;
			this.anIntArray30 = Static6.anIntArray29;
			Static6.anIntArray29 = local126;
		}
		if (this.anInt158 != 2 && this.anInt158 != 4) {
			return;
		}
		if (Static6.anIntArray29 == null || Static6.anIntArray29.length < this.anIntArray30.length) {
			Static6.anIntArray29 = new int[this.anIntArray30.length];
		}
		if (this.anIntArray30.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray30.length / 4;
		local47 = arg0 * this.anInt157;
		local51 = local31 - 1;
		if (this.anInt158 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static6.anIntArray29[local194] = this.anIntArray30[local202];
				Static6.anIntArray29[local194 + local40] = this.anIntArray30[local202 + local40];
				Static6.anIntArray29[local194 + local40 + local40] = this.anIntArray30[local202 + local40 + local40];
				Static6.anIntArray29[local194 + local40 + local40 + local40] = this.anIntArray30[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray30;
		this.anIntArray30 = Static6.anIntArray29;
		Static6.anIntArray29 = local126;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(DILclient!rb;)Z")
	public boolean method79(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray32.length; local1++) {
			if (arg2.method1864(this.anIntArray32[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray30 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray32.length; local30++) {
			@Pc(39) Class1_Sub1_Sub6_Sub3 local39 = Static33.method567(this.anIntArray32[local30], arg2);
			local39.method1196();
			@Pc(44) byte[] local44 = local39.aByteArray11;
			@Pc(47) int[] local47 = local39.anIntArray218;
			@Pc(52) int local52 = this.anIntArray28[local30];
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
				local47[local61] = Static93.method1600(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray31[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt1878 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray30[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt1878 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray30[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt1878 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray30[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray30[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray30[local259];
			this.anIntArray30[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray30[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray30[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()V")
	public void method80() {
		this.anIntArray30 = null;
	}
}
