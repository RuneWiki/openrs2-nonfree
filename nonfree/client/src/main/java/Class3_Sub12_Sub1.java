import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class3_Sub12_Sub1 extends Class3_Sub12 {

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
	private int anInt6132;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
	private int anInt6133;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
	public int anInt6134;

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
	private int anInt6135;

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "Z")
	public boolean aBoolean479;

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
	private int anInt6142;

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
	private int anInt6144;

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
	public int anInt6145;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	private Class3_Sub12_Sub1() {
		if (Static343.anIntArray628 == null) {
			Static277.method4346();
		}
		this.method5447();
	}

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!rp;)V")
	public Class3_Sub12_Sub1(@OriginalArg(0) Class3_Sub5 arg0) {
		if (Static343.anIntArray628 == null) {
			Static277.method4346();
		}
		this.anInt6145 = arg0.method2739();
		this.aBoolean478 = (this.anInt6145 & 0x8) != 0;
		this.aBoolean479 = (this.anInt6145 & 0x10) != 0;
		this.anInt6145 &= 0x7;
		super.anInt6127 = arg0.method2767();
		super.anInt6122 = arg0.method2767();
		super.anInt6123 = arg0.method2767();
		super.anInt6129 = arg0.method2739();
		@Pc(71) int local71 = super.anInt6129 * 2 + 1;
		this.aShortArray93 = new short[local71];
		for (@Pc(77) int local77 = 0; local77 < this.aShortArray93.length; local77++) {
			@Pc(84) short local84 = (short) arg0.method2767();
			@Pc(88) int local88 = local84 >>> 8;
			@Pc(92) int local92 = local84 & 0xFF;
			if (local88 >= local71) {
				local88 = local71 - 1;
			}
			if (local71 - local88 < local92) {
				local92 = local71 - local88;
			}
			this.aShortArray93[local77] = (short) (local92 | local88 << 8);
		}
		super.anInt6129 = Static132.anInt2502 + (super.anInt6129 << Static187.anInt3390);
		if (Static145.anIntArray290 == null) {
			super.anInt6130 = Static206.anIntArray393[Static378.method5608(arg0.method2767()) & 0xFFFF];
		} else {
			super.anInt6130 = Static145.anIntArray290[arg0.method2767()];
		}
		@Pc(167) int local167 = arg0.method2739();
		this.anInt6134 = local167 & 0x1F;
		this.anInt6135 = (local167 & 0xE0) << 3;
		if (this.anInt6134 != 31) {
			this.method5447();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZB)V")
	public void method5442(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(53) int local53;
		if (arg1) {
			local53 = 2048;
		} else {
			@Pc(19) int local19 = arg0 * this.anInt6133 / 50 + this.anInt6135 & 0x7FF;
			@Pc(22) int local22 = this.anInt6142;
			if (local22 == 1) {
				local53 = (Class226.anIntArray614[local19 << 3] >> 5) + 1024;
			} else if (local22 == 3) {
				local53 = Static343.anIntArray628[local19] >> 1;
			} else if (local22 == 4) {
				local53 = local19 >> 10 << 11;
			} else if (local22 == 2) {
				local53 = local19;
			} else if (local22 == 5) {
				local53 = (local19 >= 1024 ? 2048 - local19 : local19) << 1;
			} else {
				local53 = 2048;
			}
		}
		super.aFloat69 = (float) (this.anInt6144 + (this.anInt6132 * local53 >> 11)) / 2048.0F;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBIII)V")
	public void method5445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6142 = arg3;
		this.anInt6144 = arg1;
		this.anInt6132 = arg0;
		this.anInt6133 = arg2;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
	private void method5447() {
		@Pc(8) int local8 = this.anInt6134;
		if (local8 == 2) {
			this.anInt6144 = 0;
			this.anInt6132 = 2048;
			this.anInt6133 = 2048;
			this.anInt6142 = 1;
		} else if (local8 == 3) {
			this.anInt6132 = 2048;
			this.anInt6142 = 1;
			this.anInt6133 = 4096;
			this.anInt6144 = 0;
		} else if (local8 == 4) {
			this.anInt6133 = 2048;
			this.anInt6142 = 4;
			this.anInt6132 = 2048;
			this.anInt6144 = 0;
		} else if (local8 == 5) {
			this.anInt6144 = 0;
			this.anInt6142 = 4;
			this.anInt6132 = 2048;
			this.anInt6133 = 8192;
		} else if (local8 == 12) {
			this.anInt6144 = 0;
			this.anInt6132 = 2048;
			this.anInt6142 = 2;
			this.anInt6133 = 2048;
		} else if (local8 == 13) {
			this.anInt6133 = 8192;
			this.anInt6132 = 2048;
			this.anInt6142 = 2;
			this.anInt6144 = 0;
		} else if (local8 == 10) {
			this.anInt6132 = 512;
			this.anInt6133 = 2048;
			this.anInt6142 = 3;
			this.anInt6144 = 1536;
		} else if (local8 == 11) {
			this.anInt6142 = 3;
			this.anInt6132 = 512;
			this.anInt6133 = 4096;
			this.anInt6144 = 1536;
		} else if (local8 == 6) {
			this.anInt6144 = 1280;
			this.anInt6142 = 3;
			this.anInt6132 = 768;
			this.anInt6133 = 2048;
		} else if (local8 == 7) {
			this.anInt6133 = 4096;
			this.anInt6144 = 1280;
			this.anInt6132 = 768;
			this.anInt6142 = 3;
		} else if (local8 == 8) {
			this.anInt6142 = 3;
			this.anInt6132 = 1024;
			this.anInt6133 = 2048;
			this.anInt6144 = 1024;
		} else if (local8 == 9) {
			this.anInt6144 = 1024;
			this.anInt6133 = 4096;
			this.anInt6132 = 1024;
			this.anInt6142 = 3;
		} else if (local8 == 14) {
			this.anInt6144 = 1280;
			this.anInt6132 = 768;
			this.anInt6133 = 2048;
			this.anInt6142 = 1;
		} else if (local8 == 15) {
			this.anInt6142 = 1;
			this.anInt6133 = 4096;
			this.anInt6144 = 1536;
			this.anInt6132 = 512;
		} else if (local8 == 16) {
			this.anInt6133 = 8192;
			this.anInt6132 = 256;
			this.anInt6142 = 1;
			this.anInt6144 = 1792;
		} else {
			this.anInt6144 = 0;
			this.anInt6142 = 0;
			this.anInt6133 = 2048;
			this.anInt6132 = 2048;
		}
	}
}
