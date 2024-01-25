import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class169 {

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Z")
	public boolean aBoolean344;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	private int anInt4875;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	private int anInt4879;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	private int anInt4884;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "I")
	public int anInt4885;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "I")
	private int anInt4886;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "I")
	private int anInt4887;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "I")
	public int anInt4889;

	@OriginalMember(owner = "client!o", name = "u", descriptor = "Lclient!dd;")
	public Class4_Sub8 aClass4_Sub8_1;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Z")
	public boolean aBoolean345;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	private Class169() {
		if (Static132.anIntArray173 == null) {
			Static315.method4351();
		}
		this.method3732();
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!qa;Lclient!tl;I)V")
	public Class169(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class4_Sub30 arg1, @OriginalArg(2) int arg2) {
		if (Static132.anIntArray173 == null) {
			Static315.method4351();
		}
		this.anInt4885 = arg1.method4864();
		this.aBoolean345 = (this.anInt4885 & 0x10) != 0;
		this.aBoolean344 = (this.anInt4885 & 0x8) != 0;
		this.anInt4885 &= 0x7;
		@Pc(50) int local50 = arg1.method4877() << arg2;
		@Pc(56) int local56 = arg1.method4877() << arg2;
		@Pc(62) int local62 = arg1.method4877() << arg2;
		@Pc(66) int local66 = arg1.method4864();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray69 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray69.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method4877();
			local89 = local85 >>> 8;
			@Pc(93) int local93 = local85 & 0xFF;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			if (local93 > local72 - local89) {
				local93 = local72 - local89;
			}
			this.aShortArray69[local78] = (short) (local93 | local89 << 8);
		}
		local66 = (local66 << Static372.anInt7558) + Static40.anInt1024;
		@Pc(154) int local154 = Static154.anIntArray246 == null ? Static261.anIntArray393[Static222.method3111(arg1.method4877()) & 0xFFFF] : Static154.anIntArray246[arg1.method4877()];
		local89 = arg1.method4864();
		this.anInt4889 = local89 & 0x1F;
		this.anInt4884 = (local89 & 0xE0) << 3;
		if (this.anInt4889 != 31) {
			this.method3732();
		}
		this.method3731(local62, local66, local56, local154, local50, arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V")
	public void method3730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4887 = arg1;
		this.anInt4879 = arg0;
		this.anInt4875 = arg3;
		this.anInt4886 = arg2;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BIIIIILclient!qa;)V")
	private void method3731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5) {
		this.aClass4_Sub8_1 = arg5.method4654(arg4, arg0, arg2, arg1, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	private void method3732() {
		@Pc(16) int local16 = this.anInt4889;
		if (local16 == 2) {
			this.anInt4886 = 2048;
			this.anInt4875 = 1;
			this.anInt4879 = 2048;
			this.anInt4887 = 0;
		} else if (local16 == 3) {
			this.anInt4879 = 2048;
			this.anInt4887 = 0;
			this.anInt4875 = 1;
			this.anInt4886 = 4096;
		} else if (local16 == 4) {
			this.anInt4875 = 4;
			this.anInt4887 = 0;
			this.anInt4886 = 2048;
			this.anInt4879 = 2048;
		} else if (local16 == 5) {
			this.anInt4879 = 2048;
			this.anInt4875 = 4;
			this.anInt4887 = 0;
			this.anInt4886 = 8192;
		} else if (local16 == 12) {
			this.anInt4875 = 2;
			this.anInt4879 = 2048;
			this.anInt4887 = 0;
			this.anInt4886 = 2048;
		} else if (local16 == 13) {
			this.anInt4879 = 2048;
			this.anInt4887 = 0;
			this.anInt4875 = 2;
			this.anInt4886 = 8192;
		} else if (local16 == 10) {
			this.anInt4886 = 2048;
			this.anInt4879 = 512;
			this.anInt4887 = 1536;
			this.anInt4875 = 3;
		} else if (local16 == 11) {
			this.anInt4886 = 4096;
			this.anInt4879 = 512;
			this.anInt4875 = 3;
			this.anInt4887 = 1536;
		} else if (local16 == 6) {
			this.anInt4887 = 1280;
			this.anInt4879 = 768;
			this.anInt4875 = 3;
			this.anInt4886 = 2048;
		} else if (local16 == 7) {
			this.anInt4875 = 3;
			this.anInt4886 = 4096;
			this.anInt4879 = 768;
			this.anInt4887 = 1280;
		} else if (local16 == 8) {
			this.anInt4886 = 2048;
			this.anInt4887 = 1024;
			this.anInt4875 = 3;
			this.anInt4879 = 1024;
		} else if (local16 == 9) {
			this.anInt4886 = 4096;
			this.anInt4875 = 3;
			this.anInt4879 = 1024;
			this.anInt4887 = 1024;
		} else if (local16 == 14) {
			this.anInt4886 = 2048;
			this.anInt4887 = 1280;
			this.anInt4875 = 1;
			this.anInt4879 = 768;
		} else if (local16 == 15) {
			this.anInt4887 = 1536;
			this.anInt4886 = 4096;
			this.anInt4879 = 512;
			this.anInt4875 = 1;
		} else if (local16 == 16) {
			this.anInt4879 = 256;
			this.anInt4886 = 8192;
			this.anInt4875 = 1;
			this.anInt4887 = 1792;
		} else {
			this.anInt4875 = 0;
			this.anInt4887 = 0;
			this.anInt4886 = 2048;
			this.anInt4879 = 2048;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZII)V")
	public void method3733(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15;
		if (arg0) {
			local15 = 2048;
		} else {
			@Pc(29) int local29 = this.anInt4886 * arg1 / 50 + this.anInt4884 & 0x7FF;
			@Pc(32) int local32 = this.anInt4875;
			if (local32 == 1) {
				local15 = (Class56.anIntArray119[local29 << 3] >> 5) + 1024;
			} else if (local32 == 3) {
				local15 = Static132.anIntArray173[local29] >> 1;
			} else if (local32 == 4) {
				local15 = local29 >> 10 << 11;
			} else if (local32 == 2) {
				local15 = local29;
			} else if (local32 == 5) {
				local15 = (local29 < 1024 ? local29 : 2048 - local29) << 1;
			} else {
				local15 = 2048;
			}
		}
		this.aClass4_Sub8_1.method5671((float) (this.anInt4887 + (this.anInt4879 * local15 >> 11)) / 2048.0F);
	}
}
