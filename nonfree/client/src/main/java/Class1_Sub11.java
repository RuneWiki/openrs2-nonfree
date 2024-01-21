import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "Z")
	public boolean aBoolean92 = false;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
	public final int anInt1596;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "Z")
	public final boolean aBoolean93;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
	private final int[] anIntArray233;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "[I")
	private int[] anIntArray230;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "[I")
	private int[] anIntArray229;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "[I")
	private final int[] anIntArray232;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	public final int anInt1598;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
	private final int anInt1597;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class1_Sub11(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt1596 = arg0.method1199();
		this.aBoolean93 = arg0.method1186() == 1;
		@Pc(23) int local23 = arg0.method1186();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray233 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray233[local39] = arg0.method1199();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray230 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray230[local62] = arg0.method1186();
			}
		}
		if (local23 > 1) {
			this.anIntArray229 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray229[local62] = arg0.method1186();
			}
		}
		this.anIntArray232 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray232[local62] = arg0.method1188();
		}
		this.anInt1598 = arg0.method1186();
		this.anInt1597 = arg0.method1186();
		this.anIntArray234 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(DILclient!ja;)Z")
	public boolean method1113(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray233.length; local1++) {
			if (arg2.method1321(this.anIntArray233[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray234 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray233.length; local30++) {
			@Pc(39) Class1_Sub1_Sub1_Sub4 local39 = Static87.method1577(this.anIntArray233[local30], arg2);
			local39.method1142();
			@Pc(44) byte[] local44 = local39.aByteArray23;
			@Pc(47) int[] local47 = local39.anIntArray238;
			@Pc(52) int local52 = this.anIntArray232[local30];
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
				local47[local61] = Static41.method687(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray230[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt1627 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray234[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt1627 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray234[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt1627 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray234[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray234[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray234[local259];
			this.anIntArray234[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray234[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray234[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public void method1114(@OriginalArg(0) int arg0) {
		if (this.anIntArray234 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1598 == 1 || this.anInt1598 == 3) {
			if (Static66.anIntArray231 == null || Static66.anIntArray231.length < this.anIntArray234.length) {
				Static66.anIntArray231 = new int[this.anIntArray234.length];
			}
			if (this.anIntArray234.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray234.length / 4;
			local47 = local31 * arg0 * this.anInt1597;
			local51 = local40 - 1;
			if (this.anInt1598 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static66.anIntArray231[local60] = this.anIntArray234[local67];
				Static66.anIntArray231[local60 + local40] = this.anIntArray234[local67 + local40];
				Static66.anIntArray231[local60 + local40 + local40] = this.anIntArray234[local67 + local40 + local40];
				Static66.anIntArray231[local60 + local40 + local40 + local40] = this.anIntArray234[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray234;
			this.anIntArray234 = Static66.anIntArray231;
			Static66.anIntArray231 = local126;
		}
		if (this.anInt1598 != 2 && this.anInt1598 != 4) {
			return;
		}
		if (Static66.anIntArray231 == null || Static66.anIntArray231.length < this.anIntArray234.length) {
			Static66.anIntArray231 = new int[this.anIntArray234.length];
		}
		if (this.anIntArray234.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray234.length / 4;
		local47 = arg0 * this.anInt1597;
		local51 = local31 - 1;
		if (this.anInt1598 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static66.anIntArray231[local194] = this.anIntArray234[local202];
				Static66.anIntArray231[local194 + local40] = this.anIntArray234[local202 + local40];
				Static66.anIntArray231[local194 + local40 + local40] = this.anIntArray234[local202 + local40 + local40];
				Static66.anIntArray231[local194 + local40 + local40 + local40] = this.anIntArray234[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray234;
		this.anIntArray234 = Static66.anIntArray231;
		Static66.anIntArray231 = local126;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	public void method1115() {
		this.anIntArray234 = null;
	}
}
