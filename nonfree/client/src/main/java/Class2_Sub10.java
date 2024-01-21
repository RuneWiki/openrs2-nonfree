import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!p", name = "mb", descriptor = "Z")
	public boolean aBoolean109 = false;

	@OriginalMember(owner = "client!p", name = "db", descriptor = "I")
	public final int anInt2003;

	@OriginalMember(owner = "client!p", name = "jb", descriptor = "Z")
	public final boolean aBoolean108;

	@OriginalMember(owner = "client!p", name = "kb", descriptor = "[I")
	private final int[] anIntArray221;

	@OriginalMember(owner = "client!p", name = "gb", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!p", name = "eb", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!p", name = "lb", descriptor = "[I")
	private final int[] anIntArray222;

	@OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
	public final int anInt2002;

	@OriginalMember(owner = "client!p", name = "ib", descriptor = "I")
	private final int anInt2004;

	@OriginalMember(owner = "client!p", name = "fb", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!ba;)V")
	public Class2_Sub10(@OriginalArg(0) Class2_Sub3 arg0) {
		this.anInt2003 = arg0.method792();
		this.aBoolean108 = arg0.method791() == 1;
		@Pc(23) int local23 = arg0.method791();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray221 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray221[local39] = arg0.method792();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray219 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray219[local62] = arg0.method791();
			}
		}
		if (local23 > 1) {
			this.anIntArray217 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray217[local62] = arg0.method791();
			}
		}
		this.anIntArray222 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray222[local62] = arg0.method814();
		}
		this.anInt2002 = arg0.method791();
		this.anInt2004 = arg0.method791();
		this.anIntArray218 = null;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public void method1382(@OriginalArg(0) int arg0) {
		if (this.anIntArray218 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt2002 == 1 || this.anInt2002 == 3) {
			if (Static74.anIntArray220 == null || Static74.anIntArray220.length < this.anIntArray218.length) {
				Static74.anIntArray220 = new int[this.anIntArray218.length];
			}
			if (this.anIntArray218.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray218.length / 4;
			local47 = local31 * arg0 * this.anInt2004;
			local51 = local40 - 1;
			if (this.anInt2002 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static74.anIntArray220[local60] = this.anIntArray218[local67];
				Static74.anIntArray220[local60 + local40] = this.anIntArray218[local67 + local40];
				Static74.anIntArray220[local60 + local40 + local40] = this.anIntArray218[local67 + local40 + local40];
				Static74.anIntArray220[local60 + local40 + local40 + local40] = this.anIntArray218[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray218;
			this.anIntArray218 = Static74.anIntArray220;
			Static74.anIntArray220 = local126;
		}
		if (this.anInt2002 != 2 && this.anInt2002 != 4) {
			return;
		}
		if (Static74.anIntArray220 == null || Static74.anIntArray220.length < this.anIntArray218.length) {
			Static74.anIntArray220 = new int[this.anIntArray218.length];
		}
		if (this.anIntArray218.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray218.length / 4;
		local47 = arg0 * this.anInt2004;
		local51 = local31 - 1;
		if (this.anInt2002 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static74.anIntArray220[local194] = this.anIntArray218[local202];
				Static74.anIntArray220[local194 + local40] = this.anIntArray218[local202 + local40];
				Static74.anIntArray220[local194 + local40 + local40] = this.anIntArray218[local202 + local40 + local40];
				Static74.anIntArray220[local194 + local40 + local40 + local40] = this.anIntArray218[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray218;
		this.anIntArray218 = Static74.anIntArray220;
		Static74.anIntArray220 = local126;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(DILclient!bd;)Z")
	public boolean method1383(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray221.length; local1++) {
			if (arg2.method1705(this.anIntArray221[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray218 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray221.length; local30++) {
			@Pc(39) Class2_Sub1_Sub2_Sub2 local39 = Static48.method1068(arg2, this.anIntArray221[local30]);
			local39.method639();
			@Pc(44) byte[] local44 = local39.aByteArray5;
			@Pc(47) int[] local47 = local39.anIntArray95;
			@Pc(52) int local52 = this.anIntArray222[local30];
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
				local47[local61] = Static24.method695(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray219[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt954 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray218[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt954 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray218[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt954 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray218[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray218[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray218[local259];
			this.anIntArray218[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray218[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray218[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
	public void method1384() {
		this.anIntArray218 = null;
	}
}
