import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
	private final int anInt6242;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "Z")
	private final boolean aBoolean453;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	private int anInt6234;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	private final int anInt6235;

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
	private final int anInt6240;

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
	private final int anInt6238;

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
	private final int anInt6239;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Z")
	private final boolean aBoolean452;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
	private final int anInt6233;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
	private final int anInt6241;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
	private int anInt6237;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
	private int anInt6236;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(ZLclient!pi;)V")
	public Class3_Sub37(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class258 arg1) {
		if (Static408.aString61.startsWith("win")) {
			this.anInt6242 = 1;
		} else if (Static408.aString61.startsWith("mac")) {
			this.anInt6242 = 2;
		} else if (Static408.aString61.startsWith("linux")) {
			this.anInt6242 = 3;
		} else {
			this.anInt6242 = 4;
		}
		if (Static408.aString59.startsWith("amd64") || Static408.aString59.startsWith("x86_64")) {
			this.aBoolean453 = true;
		} else {
			this.aBoolean453 = false;
		}
		if (this.anInt6242 == 1) {
			if (Static408.aString60.indexOf("4.0") != -1) {
				this.anInt6234 = 1;
			} else if (Static408.aString60.indexOf("4.1") != -1) {
				this.anInt6234 = 2;
			} else if (Static408.aString60.indexOf("4.9") != -1) {
				this.anInt6234 = 3;
			} else if (Static408.aString60.indexOf("5.0") != -1) {
				this.anInt6234 = 4;
			} else if (Static408.aString60.indexOf("5.1") != -1) {
				this.anInt6234 = 5;
			} else if (Static408.aString60.indexOf("6.0") != -1) {
				this.anInt6234 = 6;
			} else if (Static408.aString60.indexOf("6.1") != -1) {
				this.anInt6234 = 7;
			}
		} else if (this.anInt6242 == 2) {
			if (Static408.aString60.indexOf("10.4") != -1) {
				this.anInt6234 = 20;
			} else if (Static408.aString60.indexOf("10.5") != -1) {
				this.anInt6234 = 21;
			} else if (Static408.aString60.indexOf("10.6") != -1) {
				this.anInt6234 = 22;
			}
		}
		if (Static408.aString55.toLowerCase().indexOf("sun") != -1) {
			this.anInt6235 = 1;
		} else if (Static408.aString55.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt6235 = 2;
		} else if (Static408.aString55.toLowerCase().indexOf("apple") == -1) {
			this.anInt6235 = 4;
		} else {
			this.anInt6235 = 3;
		}
		@Pc(202) int local202 = 2;
		@Pc(204) int local204 = 0;
		@Pc(210) char local210;
		try {
			while (Static408.aString56.length() > local202) {
				local210 = Static408.aString56.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local204 = local210 + local204 * 10 - '0';
				local202++;
			}
		} catch (@Pc(239) Exception local239) {
		}
		this.anInt6240 = local204;
		local202 = Static408.aString56.indexOf(46, 2) + 1;
		local204 = 0;
		try {
			while (Static408.aString56.length() > local202) {
				local210 = Static408.aString56.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local204 = local204 * 10 + local210 - 48;
				local202++;
			}
		} catch (@Pc(284) Exception local284) {
		}
		this.anInt6238 = local204;
		local202 = Static408.aString56.indexOf(95, 4) + 1;
		local204 = 0;
		try {
			while (local202 < Static408.aString56.length()) {
				local210 = Static408.aString56.charAt(local202);
				if (local210 < '0' || local210 > '9') {
					break;
				}
				local202++;
				local204 = local210 + local204 * 10 - 48;
			}
		} catch (@Pc(331) Exception local331) {
		}
		this.anInt6239 = Static350.anInt6083;
		if (arg1.aBoolean524) {
			this.aBoolean452 = false;
		} else {
			this.aBoolean452 = true;
		}
		if (this.anInt6240 <= 3) {
			this.anInt6233 = 0;
		} else {
			this.anInt6233 = Static488.anInt7961;
		}
		this.anInt6241 = local204;
		try {
			this.anInt6237 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(372) Throwable local372) {
			this.anInt6237 = 0;
		}
		try {
			this.anInt6236 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(380) Throwable local380) {
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!np;B)V")
	public void method5283(@OriginalArg(0) Class3_Sub11 arg0) {
		arg0.method5213(3);
		arg0.method5213(this.anInt6242);
		arg0.method5213(this.aBoolean453 ? 1 : 0);
		arg0.method5213(this.anInt6234);
		arg0.method5213(this.anInt6235);
		arg0.method5213(this.anInt6240);
		arg0.method5213(this.anInt6238);
		arg0.method5213(this.anInt6241);
		arg0.method5213(this.aBoolean452 ? 1 : 0);
		arg0.method5200(this.anInt6239);
		arg0.method5213(this.anInt6233);
		arg0.method5179(this.anInt6237);
		arg0.method5215(this.anInt6236);
	}
}
