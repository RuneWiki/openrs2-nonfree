import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class83 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	private int anInt2478;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
	public boolean aBoolean211;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	private int anInt2480;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	private int anInt2481;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public int anInt2484;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	private int anInt2485;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Z")
	public boolean aBoolean212;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	private int anInt2489;

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!at;")
	public Class2_Sub5 aClass2_Sub5_1;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "[S")
	public short[] aShortArray59;

	static {
		new Class202("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class83() {
		if (Static359.anIntArray520 == null) {
			Static368.method5872();
		}
		this.method2366();
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!qa;Lclient!ps;I)V")
	public Class83(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class2_Sub29 arg1, @OriginalArg(2) int arg2) {
		if (Static359.anIntArray520 == null) {
			Static368.method5872();
		}
		this.anInt2484 = arg1.method5170();
		this.aBoolean212 = (this.anInt2484 & 0x8) != 0;
		this.aBoolean211 = (this.anInt2484 & 0x10) != 0;
		this.anInt2484 &= 0x7;
		@Pc(44) int local44 = arg1.method5229() << arg2;
		@Pc(50) int local50 = arg1.method5229() << arg2;
		@Pc(56) int local56 = arg1.method5229() << arg2;
		@Pc(60) int local60 = arg1.method5170();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray59 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray59.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method5229();
			local83 = local79 >>> 8;
			if (local83 >= local66) {
				local83 = local66 - 1;
			}
			@Pc(98) int local98 = local79 & 0xFF;
			if (local98 > local66 - local83) {
				local98 = local66 - local83;
			}
			this.aShortArray59[local72] = (short) (local83 << 8 | local98);
		}
		local60 = Static392.anInt7455 + (local60 << Static175.anInt3259);
		@Pc(152) int local152 = Static445.anIntArray614 == null ? Static77.anIntArray130[Static71.method1451(arg1.method5229()) & 0xFFFF] : Static445.anIntArray614[arg1.method5229()];
		local83 = arg1.method5170();
		this.anInt2481 = (local83 & 0xE0) << 3;
		this.anInt2483 = local83 & 0x1F;
		if (this.anInt2483 != 31) {
			this.method2366();
		}
		this.method2368(local44, local60, local50, local152, arg0, local56);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZI)V")
	public void method2364(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) int local9;
		if (arg1) {
			local9 = 2048;
		} else {
			@Pc(24) int local24 = this.anInt2481 + arg0 * this.anInt2480 / 50 & 0x7FF;
			@Pc(27) int local27 = this.anInt2485;
			if (local27 == 1) {
				local9 = (Class125.anIntArray381[local24 << 3] >> 5) + 1024;
			} else if (local27 == 3) {
				local9 = Static359.anIntArray520[local24] >> 1;
			} else if (local27 == 4) {
				local9 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local9 = local24;
			} else if (local27 == 5) {
				local9 = (local24 >= 1024 ? 2048 - local24 : local24) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass2_Sub5_1.method1663((float) (this.anInt2489 + (this.anInt2478 * local9 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	private void method2366() {
		@Pc(10) int local10 = this.anInt2483;
		if (local10 == 2) {
			this.anInt2478 = 2048;
			this.anInt2489 = 0;
			this.anInt2480 = 2048;
			this.anInt2485 = 1;
		} else if (local10 == 3) {
			this.anInt2480 = 4096;
			this.anInt2489 = 0;
			this.anInt2485 = 1;
			this.anInt2478 = 2048;
		} else if (local10 == 4) {
			this.anInt2489 = 0;
			this.anInt2480 = 2048;
			this.anInt2485 = 4;
			this.anInt2478 = 2048;
		} else if (local10 == 5) {
			this.anInt2489 = 0;
			this.anInt2485 = 4;
			this.anInt2478 = 2048;
			this.anInt2480 = 8192;
		} else if (local10 == 12) {
			this.anInt2489 = 0;
			this.anInt2478 = 2048;
			this.anInt2480 = 2048;
			this.anInt2485 = 2;
		} else if (local10 == 13) {
			this.anInt2489 = 0;
			this.anInt2478 = 2048;
			this.anInt2480 = 8192;
			this.anInt2485 = 2;
		} else if (local10 == 10) {
			this.anInt2489 = 1536;
			this.anInt2480 = 2048;
			this.anInt2485 = 3;
			this.anInt2478 = 512;
		} else if (local10 == 11) {
			this.anInt2480 = 4096;
			this.anInt2485 = 3;
			this.anInt2478 = 512;
			this.anInt2489 = 1536;
		} else if (local10 == 6) {
			this.anInt2489 = 1280;
			this.anInt2485 = 3;
			this.anInt2478 = 768;
			this.anInt2480 = 2048;
		} else if (local10 == 7) {
			this.anInt2480 = 4096;
			this.anInt2485 = 3;
			this.anInt2478 = 768;
			this.anInt2489 = 1280;
		} else if (local10 == 8) {
			this.anInt2480 = 2048;
			this.anInt2478 = 1024;
			this.anInt2485 = 3;
			this.anInt2489 = 1024;
		} else if (local10 == 9) {
			this.anInt2489 = 1024;
			this.anInt2480 = 4096;
			this.anInt2485 = 3;
			this.anInt2478 = 1024;
		} else if (local10 == 14) {
			this.anInt2485 = 1;
			this.anInt2480 = 2048;
			this.anInt2478 = 768;
			this.anInt2489 = 1280;
		} else if (local10 == 15) {
			this.anInt2485 = 1;
			this.anInt2489 = 1536;
			this.anInt2480 = 4096;
			this.anInt2478 = 512;
		} else if (local10 == 16) {
			this.anInt2480 = 8192;
			this.anInt2485 = 1;
			this.anInt2478 = 256;
			this.anInt2489 = 1792;
		} else {
			this.anInt2480 = 2048;
			this.anInt2478 = 2048;
			this.anInt2489 = 0;
			this.anInt2485 = 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIILclient!qa;IB)V")
	private void method2368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class39 arg4, @OriginalArg(5) int arg5) {
		this.aClass2_Sub5_1 = arg4.method6077(arg0, arg5, arg2, arg1, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
	public void method2370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2478 = arg1;
		this.anInt2480 = arg3;
		this.anInt2485 = arg2;
		this.anInt2489 = arg0;
	}
}
