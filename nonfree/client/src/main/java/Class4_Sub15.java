import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class4_Sub15 extends Class4 {

	@OriginalMember(owner = "client!fca", name = "q", descriptor = "Ljava/lang/String;")
	private String aString51;

	@OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
	private int anInt3013;

	@OriginalMember(owner = "client!fca", name = "s", descriptor = "I")
	private int anInt3014;

	@OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
	private int anInt3015;

	@OriginalMember(owner = "client!fca", name = "v", descriptor = "I")
	private int anInt3017;

	@OriginalMember(owner = "client!fca", name = "w", descriptor = "Ljava/lang/String;")
	private String aString52;

	@OriginalMember(owner = "client!fca", name = "y", descriptor = "I")
	private int anInt3019;

	@OriginalMember(owner = "client!fca", name = "z", descriptor = "I")
	private int anInt3020;

	@OriginalMember(owner = "client!fca", name = "A", descriptor = "I")
	private int anInt3021;

	@OriginalMember(owner = "client!fca", name = "C", descriptor = "I")
	private int anInt3023;

	@OriginalMember(owner = "client!fca", name = "D", descriptor = "Ljava/lang/String;")
	private String aString53;

	@OriginalMember(owner = "client!fca", name = "F", descriptor = "I")
	private int anInt3025;

	@OriginalMember(owner = "client!fca", name = "G", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!fca", name = "H", descriptor = "I")
	private int anInt3026;

	@OriginalMember(owner = "client!fca", name = "I", descriptor = "I")
	private int anInt3027;

	@OriginalMember(owner = "client!fca", name = "J", descriptor = "Z")
	private boolean aBoolean224;

	@OriginalMember(owner = "client!fca", name = "K", descriptor = "I")
	private int anInt3028;

	@OriginalMember(owner = "client!fca", name = "L", descriptor = "I")
	private int anInt3029;

	@OriginalMember(owner = "client!fca", name = "M", descriptor = "I")
	private int anInt3030;

	@OriginalMember(owner = "client!fca", name = "N", descriptor = "Z")
	private boolean aBoolean225;

	@OriginalMember(owner = "client!fca", name = "O", descriptor = "I")
	private int anInt3031;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
	private Class4_Sub15() {
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(ZLclient!wv;)V")
	public Class4_Sub15(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class366 arg1) {
		if (Static594.aString238.startsWith("win")) {
			this.anInt3023 = 1;
		} else if (Static594.aString238.startsWith("mac")) {
			this.anInt3023 = 2;
		} else if (Static594.aString238.startsWith("linux")) {
			this.anInt3023 = 3;
		} else {
			this.anInt3023 = 4;
		}
		if (Static594.aString241.startsWith("amd64") || Static594.aString241.startsWith("x86_64")) {
			this.aBoolean225 = true;
		} else {
			this.aBoolean225 = false;
		}
		if (this.anInt3023 == 1) {
			if (Static594.aString237.indexOf("4.0") != -1) {
				this.anInt3027 = 1;
			} else if (Static594.aString237.indexOf("4.1") != -1) {
				this.anInt3027 = 2;
			} else if (Static594.aString237.indexOf("4.9") != -1) {
				this.anInt3027 = 3;
			} else if (Static594.aString237.indexOf("5.0") != -1) {
				this.anInt3027 = 4;
			} else if (Static594.aString237.indexOf("5.1") != -1) {
				this.anInt3027 = 5;
			} else if (Static594.aString237.indexOf("6.0") != -1) {
				this.anInt3027 = 6;
			} else if (Static594.aString237.indexOf("6.1") != -1) {
				this.anInt3027 = 7;
			}
		} else if (this.anInt3023 == 2) {
			if (Static594.aString237.indexOf("10.4") != -1) {
				this.anInt3027 = 20;
			} else if (Static594.aString237.indexOf("10.5") != -1) {
				this.anInt3027 = 21;
			} else if (Static594.aString237.indexOf("10.6") != -1) {
				this.anInt3027 = 22;
			}
		}
		if (Static594.aString235.toLowerCase().indexOf("sun") != -1) {
			this.anInt3030 = 1;
		} else if (Static594.aString235.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt3030 = 2;
		} else if (Static594.aString235.toLowerCase().indexOf("apple") == -1) {
			this.anInt3030 = 4;
		} else {
			this.anInt3030 = 3;
		}
		@Pc(203) int local203 = 2;
		@Pc(205) int local205 = 0;
		@Pc(211) char local211;
		try {
			while (Static594.aString242.length() > local203) {
				local211 = Static594.aString242.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local211 + local205 * 10 - 48;
				local203++;
			}
		} catch (@Pc(238) Exception local238) {
		}
		this.anInt3026 = local205;
		local203 = Static594.aString242.indexOf(46, 2) + 1;
		local205 = 0;
		try {
			while (local203 < Static594.aString242.length()) {
				local211 = Static594.aString242.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local211 + local205 * 10 - 48;
			}
		} catch (@Pc(280) Exception local280) {
		}
		this.anInt3019 = local205;
		local203 = Static594.aString242.indexOf(95, 4) + 1;
		local205 = 0;
		try {
			while (local203 < Static594.aString242.length()) {
				local211 = Static594.aString242.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local211 + local205 * 10 - 48;
			}
		} catch (@Pc(323) Exception local323) {
		}
		if (this.anInt3026 > 3) {
			this.anInt3029 = Static22.anInt9830;
		} else {
			this.anInt3029 = 0;
		}
		this.anInt3017 = local205;
		if (arg1.aBoolean719) {
			this.aBoolean224 = false;
		} else {
			this.aBoolean224 = true;
		}
		this.anInt3013 = Static503.anInt9410;
		try {
			this.anInt3021 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(364) Throwable local364) {
			this.anInt3021 = 0;
		}
		try {
			@Pc(369) int[] local369 = HardwareInfo.getCPUInfo();
			if (local369 != null && local369.length == 7) {
				this.anInt3015 = local369[5];
				this.anInt3020 = local369[4];
				this.anInt3031 = local369[2];
				this.anInt3014 = local369[3];
			}
			@Pc(399) String[][] local399 = HardwareInfo.getDXDiagDisplayDevicesProps();
			@Pc(436) String local436;
			@Pc(440) int local440;
			if (local399 != null && local399.length > 0 && local399[0] != null) {
				for (@Pc(410) int local410 = 0; local410 < local399[0].length; local410 += 2) {
					if (local399[0][local410].equalsIgnoreCase("szDescription")) {
						this.aString54 = local399[0][local410 + 1];
					} else if (local399[0][local410].equalsIgnoreCase("szDriverDateEnglish")) {
						local436 = local399[0][local410 + 1];
						try {
							local440 = local436.indexOf("/");
							@Pc(447) int local447 = local436.indexOf("/", local440 + 1);
							this.anInt3025 = Integer.parseInt(local436.substring(0, local440));
							this.anInt3028 = Integer.parseInt(local436.substring(local447 + 1, local436.indexOf(" ", local447)));
						} catch (@Pc(468) Exception local468) {
						}
					}
				}
			}
			@Pc(492) String[] local492 = HardwareInfo.getDXDiagSystemProps();
			if (local492 != null) {
				local436 = "";
				@Pc(498) String local498 = "";
				@Pc(500) String local500 = "";
				for (@Pc(502) int local502 = 0; local502 < local492.length; local502 += 2) {
					if (local492[local502].equalsIgnoreCase("dwDirectXVersionMajor")) {
						local436 = local492[local502 + 1];
					} else if (local492[local502].equalsIgnoreCase("dwDirectXVersionMinor")) {
						local498 = local492[local502 + 1];
					} else if (local492[local502].equalsIgnoreCase("dwDirectXVersionLetter")) {
						local500 = local492[local502 + 1];
					}
				}
				this.aString51 = local436 + "." + local498 + local500;
			}
			@Pc(565) String[] local565 = HardwareInfo.getOpenGLProps();
			if (local565 != null) {
				for (local440 = 0; local440 < local565.length; local440 += 2) {
					if (local565[local440].equalsIgnoreCase("GL_RENDERER")) {
						this.aString53 = local565[local440 + 1];
					} else if (local565[local440].equalsIgnoreCase("GL_VERSION")) {
						this.aString52 = local565[local440 + 1];
					}
				}
			}
		} catch (@Pc(606) Throwable local606) {
		}
		if (this.aString53 == null) {
			this.aString53 = "";
		}
		if (this.aString54 == null) {
			this.aString54 = "";
		}
		if (this.aString51 == null) {
			this.aString51 = "";
		}
		if (this.aString52 == null) {
			this.aString52 = "";
		}
		this.method2444();
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
	private void method2444() {
		if (this.aString54.length() > 40) {
			this.aString54 = this.aString54.substring(0, 40);
		}
		if (this.aString53.length() > 40) {
			this.aString53 = this.aString53.substring(0, 40);
		}
		if (this.aString51.length() > 10) {
			this.aString51 = this.aString51.substring(0, 10);
		}
		if (this.aString52.length() > 10) {
			this.aString52 = this.aString52.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BLclient!ek;)V")
	public void method2445(@OriginalArg(1) Class4_Sub13 arg0) {
		arg0.method7052(5);
		arg0.method7052(this.anInt3023);
		arg0.method7052(this.aBoolean225 ? 1 : 0);
		arg0.method7052(this.anInt3027);
		arg0.method7052(this.anInt3030);
		arg0.method7052(this.anInt3026);
		arg0.method7052(this.anInt3019);
		arg0.method7052(this.anInt3017);
		arg0.method7052(this.aBoolean224 ? 1 : 0);
		arg0.method7038(this.anInt3013);
		arg0.method7052(this.anInt3029);
		arg0.method6997(this.anInt3021);
		arg0.method7038(this.anInt3031);
		arg0.method7052(this.anInt3014);
		arg0.method7052(this.anInt3020);
		arg0.method7052(this.anInt3015);
		arg0.method6992(this.aString54);
		arg0.method6992(this.aString53);
		arg0.method6992(this.aString51);
		arg0.method6992(this.aString52);
		arg0.method7052(this.anInt3025);
		arg0.method7038(this.anInt3028);
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)I")
	public int method2446() {
		@Pc(12) int local12 = Static326.method5065(this.aString54) + 23;
		@Pc(19) int local19 = local12 + Static326.method5065(this.aString53);
		@Pc(33) int local33 = local19 + Static326.method5065(this.aString51);
		return local33 + Static326.method5065(this.aString52);
	}
}
