import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
	private final int anInt5457;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "Z")
	private final boolean aBoolean433;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
	private int anInt5461;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
	private final int anInt5467;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	private final int anInt5456;

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
	private final int anInt5460;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
	private final int anInt5466;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
	private final int anInt5463;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
	private final int anInt5465;

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "Z")
	private final boolean aBoolean434;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
	private int anInt5459;

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
	private int anInt5458;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(ZLclient!rj;)V")
	public Class2_Sub28(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class287 arg1) {
		if (Static464.aString79.startsWith("win")) {
			this.anInt5457 = 1;
		} else if (Static464.aString79.startsWith("mac")) {
			this.anInt5457 = 2;
		} else if (Static464.aString79.startsWith("linux")) {
			this.anInt5457 = 3;
		} else {
			this.anInt5457 = 4;
		}
		if (Static464.aString75.startsWith("amd64") || Static464.aString75.startsWith("x86_64")) {
			this.aBoolean433 = true;
		} else {
			this.aBoolean433 = false;
		}
		if (this.anInt5457 == 1) {
			if (Static464.aString76.indexOf("4.0") != -1) {
				this.anInt5461 = 1;
			} else if (Static464.aString76.indexOf("4.1") != -1) {
				this.anInt5461 = 2;
			} else if (Static464.aString76.indexOf("4.9") != -1) {
				this.anInt5461 = 3;
			} else if (Static464.aString76.indexOf("5.0") != -1) {
				this.anInt5461 = 4;
			} else if (Static464.aString76.indexOf("5.1") != -1) {
				this.anInt5461 = 5;
			} else if (Static464.aString76.indexOf("6.0") != -1) {
				this.anInt5461 = 6;
			} else if (Static464.aString76.indexOf("6.1") != -1) {
				this.anInt5461 = 7;
			}
		} else if (this.anInt5457 == 2) {
			if (Static464.aString76.indexOf("10.4") != -1) {
				this.anInt5461 = 20;
			} else if (Static464.aString76.indexOf("10.5") != -1) {
				this.anInt5461 = 21;
			} else if (Static464.aString76.indexOf("10.6") != -1) {
				this.anInt5461 = 22;
			}
		}
		if (Static464.aString77.toLowerCase().indexOf("sun") != -1) {
			this.anInt5467 = 1;
		} else if (Static464.aString77.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt5467 = 2;
		} else if (Static464.aString77.toLowerCase().indexOf("apple") == -1) {
			this.anInt5467 = 4;
		} else {
			this.anInt5467 = 3;
		}
		@Pc(205) int local205 = 2;
		@Pc(207) int local207 = 0;
		@Pc(213) char local213;
		try {
			while (local205 < Static464.aString82.length()) {
				local213 = Static464.aString82.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local207 = local213 + local207 * 10 - 48;
				local205++;
			}
		} catch (@Pc(235) Exception local235) {
		}
		this.anInt5456 = local207;
		local205 = Static464.aString82.indexOf(46, 2) + 1;
		local207 = 0;
		try {
			while (local205 < Static464.aString82.length()) {
				local213 = Static464.aString82.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local207 = local213 + local207 * 10 - 48;
				local205++;
			}
		} catch (@Pc(280) Exception local280) {
		}
		this.anInt5460 = local207;
		local205 = Static464.aString82.indexOf(95, 4) + 1;
		local207 = 0;
		try {
			while (Static464.aString82.length() > local205) {
				local213 = Static464.aString82.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local207 = local213 + local207 * 10 - 48;
				local205++;
			}
		} catch (@Pc(322) Exception local322) {
		}
		if (this.anInt5456 > 3) {
			this.anInt5466 = Static534.anInt8751;
		} else {
			this.anInt5466 = 0;
		}
		this.anInt5463 = Static440.anInt7756;
		this.anInt5465 = local207;
		if (arg1.aBoolean630) {
			this.aBoolean434 = false;
		} else {
			this.aBoolean434 = true;
		}
		try {
			this.anInt5459 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(361) Throwable local361) {
			this.anInt5459 = 0;
		}
		try {
			this.anInt5458 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(369) Throwable local369) {
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!es;I)V")
	public void method4574(@OriginalArg(0) Class2_Sub15 arg0) {
		arg0.method4333(3);
		arg0.method4333(this.anInt5457);
		arg0.method4333(this.aBoolean433 ? 1 : 0);
		arg0.method4333(this.anInt5461);
		arg0.method4333(this.anInt5467);
		arg0.method4333(this.anInt5456);
		arg0.method4333(this.anInt5460);
		arg0.method4333(this.anInt5465);
		arg0.method4333(this.aBoolean434 ? 1 : 0);
		arg0.method4350(this.anInt5463);
		arg0.method4333(this.anInt5466);
		arg0.method4339(this.anInt5459);
		arg0.method4288(this.anInt5458);
	}
}
