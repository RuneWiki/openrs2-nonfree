import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class204 {

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
	private int anInt6615;

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
	private int anInt6616;

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
	private int anInt6617;

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "Lclient!ada;")
	public Class8_Sub1 aClass8_Sub1_3;

	@OriginalMember(owner = "client!mfa", name = "h", descriptor = "Z")
	public boolean aBoolean457;

	@OriginalMember(owner = "client!mfa", name = "l", descriptor = "I")
	private int anInt6624;

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
	public int anInt6625;

	@OriginalMember(owner = "client!mfa", name = "o", descriptor = "I")
	public int anInt6626;

	@OriginalMember(owner = "client!mfa", name = "q", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!mfa", name = "r", descriptor = "I")
	private int anInt6627;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
	private Class204() {
		if (Static246.anIntArray316 == null) {
			Static63.method1688();
		}
		this.method5427();
	}

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!ha;Lclient!ig;I)V")
	public Class204(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class8_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (Static246.anIntArray316 == null) {
			Static63.method1688();
		}
		this.anInt6626 = arg1.method8525();
		this.aBoolean458 = (this.anInt6626 & 0x10) != 0;
		this.aBoolean457 = (this.anInt6626 & 0x8) != 0;
		this.anInt6626 &= 0x7;
		@Pc(50) int local50 = arg1.method8578() << arg2;
		@Pc(56) int local56 = arg1.method8578() << arg2;
		@Pc(62) int local62 = arg1.method8578() << arg2;
		@Pc(66) int local66 = arg1.method8525();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray82 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray82.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method8578();
			local89 = local85 >>> 8;
			if (local72 <= local89) {
				local89 = local72 - 1;
			}
			@Pc(100) int local100 = local85 & 0xFF;
			if (local100 > local72 - local89) {
				local100 = local72 - local89;
			}
			this.aShortArray82[local78] = (short) (local100 | local89 << 8);
		}
		local66 = Static180.anInt4229 + (local66 << Static172.anInt4156);
		@Pc(159) int local159 = Static77.anIntArray92 == null ? Static491.anIntArray491[Static480.method7076(arg1.method8578()) & 0xFFFF] : Static77.anIntArray92[arg1.method8578()];
		local89 = arg1.method8525();
		this.anInt6625 = local89 & 0x1F;
		this.anInt6615 = (local89 & 0xE0) << 3;
		if (this.anInt6625 != 31) {
			this.method5427();
		}
		this.method5431(local159, arg0, local56, local50, local66, local62);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
	private void method5427() {
		@Pc(8) int local8 = this.anInt6625;
		if (local8 == 2) {
			this.anInt6627 = 1;
			this.anInt6617 = 0;
			this.anInt6616 = 2048;
			this.anInt6624 = 2048;
		} else if (local8 == 3) {
			this.anInt6617 = 0;
			this.anInt6616 = 4096;
			this.anInt6627 = 1;
			this.anInt6624 = 2048;
		} else if (local8 == 4) {
			this.anInt6627 = 4;
			this.anInt6617 = 0;
			this.anInt6616 = 2048;
			this.anInt6624 = 2048;
		} else if (local8 == 5) {
			this.anInt6624 = 2048;
			this.anInt6616 = 8192;
			this.anInt6627 = 4;
			this.anInt6617 = 0;
		} else if (local8 == 12) {
			this.anInt6616 = 2048;
			this.anInt6624 = 2048;
			this.anInt6627 = 2;
			this.anInt6617 = 0;
		} else if (local8 == 13) {
			this.anInt6627 = 2;
			this.anInt6617 = 0;
			this.anInt6616 = 8192;
			this.anInt6624 = 2048;
		} else if (local8 == 10) {
			this.anInt6627 = 3;
			this.anInt6624 = 512;
			this.anInt6616 = 2048;
			this.anInt6617 = 1536;
		} else if (local8 == 11) {
			this.anInt6624 = 512;
			this.anInt6617 = 1536;
			this.anInt6616 = 4096;
			this.anInt6627 = 3;
		} else if (local8 == 6) {
			this.anInt6616 = 2048;
			this.anInt6627 = 3;
			this.anInt6624 = 768;
			this.anInt6617 = 1280;
		} else if (local8 == 7) {
			this.anInt6617 = 1280;
			this.anInt6627 = 3;
			this.anInt6616 = 4096;
			this.anInt6624 = 768;
		} else if (local8 == 8) {
			this.anInt6617 = 1024;
			this.anInt6624 = 1024;
			this.anInt6627 = 3;
			this.anInt6616 = 2048;
		} else if (local8 == 9) {
			this.anInt6617 = 1024;
			this.anInt6616 = 4096;
			this.anInt6627 = 3;
			this.anInt6624 = 1024;
		} else if (local8 == 14) {
			this.anInt6627 = 1;
			this.anInt6616 = 2048;
			this.anInt6617 = 1280;
			this.anInt6624 = 768;
		} else if (local8 == 15) {
			this.anInt6627 = 1;
			this.anInt6624 = 512;
			this.anInt6616 = 4096;
			this.anInt6617 = 1536;
		} else if (local8 == 16) {
			this.anInt6627 = 1;
			this.anInt6624 = 256;
			this.anInt6617 = 1792;
			this.anInt6616 = 8192;
		} else {
			this.anInt6616 = 2048;
			this.anInt6624 = 2048;
			this.anInt6617 = 0;
			this.anInt6627 = 0;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIII)V")
	public void method5429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6627 = arg0;
		this.anInt6617 = arg1;
		this.anInt6624 = arg2;
		this.anInt6616 = arg3;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IILclient!ha;IIII)V")
	private void method5431(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass8_Sub1_3 = arg1.method6084(arg3, arg5, arg2, arg4, arg0, 1.0F);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IZZ)V")
	public void method5432(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(13) int local13;
		if (arg1) {
			local13 = 2048;
		} else {
			@Pc(28) int local28 = this.anInt6615 + this.anInt6616 * arg0 / 50 & 0x7FF;
			@Pc(31) int local31 = this.anInt6627;
			if (local31 == 1) {
				local13 = (Class344.anIntArray579[local28 << 3] >> 4) + 1024;
			} else if (local31 == 3) {
				local13 = Static246.anIntArray316[local28] >> 1;
			} else if (local31 == 4) {
				local13 = local28 >> 10 << 11;
			} else if (local31 == 2) {
				local13 = local28;
			} else if (local31 == 5) {
				local13 = (local28 >= 1024 ? 2048 - local28 : local28) << 1;
			} else {
				local13 = 2048;
			}
		}
		this.aClass8_Sub1_3.method5199((float) ((local13 * this.anInt6624 >> 11) + this.anInt6617) / 2048.0F);
	}
}
