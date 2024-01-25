import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
	private int anInt6510;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	private int anInt6511;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
	private int anInt6513;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Ljava/lang/String;")
	private String aString88;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
	private int anInt6516;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
	private int anInt6517;

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "Ljava/lang/String;")
	private String aString89;

	@OriginalMember(owner = "client!mh", name = "s", descriptor = "Ljava/lang/String;")
	private String aString90;

	@OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
	private int anInt6519;

	@OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
	private int anInt6520;

	@OriginalMember(owner = "client!mh", name = "x", descriptor = "Z")
	private boolean aBoolean500;

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
	private int anInt6522;

	@OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
	private int anInt6523;

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
	private int anInt6524;

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "Ljava/lang/String;")
	private String aString91;

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
	private int anInt6526;

	@OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
	private int anInt6527;

	@OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
	private int anInt6528;

	@OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
	private int anInt6529;

	@OriginalMember(owner = "client!mh", name = "J", descriptor = "Z")
	private boolean aBoolean501;

	@OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
	public int anInt6531;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	private Class3_Sub34() {
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(ZLclient!lu;)V")
	public Class3_Sub34(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class231 arg1) {
		if (Static353.aString80.startsWith("win")) {
			this.anInt6510 = 1;
		} else if (Static353.aString80.startsWith("mac")) {
			this.anInt6510 = 2;
		} else if (Static353.aString80.startsWith("linux")) {
			this.anInt6510 = 3;
		} else {
			this.anInt6510 = 4;
		}
		if (Static353.aString86.startsWith("amd64") || Static353.aString86.startsWith("x86_64")) {
			this.aBoolean501 = true;
		} else {
			this.aBoolean501 = false;
		}
		if (this.anInt6510 == 1) {
			if (Static353.aString82.indexOf("4.0") != -1) {
				this.anInt6520 = 1;
			} else if (Static353.aString82.indexOf("4.1") != -1) {
				this.anInt6520 = 2;
			} else if (Static353.aString82.indexOf("4.9") != -1) {
				this.anInt6520 = 3;
			} else if (Static353.aString82.indexOf("5.0") != -1) {
				this.anInt6520 = 4;
			} else if (Static353.aString82.indexOf("5.1") != -1) {
				this.anInt6520 = 5;
			} else if (Static353.aString82.indexOf("6.0") != -1) {
				this.anInt6520 = 6;
			} else if (Static353.aString82.indexOf("6.1") != -1) {
				this.anInt6520 = 7;
			}
		} else if (this.anInt6510 == 2) {
			if (Static353.aString82.indexOf("10.4") != -1) {
				this.anInt6520 = 20;
			} else if (Static353.aString82.indexOf("10.5") != -1) {
				this.anInt6520 = 21;
			} else if (Static353.aString82.indexOf("10.6") != -1) {
				this.anInt6520 = 22;
			}
		}
		if (Static353.aString79.toLowerCase().indexOf("sun") != -1) {
			this.anInt6528 = 1;
		} else if (Static353.aString79.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt6528 = 2;
		} else if (Static353.aString79.toLowerCase().indexOf("apple") == -1) {
			this.anInt6528 = 4;
		} else {
			this.anInt6528 = 3;
		}
		@Pc(204) int local204 = 2;
		@Pc(206) int local206 = 0;
		@Pc(212) char local212;
		try {
			while (local204 < Static353.aString84.length()) {
				local212 = Static353.aString84.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local206 = local212 + local206 * 10 - 48;
				local204++;
			}
		} catch (@Pc(236) Exception local236) {
		}
		this.anInt6522 = local206;
		local206 = 0;
		local204 = Static353.aString84.indexOf(46, 2) + 1;
		try {
			while (local204 < Static353.aString84.length()) {
				local212 = Static353.aString84.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local206 = local206 * 10 + local212 - 48;
				local204++;
			}
		} catch (@Pc(280) Exception local280) {
		}
		this.anInt6516 = local206;
		local204 = Static353.aString84.indexOf(95, 4) + 1;
		local206 = 0;
		try {
			while (local204 < Static353.aString84.length()) {
				local212 = Static353.aString84.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local204++;
				local206 = local206 * 10 + local212 - 48;
			}
		} catch (@Pc(323) Exception local323) {
		}
		this.anInt6523 = Static595.anInt9375;
		if (arg1.aBoolean482) {
			this.aBoolean500 = false;
		} else {
			this.aBoolean500 = true;
		}
		this.anInt6529 = local206;
		if (this.anInt6522 > 3) {
			this.anInt6511 = Static636.anInt9818;
		} else {
			this.anInt6511 = 0;
		}
		try {
			@Pc(354) int[] local354 = HardwareInfo.getCPUInfo();
			if (local354 != null && local354.length == 7) {
				this.anInt6517 = local354[2];
				this.anInt6519 = local354[3];
				this.anInt6527 = local354[4];
				this.anInt6524 = local354[5];
				this.anInt6531 = local354[6];
			}
		} catch (@Pc(389) Throwable local389) {
			this.anInt6531 = 0;
		}
		if (this.aString91 == null) {
			this.aString91 = "";
		}
		if (this.aString90 == null) {
			this.aString90 = "";
		}
		if (this.aString89 == null) {
			this.aString89 = "";
		}
		if (this.aString88 == null) {
			this.aString88 = "";
		}
		this.method5455();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	private void method5455() {
		if (this.aString88.length() > 40) {
			this.aString88 = this.aString88.substring(0, 40);
		}
		if (this.aString91.length() > 40) {
			this.aString91 = this.aString91.substring(0, 40);
		}
		if (this.aString90.length() > 10) {
			this.aString90 = this.aString90.substring(0, 10);
		}
		if (this.aString89.length() > 10) {
			this.aString89 = this.aString89.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLclient!fca;)V")
	public void method5456(@OriginalArg(1) Class3_Sub17 arg0) {
		arg0.method4849(5);
		arg0.method4849(this.anInt6510);
		arg0.method4849(this.aBoolean501 ? 1 : 0);
		arg0.method4849(this.anInt6520);
		arg0.method4849(this.anInt6528);
		arg0.method4849(this.anInt6522);
		arg0.method4849(this.anInt6516);
		arg0.method4849(this.anInt6529);
		arg0.method4849(this.aBoolean500 ? 1 : 0);
		arg0.method4876(this.anInt6523);
		arg0.method4849(this.anInt6511);
		arg0.method4848(this.anInt6531);
		arg0.method4876(this.anInt6517);
		arg0.method4849(this.anInt6519);
		arg0.method4849(this.anInt6527);
		arg0.method4849(this.anInt6524);
		arg0.method4883(this.aString88);
		arg0.method4883(this.aString91);
		arg0.method4883(this.aString90);
		arg0.method4883(this.aString89);
		arg0.method4849(this.anInt6513);
		arg0.method4876(this.anInt6526);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)I")
	public int method5458() {
		@Pc(18) int local18 = Static132.method2273(this.aString88) + 23;
		@Pc(25) int local25 = local18 + Static132.method2273(this.aString91);
		@Pc(32) int local32 = local25 + Static132.method2273(this.aString90);
		return local32 + Static132.method2273(this.aString89);
	}
}
