import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class342 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Z")
	public boolean aBoolean663;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	private int anInt9272;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	private int anInt9274;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	private int anInt9275;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	private int anInt9277;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Z")
	public boolean aBoolean664;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public int anInt9281;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "[S")
	public short[] aShortArray141;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	private int anInt9282;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
	public int anInt9284;

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "Lclient!laa;")
	public Class2_Sub12 aClass2_Sub12_1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	private Class342() {
		if (Static449.anIntArray500 == null) {
			Static387.method5705();
		}
		this.method7894();
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!ha;Lclient!sl;I)V")
	public Class342(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class2_Sub17 arg1, @OriginalArg(2) int arg2) {
		if (Static449.anIntArray500 == null) {
			Static387.method5705();
		}
		this.anInt9281 = arg1.method2859();
		this.aBoolean663 = (this.anInt9281 & 0x10) != 0;
		this.aBoolean664 = (this.anInt9281 & 0x8) != 0;
		this.anInt9281 &= 0x7;
		@Pc(50) int local50 = arg1.method2825() << arg2;
		@Pc(56) int local56 = arg1.method2825() << arg2;
		@Pc(62) int local62 = arg1.method2825() << arg2;
		@Pc(66) int local66 = arg1.method2859();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray141 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray141.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method2825();
			local89 = local85 >>> 8;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			@Pc(100) int local100 = local85 & 0xFF;
			if (local100 > local72 - local89) {
				local100 = local72 - local89;
			}
			this.aShortArray141[local78] = (short) (local100 | local89 << 8);
		}
		local66 = Static620.anInt10145 + (local66 << Static326.anInt5713);
		@Pc(155) int local155 = Static347.anIntArray701 == null ? Static476.anIntArray555[Static208.method3505(arg1.method2825()) & 0xFFFF] : Static347.anIntArray701[arg1.method2825()];
		local89 = arg1.method2859();
		this.anInt9282 = (local89 & 0xE0) << 3;
		this.anInt9284 = local89 & 0x1F;
		if (this.anInt9284 != 31) {
			this.method7894();
		}
		this.method7896(local56, local62, arg0, local50, local66, local155);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	private void method7894() {
		@Pc(4) int local4 = this.anInt9284;
		if (local4 == 2) {
			this.anInt9274 = 1;
			this.anInt9275 = 2048;
			this.anInt9272 = 0;
			this.anInt9277 = 2048;
		} else if (local4 == 3) {
			this.anInt9274 = 1;
			this.anInt9272 = 0;
			this.anInt9275 = 2048;
			this.anInt9277 = 4096;
		} else if (local4 == 4) {
			this.anInt9274 = 4;
			this.anInt9275 = 2048;
			this.anInt9272 = 0;
			this.anInt9277 = 2048;
		} else if (local4 == 5) {
			this.anInt9277 = 8192;
			this.anInt9275 = 2048;
			this.anInt9272 = 0;
			this.anInt9274 = 4;
		} else if (local4 == 12) {
			this.anInt9274 = 2;
			this.anInt9272 = 0;
			this.anInt9277 = 2048;
			this.anInt9275 = 2048;
		} else if (local4 == 13) {
			this.anInt9272 = 0;
			this.anInt9275 = 2048;
			this.anInt9277 = 8192;
			this.anInt9274 = 2;
		} else if (local4 == 10) {
			this.anInt9275 = 512;
			this.anInt9272 = 1536;
			this.anInt9277 = 2048;
			this.anInt9274 = 3;
		} else if (local4 == 11) {
			this.anInt9275 = 512;
			this.anInt9272 = 1536;
			this.anInt9274 = 3;
			this.anInt9277 = 4096;
		} else if (local4 == 6) {
			this.anInt9274 = 3;
			this.anInt9275 = 768;
			this.anInt9272 = 1280;
			this.anInt9277 = 2048;
		} else if (local4 == 7) {
			this.anInt9275 = 768;
			this.anInt9274 = 3;
			this.anInt9277 = 4096;
			this.anInt9272 = 1280;
		} else if (local4 == 8) {
			this.anInt9275 = 1024;
			this.anInt9272 = 1024;
			this.anInt9274 = 3;
			this.anInt9277 = 2048;
		} else if (local4 == 9) {
			this.anInt9272 = 1024;
			this.anInt9275 = 1024;
			this.anInt9277 = 4096;
			this.anInt9274 = 3;
		} else if (local4 == 14) {
			this.anInt9274 = 1;
			this.anInt9277 = 2048;
			this.anInt9275 = 768;
			this.anInt9272 = 1280;
		} else if (local4 == 15) {
			this.anInt9272 = 1536;
			this.anInt9277 = 4096;
			this.anInt9275 = 512;
			this.anInt9274 = 1;
		} else if (local4 == 16) {
			this.anInt9275 = 256;
			this.anInt9274 = 1;
			this.anInt9272 = 1792;
			this.anInt9277 = 8192;
		} else {
			this.anInt9272 = 0;
			this.anInt9275 = 2048;
			this.anInt9277 = 2048;
			this.anInt9274 = 0;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!ha;IIII)V")
	private void method7896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass2_Sub12_1 = arg2.method8111(arg3, arg1, arg0, arg4, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
	public void method7897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9274 = arg3;
		this.anInt9272 = arg0;
		this.anInt9275 = arg1;
		this.anInt9277 = arg2;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZ)V")
	public void method7898(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(51) int local51;
		if (arg1) {
			local51 = 2048;
		} else {
			@Pc(19) int local19 = arg0 * this.anInt9277 / 50 + this.anInt9282 & 0x7FF;
			@Pc(22) int local22 = this.anInt9274;
			if (local22 == 1) {
				local51 = (Class290.anIntArray546[local19 << 3] >> 4) + 1024;
			} else if (local22 == 3) {
				local51 = Static449.anIntArray500[local19] >> 1;
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
		this.aClass2_Sub12_1.method7424((float) (this.anInt9272 + (this.anInt9275 * local51 >> 11)) / 2048.0F);
	}
}
