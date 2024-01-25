import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class2_Sub14_Sub1 extends Class2_Sub14 {

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
	private int anInt2173;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "Z")
	public boolean aBoolean167;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
	private int anInt2175;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
	private int anInt2178;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	private int anInt2179;

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
	public int anInt2181;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
	private int anInt2182;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
	public int anInt2183;

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "Z")
	public boolean aBoolean168;

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	private Class2_Sub14_Sub1() {
		if (Static235.anIntArray526 == null) {
			Static287.method4401();
		}
		this.method2105();
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!lk;)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) Class2_Sub13 arg0) {
		if (Static235.anIntArray526 == null) {
			Static287.method4401();
		}
		this.anInt2183 = arg0.method4240();
		this.aBoolean167 = (this.anInt2183 & 0x10) != 0;
		this.aBoolean168 = (this.anInt2183 & 0x8) != 0;
		this.anInt2183 &= 0x7;
		super.anInt2170 = arg0.method4245();
		super.anInt2167 = arg0.method4245();
		super.anInt2165 = arg0.method4245();
		super.anInt2166 = arg0.method4240();
		@Pc(68) int local68 = super.anInt2166 * 2 + 1;
		this.aShortArray40 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray40.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method4245();
			@Pc(85) int local85 = local81 >>> 8;
			@Pc(89) int local89 = local81 & 0xFF;
			if (local85 >= local68) {
				local85 = local68 - 1;
			}
			if (local68 - local85 < local89) {
				local89 = local68 - local85;
			}
			this.aShortArray40[local74] = (short) (local89 | local85 << 8);
		}
		super.anInt2166 = (super.anInt2166 << Static315.anInt5584) + Static365.anInt2303;
		if (Static69.anIntArray170 == null) {
			super.anInt2172 = Static198.anIntArray439[Static272.method4279(arg0.method4245()) & 0xFFFF];
		} else {
			super.anInt2172 = Static69.anIntArray170[arg0.method4245()];
		}
		@Pc(169) int local169 = arg0.method4240();
		this.anInt2181 = local169 & 0x1F;
		this.anInt2175 = (local169 & 0xE0) << 3;
		if (this.anInt2181 != 31) {
			this.method2105();
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
	private void method2105() {
		@Pc(9) int local9 = this.anInt2181;
		if (local9 == 2) {
			this.anInt2173 = 2048;
			this.anInt2179 = 2048;
			this.anInt2178 = 1;
			this.anInt2182 = 0;
		} else if (local9 == 3) {
			this.anInt2179 = 2048;
			this.anInt2182 = 0;
			this.anInt2173 = 4096;
			this.anInt2178 = 1;
		} else if (local9 == 4) {
			this.anInt2179 = 2048;
			this.anInt2182 = 0;
			this.anInt2178 = 4;
			this.anInt2173 = 2048;
		} else if (local9 == 5) {
			this.anInt2179 = 2048;
			this.anInt2178 = 4;
			this.anInt2173 = 8192;
			this.anInt2182 = 0;
		} else if (local9 == 12) {
			this.anInt2178 = 2;
			this.anInt2173 = 2048;
			this.anInt2182 = 0;
			this.anInt2179 = 2048;
		} else if (local9 == 13) {
			this.anInt2182 = 0;
			this.anInt2173 = 8192;
			this.anInt2178 = 2;
			this.anInt2179 = 2048;
		} else if (local9 == 10) {
			this.anInt2173 = 2048;
			this.anInt2178 = 3;
			this.anInt2182 = 1536;
			this.anInt2179 = 512;
		} else if (local9 == 11) {
			this.anInt2173 = 4096;
			this.anInt2179 = 512;
			this.anInt2178 = 3;
			this.anInt2182 = 1536;
		} else if (local9 == 6) {
			this.anInt2182 = 1280;
			this.anInt2173 = 2048;
			this.anInt2178 = 3;
			this.anInt2179 = 768;
		} else if (local9 == 7) {
			this.anInt2179 = 768;
			this.anInt2182 = 1280;
			this.anInt2173 = 4096;
			this.anInt2178 = 3;
		} else if (local9 == 8) {
			this.anInt2179 = 1024;
			this.anInt2173 = 2048;
			this.anInt2182 = 1024;
			this.anInt2178 = 3;
		} else if (local9 == 9) {
			this.anInt2178 = 3;
			this.anInt2173 = 4096;
			this.anInt2179 = 1024;
			this.anInt2182 = 1024;
		} else if (local9 == 14) {
			this.anInt2178 = 1;
			this.anInt2173 = 2048;
			this.anInt2182 = 1280;
			this.anInt2179 = 768;
		} else if (local9 == 15) {
			this.anInt2173 = 4096;
			this.anInt2178 = 1;
			this.anInt2179 = 512;
			this.anInt2182 = 1536;
		} else if (local9 == 16) {
			this.anInt2179 = 256;
			this.anInt2178 = 1;
			this.anInt2173 = 8192;
			this.anInt2182 = 1792;
		} else {
			this.anInt2173 = 2048;
			this.anInt2182 = 0;
			this.anInt2179 = 2048;
			this.anInt2178 = 0;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public void method2106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2179 = arg3;
		this.anInt2178 = arg1;
		this.anInt2182 = arg0;
		this.anInt2173 = arg2;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZ)V")
	public void method2108(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(60) int local60;
		if (arg1) {
			local60 = 2048;
		} else {
			@Pc(27) int local27 = this.anInt2173 * arg0 / 50 + this.anInt2175 & 0x7FF;
			@Pc(30) int local30 = this.anInt2178;
			if (local30 == 1) {
				local60 = (Class104.anIntArray705[local27 << 3] >> 5) + 1024;
			} else if (local30 == 3) {
				local60 = Static235.anIntArray526[local27] >> 1;
			} else if (local30 == 4) {
				local60 = local27 >> 10 << 11;
			} else if (local30 == 2) {
				local60 = local27;
			} else if (local30 == 5) {
				local60 = (local27 >= 1024 ? 2048 - local27 : local27) << 1;
			} else {
				local60 = 2048;
			}
		}
		super.aFloat25 = (float) ((this.anInt2179 * local60 >> 11) + this.anInt2182) / 2048.0F;
	}
}
