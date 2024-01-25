import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!og", name = "H", descriptor = "I")
	public int anInt7309;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "Ljava/lang/String;")
	private String aString78;

	@OriginalMember(owner = "client!og", name = "N", descriptor = "I")
	public int anInt7311;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "I")
	private int anInt7312;

	@OriginalMember(owner = "client!og", name = "J", descriptor = "I")
	private int anInt7313;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "I")
	private int anInt7314;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "Ljava/lang/String;")
	private String aString79;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "I")
	private int anInt7316;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "Ljava/lang/String;")
	private String aString80;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "Z")
	private boolean aBoolean623;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "I")
	private int anInt7317;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "I")
	private int anInt7318;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "Z")
	private boolean aBoolean624;

	@OriginalMember(owner = "client!og", name = "B", descriptor = "I")
	private int anInt7320;

	@OriginalMember(owner = "client!og", name = "s", descriptor = "I")
	private int anInt7321;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "I")
	private int anInt7322;

	@OriginalMember(owner = "client!og", name = "A", descriptor = "I")
	private int anInt7324;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "I")
	private int anInt7325;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "Ljava/lang/String;")
	private String aString81;

	@OriginalMember(owner = "client!og", name = "D", descriptor = "I")
	private int anInt7327;

	@OriginalMember(owner = "client!og", name = "I", descriptor = "I")
	public int anInt7329;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	private Class2_Sub45() {
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(ZLclient!vo;)V")
	public Class2_Sub45(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class389 arg1) {
		if (Static688.aString122.startsWith("win")) {
			this.anInt7322 = 1;
		} else if (Static688.aString122.startsWith("mac")) {
			this.anInt7322 = 2;
		} else if (Static688.aString122.startsWith("linux")) {
			this.anInt7322 = 3;
		} else {
			this.anInt7322 = 4;
		}
		if (Static688.aString119.startsWith("amd64") || Static688.aString119.startsWith("x86_64")) {
			this.aBoolean623 = true;
		} else {
			this.aBoolean623 = false;
		}
		if (this.anInt7322 == 1) {
			if (Static688.aString124.indexOf("4.0") != -1) {
				this.anInt7314 = 1;
			} else if (Static688.aString124.indexOf("4.1") != -1) {
				this.anInt7314 = 2;
			} else if (Static688.aString124.indexOf("4.9") != -1) {
				this.anInt7314 = 3;
			} else if (Static688.aString124.indexOf("5.0") != -1) {
				this.anInt7314 = 4;
			} else if (Static688.aString124.indexOf("5.1") != -1) {
				this.anInt7314 = 5;
			} else if (Static688.aString124.indexOf("6.0") != -1) {
				this.anInt7314 = 6;
			} else if (Static688.aString124.indexOf("6.1") != -1) {
				this.anInt7314 = 7;
			}
		} else if (this.anInt7322 == 2) {
			if (Static688.aString124.indexOf("10.4") != -1) {
				this.anInt7314 = 20;
			} else if (Static688.aString124.indexOf("10.5") != -1) {
				this.anInt7314 = 21;
			} else if (Static688.aString124.indexOf("10.6") != -1) {
				this.anInt7314 = 22;
			} else if (Static688.aString124.indexOf("10.7") != -1) {
				this.anInt7314 = 23;
			}
		}
		if (Static688.aString118.toLowerCase().indexOf("sun") != -1) {
			this.anInt7318 = 1;
		} else if (Static688.aString118.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt7318 = 2;
		} else if (Static688.aString118.toLowerCase().indexOf("apple") == -1) {
			this.anInt7318 = 4;
		} else {
			this.anInt7318 = 3;
		}
		@Pc(332) int local332 = 2;
		@Pc(334) int local334 = 0;
		@Pc(340) char local340;
		try {
			while (Static688.aString121.length() > local332) {
				local340 = Static688.aString121.charAt(local332);
				if (local340 < '0' || local340 > '9') {
					break;
				}
				local332++;
				local334 = local334 * 10 + local340 - 48;
			}
		} catch (@Pc(375) Exception local375) {
		}
		this.anInt7329 = local334;
		local334 = 0;
		local332 = Static688.aString121.indexOf(46, 2) + 1;
		try {
			while (local332 < Static688.aString121.length()) {
				local340 = Static688.aString121.charAt(local332);
				if (local340 < '0' || local340 > '9') {
					break;
				}
				local332++;
				local334 = local334 * 10 + local340 - 48;
			}
		} catch (@Pc(431) Exception local431) {
		}
		this.anInt7325 = local334;
		local332 = Static688.aString121.indexOf(95, 4) + 1;
		local334 = 0;
		try {
			while (local332 < Static688.aString121.length()) {
				local340 = Static688.aString121.charAt(local332);
				if (local340 < '0' || local340 > '9') {
					break;
				}
				local334 = local334 * 10 + local340 - 48;
				local332++;
			}
		} catch (@Pc(482) Exception local482) {
		}
		if (this.anInt7329 <= 3) {
			this.anInt7317 = 0;
		} else {
			this.anInt7317 = Static610.anInt10726;
		}
		if (arg1.aBoolean913) {
			this.aBoolean624 = false;
		} else {
			this.aBoolean624 = true;
		}
		this.anInt7309 = local334;
		this.anInt7321 = Static510.anInt8117;
		try {
			@Pc(521) int[] local521 = HardwareInfo.getCPUInfo();
			if (local521 != null && local521.length == 7) {
				this.anInt7316 = local521[5];
				this.anInt7320 = local521[3];
				this.anInt7311 = local521[6];
				this.anInt7327 = local521[4];
				this.anInt7324 = local521[2];
			}
		} catch (@Pc(558) Throwable local558) {
			this.anInt7311 = 0;
		}
		if (this.aString79 == null) {
			this.aString79 = "";
		}
		if (this.aString78 == null) {
			this.aString78 = "";
		}
		if (this.aString81 == null) {
			this.aString81 = "";
		}
		if (this.aString80 == null) {
			this.aString80 = "";
		}
		this.method6595();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I")
	public int method6591() {
		@Pc(20) int local20 = Static205.method2900(this.aString81) + 23;
		@Pc(27) int local27 = local20 + Static205.method2900(this.aString80);
		@Pc(34) int local34 = local27 + Static205.method2900(this.aString78);
		return local34 + Static205.method2900(this.aString79);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!et;B)V")
	public void method6593(@OriginalArg(0) Class2_Sub20 arg0) {
		arg0.method8584(5);
		arg0.method8584(this.anInt7322);
		arg0.method8584(this.aBoolean623 ? 1 : 0);
		arg0.method8584(this.anInt7314);
		arg0.method8584(this.anInt7318);
		arg0.method8584(this.anInt7329);
		arg0.method8584(this.anInt7325);
		arg0.method8584(this.anInt7309);
		arg0.method8584(this.aBoolean624 ? 1 : 0);
		arg0.method8551(this.anInt7321);
		arg0.method8584(this.anInt7317);
		arg0.method8585(this.anInt7311);
		arg0.method8551(this.anInt7324);
		arg0.method8584(this.anInt7320);
		arg0.method8584(this.anInt7327);
		arg0.method8584(this.anInt7316);
		arg0.method8539(this.aString81);
		arg0.method8539(this.aString80);
		arg0.method8539(this.aString78);
		arg0.method8539(this.aString79);
		arg0.method8584(this.anInt7312);
		arg0.method8551(this.anInt7313);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	private void method6595() {
		if (this.aString81.length() > 40) {
			this.aString81 = this.aString81.substring(0, 40);
		}
		if (this.aString80.length() > 40) {
			this.aString80 = this.aString80.substring(0, 40);
		}
		if (this.aString78.length() > 10) {
			this.aString78 = this.aString78.substring(0, 10);
		}
		if (this.aString79.length() > 10) {
			this.aString79 = this.aString79.substring(0, 10);
		}
	}
}
