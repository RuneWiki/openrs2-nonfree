import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
	private final int anInt596;

	@OriginalMember(owner = "client!bba", name = "D", descriptor = "Z")
	private final boolean aBoolean32;

	@OriginalMember(owner = "client!bba", name = "o", descriptor = "I")
	private int anInt592;

	@OriginalMember(owner = "client!bba", name = "u", descriptor = "I")
	private final int anInt598;

	@OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
	private final int anInt600;

	@OriginalMember(owner = "client!bba", name = "t", descriptor = "I")
	private final int anInt597;

	@OriginalMember(owner = "client!bba", name = "p", descriptor = "I")
	private final int anInt593;

	@OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
	private final int anInt595;

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "Z")
	private final boolean aBoolean31;

	@OriginalMember(owner = "client!bba", name = "v", descriptor = "I")
	private final int anInt599;

	@OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!bba", name = "m", descriptor = "I")
	private int anInt590;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(ZLclient!tt;)V")
	public Class6_Sub7(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class313 arg1) {
		if (Static508.aString77.startsWith("win")) {
			this.anInt596 = 1;
		} else if (Static508.aString77.startsWith("mac")) {
			this.anInt596 = 2;
		} else if (Static508.aString77.startsWith("linux")) {
			this.anInt596 = 3;
		} else {
			this.anInt596 = 4;
		}
		if (Static508.aString74.startsWith("amd64") || Static508.aString74.startsWith("x86_64")) {
			this.aBoolean32 = true;
		} else {
			this.aBoolean32 = false;
		}
		if (this.anInt596 == 1) {
			if (Static508.aString73.indexOf("4.0") != -1) {
				this.anInt592 = 1;
			} else if (Static508.aString73.indexOf("4.1") != -1) {
				this.anInt592 = 2;
			} else if (Static508.aString73.indexOf("4.9") != -1) {
				this.anInt592 = 3;
			} else if (Static508.aString73.indexOf("5.0") != -1) {
				this.anInt592 = 4;
			} else if (Static508.aString73.indexOf("5.1") != -1) {
				this.anInt592 = 5;
			} else if (Static508.aString73.indexOf("6.0") != -1) {
				this.anInt592 = 6;
			} else if (Static508.aString73.indexOf("6.1") != -1) {
				this.anInt592 = 7;
			}
		} else if (this.anInt596 == 2) {
			if (Static508.aString73.indexOf("10.4") != -1) {
				this.anInt592 = 20;
			} else if (Static508.aString73.indexOf("10.5") != -1) {
				this.anInt592 = 21;
			} else if (Static508.aString73.indexOf("10.6") != -1) {
				this.anInt592 = 22;
			}
		}
		if (Static508.aString76.toLowerCase().indexOf("sun") != -1) {
			this.anInt598 = 1;
		} else if (Static508.aString76.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt598 = 2;
		} else if (Static508.aString76.toLowerCase().indexOf("apple") == -1) {
			this.anInt598 = 4;
		} else {
			this.anInt598 = 3;
		}
		@Pc(205) int local205 = 2;
		@Pc(207) int local207 = 0;
		@Pc(213) char local213;
		try {
			while (local205 < Static508.aString78.length()) {
				local213 = Static508.aString78.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local207 = local213 + local207 * 10 - 48;
				local205++;
			}
		} catch (@Pc(241) Exception local241) {
		}
		this.anInt600 = local207;
		local205 = Static508.aString78.indexOf(46, 2) + 1;
		local207 = 0;
		try {
			while (Static508.aString78.length() > local205) {
				local213 = Static508.aString78.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local205++;
				local207 = local207 * 10 + local213 - 48;
			}
		} catch (@Pc(286) Exception local286) {
		}
		this.anInt597 = local207;
		local205 = Static508.aString78.indexOf(95, 4) + 1;
		local207 = 0;
		try {
			while (Static508.aString78.length() > local205) {
				local213 = Static508.aString78.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local205++;
				local207 = local213 + local207 * 10 - 48;
			}
		} catch (@Pc(332) Exception local332) {
		}
		if (this.anInt600 > 3) {
			this.anInt593 = Static182.anInt3500;
		} else {
			this.anInt593 = 0;
		}
		this.anInt595 = Static355.anInt6598;
		if (arg1.aBoolean569) {
			this.aBoolean31 = false;
		} else {
			this.aBoolean31 = true;
		}
		this.anInt599 = local207;
		try {
			this.anInt594 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(373) Throwable local373) {
			this.anInt594 = 0;
		}
		try {
			this.anInt590 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(381) Throwable local381) {
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!jr;B)V")
	public void method513(@OriginalArg(0) Class6_Sub12 arg0) {
		arg0.method6047(3);
		arg0.method6047(this.anInt596);
		arg0.method6047(this.aBoolean32 ? 1 : 0);
		arg0.method6047(this.anInt592);
		arg0.method6047(this.anInt598);
		arg0.method6047(this.anInt600);
		arg0.method6047(this.anInt597);
		arg0.method6047(this.anInt599);
		arg0.method6047(this.aBoolean31 ? 1 : 0);
		arg0.method6032(this.anInt595);
		arg0.method6047(this.anInt593);
		arg0.method6059(this.anInt594);
		arg0.method6042(this.anInt590);
	}
}
