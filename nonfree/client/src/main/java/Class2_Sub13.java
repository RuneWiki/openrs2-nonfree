import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!re", name = "C", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!re", name = "K", descriptor = "I")
	public final int anInt2575;

	@OriginalMember(owner = "client!re", name = "H", descriptor = "Z")
	public final boolean aBoolean133;

	@OriginalMember(owner = "client!re", name = "I", descriptor = "[I")
	private final int[] anIntArray375;

	@OriginalMember(owner = "client!re", name = "L", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "[I")
	private int[] anIntArray371;

	@OriginalMember(owner = "client!re", name = "F", descriptor = "[I")
	private final int[] anIntArray374;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public final int anInt2573;

	@OriginalMember(owner = "client!re", name = "B", descriptor = "I")
	private final int anInt2574;

	@OriginalMember(owner = "client!re", name = "E", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!fe;)V")
	public Class2_Sub13(@OriginalArg(0) Class2_Sub8 arg0) {
		this.anInt2575 = arg0.method1396();
		this.aBoolean133 = arg0.method1410() == 1;
		@Pc(23) int local23 = arg0.method1410();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray375 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray375[local39] = arg0.method1396();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray376 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray376[local62] = arg0.method1410();
			}
		}
		if (local23 > 1) {
			this.anIntArray371 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray371[local62] = arg0.method1410();
			}
		}
		this.anIntArray374 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray374[local62] = arg0.method1406();
		}
		this.anInt2573 = arg0.method1410();
		this.anInt2574 = arg0.method1410();
		this.anIntArray373 = null;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()V")
	public void method1581() {
		this.anIntArray373 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(DILclient!k;)Z")
	public boolean method1582(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray375.length; local1++) {
			if (arg2.method1139(this.anIntArray375[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray373 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray375.length; local30++) {
			@Pc(39) Class2_Sub1_Sub4_Sub3 local39 = Static98.method1702(arg2, this.anIntArray375[local30]);
			local39.method1483();
			@Pc(44) byte[] local44 = local39.aByteArray62;
			@Pc(47) int[] local47 = local39.anIntArray318;
			@Pc(52) int local52 = this.anIntArray374[local30];
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
				local47[local61] = Static10.method247(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray376[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2448 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray373[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2448 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray373[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2448 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray373[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray373[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray373[local259];
			this.anIntArray373[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray373[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray373[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public void method1583(@OriginalArg(0) int arg0) {
		if (this.anIntArray373 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt2573 == 1 || this.anInt2573 == 3) {
			if (Static91.anIntArray372 == null || Static91.anIntArray372.length < this.anIntArray373.length) {
				Static91.anIntArray372 = new int[this.anIntArray373.length];
			}
			if (this.anIntArray373.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray373.length / 4;
			local47 = local31 * arg0 * this.anInt2574;
			local51 = local40 - 1;
			if (this.anInt2573 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static91.anIntArray372[local60] = this.anIntArray373[local67];
				Static91.anIntArray372[local60 + local40] = this.anIntArray373[local67 + local40];
				Static91.anIntArray372[local60 + local40 + local40] = this.anIntArray373[local67 + local40 + local40];
				Static91.anIntArray372[local60 + local40 + local40 + local40] = this.anIntArray373[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray373;
			this.anIntArray373 = Static91.anIntArray372;
			Static91.anIntArray372 = local126;
		}
		if (this.anInt2573 != 2 && this.anInt2573 != 4) {
			return;
		}
		if (Static91.anIntArray372 == null || Static91.anIntArray372.length < this.anIntArray373.length) {
			Static91.anIntArray372 = new int[this.anIntArray373.length];
		}
		if (this.anIntArray373.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray373.length / 4;
		local47 = arg0 * this.anInt2574;
		local51 = local31 - 1;
		if (this.anInt2573 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static91.anIntArray372[local194] = this.anIntArray373[local202];
				Static91.anIntArray372[local194 + local40] = this.anIntArray373[local202 + local40];
				Static91.anIntArray372[local194 + local40 + local40] = this.anIntArray373[local202 + local40 + local40];
				Static91.anIntArray372[local194 + local40 + local40 + local40] = this.anIntArray373[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray373;
		this.anIntArray373 = Static91.anIntArray372;
		Static91.anIntArray372 = local126;
	}
}
