import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class103 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
	private int anInt3847;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public int anInt3848;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
	public int anInt3849;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
	private int anInt3852;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
	public int anInt3854;

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
	private int anInt3858;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "F")
	public float aFloat133;

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
	public int anInt3860;

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
	public int anInt3861;

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "F")
	public float aFloat134;

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "Z")
	public boolean aBoolean199;

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "Lclient!wh;")
	public Class178 aClass178_1;

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
	public int anInt3865;

	@OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
	private int anInt3866;

	@OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
	private int anInt3867;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Z")
	public boolean aBoolean197 = false;

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "[F")
	public float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!im;)V")
	public Class103(@OriginalArg(0) Class1_Sub16 arg0) {
		if (Static42.anIntArray115 == null) {
			Static127.method2177();
		}
		this.anInt3848 = arg0.method2655();
		this.aBoolean199 = (this.anInt3848 & 0x8) != 0;
		this.aBoolean198 = (this.anInt3848 & 0x10) != 0;
		this.anInt3848 &= 0x7;
		this.anInt3861 = arg0.method2652();
		this.anInt3854 = arg0.method2652();
		this.anInt3849 = arg0.method2652();
		this.anInt3860 = arg0.method2655();
		this.method3143();
		this.aShortArray62 = new short[this.anInt3860 * 2 + 1];
		@Pc(82) int local82;
		for (local82 = 0; local82 < this.aShortArray62.length; local82++) {
			this.aShortArray62[local82] = (short) arg0.method2652();
		}
		this.anInt3864 = Static151.anIntArray324[arg0.method2652()];
		local82 = arg0.method2655();
		this.anInt3852 = (local82 & 0xE0) << 3;
		this.anInt3865 = local82 & 0x1F;
		if (this.anInt3865 != 31) {
			this.method3141();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
	public void method3139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3847 = arg0;
		this.anInt3858 = arg1;
		this.anInt3867 = arg3;
		this.anInt3866 = arg2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZI)V")
	public void method3140(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(22) int local22 = this.anInt3852 + arg0 * this.anInt3858 / 50 & 0x7FF;
		@Pc(25) int local25 = this.anInt3866;
		@Pc(58) int local58;
		if (local25 == 1) {
			local58 = (Class91.anIntArray319[local22] >> 6) + 1024;
		} else if (local25 == 3) {
			local58 = Static42.anIntArray115[local22] >> 1;
		} else if (local25 == 4) {
			local58 = local22 >> 10 << 11;
		} else if (local25 == 2) {
			local58 = local22;
		} else if (local25 == 5) {
			local58 = (local22 >= 1024 ? 2048 - local22 : local22) << 1;
		} else {
			local58 = 2048;
		}
		if (arg1) {
			local58 = 2048;
		}
		this.aFloat133 = (float) (this.anInt3867 + (this.anInt3847 * local58 >> 11)) / 2048.0F;
		@Pc(120) float local120 = this.aFloat133 / 255.0F;
		this.aFloatArray21[1] = local120 * (float) (this.anInt3864 >> 8 & 0xFF);
		this.aFloatArray21[0] = local120 * (float) (this.anInt3864 >> 16 & 0xFF);
		this.aFloatArray21[2] = (float) (this.anInt3864 & 0xFF) * local120;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V")
	private void method3141() {
		@Pc(12) int local12 = this.anInt3865;
		if (local12 == 2) {
			this.anInt3858 = 2048;
			this.anInt3866 = 1;
			this.anInt3847 = 2048;
			this.anInt3867 = 0;
		} else if (local12 == 3) {
			this.anInt3866 = 1;
			this.anInt3867 = 0;
			this.anInt3858 = 4096;
			this.anInt3847 = 2048;
		} else if (local12 == 4) {
			this.anInt3867 = 0;
			this.anInt3847 = 2048;
			this.anInt3866 = 4;
			this.anInt3858 = 2048;
		} else if (local12 == 5) {
			this.anInt3866 = 4;
			this.anInt3847 = 2048;
			this.anInt3858 = 8192;
			this.anInt3867 = 0;
		} else if (local12 == 12) {
			this.anInt3867 = 0;
			this.anInt3847 = 2048;
			this.anInt3866 = 2;
			this.anInt3858 = 2048;
		} else if (local12 == 13) {
			this.anInt3866 = 2;
			this.anInt3847 = 2048;
			this.anInt3858 = 8192;
			this.anInt3867 = 0;
		} else if (local12 == 10) {
			this.anInt3867 = 1536;
			this.anInt3866 = 3;
			this.anInt3858 = 2048;
			this.anInt3847 = 512;
		} else if (local12 == 11) {
			this.anInt3858 = 4096;
			this.anInt3867 = 1536;
			this.anInt3866 = 3;
			this.anInt3847 = 512;
		} else if (local12 == 6) {
			this.anInt3847 = 768;
			this.anInt3858 = 2048;
			this.anInt3866 = 3;
			this.anInt3867 = 1280;
		} else if (local12 == 7) {
			this.anInt3847 = 768;
			this.anInt3867 = 1280;
			this.anInt3858 = 4096;
			this.anInt3866 = 3;
		} else if (local12 == 8) {
			this.anInt3858 = 2048;
			this.anInt3867 = 1024;
			this.anInt3866 = 3;
			this.anInt3847 = 1024;
		} else if (local12 == 9) {
			this.anInt3847 = 1024;
			this.anInt3867 = 1024;
			this.anInt3866 = 3;
			this.anInt3858 = 4096;
		} else if (local12 == 14) {
			this.anInt3847 = 768;
			this.anInt3867 = 1280;
			this.anInt3858 = 2048;
			this.anInt3866 = 1;
		} else if (local12 == 15) {
			this.anInt3847 = 512;
			this.anInt3866 = 1;
			this.anInt3867 = 1536;
			this.anInt3858 = 4096;
		} else if (local12 == 16) {
			this.anInt3866 = 1;
			this.anInt3858 = 8192;
			this.anInt3847 = 256;
			this.anInt3867 = 1792;
		} else {
			this.anInt3867 = 0;
			this.anInt3858 = 2048;
			this.anInt3866 = 0;
			this.anInt3847 = 2048;
		}
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)V")
	private void method3143() {
		@Pc(14) int local14 = (this.anInt3860 << 7) + 64;
		this.aFloat134 = 1.0F / (float) (local14 * local14);
	}
}
