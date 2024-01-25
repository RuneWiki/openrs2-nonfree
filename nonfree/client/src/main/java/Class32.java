import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class32 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
	public static final int[] anIntArray124 = new int[32];

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "[S")
	public short[] aShortArray20;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
	public int anInt781;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "Lclient!pv;")
	public Class4_Sub32 aClass4_Sub32_2;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
	private int anInt785;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
	private int anInt787;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
	private int anInt788;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
	private int anInt792;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "Z")
	public boolean aBoolean67;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "Z")
	public boolean aBoolean68;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray124[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	private Class32() {
		if (Static429.anIntArray606 == null) {
			Static365.method5506();
		}
		this.method691();
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!oa;Lclient!eh;I)V")
	public Class32(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (Static429.anIntArray606 == null) {
			Static365.method5506();
		}
		this.anInt781 = arg1.method6015();
		this.aBoolean67 = (this.anInt781 & 0x10) != 0;
		this.aBoolean68 = (this.anInt781 & 0x8) != 0;
		this.anInt781 &= 0x7;
		@Pc(50) int local50 = arg1.method5982() << arg2;
		@Pc(56) int local56 = arg1.method5982() << arg2;
		@Pc(62) int local62 = arg1.method5982() << arg2;
		@Pc(66) int local66 = arg1.method6015();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray20 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray20.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method5982();
			local89 = local85 >>> 8;
			if (local72 <= local89) {
				local89 = local72 - 1;
			}
			@Pc(104) int local104 = local85 & 0xFF;
			if (local104 > local72 - local89) {
				local104 = local72 - local89;
			}
			this.aShortArray20[local78] = (short) (local104 | local89 << 8);
		}
		local66 = (local66 << Static41.anInt810) + Static436.anInt7494;
		@Pc(154) int local154 = Static170.anIntArray696 == null ? Static18.anIntArray203[Static206.method3645(arg1.method5982()) & 0xFFFF] : Static170.anIntArray696[arg1.method5982()];
		local89 = arg1.method6015();
		this.anInt779 = local89 & 0x1F;
		this.anInt787 = (local89 & 0xE0) << 3;
		if (this.anInt779 != 31) {
			this.method691();
		}
		this.method690(arg0, local154, local50, local66, local62, local56);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIII)V")
	public void method689(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt785 = arg0;
		this.anInt790 = arg1;
		this.anInt788 = arg3;
		this.anInt792 = arg2;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!oa;IIIIII)V")
	private void method690(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass4_Sub32_2 = arg0.method6791(arg2, arg4, arg5, arg3, arg1, (float) 1);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	private void method691() {
		@Pc(8) int local8 = this.anInt779;
		if (local8 == 2) {
			this.anInt792 = 0;
			this.anInt790 = 1;
			this.anInt785 = 2048;
			this.anInt788 = 2048;
		} else if (local8 == 3) {
			this.anInt785 = 4096;
			this.anInt792 = 0;
			this.anInt790 = 1;
			this.anInt788 = 2048;
		} else if (local8 == 4) {
			this.anInt788 = 2048;
			this.anInt790 = 4;
			this.anInt792 = 0;
			this.anInt785 = 2048;
		} else if (local8 == 5) {
			this.anInt788 = 2048;
			this.anInt790 = 4;
			this.anInt785 = 8192;
			this.anInt792 = 0;
		} else if (local8 == 12) {
			this.anInt790 = 2;
			this.anInt792 = 0;
			this.anInt788 = 2048;
			this.anInt785 = 2048;
		} else if (local8 == 13) {
			this.anInt785 = 8192;
			this.anInt788 = 2048;
			this.anInt792 = 0;
			this.anInt790 = 2;
		} else if (local8 == 10) {
			this.anInt785 = 2048;
			this.anInt792 = 1536;
			this.anInt788 = 512;
			this.anInt790 = 3;
		} else if (local8 == 11) {
			this.anInt788 = 512;
			this.anInt785 = 4096;
			this.anInt790 = 3;
			this.anInt792 = 1536;
		} else if (local8 == 6) {
			this.anInt785 = 2048;
			this.anInt792 = 1280;
			this.anInt790 = 3;
			this.anInt788 = 768;
		} else if (local8 == 7) {
			this.anInt788 = 768;
			this.anInt790 = 3;
			this.anInt792 = 1280;
			this.anInt785 = 4096;
		} else if (local8 == 8) {
			this.anInt785 = 2048;
			this.anInt788 = 1024;
			this.anInt792 = 1024;
			this.anInt790 = 3;
		} else if (local8 == 9) {
			this.anInt790 = 3;
			this.anInt788 = 1024;
			this.anInt785 = 4096;
			this.anInt792 = 1024;
		} else if (local8 == 14) {
			this.anInt788 = 768;
			this.anInt790 = 1;
			this.anInt792 = 1280;
			this.anInt785 = 2048;
		} else if (local8 == 15) {
			this.anInt790 = 1;
			this.anInt792 = 1536;
			this.anInt785 = 4096;
			this.anInt788 = 512;
		} else if (local8 == 16) {
			this.anInt790 = 1;
			this.anInt792 = 1792;
			this.anInt785 = 8192;
			this.anInt788 = 256;
		} else {
			this.anInt792 = 0;
			this.anInt785 = 2048;
			this.anInt790 = 0;
			this.anInt788 = 2048;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZI)V")
	public void method693(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(59) int local59;
		if (arg1) {
			local59 = 2048;
		} else {
			@Pc(25) int local25 = this.anInt787 + this.anInt785 * arg0 / 50 & 0x7FF;
			@Pc(28) int local28 = this.anInt790;
			if (local28 == 1) {
				local59 = (Class4_Sub11.anIntArray148[local25 << 3] >> 4) + 1024;
			} else if (local28 == 3) {
				local59 = Static429.anIntArray606[local25] >> 1;
			} else if (local28 == 4) {
				local59 = local25 >> 10 << 11;
			} else if (local28 == 2) {
				local59 = local25;
			} else if (local28 == 5) {
				local59 = (local25 < 1024 ? local25 : 2048 - local25) << 1;
			} else {
				local59 = 2048;
			}
		}
		this.aClass4_Sub32_2.method6624((float) (this.anInt792 + (this.anInt788 * local59 >> 11)) / 2048.0F);
	}
}
