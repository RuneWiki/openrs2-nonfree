import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Z")
	private boolean aBoolean665;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "Ljava/lang/String;")
	private String aString96;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Ljava/lang/String;")
	private String aString97;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
	private int anInt9290;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Z")
	private boolean aBoolean666;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
	private int anInt9292;

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	private int anInt9293;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
	private int anInt9295;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
	private int anInt9296;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	private int anInt9297;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Ljava/lang/String;")
	private String aString98;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	private int anInt9298;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	private int anInt9299;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
	private int anInt9300;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
	private int anInt9301;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	public int anInt9302;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
	private int anInt9303;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	private int anInt9304;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	private int anInt9307;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Ljava/lang/String;")
	private String aString99;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
	private int anInt9308;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	private Class2_Sub42() {
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(ZLclient!qg;)V")
	public Class2_Sub42(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class286 arg1) {
		if (Static465.aString65.startsWith("win")) {
			this.anInt9297 = 1;
		} else if (Static465.aString65.startsWith("mac")) {
			this.anInt9297 = 2;
		} else if (Static465.aString65.startsWith("linux")) {
			this.anInt9297 = 3;
		} else {
			this.anInt9297 = 4;
		}
		if (Static465.aString68.startsWith("amd64") || Static465.aString68.startsWith("x86_64")) {
			this.aBoolean666 = true;
		} else {
			this.aBoolean666 = false;
		}
		if (this.anInt9297 == 1) {
			if (Static465.aString67.indexOf("4.0") != -1) {
				this.anInt9296 = 1;
			} else if (Static465.aString67.indexOf("4.1") != -1) {
				this.anInt9296 = 2;
			} else if (Static465.aString67.indexOf("4.9") != -1) {
				this.anInt9296 = 3;
			} else if (Static465.aString67.indexOf("5.0") != -1) {
				this.anInt9296 = 4;
			} else if (Static465.aString67.indexOf("5.1") != -1) {
				this.anInt9296 = 5;
			} else if (Static465.aString67.indexOf("6.0") != -1) {
				this.anInt9296 = 6;
			} else if (Static465.aString67.indexOf("6.1") != -1) {
				this.anInt9296 = 7;
			}
		} else if (this.anInt9297 == 2) {
			if (Static465.aString67.indexOf("10.4") != -1) {
				this.anInt9296 = 20;
			} else if (Static465.aString67.indexOf("10.5") != -1) {
				this.anInt9296 = 21;
			} else if (Static465.aString67.indexOf("10.6") != -1) {
				this.anInt9296 = 22;
			}
		}
		if (Static465.aString69.toLowerCase().indexOf("sun") != -1) {
			this.anInt9303 = 1;
		} else if (Static465.aString69.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt9303 = 2;
		} else if (Static465.aString69.toLowerCase().indexOf("apple") == -1) {
			this.anInt9303 = 4;
		} else {
			this.anInt9303 = 3;
		}
		@Pc(204) int local204 = 2;
		@Pc(206) int local206 = 0;
		@Pc(212) char local212;
		try {
			while (Static465.aString66.length() > local204) {
				local212 = Static465.aString66.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local206 = local206 * 10 + local212 - 48;
				local204++;
			}
		} catch (@Pc(236) Exception local236) {
		}
		this.anInt9298 = local206;
		local204 = Static465.aString66.indexOf(46, 2) + 1;
		local206 = 0;
		try {
			while (Static465.aString66.length() > local204) {
				local212 = Static465.aString66.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local204++;
				local206 = local212 + local206 * 10 - 48;
			}
		} catch (@Pc(283) Exception local283) {
		}
		this.anInt9307 = local206;
		local204 = Static465.aString66.indexOf(95, 4) + 1;
		local206 = 0;
		try {
			while (Static465.aString66.length() > local204) {
				local212 = Static465.aString66.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local204++;
				local206 = local212 + local206 * 10 - 48;
			}
		} catch (@Pc(329) Exception local329) {
		}
		this.anInt9301 = local206;
		this.anInt9304 = Static79.anInt2093;
		if (this.anInt9298 <= 3) {
			this.anInt9299 = 0;
		} else {
			this.anInt9299 = Static229.anInt4228;
		}
		if (arg1.aBoolean536) {
			this.aBoolean665 = false;
		} else {
			this.aBoolean665 = true;
		}
		try {
			@Pc(360) int[] local360 = HardwareInfo.getCPUInfo();
			if (local360 != null && local360.length == 7) {
				this.anInt9302 = local360[6];
				this.anInt9290 = local360[3];
				this.anInt9295 = local360[4];
				this.anInt9292 = local360[2];
				this.anInt9293 = local360[5];
			}
		} catch (@Pc(393) Throwable local393) {
			this.anInt9302 = 0;
		}
		if (this.aString97 == null) {
			this.aString97 = "";
		}
		if (this.aString99 == null) {
			this.aString99 = "";
		}
		if (this.aString96 == null) {
			this.aString96 = "";
		}
		if (this.aString98 == null) {
			this.aString98 = "";
		}
		this.method7905();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	private void method7905() {
		if (this.aString99.length() > 40) {
			this.aString99 = this.aString99.substring(0, 40);
		}
		if (this.aString96.length() > 40) {
			this.aString96 = this.aString96.substring(0, 40);
		}
		if (this.aString98.length() > 10) {
			this.aString98 = this.aString98.substring(0, 10);
		}
		if (this.aString97.length() > 10) {
			this.aString97 = this.aString97.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!sl;B)V")
	public void method7906(@OriginalArg(0) Class2_Sub17 arg0) {
		arg0.method2837(5);
		arg0.method2837(this.anInt9297);
		arg0.method2837(this.aBoolean666 ? 1 : 0);
		arg0.method2837(this.anInt9296);
		arg0.method2837(this.anInt9303);
		arg0.method2837(this.anInt9298);
		arg0.method2837(this.anInt9307);
		arg0.method2837(this.anInt9301);
		arg0.method2837(this.aBoolean665 ? 1 : 0);
		arg0.method2879(this.anInt9304);
		arg0.method2837(this.anInt9299);
		arg0.method2848(this.anInt9302);
		arg0.method2879(this.anInt9292);
		arg0.method2837(this.anInt9290);
		arg0.method2837(this.anInt9295);
		arg0.method2837(this.anInt9293);
		arg0.method2885(this.aString99);
		arg0.method2885(this.aString96);
		arg0.method2885(this.aString98);
		arg0.method2885(this.aString97);
		arg0.method2837(this.anInt9308);
		arg0.method2879(this.anInt9300);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
	public int method7907() {
		@Pc(17) int local17 = Static498.method6931(this.aString99) + 23;
		@Pc(24) int local24 = local17 + Static498.method6931(this.aString96);
		@Pc(31) int local31 = local24 + Static498.method6931(this.aString98);
		return local31 + Static498.method6931(this.aString97);
	}
}
