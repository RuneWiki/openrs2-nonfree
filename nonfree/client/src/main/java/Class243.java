import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class243 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Z")
	public boolean aBoolean445;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	private int anInt6515;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "Lclient!qp;")
	public Class1_Sub31 aClass1_Sub31_2;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	private int anInt6517;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
	public int anInt6518;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	private int anInt6520;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	public int anInt6522;

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	private int anInt6523;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
	private int anInt6525;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	private Class243() {
		if (Static393.anIntArray582 == null) {
			Static5.method135();
		}
		this.method5439();
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!ya;Lclient!hp;I)V")
	public Class243(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class1_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (Static393.anIntArray582 == null) {
			Static5.method135();
		}
		this.anInt6518 = arg1.method5366();
		this.aBoolean446 = (this.anInt6518 & 0x10) != 0;
		this.aBoolean445 = (this.anInt6518 & 0x8) != 0;
		this.anInt6518 &= 0x7;
		@Pc(50) int local50 = arg1.method5362() << arg2;
		@Pc(56) int local56 = arg1.method5362() << arg2;
		@Pc(62) int local62 = arg1.method5362() << arg2;
		@Pc(66) int local66 = arg1.method5366();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray112 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray112.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method5362();
			local89 = local85 >>> 8;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			@Pc(104) int local104 = local85 & 0xFF;
			if (local72 - local89 < local104) {
				local104 = local72 - local89;
			}
			this.aShortArray112[local78] = (short) (local104 | local89 << 8);
		}
		local66 = Static69.anInt1593 + (local66 << Static31.anInt665);
		@Pc(163) int local163 = Static337.anIntArray223 == null ? Static165.anIntArray277[Static249.method3750(arg1.method5362()) & 0xFFFF] : Static337.anIntArray223[arg1.method5362()];
		local89 = arg1.method5366();
		this.anInt6522 = local89 & 0x1F;
		this.anInt6525 = (local89 & 0xE0) << 3;
		if (this.anInt6522 != 31) {
			this.method5439();
		}
		this.method5440(local66, local163, local56, local62, local50, arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
	public void method5436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6517 = arg2;
		this.anInt6523 = arg1;
		this.anInt6520 = arg0;
		this.anInt6515 = arg3;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)V")
	public void method5437(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0) {
			local17 = 2048;
		} else {
			@Pc(30) int local30 = this.anInt6517 * arg1 / 50 + this.anInt6525 & 0x7FF;
			@Pc(33) int local33 = this.anInt6515;
			if (local33 == 1) {
				local17 = (Class183.anIntArray433[local30 << 3] >> 5) + 1024;
			} else if (local33 == 3) {
				local17 = Static393.anIntArray582[local30] >> 1;
			} else if (local33 == 4) {
				local17 = local30 >> 10 << 11;
			} else if (local33 == 2) {
				local17 = local30;
			} else if (local33 == 5) {
				local17 = (local30 < 1024 ? local30 : 2048 - local30) << 1;
			} else {
				local17 = 2048;
			}
		}
		this.aClass1_Sub31_2.method5903((float) (this.anInt6523 + (local17 * this.anInt6520 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
	private void method5439() {
		@Pc(4) int local4 = this.anInt6522;
		if (local4 == 2) {
			this.anInt6523 = 0;
			this.anInt6517 = 2048;
			this.anInt6515 = 1;
			this.anInt6520 = 2048;
		} else if (local4 == 3) {
			this.anInt6520 = 2048;
			this.anInt6515 = 1;
			this.anInt6523 = 0;
			this.anInt6517 = 4096;
		} else if (local4 == 4) {
			this.anInt6520 = 2048;
			this.anInt6515 = 4;
			this.anInt6523 = 0;
			this.anInt6517 = 2048;
		} else if (local4 == 5) {
			this.anInt6520 = 2048;
			this.anInt6517 = 8192;
			this.anInt6523 = 0;
			this.anInt6515 = 4;
		} else if (local4 == 12) {
			this.anInt6515 = 2;
			this.anInt6523 = 0;
			this.anInt6517 = 2048;
			this.anInt6520 = 2048;
		} else if (local4 == 13) {
			this.anInt6523 = 0;
			this.anInt6520 = 2048;
			this.anInt6517 = 8192;
			this.anInt6515 = 2;
		} else if (local4 == 10) {
			this.anInt6515 = 3;
			this.anInt6520 = 512;
			this.anInt6517 = 2048;
			this.anInt6523 = 1536;
		} else if (local4 == 11) {
			this.anInt6520 = 512;
			this.anInt6523 = 1536;
			this.anInt6517 = 4096;
			this.anInt6515 = 3;
		} else if (local4 == 6) {
			this.anInt6515 = 3;
			this.anInt6517 = 2048;
			this.anInt6523 = 1280;
			this.anInt6520 = 768;
		} else if (local4 == 7) {
			this.anInt6523 = 1280;
			this.anInt6520 = 768;
			this.anInt6517 = 4096;
			this.anInt6515 = 3;
		} else if (local4 == 8) {
			this.anInt6520 = 1024;
			this.anInt6517 = 2048;
			this.anInt6523 = 1024;
			this.anInt6515 = 3;
		} else if (local4 == 9) {
			this.anInt6517 = 4096;
			this.anInt6523 = 1024;
			this.anInt6515 = 3;
			this.anInt6520 = 1024;
		} else if (local4 == 14) {
			this.anInt6523 = 1280;
			this.anInt6517 = 2048;
			this.anInt6515 = 1;
			this.anInt6520 = 768;
		} else if (local4 == 15) {
			this.anInt6520 = 512;
			this.anInt6515 = 1;
			this.anInt6523 = 1536;
			this.anInt6517 = 4096;
		} else if (local4 == 16) {
			this.anInt6515 = 1;
			this.anInt6517 = 8192;
			this.anInt6520 = 256;
			this.anInt6523 = 1792;
		} else {
			this.anInt6520 = 2048;
			this.anInt6515 = 0;
			this.anInt6517 = 2048;
			this.anInt6523 = 0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIILclient!ya;)V")
	private void method5440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class39 arg5) {
		this.aClass1_Sub31_2 = arg5.method4534(arg4, arg3, arg2, arg0, arg1, (float) 1);
	}
}
