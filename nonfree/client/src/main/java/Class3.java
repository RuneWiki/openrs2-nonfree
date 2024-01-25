import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	private int anInt53;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Z")
	public boolean aBoolean5;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!cba;")
	public Class6_Sub10 aClass6_Sub10_1;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	private int anInt56;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public int anInt57;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Z")
	public boolean aBoolean6;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	private int anInt58;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	private int anInt60;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
	public int anInt61;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	private Class3() {
		if (Static255.anIntArray230 == null) {
			Static610.method8366();
		}
		this.method54();
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!ha;Lclient!ji;I)V")
	public Class3(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class6_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (Static255.anIntArray230 == null) {
			Static610.method8366();
		}
		this.anInt57 = arg1.method8246();
		this.aBoolean5 = (this.anInt57 & 0x10) != 0;
		this.aBoolean6 = (this.anInt57 & 0x8) != 0;
		this.anInt57 &= 0x7;
		@Pc(50) int local50 = arg1.method8220() << arg2;
		@Pc(56) int local56 = arg1.method8220() << arg2;
		@Pc(62) int local62 = arg1.method8220() << arg2;
		@Pc(66) int local66 = arg1.method8246();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray1 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray1.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method8220();
			local89 = local85 >>> 8;
			@Pc(93) int local93 = local85 & 0xFF;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			if (local93 > local72 - local89) {
				local93 = local72 - local89;
			}
			this.aShortArray1[local78] = (short) (local89 << 8 | local93);
		}
		local66 = (local66 << Static606.anInt10280) + Static375.anInt7139;
		@Pc(159) int local159 = Static376.anIntArray336 == null ? Static396.anIntArray370[Static222.method4107(arg1.method8220()) & 0xFFFF] : Static376.anIntArray336[arg1.method8220()];
		local89 = arg1.method8246();
		this.anInt61 = local89 & 0x1F;
		this.anInt60 = (local89 & 0xE0) << 3;
		if (this.anInt61 != 31) {
			this.method54();
		}
		this.method57(arg0, local56, local159, local50, local66, local62);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZII)V")
	public void method51(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15;
		if (arg0) {
			local15 = 2048;
		} else {
			@Pc(29) int local29 = this.anInt60 + arg1 * this.anInt58 / 50 & 0x7FF;
			@Pc(32) int local32 = this.anInt53;
			if (local32 == 1) {
				local15 = (Class78_Sub2_Sub2.anIntArray270[local29 << 3] >> 4) + 1024;
			} else if (local32 == 3) {
				local15 = Static255.anIntArray230[local29] >> 1;
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
		this.aClass6_Sub10_1.method5317((float) (this.anInt56 + (local15 * this.anInt47 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	private void method54() {
		@Pc(8) int local8 = this.anInt61;
		if (local8 == 2) {
			this.anInt47 = 2048;
			this.anInt58 = 2048;
			this.anInt53 = 1;
			this.anInt56 = 0;
		} else if (local8 == 3) {
			this.anInt56 = 0;
			this.anInt47 = 2048;
			this.anInt53 = 1;
			this.anInt58 = 4096;
		} else if (local8 == 4) {
			this.anInt47 = 2048;
			this.anInt53 = 4;
			this.anInt58 = 2048;
			this.anInt56 = 0;
		} else if (local8 == 5) {
			this.anInt56 = 0;
			this.anInt53 = 4;
			this.anInt47 = 2048;
			this.anInt58 = 8192;
		} else if (local8 == 12) {
			this.anInt53 = 2;
			this.anInt56 = 0;
			this.anInt58 = 2048;
			this.anInt47 = 2048;
		} else if (local8 == 13) {
			this.anInt53 = 2;
			this.anInt56 = 0;
			this.anInt47 = 2048;
			this.anInt58 = 8192;
		} else if (local8 == 10) {
			this.anInt47 = 512;
			this.anInt56 = 1536;
			this.anInt53 = 3;
			this.anInt58 = 2048;
		} else if (local8 == 11) {
			this.anInt47 = 512;
			this.anInt53 = 3;
			this.anInt56 = 1536;
			this.anInt58 = 4096;
		} else if (local8 == 6) {
			this.anInt47 = 768;
			this.anInt56 = 1280;
			this.anInt53 = 3;
			this.anInt58 = 2048;
		} else if (local8 == 7) {
			this.anInt56 = 1280;
			this.anInt53 = 3;
			this.anInt58 = 4096;
			this.anInt47 = 768;
		} else if (local8 == 8) {
			this.anInt47 = 1024;
			this.anInt53 = 3;
			this.anInt56 = 1024;
			this.anInt58 = 2048;
		} else if (local8 == 9) {
			this.anInt58 = 4096;
			this.anInt53 = 3;
			this.anInt56 = 1024;
			this.anInt47 = 1024;
		} else if (local8 == 14) {
			this.anInt56 = 1280;
			this.anInt53 = 1;
			this.anInt58 = 2048;
			this.anInt47 = 768;
		} else if (local8 == 15) {
			this.anInt53 = 1;
			this.anInt58 = 4096;
			this.anInt56 = 1536;
			this.anInt47 = 512;
		} else if (local8 == 16) {
			this.anInt53 = 1;
			this.anInt47 = 256;
			this.anInt58 = 8192;
			this.anInt56 = 1792;
		} else {
			this.anInt47 = 2048;
			this.anInt53 = 0;
			this.anInt56 = 0;
			this.anInt58 = 2048;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIBI)V")
	public void method56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt53 = arg3;
		this.anInt56 = arg2;
		this.anInt47 = arg1;
		this.anInt58 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!ha;IIIII)V")
	private void method57(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass6_Sub10_1 = arg0.method6128(arg3, arg5, arg1, arg4, arg2, 1.0F);
	}
}
