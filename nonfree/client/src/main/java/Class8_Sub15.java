import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class8_Sub15 extends Class8 {

	@OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
	private int anInt2565;

	@OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
	private int anInt2566;

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "Z")
	private boolean aBoolean193;

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
	private int anInt2567;

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
	private int anInt2568;

	@OriginalMember(owner = "client!dea", name = "q", descriptor = "I")
	private int anInt2571;

	@OriginalMember(owner = "client!dea", name = "s", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!dea", name = "t", descriptor = "I")
	private int anInt2573;

	@OriginalMember(owner = "client!dea", name = "v", descriptor = "I")
	public int anInt2575;

	@OriginalMember(owner = "client!dea", name = "x", descriptor = "I")
	private int anInt2576;

	@OriginalMember(owner = "client!dea", name = "y", descriptor = "I")
	private int anInt2577;

	@OriginalMember(owner = "client!dea", name = "z", descriptor = "Ljava/lang/String;")
	private String aString29;

	@OriginalMember(owner = "client!dea", name = "A", descriptor = "I")
	private int anInt2578;

	@OriginalMember(owner = "client!dea", name = "B", descriptor = "I")
	private int anInt2579;

	@OriginalMember(owner = "client!dea", name = "E", descriptor = "Ljava/lang/String;")
	private String aString30;

	@OriginalMember(owner = "client!dea", name = "F", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
	private int anInt2581;

	@OriginalMember(owner = "client!dea", name = "H", descriptor = "Z")
	private boolean aBoolean194;

	@OriginalMember(owner = "client!dea", name = "I", descriptor = "I")
	private int anInt2582;

	@OriginalMember(owner = "client!dea", name = "J", descriptor = "I")
	private int anInt2583;

	@OriginalMember(owner = "client!dea", name = "K", descriptor = "I")
	private int anInt2584;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V")
	private Class8_Sub15() {
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(ZLclient!gh;)V")
	public Class8_Sub15(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class118 arg1) {
		if (Static175.aString46.startsWith("win")) {
			this.anInt2573 = 1;
		} else if (Static175.aString46.startsWith("mac")) {
			this.anInt2573 = 2;
		} else if (Static175.aString46.startsWith("linux")) {
			this.anInt2573 = 3;
		} else {
			this.anInt2573 = 4;
		}
		if (Static175.aString51.startsWith("amd64") || Static175.aString51.startsWith("x86_64")) {
			this.aBoolean193 = true;
		} else {
			this.aBoolean193 = false;
		}
		if (this.anInt2573 == 1) {
			if (Static175.aString48.indexOf("4.0") != -1) {
				this.anInt2567 = 1;
			} else if (Static175.aString48.indexOf("4.1") != -1) {
				this.anInt2567 = 2;
			} else if (Static175.aString48.indexOf("4.9") != -1) {
				this.anInt2567 = 3;
			} else if (Static175.aString48.indexOf("5.0") != -1) {
				this.anInt2567 = 4;
			} else if (Static175.aString48.indexOf("5.1") != -1) {
				this.anInt2567 = 5;
			} else if (Static175.aString48.indexOf("6.0") != -1) {
				this.anInt2567 = 6;
			} else if (Static175.aString48.indexOf("6.1") != -1) {
				this.anInt2567 = 7;
			}
		} else if (this.anInt2573 == 2) {
			if (Static175.aString48.indexOf("10.4") != -1) {
				this.anInt2567 = 20;
			} else if (Static175.aString48.indexOf("10.5") != -1) {
				this.anInt2567 = 21;
			} else if (Static175.aString48.indexOf("10.6") != -1) {
				this.anInt2567 = 22;
			}
		}
		if (Static175.aString47.toLowerCase().indexOf("sun") != -1) {
			this.anInt2566 = 1;
		} else if (Static175.aString47.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt2566 = 2;
		} else if (Static175.aString47.toLowerCase().indexOf("apple") == -1) {
			this.anInt2566 = 4;
		} else {
			this.anInt2566 = 3;
		}
		@Pc(203) int local203 = 2;
		@Pc(205) int local205 = 0;
		@Pc(211) char local211;
		try {
			while (local203 < Static175.aString52.length()) {
				local211 = Static175.aString52.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local205 * 10 + local211 - 48;
				local203++;
			}
		} catch (@Pc(238) Exception local238) {
		}
		this.anInt2578 = local205;
		local203 = Static175.aString52.indexOf(46, 2) + 1;
		local205 = 0;
		try {
			while (Static175.aString52.length() > local203) {
				local211 = Static175.aString52.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local211 + local205 * 10 - 48;
				local203++;
			}
		} catch (@Pc(280) Exception local280) {
		}
		this.anInt2568 = local205;
		local203 = Static175.aString52.indexOf(95, 4) + 1;
		local205 = 0;
		try {
			while (Static175.aString52.length() > local203) {
				local211 = Static175.aString52.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local205 * 10 + local211 - 48;
				local203++;
			}
		} catch (@Pc(325) Exception local325) {
		}
		this.anInt2583 = local205;
		if (this.anInt2578 > 3) {
			this.anInt2581 = Static266.anInt5677;
		} else {
			this.anInt2581 = 0;
		}
		this.anInt2565 = Static153.anInt3785;
		if (arg1.aBoolean302) {
			this.aBoolean194 = false;
		} else {
			this.aBoolean194 = true;
		}
		try {
			@Pc(358) int[] local358 = HardwareInfo.getCPUInfo();
			if (local358 != null && local358.length == 7) {
				this.anInt2575 = local358[6];
				this.anInt2571 = local358[3];
				this.anInt2584 = local358[4];
				this.anInt2576 = local358[2];
				this.anInt2582 = local358[5];
			}
		} catch (@Pc(393) Throwable local393) {
			this.anInt2575 = 0;
		}
		if (this.aString28 == null) {
			this.aString28 = "";
		}
		if (this.aString29 == null) {
			this.aString29 = "";
		}
		if (this.aString31 == null) {
			this.aString31 = "";
		}
		if (this.aString30 == null) {
			this.aString30 = "";
		}
		this.method2185();
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)I")
	public int method2180() {
		@Pc(12) int local12 = Static35.method7923(this.aString31) + 23;
		@Pc(19) int local19 = local12 + Static35.method7923(this.aString28);
		@Pc(26) int local26 = local19 + Static35.method7923(this.aString30);
		return local26 + Static35.method7923(this.aString29);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILclient!ig;)V")
	public void method2183(@OriginalArg(1) Class8_Sub8 arg0) {
		arg0.method8562(5);
		arg0.method8562(this.anInt2573);
		arg0.method8562(this.aBoolean193 ? 1 : 0);
		arg0.method8562(this.anInt2567);
		arg0.method8562(this.anInt2566);
		arg0.method8562(this.anInt2578);
		arg0.method8562(this.anInt2568);
		arg0.method8562(this.anInt2583);
		arg0.method8562(this.aBoolean194 ? 1 : 0);
		arg0.method8548(this.anInt2565);
		arg0.method8562(this.anInt2581);
		arg0.method8542(this.anInt2575);
		arg0.method8548(this.anInt2576);
		arg0.method8562(this.anInt2571);
		arg0.method8562(this.anInt2584);
		arg0.method8562(this.anInt2582);
		arg0.method8579(this.aString31);
		arg0.method8579(this.aString28);
		arg0.method8579(this.aString30);
		arg0.method8579(this.aString29);
		arg0.method8562(this.anInt2579);
		arg0.method8548(this.anInt2577);
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)V")
	private void method2185() {
		if (this.aString31.length() > 40) {
			this.aString31 = this.aString31.substring(0, 40);
		}
		if (this.aString28.length() > 40) {
			this.aString28 = this.aString28.substring(0, 40);
		}
		if (this.aString30.length() > 10) {
			this.aString30 = this.aString30.substring(0, 10);
		}
		if (this.aString29.length() > 10) {
			this.aString29 = this.aString29.substring(0, 10);
		}
	}
}
