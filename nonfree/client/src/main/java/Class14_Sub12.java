import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cja")
public final class Class14_Sub12 extends Class14 {

	@OriginalMember(owner = "client!cja", name = "C", descriptor = "I")
	public int anInt1225;

	@OriginalMember(owner = "client!cja", name = "t", descriptor = "I")
	public int anInt1226;

	@OriginalMember(owner = "client!cja", name = "z", descriptor = "I")
	private int anInt1227;

	@OriginalMember(owner = "client!cja", name = "J", descriptor = "I")
	private int anInt1228;

	@OriginalMember(owner = "client!cja", name = "l", descriptor = "I")
	public int anInt1229;

	@OriginalMember(owner = "client!cja", name = "x", descriptor = "Ljava/lang/String;")
	private String aString22;

	@OriginalMember(owner = "client!cja", name = "B", descriptor = "Z")
	private boolean aBoolean76;

	@OriginalMember(owner = "client!cja", name = "q", descriptor = "I")
	private int anInt1231;

	@OriginalMember(owner = "client!cja", name = "H", descriptor = "I")
	private int anInt1233;

	@OriginalMember(owner = "client!cja", name = "m", descriptor = "I")
	private int anInt1234;

	@OriginalMember(owner = "client!cja", name = "E", descriptor = "Ljava/lang/String;")
	private String aString23;

	@OriginalMember(owner = "client!cja", name = "I", descriptor = "Ljava/lang/String;")
	private String aString24;

	@OriginalMember(owner = "client!cja", name = "p", descriptor = "I")
	private int anInt1235;

	@OriginalMember(owner = "client!cja", name = "u", descriptor = "I")
	private int anInt1236;

	@OriginalMember(owner = "client!cja", name = "s", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!cja", name = "w", descriptor = "I")
	private int anInt1237;

	@OriginalMember(owner = "client!cja", name = "K", descriptor = "I")
	private int anInt1238;

	@OriginalMember(owner = "client!cja", name = "v", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!cja", name = "G", descriptor = "I")
	private int anInt1239;

	@OriginalMember(owner = "client!cja", name = "D", descriptor = "I")
	private int anInt1240;

	@OriginalMember(owner = "client!cja", name = "n", descriptor = "I")
	private int anInt1241;

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "()V")
	private Class14_Sub12() {
	}

	@OriginalMember(owner = "client!cja", name = "<init>", descriptor = "(ZLclient!iha;)V")
	public Class14_Sub12(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class173 arg1) {
		if (Static251.aString65.startsWith("win")) {
			this.anInt1241 = 1;
		} else if (Static251.aString65.startsWith("mac")) {
			this.anInt1241 = 2;
		} else if (Static251.aString65.startsWith("linux")) {
			this.anInt1241 = 3;
		} else {
			this.anInt1241 = 4;
		}
		if (Static251.aString61.startsWith("amd64") || Static251.aString61.startsWith("x86_64")) {
			this.aBoolean76 = true;
		} else {
			this.aBoolean76 = false;
		}
		if (this.anInt1241 == 1) {
			if (Static251.aString59.indexOf("4.0") != -1) {
				this.anInt1235 = 1;
			} else if (Static251.aString59.indexOf("4.1") != -1) {
				this.anInt1235 = 2;
			} else if (Static251.aString59.indexOf("4.9") != -1) {
				this.anInt1235 = 3;
			} else if (Static251.aString59.indexOf("5.0") != -1) {
				this.anInt1235 = 4;
			} else if (Static251.aString59.indexOf("5.1") != -1) {
				this.anInt1235 = 5;
			} else if (Static251.aString59.indexOf("6.0") != -1) {
				this.anInt1235 = 6;
			} else if (Static251.aString59.indexOf("6.1") != -1) {
				this.anInt1235 = 7;
			}
		} else if (this.anInt1241 == 2) {
			if (Static251.aString59.indexOf("10.4") != -1) {
				this.anInt1235 = 20;
			} else if (Static251.aString59.indexOf("10.5") != -1) {
				this.anInt1235 = 21;
			} else if (Static251.aString59.indexOf("10.6") != -1) {
				this.anInt1235 = 22;
			} else if (Static251.aString59.indexOf("10.7") != -1) {
				this.anInt1235 = 23;
			}
		}
		if (Static251.aString62.toLowerCase().indexOf("sun") != -1) {
			this.anInt1239 = 1;
		} else if (Static251.aString62.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt1239 = 2;
		} else if (Static251.aString62.toLowerCase().indexOf("apple") == -1) {
			this.anInt1239 = 4;
		} else {
			this.anInt1239 = 3;
		}
		@Pc(327) int local327 = 2;
		@Pc(329) int local329 = 0;
		@Pc(335) char local335;
		try {
			while (Static251.aString64.length() > local327) {
				local335 = Static251.aString64.charAt(local327);
				if (local335 < '0' || local335 > '9') {
					break;
				}
				local329 = local329 * 10 + local335 - 48;
				local327++;
			}
		} catch (@Pc(366) Exception local366) {
		}
		this.anInt1229 = local329;
		local327 = Static251.aString64.indexOf(46, 2) + 1;
		local329 = 0;
		try {
			while (Static251.aString64.length() > local327) {
				local335 = Static251.aString64.charAt(local327);
				if (local335 < '0' || local335 > '9') {
					break;
				}
				local327++;
				local329 = local335 + local329 * 10 - 48;
			}
		} catch (@Pc(421) Exception local421) {
		}
		this.anInt1237 = local329;
		local329 = 0;
		local327 = Static251.aString64.indexOf(95, 4) + 1;
		try {
			while (Static251.aString64.length() > local327) {
				local335 = Static251.aString64.charAt(local327);
				if (local335 < '0' || local335 > '9') {
					break;
				}
				local327++;
				local329 = local335 + local329 * 10 - 48;
			}
		} catch (@Pc(468) Exception local468) {
		}
		this.anInt1225 = local329;
		if (arg1.aBoolean358) {
			this.aBoolean77 = false;
		} else {
			this.aBoolean77 = true;
		}
		if (this.anInt1229 <= 3) {
			this.anInt1227 = 0;
		} else {
			this.anInt1227 = Static438.anInt7394;
		}
		this.anInt1240 = Static360.anInt6168;
		try {
			@Pc(509) int[] local509 = HardwareInfo.getCPUInfo();
			if (local509 != null && local509.length == 7) {
				this.anInt1234 = local509[5];
				this.anInt1233 = local509[4];
				this.anInt1226 = local509[6];
				this.anInt1228 = local509[2];
				this.anInt1238 = local509[3];
			}
		} catch (@Pc(546) Throwable local546) {
			this.anInt1226 = 0;
		}
		if (this.aString23 == null) {
			this.aString23 = "";
		}
		if (this.aString24 == null) {
			this.aString24 = "";
		}
		if (this.aString25 == null) {
			this.aString25 = "";
		}
		if (this.aString22 == null) {
			this.aString22 = "";
		}
		this.method1250();
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method1247(@OriginalArg(0) Class14_Sub21 arg0) {
		arg0.method7747(5);
		arg0.method7747(this.anInt1241);
		arg0.method7747(this.aBoolean76 ? 1 : 0);
		arg0.method7747(this.anInt1235);
		arg0.method7747(this.anInt1239);
		arg0.method7747(this.anInt1229);
		arg0.method7747(this.anInt1237);
		arg0.method7747(this.anInt1225);
		arg0.method7747(this.aBoolean77 ? 1 : 0);
		arg0.method7751(this.anInt1240);
		arg0.method7747(this.anInt1227);
		arg0.method7696(this.anInt1226);
		arg0.method7751(this.anInt1228);
		arg0.method7747(this.anInt1238);
		arg0.method7747(this.anInt1233);
		arg0.method7747(this.anInt1234);
		arg0.method7723(this.aString25);
		arg0.method7723(this.aString22);
		arg0.method7723(this.aString24);
		arg0.method7723(this.aString23);
		arg0.method7747(this.anInt1236);
		arg0.method7751(this.anInt1231);
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)I")
	public int method1248() {
		@Pc(20) int local20 = Static378.method5827(this.aString25) + 23;
		@Pc(27) int local27 = local20 + Static378.method5827(this.aString22);
		@Pc(34) int local34 = local27 + Static378.method5827(this.aString24);
		return local34 + Static378.method5827(this.aString23);
	}

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "(B)V")
	private void method1250() {
		if (this.aString25.length() > 40) {
			this.aString25 = this.aString25.substring(0, 40);
		}
		if (this.aString22.length() > 40) {
			this.aString22 = this.aString22.substring(0, 40);
		}
		if (this.aString24.length() > 10) {
			this.aString24 = this.aString24.substring(0, 10);
		}
		if (this.aString23.length() > 10) {
			this.aString23 = this.aString23.substring(0, 10);
		}
	}
}
