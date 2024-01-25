import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class199 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
	private int anInt5994;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public int anInt5996;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "Z")
	public boolean aBoolean531;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	public int anInt6000;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Lclient!gu;")
	public Class5_Sub18 aClass5_Sub18_2;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
	private int anInt6001;

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	private int anInt6002;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
	private int anInt6003;

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "Z")
	public boolean aBoolean532;

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
	private int anInt6005;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	private Class199() {
		if (Static356.anIntArray371 == null) {
			Static294.method4752();
		}
		this.method4983();
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!ha;Lclient!mc;I)V")
	public Class199(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class5_Sub41 arg1, @OriginalArg(2) int arg2) {
		if (Static356.anIntArray371 == null) {
			Static294.method4752();
		}
		this.anInt6000 = arg1.method7816();
		this.aBoolean531 = (this.anInt6000 & 0x8) != 0;
		this.aBoolean532 = (this.anInt6000 & 0x10) != 0;
		this.anInt6000 &= 0x7;
		@Pc(45) int local45 = arg1.method7860() << arg2;
		@Pc(51) int local51 = arg1.method7860() << arg2;
		@Pc(57) int local57 = arg1.method7860() << arg2;
		@Pc(61) int local61 = arg1.method7816();
		@Pc(67) int local67 = local61 * 2 + 1;
		this.aShortArray76 = new short[local67];
		@Pc(83) int local83;
		for (@Pc(73) int local73 = 0; local73 < this.aShortArray76.length; local73++) {
			@Pc(79) short local79 = (short) arg1.method7860();
			local83 = local79 >>> 8;
			if (local67 <= local83) {
				local83 = local67 - 1;
			}
			@Pc(98) int local98 = local79 & 0xFF;
			if (local98 > local67 - local83) {
				local98 = local67 - local83;
			}
			this.aShortArray76[local73] = (short) (local98 | local83 << 8);
		}
		local61 = (local61 << Static588.anInt9672) + Static558.anInt7322;
		@Pc(154) int local154 = Static336.anIntArray357 == null ? Static378.anIntArray380[Static297.method4770(arg1.method7860()) & 0xFFFF] : Static336.anIntArray357[arg1.method7860()];
		local83 = arg1.method7816();
		this.anInt5996 = local83 & 0x1F;
		this.anInt6001 = (local83 & 0xE0) << 3;
		if (this.anInt5996 != 31) {
			this.method4983();
		}
		this.method4985(local57, local61, arg0, local51, local154, local45);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZBI)V")
	public void method4982(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt6001 + this.anInt5994 * arg1 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt6003;
			if (local26 == 1) {
				local9 = (Class200.anIntArray337[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local9 = Static356.anIntArray371[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 >= 1024 ? 2048 - local23 : local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass5_Sub18_2.method8047((float) (this.anInt6002 + (local9 * this.anInt6005 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	private void method4983() {
		@Pc(14) int local14 = this.anInt5996;
		if (local14 == 2) {
			this.anInt6003 = 1;
			this.anInt6002 = 0;
			this.anInt5994 = 2048;
			this.anInt6005 = 2048;
		} else if (local14 == 3) {
			this.anInt6005 = 2048;
			this.anInt6003 = 1;
			this.anInt6002 = 0;
			this.anInt5994 = 4096;
		} else if (local14 == 4) {
			this.anInt5994 = 2048;
			this.anInt6003 = 4;
			this.anInt6005 = 2048;
			this.anInt6002 = 0;
		} else if (local14 == 5) {
			this.anInt6003 = 4;
			this.anInt6005 = 2048;
			this.anInt6002 = 0;
			this.anInt5994 = 8192;
		} else if (local14 == 12) {
			this.anInt6002 = 0;
			this.anInt6005 = 2048;
			this.anInt6003 = 2;
			this.anInt5994 = 2048;
		} else if (local14 == 13) {
			this.anInt6002 = 0;
			this.anInt5994 = 8192;
			this.anInt6003 = 2;
			this.anInt6005 = 2048;
		} else if (local14 == 10) {
			this.anInt5994 = 2048;
			this.anInt6002 = 1536;
			this.anInt6005 = 512;
			this.anInt6003 = 3;
		} else if (local14 == 11) {
			this.anInt5994 = 4096;
			this.anInt6003 = 3;
			this.anInt6002 = 1536;
			this.anInt6005 = 512;
		} else if (local14 == 6) {
			this.anInt6002 = 1280;
			this.anInt6005 = 768;
			this.anInt6003 = 3;
			this.anInt5994 = 2048;
		} else if (local14 == 7) {
			this.anInt6002 = 1280;
			this.anInt6005 = 768;
			this.anInt6003 = 3;
			this.anInt5994 = 4096;
		} else if (local14 == 8) {
			this.anInt6002 = 1024;
			this.anInt6003 = 3;
			this.anInt6005 = 1024;
			this.anInt5994 = 2048;
		} else if (local14 == 9) {
			this.anInt6005 = 1024;
			this.anInt5994 = 4096;
			this.anInt6003 = 3;
			this.anInt6002 = 1024;
		} else if (local14 == 14) {
			this.anInt6005 = 768;
			this.anInt5994 = 2048;
			this.anInt6003 = 1;
			this.anInt6002 = 1280;
		} else if (local14 == 15) {
			this.anInt6002 = 1536;
			this.anInt6005 = 512;
			this.anInt6003 = 1;
			this.anInt5994 = 4096;
		} else if (local14 == 16) {
			this.anInt5994 = 8192;
			this.anInt6002 = 1792;
			this.anInt6005 = 256;
			this.anInt6003 = 1;
		} else {
			this.anInt6005 = 2048;
			this.anInt6002 = 0;
			this.anInt5994 = 2048;
			this.anInt6003 = 0;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
	public void method4984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6003 = arg3;
		this.anInt5994 = arg2;
		this.anInt6005 = arg1;
		this.anInt6002 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIILclient!ha;III)V")
	private void method4985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class65 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass5_Sub18_2 = arg2.method6919(arg5, arg0, arg3, arg1, arg4, 1.0F);
	}
}
