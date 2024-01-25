import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class225 {

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	private int anInt6410;

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	private int anInt6413;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Lclient!bk;")
	public Class10_Sub4 aClass10_Sub4_1;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	private int anInt6415;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "Z")
	public boolean aBoolean419;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	public int anInt6417;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
	private int anInt6418;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
	private int anInt6420;

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!sm", name = "t", descriptor = "Z")
	public boolean aBoolean420;

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
	public int anInt6422;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	private Class225() {
		if (Static353.anIntArray575 == null) {
			Static204.method3194();
		}
		this.method4983();
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!za;Lclient!nn;I)V")
	public Class225(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class10_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (Static353.anIntArray575 == null) {
			Static204.method3194();
		}
		this.anInt6417 = arg1.method2502();
		this.aBoolean419 = (this.anInt6417 & 0x10) != 0;
		this.aBoolean420 = (this.anInt6417 & 0x8) != 0;
		this.anInt6417 &= 0x7;
		@Pc(47) int local47 = arg1.method2485() << arg2;
		@Pc(53) int local53 = arg1.method2485() << arg2;
		@Pc(59) int local59 = arg1.method2485() << arg2;
		@Pc(63) int local63 = arg1.method2502();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray105 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray105.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method2485();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local90 > local69 - local86) {
				local90 = local69 - local86;
			}
			this.aShortArray105[local75] = (short) (local86 << 8 | local90);
		}
		local63 = (local63 << Static286.anInt5018) + Static437.anInt7214;
		@Pc(150) int local150 = Static451.anIntArray744 == null ? Static261.anIntArray461[Static297.method4134(arg1.method2485()) & 0xFFFF] : Static451.anIntArray744[arg1.method2485()];
		local86 = arg1.method2502();
		this.anInt6422 = local86 & 0x1F;
		this.anInt6418 = (local86 & 0xE0) << 3;
		if (this.anInt6422 != 31) {
			this.method4983();
		}
		this.method4985(local59, local150, local47, local53, local63, arg0);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BIZ)V")
	public void method4982(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(51) int local51;
		if (arg1) {
			local51 = 2048;
		} else {
			@Pc(19) int local19 = this.anInt6418 + arg0 * this.anInt6413 / 50 & 0x7FF;
			@Pc(22) int local22 = this.anInt6415;
			if (local22 == 1) {
				local51 = (Class250.anIntArray675[local19 << 3] >> 5) + 1024;
			} else if (local22 == 3) {
				local51 = Static353.anIntArray575[local19] >> 1;
			} else if (local22 == 4) {
				local51 = local19 >> 10 << 11;
			} else if (local22 == 2) {
				local51 = local19;
			} else if (local22 == 5) {
				local51 = (local19 >= 1024 ? 2048 - local19 : local19) << 1;
			} else {
				local51 = 2048;
			}
		}
		this.aClass10_Sub4_1.method5363((float) ((this.anInt6410 * local51 >> 11) + this.anInt6420) / 2048.0F);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	private void method4983() {
		@Pc(4) int local4 = this.anInt6422;
		if (local4 == 2) {
			this.anInt6413 = 2048;
			this.anInt6420 = 0;
			this.anInt6415 = 1;
			this.anInt6410 = 2048;
		} else if (local4 == 3) {
			this.anInt6413 = 4096;
			this.anInt6420 = 0;
			this.anInt6410 = 2048;
			this.anInt6415 = 1;
		} else if (local4 == 4) {
			this.anInt6413 = 2048;
			this.anInt6420 = 0;
			this.anInt6415 = 4;
			this.anInt6410 = 2048;
		} else if (local4 == 5) {
			this.anInt6413 = 8192;
			this.anInt6420 = 0;
			this.anInt6410 = 2048;
			this.anInt6415 = 4;
		} else if (local4 == 12) {
			this.anInt6410 = 2048;
			this.anInt6420 = 0;
			this.anInt6413 = 2048;
			this.anInt6415 = 2;
		} else if (local4 == 13) {
			this.anInt6415 = 2;
			this.anInt6413 = 8192;
			this.anInt6410 = 2048;
			this.anInt6420 = 0;
		} else if (local4 == 10) {
			this.anInt6413 = 2048;
			this.anInt6410 = 512;
			this.anInt6415 = 3;
			this.anInt6420 = 1536;
		} else if (local4 == 11) {
			this.anInt6413 = 4096;
			this.anInt6415 = 3;
			this.anInt6420 = 1536;
			this.anInt6410 = 512;
		} else if (local4 == 6) {
			this.anInt6420 = 1280;
			this.anInt6413 = 2048;
			this.anInt6415 = 3;
			this.anInt6410 = 768;
		} else if (local4 == 7) {
			this.anInt6413 = 4096;
			this.anInt6410 = 768;
			this.anInt6415 = 3;
			this.anInt6420 = 1280;
		} else if (local4 == 8) {
			this.anInt6413 = 2048;
			this.anInt6420 = 1024;
			this.anInt6415 = 3;
			this.anInt6410 = 1024;
		} else if (local4 == 9) {
			this.anInt6420 = 1024;
			this.anInt6413 = 4096;
			this.anInt6415 = 3;
			this.anInt6410 = 1024;
		} else if (local4 == 14) {
			this.anInt6413 = 2048;
			this.anInt6410 = 768;
			this.anInt6420 = 1280;
			this.anInt6415 = 1;
		} else if (local4 == 15) {
			this.anInt6420 = 1536;
			this.anInt6413 = 4096;
			this.anInt6415 = 1;
			this.anInt6410 = 512;
		} else if (local4 == 16) {
			this.anInt6415 = 1;
			this.anInt6413 = 8192;
			this.anInt6410 = 256;
			this.anInt6420 = 1792;
		} else {
			this.anInt6410 = 2048;
			this.anInt6415 = 0;
			this.anInt6413 = 2048;
			this.anInt6420 = 0;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIILclient!za;I)V")
	private void method4985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class50 arg5) {
		this.aClass10_Sub4_1 = arg5.method5872(arg2, arg0, arg3, arg4, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BIIII)V")
	public void method4986(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6413 = arg2;
		this.anInt6420 = arg1;
		this.anInt6410 = arg0;
		this.anInt6415 = arg3;
	}
}
