import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
	private final int anInt8421;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "Z")
	private final boolean aBoolean693;

	@OriginalMember(owner = "client!raa", name = "v", descriptor = "I")
	private int anInt8426;

	@OriginalMember(owner = "client!raa", name = "A", descriptor = "I")
	private final int anInt8431;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
	private final int anInt8419;

	@OriginalMember(owner = "client!raa", name = "z", descriptor = "I")
	private final int anInt8430;

	@OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
	private final int anInt8424;

	@OriginalMember(owner = "client!raa", name = "B", descriptor = "Z")
	private final boolean aBoolean694;

	@OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
	private final int anInt8423;

	@OriginalMember(owner = "client!raa", name = "u", descriptor = "I")
	private final int anInt8425;

	@OriginalMember(owner = "client!raa", name = "w", descriptor = "I")
	private int anInt8427;

	@OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
	private int anInt8422;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(ZLclient!ufa;)V")
	public Class3_Sub42(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class326 arg1) {
		if (Static530.aString119.startsWith("win")) {
			this.anInt8421 = 1;
		} else if (Static530.aString119.startsWith("mac")) {
			this.anInt8421 = 2;
		} else if (Static530.aString119.startsWith("linux")) {
			this.anInt8421 = 3;
		} else {
			this.anInt8421 = 4;
		}
		if (Static530.aString118.startsWith("amd64") || Static530.aString118.startsWith("x86_64")) {
			this.aBoolean693 = true;
		} else {
			this.aBoolean693 = false;
		}
		if (this.anInt8421 == 1) {
			if (Static530.aString116.indexOf("4.0") != -1) {
				this.anInt8426 = 1;
			} else if (Static530.aString116.indexOf("4.1") != -1) {
				this.anInt8426 = 2;
			} else if (Static530.aString116.indexOf("4.9") != -1) {
				this.anInt8426 = 3;
			} else if (Static530.aString116.indexOf("5.0") != -1) {
				this.anInt8426 = 4;
			} else if (Static530.aString116.indexOf("5.1") != -1) {
				this.anInt8426 = 5;
			} else if (Static530.aString116.indexOf("6.0") != -1) {
				this.anInt8426 = 6;
			} else if (Static530.aString116.indexOf("6.1") != -1) {
				this.anInt8426 = 7;
			}
		} else if (this.anInt8421 == 2) {
			if (Static530.aString116.indexOf("10.4") != -1) {
				this.anInt8426 = 20;
			} else if (Static530.aString116.indexOf("10.5") != -1) {
				this.anInt8426 = 21;
			} else if (Static530.aString116.indexOf("10.6") != -1) {
				this.anInt8426 = 22;
			}
		}
		if (Static530.aString121.toLowerCase().indexOf("sun") != -1) {
			this.anInt8431 = 1;
		} else if (Static530.aString121.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt8431 = 2;
		} else if (Static530.aString121.toLowerCase().indexOf("apple") == -1) {
			this.anInt8431 = 4;
		} else {
			this.anInt8431 = 3;
		}
		@Pc(203) int local203 = 2;
		@Pc(205) int local205 = 0;
		@Pc(211) char local211;
		try {
			while (local203 < Static530.aString123.length()) {
				local211 = Static530.aString123.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local205 * 10 + local211 - 48;
			}
		} catch (@Pc(240) Exception local240) {
		}
		this.anInt8419 = local205;
		local203 = Static530.aString123.indexOf(46, 2) + 1;
		local205 = 0;
		try {
			while (Static530.aString123.length() > local203) {
				local211 = Static530.aString123.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local205 * 10 + local211 - 48;
				local203++;
			}
		} catch (@Pc(280) Exception local280) {
		}
		this.anInt8430 = local205;
		local203 = Static530.aString123.indexOf(95, 4) + 1;
		local205 = 0;
		try {
			while (Static530.aString123.length() > local203) {
				local211 = Static530.aString123.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local211 + local205 * 10 - 48;
				local203++;
			}
		} catch (@Pc(320) Exception local320) {
		}
		this.anInt8424 = Static188.anInt3749;
		if (arg1.aBoolean802) {
			this.aBoolean694 = false;
		} else {
			this.aBoolean694 = true;
		}
		if (this.anInt8419 > 3) {
			this.anInt8423 = Static223.anInt4521;
		} else {
			this.anInt8423 = 0;
		}
		this.anInt8425 = local205;
		try {
			this.anInt8427 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(359) Throwable local359) {
			this.anInt8427 = 0;
		}
		try {
			this.anInt8422 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(367) Throwable local367) {
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method6912(@OriginalArg(0) Class3_Sub7 arg0) {
		arg0.method6494(3);
		arg0.method6494(this.anInt8421);
		arg0.method6494(this.aBoolean693 ? 1 : 0);
		arg0.method6494(this.anInt8426);
		arg0.method6494(this.anInt8431);
		arg0.method6494(this.anInt8419);
		arg0.method6494(this.anInt8430);
		arg0.method6494(this.anInt8425);
		arg0.method6494(this.aBoolean694 ? 1 : 0);
		arg0.method6528(this.anInt8424);
		arg0.method6494(this.anInt8423);
		arg0.method6509(this.anInt8427);
		arg0.method6495(this.anInt8422);
	}
}
