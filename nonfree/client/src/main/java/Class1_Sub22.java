import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
	public final int anInt2616;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "Z")
	public final boolean aBoolean142;

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "[I")
	private final int[] anIntArray331;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "[I")
	private final int[] anIntArray330;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
	public final int anInt2615;

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
	private final int anInt2617;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!of;)V")
	public Class1_Sub22(@OriginalArg(0) Class1_Sub19 arg0) {
		this.anInt2616 = arg0.method2051();
		this.aBoolean142 = arg0.method2072() == 1;
		@Pc(23) int local23 = arg0.method2072();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray331 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray331[local39] = arg0.method2051();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray327 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray327[local62] = arg0.method2072();
			}
		}
		if (local23 > 1) {
			this.anIntArray326 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray326[local62] = arg0.method2072();
			}
		}
		this.anIntArray330 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray330[local62] = arg0.method2046();
		}
		this.anInt2615 = arg0.method2072();
		this.anInt2617 = arg0.method2072();
		this.anIntArray328 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(DILclient!ie;)Z")
	public boolean method1731(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray331.length; local1++) {
			if (arg2.method1563(this.anIntArray331[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray328 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray331.length; local30++) {
			@Pc(39) Class1_Sub1_Sub2_Sub2 local39 = Static61.method1049(arg2, this.anIntArray331[local30]);
			local39.method543();
			@Pc(44) byte[] local44 = local39.aByteArray12;
			@Pc(47) int[] local47 = local39.anIntArray87;
			@Pc(52) int local52 = this.anIntArray330[local30];
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
				local47[local61] = Static108.method1780(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray327[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt883 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray328[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt883 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray328[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt883 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray328[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray328[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray328[local259];
			this.anIntArray328[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray328[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray328[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	public void method1732(@OriginalArg(0) int arg0) {
		if (this.anIntArray328 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt2615 == 1 || this.anInt2615 == 3) {
			if (Static107.anIntArray329 == null || Static107.anIntArray329.length < this.anIntArray328.length) {
				Static107.anIntArray329 = new int[this.anIntArray328.length];
			}
			if (this.anIntArray328.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray328.length / 4;
			local47 = local31 * arg0 * this.anInt2617;
			local51 = local40 - 1;
			if (this.anInt2615 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static107.anIntArray329[local60] = this.anIntArray328[local67];
				Static107.anIntArray329[local60 + local40] = this.anIntArray328[local67 + local40];
				Static107.anIntArray329[local60 + local40 + local40] = this.anIntArray328[local67 + local40 + local40];
				Static107.anIntArray329[local60 + local40 + local40 + local40] = this.anIntArray328[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray328;
			this.anIntArray328 = Static107.anIntArray329;
			Static107.anIntArray329 = local126;
		}
		if (this.anInt2615 != 2 && this.anInt2615 != 4) {
			return;
		}
		if (Static107.anIntArray329 == null || Static107.anIntArray329.length < this.anIntArray328.length) {
			Static107.anIntArray329 = new int[this.anIntArray328.length];
		}
		if (this.anIntArray328.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray328.length / 4;
		local47 = arg0 * this.anInt2617;
		local51 = local31 - 1;
		if (this.anInt2615 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static107.anIntArray329[local194] = this.anIntArray328[local202];
				Static107.anIntArray329[local194 + local40] = this.anIntArray328[local202 + local40];
				Static107.anIntArray329[local194 + local40 + local40] = this.anIntArray328[local202 + local40 + local40];
				Static107.anIntArray329[local194 + local40 + local40 + local40] = this.anIntArray328[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray328;
		this.anIntArray328 = Static107.anIntArray329;
		Static107.anIntArray329 = local126;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
	public void method1734() {
		this.anIntArray328 = null;
	}
}
