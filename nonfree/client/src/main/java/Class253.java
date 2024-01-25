import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class253 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	public int anInt7485;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	private int anInt7486;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	public int anInt7491;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
	private int anInt7492;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "I")
	private int anInt7495;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "Lclient!tj;")
	public Class1_Sub12 aClass1_Sub12_2;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "Z")
	public boolean aBoolean639;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	private int anInt7498;

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
	private int anInt7499;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	private Class253() {
		if (Static167.anIntArray228 == null) {
			Static202.method3109();
		}
		this.method5777();
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!qa;Lclient!ti;I)V")
	public Class253(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class1_Sub14 arg1, @OriginalArg(2) int arg2) {
		if (Static167.anIntArray228 == null) {
			Static202.method3109();
		}
		this.anInt7485 = arg1.method4548();
		this.aBoolean639 = (this.anInt7485 & 0x10) != 0;
		this.aBoolean638 = (this.anInt7485 & 0x8) != 0;
		this.anInt7485 &= 0x7;
		@Pc(47) int local47 = arg1.method4498() << arg2;
		@Pc(53) int local53 = arg1.method4498() << arg2;
		@Pc(59) int local59 = arg1.method4498() << arg2;
		@Pc(63) int local63 = arg1.method4548();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray115 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray115.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method4498();
			local86 = local82 >>> 8;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			@Pc(101) int local101 = local82 & 0xFF;
			if (local69 - local86 < local101) {
				local101 = local69 - local86;
			}
			this.aShortArray115[local75] = (short) (local101 | local86 << 8);
		}
		local63 = (local63 << Static58.anInt1051) + Static86.anInt1530;
		@Pc(156) int local156 = Static302.anIntArray386 == null ? Static95.anIntArray92[Static245.method3555(arg1.method4498()) & 0xFFFF] : Static302.anIntArray386[arg1.method4498()];
		local86 = arg1.method4548();
		this.anInt7491 = local86 & 0x1F;
		this.anInt7499 = (local86 & 0xE0) << 3;
		if (this.anInt7491 != 31) {
			this.method5777();
		}
		this.method5774(arg0, local53, local47, local156, local59, local63);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIBII)V")
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7495 = arg0;
		this.anInt7498 = arg1;
		this.anInt7492 = arg2;
		this.anInt7486 = arg3;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IZI)V")
	public void method5772(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(59) int local59;
		if (arg0) {
			local59 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt7499 + this.anInt7492 * arg1 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt7486;
			if (local26 == 1) {
				local59 = (Class262.anIntArray575[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local59 = Static167.anIntArray228[local23] >> 1;
			} else if (local26 == 4) {
				local59 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local59 = local23;
			} else if (local26 == 5) {
				local59 = (local23 >= 1024 ? 2048 - local23 : local23) << 1;
			} else {
				local59 = 2048;
			}
		}
		this.aClass1_Sub12_2.method3179((float) (this.anInt7495 + (this.anInt7498 * local59 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!qa;IBIIII)V")
	private void method5774(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub12_2 = arg0.method4641(arg2, arg4, arg1, arg5, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V")
	private void method5777() {
		@Pc(8) int local8 = this.anInt7491;
		if (local8 == 2) {
			this.anInt7492 = 2048;
			this.anInt7498 = 2048;
			this.anInt7495 = 0;
			this.anInt7486 = 1;
		} else if (local8 == 3) {
			this.anInt7486 = 1;
			this.anInt7492 = 4096;
			this.anInt7498 = 2048;
			this.anInt7495 = 0;
		} else if (local8 == 4) {
			this.anInt7492 = 2048;
			this.anInt7486 = 4;
			this.anInt7498 = 2048;
			this.anInt7495 = 0;
		} else if (local8 == 5) {
			this.anInt7495 = 0;
			this.anInt7492 = 8192;
			this.anInt7498 = 2048;
			this.anInt7486 = 4;
		} else if (local8 == 12) {
			this.anInt7486 = 2;
			this.anInt7492 = 2048;
			this.anInt7498 = 2048;
			this.anInt7495 = 0;
		} else if (local8 == 13) {
			this.anInt7486 = 2;
			this.anInt7492 = 8192;
			this.anInt7498 = 2048;
			this.anInt7495 = 0;
		} else if (local8 == 10) {
			this.anInt7495 = 1536;
			this.anInt7498 = 512;
			this.anInt7486 = 3;
			this.anInt7492 = 2048;
		} else if (local8 == 11) {
			this.anInt7498 = 512;
			this.anInt7495 = 1536;
			this.anInt7492 = 4096;
			this.anInt7486 = 3;
		} else if (local8 == 6) {
			this.anInt7492 = 2048;
			this.anInt7495 = 1280;
			this.anInt7486 = 3;
			this.anInt7498 = 768;
		} else if (local8 == 7) {
			this.anInt7492 = 4096;
			this.anInt7486 = 3;
			this.anInt7495 = 1280;
			this.anInt7498 = 768;
		} else if (local8 == 8) {
			this.anInt7492 = 2048;
			this.anInt7486 = 3;
			this.anInt7495 = 1024;
			this.anInt7498 = 1024;
		} else if (local8 == 9) {
			this.anInt7495 = 1024;
			this.anInt7486 = 3;
			this.anInt7492 = 4096;
			this.anInt7498 = 1024;
		} else if (local8 == 14) {
			this.anInt7498 = 768;
			this.anInt7492 = 2048;
			this.anInt7486 = 1;
			this.anInt7495 = 1280;
		} else if (local8 == 15) {
			this.anInt7486 = 1;
			this.anInt7498 = 512;
			this.anInt7492 = 4096;
			this.anInt7495 = 1536;
		} else if (local8 == 16) {
			this.anInt7492 = 8192;
			this.anInt7495 = 1792;
			this.anInt7498 = 256;
			this.anInt7486 = 1;
		} else {
			this.anInt7495 = 0;
			this.anInt7492 = 2048;
			this.anInt7486 = 0;
			this.anInt7498 = 2048;
		}
	}
}
