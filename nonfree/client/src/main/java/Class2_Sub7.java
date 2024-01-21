import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!je", name = "F", descriptor = "Z")
	public boolean aBoolean79 = false;

	@OriginalMember(owner = "client!je", name = "E", descriptor = "I")
	public final int anInt1453;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "Z")
	public final boolean aBoolean78;

	@OriginalMember(owner = "client!je", name = "C", descriptor = "[I")
	private final int[] anIntArray203;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!je", name = "A", descriptor = "[I")
	private final int[] anIntArray201;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "I")
	public final int anInt1451;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "I")
	private final int anInt1452;

	@OriginalMember(owner = "client!je", name = "B", descriptor = "[I")
	public int[] anIntArray202;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!g;)V")
	public Class2_Sub7(@OriginalArg(0) Class2_Sub5 arg0) {
		this.anInt1453 = arg0.method1273();
		this.aBoolean78 = arg0.method1281() == 1;
		@Pc(23) int local23 = arg0.method1281();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray203 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray203[local39] = arg0.method1273();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray200 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray200[local62] = arg0.method1281();
			}
		}
		if (local23 > 1) {
			this.anIntArray204 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray204[local62] = arg0.method1281();
			}
		}
		this.anIntArray201 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray201[local62] = arg0.method1276();
		}
		this.anInt1451 = arg0.method1281();
		this.anInt1452 = arg0.method1281();
		this.anIntArray202 = null;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public void method993(@OriginalArg(0) int arg0) {
		if (this.anIntArray202 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1451 == 1 || this.anInt1451 == 3) {
			if (Static52.anIntArray205 == null || Static52.anIntArray205.length < this.anIntArray202.length) {
				Static52.anIntArray205 = new int[this.anIntArray202.length];
			}
			if (this.anIntArray202.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray202.length / 4;
			local47 = local31 * arg0 * this.anInt1452;
			local51 = local40 - 1;
			if (this.anInt1451 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static52.anIntArray205[local60] = this.anIntArray202[local67];
				Static52.anIntArray205[local60 + local40] = this.anIntArray202[local67 + local40];
				Static52.anIntArray205[local60 + local40 + local40] = this.anIntArray202[local67 + local40 + local40];
				Static52.anIntArray205[local60 + local40 + local40 + local40] = this.anIntArray202[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray202;
			this.anIntArray202 = Static52.anIntArray205;
			Static52.anIntArray205 = local126;
		}
		if (this.anInt1451 != 2 && this.anInt1451 != 4) {
			return;
		}
		if (Static52.anIntArray205 == null || Static52.anIntArray205.length < this.anIntArray202.length) {
			Static52.anIntArray205 = new int[this.anIntArray202.length];
		}
		if (this.anIntArray202.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray202.length / 4;
		local47 = arg0 * this.anInt1452;
		local51 = local31 - 1;
		if (this.anInt1451 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static52.anIntArray205[local194] = this.anIntArray202[local202];
				Static52.anIntArray205[local194 + local40] = this.anIntArray202[local202 + local40];
				Static52.anIntArray205[local194 + local40 + local40] = this.anIntArray202[local202 + local40 + local40];
				Static52.anIntArray205[local194 + local40 + local40 + local40] = this.anIntArray202[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray202;
		this.anIntArray202 = Static52.anIntArray205;
		Static52.anIntArray205 = local126;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
	public void method994() {
		this.anIntArray202 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(DILclient!jd;)Z")
	public boolean method995(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class36 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray203.length; local1++) {
			if (arg2.method1765(this.anIntArray203[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray202 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray203.length; local30++) {
			@Pc(39) Class2_Sub1_Sub4_Sub3 local39 = Static80.method1563(this.anIntArray203[local30], arg2);
			local39.method1945();
			@Pc(44) byte[] local44 = local39.aByteArray24;
			@Pc(47) int[] local47 = local39.anIntArray331;
			@Pc(52) int local52 = this.anIntArray201[local30];
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
				local47[local61] = Static106.method2034(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray200[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2733 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray202[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2733 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray202[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2733 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray202[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray202[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray202[local259];
			this.anIntArray202[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray202[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray202[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}
}
