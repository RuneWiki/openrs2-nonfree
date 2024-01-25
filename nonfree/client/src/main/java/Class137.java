import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class137 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	private int anInt3850;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
	private int anInt3852;

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public int anInt3853;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	private int anInt3855;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
	private int anInt3857;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	private int anInt3859;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "Lclient!bn;")
	public Class1_Sub7 aClass1_Sub7_2;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "Z")
	public boolean aBoolean447;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	private Class137() {
		if (Static337.anIntArray393 == null) {
			Static183.method2651();
		}
		this.method3147();
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!za;Lclient!ug;I)V")
	public Class137(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class1_Sub28 arg1, @OriginalArg(2) int arg2) {
		if (Static337.anIntArray393 == null) {
			Static183.method2651();
		}
		this.anInt3864 = arg1.method5337();
		this.aBoolean447 = (this.anInt3864 & 0x8) != 0;
		this.aBoolean446 = (this.anInt3864 & 0x10) != 0;
		this.anInt3864 &= 0x7;
		@Pc(50) int local50 = arg1.method5335() << arg2;
		@Pc(56) int local56 = arg1.method5335() << arg2;
		@Pc(62) int local62 = arg1.method5335() << arg2;
		@Pc(66) int local66 = arg1.method5337();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray61 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray61.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method5335();
			local89 = local85 >>> 8;
			if (local72 <= local89) {
				local89 = local72 - 1;
			}
			@Pc(100) int local100 = local85 & 0xFF;
			if (local72 - local89 < local100) {
				local100 = local72 - local89;
			}
			this.aShortArray61[local78] = (short) (local100 | local89 << 8);
		}
		local66 = Static341.anInt5832 + (local66 << Static215.anInt4460);
		@Pc(159) int local159 = Static160.anIntArray183 == null ? Static134.anIntArray161[Static140.method2138(arg1.method5335()) & 0xFFFF] : Static160.anIntArray183[arg1.method5335()];
		local89 = arg1.method5337();
		this.anInt3857 = (local89 & 0xE0) << 3;
		this.anInt3853 = local89 & 0x1F;
		if (this.anInt3853 != 31) {
			this.method3147();
		}
		this.method3152(local159, local56, arg0, local62, local66, local50);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	private void method3147() {
		@Pc(4) int local4 = this.anInt3853;
		if (local4 == 2) {
			this.anInt3859 = 2048;
			this.anInt3852 = 2048;
			this.anInt3850 = 1;
			this.anInt3855 = 0;
		} else if (local4 == 3) {
			this.anInt3855 = 0;
			this.anInt3850 = 1;
			this.anInt3859 = 4096;
			this.anInt3852 = 2048;
		} else if (local4 == 4) {
			this.anInt3852 = 2048;
			this.anInt3859 = 2048;
			this.anInt3855 = 0;
			this.anInt3850 = 4;
		} else if (local4 == 5) {
			this.anInt3859 = 8192;
			this.anInt3852 = 2048;
			this.anInt3855 = 0;
			this.anInt3850 = 4;
		} else if (local4 == 12) {
			this.anInt3852 = 2048;
			this.anInt3855 = 0;
			this.anInt3859 = 2048;
			this.anInt3850 = 2;
		} else if (local4 == 13) {
			this.anInt3850 = 2;
			this.anInt3855 = 0;
			this.anInt3859 = 8192;
			this.anInt3852 = 2048;
		} else if (local4 == 10) {
			this.anInt3855 = 1536;
			this.anInt3850 = 3;
			this.anInt3852 = 512;
			this.anInt3859 = 2048;
		} else if (local4 == 11) {
			this.anInt3855 = 1536;
			this.anInt3850 = 3;
			this.anInt3852 = 512;
			this.anInt3859 = 4096;
		} else if (local4 == 6) {
			this.anInt3855 = 1280;
			this.anInt3852 = 768;
			this.anInt3850 = 3;
			this.anInt3859 = 2048;
		} else if (local4 == 7) {
			this.anInt3855 = 1280;
			this.anInt3852 = 768;
			this.anInt3850 = 3;
			this.anInt3859 = 4096;
		} else if (local4 == 8) {
			this.anInt3852 = 1024;
			this.anInt3859 = 2048;
			this.anInt3855 = 1024;
			this.anInt3850 = 3;
		} else if (local4 == 9) {
			this.anInt3855 = 1024;
			this.anInt3859 = 4096;
			this.anInt3850 = 3;
			this.anInt3852 = 1024;
		} else if (local4 == 14) {
			this.anInt3852 = 768;
			this.anInt3859 = 2048;
			this.anInt3850 = 1;
			this.anInt3855 = 1280;
		} else if (local4 == 15) {
			this.anInt3850 = 1;
			this.anInt3855 = 1536;
			this.anInt3859 = 4096;
			this.anInt3852 = 512;
		} else if (local4 == 16) {
			this.anInt3852 = 256;
			this.anInt3850 = 1;
			this.anInt3859 = 8192;
			this.anInt3855 = 1792;
		} else {
			this.anInt3859 = 2048;
			this.anInt3850 = 0;
			this.anInt3852 = 2048;
			this.anInt3855 = 0;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V")
	public void method3148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3859 = arg0;
		this.anInt3855 = arg2;
		this.anInt3852 = arg3;
		this.anInt3850 = arg1;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIZ)V")
	public void method3151(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(54) int local54;
		if (arg1) {
			local54 = 2048;
		} else {
			@Pc(19) int local19 = this.anInt3859 * arg0 / 50 + this.anInt3857 & 0x7FF;
			@Pc(22) int local22 = this.anInt3850;
			if (local22 == 1) {
				local54 = (Class1_Sub4_Sub8_Sub1.anIntArray50[local19 << 3] >> 5) + 1024;
			} else if (local22 == 3) {
				local54 = Static337.anIntArray393[local19] >> 1;
			} else if (local22 == 4) {
				local54 = local19 >> 10 << 11;
			} else if (local22 == 2) {
				local54 = local19;
			} else if (local22 == 5) {
				local54 = (local19 < 1024 ? local19 : 2048 - local19) << 1;
			} else {
				local54 = 2048;
			}
		}
		this.aClass1_Sub7_2.method5116((float) ((this.anInt3852 * local54 >> 11) + this.anInt3855) / 2048.0F);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILclient!za;III)V")
	private void method3152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub7_2 = arg2.method5759(arg5, arg3, arg1, arg4, arg0, 1.0F);
	}
}
