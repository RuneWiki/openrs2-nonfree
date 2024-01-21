import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	public final int anInt2009;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Z")
	public final boolean aBoolean126;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "[I")
	private final int[] anIntArray297;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "[I")
	private int[] anIntArray299;

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "[I")
	private final int[] anIntArray294;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
	public final int anInt2008;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
	private final int anInt2007;

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!id;)V")
	public Class1_Sub10(@OriginalArg(0) Class1_Sub6 arg0) {
		this.anInt2009 = arg0.method1842();
		this.aBoolean126 = arg0.method1837() == 1;
		@Pc(23) int local23 = arg0.method1837();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray297 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray297[local39] = arg0.method1842();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray299 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray299[local62] = arg0.method1837();
			}
		}
		if (local23 > 1) {
			this.anIntArray295 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray295[local62] = arg0.method1837();
			}
		}
		this.anIntArray294 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray294[local62] = arg0.method1817();
		}
		this.anInt2008 = arg0.method1837();
		this.anInt2007 = arg0.method1837();
		this.anIntArray296 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()V")
	public void method1442() {
		this.anIntArray296 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(DILclient!pb;)Z")
	public boolean method1443(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class41 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray297.length; local1++) {
			if (arg2.method1067(this.anIntArray297[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray296 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray297.length; local30++) {
			@Pc(39) Class1_Sub1_Sub5_Sub3 local39 = Static102.method1653(arg2, this.anIntArray297[local30]);
			local39.method1292();
			@Pc(44) byte[] local44 = local39.aByteArray22;
			@Pc(47) int[] local47 = local39.anIntArray259;
			@Pc(52) int local52 = this.anIntArray294[local30];
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
				local47[local61] = Static112.method1973(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray299[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt1799 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray296[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt1799 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray296[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt1799 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray296[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray296[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray296[local259];
			this.anIntArray296[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray296[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray296[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	public void method1444(@OriginalArg(0) int arg0) {
		if (this.anIntArray296 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt2008 == 1 || this.anInt2008 == 3) {
			if (Static88.anIntArray298 == null || Static88.anIntArray298.length < this.anIntArray296.length) {
				Static88.anIntArray298 = new int[this.anIntArray296.length];
			}
			if (this.anIntArray296.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray296.length / 4;
			local47 = local31 * arg0 * this.anInt2007;
			local51 = local40 - 1;
			if (this.anInt2008 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static88.anIntArray298[local60] = this.anIntArray296[local67];
				Static88.anIntArray298[local60 + local40] = this.anIntArray296[local67 + local40];
				Static88.anIntArray298[local60 + local40 + local40] = this.anIntArray296[local67 + local40 + local40];
				Static88.anIntArray298[local60 + local40 + local40 + local40] = this.anIntArray296[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray296;
			this.anIntArray296 = Static88.anIntArray298;
			Static88.anIntArray298 = local126;
		}
		if (this.anInt2008 != 2 && this.anInt2008 != 4) {
			return;
		}
		if (Static88.anIntArray298 == null || Static88.anIntArray298.length < this.anIntArray296.length) {
			Static88.anIntArray298 = new int[this.anIntArray296.length];
		}
		if (this.anIntArray296.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray296.length / 4;
		local47 = arg0 * this.anInt2007;
		local51 = local31 - 1;
		if (this.anInt2008 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static88.anIntArray298[local194] = this.anIntArray296[local202];
				Static88.anIntArray298[local194 + local40] = this.anIntArray296[local202 + local40];
				Static88.anIntArray298[local194 + local40 + local40] = this.anIntArray296[local202 + local40 + local40];
				Static88.anIntArray298[local194 + local40 + local40 + local40] = this.anIntArray296[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray296;
		this.anIntArray296 = Static88.anIntArray298;
		Static88.anIntArray298 = local126;
	}
}
