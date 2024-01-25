import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	private int anInt7201;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	private int anInt7202;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	private int anInt7203;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	private int anInt7204;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
	private int anInt7206;

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "Z")
	private boolean aBoolean516;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
	private int anInt7207;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
	private int anInt7209;

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
	private int anInt7210;

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
	private int anInt7211;

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "Z")
	private boolean aBoolean517;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
	public int anInt7213;

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
	private int anInt7214;

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
	private int anInt7215;

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
	private int anInt7216;

	@OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
	private int anInt7217;

	@OriginalMember(owner = "client!ok", name = "F", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
	private int anInt7218;

	@OriginalMember(owner = "client!ok", name = "H", descriptor = "Ljava/lang/String;")
	private String aString56;

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "Ljava/lang/String;")
	private String aString57;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	private Class3_Sub38() {
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(ZLclient!rp;)V")
	public Class3_Sub38(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class298 arg1) {
		if (Static501.aString78.startsWith("win")) {
			this.anInt7218 = 1;
		} else if (Static501.aString78.startsWith("mac")) {
			this.anInt7218 = 2;
		} else if (Static501.aString78.startsWith("linux")) {
			this.anInt7218 = 3;
		} else {
			this.anInt7218 = 4;
		}
		if (Static501.aString75.startsWith("amd64") || Static501.aString75.startsWith("x86_64")) {
			this.aBoolean517 = true;
		} else {
			this.aBoolean517 = false;
		}
		if (this.anInt7218 == 1) {
			if (Static501.aString77.indexOf("4.0") != -1) {
				this.anInt7217 = 1;
			} else if (Static501.aString77.indexOf("4.1") != -1) {
				this.anInt7217 = 2;
			} else if (Static501.aString77.indexOf("4.9") != -1) {
				this.anInt7217 = 3;
			} else if (Static501.aString77.indexOf("5.0") != -1) {
				this.anInt7217 = 4;
			} else if (Static501.aString77.indexOf("5.1") != -1) {
				this.anInt7217 = 5;
			} else if (Static501.aString77.indexOf("6.0") != -1) {
				this.anInt7217 = 6;
			} else if (Static501.aString77.indexOf("6.1") != -1) {
				this.anInt7217 = 7;
			}
		} else if (this.anInt7218 == 2) {
			if (Static501.aString77.indexOf("10.4") != -1) {
				this.anInt7217 = 20;
			} else if (Static501.aString77.indexOf("10.5") != -1) {
				this.anInt7217 = 21;
			} else if (Static501.aString77.indexOf("10.6") != -1) {
				this.anInt7217 = 22;
			}
		}
		if (Static501.aString73.toLowerCase().indexOf("sun") != -1) {
			this.anInt7206 = 1;
		} else if (Static501.aString73.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt7206 = 2;
		} else if (Static501.aString73.toLowerCase().indexOf("apple") == -1) {
			this.anInt7206 = 4;
		} else {
			this.anInt7206 = 3;
		}
		@Pc(200) int local200 = 2;
		@Pc(202) int local202 = 0;
		@Pc(208) char local208;
		try {
			while (local200 < Static501.aString79.length()) {
				local208 = Static501.aString79.charAt(local200);
				if (local208 < '0' || local208 > '9') {
					break;
				}
				local200++;
				local202 = local208 + local202 * 10 - 48;
			}
		} catch (@Pc(233) Exception local233) {
		}
		this.anInt7201 = local202;
		local202 = 0;
		local200 = Static501.aString79.indexOf(46, 2) + 1;
		try {
			while (local200 < Static501.aString79.length()) {
				local208 = Static501.aString79.charAt(local200);
				if (local208 < '0' || local208 > '9') {
					break;
				}
				local200++;
				local202 = local208 + local202 * 10 - 48;
			}
		} catch (@Pc(275) Exception local275) {
		}
		this.anInt7215 = local202;
		local200 = Static501.aString79.indexOf(95, 4) + 1;
		local202 = 0;
		try {
			while (local200 < Static501.aString79.length()) {
				local208 = Static501.aString79.charAt(local200);
				if (local208 < '0' || local208 > '9') {
					break;
				}
				local200++;
				local202 = local208 + local202 * 10 - 48;
			}
		} catch (@Pc(321) Exception local321) {
		}
		this.anInt7204 = Static248.anInt4899;
		if (this.anInt7201 <= 3) {
			this.anInt7202 = 0;
		} else {
			this.anInt7202 = Static259.anInt5056;
		}
		this.anInt7207 = local202;
		if (arg1.aBoolean613) {
			this.aBoolean516 = false;
		} else {
			this.aBoolean516 = true;
		}
		try {
			@Pc(352) int[] local352 = HardwareInfo.getCPUInfo();
			if (local352 != null && local352.length == 7) {
				this.anInt7213 = local352[6];
				this.anInt7214 = local352[4];
				this.anInt7216 = local352[3];
				this.anInt7211 = local352[2];
				this.anInt7203 = local352[5];
			}
		} catch (@Pc(387) Throwable local387) {
			this.anInt7213 = 0;
		}
		if (this.aString56 == null) {
			this.aString56 = "";
		}
		if (this.aString54 == null) {
			this.aString54 = "";
		}
		if (this.aString55 == null) {
			this.aString55 = "";
		}
		if (this.aString57 == null) {
			this.aString57 = "";
		}
		this.method6363();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)I")
	public int method6359() {
		@Pc(12) int local12 = Static558.method7937(this.aString54) + 23;
		@Pc(19) int local19 = local12 + Static558.method7937(this.aString57);
		@Pc(26) int local26 = local19 + Static558.method7937(this.aString56);
		return local26 + Static558.method7937(this.aString55);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!dc;B)V")
	public void method6361(@OriginalArg(0) Class3_Sub9 arg0) {
		arg0.method5572(5);
		arg0.method5572(this.anInt7218);
		arg0.method5572(this.aBoolean517 ? 1 : 0);
		arg0.method5572(this.anInt7217);
		arg0.method5572(this.anInt7206);
		arg0.method5572(this.anInt7201);
		arg0.method5572(this.anInt7215);
		arg0.method5572(this.anInt7207);
		arg0.method5572(this.aBoolean516 ? 1 : 0);
		arg0.method5620(this.anInt7204);
		arg0.method5572(this.anInt7202);
		arg0.method5592(this.anInt7213);
		arg0.method5620(this.anInt7211);
		arg0.method5572(this.anInt7216);
		arg0.method5572(this.anInt7214);
		arg0.method5572(this.anInt7203);
		arg0.method5614(this.aString54);
		arg0.method5614(this.aString57);
		arg0.method5614(this.aString56);
		arg0.method5614(this.aString55);
		arg0.method5572(this.anInt7209);
		arg0.method5620(this.anInt7210);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
	private void method6363() {
		if (this.aString54.length() > 40) {
			this.aString54 = this.aString54.substring(0, 40);
		}
		if (this.aString57.length() > 40) {
			this.aString57 = this.aString57.substring(0, 40);
		}
		if (this.aString56.length() > 10) {
			this.aString56 = this.aString56.substring(0, 10);
		}
		if (this.aString55.length() > 10) {
			this.aString55 = this.aString55.substring(0, 10);
		}
	}
}
