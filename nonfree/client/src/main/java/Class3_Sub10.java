import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bja")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!bja", name = "n", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!bja", name = "p", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!bja", name = "q", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!bja", name = "r", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!bja", name = "s", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!bja", name = "t", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!bja", name = "v", descriptor = "I")
	private int anInt1050;

	@OriginalMember(owner = "client!bja", name = "w", descriptor = "I")
	private int anInt1051;

	@OriginalMember(owner = "client!bja", name = "x", descriptor = "I")
	private int anInt1052;

	@OriginalMember(owner = "client!bja", name = "y", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!bja", name = "A", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!bja", name = "B", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!bja", name = "D", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!bja", name = "E", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!bja", name = "F", descriptor = "Z")
	private boolean aBoolean76;

	@OriginalMember(owner = "client!bja", name = "G", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!bja", name = "H", descriptor = "I")
	public int anInt1059;

	@OriginalMember(owner = "client!bja", name = "I", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!bja", name = "K", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!bja", name = "L", descriptor = "I")
	private int anInt1063;

	@OriginalMember(owner = "client!bja", name = "N", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "()V")
	private Class3_Sub10() {
	}

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(ZLclient!qn;)V")
	public Class3_Sub10(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class291 arg1) {
		if (Static497.aString91.startsWith("win")) {
			this.anInt1052 = 1;
		} else if (Static497.aString91.startsWith("mac")) {
			this.anInt1052 = 2;
		} else if (Static497.aString91.startsWith("linux")) {
			this.anInt1052 = 3;
		} else {
			this.anInt1052 = 4;
		}
		if (Static497.aString98.startsWith("amd64") || Static497.aString98.startsWith("x86_64")) {
			this.aBoolean77 = true;
		} else {
			this.aBoolean77 = false;
		}
		if (this.anInt1052 == 1) {
			if (Static497.aString92.indexOf("4.0") != -1) {
				this.anInt1050 = 1;
			} else if (Static497.aString92.indexOf("4.1") != -1) {
				this.anInt1050 = 2;
			} else if (Static497.aString92.indexOf("4.9") != -1) {
				this.anInt1050 = 3;
			} else if (Static497.aString92.indexOf("5.0") != -1) {
				this.anInt1050 = 4;
			} else if (Static497.aString92.indexOf("5.1") != -1) {
				this.anInt1050 = 5;
			} else if (Static497.aString92.indexOf("6.0") != -1) {
				this.anInt1050 = 6;
			} else if (Static497.aString92.indexOf("6.1") != -1) {
				this.anInt1050 = 7;
			}
		} else if (this.anInt1052 == 2) {
			if (Static497.aString92.indexOf("10.4") != -1) {
				this.anInt1050 = 20;
			} else if (Static497.aString92.indexOf("10.5") != -1) {
				this.anInt1050 = 21;
			} else if (Static497.aString92.indexOf("10.6") != -1) {
				this.anInt1050 = 22;
			}
		}
		if (Static497.aString96.toLowerCase().indexOf("sun") != -1) {
			this.anInt1060 = 1;
		} else if (Static497.aString96.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt1060 = 2;
		} else if (Static497.aString96.toLowerCase().indexOf("apple") == -1) {
			this.anInt1060 = 4;
		} else {
			this.anInt1060 = 3;
		}
		@Pc(205) int local205 = 2;
		@Pc(207) int local207 = 0;
		@Pc(213) char local213;
		try {
			while (local205 < Static497.aString93.length()) {
				local213 = Static497.aString93.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local205++;
				local207 = local213 + local207 * 10 - 48;
			}
		} catch (@Pc(237) Exception local237) {
		}
		this.anInt1046 = local207;
		local205 = Static497.aString93.indexOf(46, 2) + 1;
		local207 = 0;
		try {
			while (local205 < Static497.aString93.length()) {
				local213 = Static497.aString93.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local205++;
				local207 = local213 + local207 * 10 - 48;
			}
		} catch (@Pc(283) Exception local283) {
		}
		this.anInt1055 = local207;
		local205 = Static497.aString93.indexOf(95, 4) + 1;
		local207 = 0;
		try {
			while (local205 < Static497.aString93.length()) {
				local213 = Static497.aString93.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local207 = local207 * 10 + local213 - 48;
				local205++;
			}
		} catch (@Pc(332) Exception local332) {
		}
		if (this.anInt1046 <= 3) {
			this.anInt1047 = 0;
		} else {
			this.anInt1047 = Static474.anInt7831;
		}
		this.anInt1058 = Static387.anInt6096;
		if (arg1.aBoolean619) {
			this.aBoolean76 = false;
		} else {
			this.aBoolean76 = true;
		}
		this.anInt1057 = local207;
		try {
			@Pc(363) int[] local363 = HardwareInfo.getCPUInfo();
			if (local363 != null && local363.length == 7) {
				this.anInt1048 = local363[4];
				this.anInt1062 = local363[3];
				this.anInt1063 = local363[2];
				this.anInt1059 = local363[6];
				this.anInt1054 = local363[5];
			}
		} catch (@Pc(398) Throwable local398) {
			this.anInt1059 = 0;
		}
		if (this.aString6 == null) {
			this.aString6 = "";
		}
		if (this.aString3 == null) {
			this.aString3 = "";
		}
		if (this.aString4 == null) {
			this.aString4 = "";
		}
		if (this.aString5 == null) {
			this.aString5 = "";
		}
		this.method1122();
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method1119(@OriginalArg(0) Class3_Sub25 arg0) {
		arg0.method8614(5);
		arg0.method8614(this.anInt1052);
		arg0.method8614(this.aBoolean77 ? 1 : 0);
		arg0.method8614(this.anInt1050);
		arg0.method8614(this.anInt1060);
		arg0.method8614(this.anInt1046);
		arg0.method8614(this.anInt1055);
		arg0.method8614(this.anInt1057);
		arg0.method8614(this.aBoolean76 ? 1 : 0);
		arg0.method8649(this.anInt1058);
		arg0.method8614(this.anInt1047);
		arg0.method8642(this.anInt1059);
		arg0.method8649(this.anInt1063);
		arg0.method8614(this.anInt1062);
		arg0.method8614(this.anInt1048);
		arg0.method8614(this.anInt1054);
		arg0.method8635(this.aString5);
		arg0.method8635(this.aString3);
		arg0.method8635(this.aString6);
		arg0.method8635(this.aString4);
		arg0.method8614(this.anInt1051);
		arg0.method8649(this.anInt1056);
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)I")
	public int method1120() {
		@Pc(17) int local17 = Static248.method4122(this.aString5) + 23;
		@Pc(24) int local24 = local17 + Static248.method4122(this.aString3);
		@Pc(31) int local31 = local24 + Static248.method4122(this.aString6);
		return local31 + Static248.method4122(this.aString4);
	}

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "(I)V")
	private void method1122() {
		if (this.aString5.length() > 40) {
			this.aString5 = this.aString5.substring(0, 40);
		}
		if (this.aString3.length() > 40) {
			this.aString3 = this.aString3.substring(0, 40);
		}
		if (this.aString6.length() > 10) {
			this.aString6 = this.aString6.substring(0, 10);
		}
		if (this.aString4.length() > 10) {
			this.aString4 = this.aString4.substring(0, 10);
		}
	}
}
