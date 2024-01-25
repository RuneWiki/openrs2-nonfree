import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
	private final int anInt7115;

	@OriginalMember(owner = "client!qea", name = "r", descriptor = "Z")
	private final boolean aBoolean562;

	@OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
	private int anInt7121;

	@OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
	private final int anInt7118;

	@OriginalMember(owner = "client!qea", name = "k", descriptor = "I")
	private final int anInt7114;

	@OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
	private final int anInt7117;

	@OriginalMember(owner = "client!qea", name = "x", descriptor = "I")
	private final int anInt7124;

	@OriginalMember(owner = "client!qea", name = "u", descriptor = "Z")
	private final boolean aBoolean563;

	@OriginalMember(owner = "client!qea", name = "m", descriptor = "I")
	private final int anInt7116;

	@OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
	private final int anInt7125;

	@OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
	private int anInt7120;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
	private int anInt7113;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(ZLclient!n;)V")
	public Class3_Sub40(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class221 arg1) {
		if (Static342.aString82.startsWith("win")) {
			this.anInt7115 = 1;
		} else if (Static342.aString82.startsWith("mac")) {
			this.anInt7115 = 2;
		} else if (Static342.aString82.startsWith("linux")) {
			this.anInt7115 = 3;
		} else {
			this.anInt7115 = 4;
		}
		if (Static342.aString85.startsWith("amd64") || Static342.aString85.startsWith("x86_64")) {
			this.aBoolean562 = true;
		} else {
			this.aBoolean562 = false;
		}
		if (this.anInt7115 == 1) {
			if (Static342.aString83.indexOf("4.0") != -1) {
				this.anInt7121 = 1;
			} else if (Static342.aString83.indexOf("4.1") != -1) {
				this.anInt7121 = 2;
			} else if (Static342.aString83.indexOf("4.9") != -1) {
				this.anInt7121 = 3;
			} else if (Static342.aString83.indexOf("5.0") != -1) {
				this.anInt7121 = 4;
			} else if (Static342.aString83.indexOf("5.1") != -1) {
				this.anInt7121 = 5;
			} else if (Static342.aString83.indexOf("6.0") != -1) {
				this.anInt7121 = 6;
			} else if (Static342.aString83.indexOf("6.1") != -1) {
				this.anInt7121 = 7;
			}
		} else if (this.anInt7115 == 2) {
			if (Static342.aString83.indexOf("10.4") != -1) {
				this.anInt7121 = 20;
			} else if (Static342.aString83.indexOf("10.5") != -1) {
				this.anInt7121 = 21;
			} else if (Static342.aString83.indexOf("10.6") != -1) {
				this.anInt7121 = 22;
			}
		}
		if (Static342.aString81.toLowerCase().indexOf("sun") != -1) {
			this.anInt7118 = 1;
		} else if (Static342.aString81.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt7118 = 2;
		} else if (Static342.aString81.toLowerCase().indexOf("apple") == -1) {
			this.anInt7118 = 4;
		} else {
			this.anInt7118 = 3;
		}
		@Pc(202) int local202 = 2;
		@Pc(204) int local204 = 0;
		@Pc(210) char local210;
		try {
			while (local202 < Static342.aString86.length()) {
				local210 = Static342.aString86.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local204 = local210 + local204 * 10 - 48;
				local202++;
			}
		} catch (@Pc(240) Exception local240) {
		}
		this.anInt7114 = local204;
		local202 = Static342.aString86.indexOf(46, 2) + 1;
		local204 = 0;
		try {
			while (Static342.aString86.length() > local202) {
				local210 = Static342.aString86.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local204 = local210 + local204 * 10 - 48;
				local202++;
			}
		} catch (@Pc(284) Exception local284) {
		}
		this.anInt7117 = local204;
		local204 = 0;
		local202 = Static342.aString86.indexOf(95, 4) + 1;
		try {
			while (Static342.aString86.length() > local202) {
				local210 = Static342.aString86.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local202++;
				local204 = local210 + local204 * 10 - 48;
			}
		} catch (@Pc(325) Exception local325) {
		}
		if (this.anInt7114 > 3) {
			this.anInt7124 = Static142.anInt3029;
		} else {
			this.anInt7124 = 0;
		}
		if (arg1.aBoolean485) {
			this.aBoolean563 = false;
		} else {
			this.aBoolean563 = true;
		}
		this.anInt7116 = Static597.anInt9433;
		this.anInt7125 = local204;
		try {
			this.anInt7120 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(366) Throwable local366) {
			this.anInt7120 = 0;
		}
		try {
			this.anInt7113 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(374) Throwable local374) {
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method6068(@OriginalArg(0) Class3_Sub11 arg0) {
		arg0.method3079(3);
		arg0.method3079(this.anInt7115);
		arg0.method3079(this.aBoolean562 ? 1 : 0);
		arg0.method3079(this.anInt7121);
		arg0.method3079(this.anInt7118);
		arg0.method3079(this.anInt7114);
		arg0.method3079(this.anInt7117);
		arg0.method3079(this.anInt7125);
		arg0.method3079(this.aBoolean563 ? 1 : 0);
		arg0.method3131(this.anInt7116);
		arg0.method3079(this.anInt7124);
		arg0.method3077(this.anInt7120);
		arg0.method3101(this.anInt7113);
	}
}
