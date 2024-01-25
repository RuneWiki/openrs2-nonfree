import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
	private int anInt6044;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	private int anInt6045;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	private int anInt6047;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Z")
	private boolean aBoolean407;

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	private int anInt6050;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
	private int anInt6051;

	@OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
	private int anInt6052;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
	private int anInt6053;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "Ljava/lang/String;")
	private String aString75;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Z")
	private boolean aBoolean408;

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
	private int anInt6055;

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
	private int anInt6056;

	@OriginalMember(owner = "client!lh", name = "D", descriptor = "Ljava/lang/String;")
	private String aString76;

	@OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
	private int anInt6058;

	@OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
	private int anInt6059;

	@OriginalMember(owner = "client!lh", name = "I", descriptor = "Ljava/lang/String;")
	private String aString77;

	@OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
	private int anInt6060;

	@OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
	public int anInt6061;

	@OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
	private int anInt6062;

	@OriginalMember(owner = "client!lh", name = "M", descriptor = "Ljava/lang/String;")
	private String aString78;

	@OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
	private int anInt6063;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	private Class6_Sub28() {
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ZLclient!ge;)V")
	public Class6_Sub28(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class112 arg1) {
		if (Static177.aString41.startsWith("win")) {
			this.anInt6058 = 1;
		} else if (Static177.aString41.startsWith("mac")) {
			this.anInt6058 = 2;
		} else if (Static177.aString41.startsWith("linux")) {
			this.anInt6058 = 3;
		} else {
			this.anInt6058 = 4;
		}
		if (Static177.aString39.startsWith("amd64") || Static177.aString39.startsWith("x86_64")) {
			this.aBoolean407 = true;
		} else {
			this.aBoolean407 = false;
		}
		if (this.anInt6058 == 1) {
			if (Static177.aString45.indexOf("4.0") != -1) {
				this.anInt6051 = 1;
			} else if (Static177.aString45.indexOf("4.1") != -1) {
				this.anInt6051 = 2;
			} else if (Static177.aString45.indexOf("4.9") != -1) {
				this.anInt6051 = 3;
			} else if (Static177.aString45.indexOf("5.0") != -1) {
				this.anInt6051 = 4;
			} else if (Static177.aString45.indexOf("5.1") != -1) {
				this.anInt6051 = 5;
			} else if (Static177.aString45.indexOf("6.0") != -1) {
				this.anInt6051 = 6;
			} else if (Static177.aString45.indexOf("6.1") != -1) {
				this.anInt6051 = 7;
			}
		} else if (this.anInt6058 == 2) {
			if (Static177.aString45.indexOf("10.4") != -1) {
				this.anInt6051 = 20;
			} else if (Static177.aString45.indexOf("10.5") != -1) {
				this.anInt6051 = 21;
			} else if (Static177.aString45.indexOf("10.6") != -1) {
				this.anInt6051 = 22;
			}
		}
		if (Static177.aString43.toLowerCase().indexOf("sun") != -1) {
			this.anInt6047 = 1;
		} else if (Static177.aString43.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt6047 = 2;
		} else if (Static177.aString43.toLowerCase().indexOf("apple") == -1) {
			this.anInt6047 = 4;
		} else {
			this.anInt6047 = 3;
		}
		@Pc(203) int local203 = 2;
		@Pc(205) int local205 = 0;
		@Pc(211) char local211;
		try {
			while (Static177.aString46.length() > local203) {
				local211 = Static177.aString46.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local205 * 10 + local211 - 48;
				local203++;
			}
		} catch (@Pc(238) Exception local238) {
		}
		this.anInt6060 = local205;
		local205 = 0;
		local203 = Static177.aString46.indexOf(46, 2) + 1;
		try {
			while (Static177.aString46.length() > local203) {
				local211 = Static177.aString46.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local205 * 10 + local211 - 48;
				local203++;
			}
		} catch (@Pc(281) Exception local281) {
		}
		this.anInt6052 = local205;
		local205 = 0;
		local203 = Static177.aString46.indexOf(95, 4) + 1;
		try {
			while (local203 < Static177.aString46.length()) {
				local211 = Static177.aString46.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local211 + local205 * 10 - '0';
			}
		} catch (@Pc(322) Exception local322) {
		}
		this.anInt6059 = Static396.anInt7427;
		if (this.anInt6060 <= 3) {
			this.anInt6050 = 0;
		} else {
			this.anInt6050 = Static90.anInt1831;
		}
		if (arg1.aBoolean263) {
			this.aBoolean408 = false;
		} else {
			this.aBoolean408 = true;
		}
		this.anInt6053 = local205;
		try {
			@Pc(355) int[] local355 = HardwareInfo.getCPUInfo();
			if (local355 != null && local355.length == 7) {
				this.anInt6061 = local355[6];
				this.anInt6055 = local355[4];
				this.anInt6062 = local355[3];
				this.anInt6063 = local355[2];
				this.anInt6045 = local355[5];
			}
		} catch (@Pc(388) Throwable local388) {
			this.anInt6061 = 0;
		}
		if (this.aString75 == null) {
			this.aString75 = "";
		}
		if (this.aString76 == null) {
			this.aString76 = "";
		}
		if (this.aString77 == null) {
			this.aString77 = "";
		}
		if (this.aString78 == null) {
			this.aString78 = "";
		}
		this.method5289();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!rg;)V")
	public void method5286(@OriginalArg(1) Class6_Sub40 arg0) {
		arg0.method8589(5);
		arg0.method8589(this.anInt6058);
		arg0.method8589(this.aBoolean407 ? 1 : 0);
		arg0.method8589(this.anInt6051);
		arg0.method8589(this.anInt6047);
		arg0.method8589(this.anInt6060);
		arg0.method8589(this.anInt6052);
		arg0.method8589(this.anInt6053);
		arg0.method8589(this.aBoolean408 ? 1 : 0);
		arg0.method8561(this.anInt6059);
		arg0.method8589(this.anInt6050);
		arg0.method8613(this.anInt6061);
		arg0.method8561(this.anInt6063);
		arg0.method8589(this.anInt6062);
		arg0.method8589(this.anInt6055);
		arg0.method8589(this.anInt6045);
		arg0.method8584(this.aString77);
		arg0.method8584(this.aString76);
		arg0.method8584(this.aString78);
		arg0.method8584(this.aString75);
		arg0.method8589(this.anInt6056);
		arg0.method8561(this.anInt6044);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)I")
	public int method5287() {
		@Pc(12) int local12 = Static284.method6787(this.aString77) + 23;
		@Pc(19) int local19 = local12 + Static284.method6787(this.aString76);
		@Pc(34) int local34 = local19 + Static284.method6787(this.aString78);
		return local34 + Static284.method6787(this.aString75);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	private void method5289() {
		if (this.aString77.length() > 40) {
			this.aString77 = this.aString77.substring(0, 40);
		}
		if (this.aString76.length() > 40) {
			this.aString76 = this.aString76.substring(0, 40);
		}
		if (this.aString78.length() > 10) {
			this.aString78 = this.aString78.substring(0, 10);
		}
		if (this.aString75.length() > 10) {
			this.aString75 = this.aString75.substring(0, 10);
		}
	}
}
