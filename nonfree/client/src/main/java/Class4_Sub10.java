import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
	private final int anInt1058;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "Z")
	private final boolean aBoolean52;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
	private final int anInt1051;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
	private final int anInt1059;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
	private final int anInt1052;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "Z")
	private final boolean aBoolean53;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
	private final int anInt1050;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
	private final int anInt1045;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	private final int anInt1049;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
	private int anInt1057;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(ZLclient!wd;)V")
	public Class4_Sub10(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class354 arg1) {
		if (Static576.aString104.startsWith("win")) {
			this.anInt1058 = 1;
		} else if (Static576.aString104.startsWith("mac")) {
			this.anInt1058 = 2;
		} else if (Static576.aString104.startsWith("linux")) {
			this.anInt1058 = 3;
		} else {
			this.anInt1058 = 4;
		}
		if (Static576.aString100.startsWith("amd64") || Static576.aString100.startsWith("x86_64")) {
			this.aBoolean52 = true;
		} else {
			this.aBoolean52 = false;
		}
		if (this.anInt1058 == 1) {
			if (Static576.aString102.indexOf("4.0") != -1) {
				this.anInt1056 = 1;
			} else if (Static576.aString102.indexOf("4.1") != -1) {
				this.anInt1056 = 2;
			} else if (Static576.aString102.indexOf("4.9") != -1) {
				this.anInt1056 = 3;
			} else if (Static576.aString102.indexOf("5.0") != -1) {
				this.anInt1056 = 4;
			} else if (Static576.aString102.indexOf("5.1") != -1) {
				this.anInt1056 = 5;
			} else if (Static576.aString102.indexOf("6.0") != -1) {
				this.anInt1056 = 6;
			} else if (Static576.aString102.indexOf("6.1") != -1) {
				this.anInt1056 = 7;
			}
		} else if (this.anInt1058 == 2) {
			if (Static576.aString102.indexOf("10.4") != -1) {
				this.anInt1056 = 20;
			} else if (Static576.aString102.indexOf("10.5") != -1) {
				this.anInt1056 = 21;
			} else if (Static576.aString102.indexOf("10.6") != -1) {
				this.anInt1056 = 22;
			}
		}
		if (Static576.aString99.toLowerCase().indexOf("sun") != -1) {
			this.anInt1051 = 1;
		} else if (Static576.aString99.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt1051 = 2;
		} else if (Static576.aString99.toLowerCase().indexOf("apple") == -1) {
			this.anInt1051 = 4;
		} else {
			this.anInt1051 = 3;
		}
		@Pc(203) int local203 = 2;
		@Pc(205) int local205 = 0;
		@Pc(211) char local211;
		try {
			while (Static576.aString98.length() > local203) {
				local211 = Static576.aString98.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local211 + local205 * 10 - 48;
				local203++;
			}
		} catch (@Pc(241) Exception local241) {
		}
		this.anInt1059 = local205;
		local203 = Static576.aString98.indexOf(46, 2) + 1;
		local205 = 0;
		try {
			while (local203 < Static576.aString98.length()) {
				local211 = Static576.aString98.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local211 + local205 * 10 - 48;
				local203++;
			}
		} catch (@Pc(285) Exception local285) {
		}
		this.anInt1052 = local205;
		local203 = Static576.aString98.indexOf(95, 4) + 1;
		local205 = 0;
		try {
			while (local203 < Static576.aString98.length()) {
				local211 = Static576.aString98.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local211 + local205 * 10 - 48;
				local203++;
			}
		} catch (@Pc(325) Exception local325) {
		}
		if (arg1.aBoolean711) {
			this.aBoolean53 = false;
		} else {
			this.aBoolean53 = true;
		}
		this.anInt1050 = local205;
		if (this.anInt1059 <= 3) {
			this.anInt1045 = 0;
		} else {
			this.anInt1045 = Static594.anInt10250;
		}
		this.anInt1049 = Static577.anInt10067;
		try {
			this.anInt1054 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(364) Throwable local364) {
			this.anInt1054 = 0;
		}
		try {
			this.anInt1057 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(372) Throwable local372) {
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLclient!un;)V")
	public void method1074(@OriginalArg(1) Class4_Sub11 arg0) {
		arg0.method4957(3);
		arg0.method4957(this.anInt1058);
		arg0.method4957(this.aBoolean52 ? 1 : 0);
		arg0.method4957(this.anInt1056);
		arg0.method4957(this.anInt1051);
		arg0.method4957(this.anInt1059);
		arg0.method4957(this.anInt1052);
		arg0.method4957(this.anInt1050);
		arg0.method4957(this.aBoolean53 ? 1 : 0);
		arg0.method4937(this.anInt1049);
		arg0.method4957(this.anInt1045);
		arg0.method4893(this.anInt1054);
		arg0.method4909(this.anInt1057);
	}
}
