import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class275 {

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Ljava/lang/String;")
	public static final String aString86;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString87;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	private int anInt7472;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	public int anInt7473;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "I")
	private int anInt7475;

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	public int anInt7476;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "Z")
	public boolean aBoolean528;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!on", name = "e", descriptor = "I")
	private int anInt7477;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "I")
	private int anInt7478;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "I")
	private int anInt7479;

	@OriginalMember(owner = "client!on", name = "q", descriptor = "Z")
	public boolean aBoolean529;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "Lclient!rfa;")
	public Class14_Sub18 aClass14_Sub18_2;

	static {
		@Pc(66) String local66 = "Unknown";
		try {
			local66 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(74) Exception local74) {
		}
		local66.toLowerCase();
		local66 = "Unknown";
		try {
			local66 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(89) Exception local89) {
		}
		local66.toLowerCase();
		local66 = "Unknown";
		try {
			local66 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(104) Exception local104) {
		}
		aString86 = local66.toLowerCase();
		local66 = "Unknown";
		try {
			local66 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(119) Exception local119) {
		}
		aString87 = local66.toLowerCase();
		local66 = "Unknown";
		try {
			local66 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(134) Exception local134) {
		}
		local66.toLowerCase();
		local66 = "~/";
		try {
			local66 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(149) Exception local149) {
		}
		new File(local66);
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	private Class275() {
		if (Static12.anIntArray16 == null) {
			Static257.method4321();
		}
		this.method6618();
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ha;Lclient!jc;I)V")
	public Class275(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class14_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (Static12.anIntArray16 == null) {
			Static257.method4321();
		}
		this.anInt7473 = arg1.method7695(118);
		this.aBoolean528 = (this.anInt7473 & 0x8) != 0;
		this.aBoolean529 = (this.anInt7473 & 0x10) != 0;
		this.anInt7473 &= 0x7;
		@Pc(50) int local50 = arg1.method7717(-1978450544) << arg2;
		@Pc(56) int local56 = arg1.method7717(-1978450544) << arg2;
		@Pc(62) int local62 = arg1.method7717(-1978450544) << arg2;
		@Pc(66) int local66 = arg1.method7695(120);
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray93 = new short[local72];
		@Pc(88) int local88;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray93.length; local78++) {
			@Pc(84) short local84 = (short) arg1.method7717(-1978450544);
			local88 = local84 >>> 8;
			@Pc(92) int local92 = local84 & 0xFF;
			if (local72 <= local88) {
				local88 = local72 - 1;
			}
			if (local72 - local88 < local92) {
				local92 = local72 - local88;
			}
			this.aShortArray93[local78] = (short) (local88 << 8 | local92);
		}
		local66 = (local66 << Static110.anInt1858) + Static193.anInt9749;
		@Pc(155) int local155 = Static302.anIntArray299 == null ? Static441.anIntArray394[Static644.method9055(arg1.method7717(-1978450544)) & 0xFFFF] : Static302.anIntArray299[arg1.method7717(-1978450544)];
		local88 = arg1.method7695(122);
		this.anInt7472 = (local88 & 0xE0) << 3;
		this.anInt7476 = local88 & 0x1F;
		if (this.anInt7476 != 31) {
			this.method6618();
		}
		this.method6620(arg0, local62, local66, local155, local56, local50);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIBII)V")
	public void method6617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7477 = arg0;
		this.anInt7475 = arg3;
		this.anInt7478 = arg1;
		this.anInt7479 = arg2;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	private void method6618() {
		@Pc(10) int local10 = this.anInt7476;
		if (local10 == 2) {
			this.anInt7475 = 2048;
			this.anInt7478 = 2048;
			this.anInt7479 = 1;
			this.anInt7477 = 0;
		} else if (local10 == 3) {
			this.anInt7475 = 2048;
			this.anInt7477 = 0;
			this.anInt7478 = 4096;
			this.anInt7479 = 1;
		} else if (local10 == 4) {
			this.anInt7475 = 2048;
			this.anInt7478 = 2048;
			this.anInt7479 = 4;
			this.anInt7477 = 0;
		} else if (local10 == 5) {
			this.anInt7478 = 8192;
			this.anInt7477 = 0;
			this.anInt7475 = 2048;
			this.anInt7479 = 4;
		} else if (local10 == 12) {
			this.anInt7475 = 2048;
			this.anInt7478 = 2048;
			this.anInt7477 = 0;
			this.anInt7479 = 2;
		} else if (local10 == 13) {
			this.anInt7478 = 8192;
			this.anInt7477 = 0;
			this.anInt7475 = 2048;
			this.anInt7479 = 2;
		} else if (local10 == 10) {
			this.anInt7479 = 3;
			this.anInt7477 = 1536;
			this.anInt7475 = 512;
			this.anInt7478 = 2048;
		} else if (local10 == 11) {
			this.anInt7477 = 1536;
			this.anInt7479 = 3;
			this.anInt7475 = 512;
			this.anInt7478 = 4096;
		} else if (local10 == 6) {
			this.anInt7477 = 1280;
			this.anInt7478 = 2048;
			this.anInt7479 = 3;
			this.anInt7475 = 768;
		} else if (local10 == 7) {
			this.anInt7479 = 3;
			this.anInt7478 = 4096;
			this.anInt7477 = 1280;
			this.anInt7475 = 768;
		} else if (local10 == 8) {
			this.anInt7475 = 1024;
			this.anInt7479 = 3;
			this.anInt7477 = 1024;
			this.anInt7478 = 2048;
		} else if (local10 == 9) {
			this.anInt7479 = 3;
			this.anInt7478 = 4096;
			this.anInt7477 = 1024;
			this.anInt7475 = 1024;
		} else if (local10 == 14) {
			this.anInt7477 = 1280;
			this.anInt7478 = 2048;
			this.anInt7475 = 768;
			this.anInt7479 = 1;
		} else if (local10 == 15) {
			this.anInt7477 = 1536;
			this.anInt7478 = 4096;
			this.anInt7475 = 512;
			this.anInt7479 = 1;
		} else if (local10 == 16) {
			this.anInt7479 = 1;
			this.anInt7475 = 256;
			this.anInt7477 = 1792;
			this.anInt7478 = 8192;
		} else {
			this.anInt7479 = 0;
			this.anInt7475 = 2048;
			this.anInt7477 = 0;
			this.anInt7478 = 2048;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IBZ)V")
	public void method6619(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(73) int local73;
		if (arg1) {
			local73 = 2048;
		} else {
			@Pc(27) int local27 = arg0 * this.anInt7478 / 50 + this.anInt7472 & 0x7FF;
			@Pc(30) int local30 = this.anInt7479;
			if (local30 == 1) {
				local73 = (Class141.anIntArray207[local27 << 3] >> 4) + 1024;
			} else if (local30 == 3) {
				local73 = Static12.anIntArray16[local27] >> 1;
			} else if (local30 == 4) {
				local73 = local27 >> 10 << 11;
			} else if (local30 == 2) {
				local73 = local27;
			} else if (local30 == 5) {
				local73 = (local27 < 1024 ? local27 : 2048 - local27) << 1;
			} else {
				local73 = 2048;
			}
		}
		this.aClass14_Sub18_2.method8340((float) ((this.anInt7475 * local73 >> 11) + this.anInt7477) / 2048.0F);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	private void method6620(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass14_Sub18_2 = arg0.method6915(arg5, arg1, arg4, arg2, arg3, 1.0F);
	}
}
