import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class38 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!as;")
	public Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "[S")
	public short[] aShortArray4;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
	private int anInt774;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Z")
	public boolean aBoolean37;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
	private int anInt780;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
	private int anInt783;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "Z")
	public boolean aBoolean38;

	static {
		new Class231("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	private Class38() {
		if (Static318.anIntArray480 == null) {
			Static180.method2621();
		}
		this.method737();
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!za;Lclient!hw;I)V")
	public Class38(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class2_Sub17 arg1, @OriginalArg(2) int arg2) {
		if (Static318.anIntArray480 == null) {
			Static180.method2621();
		}
		this.anInt779 = arg1.method6138();
		this.aBoolean38 = (this.anInt779 & 0x8) != 0;
		this.aBoolean37 = (this.anInt779 & 0x10) != 0;
		this.anInt779 &= 0x7;
		@Pc(50) int local50 = arg1.method6148() << arg2;
		@Pc(56) int local56 = arg1.method6148() << arg2;
		@Pc(62) int local62 = arg1.method6148() << arg2;
		@Pc(66) int local66 = arg1.method6138();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray4 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray4.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method6148();
			local89 = local85 >>> 8;
			@Pc(93) int local93 = local85 & 0xFF;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			if (local72 - local89 < local93) {
				local93 = local72 - local89;
			}
			this.aShortArray4[local78] = (short) (local89 << 8 | local93);
		}
		local66 = Static417.anInt7156 + (local66 << Static146.anInt2674);
		@Pc(155) int local155 = Static64.anIntArray85 == null ? Static268.anIntArray402[Static36.method578(arg1.method6148()) & 0xFFFF] : Static64.anIntArray85[arg1.method6148()];
		local89 = arg1.method6138();
		this.anInt775 = local89 & 0x1F;
		this.anInt774 = (local89 & 0xE0) << 3;
		if (this.anInt775 != 31) {
			this.method737();
		}
		this.method739(local62, arg0, local50, local155, local66, local56);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V")
	public void method736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt783 = arg2;
		this.anInt770 = arg1;
		this.anInt776 = arg0;
		this.anInt780 = arg3;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	private void method737() {
		@Pc(4) int local4 = this.anInt775;
		if (local4 == 2) {
			this.anInt776 = 2048;
			this.anInt770 = 0;
			this.anInt780 = 1;
			this.anInt783 = 2048;
		} else if (local4 == 3) {
			this.anInt783 = 2048;
			this.anInt770 = 0;
			this.anInt780 = 1;
			this.anInt776 = 4096;
		} else if (local4 == 4) {
			this.anInt770 = 0;
			this.anInt780 = 4;
			this.anInt776 = 2048;
			this.anInt783 = 2048;
		} else if (local4 == 5) {
			this.anInt783 = 2048;
			this.anInt770 = 0;
			this.anInt776 = 8192;
			this.anInt780 = 4;
		} else if (local4 == 12) {
			this.anInt776 = 2048;
			this.anInt770 = 0;
			this.anInt780 = 2;
			this.anInt783 = 2048;
		} else if (local4 == 13) {
			this.anInt770 = 0;
			this.anInt783 = 2048;
			this.anInt780 = 2;
			this.anInt776 = 8192;
		} else if (local4 == 10) {
			this.anInt776 = 2048;
			this.anInt770 = 1536;
			this.anInt783 = 512;
			this.anInt780 = 3;
		} else if (local4 == 11) {
			this.anInt776 = 4096;
			this.anInt770 = 1536;
			this.anInt783 = 512;
			this.anInt780 = 3;
		} else if (local4 == 6) {
			this.anInt776 = 2048;
			this.anInt780 = 3;
			this.anInt770 = 1280;
			this.anInt783 = 768;
		} else if (local4 == 7) {
			this.anInt783 = 768;
			this.anInt780 = 3;
			this.anInt770 = 1280;
			this.anInt776 = 4096;
		} else if (local4 == 8) {
			this.anInt783 = 1024;
			this.anInt780 = 3;
			this.anInt776 = 2048;
			this.anInt770 = 1024;
		} else if (local4 == 9) {
			this.anInt776 = 4096;
			this.anInt783 = 1024;
			this.anInt780 = 3;
			this.anInt770 = 1024;
		} else if (local4 == 14) {
			this.anInt780 = 1;
			this.anInt770 = 1280;
			this.anInt776 = 2048;
			this.anInt783 = 768;
		} else if (local4 == 15) {
			this.anInt770 = 1536;
			this.anInt783 = 512;
			this.anInt776 = 4096;
			this.anInt780 = 1;
		} else if (local4 == 16) {
			this.anInt776 = 8192;
			this.anInt780 = 1;
			this.anInt783 = 256;
			this.anInt770 = 1792;
		} else {
			this.anInt770 = 0;
			this.anInt780 = 0;
			this.anInt783 = 2048;
			this.anInt776 = 2048;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!za;BIIII)V")
	private void method739(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass2_Sub4_1 = arg1.method6019(arg2, arg0, arg5, arg4, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZ)V")
	public void method740(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) int local9;
		if (arg1) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt774 + this.anInt776 * arg0 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt780;
			if (local26 == 1) {
				local9 = (Class229.anIntArray537[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static318.anIntArray480[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass2_Sub4_1.method4083((float) ((local9 * this.anInt783 >> 11) + this.anInt770) / 2048.0F);
	}
}
