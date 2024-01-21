import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "Z")
	public boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
	public final int anInt176;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "Z")
	public final boolean aBoolean27;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "[I")
	private final int[] anIntArray30;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "[I")
	private int[] anIntArray35;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "[I")
	private int[] anIntArray33;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "[I")
	private final int[] anIntArray32;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
	public final int anInt177;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
	private final int anInt175;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "[I")
	public int[] anIntArray31;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!qc;)V")
	public Class1_Sub4(@OriginalArg(0) Class1_Sub18 arg0) {
		this.anInt176 = arg0.method2156();
		this.aBoolean27 = arg0.method2169() == 1;
		@Pc(23) int local23 = arg0.method2169();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray30 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray30[local39] = arg0.method2156();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray35 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray35[local62] = arg0.method2169();
			}
		}
		if (local23 > 1) {
			this.anIntArray33 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray33[local62] = arg0.method2169();
			}
		}
		this.anIntArray32 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray32[local62] = arg0.method2185();
		}
		this.anInt177 = arg0.method2169();
		this.anInt175 = arg0.method2169();
		this.anIntArray31 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	public void method86() {
		this.anIntArray31 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(DILclient!q;)Z")
	public boolean method88(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray30.length; local1++) {
			if (arg2.method1994(this.anIntArray30[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray31 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray30.length; local30++) {
			@Pc(39) Class1_Sub1_Sub4_Sub1 local39 = Static119.method2053(this.anIntArray30[local30], arg2);
			local39.method497();
			@Pc(44) byte[] local44 = local39.aByteArray24;
			@Pc(47) int[] local47 = local39.anIntArray126;
			@Pc(52) int local52 = this.anIntArray32[local30];
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
				local47[local61] = Static27.method565(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray35[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt869 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray31[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt869 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray31[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt869 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray31[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray31[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray31[local259];
			this.anIntArray31[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray31[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray31[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public void method89(@OriginalArg(0) int arg0) {
		if (this.anIntArray31 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt177 == 1 || this.anInt177 == 3) {
			if (Static5.anIntArray34 == null || Static5.anIntArray34.length < this.anIntArray31.length) {
				Static5.anIntArray34 = new int[this.anIntArray31.length];
			}
			if (this.anIntArray31.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray31.length / 4;
			local47 = local31 * arg0 * this.anInt175;
			local51 = local40 - 1;
			if (this.anInt177 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static5.anIntArray34[local60] = this.anIntArray31[local67];
				Static5.anIntArray34[local60 + local40] = this.anIntArray31[local67 + local40];
				Static5.anIntArray34[local60 + local40 + local40] = this.anIntArray31[local67 + local40 + local40];
				Static5.anIntArray34[local60 + local40 + local40 + local40] = this.anIntArray31[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray31;
			this.anIntArray31 = Static5.anIntArray34;
			Static5.anIntArray34 = local126;
		}
		if (this.anInt177 != 2 && this.anInt177 != 4) {
			return;
		}
		if (Static5.anIntArray34 == null || Static5.anIntArray34.length < this.anIntArray31.length) {
			Static5.anIntArray34 = new int[this.anIntArray31.length];
		}
		if (this.anIntArray31.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray31.length / 4;
		local47 = arg0 * this.anInt175;
		local51 = local31 - 1;
		if (this.anInt177 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static5.anIntArray34[local194] = this.anIntArray31[local202];
				Static5.anIntArray34[local194 + local40] = this.anIntArray31[local202 + local40];
				Static5.anIntArray34[local194 + local40 + local40] = this.anIntArray31[local202 + local40 + local40];
				Static5.anIntArray34[local194 + local40 + local40 + local40] = this.anIntArray31[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray31;
		this.anIntArray31 = Static5.anIntArray34;
		Static5.anIntArray34 = local126;
	}
}
