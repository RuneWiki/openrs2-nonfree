import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "I")
	private int anInt4575;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
	private int anInt4576;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "I")
	private int anInt4577;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
	private int anInt4578;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
	private int anInt4579;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "I")
	private int anInt4581;

	@OriginalMember(owner = "client!ip", name = "s", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
	private int anInt4583;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	private int anInt4584;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "I")
	private int anInt4585;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "Ljava/lang/String;")
	private String aString56;

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "I")
	private int anInt4586;

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
	private int anInt4587;

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "I")
	private int anInt4588;

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "Ljava/lang/String;")
	private String aString57;

	@OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
	private int anInt4589;

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "Z")
	private boolean aBoolean307;

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "Z")
	private boolean aBoolean308;

	@OriginalMember(owner = "client!ip", name = "G", descriptor = "Ljava/lang/String;")
	private String aString58;

	@OriginalMember(owner = "client!ip", name = "H", descriptor = "I")
	public int anInt4590;

	@OriginalMember(owner = "client!ip", name = "K", descriptor = "I")
	private int anInt4592;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	private Class3_Sub28() {
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(ZLclient!ec;)V")
	public Class3_Sub28(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class92 arg1) {
		if (Static126.aString34.startsWith("win")) {
			this.anInt4575 = 1;
		} else if (Static126.aString34.startsWith("mac")) {
			this.anInt4575 = 2;
		} else if (Static126.aString34.startsWith("linux")) {
			this.anInt4575 = 3;
		} else {
			this.anInt4575 = 4;
		}
		if (Static126.aString39.startsWith("amd64") || Static126.aString39.startsWith("x86_64")) {
			this.aBoolean308 = true;
		} else {
			this.aBoolean308 = false;
		}
		if (this.anInt4575 == 1) {
			if (Static126.aString35.indexOf("4.0") != -1) {
				this.anInt4585 = 1;
			} else if (Static126.aString35.indexOf("4.1") != -1) {
				this.anInt4585 = 2;
			} else if (Static126.aString35.indexOf("4.9") != -1) {
				this.anInt4585 = 3;
			} else if (Static126.aString35.indexOf("5.0") != -1) {
				this.anInt4585 = 4;
			} else if (Static126.aString35.indexOf("5.1") != -1) {
				this.anInt4585 = 5;
			} else if (Static126.aString35.indexOf("6.0") != -1) {
				this.anInt4585 = 6;
			} else if (Static126.aString35.indexOf("6.1") != -1) {
				this.anInt4585 = 7;
			}
		} else if (this.anInt4575 == 2) {
			if (Static126.aString35.indexOf("10.4") != -1) {
				this.anInt4585 = 20;
			} else if (Static126.aString35.indexOf("10.5") != -1) {
				this.anInt4585 = 21;
			} else if (Static126.aString35.indexOf("10.6") != -1) {
				this.anInt4585 = 22;
			}
		}
		if (Static126.aString38.toLowerCase().indexOf("sun") != -1) {
			this.anInt4577 = 1;
		} else if (Static126.aString38.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt4577 = 2;
		} else if (Static126.aString38.toLowerCase().indexOf("apple") == -1) {
			this.anInt4577 = 4;
		} else {
			this.anInt4577 = 3;
		}
		@Pc(203) int local203 = 2;
		@Pc(205) int local205 = 0;
		@Pc(211) char local211;
		try {
			while (Static126.aString40.length() > local203) {
				local211 = Static126.aString40.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local205 * 10 + local211 - 48;
			}
		} catch (@Pc(239) Exception local239) {
		}
		this.anInt4592 = local205;
		local203 = Static126.aString40.indexOf(46, 2) + 1;
		local205 = 0;
		try {
			while (local203 < Static126.aString40.length()) {
				local211 = Static126.aString40.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local211 + local205 * 10 - 48;
			}
		} catch (@Pc(284) Exception local284) {
		}
		this.anInt4576 = local205;
		local203 = Static126.aString40.indexOf(95, 4) + 1;
		local205 = 0;
		try {
			while (Static126.aString40.length() > local203) {
				local211 = Static126.aString40.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local211 + local205 * 10 - 48;
			}
		} catch (@Pc(331) Exception local331) {
		}
		this.anInt4587 = local205;
		this.anInt4584 = Static525.anInt8303;
		if (arg1.aBoolean172) {
			this.aBoolean307 = false;
		} else {
			this.aBoolean307 = true;
		}
		if (this.anInt4592 <= 3) {
			this.anInt4588 = 0;
		} else {
			this.anInt4588 = Static313.anInt9096;
		}
		try {
			@Pc(362) int[] local362 = HardwareInfo.getCPUInfo();
			if (local362 != null && local362.length == 7) {
				this.anInt4583 = local362[4];
				this.anInt4589 = local362[5];
				this.anInt4581 = local362[2];
				this.anInt4590 = local362[6];
				this.anInt4579 = local362[3];
			}
		} catch (@Pc(397) Throwable local397) {
			this.anInt4590 = 0;
		}
		if (this.aString57 == null) {
			this.aString57 = "";
		}
		if (this.aString56 == null) {
			this.aString56 = "";
		}
		if (this.aString58 == null) {
			this.aString58 = "";
		}
		if (this.aString55 == null) {
			this.aString55 = "";
		}
		this.method3898();
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)I")
	public int method3897() {
		@Pc(19) int local19 = Static237.method3582(this.aString56) + 23;
		@Pc(26) int local26 = local19 + Static237.method3582(this.aString55);
		@Pc(35) int local35 = local26 + Static237.method3582(this.aString58);
		return local35 + Static237.method3582(this.aString57);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	private void method3898() {
		if (this.aString56.length() > 40) {
			this.aString56 = this.aString56.substring(0, 40);
		}
		if (this.aString55.length() > 40) {
			this.aString55 = this.aString55.substring(0, 40);
		}
		if (this.aString58.length() > 10) {
			this.aString58 = this.aString58.substring(0, 10);
		}
		if (this.aString57.length() > 10) {
			this.aString57 = this.aString57.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BLclient!dt;)V")
	public void method3899(@OriginalArg(1) Class3_Sub4 arg0) {
		arg0.method7948(5);
		arg0.method7948(this.anInt4575);
		arg0.method7948(this.aBoolean308 ? 1 : 0);
		arg0.method7948(this.anInt4585);
		arg0.method7948(this.anInt4577);
		arg0.method7948(this.anInt4592);
		arg0.method7948(this.anInt4576);
		arg0.method7948(this.anInt4587);
		arg0.method7948(this.aBoolean307 ? 1 : 0);
		arg0.method7956(this.anInt4584);
		arg0.method7948(this.anInt4588);
		arg0.method7905(this.anInt4590);
		arg0.method7956(this.anInt4581);
		arg0.method7948(this.anInt4579);
		arg0.method7948(this.anInt4583);
		arg0.method7948(this.anInt4589);
		arg0.method7900(this.aString56);
		arg0.method7900(this.aString55);
		arg0.method7900(this.aString58);
		arg0.method7900(this.aString57);
		arg0.method7948(this.anInt4586);
		arg0.method7956(this.anInt4578);
	}
}
