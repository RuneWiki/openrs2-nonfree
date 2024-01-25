import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class97 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public int anInt2937;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	private int anInt2938;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!rh;")
	public Class12_Sub7 aClass12_Sub7_1;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	private int anInt2941;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
	public boolean aBoolean239;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	private int anInt2942;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	public int anInt2943;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	private int anInt2944;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Z")
	public boolean aBoolean240;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	private int anInt2948;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	private Class97() {
		if (Static304.anIntArray414 == null) {
			Static461.method6916();
		}
		this.method2690();
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!qa;Lclient!daa;I)V")
	public Class97(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class12_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (Static304.anIntArray414 == null) {
			Static461.method6916();
		}
		this.anInt2937 = arg1.method5216();
		this.aBoolean239 = (this.anInt2937 & 0x8) != 0;
		this.aBoolean240 = (this.anInt2937 & 0x10) != 0;
		this.anInt2937 &= 0x7;
		@Pc(47) int local47 = arg1.method5199() << arg2;
		@Pc(53) int local53 = arg1.method5199() << arg2;
		@Pc(59) int local59 = arg1.method5199() << arg2;
		@Pc(63) int local63 = arg1.method5216();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray43 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray43.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method5199();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			if (local90 > local69 - local86) {
				local90 = local69 - local86;
			}
			this.aShortArray43[local75] = (short) (local86 << 8 | local90);
		}
		local63 = Static225.anInt4810 + (local63 << Static193.anInt4311);
		@Pc(152) int local152 = Static141.anIntArray234 == null ? Static69.anIntArray673[Static514.method1477(arg1.method5199()) & 0xFFFF] : Static141.anIntArray234[arg1.method5199()];
		local86 = arg1.method5216();
		this.anInt2938 = (local86 & 0xE0) << 3;
		this.anInt2943 = local86 & 0x1F;
		if (this.anInt2943 != 31) {
			this.method2690();
		}
		this.method2689(local152, local53, local63, local59, arg0, local47);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIILclient!qa;I)V")
	private void method2689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class42 arg4, @OriginalArg(6) int arg5) {
		this.aClass12_Sub7_1 = arg4.method5831(arg5, arg3, arg1, arg2, arg0, 1.0F);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	private void method2690() {
		@Pc(12) int local12 = this.anInt2943;
		if (local12 == 2) {
			this.anInt2942 = 2048;
			this.anInt2948 = 1;
			this.anInt2944 = 2048;
			this.anInt2941 = 0;
		} else if (local12 == 3) {
			this.anInt2948 = 1;
			this.anInt2941 = 0;
			this.anInt2944 = 2048;
			this.anInt2942 = 4096;
		} else if (local12 == 4) {
			this.anInt2948 = 4;
			this.anInt2941 = 0;
			this.anInt2942 = 2048;
			this.anInt2944 = 2048;
		} else if (local12 == 5) {
			this.anInt2942 = 8192;
			this.anInt2941 = 0;
			this.anInt2948 = 4;
			this.anInt2944 = 2048;
		} else if (local12 == 12) {
			this.anInt2942 = 2048;
			this.anInt2941 = 0;
			this.anInt2948 = 2;
			this.anInt2944 = 2048;
		} else if (local12 == 13) {
			this.anInt2941 = 0;
			this.anInt2948 = 2;
			this.anInt2942 = 8192;
			this.anInt2944 = 2048;
		} else if (local12 == 10) {
			this.anInt2942 = 2048;
			this.anInt2941 = 1536;
			this.anInt2948 = 3;
			this.anInt2944 = 512;
		} else if (local12 == 11) {
			this.anInt2941 = 1536;
			this.anInt2948 = 3;
			this.anInt2944 = 512;
			this.anInt2942 = 4096;
		} else if (local12 == 6) {
			this.anInt2944 = 768;
			this.anInt2941 = 1280;
			this.anInt2948 = 3;
			this.anInt2942 = 2048;
		} else if (local12 == 7) {
			this.anInt2942 = 4096;
			this.anInt2948 = 3;
			this.anInt2941 = 1280;
			this.anInt2944 = 768;
		} else if (local12 == 8) {
			this.anInt2941 = 1024;
			this.anInt2944 = 1024;
			this.anInt2948 = 3;
			this.anInt2942 = 2048;
		} else if (local12 == 9) {
			this.anInt2944 = 1024;
			this.anInt2941 = 1024;
			this.anInt2942 = 4096;
			this.anInt2948 = 3;
		} else if (local12 == 14) {
			this.anInt2948 = 1;
			this.anInt2942 = 2048;
			this.anInt2941 = 1280;
			this.anInt2944 = 768;
		} else if (local12 == 15) {
			this.anInt2948 = 1;
			this.anInt2941 = 1536;
			this.anInt2942 = 4096;
			this.anInt2944 = 512;
		} else if (local12 == 16) {
			this.anInt2948 = 1;
			this.anInt2941 = 1792;
			this.anInt2942 = 8192;
			this.anInt2944 = 256;
		} else {
			this.anInt2942 = 2048;
			this.anInt2948 = 0;
			this.anInt2944 = 2048;
			this.anInt2941 = 0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIB)V")
	public void method2692(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(59) int local59;
		if (arg0) {
			local59 = 2048;
		} else {
			@Pc(25) int local25 = arg1 * this.anInt2942 / 50 + this.anInt2938 & 0x7FF;
			@Pc(28) int local28 = this.anInt2948;
			if (local28 == 1) {
				local59 = (Class12_Sub1_Sub36.anIntArray667[local25 << 3] >> 5) + 1024;
			} else if (local28 == 3) {
				local59 = Static304.anIntArray414[local25] >> 1;
			} else if (local28 == 4) {
				local59 = local25 >> 10 << 11;
			} else if (local28 == 2) {
				local59 = local25;
			} else if (local28 == 5) {
				local59 = (local25 >= 1024 ? 2048 - local25 : local25) << 1;
			} else {
				local59 = 2048;
			}
		}
		this.aClass12_Sub7_1.method5121((float) ((local59 * this.anInt2944 >> 11) + this.anInt2941) / 2048.0F);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public void method2694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2948 = arg2;
		this.anInt2942 = arg3;
		this.anInt2941 = arg0;
		this.anInt2944 = arg1;
	}
}
