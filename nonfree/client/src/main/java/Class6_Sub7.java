import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "Z")
	public boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
	public final int anInt1384;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "Z")
	public final boolean aBoolean62;

	@OriginalMember(owner = "client!ia", name = "I", descriptor = "[I")
	private final int[] anIntArray92;

	@OriginalMember(owner = "client!ia", name = "A", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!ia", name = "J", descriptor = "[I")
	private final int[] anIntArray93;

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
	public final int anInt1383;

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
	private final int anInt1385;

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!b;)V")
	public Class6_Sub7(@OriginalArg(0) Class6_Sub1 arg0) {
		this.anInt1384 = arg0.method1500();
		this.aBoolean62 = arg0.method1495() == 1;
		@Pc(23) int local23 = arg0.method1495();
		if (local23 < 1 || local23 > 4) {
			throw new RuntimeException();
		}
		this.anIntArray92 = new int[local23];
		for (@Pc(39) int local39 = 0; local39 < local23; local39++) {
			this.anIntArray92[local39] = arg0.method1500();
		}
		@Pc(62) int local62;
		if (local23 > 1) {
			this.anIntArray90 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray90[local62] = arg0.method1495();
			}
		}
		if (local23 > 1) {
			this.anIntArray89 = new int[local23 - 1];
			for (local62 = 0; local62 < local23 - 1; local62++) {
				this.anIntArray89[local62] = arg0.method1495();
			}
		}
		this.anIntArray93 = new int[local23];
		for (local62 = 0; local62 < local23; local62++) {
			this.anIntArray93[local62] = arg0.method1503();
		}
		this.anInt1383 = arg0.method1495();
		this.anInt1385 = arg0.method1495();
		this.anIntArray94 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(DILclient!pb;)Z")
	public boolean method902(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray92.length; local1++) {
			if (arg2.method1235(this.anIntArray92[local1]) == null) {
				return false;
			}
		}
		@Pc(22) int local22 = arg1 * arg1;
		this.anIntArray94 = new int[local22 * 4];
		for (@Pc(30) int local30 = 0; local30 < this.anIntArray92.length; local30++) {
			@Pc(39) Class6_Sub2_Sub2_Sub1 local39 = Static31.method798(arg2, this.anIntArray92[local30]);
			local39.method320();
			@Pc(44) byte[] local44 = local39.aByteArray4;
			@Pc(47) int[] local47 = local39.anIntArray24;
			@Pc(52) int local52 = this.anIntArray93[local30];
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
				local47[local61] = Static30.method784(local47[local61], arg0);
			}
			if (local30 == 0) {
				local67 = 0;
			} else {
				local67 = this.anIntArray90[local30 - 1];
			}
			if (local67 == 0) {
				if (local39.anInt364 == arg1) {
					for (local69 = 0; local69 < local22; local69++) {
						this.anIntArray94[local69] = local47[local44[local69] & 0xFF];
					}
				} else {
					@Pc(173) int local173;
					if (local39.anInt364 == 64 && arg1 == 128) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray94[local69++] = local47[local44[(local173 >> 1) + (local74 >> 1 << 6)] & 0xFF];
							}
						}
					} else if (local39.anInt364 == 128 && arg1 == 64) {
						local69 = 0;
						for (local74 = 0; local74 < arg1; local74++) {
							for (local173 = 0; local173 < arg1; local173++) {
								this.anIntArray94[local69++] = local47[local44[(local173 << 1) + (local74 << 1 << 7)] & 0xFF];
							}
						}
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
		for (@Pc(259) int local259 = 0; local259 < local22; local259++) {
			this.anIntArray94[local259] &= 0xF8F8FF;
			@Pc(273) int local273 = this.anIntArray94[local259];
			this.anIntArray94[local259 + local22] = local273 - (local273 >>> 3) & 0xF8F8FF;
			this.anIntArray94[local259 + local22 + local22] = local273 - (local273 >>> 2) & 0xF8F8FF;
			this.anIntArray94[local259 + local22 + local22 + local22] = local273 - (local273 >>> 2) - (local273 >>> 3) & 0xF8F8FF;
		}
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
	public void method904() {
		this.anIntArray94 = null;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	public void method905(@OriginalArg(0) int arg0) {
		if (this.anIntArray94 == null) {
			return;
		}
		@Pc(31) short local31;
		@Pc(40) int local40;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(126) int[] local126;
		if (this.anInt1383 == 1 || this.anInt1383 == 3) {
			if (Static37.anIntArray91 == null || Static37.anIntArray91.length < this.anIntArray94.length) {
				Static37.anIntArray91 = new int[this.anIntArray94.length];
			}
			if (this.anIntArray94.length == 16384) {
				local31 = 64;
			} else {
				local31 = 128;
			}
			local40 = this.anIntArray94.length / 4;
			local47 = local31 * arg0 * this.anInt1385;
			local51 = local40 - 1;
			if (this.anInt1383 == 1) {
				local47 = -local47;
			}
			for (local60 = 0; local60 < local40; local60++) {
				local67 = local60 + local47 & local51;
				Static37.anIntArray91[local60] = this.anIntArray94[local67];
				Static37.anIntArray91[local60 + local40] = this.anIntArray94[local67 + local40];
				Static37.anIntArray91[local60 + local40 + local40] = this.anIntArray94[local67 + local40 + local40];
				Static37.anIntArray91[local60 + local40 + local40 + local40] = this.anIntArray94[local67 + local40 + local40 + local40];
			}
			local126 = this.anIntArray94;
			this.anIntArray94 = Static37.anIntArray91;
			Static37.anIntArray91 = local126;
		}
		if (this.anInt1383 != 2 && this.anInt1383 != 4) {
			return;
		}
		if (Static37.anIntArray91 == null || Static37.anIntArray91.length < this.anIntArray94.length) {
			Static37.anIntArray91 = new int[this.anIntArray94.length];
		}
		if (this.anIntArray94.length == 16384) {
			local31 = 64;
		} else {
			local31 = 128;
		}
		local40 = this.anIntArray94.length / 4;
		local47 = arg0 * this.anInt1385;
		local51 = local31 - 1;
		if (this.anInt1383 == 2) {
			local47 = -local47;
		}
		for (local60 = 0; local60 < local40; local60 += local31) {
			for (local67 = 0; local67 < local31; local67++) {
				@Pc(194) int local194 = local60 + local67;
				@Pc(202) int local202 = local60 + (local67 + local47 & local51);
				Static37.anIntArray91[local194] = this.anIntArray94[local202];
				Static37.anIntArray91[local194 + local40] = this.anIntArray94[local202 + local40];
				Static37.anIntArray91[local194 + local40 + local40] = this.anIntArray94[local202 + local40 + local40];
				Static37.anIntArray91[local194 + local40 + local40 + local40] = this.anIntArray94[local202 + local40 + local40 + local40];
			}
		}
		local126 = this.anIntArray94;
		this.anIntArray94 = Static37.anIntArray91;
		Static37.anIntArray91 = local126;
	}
}
