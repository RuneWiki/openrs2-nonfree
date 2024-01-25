import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class300 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
	public int anInt9115;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
	public int anInt9118;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
	private int anInt9119;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Z")
	public boolean aBoolean657;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
	private int anInt9121;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
	private int anInt9122;

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
	private int anInt9123;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	private int anInt9125;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "Lclient!ab;")
	public Class2_Sub1 aClass2_Sub1_2;

	@OriginalMember(owner = "client!ro", name = "s", descriptor = "Z")
	public boolean aBoolean658;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
	private Class300() {
		if (Static615.anIntArray695 == null) {
			Static393.method6470();
		}
		this.method7672();
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!ha;Lclient!cea;I)V")
	public Class300(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class2_Sub11 arg1, @OriginalArg(2) int arg2) {
		if (Static615.anIntArray695 == null) {
			Static393.method6470();
		}
		this.anInt9115 = arg1.method8383();
		this.aBoolean657 = (this.anInt9115 & 0x8) != 0;
		this.aBoolean658 = (this.anInt9115 & 0x10) != 0;
		this.anInt9115 &= 0x7;
		@Pc(47) int local47 = arg1.method8326() << arg2;
		@Pc(53) int local53 = arg1.method8326() << arg2;
		@Pc(59) int local59 = arg1.method8326() << arg2;
		@Pc(63) int local63 = arg1.method8383();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray123 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray123.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method8326();
			local86 = local82 >>> 8;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			@Pc(101) int local101 = local82 & 0xFF;
			if (local69 - local86 < local101) {
				local101 = local69 - local86;
			}
			this.aShortArray123[local75] = (short) (local101 | local86 << 8);
		}
		local63 = (local63 << Static151.anInt3896) + Static361.anInt7189;
		@Pc(155) int local155 = Static195.anIntArray226 == null ? Static373.anIntArray464[Static221.method4259(arg1.method8326()) & 0xFFFF] : Static195.anIntArray226[arg1.method8326()];
		local86 = arg1.method8383();
		this.anInt9122 = (local86 & 0xE0) << 3;
		this.anInt9118 = local86 & 0x1F;
		if (this.anInt9118 != 31) {
			this.method7672();
		}
		this.method7671(local59, arg0, local53, local47, local155, local63);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBIII)V")
	public void method7669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt9119 = arg1;
		this.anInt9121 = arg0;
		this.anInt9125 = arg3;
		this.anInt9123 = arg2;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!ha;IIIII)V")
	private void method7671(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass2_Sub1_2 = arg1.method7293(arg3, arg0, arg2, arg5, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	private void method7672() {
		@Pc(4) int local4 = this.anInt9118;
		if (local4 == 2) {
			this.anInt9125 = 2048;
			this.anInt9121 = 0;
			this.anInt9119 = 2048;
			this.anInt9123 = 1;
		} else if (local4 == 3) {
			this.anInt9121 = 0;
			this.anInt9125 = 2048;
			this.anInt9123 = 1;
			this.anInt9119 = 4096;
		} else if (local4 == 4) {
			this.anInt9121 = 0;
			this.anInt9123 = 4;
			this.anInt9125 = 2048;
			this.anInt9119 = 2048;
		} else if (local4 == 5) {
			this.anInt9119 = 8192;
			this.anInt9123 = 4;
			this.anInt9125 = 2048;
			this.anInt9121 = 0;
		} else if (local4 == 12) {
			this.anInt9119 = 2048;
			this.anInt9123 = 2;
			this.anInt9121 = 0;
			this.anInt9125 = 2048;
		} else if (local4 == 13) {
			this.anInt9125 = 2048;
			this.anInt9121 = 0;
			this.anInt9123 = 2;
			this.anInt9119 = 8192;
		} else if (local4 == 10) {
			this.anInt9125 = 512;
			this.anInt9123 = 3;
			this.anInt9121 = 1536;
			this.anInt9119 = 2048;
		} else if (local4 == 11) {
			this.anInt9123 = 3;
			this.anInt9125 = 512;
			this.anInt9121 = 1536;
			this.anInt9119 = 4096;
		} else if (local4 == 6) {
			this.anInt9121 = 1280;
			this.anInt9123 = 3;
			this.anInt9125 = 768;
			this.anInt9119 = 2048;
		} else if (local4 == 7) {
			this.anInt9121 = 1280;
			this.anInt9123 = 3;
			this.anInt9119 = 4096;
			this.anInt9125 = 768;
		} else if (local4 == 8) {
			this.anInt9121 = 1024;
			this.anInt9119 = 2048;
			this.anInt9125 = 1024;
			this.anInt9123 = 3;
		} else if (local4 == 9) {
			this.anInt9125 = 1024;
			this.anInt9119 = 4096;
			this.anInt9123 = 3;
			this.anInt9121 = 1024;
		} else if (local4 == 14) {
			this.anInt9123 = 1;
			this.anInt9121 = 1280;
			this.anInt9119 = 2048;
			this.anInt9125 = 768;
		} else if (local4 == 15) {
			this.anInt9119 = 4096;
			this.anInt9125 = 512;
			this.anInt9123 = 1;
			this.anInt9121 = 1536;
		} else if (local4 == 16) {
			this.anInt9119 = 8192;
			this.anInt9123 = 1;
			this.anInt9125 = 256;
			this.anInt9121 = 1792;
		} else {
			this.anInt9119 = 2048;
			this.anInt9125 = 2048;
			this.anInt9121 = 0;
			this.anInt9123 = 0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZI)V")
	public void method7674(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0) {
			local17 = 2048;
		} else {
			@Pc(31) int local31 = this.anInt9119 * arg1 / 50 + this.anInt9122 & 0x7FF;
			@Pc(34) int local34 = this.anInt9123;
			if (local34 == 1) {
				local17 = (Class177.anIntArray361[local31 << 3] >> 4) + 1024;
			} else if (local34 == 3) {
				local17 = Static615.anIntArray695[local31] >> 1;
			} else if (local34 == 4) {
				local17 = local31 >> 10 << 11;
			} else if (local34 == 2) {
				local17 = local31;
			} else if (local34 == 5) {
				local17 = (local31 >= 1024 ? 2048 - local31 : local31) << 1;
			} else {
				local17 = 2048;
			}
		}
		this.aClass2_Sub1_2.method3961((float) ((this.anInt9125 * local17 >> 11) + this.anInt9121) / 2048.0F);
	}
}
