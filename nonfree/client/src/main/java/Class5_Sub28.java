import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class5_Sub28 extends Class5 {

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
	private int anInt4820;

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
	private int anInt4822;

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
	private int anInt4823;

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "Ljava/lang/String;")
	private String aString52;

	@OriginalMember(owner = "client!jt", name = "q", descriptor = "I")
	private int anInt4824;

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
	private int anInt4825;

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "Ljava/lang/String;")
	private String aString53;

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
	private int anInt4826;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
	private int anInt4827;

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!jt", name = "x", descriptor = "Z")
	private boolean aBoolean356;

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
	private int anInt4828;

	@OriginalMember(owner = "client!jt", name = "A", descriptor = "I")
	private int anInt4830;

	@OriginalMember(owner = "client!jt", name = "C", descriptor = "I")
	private int anInt4832;

	@OriginalMember(owner = "client!jt", name = "E", descriptor = "I")
	private int anInt4834;

	@OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
	private int anInt4836;

	@OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
	private int anInt4838;

	@OriginalMember(owner = "client!jt", name = "J", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
	private int anInt4839;

	@OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
	public int anInt4840;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	private Class5_Sub28() {
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(ZLclient!fc;)V")
	public Class5_Sub28(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class100 arg1) {
		if (Static144.aString33.startsWith("win")) {
			this.anInt4825 = 1;
		} else if (Static144.aString33.startsWith("mac")) {
			this.anInt4825 = 2;
		} else if (Static144.aString33.startsWith("linux")) {
			this.anInt4825 = 3;
		} else {
			this.anInt4825 = 4;
		}
		if (Static144.aString29.startsWith("amd64") || Static144.aString29.startsWith("x86_64")) {
			this.aBoolean357 = true;
		} else {
			this.aBoolean357 = false;
		}
		if (this.anInt4825 == 1) {
			if (Static144.aString30.indexOf("4.0") != -1) {
				this.anInt4832 = 1;
			} else if (Static144.aString30.indexOf("4.1") != -1) {
				this.anInt4832 = 2;
			} else if (Static144.aString30.indexOf("4.9") != -1) {
				this.anInt4832 = 3;
			} else if (Static144.aString30.indexOf("5.0") != -1) {
				this.anInt4832 = 4;
			} else if (Static144.aString30.indexOf("5.1") != -1) {
				this.anInt4832 = 5;
			} else if (Static144.aString30.indexOf("6.0") != -1) {
				this.anInt4832 = 6;
			} else if (Static144.aString30.indexOf("6.1") != -1) {
				this.anInt4832 = 7;
			}
		} else if (this.anInt4825 == 2) {
			if (Static144.aString30.indexOf("10.4") != -1) {
				this.anInt4832 = 20;
			} else if (Static144.aString30.indexOf("10.5") != -1) {
				this.anInt4832 = 21;
			} else if (Static144.aString30.indexOf("10.6") != -1) {
				this.anInt4832 = 22;
			}
		}
		if (Static144.aString32.toLowerCase().indexOf("sun") != -1) {
			this.anInt4823 = 1;
		} else if (Static144.aString32.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt4823 = 2;
		} else if (Static144.aString32.toLowerCase().indexOf("apple") == -1) {
			this.anInt4823 = 4;
		} else {
			this.anInt4823 = 3;
		}
		@Pc(205) int local205 = 2;
		@Pc(207) int local207 = 0;
		@Pc(213) char local213;
		try {
			while (local205 < Static144.aString34.length()) {
				local213 = Static144.aString34.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local205++;
				local207 = local213 + local207 * 10 - 48;
			}
		} catch (@Pc(242) Exception local242) {
		}
		this.anInt4836 = local207;
		local207 = 0;
		local205 = Static144.aString34.indexOf(46, 2) + 1;
		try {
			while (Static144.aString34.length() > local205) {
				local213 = Static144.aString34.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local207 = local213 + local207 * 10 - 48;
				local205++;
			}
		} catch (@Pc(290) Exception local290) {
		}
		this.anInt4839 = local207;
		local207 = 0;
		local205 = Static144.aString34.indexOf(95, 4) + 1;
		try {
			while (Static144.aString34.length() > local205) {
				local213 = Static144.aString34.charAt(local205);
				if (local213 < '0' || local213 > '9') {
					break;
				}
				local205++;
				local207 = local207 * 10 + local213 - 48;
			}
		} catch (@Pc(337) Exception local337) {
		}
		if (this.anInt4836 <= 3) {
			this.anInt4830 = 0;
		} else {
			this.anInt4830 = Static306.anInt5334;
		}
		if (arg1.aBoolean194) {
			this.aBoolean356 = false;
		} else {
			this.aBoolean356 = true;
		}
		this.anInt4826 = local207;
		this.anInt4834 = Static110.anInt2065;
		try {
			@Pc(368) int[] local368 = HardwareInfo.getCPUInfo();
			if (local368 != null && local368.length == 7) {
				this.anInt4824 = local368[5];
				this.anInt4820 = local368[2];
				this.anInt4840 = local368[6];
				this.anInt4827 = local368[4];
				this.anInt4828 = local368[3];
			}
		} catch (@Pc(401) Throwable local401) {
			Static524.method7740(local401, local401.getMessage() + " (Recovered)");
			this.anInt4840 = 0;
		}
		if (this.aString55 == null) {
			this.aString55 = "";
		}
		if (this.aString53 == null) {
			this.aString53 = "";
		}
		if (this.aString52 == null) {
			this.aString52 = "";
		}
		if (this.aString54 == null) {
			this.aString54 = "";
		}
		this.method4322();
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!ofa;I)V")
	public void method4320(@OriginalArg(0) Class5_Sub22 arg0) {
		arg0.method5905(5);
		arg0.method5905(this.anInt4825);
		arg0.method5905(this.aBoolean357 ? 1 : 0);
		arg0.method5905(this.anInt4832);
		arg0.method5905(this.anInt4823);
		arg0.method5905(this.anInt4836);
		arg0.method5905(this.anInt4839);
		arg0.method5905(this.anInt4826);
		arg0.method5905(this.aBoolean356 ? 1 : 0);
		arg0.method5918(this.anInt4834);
		arg0.method5905(this.anInt4830);
		arg0.method5929(this.anInt4840);
		arg0.method5918(this.anInt4820);
		arg0.method5905(this.anInt4828);
		arg0.method5905(this.anInt4827);
		arg0.method5905(this.anInt4824);
		arg0.method5933(this.aString54);
		arg0.method5933(this.aString52);
		arg0.method5933(this.aString53);
		arg0.method5933(this.aString55);
		arg0.method5905(this.anInt4822);
		arg0.method5918(this.anInt4838);
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)I")
	public int method4321() {
		@Pc(12) int local12 = Static429.method6567(this.aString54) + 23;
		@Pc(19) int local19 = local12 + Static429.method6567(this.aString52);
		@Pc(26) int local26 = local19 + Static429.method6567(this.aString53);
		return local26 + Static429.method6567(this.aString55);
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(Z)V")
	private void method4322() {
		if (this.aString54.length() > 40) {
			this.aString54 = this.aString54.substring(0, 40);
		}
		if (this.aString52.length() > 40) {
			this.aString52 = this.aString52.substring(0, 40);
		}
		if (this.aString53.length() > 10) {
			this.aString53 = this.aString53.substring(0, 10);
		}
		if (this.aString55.length() > 10) {
			this.aString55 = this.aString55.substring(0, 10);
		}
	}
}
