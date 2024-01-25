import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class1_Sub27_Sub1 extends Class1_Sub27 {

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
	public int anInt3877;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
	private int anInt3878;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	private int anInt3880;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	public int anInt3881;

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
	private int anInt3883;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	private int anInt3885;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
	private int anInt3888;

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "Z")
	public boolean aBoolean383;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	private Class1_Sub27_Sub1() {
		if (Static50.anIntArray137 == null) {
			Static311.method4632();
		}
		this.method3206();
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class1_Sub27_Sub1(@OriginalArg(0) Class1_Sub33 arg0) {
		if (Static50.anIntArray137 == null) {
			Static311.method4632();
		}
		this.anInt3881 = arg0.method5174();
		this.aBoolean383 = (this.anInt3881 & 0x8) != 0;
		this.aBoolean382 = (this.anInt3881 & 0x10) != 0;
		this.anInt3881 &= 0x7;
		super.anInt3874 = arg0.method5177();
		super.anInt3873 = arg0.method5177();
		super.anInt3876 = arg0.method5177();
		super.anInt3868 = arg0.method5174();
		@Pc(71) int local71 = super.anInt3868 * 2 + 1;
		this.aShortArray92 = new short[local71];
		for (@Pc(77) int local77 = 0; local77 < this.aShortArray92.length; local77++) {
			@Pc(84) short local84 = (short) arg0.method5177();
			@Pc(88) int local88 = local84 >>> 8;
			if (local71 <= local88) {
				local88 = local71 - 1;
			}
			@Pc(99) int local99 = local84 & 0xFF;
			if (local71 - local88 < local99) {
				local99 = local71 - local88;
			}
			this.aShortArray92[local77] = (short) (local99 | local88 << 8);
		}
		super.anInt3868 = Static276.anInt5131 + (super.anInt3868 << Static365.anInt5876);
		if (Static325.anIntArray638 == null) {
			super.anInt3869 = Static68.anIntArray184[Static142.method2166(arg0.method5177()) & 0xFFFF];
		} else {
			super.anInt3869 = Static325.anIntArray638[arg0.method5177()];
		}
		@Pc(160) int local160 = arg0.method5174();
		this.anInt3877 = local160 & 0x1F;
		this.anInt3883 = (local160 & 0xE0) << 3;
		if (this.anInt3877 != 31) {
			this.method3206();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBZ)V")
	public void method3201(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(57) int local57;
		if (arg1) {
			local57 = 2048;
		} else {
			@Pc(19) int local19 = this.anInt3880 * arg0 / 50 + this.anInt3883 & 0x7FF;
			@Pc(22) int local22 = this.anInt3878;
			if (local22 == 1) {
				local57 = (Class13.anIntArray20[local19 << 3] >> 5) + 1024;
			} else if (local22 == 3) {
				local57 = Static50.anIntArray137[local19] >> 1;
			} else if (local22 == 4) {
				local57 = local19 >> 10 << 11;
			} else if (local22 == 2) {
				local57 = local19;
			} else if (local22 == 5) {
				local57 = (local19 >= 1024 ? 2048 - local19 : local19) << 1;
			} else {
				local57 = 2048;
			}
		}
		super.aFloat25 = (float) ((this.anInt3888 * local57 >> 11) + this.anInt3885) / 2048.0F;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIB)V")
	public void method3204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3888 = arg1;
		this.anInt3885 = arg0;
		this.anInt3880 = arg3;
		this.anInt3878 = arg2;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	private void method3206() {
		@Pc(8) int local8 = this.anInt3877;
		if (local8 == 2) {
			this.anInt3888 = 2048;
			this.anInt3880 = 2048;
			this.anInt3885 = 0;
			this.anInt3878 = 1;
		} else if (local8 == 3) {
			this.anInt3880 = 4096;
			this.anInt3885 = 0;
			this.anInt3878 = 1;
			this.anInt3888 = 2048;
		} else if (local8 == 4) {
			this.anInt3880 = 2048;
			this.anInt3885 = 0;
			this.anInt3878 = 4;
			this.anInt3888 = 2048;
		} else if (local8 == 5) {
			this.anInt3885 = 0;
			this.anInt3878 = 4;
			this.anInt3880 = 8192;
			this.anInt3888 = 2048;
		} else if (local8 == 12) {
			this.anInt3880 = 2048;
			this.anInt3878 = 2;
			this.anInt3885 = 0;
			this.anInt3888 = 2048;
		} else if (local8 == 13) {
			this.anInt3878 = 2;
			this.anInt3880 = 8192;
			this.anInt3888 = 2048;
			this.anInt3885 = 0;
		} else if (local8 == 10) {
			this.anInt3888 = 512;
			this.anInt3878 = 3;
			this.anInt3885 = 1536;
			this.anInt3880 = 2048;
		} else if (local8 == 11) {
			this.anInt3885 = 1536;
			this.anInt3878 = 3;
			this.anInt3880 = 4096;
			this.anInt3888 = 512;
		} else if (local8 == 6) {
			this.anInt3885 = 1280;
			this.anInt3878 = 3;
			this.anInt3880 = 2048;
			this.anInt3888 = 768;
		} else if (local8 == 7) {
			this.anInt3878 = 3;
			this.anInt3888 = 768;
			this.anInt3885 = 1280;
			this.anInt3880 = 4096;
		} else if (local8 == 8) {
			this.anInt3888 = 1024;
			this.anInt3880 = 2048;
			this.anInt3878 = 3;
			this.anInt3885 = 1024;
		} else if (local8 == 9) {
			this.anInt3880 = 4096;
			this.anInt3888 = 1024;
			this.anInt3885 = 1024;
			this.anInt3878 = 3;
		} else if (local8 == 14) {
			this.anInt3885 = 1280;
			this.anInt3880 = 2048;
			this.anInt3878 = 1;
			this.anInt3888 = 768;
		} else if (local8 == 15) {
			this.anInt3878 = 1;
			this.anInt3888 = 512;
			this.anInt3885 = 1536;
			this.anInt3880 = 4096;
		} else if (local8 == 16) {
			this.anInt3888 = 256;
			this.anInt3880 = 8192;
			this.anInt3885 = 1792;
			this.anInt3878 = 1;
		} else {
			this.anInt3888 = 2048;
			this.anInt3885 = 0;
			this.anInt3878 = 0;
			this.anInt3880 = 2048;
		}
	}
}
