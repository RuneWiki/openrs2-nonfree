import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class156 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public int anInt4977;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Z")
	public boolean aBoolean328;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "F")
	public float aFloat52;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	private int anInt4983;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Z")
	public boolean aBoolean329;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public int anInt4984;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private int anInt4985;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public int anInt4986;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	private int anInt4987;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	private int anInt4988;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	public int anInt4991;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Lclient!vb;")
	public Class183 aClass183_1;

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
	private int anInt4992;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
	public int anInt4993;

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
	public int anInt4994;

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
	public int anInt4995;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "[F")
	public float[] aFloatArray18 = new float[4];

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Z")
	public boolean aBoolean330 = false;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!oe;)V")
	public Class156(@OriginalArg(0) Class2_Sub16 arg0) {
		if (Static98.anIntArray205 == null) {
			Static87.method1550();
		}
		this.anInt4993 = arg0.method2146();
		this.aBoolean328 = (this.anInt4993 & 0x10) != 0;
		this.aBoolean329 = (this.anInt4993 & 0x8) != 0;
		this.anInt4993 &= 0x7;
		this.anInt4995 = arg0.method2130();
		this.anInt4984 = arg0.method2130();
		this.anInt4986 = arg0.method2130();
		this.anInt4977 = arg0.method2146();
		this.method3986();
		this.aShortArray68 = new short[this.anInt4977 * 2 + 1];
		@Pc(82) int local82;
		for (local82 = 0; local82 < this.aShortArray68.length; local82++) {
			this.aShortArray68[local82] = (short) arg0.method2130();
		}
		this.anInt4994 = Static1.anIntArray2[arg0.method2130()];
		local82 = arg0.method2146();
		this.anInt4988 = (local82 & 0xE0) << 3;
		this.anInt4991 = local82 & 0x1F;
		if (this.anInt4991 != 31) {
			this.method3989();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	private void method3986() {
		@Pc(15) int local15 = (this.anInt4977 << 7) + 64;
		this.aFloat52 = 1.0F / (float) (local15 * local15);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZII)V")
	public void method3987(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.anInt4988 + arg1 * this.anInt4992 / 50 & 0x7FF;
		@Pc(20) int local20 = this.anInt4985;
		@Pc(50) int local50;
		if (local20 == 1) {
			local50 = (Class1.anIntArray4[local17] >> 6) + 1024;
		} else if (local20 == 3) {
			local50 = Static98.anIntArray205[local17] >> 1;
		} else if (local20 == 4) {
			local50 = local17 >> 10 << 11;
		} else if (local20 == 2) {
			local50 = local17;
		} else if (local20 == 5) {
			local50 = (local17 < 1024 ? local17 : 2048 - local17) << 1;
		} else {
			local50 = 2048;
		}
		if (arg0) {
			local50 = 2048;
		}
		this.aFloat53 = (float) ((this.anInt4987 * local50 >> 11) + this.anInt4983) / 2048.0F;
		@Pc(112) float local112 = this.aFloat53 / 255.0F;
		this.aFloatArray18[0] = local112 * (float) (this.anInt4994 >> 16 & 0xFF);
		this.aFloatArray18[2] = local112 * (float) (this.anInt4994 & 0xFF);
		this.aFloatArray18[1] = (float) (this.anInt4994 >> 8 & 0xFF) * local112;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
	public void method3988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4992 = arg0;
		this.anInt4985 = arg1;
		this.anInt4983 = arg2;
		this.anInt4987 = arg3;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	private void method3989() {
		@Pc(4) int local4 = this.anInt4991;
		if (local4 == 2) {
			this.anInt4992 = 2048;
			this.anInt4987 = 2048;
			this.anInt4983 = 0;
			this.anInt4985 = 1;
		} else if (local4 == 3) {
			this.anInt4992 = 4096;
			this.anInt4983 = 0;
			this.anInt4987 = 2048;
			this.anInt4985 = 1;
		} else if (local4 == 4) {
			this.anInt4985 = 4;
			this.anInt4987 = 2048;
			this.anInt4983 = 0;
			this.anInt4992 = 2048;
		} else if (local4 == 5) {
			this.anInt4983 = 0;
			this.anInt4992 = 8192;
			this.anInt4987 = 2048;
			this.anInt4985 = 4;
		} else if (local4 == 12) {
			this.anInt4985 = 2;
			this.anInt4983 = 0;
			this.anInt4992 = 2048;
			this.anInt4987 = 2048;
		} else if (local4 == 13) {
			this.anInt4992 = 8192;
			this.anInt4985 = 2;
			this.anInt4983 = 0;
			this.anInt4987 = 2048;
		} else if (local4 == 10) {
			this.anInt4992 = 2048;
			this.anInt4983 = 1536;
			this.anInt4985 = 3;
			this.anInt4987 = 512;
		} else if (local4 == 11) {
			this.anInt4987 = 512;
			this.anInt4992 = 4096;
			this.anInt4983 = 1536;
			this.anInt4985 = 3;
		} else if (local4 == 6) {
			this.anInt4992 = 2048;
			this.anInt4983 = 1280;
			this.anInt4985 = 3;
			this.anInt4987 = 768;
		} else if (local4 == 7) {
			this.anInt4985 = 3;
			this.anInt4983 = 1280;
			this.anInt4987 = 768;
			this.anInt4992 = 4096;
		} else if (local4 == 8) {
			this.anInt4992 = 2048;
			this.anInt4985 = 3;
			this.anInt4983 = 1024;
			this.anInt4987 = 1024;
		} else if (local4 == 9) {
			this.anInt4987 = 1024;
			this.anInt4992 = 4096;
			this.anInt4983 = 1024;
			this.anInt4985 = 3;
		} else if (local4 == 14) {
			this.anInt4985 = 1;
			this.anInt4992 = 2048;
			this.anInt4987 = 768;
			this.anInt4983 = 1280;
		} else if (local4 == 15) {
			this.anInt4992 = 4096;
			this.anInt4987 = 512;
			this.anInt4983 = 1536;
			this.anInt4985 = 1;
		} else if (local4 == 16) {
			this.anInt4985 = 1;
			this.anInt4987 = 256;
			this.anInt4983 = 1792;
			this.anInt4992 = 8192;
		} else {
			this.anInt4983 = 0;
			this.anInt4992 = 2048;
			this.anInt4987 = 2048;
			this.anInt4985 = 0;
		}
	}
}
