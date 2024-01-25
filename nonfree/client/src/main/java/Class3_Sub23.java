import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
	private int anInt4376;

	@OriginalMember(owner = "client!gl", name = "k", descriptor = "Ljava/lang/String;")
	private String aString40;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
	private int anInt4377;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	private int anInt4379;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "Z")
	private boolean aBoolean373;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
	private int anInt4380;

	@OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
	private int anInt4381;

	@OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
	private int anInt4382;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	private int anInt4383;

	@OriginalMember(owner = "client!gl", name = "u", descriptor = "Ljava/lang/String;")
	private String aString42;

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
	private int anInt4384;

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "I")
	private int anInt4386;

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
	private int anInt4387;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
	private int anInt4388;

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
	private int anInt4389;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
	private int anInt4390;

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "Z")
	private boolean aBoolean374;

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
	private int anInt4393;

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "Ljava/lang/String;")
	private String aString43;

	@OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
	public int anInt4394;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	private Class3_Sub23() {
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(ZLclient!nga;)V")
	public Class3_Sub23(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class228 arg1) {
		if (Static372.aString79.startsWith("win")) {
			this.anInt4389 = 1;
		} else if (Static372.aString79.startsWith("mac")) {
			this.anInt4389 = 2;
		} else if (Static372.aString79.startsWith("linux")) {
			this.anInt4389 = 3;
		} else {
			this.anInt4389 = 4;
		}
		if (Static372.aString78.startsWith("amd64") || Static372.aString78.startsWith("x86_64")) {
			this.aBoolean374 = true;
		} else {
			this.aBoolean374 = false;
		}
		if (this.anInt4389 == 1) {
			if (Static372.aString81.indexOf("4.0") != -1) {
				this.anInt4393 = 1;
			} else if (Static372.aString81.indexOf("4.1") != -1) {
				this.anInt4393 = 2;
			} else if (Static372.aString81.indexOf("4.9") != -1) {
				this.anInt4393 = 3;
			} else if (Static372.aString81.indexOf("5.0") != -1) {
				this.anInt4393 = 4;
			} else if (Static372.aString81.indexOf("5.1") != -1) {
				this.anInt4393 = 5;
			} else if (Static372.aString81.indexOf("6.0") != -1) {
				this.anInt4393 = 6;
			} else if (Static372.aString81.indexOf("6.1") != -1) {
				this.anInt4393 = 7;
			}
		} else if (this.anInt4389 == 2) {
			if (Static372.aString81.indexOf("10.4") != -1) {
				this.anInt4393 = 20;
			} else if (Static372.aString81.indexOf("10.5") != -1) {
				this.anInt4393 = 21;
			} else if (Static372.aString81.indexOf("10.6") != -1) {
				this.anInt4393 = 22;
			}
		}
		if (Static372.aString76.toLowerCase().indexOf("sun") != -1) {
			this.anInt4386 = 1;
		} else if (Static372.aString76.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt4386 = 2;
		} else if (Static372.aString76.toLowerCase().indexOf("apple") == -1) {
			this.anInt4386 = 4;
		} else {
			this.anInt4386 = 3;
		}
		@Pc(210) int local210 = 2;
		@Pc(212) int local212 = 0;
		@Pc(218) char local218;
		try {
			while (local210 < Static372.aString83.length()) {
				local218 = Static372.aString83.charAt(local210);
				if (local218 < '0' || local218 > '9') {
					break;
				}
				local210++;
				local212 = local218 + local212 * 10 - 48;
			}
		} catch (@Pc(242) Exception local242) {
		}
		this.anInt4377 = local212;
		local212 = 0;
		local210 = Static372.aString83.indexOf(46, 2) + 1;
		try {
			while (Static372.aString83.length() > local210) {
				local218 = Static372.aString83.charAt(local210);
				if (local218 < '0' || local218 > '9') {
					break;
				}
				local210++;
				local212 = local212 * 10 + local218 - 48;
			}
		} catch (@Pc(283) Exception local283) {
		}
		this.anInt4382 = local212;
		local210 = Static372.aString83.indexOf(95, 4) + 1;
		local212 = 0;
		try {
			while (local210 < Static372.aString83.length()) {
				local218 = Static372.aString83.charAt(local210);
				if (local218 < '0' || local218 > '9') {
					break;
				}
				local212 = local218 + local212 * 10 - 48;
				local210++;
			}
		} catch (@Pc(325) Exception local325) {
		}
		this.anInt4387 = Static6.anInt66;
		this.anInt4383 = local212;
		if (arg1.aBoolean614) {
			this.aBoolean373 = false;
		} else {
			this.aBoolean373 = true;
		}
		if (this.anInt4377 > 3) {
			this.anInt4381 = Static88.anInt2308;
		} else {
			this.anInt4381 = 0;
		}
		try {
			@Pc(356) int[] local356 = HardwareInfo.getCPUInfo();
			if (local356 != null && local356.length == 7) {
				this.anInt4384 = local356[3];
				this.anInt4379 = local356[4];
				this.anInt4380 = local356[2];
				this.anInt4394 = local356[6];
				this.anInt4390 = local356[5];
			}
		} catch (@Pc(391) Throwable local391) {
			Static544.method7724(local391.getMessage() + " (Recovered)", local391);
			this.anInt4394 = 0;
		}
		if (this.aString40 == null) {
			this.aString40 = "";
		}
		if (this.aString41 == null) {
			this.aString41 = "";
		}
		if (this.aString42 == null) {
			this.aString42 = "";
		}
		if (this.aString43 == null) {
			this.aString43 = "";
		}
		this.method3735();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)I")
	public int method3732() {
		@Pc(12) int local12 = Static620.method8466(this.aString41) + 23;
		@Pc(19) int local19 = local12 + Static620.method8466(this.aString43);
		@Pc(26) int local26 = local19 + Static620.method8466(this.aString40);
		return local26 + Static620.method8466(this.aString42);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!tn;)V")
	public void method3734(@OriginalArg(1) Class3_Sub15 arg0) {
		arg0.method8448(5);
		arg0.method8448(this.anInt4389);
		arg0.method8448(this.aBoolean374 ? 1 : 0);
		arg0.method8448(this.anInt4393);
		arg0.method8448(this.anInt4386);
		arg0.method8448(this.anInt4377);
		arg0.method8448(this.anInt4382);
		arg0.method8448(this.anInt4383);
		arg0.method8448(this.aBoolean373 ? 1 : 0);
		arg0.method8464(this.anInt4387);
		arg0.method8448(this.anInt4381);
		arg0.method8436(this.anInt4394);
		arg0.method8464(this.anInt4380);
		arg0.method8448(this.anInt4384);
		arg0.method8448(this.anInt4379);
		arg0.method8448(this.anInt4390);
		arg0.method8437(this.aString41);
		arg0.method8437(this.aString43);
		arg0.method8437(this.aString40);
		arg0.method8437(this.aString42);
		arg0.method8448(this.anInt4376);
		arg0.method8464(this.anInt4388);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	private void method3735() {
		if (this.aString41.length() > 40) {
			this.aString41 = this.aString41.substring(0, 40);
		}
		if (this.aString43.length() > 40) {
			this.aString43 = this.aString43.substring(0, 40);
		}
		if (this.aString40.length() > 10) {
			this.aString40 = this.aString40.substring(0, 10);
		}
		if (this.aString42.length() > 10) {
			this.aString42 = this.aString42.substring(0, 10);
		}
	}
}
