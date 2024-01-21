import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class5_Sub13 extends Class5 {

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
	public final int anInt1721;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "Z")
	public final boolean aBoolean85;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "[I")
	private final int[] anIntArray270;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "[I")
	private final int[] anIntArray267;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
	public final int anInt1719;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
	private final int anInt1720;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class5_Sub13(@OriginalArg(0) Class5_Sub9 arg0) {
		this.anInt1721 = arg0.method1418();
		this.aBoolean85 = arg0.method1408() == 1;
		@Pc(23) int local23 = arg0.method1408();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray270 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray270[local39] = arg0.method1418();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray265 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray265[local62] = arg0.method1408();
			}
		}
		if (local23 > 1) {
			this.anIntArray268 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray268[local62] = arg0.method1408();
			}
		}
		this.anIntArray267 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray267[local62] = arg0.method1434();
		}
		this.anInt1719 = arg0.method1408();
		this.anInt1720 = arg0.method1408();
		this.anIntArray269 = null;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()V")
	public void method1185() {
		this.anIntArray269 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(DILclient!sd;)Z")
	public boolean method1186(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class29 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray270.length; local1++) {
			if (arg2.method757(this.anIntArray270[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray269 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray270.length; local30++) {
			@Pc(39) Class5_Sub2_Sub6_Sub4 local39 = Static110.method1984(arg2, this.anIntArray270[local30]);
			local39.method1877();
			@Pc(44) byte[] local44 = local39.aByteArray37;
			@Pc(47) int[] local47 = local39.anIntArray415;
			@Pc(52) int local52 = this.anIntArray267[local30];
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
				local47[local61] = Static86.method1662(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray265[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt2731 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray269[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt2731 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray269[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt2731 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray269[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray269[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray269[local259];
			this.anIntArray269[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray269[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray269[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	public void method1187(@OriginalArg(0) int arg0) {
		if (this.anIntArray269 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1719 == 1 || this.anInt1719 == 3) {
			if (Static58.anIntArray266 == null || Static58.anIntArray266.length < this.anIntArray269.length) {
				Static58.anIntArray266 = new int[this.anIntArray269.length];
			}
			if (this.anIntArray269.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray269.length / 4;
			local47 = local31 * arg0 * this.anInt1720;
			local51 = local40 - 1;
			if (this.anInt1719 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static58.anIntArray266[local60] = this.anIntArray269[local67];
				Static58.anIntArray266[local60 + local40] = this.anIntArray269[local67 + local40];
				Static58.anIntArray266[local60 + local40 + local40] = this.anIntArray269[local67 + local40 + local40];
				Static58.anIntArray266[local60 + local40 + local40 + local40] = this.anIntArray269[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray269;
			this.anIntArray269 = Static58.anIntArray266;
			Static58.anIntArray266 = local126;
		}
		if (this.anInt1719 != 2 && this.anInt1719 != 4) {
			return;
		}
		if (Static58.anIntArray266 == null || Static58.anIntArray266.length < this.anIntArray269.length) {
			Static58.anIntArray266 = new int[this.anIntArray269.length];
		}
		if (this.anIntArray269.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray269.length / 4;
		local47 = arg0 * this.anInt1720;
		local51 = local31 - 1;
		if (this.anInt1719 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static58.anIntArray266[local194] = this.anIntArray269[local202];
				Static58.anIntArray266[local194 + local40] = this.anIntArray269[local202 + local40];
				Static58.anIntArray266[local194 + local40 + local40] = this.anIntArray269[local202 + local40 + local40];
				Static58.anIntArray266[local194 + local40 + local40 + local40] = this.anIntArray269[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray269;
		this.anIntArray269 = Static58.anIntArray266;
		Static58.anIntArray266 = local126;
	}
}
