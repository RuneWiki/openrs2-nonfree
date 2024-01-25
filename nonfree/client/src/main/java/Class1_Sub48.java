import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class1_Sub48 extends Class1 {

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	private final int anInt9498;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Z")
	private final boolean aBoolean742;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	private int anInt9497;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	private final int anInt9499;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
	private final int anInt9507;

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
	private final int anInt9504;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Z")
	private final boolean aBoolean743;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	private final int anInt9500;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
	private final int anInt9506;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
	private final int anInt9496;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	private int anInt9501;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
	private int anInt9505;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(ZLclient!ft;)V")
	public Class1_Sub48(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class109 arg1) {
		if (Static148.aString19.startsWith("win")) {
			this.anInt9498 = 1;
		} else if (Static148.aString19.startsWith("mac")) {
			this.anInt9498 = 2;
		} else if (Static148.aString19.startsWith("linux")) {
			this.anInt9498 = 3;
		} else {
			this.anInt9498 = 4;
		}
		if (Static148.aString24.startsWith("amd64") || Static148.aString24.startsWith("x86_64")) {
			this.aBoolean742 = true;
		} else {
			this.aBoolean742 = false;
		}
		if (this.anInt9498 == 1) {
			if (Static148.aString21.indexOf("4.0") != -1) {
				this.anInt9497 = 1;
			} else if (Static148.aString21.indexOf("4.1") != -1) {
				this.anInt9497 = 2;
			} else if (Static148.aString21.indexOf("4.9") != -1) {
				this.anInt9497 = 3;
			} else if (Static148.aString21.indexOf("5.0") != -1) {
				this.anInt9497 = 4;
			} else if (Static148.aString21.indexOf("5.1") != -1) {
				this.anInt9497 = 5;
			} else if (Static148.aString21.indexOf("6.0") != -1) {
				this.anInt9497 = 6;
			} else if (Static148.aString21.indexOf("6.1") != -1) {
				this.anInt9497 = 7;
			}
		} else if (this.anInt9498 == 2) {
			if (Static148.aString21.indexOf("10.4") != -1) {
				this.anInt9497 = 20;
			} else if (Static148.aString21.indexOf("10.5") != -1) {
				this.anInt9497 = 21;
			} else if (Static148.aString21.indexOf("10.6") != -1) {
				this.anInt9497 = 22;
			}
		}
		if (Static148.aString20.toLowerCase().indexOf("sun") != -1) {
			this.anInt9499 = 1;
		} else if (Static148.aString20.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt9499 = 2;
		} else if (Static148.aString20.toLowerCase().indexOf("apple") == -1) {
			this.anInt9499 = 4;
		} else {
			this.anInt9499 = 3;
		}
		@Pc(205) int local205 = 2;
		@Pc(207) int local207 = 0;
		@Pc(213) char local213;
		try {
			while (local205 < Static148.aString22.length()) {
				local213 = Static148.aString22.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local207 = local207 * 10 + local213 - 48;
				local205++;
			}
		} catch (@Pc(238) Exception local238) {
		}
		this.anInt9507 = local207;
		local205 = Static148.aString22.indexOf(46, 2) + 1;
		local207 = 0;
		try {
			while (local205 < Static148.aString22.length()) {
				local213 = Static148.aString22.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local207 = local213 + local207 * 10 - 48;
				local205++;
			}
		} catch (@Pc(286) Exception local286) {
		}
		this.anInt9504 = local207;
		local205 = Static148.aString22.indexOf(95, 4) + 1;
		local207 = 0;
		try {
			while (local205 < Static148.aString22.length()) {
				local213 = Static148.aString22.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local205++;
				local207 = local213 + local207 * 10 - 48;
			}
		} catch (@Pc(333) Exception local333) {
		}
		if (arg1.aBoolean206) {
			this.aBoolean743 = false;
		} else {
			this.aBoolean743 = true;
		}
		if (this.anInt9507 > 3) {
			this.anInt9500 = Static464.anInt7967;
		} else {
			this.anInt9500 = 0;
		}
		this.anInt9506 = Static117.anInt2297;
		this.anInt9496 = local207;
		try {
			this.anInt9501 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(374) Throwable local374) {
			this.anInt9501 = 0;
		}
		try {
			this.anInt9505 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(382) Throwable local382) {
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method7749(@OriginalArg(0) Class1_Sub35 arg0) {
		arg0.method5777(3);
		arg0.method5777(this.anInt9498);
		arg0.method5777(this.aBoolean742 ? 1 : 0);
		arg0.method5777(this.anInt9497);
		arg0.method5777(this.anInt9499);
		arg0.method5777(this.anInt9507);
		arg0.method5777(this.anInt9504);
		arg0.method5777(this.anInt9496);
		arg0.method5777(this.aBoolean743 ? 1 : 0);
		arg0.method5776(this.anInt9506);
		arg0.method5777(this.anInt9500);
		arg0.method5755(this.anInt9501);
		arg0.method5792(this.anInt9505);
	}
}
