import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class2_Sub17_Sub1 extends Class2_Sub17 {

	@OriginalMember(owner = "client!fq", name = "C", descriptor = "I")
	private int anInt2047;

	@OriginalMember(owner = "client!fq", name = "E", descriptor = "Z")
	public boolean aBoolean140;

	@OriginalMember(owner = "client!fq", name = "F", descriptor = "I")
	private int anInt2049;

	@OriginalMember(owner = "client!fq", name = "G", descriptor = "I")
	private int anInt2050;

	@OriginalMember(owner = "client!fq", name = "H", descriptor = "I")
	public int anInt2051;

	@OriginalMember(owner = "client!fq", name = "I", descriptor = "I")
	private int anInt2052;

	@OriginalMember(owner = "client!fq", name = "J", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!fq", name = "K", descriptor = "I")
	private int anInt2053;

	@OriginalMember(owner = "client!fq", name = "M", descriptor = "I")
	public int anInt2055;

	@OriginalMember(owner = "client!fq", name = "O", descriptor = "Z")
	public boolean aBoolean141;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	private Class2_Sub17_Sub1() {
		if (Static262.anIntArray890 == null) {
			Static233.method3794();
		}
		this.method1937();
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!kk;)V")
	public Class2_Sub17_Sub1(@OriginalArg(0) Class2_Sub16 arg0) {
		if (Static262.anIntArray890 == null) {
			Static233.method3794();
		}
		this.anInt2051 = arg0.method5350();
		this.aBoolean140 = (this.anInt2051 & 0x8) != 0;
		this.aBoolean141 = (this.anInt2051 & 0x10) != 0;
		this.anInt2051 &= 0x7;
		super.anInt2042 = arg0.method5312();
		super.anInt2037 = arg0.method5312();
		super.anInt2041 = arg0.method5312();
		super.anInt2043 = arg0.method5350();
		@Pc(68) int local68 = super.anInt2043 * 2 + 1;
		this.aShortArray30 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray30.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method5312();
			@Pc(85) int local85 = local81 >>> 8;
			@Pc(89) int local89 = local81 & 0xFF;
			if (local68 <= local85) {
				local85 = local68 - 1;
			}
			if (local68 - local85 < local89) {
				local89 = local68 - local85;
			}
			this.aShortArray30[local74] = (short) (local85 << 8 | local89);
		}
		super.anInt2043 = Static241.anInt4320 + (super.anInt2043 << Static333.anInt5694);
		if (Static298.anIntArray1009 == null) {
			super.anInt2040 = Static214.anIntArray762[Static264.method4082(arg0.method5312()) & 0xFFFF];
		} else {
			super.anInt2040 = Static298.anIntArray1009[arg0.method5312()];
		}
		@Pc(160) int local160 = arg0.method5350();
		this.anInt2053 = (local160 & 0xE0) << 3;
		this.anInt2055 = local160 & 0x1F;
		if (this.anInt2055 != 31) {
			this.method1937();
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBZ)V")
	public void method1936(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(56) int local56;
		if (arg1) {
			local56 = 2048;
		} else {
			@Pc(20) int local20 = this.anInt2053 + this.anInt2050 * arg0 / 50 & 0x7FF;
			@Pc(23) int local23 = this.anInt2052;
			if (local23 == 1) {
				local56 = (Class177.anIntArray843[local20 << 3] >> 5) + 1024;
			} else if (local23 == 3) {
				local56 = Static262.anIntArray890[local20] >> 1;
			} else if (local23 == 4) {
				local56 = local20 >> 10 << 11;
			} else if (local23 == 2) {
				local56 = local20;
			} else if (local23 == 5) {
				local56 = (local20 >= 1024 ? 2048 - local20 : local20) << 1;
			} else {
				local56 = 2048;
			}
		}
		super.aFloat17 = (float) (this.anInt2049 + (this.anInt2047 * local56 >> 11)) / 2048.0F;
	}

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V")
	private void method1937() {
		@Pc(4) int local4 = this.anInt2055;
		if (local4 == 2) {
			this.anInt2047 = 2048;
			this.anInt2050 = 2048;
			this.anInt2049 = 0;
			this.anInt2052 = 1;
		} else if (local4 == 3) {
			this.anInt2047 = 2048;
			this.anInt2049 = 0;
			this.anInt2050 = 4096;
			this.anInt2052 = 1;
		} else if (local4 == 4) {
			this.anInt2050 = 2048;
			this.anInt2047 = 2048;
			this.anInt2052 = 4;
			this.anInt2049 = 0;
		} else if (local4 == 5) {
			this.anInt2049 = 0;
			this.anInt2050 = 8192;
			this.anInt2052 = 4;
			this.anInt2047 = 2048;
		} else if (local4 == 12) {
			this.anInt2047 = 2048;
			this.anInt2050 = 2048;
			this.anInt2049 = 0;
			this.anInt2052 = 2;
		} else if (local4 == 13) {
			this.anInt2047 = 2048;
			this.anInt2049 = 0;
			this.anInt2052 = 2;
			this.anInt2050 = 8192;
		} else if (local4 == 10) {
			this.anInt2047 = 512;
			this.anInt2050 = 2048;
			this.anInt2052 = 3;
			this.anInt2049 = 1536;
		} else if (local4 == 11) {
			this.anInt2052 = 3;
			this.anInt2050 = 4096;
			this.anInt2049 = 1536;
			this.anInt2047 = 512;
		} else if (local4 == 6) {
			this.anInt2047 = 768;
			this.anInt2049 = 1280;
			this.anInt2052 = 3;
			this.anInt2050 = 2048;
		} else if (local4 == 7) {
			this.anInt2052 = 3;
			this.anInt2050 = 4096;
			this.anInt2047 = 768;
			this.anInt2049 = 1280;
		} else if (local4 == 8) {
			this.anInt2050 = 2048;
			this.anInt2047 = 1024;
			this.anInt2049 = 1024;
			this.anInt2052 = 3;
		} else if (local4 == 9) {
			this.anInt2052 = 3;
			this.anInt2050 = 4096;
			this.anInt2049 = 1024;
			this.anInt2047 = 1024;
		} else if (local4 == 14) {
			this.anInt2052 = 1;
			this.anInt2049 = 1280;
			this.anInt2050 = 2048;
			this.anInt2047 = 768;
		} else if (local4 == 15) {
			this.anInt2049 = 1536;
			this.anInt2052 = 1;
			this.anInt2050 = 4096;
			this.anInt2047 = 512;
		} else if (local4 == 16) {
			this.anInt2052 = 1;
			this.anInt2047 = 256;
			this.anInt2049 = 1792;
			this.anInt2050 = 8192;
		} else {
			this.anInt2052 = 0;
			this.anInt2047 = 2048;
			this.anInt2050 = 2048;
			this.anInt2049 = 0;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BIIII)V")
	public void method1938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2052 = arg0;
		this.anInt2047 = arg1;
		this.anInt2049 = arg3;
		this.anInt2050 = arg2;
	}
}
