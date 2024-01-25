import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
	private final int anInt808;

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "Z")
	private final boolean aBoolean69;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
	private int anInt806;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
	private final int anInt798;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
	private final int anInt802;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
	private final int anInt809;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
	private final int anInt799;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
	private final int anInt797;

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
	private final int anInt801;

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "Z")
	private final boolean aBoolean70;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
	private int anInt804;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(ZLclient!ii;)V")
	public Class4_Sub8(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class161 arg1) {
		if (Static222.aString49.startsWith("win")) {
			this.anInt808 = 1;
		} else if (Static222.aString49.startsWith("mac")) {
			this.anInt808 = 2;
		} else if (Static222.aString49.startsWith("linux")) {
			this.anInt808 = 3;
		} else {
			this.anInt808 = 4;
		}
		if (Static222.aString52.startsWith("amd64") || Static222.aString52.startsWith("x86_64")) {
			this.aBoolean69 = true;
		} else {
			this.aBoolean69 = false;
		}
		if (this.anInt808 == 1) {
			if (Static222.aString48.indexOf("4.0") != -1) {
				this.anInt806 = 1;
			} else if (Static222.aString48.indexOf("4.1") != -1) {
				this.anInt806 = 2;
			} else if (Static222.aString48.indexOf("4.9") != -1) {
				this.anInt806 = 3;
			} else if (Static222.aString48.indexOf("5.0") != -1) {
				this.anInt806 = 4;
			} else if (Static222.aString48.indexOf("5.1") != -1) {
				this.anInt806 = 5;
			} else if (Static222.aString48.indexOf("6.0") != -1) {
				this.anInt806 = 6;
			} else if (Static222.aString48.indexOf("6.1") != -1) {
				this.anInt806 = 7;
			}
		} else if (this.anInt808 == 2) {
			if (Static222.aString48.indexOf("10.4") != -1) {
				this.anInt806 = 20;
			} else if (Static222.aString48.indexOf("10.5") != -1) {
				this.anInt806 = 21;
			} else if (Static222.aString48.indexOf("10.6") != -1) {
				this.anInt806 = 22;
			}
		}
		if (Static222.aString51.toLowerCase().indexOf("sun") != -1) {
			this.anInt798 = 1;
		} else if (Static222.aString51.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt798 = 2;
		} else if (Static222.aString51.toLowerCase().indexOf("apple") == -1) {
			this.anInt798 = 4;
		} else {
			this.anInt798 = 3;
		}
		@Pc(203) int local203 = 2;
		@Pc(205) int local205 = 0;
		@Pc(211) char local211;
		try {
			while (Static222.aString47.length() > local203) {
				local211 = Static222.aString47.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local205 * 10 + local211 - 48;
				local203++;
			}
		} catch (@Pc(241) Exception local241) {
		}
		this.anInt802 = local205;
		local203 = Static222.aString47.indexOf(46, 2) + 1;
		local205 = 0;
		try {
			while (local203 < Static222.aString47.length()) {
				local211 = Static222.aString47.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local211 + local205 * 10 - 48;
			}
		} catch (@Pc(289) Exception local289) {
		}
		this.anInt809 = local205;
		local203 = Static222.aString47.indexOf(95, 4) + 1;
		local205 = 0;
		try {
			while (local203 < Static222.aString47.length()) {
				local211 = Static222.aString47.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local205 * 10 + local211 - 48;
				local203++;
			}
		} catch (@Pc(335) Exception local335) {
		}
		if (this.anInt802 > 3) {
			this.anInt799 = Static536.anInt9062;
		} else {
			this.anInt799 = 0;
		}
		this.anInt797 = Static87.anInt2262;
		this.anInt801 = local205;
		if (arg1.aBoolean344) {
			this.aBoolean70 = false;
		} else {
			this.aBoolean70 = true;
		}
		try {
			this.anInt803 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(376) Throwable local376) {
			this.anInt803 = 0;
		}
		try {
			this.anInt804 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(384) Throwable local384) {
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!eh;)V")
	public void method698(@OriginalArg(1) Class4_Sub9 arg0) {
		arg0.method5961(-345277664, 3);
		arg0.method5961(-345277664, this.anInt808);
		arg0.method5961(-345277664, this.aBoolean69 ? 1 : 0);
		arg0.method5961(-345277664, this.anInt806);
		arg0.method5961(-345277664, this.anInt798);
		arg0.method5961(-345277664, this.anInt802);
		arg0.method5961(-345277664, this.anInt809);
		arg0.method5961(-345277664, this.anInt801);
		arg0.method5961(-345277664, this.aBoolean70 ? 1 : 0);
		arg0.method6012(this.anInt797);
		arg0.method5961(-345277664, this.anInt799);
		arg0.method6022(this.anInt803);
		arg0.method5963(this.anInt804);
	}
}
