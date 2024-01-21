import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class10_Sub12 extends Class10 {

	@OriginalMember(owner = "client!t", name = "E", descriptor = "Z")
	public boolean aBoolean106 = false;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "I")
	public final int anInt2358;

	@OriginalMember(owner = "client!t", name = "w", descriptor = "Z")
	public final boolean aBoolean105;

	@OriginalMember(owner = "client!t", name = "D", descriptor = "[I")
	private final int[] anIntArray314;

	@OriginalMember(owner = "client!t", name = "z", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "[I")
	private int[] anIntArray312;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "[I")
	private final int[] anIntArray313;

	@OriginalMember(owner = "client!t", name = "x", descriptor = "I")
	public final int anInt2359;

	@OriginalMember(owner = "client!t", name = "y", descriptor = "I")
	private final int anInt2360;

	@OriginalMember(owner = "client!t", name = "F", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!tc;)V")
	public Class10_Sub12(@OriginalArg(0) Class10_Sub10 arg0) {
		this.anInt2358 = arg0.method1160();
		this.aBoolean105 = arg0.method1111() == 1;
		@Pc(23) int local23 = arg0.method1111();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray314 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray314[local39] = arg0.method1160();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray310 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray310[local62] = arg0.method1111();
			}
		}
		if (local23 > 1) {
			this.anIntArray312 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray312[local62] = arg0.method1111();
			}
		}
		this.anIntArray313 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray313[local62] = arg0.method1112();
		}
		this.anInt2359 = arg0.method1111();
		this.anInt2360 = arg0.method1111();
		this.anIntArray315 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method1450() {
		this.anIntArray315 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public void method1451(@OriginalArg(0) int arg0) {
		if (this.anIntArray315 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt2359 == 1 || this.anInt2359 == 3) {
			if (Static90.anIntArray311 == null || Static90.anIntArray311.length < this.anIntArray315.length) {
				Static90.anIntArray311 = new int[this.anIntArray315.length];
			}
			if (this.anIntArray315.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray315.length / 4;
			local47 = local31 * arg0 * this.anInt2360;
			local51 = local40 - 1;
			if (this.anInt2359 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static90.anIntArray311[local60] = this.anIntArray315[local67];
				Static90.anIntArray311[local60 + local40] = this.anIntArray315[local67 + local40];
				Static90.anIntArray311[local60 + local40 + local40] = this.anIntArray315[local67 + local40 + local40];
				Static90.anIntArray311[local60 + local40 + local40 + local40] = this.anIntArray315[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray315;
			this.anIntArray315 = Static90.anIntArray311;
			Static90.anIntArray311 = local126;
		}
		if (this.anInt2359 != 2 && this.anInt2359 != 4) {
			return;
		}
		if (Static90.anIntArray311 == null || Static90.anIntArray311.length < this.anIntArray315.length) {
			Static90.anIntArray311 = new int[this.anIntArray315.length];
		}
		if (this.anIntArray315.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray315.length / 4;
		local47 = arg0 * this.anInt2360;
		local51 = local31 - 1;
		if (this.anInt2359 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static90.anIntArray311[local194] = this.anIntArray315[local202];
				Static90.anIntArray311[local194 + local40] = this.anIntArray315[local202 + local40];
				Static90.anIntArray311[local194 + local40 + local40] = this.anIntArray315[local202 + local40 + local40];
				Static90.anIntArray311[local194 + local40 + local40 + local40] = this.anIntArray315[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray315;
		this.anIntArray315 = Static90.anIntArray311;
		Static90.anIntArray311 = local126;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(DILclient!he;)Z")
	public boolean method1452(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray314.length; local1++) {
			if (arg2.method226(this.anIntArray314[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray315 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray314.length; local30++) {
			@Pc(39) Class10_Sub1_Sub1_Sub2 local39 = Static33.method589(this.anIntArray314[local30], arg2);
			local39.method874();
			@Pc(44) byte[] local44 = local39.aByteArray5;
			@Pc(47) int[] local47 = local39.anIntArray173;
			@Pc(52) int local52 = this.anIntArray313[local30];
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
				local47[local61] = Static68.method1004(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray310[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt1570 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray315[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt1570 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray315[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt1570 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray315[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray315[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray315[local259];
			this.anIntArray315[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray315[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray315[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}
}
